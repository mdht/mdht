/*******************************************************************************
 * Copyright (c) 2011 David A Carlson, IBM Corporation, and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Kenn Hussey - using annotations instead of expressions for Java bodies
 *     Kenn Hussey - fixing problems with generating facade for HITSP
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
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.cda.core.util.CDAModelUtil;
import org.openhealthtools.mdht.uml.cda.core.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.core.util.ICDAProfileConstants;

public class GenMethodHelper {
	public static final String LF = System.getProperty("line.separator");

	protected static String capitalize(String name) {
		return name.substring(0, 1).toUpperCase() + name.substring(1);
	}

	protected static String pluralize(String name) {
		if (name.endsWith("us")) {
			return name.substring(0, name.length() - 2) + "i";
		}
		if (name.endsWith("ss")) {
			return name + "es";
		}
		if (name.endsWith("s")) {
			return name;
		}
		if (name.endsWith("y")) {
			return name.substring(0, name.length() - 1) + "ies";
		}
		if (name.endsWith("ia")) {
			return name;
		}
		return name + "s";
	}

	protected TransformerOptions transformerOptions;

	public GenMethodHelper(TransformerOptions options) {
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

		Operation operation = null;
		String operationName = "get";
		// if (!UMLUtil.getRedefinedProperties(sourceProperty).isEmpty()) {
		// operationName += CDAModelUtil.getModelPrefix(sourceProperty);
		// }
		operationName += ((sourceProperty.getUpper() == 1)
				? capitalize(businessName)
				: capitalize(pluralize(businessName)));

		if (classifier instanceof Class) {
			operation = ((Class) classifier).createOwnedOperation(operationName, null, null, domainType);
		} else if (classifier instanceof Interface) {
			operation = ((Interface) classifier).createOwnedOperation(operationName, null, null, domainType);
		} else {
			return null;
		}
		operation.setIsQuery(true); // make this a query method
		operation.setUpper(sourceProperty.getUpper());

		String domainTypeQName = domainType.getQualifiedName();

		Class cdaTargetClass = CDAModelUtil.getCDAClass(targetClass);
		String cdaTargetName = cdaTargetClass == null
				? targetClass.getName()
				: cdaTargetClass.getName();
		String cdaTargetLowerName = cdaTargetName.substring(0, 1).toLowerCase() + cdaTargetName.substring(1);
		String cdaTargetQName = cdaTargetClass == null
				? targetClass.getQualifiedName()
				: cdaTargetClass.getQualifiedName();

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
				String nsURI = null;
				Package umlPackage = property.getType().getNearestPackage();
				Stereotype ePackage = umlPackage.getAppliedStereotype("Ecore::EPackage");
				if (ePackage != null) {
					nsURI = (String) umlPackage.getValue(ePackage, "nsURI");
				} else {
					Stereotype codegenSupport = CDAProfileUtil.getAppliedCDAStereotype(
						umlPackage, ICDAProfileConstants.CODEGEN_SUPPORT);
					if (codegenSupport != null) {
						nsURI = (String) umlPackage.getValue(
							codegenSupport, ICDAProfileConstants.CODEGEN_SUPPORT_NS_URI);
					}
				}

				if (nsURI == null) {
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

			// run init() on template classes
			if (property.getType() instanceof Class && CDAModelUtil.getTemplateId((Class) property.getType()) != null) {
				operationBody.append("try {" + LF);
				operationBody.append("	java.lang.reflect.Method initMethod = eObject.getClass().getMethod(\"init\", new java.lang.Class[0]);" +
						LF);
				operationBody.append("	initMethod.invoke(eObject, new Object[0]);" + LF);
				operationBody.append("} catch (Exception e) {" + LF);
				operationBody.append("	// no init() method" + LF);
				operationBody.append("}" + LF);
			}

			// instantiate domain class wrapper, only if domainType is in same package as interface we are building
			if (transformerOptions.isGenerateDomainClasses() && cdaTargetClass != null &&
					classifier.getNearestPackage() == domainType.getNearestPackage()) {
				operationBody.append("org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();" + LF);
				operationBody.append("org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();" +
						LF);
				operationBody.append("org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier(\"" +
						domainType.getName() + "\");" + LF);
				operationBody.append("I" + domainType.getName() + " value = (" + "I" + domainType.getName() +
						")domainFactory.create(domainEClass);" + LF);

				operationBody.append("value.setCDAType((org.openhealthtools.mdht.uml.cda." + cdaTargetClass.getName() +
						")eObject);" + LF);

			} else {
				operationBody.append(domainType.getName() + " value = " + "(" + domainType.getName() + ") eObject;" +
						LF);
			}

			if (transformerOptions.isGenerateDomainClasses()) {
				operationBody.append("this.getCDAType().");
			}

			if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
					CDAModelUtil.isSection(cdaTargetClass)) {
				operationBody.append("addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);" + LF);
				operationBody.append("return value;");
			} else if ((CDAModelUtil.isSection(sourceClass) || CDAModelUtil.isClinicalStatement(sourceClass)) &&
					CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
				operationBody.append("add" + cdaTargetClass.getName() + "((org.openhealthtools.mdht.uml.cda." +
						cdaTargetClass.getName() + ")eObject);" + LF);
				operationBody.append("return value;");
			} else if (CDAModelUtil.isDatatypeModel(property.getType())) {
				if (cdaProperty.getUpper() == 1) {
					operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
				} else {
					operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
				}
				operationBody.append("return value;");
			} else if (CDAModelUtil.isCDAModel(property.getType())) {
				if (cdaProperty.getUpper() == 1) {
					operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
				} else {
					operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
				}
				operationBody.append("return value;");
			} else if (cdaProperty == null) {
				System.err.println("Unsupported facade property: " + property.getQualifiedName());
				operationBody = new StringBuffer();
			} else {
				if (property.getUpper() == 1) {
					operationBody.append("set" + capitalize(property.getName()) + "(value);" + LF);
				} else {
					operationBody.append("get" + capitalize(pluralize(property.getName())) + "().add(value);" + LF);
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

		String operationVerb = (property.getUpper() == 1)
				? "set"
				: "add";
		String operationName = operationVerb + capitalize(businessName);
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
		Property cdaProperty = CDAModelUtil.getCDAProperty(property);

		if (transformerOptions.isGenerateDomainClasses()) {
			operationBody.append("this.getCDAType().");
		}

		if ((CDAModelUtil.isClinicalDocument(sourceClass) || CDAModelUtil.isSection(sourceClass)) &&
				CDAModelUtil.isSection(cdaTargetClass)) {
			operationBody.append("addSection((org.openhealthtools.mdht.uml.cda.Section)value);" + LF);
		} else if ((CDAModelUtil.isSection(sourceClass) || CDAModelUtil.isClinicalStatement(sourceClass)) &&
				CDAModelUtil.isClinicalStatement(cdaTargetClass)) {
			operationBody.append("add" + cdaTargetClass.getName() + "((org.openhealthtools.mdht.uml.cda." +
					cdaTargetClass.getName() + ")value);" + LF);
		} else if (CDAModelUtil.isDatatypeModel(property.getType())) {
			if (cdaProperty.getUpper() == 1) {
				operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
			} else {
				operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
			}
		} else if (CDAModelUtil.isCDAModel(property.getType())) {
			if (cdaProperty.getUpper() == 1) {
				operationBody.append("set" + capitalize(cdaProperty.getName()) + "(value);" + LF);
			} else {
				operationBody.append("get" + capitalize(pluralize(cdaProperty.getName())) + "().add(value);" + LF);
			}
		} else if (cdaProperty == null) {
			System.err.println("Unsupported facade property: " + property.getQualifiedName());
			operationBody = new StringBuffer();
		} else {
			if (property.getUpper() == 1) {
				operationBody.append("set" + capitalize(property.getName()) + "(value);" + LF);
			} else {
				operationBody.append("get" + capitalize(pluralize(property.getName())) + "().add(value);" + LF);
			}
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
