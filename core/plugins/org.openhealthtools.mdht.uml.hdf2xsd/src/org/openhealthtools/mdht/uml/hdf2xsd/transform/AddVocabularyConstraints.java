/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.hdf2xsd.transform;

import java.util.List;

import net.sourceforge.xmlmodeling.uml.xsd.profile.IXSDProfileConstants;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.XSDDatatypeUtil;

public class AddVocabularyConstraints extends UMLSwitch {

	private XSDTransformerOptions transformerOptions;

	public AddVocabularyConstraints(XSDTransformerOptions options) {
		transformerOptions = options;
	}

	@Override
	public Object caseProperty(Property property) {
		if (!transformerOptions.isIncludeVocabularyConstraints()) {
			return property;
		}

		Stereotype conceptDomain = property.getAppliedStereotype(IHDFProfileConstants.HDF_PROFILE_NAME +
				NamedElement.SEPARATOR + IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
		Stereotype codeSystem = property.getAppliedStereotype(IHDFProfileConstants.HDF_PROFILE_NAME +
				NamedElement.SEPARATOR + IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
		Stereotype valueSet = property.getAppliedStereotype(IHDFProfileConstants.HDF_PROFILE_NAME +
				NamedElement.SEPARATOR + IHDFProfileConstants.VALUE_SET_CONSTRAINT);
		Stereotype enumConstraint = property.getAppliedStereotype(IHDFProfileConstants.HDF_PROFILE_NAME +
				NamedElement.SEPARATOR + IHDFProfileConstants.ENUMERATION_CONSTRAINT);

		if (enumConstraint != null) {
			setEnumerationValues(property, enumConstraint);
		} else if (valueSet != null) {
			setValueSetValues(property, valueSet);
		} else if (codeSystem != null) {
			setCodeSystemValues(property, codeSystem);
		} else if (conceptDomain != null) {
			// TODO
		}

		return property;
	}

	private void setCodeSystemValues(Property property, Classifier codeType, String codeSystemOID,
			String codeSystemName, String codeSystemVersion, String code, String codePrintName) {

		// Anonymous type is allowed only for XML elements, not attributes
		boolean isXSDAttribute = XSDTransformUtil.isXSDAttribute(property);
		if (isXSDAttribute) {
			if (codeType != null) {
				property.setType(codeType);
			} else if (codeSystemName != null) {
				// If defined in HL7 XSD vocabulary data types, then set as 'code' type.
				Enumeration enumeration = XSDDatatypeUtil.getVocabularyByName(
					property.getNearestPackage(), codeSystemName);
				if (enumeration != null) {
					property.setType(enumeration);
				} else {
					// TODO replace with a logger that will display as warning in Console view
					System.err.println("Code System or Value Set not found: '" + codeSystemName + "' for " +
							UMLUtil.getPackageQualifiedName(property));
				}
			}

			if (code != null) {
				property.setDefault(code);
				// XSD does not allow default values on required attributes, make it fixed.
				if (property.getLower() >= 1) {
					property.setIsReadOnly(true);
				}
			}

			return;
		}

		/*
		 * Property type must be derived from CD or SC.
		 */
		if (!(property.getType() instanceof Class)) {
			return;
		}
		List<String> allParentNames = UMLUtil.getAllParentNames((Class) property.getType());
		if (!(allParentNames.contains("CD") || allParentNames.contains("SC"))) {
			return;
		}

		Class anonType = createAnonymousType(property);
		if (codeSystemOID != null) {
			Property attr = anonType.getOwnedAttribute("codeSystem", null);
			if (attr != null && !XSDTransformUtil.isProhibited(attr)) {
				attr.setDefault(codeSystemOID);
			}
		}
		if (codeSystemName != null) {
			Property attr = anonType.getOwnedAttribute("codeSystemName", null);
			if (attr != null && !XSDTransformUtil.isProhibited(attr)) {
				attr.setDefault(codeSystemName);
			}
		}
		if (codeSystemVersion != null) {
			Property attr = anonType.getOwnedAttribute("codeSystemVersion", null);
			if (attr != null && !XSDTransformUtil.isProhibited(attr)) {
				attr.setDefault(codeSystemVersion);
			}
		}
		if (codePrintName != null) {
			Property attr = anonType.getOwnedAttribute("displayName", null);
			if (attr != null && !XSDTransformUtil.isProhibited(attr)) {
				attr.setDefault(codePrintName);
			}
		}

		Property attr = anonType.getOwnedAttribute("code", null);
		if (attr != null && !XSDTransformUtil.isProhibited(attr)) {
			if (code != null) {
				attr.setDefault(code);
			}
			if (codeType != null) {
				attr.setType(codeType);
			} else if (codeSystemName != null) {
				// If defined in HL7 XSD vocabulary data types, then set as 'code' type.
				Enumeration enumeration = XSDDatatypeUtil.getVocabularyByName(
					property.getNearestPackage(), codeSystemName);
				if (enumeration != null) {
					attr.setType(enumeration);
				} else {
					// TODO replace with a logger that will display as warning in Console view
					System.err.println("Code System or Value Set not found: '" + codeSystemName + "' for " +
							UMLUtil.getPackageQualifiedName(property));
				}
			}
		}
	}

	private void setCodeSystemValues(Property property, Stereotype codeSystem) {
		assert (codeSystem != null && IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT.equals(codeSystem.getName()));

		String codeSystemOID = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_OID);
		String codeSystemName = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_NAME);
		String codeSystemVersion = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_VERSION);
		String code = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE);
		String codePrintName = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_PRINT_NAME);

		if (codeSystemOID == null && codeSystemName == null && codeSystemVersion == null && code == null &&
				codePrintName == null) {
			// don't create an anonymous type if there are no property values to set
			return;
		}

		setCodeSystemValues(property, null, codeSystemOID, codeSystemName, codeSystemVersion, code, codePrintName);
	}

	private void setValueSetValues(Property property, Stereotype valueSet) {
		assert (valueSet != null && IHDFProfileConstants.VALUE_SET_CONSTRAINT.equals(valueSet.getName()));

		String valueSetOID = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_OID);
		String valueSetName = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_NAME);
		String valueSetVersion = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_VERSION_DATE);
		String rootCode = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_ROOT_CODE);

		// TODO what use, if any, does this have in XSD?
		Object codingStrength = property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_CODING_STRENGTH);

		if (valueSetOID == null && valueSetName == null && valueSetVersion == null && codingStrength == null &&
				rootCode == null) {
			// don't create an anonymous type if there are no property values to set
			return;
		}

		setCodeSystemValues(property, null, valueSetOID, valueSetName, valueSetVersion, rootCode, null);
	}

	private void setEnumerationValues(Property property, Stereotype enumConstraint) {
		assert (enumConstraint != null && IHDFProfileConstants.ENUMERATION_CONSTRAINT.equals(enumConstraint.getName()));

		Enumeration enumeration = (Enumeration) property.getValue(
			enumConstraint, IHDFProfileConstants.ENUMERATION_VALUE);
		if (enumeration != null) {
			// enumeration type must extend 'cs'
			Classifier type_cs = XSDDatatypeUtil.getDatatypeByName(enumeration.getNearestPackage(), "cs");
			if (!enumeration.allParents().contains(type_cs)) {
				enumeration.createGeneralization(type_cs);
			}

			// TODO check for stereotype applied to Enumeration
			setCodeSystemValues(property, enumeration, null, enumeration.getName(), null, null, null);
		}
	}

	private Class createAnonymousType(Property property) {
		assert (property.getType() instanceof Class);

		Class propertyType = (Class) property.getType();
		String name = "_" + property.getName() + "Type";
		Class nestedClass = (Class) property.getClass_().createNestedClassifier(name, UMLPackage.eINSTANCE.getClass_());
		property.setType(nestedClass);
		UMLUtil.cloneStereotypes(propertyType, nestedClass);

		Generalization generalization = nestedClass.createGeneralization(propertyType);
		Stereotype restriction = XSDTransformUtil.getXSDStereotype(generalization, IXSDProfileConstants.RESTRICTION);
		generalization.applyStereotype(restriction);

		// copy all properties into the restricted type
		for (Property typeProperty : propertyType.getOwnedAttributes()) {
			Property clonedProperty = nestedClass.createOwnedAttribute(
				typeProperty.getName(), typeProperty.getType(), typeProperty.getLower(), typeProperty.getUpper());
			clonedProperty.setDefaultValue(typeProperty.getDefaultValue());
			clonedProperty.setAggregation(typeProperty.getAggregation());
			nestedClass.getOwnedAttributes().add(clonedProperty);
			UMLUtil.cloneStereotypes(typeProperty, clonedProperty);
		}

		return nestedClass;
	}

}
