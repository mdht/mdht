/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.dita;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.common.util.UML2Util;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ObservationMedia;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegionOfInterest;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.term.core.profile.CodeSystemConstraint;
import org.openhealthtools.mdht.uml.term.core.util.TermProfileUtil;

public class TableGenerator {

	private Map<String, EPackage> packageURIMap = new HashMap<String, EPackage>();

	public TableGenerator() {
		CDAUtil.loadPackages();
	}

	private EPackage getEPackageForURI(String ePackageURI) {
		EPackage ePackage = packageURIMap.get(ePackageURI);
		if (!packageURIMap.containsKey(ePackageURI)) {
			ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackageURI);
			packageURIMap.put(ePackageURI, ePackage);

			if (ePackage == null) {
				System.err.println("Cannot load EPackage for: " + ePackageURI);
			}
		}

		return ePackage;
	}

	public EClass getEClass(Type umlType) {
		String ePackageURI = CDAModelUtil.getEcorePackageURI(umlType);
		if (ePackageURI != null) {
			EPackage ePackage = getEPackageForURI(ePackageURI);
			if (ePackage != null) {
				EClassifier eClassifier = ePackage.getEClassifier(UML2Util.getValidJavaIdentifier(umlType.getName()));
				if (eClassifier instanceof EClass) {
					return (EClass) eClassifier;
				}
			}
		}

		return null;
	}

	String[] severities = new String[] { "SHALL", "SHOULD", "MAY" };

	private String getSeverity(SeverityKind sk) {

		if (sk.getValue() < 3) {
			return severities[sk.getValue()];
		} else {
			return sk.getLiteral();
		}

	}

	private Validation getValidation(Class umlClass, String property) {

		Property umlProperty = umlClass.getAttribute(property, null);
		if (umlProperty != null) {

			for (Stereotype stereotype : umlProperty.getAppliedStereotypes()) {

				EObject appliedStereotype = umlProperty.getStereotypeApplication(stereotype);
				if (appliedStereotype instanceof org.openhealthtools.mdht.uml.cda.core.profile.Validation) {
					return (Validation) appliedStereotype;
				}
			}

			if (umlProperty.getAssociation() != null) {
				for (Stereotype stereotype : umlProperty.getAssociation().getAppliedStereotypes()) {

					EObject appliedStereotype = umlProperty.getAssociation().getStereotypeApplication(stereotype);
					if (appliedStereotype instanceof org.openhealthtools.mdht.uml.cda.core.profile.Validation) {
						return (Validation) appliedStereotype;
					}
				}
			}

			for (Generalization generalization : umlClass.getGeneralizations()) {
				if (generalization.getGeneral() instanceof Class) {
					Validation validation = getValidation((Class) generalization.getGeneral(), property);
					if (validation != null) {
						return validation;
					}
				}

			}
		}
		return null;
	}

	private String getCodeSystem(Class umlClass, String property) {
		StringBuffer codeSystemBuffer = new StringBuffer();

		getCodeSystem(umlClass, property, codeSystemBuffer);

		return codeSystemBuffer.toString();
	}

	private void getCodeSystem(Class umlClass, String property, StringBuffer codeSystemBuffer) {

		Property umlProperty = umlClass.getAttribute(property, null);
		if (umlProperty != null) {
			CodeSystemConstraint csc = TermProfileUtil.getCodeSystemConstraint(umlProperty);
			if (csc != null) {
				// csc.getReference().getIdentifier();
				if (csc.getReference() != null) {
					codeSystemBuffer.append(String.format(
						"%s %s", csc.getReference().getEnumerationName(), csc.getReference().getIdentifier()));
				} else {
					codeSystemBuffer.append(String.format("%s %s", csc.getName(), csc.getIdentifier()));
				}
			}
		}

		for (Generalization generalization : umlClass.getGeneralizations()) {
			if (generalization.getGeneral() instanceof Class) {
				getCodeSystem((Class) generalization.getGeneral(), property, codeSystemBuffer);
			}

		}
		return;
	}

	public static String getPath(EObject eObject) {
		String path = "";
		while (eObject != null && !(eObject instanceof ClinicalDocument)) {

			EStructuralFeature feature = eObject.eContainingFeature();

			String query = "";
			if (feature != null && feature.getEType() instanceof EClass) {

				EClass foo = (EClass) feature.getEType();
				for (EAttribute eAttribute : foo.getEAllAttributes()) {
					if (eAttribute.getDefaultValueLiteral() != null) {

					}
				}

				for (EReference eReference : foo.getEAllContainments()) {
					if (eReference.getDefaultValueLiteral() != null) {

					} else if (eReference.getName().equals("templateId")) {
						String templateID = getFeatureValue(eObject, eReference);
						if (templateID != null && templateID.length() > 0) {
							query = query + "cda:templateId/@root = " + templateID;
						}
					}

				}

				if (query.length() > 0) {
					query = "[" + query + "]";
				}
			}

			path = "/" + "cda:" + feature.getName() + (query.length() > 0
					? query
					: "") + path;

			eObject = eObject.eContainer();
		}
		return "/cda:ClinicalDocument" + path;
	}

	private static class DatatypesValue extends org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesSwitch<Object> {

		public String result;

		@Override
		public Object caseII(II object) {
			result = object.getRoot();
			return object;
		}

		@Override
		public Object defaultCase(EObject object) {
			result = "MISSINGTYPE";
			return object;
		}

		@Override
		public Object caseCD(CD object) {
			result = object.getCode();
			return object;
		}

	}

	private static String getFeatureValue(EObject eObject, EStructuralFeature feature) {
		String result = "";

		if (feature != null) {

			Object value = null;
			if (feature.getDefaultValue() != null) {
				value = feature.getDefaultValue();
			} else {

				if (feature.isMany()) {
					@SuppressWarnings("unchecked")
					List<Object> list = (List<Object>) eObject.eGet(feature);
					if (list.size() > 0) {
						value = list.get(list.size() - 1);
					}
				} else {
					value = eObject.eGet(feature);
				}
			}

			if (value != null) {
				if (value instanceof EObject) {
					DatatypesValue datatypesValue = new DatatypesValue();
					datatypesValue.doSwitch((EObject) value);
					result = datatypesValue.result;
				} else {
					result = value.toString();
				}
			}
		}
		return result;

	}

	public String getDataTypeName(String dataTypeName) {
		if ("EBooleanObject".equals(dataTypeName)) {
			return "Boolean";
		} else if ("EString".equals(dataTypeName)) {
			return "String";
		} else {
			return dataTypeName;
		}
	}

	public String createTable(Class umlClass) {

		org.eclipse.uml2.uml.Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (cdaClass == null || umlClass.isAbstract()) {

			return "";
		}

		StringBuffer tableBuffer = new StringBuffer();

		final EClass eClass = getEClass(umlClass);

		String startingXPath = "";

		EObject eObject = null;

		if (eClass == null) {

			System.out.println("no eclass " + umlClass.getQualifiedName());
			return null;
		}

		ClinicalDocument doc = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE.createClinicalDocument();

		eObject = eClass.getEPackage().getEFactoryInstance().create(eClass);

		Method initMethod;
		try {
			initMethod = eObject.getClass().getDeclaredMethod("init", new java.lang.Class[0]);
			if (initMethod != null) {
				initMethod.invoke(eObject, new Object[0]);
			}
		} catch (SecurityException e) {
		} catch (NoSuchMethodException e) {
		} catch (IllegalArgumentException e) {
		} catch (IllegalAccessException e) {
		} catch (InvocationTargetException e) {
		}

		if (CDAModelUtil.isSection(umlClass) && CDAModelUtil.getCDAClass(umlClass) != null) {
			doc.addSection((Section) eObject);
			startingXPath = getPath(eObject);
		} else {

			if (umlClass != null && cdaClass != null && CDAModelUtil.getCDAClass(umlClass).getName() != null) {
				startingXPath = "cda::" + CDAModelUtil.getCDAClass(umlClass).getName().toLowerCase();
			} else {
				startingXPath = "cda::nullumlclassname";
			}

			EStructuralFeature templateId = eObject.eClass().getEStructuralFeature("templateId");
			if (templateId != null) {
				startingXPath = startingXPath + "[cda:templateId/@root = " + getFeatureValue(eObject, templateId) + "]";

			}
		}

		/*
		 * XPath
		 * 
		 * Card.
		 * 
		 * Verb
		 * 
		 * Data Type
		 * 
		 * CONF#
		 * 
		 * Fixed Value
		 */

		tableBuffer.append("<section id=\"tableconformance\"><p><table frame=\"all\" scale=\"80\" pgwide=\"1\" ><tgroup cols=\"6\" align=\"left\" colsep = \"1\" rowsep = \"1\" > ");

		tableBuffer.append("<colspec colname=\"col0\" colnum=\"0\" colwidth=\"3*\"  />");
		tableBuffer.append("<colspec colname=\"col1\" colnum=\"1\" colwidth=\"1*\"  />");
		tableBuffer.append("<colspec colname=\"col2\" colnum=\"2\" colwidth=\"1*\"  />");
		tableBuffer.append("<colspec colname=\"col3\" colnum=\"3\" colwidth=\"2*\"  />");
		tableBuffer.append("<colspec colname=\"col4\" colnum=\"4\" colwidth=\"2*\"  />");
		tableBuffer.append("<colspec colname=\"col5\" colnum=\"5\" colwidth=\"3*\"  />");
		// tableBuffer.append("<colspec colname=\"col6\" colnum=\"6\" />");
		// tableBuffer.append("<colspec colname=\"col7\" colnum=\"7\" />");

		tableBuffer.append("<thead> <row><entry namest=\"col0\" nameend=\"col5\" >" +
				umlClass.getQualifiedName() +
				"</entry>  </row>  <row><entry namest=\"col0\" nameend=\"col5\" >" +
				startingXPath +
				"/" +
				"</entry>  </row> <row><entry>XPath</entry><entry>Card.</entry><entry>Verb</entry><entry>Data Type</entry><entry>CONF#</entry><entry>Fixed Value</entry></row></thead><tbody>");

		Hashtable<String, Element> elements = new Hashtable<String, Element>();

		getTableRows(umlClass, elements);

		List<Element> elementlist = new ArrayList<Element>(elements.values());

		Comparator<Element> elementSorter = new Comparator<Element>() {

			public int compare(Element o1, Element o2) {

				if (!(o1 instanceof Property)) {
					return -1;
				}

				if (!(o2 instanceof Property)) {
					return +1;
				}

				if (eClass == null) {
					return 0;
				}

				Property leftProperty = (Property) o1;

				EStructuralFeature leftFeature = eClass.getEStructuralFeature(leftProperty.getName());

				Property rightProperty = (Property) o2;

				EStructuralFeature rightFeature = eClass.getEStructuralFeature(rightProperty.getName());

				// if both features or not features, sort by name business name
				if ((leftFeature instanceof EAttribute && rightFeature instanceof EAttribute)) {
					return NamedElementUtil.getBusinessName(leftProperty).compareToIgnoreCase(
						NamedElementUtil.getBusinessName(rightProperty));
				}

				// if both not features
				if (!(leftFeature instanceof EAttribute) && !(rightFeature instanceof EAttribute)) {

					// if both data types or not data types, sort by business name
					if ((CDAModelUtil.isDatatypeModel(leftProperty.getType()) && CDAModelUtil.isDatatypeModel(rightProperty.getType())) ||
							(!CDAModelUtil.isDatatypeModel(leftProperty.getType()) && !CDAModelUtil.isDatatypeModel(rightProperty.getType()))) {
						return NamedElementUtil.getBusinessName(leftProperty).compareToIgnoreCase(
							NamedElementUtil.getBusinessName(rightProperty));
					}

					if (CDAModelUtil.isDatatypeModel(leftProperty.getType())) {
						return -1;
					} else {
						return +1;
					}

				}

				if (leftFeature instanceof EAttribute) {
					return -1;
				} else {
					return +1;
				}

			}

		};

		Collections.sort(elementlist, elementSorter);

		for (Element element : elementlist) {

			if (element instanceof NamedElement) {
				addRow(tableBuffer, element, eClass, eObject);
			}
		}

		tableBuffer.append("</tbody></tgroup></table></p></section>");

		return tableBuffer.toString();
	}

	private String getRelativeXPath(Section section, InfrastructureRoot ir) {

		return "";

	}

	private static void initEObject(EObject eObject) {
		try {
			Method initMethod = eObject.getClass().getDeclaredMethod("init", new java.lang.Class[0]);
			if (initMethod != null) {
				initMethod.invoke(eObject, new Object[0]);
			}
		} catch (Exception e) {

		}
	}

	private void addRow(StringBuffer tableBuffer, Element element, EClass eClass, EObject eObject) {

		if (element instanceof Property && element.getOwner() instanceof Class) {

			Property property = (Property) element;

			EStructuralFeature feature = eClass.getEStructuralFeature(property.getName());

			boolean isAttribute = feature instanceof EAttribute;

			NamedElementUtil.getBusinessName(property);

			// if (businessName.compareTo(property.getName()) == 0) {
			// tableBuffer.append(String.format("<row><entry>%s</entry>", property.getName()));
			// } else {
			// tableBuffer.append(String.format("<row><entry>%s ( %s )</entry>", businessName, property.getName()));
			//
			// }

			String relativePath = null;
			if (eObject != null && eObject instanceof Section && CDAModelUtil.isClinicalStatement(property.getType())) {

				Section section = (Section) eObject;

				String startingPath = getPath(eObject);

				EClass ePropertyClass = getEClass(property.getType());

				Class cdaClass = CDAModelUtil.getCDAClass((Class) property.getType());

				if (cdaClass != null && ePropertyClass != null && !ePropertyClass.isAbstract()) {

					EObject eClinicalStatementInstance = ePropertyClass.getEPackage().getEFactoryInstance().create(
						ePropertyClass);
					initEObject(eClinicalStatementInstance);

					if ("Act".equals(cdaClass.getName())) {
						section.addAct((Act) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("Encounter".equals(cdaClass.getName())) {
						section.addEncounter((Encounter) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("Observation".equals(cdaClass.getName())) {
						section.addObservation((Observation) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("ObservationMedia".equals(cdaClass.getName())) {
						section.addObservationMedia((ObservationMedia) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("Organizer".equals(cdaClass.getName())) {
						section.addOrganizer((Organizer) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					/*
					 * This fails for HITSP Procedure, need to investigate.
					 * Probably due to use of multiple inheritance. But modified
					 * use of isSuperTypeOf() seems to work.
					 */
					// if ("Procedure".equals(cdaClass.getName())) {
					if (CDAPackage.eINSTANCE.getProcedure().isSuperTypeOf(ePropertyClass)) {
						section.addProcedure((Procedure) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("RegionOfInterest".equals(cdaClass.getName())) {
						section.addRegionOfInterest((RegionOfInterest) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("Section".equals(cdaClass.getName())) {
						section.addSection((Section) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("SubstanceAdministration".equals(cdaClass.getName())) {
						section.addSubstanceAdministration((SubstanceAdministration) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if ("Supply".equals(cdaClass.getName())) {
						section.addSupply((Supply) eClinicalStatementInstance);
						relativePath = getPath(eClinicalStatementInstance);
					}

					if (relativePath != null && startingPath != null &&
							relativePath.length() > (startingPath.length() + 2)) {
						relativePath = relativePath.substring(startingPath.length() + 1);
					}

				}

			}

			// Xpath

			if (relativePath != null) {
				tableBuffer.append(String.format("<row><entry>%s</entry>", relativePath));
			} else {
				tableBuffer.append(String.format("<row><entry>%s</entry>", (isAttribute
						? "@"
						: "") + property.getName()));
			}

			// Cardinality
			tableBuffer.append(String.format("<entry>%s..%s</entry>", property.getLower(), (property.getUpper() >= 0
					? property.getUpper()
					: "*")));

			Validation validation = getValidation((Class) element.getOwner(), property.getName());

			// Verb
			tableBuffer.append(String.format("<entry>%s</entry>", (validation != null
					? getSeverity(validation.getSeverity())
					: "")));

			// if (isAttribute) {
			// tableBuffer.append(String.format("<entry>%s</entry>", "NO"));
			// } else {
			// tableBuffer.append(String.format("<entry>%s</entry>", (validation != null
			// ? (validation.isMandatory()
			// ? "NO"
			// : "YES")
			// : "YES")));
			//
			// }

			// Data Type

			String datatype = "";

			if (property.getType() != null) {
				if (property.getType() instanceof Class) {
					Class cdaDatatype = CDAModelUtil.getCDADatatype((Classifier) property.getType());
					if (cdaDatatype != null) {
						datatype = cdaDatatype.getName();
					} else {
						datatype = property.getType().getName();
					}
				} else {
					datatype = property.getType().getName();
				}

			}

			tableBuffer.append(String.format("<entry>%s</entry>", datatype));

			StringBuffer conformanceRules = new StringBuffer();

			if (validation != null) {
				for (String ruleId : validation.getRuleId()) {
					conformanceRules.append(ruleId);
				}
			}

			// CONF#
			tableBuffer.append(String.format("<entry>%s</entry>", conformanceRules.toString()));

			tableBuffer.append(String.format(
				"<entry>%s %s</entry></row> \n", getCodeSystem((Class) element.getOwner(), property.getName()),
				getFeatureValue(eObject, feature)));

		}

	}

	void getTableRows(Class umlClass, Hashtable<String, Element> elements) {
		for (Property property : umlClass.getOwnedAttributes()) {
			if (CDAProfileUtil.getValidation(property) != null && !elements.containsKey(property.getName())) {
				elements.put(property.getName(), property);
			}
		}

		for (Association association : umlClass.getAssociations()) {
			for (Property property : association.getMemberEnds()) {
				if (property.getName() != null && !elements.containsKey(property.getName())) {
					elements.put(property.getName(), property);
				}
			}
		}
		return;

	}

	private static class AssociationSwitch extends UMLSwitch<String> {

		int getRowCount() {
			if (containsSet.size() > containedBySet.size()) {
				return containsSet.size();
			} else {
				return containedBySet.size();
			}

		}

		/**
		 * @return the containedBy
		 */
		public ArrayList<Type> getContainedBy() {
			return containedBy;
		}

		/**
		 * @return the contains
		 */
		public ArrayList<Type> getContains() {
			return contains;
		}

		Class umlClass;

		/**
		 * @param umlClass
		 */
		public AssociationSwitch(Class umlClass) {
			super();
			this.umlClass = umlClass;
		}

		public void sort() {
			Comparator<? super Type> compare = new Comparator<Type>() {

				public int compare(Type o1, Type o2) {
					return o1.getName().compareTo(o2.getName());
				}
			};
			Collections.sort(containedBy, compare);
			Collections.sort(contains, compare);
		}

		ArrayList<Type> containedBy = new ArrayList<Type>();

		Set<Type> containedBySet = new HashSet<Type>();

		ArrayList<Type> contains = new ArrayList<Type>();

		Set<Type> containsSet = new HashSet<Type>();

		private void addContains(Type type) {

			if (containsSet.add(type)) {
				contains.add(type);
			}

		}

		private void addContainedBy(Type type) {
			if (containedBySet.add(type)) {
				containedBy.add(type);
			}
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see org.eclipse.uml2.uml.util.UMLSwitch#caseAssociation(org.eclipse.uml2.uml.Association)
		 */
		@Override
		public String caseAssociation(Association association) {
			// && umlClass.getQualifiedName().equals(p.getType().getQualifiedName())
			Type from = null;
			Type to = null;
			for (NamedElement ne : association.getMembers()) {
				if (ne instanceof Property) {
					Property p = (Property) ne;
					if (p.getType() != null) {
						if (p.getName() == null) {
							from = p.getType();
						} else {
							to = p.getType();
						}
					}
				} else {

				}
			}

			if (from != null && from.getQualifiedName().equals(umlClass.getQualifiedName())) {
				if (to instanceof Class && CDAModelUtil.getTemplateId((Class) to) != null) {
					addContains(to);
				}
			}

			if (to != null && to.getQualifiedName().equals(umlClass.getQualifiedName())) {
				if (from instanceof Class && CDAModelUtil.getTemplateId((Class) from) != null) {
					addContainedBy(from);
				}
			}

			if (to instanceof Class && CDAModelUtil.isInlineClass((Class) to)) {
				// If we have a reference to inline class
				// check for uses of templated classes
				walkInlineClass((Class) to);
			}

			return super.caseAssociation(association);

		}

		void walkInlineClass(Class inlineClass) {
			for (Property p : inlineClass.getOwnedAttributes()) {
				if (p.getType() instanceof Class && CDAModelUtil.getTemplateId((Class) p.getType()) != null) {
					contains.add(p.getType());
				}
				if (p.getType() instanceof Class && CDAModelUtil.isInlineClass((Class) p.getType())) {
					walkInlineClass((Class) p.getType());
				}
			}
		}
	};

	String getAnXref(Package aPackage, Class aClass) {

		String xref = CDAModelUtil.computeXref(aPackage, aClass);
		String format = xref != null && xref.endsWith(".html")
				? "format=\"html\" "
				: "";

		return "<xref " + format + "href=\"" + xref + "\">" + TransformAbstract.getPublicationName(aClass) + "</xref>";

	}

	public String createTable2(Class umlClass) {

		org.eclipse.uml2.uml.Class cdaClass = CDAModelUtil.getCDAClass(umlClass);
		if (cdaClass == null || umlClass.isAbstract()) {
			return "";
		}

		StringBuffer tableBuffer = new StringBuffer();

		tableBuffer.append("<section id=\"contextTable\"><p><table frame=\"all\" scale=\"80\" pgwide=\"1\" ><tgroup cols=\"2\" align=\"left\" colsep = \"1\" rowsep = \"1\" > ");

		tableBuffer.append("<colspec colname=\"col0\" colnum=\"0\" />");
		tableBuffer.append("<colspec colname=\"col1\" colnum=\"1\" />");

		tableBuffer.append("<thead><row><entry namest=\"col0\" nameend=\"col0\" >Contained By</entry><entry namest=\"col1\" nameend=\"col1\" >Contains</entry></row></thead><tbody>");

		AssociationSwitch associationSwitch = new AssociationSwitch(umlClass);

		org.eclipse.uml2.uml.Package topPackage = UMLUtil.getTopPackage(umlClass);

		for (Element element : topPackage.getOwnedElements()) {

			associationSwitch.doSwitch(element);

		}

		associationSwitch.sort();

		int maxRows = associationSwitch.getRowCount();

		if (maxRows > 0) {
			for (int rowCtr = 0; rowCtr < maxRows; rowCtr++) {
				String containedBy = "";
				String contains = "";
				if (rowCtr < associationSwitch.getContainedBy().size()) {
					containedBy = getAnXref(topPackage, (Class) associationSwitch.getContainedBy().get(rowCtr));
				}
				if (rowCtr < associationSwitch.getContains().size()) {
					contains = getAnXref(topPackage, (Class) associationSwitch.getContains().get(rowCtr));

				}
				tableBuffer.append("<row><entry>" + containedBy + "</entry><entry>" + contains + "</entry></row>");
			}
		} else {
			// insert blank row for dita
			tableBuffer.append("<row><entry> </entry><entry> </entry></row>");
		}

		tableBuffer.append("</tbody></tgroup></table></p></section>");

		return tableBuffer.toString();
	}
}
