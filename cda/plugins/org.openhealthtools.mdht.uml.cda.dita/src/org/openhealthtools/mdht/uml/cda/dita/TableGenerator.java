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
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.core.profile.SeverityKind;
import org.openhealthtools.mdht.uml.cda.core.profile.Validation;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.common.util.NamedElementUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
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
				EClassifier eClassifier = ePackage.getEClassifier(umlType.getName());
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

		EClass eClass = getEClass(umlClass);

		if (eClass == null) {
			return "";
		}

		ClinicalDocument doc = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE.createClinicalDocument();

		EObject eObject;

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

		String startingXPath = "";
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

		tableBuffer.append("<section id=\"tableconformance\"><p><table frame=\"all\" scale=\"80\" pgwide=\"1\" ><tgroup cols=\"8\" align=\"left\" colsep = \"1\" rowsep = \"1\" > ");

		tableBuffer.append("<colspec colname=\"col0\" colnum=\"0\" />");
		tableBuffer.append("<colspec colname=\"col1\" colnum=\"1\" />");
		tableBuffer.append("<colspec colname=\"col2\" colnum=\"2\" />");
		tableBuffer.append("<colspec colname=\"col3\" colnum=\"3\" />");
		tableBuffer.append("<colspec colname=\"col4\" colnum=\"4\" />");
		tableBuffer.append("<colspec colname=\"col5\" colnum=\"5\" />");
		tableBuffer.append("<colspec colname=\"col6\" colnum=\"6\" />");
		tableBuffer.append("<colspec colname=\"col7\" colnum=\"7\" />");

		tableBuffer.append("<thead> <row><entry namest=\"col0\" nameend=\"col7\" >" +
				umlClass.getQualifiedName() +
				"</entry>  </row>  <row><entry namest=\"col0\" nameend=\"col7\" >" +
				startingXPath +
				"</entry>  </row>  <row><entry>Name" +
				eClass.getName() +
				"</entry><entry>XPath</entry><entry>Cardinality</entry><entry>Severity</entry><entry>Nullable</entry><entry>Data Type</entry><entry>Conformance</entry><entry>Value(s)</entry></row></thead><tbody>");

		Hashtable<String, Element> elements = new Hashtable<String, Element>();

		getTableRows(umlClass, elements);

		for (Element element : elements.values()) {
			if (element instanceof NamedElement) {
				addRow(tableBuffer, element, eClass, eObject);
			}

		}

		tableBuffer.append("</tbody></tgroup></table></p></section>");

		return tableBuffer.toString();
	}

	private void addRow(StringBuffer tableBuffer, Element element, EClass eClass, EObject eObject) {

		if (element instanceof Property) {

			Property property = (Property) element;

			EStructuralFeature feature = eClass.getEStructuralFeature(property.getName());

			tableBuffer.append(String.format("<row><entry>%s</entry>", NamedElementUtil.getBusinessName(property)));

			tableBuffer.append(String.format("<entry>%s</entry>", "/" + (feature instanceof EAttribute
					? "@"
					: "") + property.getName()));

			tableBuffer.append(String.format("<entry>%s..%s</entry>", property.getLower(), (property.getUpper() >= 0
					? property.getUpper()
					: "*")));

			Validation validation = getValidation((Class) element.getOwner(), property.getName());

			tableBuffer.append(String.format("<entry>%s</entry>", (validation != null
					? getSeverity(validation.getSeverity())
					: "")));

			tableBuffer.append(String.format("<entry>%s</entry>", (validation != null
					? (validation.isMandatory()
							? "NO"
							: "YES")
					: "YES")));

			tableBuffer.append(String.format("<entry>%s</entry>", getDataTypeName(property.getType().getName())));

			StringBuffer conformanceRules = new StringBuffer();

			if (validation != null) {
				for (String ruleId : validation.getRuleId()) {
					conformanceRules.append(ruleId);
				}
			}

			tableBuffer.append(String.format("<entry>%s</entry>", conformanceRules.toString()));

			tableBuffer.append(String.format(
				"<entry>%s %s</entry></row> \n", getCodeSystem((Class) element.getOwner(), property.getName()),
				getFeatureValue(eObject, feature)));

		}

	}

	void getTableRows(Class umlClass, Hashtable<String, Element> elements) {

		for (Property property : umlClass.getAttributes()) {

			if (!elements.containsKey(property.getName())) {
				elements.put(property.getName(), property);
			}
		}

		for (Association association : umlClass.getAssociations()) {

			if (association.getName() != null && !elements.containsKey(association.getName())) {
				elements.put(association.getName(), association);
			}
		}

		for (Generalization generalization : umlClass.getGeneralizations()) {
			if (generalization.getGeneral() instanceof Class) {
				getTableRows((Class) generalization.getGeneral(), elements);
			}
		}

		return;

	}
}
