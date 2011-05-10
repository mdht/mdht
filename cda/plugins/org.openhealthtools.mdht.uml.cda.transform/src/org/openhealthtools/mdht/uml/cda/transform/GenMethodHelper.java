/*******************************************************************************
 * Copyright (c) 2011 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - using annotations instead of expressions for Java bodies
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.emf.common.util.BasicEList.UnmodifiableEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;

public class GenMethodHelper {
	public static final String LF = System.getProperty("line.separator");

	protected static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	protected static String pluralize(String name) {
		if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		if (name.endsWith("ia")) {
			return name;
		}
		return name + "s";
	}

	protected EcoreTransformerOptions transformerOptions;

	public GenMethodHelper(EcoreTransformerOptions options) {
		this.transformerOptions = options;
	}

	protected void addBodyAnnotation(Operation operation, String body) {
		EcoreUtil.setAnnotation(operation, "http://www.eclipse.org/emf/2002/GenModel", "body", body);
	}

	protected void addBodyExpression(Operation operation, String language, String body) {
		Constraint bodyConstraint = operation.createBodyCondition("body");
		bodyConstraint.getConstrainedElements().add(operation);

		OpaqueExpression bodyExpression = (OpaqueExpression) bodyConstraint.createSpecification(
			null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
		bodyExpression.getLanguages().add(language);
		bodyExpression.getBodies().add(body);
	}

	public Operation genAddOperation(Classifier classifier, Property property, Classifier domainType) {
		Operation operation = null;
		String businessName = null;
		if (transformerOptions.isUseBusinessNames()) {
			businessName = normalizeCodeName(property.getLabel(false));
		} else {
			businessName = normalizeCodeName(property.getName());
		}

		String operationName = "add" + capitalize(businessName);

		String[] paramNamesArray = { "value" };
		EList<String> parmNames = new UnmodifiableEList<String>(1, paramNamesArray);
		Type[] paramTypesArray = { domainType };
		EList<Type> parmTypes = new UnmodifiableEList<Type>(1, paramTypesArray);

		// "fluent" API style, returns self
		if (classifier instanceof Interface) {
			operation = ((Interface) classifier).createOwnedOperation(operationName, parmNames, parmTypes, classifier);
		} else if (classifier instanceof Class) {
			operation = ((Class) classifier).createOwnedOperation(operationName, parmNames, parmTypes, classifier);
		}

		return operation;
	}

	public Operation genAssociationGetterOperation(Classifier classifier, Property sourceProperty, Classifier domainType) {
		Class sourceClass = sourceProperty.getClass_();
		Class targetClass = (Class) sourceProperty.getType();

		if (sourceClass == null || targetClass == null || sourceProperty == null) {
			return null;
		}

		String businessName = null;
		if (transformerOptions.isUseBusinessNames()) {
			businessName = normalizeCodeName(sourceProperty.getLabel(false));
		} else {
			businessName = normalizeCodeName(sourceProperty.getName());
		}

		String operationName = "get";
		// if (!UMLUtil.getRedefinedProperties(sourceProperty).isEmpty()) {
		// operationName += CDAModelUtil.getModelPrefix(sourceProperty);
		// }
		operationName += ((sourceProperty.getUpper() == 1)
				? capitalize(businessName)
				: capitalize(pluralize(businessName)));
		Operation operation = sourceClass.createOwnedOperation(operationName, null, null, domainType);
		operation.setIsQuery(true); // make this a query method
		operation.setUpper(sourceProperty.getUpper());

		String domainTypeQName = domainType.getQualifiedName();

		Class cdaTargetClass = CDAModelUtil.getCDAClass(targetClass);
		String cdaTargetName = cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		String cdaTargetQName = cdaTargetClass.getQualifiedName();

		StringBuffer operationBody = new StringBuffer();

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(targetClass)) {
			// ClinicalDocument -> Section || Section -> Section
			operationBody.append("self.getAllSections()->select(");
			operationBody.append("section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(" +
					domainTypeQName + "))");

		} else {
			operationBody.append("self.get" + pluralize(cdaTargetName) + "()->select(");
			operationBody.append(cdaTargetLowerName + " : " + cdaTargetQName + " | ");
			operationBody.append("not " + cdaTargetLowerName + ".oclIsUndefined() and ");
			operationBody.append(cdaTargetLowerName + ".oclIsKindOf(" + domainTypeQName + "))");
		}

		if (sourceProperty.getUpper() == 1) {
			operationBody.append("->asSequence()->first()");
		}
		operationBody.append(".oclAsType(" + domainTypeQName + ")");

		// create body constraint to implement the operation
		addBodyExpression(operation, "OCL", operationBody.toString());

		return operation;
	}

	public Operation genCreateOperation(Classifier classifier, Property property, Classifier domainType) {
		Operation operation = null;
		String businessName = null;
		if (transformerOptions.isUseBusinessNames()) {
			businessName = normalizeCodeName(property.getLabel(false));
		} else {
			businessName = normalizeCodeName(property.getName());
		}

		String operationVerb = (property.getUpper() == 1)
				? "with"
				: "add";
		String operationName = operationVerb + capitalize(businessName);
		StringBuffer operationBody = new StringBuffer();

		if (classifier instanceof Interface) {
			operation = ((Interface) classifier).createOwnedOperation(operationName, null, null, domainType);
		} else if (classifier instanceof Class) {
			operation = ((Class) classifier).createOwnedOperation(operationName, null, null, domainType);
		}

		if (operation != null) {
			// create instance of appropriate domainType
			Class sourceClass = property.getClass_();
			Class cdaTargetClass = CDAModelUtil.getCDAClass((Classifier) property.getType());
			Property cdaProperty = CDAModelUtil.getCDAProperty(property);
			String nsURI = null;

			if (CDAModelUtil.isDatatypeModel(property.getType())) {
				operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;" +
						LF);
				operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;" +
						LF);
			} else if (CDAModelUtil.isCDAModel(property.getType())) {
				operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;" +
						LF);
				operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;" +
						LF);
			} else {
				Stereotype ePackage = property.getType().getNearestPackage().getAppliedStereotype("Ecore::EPackage");
				if (ePackage != null) {
					nsURI = (String) property.getType().getNearestPackage().getValue(ePackage, "nsURI");
				} else {
					return null;
				}

				operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage(\"" +
						nsURI + "\");" + LF);
				operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory(\"" +
						nsURI + "\");" + LF);
			}

			operationBody.append("org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier(\"" +
					property.getType().getName() + "\");" + LF);
			operationBody.append("org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);" + LF);

			if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
					CDAModelUtil.isSection(cdaTargetClass)) {
				operationBody.append(domainType.getName() + " section = " + "(" + domainType.getName() + ") eObject;" +
						LF);
				operationBody.append("section.init();" + LF);

				operationBody.append("addSection((org.openhealthtools.mdht.uml.cda.Section)section);" + LF);
				operationBody.append("return (" + domainType.getName() + ")section;");
			} else if ((CDAModelUtil.isSection(sourceClass) || CDAModelUtil.isClinicalStatement(sourceClass)) &&
					CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
				operationBody.append(domainType.getName() + " clinicalStatement = " + "(" + domainType.getName() +
						") eObject;" + LF);
				operationBody.append("clinicalStatement.init();" + LF);

				operationBody.append("add" + cdaTargetClass.getName() + "((org.openhealthtools.mdht.uml.cda." +
						cdaTargetClass.getName() + ")clinicalStatement);" + LF);
				operationBody.append("return clinicalStatement;");
			} else if (CDAModelUtil.isDatatypeModel(property.getType())) {
				operationBody.append(domainType.getName() + " value = " + "(" + domainType.getName() + ") eObject;" +
						LF);

				if (cdaProperty.getUpper() == 1) {
					operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
				} else {
					operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
				}
				operationBody.append("return value;");
			} else if (CDAModelUtil.isCDAModel(property.getType())) {
				operationBody.append(domainType.getName() + " value = " + "(" + domainType.getName() + ") eObject;" +
						LF);

				if (cdaProperty.getUpper() == 1) {
					operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
				} else {
					operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
				}
				operationBody.append("return value;");
			}

			// create body annotation to implement the operation
			if (operationBody.length() > 0) {
				addBodyAnnotation(operation, operationBody.toString());
			}
		}

		return operation;
	}

	public Operation genPropertyGetterOperation(Classifier classifier, Property property, Classifier domainType) {
		if (property.getAssociation() != null) {
			return genAssociationGetterOperation(classifier, property, domainType);
		}

		Operation operation = null;
		String businessName = null;
		if (transformerOptions.isUseBusinessNames()) {
			businessName = normalizeCodeName(property.getLabel(false));
		} else {
			businessName = normalizeCodeName(property.getName());
		}

		String operationName = "get" + ((property.getUpper() == 1)
				? capitalize(businessName)
				: capitalize(pluralize(businessName)));
		StringBuffer operationBody = new StringBuffer();

		if (classifier instanceof Interface) {
			operation = ((Interface) classifier).createOwnedOperation(operationName, null, null, domainType);
		} else if (classifier instanceof Class) {
			operation = ((Class) classifier).createOwnedOperation(operationName, null, null, domainType);
		}

		if (operation != null) {
			operation.setIsQuery(true); // make this a query method
			operation.setUpper(property.getUpper());

			Property cdaProperty = CDAModelUtil.getCDAProperty(property);
			if (cdaProperty != null) {
				operationBody.append("self." + cdaProperty.getName());
				operationBody.append(".oclAsType(" + domainType.getQualifiedName() + ")");

				// create body constraint to implement the operation
				addBodyExpression(operation, "OCL", operationBody.toString());
			}
		}

		return operation;
	}

	public Operation genSetOperation(Classifier classifier, Property property, Classifier domainType) {
		Operation operation = null;
		String businessName = null;
		if (transformerOptions.isUseBusinessNames()) {
			businessName = normalizeCodeName(property.getLabel(false));
		} else {
			businessName = normalizeCodeName(property.getName());
		}

		String operationName = "with" + capitalize(businessName);
		StringBuffer operationBody = new StringBuffer();

		String[] paramNamesArray = { "value" };
		EList<String> parmNames = new UnmodifiableEList<String>(1, paramNamesArray);
		Type[] paramTypesArray = { domainType };
		EList<Type> parmTypes = new UnmodifiableEList<Type>(1, paramTypesArray);

		// "fluent" API style, returns self
		if (classifier instanceof Interface) {
			operation = ((Interface) classifier).createOwnedOperation(operationName, parmNames, parmTypes, classifier);
		} else if (classifier instanceof Class) {
			operation = ((Class) classifier).createOwnedOperation(operationName, parmNames, parmTypes, classifier);
		}

		// create instance of appropriate domainType
		Class sourceClass = property.getClass_();
		Class cdaTargetClass = CDAModelUtil.getCDAClass((Classifier) property.getType());
		String nsURI = null;

		if (CDAModelUtil.isDatatypeModel(property.getType())) {
			operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;" +
					LF);
			operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;" +
					LF);
		} else if (CDAModelUtil.isCDAModel(property.getType())) {
			operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;" +
					LF);
			operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;" +
					LF);
		} else {
			Stereotype ePackage = property.getType().getNearestPackage().getAppliedStereotype("Ecore::EPackage");
			if (ePackage != null) {
				nsURI = (String) property.getType().getNearestPackage().getValue(ePackage, "nsURI");
			} else {
				return null;
			}

			operationBody.append("org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage(\"" +
					nsURI + "\");" + LF);
			operationBody.append("org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory(\"" +
					nsURI + "\");" + LF);
		}

		operationBody.append("org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier(\"" +
				property.getType().getName() + "\");" + LF);
		operationBody.append("org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);" + LF);

		// TODO add to classifier

		if (CDAModelUtil.isClinicalStatement(sourceClass) && CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
			operationBody.append(domainType.getName() + " clinicalStatement = " + "(" + domainType.getName() +
					") eObject;" + LF);
			operationBody.append("clinicalStatement.init();" + LF);

			operationBody.append("add" + cdaTargetClass.getName() + "((org.openhealthtools.mdht.uml.cda." +
					cdaTargetClass.getName() + ")clinicalStatement);" + LF);
		}

		operationBody.append("return this;");

		// create body annotation to implement the operation
		if (operationBody.length() > 0) {
			addBodyAnnotation(operation, operationBody.toString());
		}

		return operation;
	}

	protected String normalizeCodeName(String name) {
		String result = "";
		String[] parts = name.split(" ");
		for (String part : parts) {
			result += part.substring(0, 1).toUpperCase() + part.substring(1);
		}
		return result;
	}

}
