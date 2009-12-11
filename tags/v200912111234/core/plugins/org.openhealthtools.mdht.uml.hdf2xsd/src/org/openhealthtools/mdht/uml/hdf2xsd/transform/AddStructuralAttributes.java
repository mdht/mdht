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
import net.sourceforge.xmlmodeling.uml.xsd.profile.XSDProfileUtil;

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLSwitch;
import org.openhealthtools.mdht.uml.common.util.UMLUtil;
import org.openhealthtools.mdht.uml.hdf.util.HL7ResourceUtil;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;
import org.openhealthtools.mdht.uml.hdf.util.RIMProfileUtil;
import org.openhealthtools.mdht.uml.hdf.util.XSDDatatypeUtil;


public class AddStructuralAttributes extends UMLSwitch {
	private static final String ACT = "Act";
	private static final String ENTITY = "Entity";
	private static final String ROLE = "Role";
	private static final String PARTICIPATION = "Participation";
	private static final String ACT_RELATIONSHIP = "ActRelationship";
	private static final String ROLE_LINK = "RoleLink";
	
	private static final String CLASS_CODE = "classCode";
	private static final String TYPE_CODE = "typeCode";
	private static final String MOOD_CODE = "moodCode";
	private static final String DETERMINER_CODE = "determinerCode";

	private XSDTransformerOptions transformerOptions;

	public AddStructuralAttributes(XSDTransformerOptions options) {
		transformerOptions = options;
	}
	
	public Object caseClass(Class umlClass) {
		// don't add structural attributes to choice group
		Stereotype groupStereotype = HL7ResourceUtil.getAppliedHDFStereotype(
				umlClass, IHDFProfileConstants.CHOICE_GROUP);
		if (groupStereotype != null)
			return null;
		
		Package model = UMLUtil.getTopPackage(umlClass);
		XSDProfileUtil.applyXSDProfile(model);
		Stereotype xsdAttrStereotype = XSDTransformUtil.getXSDStereotype(model, IXSDProfileConstants.ATTRIBUTE);
		
		XSDTransformUtil.initializeModel(model);
		Classifier type_cs = XSDDatatypeUtil.getDatatypeByName(model, "cs");
		
		if (xsdAttrStereotype == null)
			return null;
		
		// Use the RIM stereotype to get defaults and vocabulary constraints
		Stereotype rimStereotype = RIMProfileUtil.getRIMStereotype(umlClass);
		
		Property property = null;
		
		if (RIMProfileUtil.isRIMType(umlClass, ACT)) {
			property = umlClass.getOwnedAttribute(CLASS_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(CLASS_CODE, type_cs);
			}
			else {
				// complex type from RIM must be changed to a simple type
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, CLASS_CODE);
			property.applyStereotype(xsdAttrStereotype);

			property = umlClass.getOwnedAttribute(MOOD_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(MOOD_CODE, type_cs);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, MOOD_CODE);
			property.applyStereotype(xsdAttrStereotype);

		}
		else if (RIMProfileUtil.isRIMType(umlClass, ACT_RELATIONSHIP)) {
			property = umlClass.getOwnedAttribute(TYPE_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(TYPE_CODE, type_cs);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, TYPE_CODE);
			property.applyStereotype(xsdAttrStereotype);

		}
		else if (RIMProfileUtil.isRIMType(umlClass, ENTITY)) {
			property = umlClass.getOwnedAttribute(CLASS_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(CLASS_CODE, type_cs);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, CLASS_CODE);
			property.applyStereotype(xsdAttrStereotype);

			property = umlClass.getOwnedAttribute(DETERMINER_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(DETERMINER_CODE, type_cs);
				property.setLower(0);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, DETERMINER_CODE);
			property.applyStereotype(xsdAttrStereotype);
			
		}
		else if (RIMProfileUtil.isRIMType(umlClass, PARTICIPATION)) {
			property = umlClass.getOwnedAttribute(TYPE_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(TYPE_CODE, type_cs);
				property.setLower(0);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, TYPE_CODE);
			property.applyStereotype(xsdAttrStereotype);

		}
		else if (RIMProfileUtil.isRIMType(umlClass, ROLE)) {
			property = umlClass.getOwnedAttribute(CLASS_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(CLASS_CODE, type_cs);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, CLASS_CODE);
			property.applyStereotype(xsdAttrStereotype);

		}
		else if (RIMProfileUtil.isRIMType(umlClass, ROLE_LINK)) {
			property = umlClass.getOwnedAttribute(TYPE_CODE, null);
			if (property == null) {
				property = umlClass.createOwnedAttribute(TYPE_CODE, type_cs);
			}
			else {
				property.setType(type_cs);
			}
			assignVocabularyConstraint(property, rimStereotype, TYPE_CODE);
			property.applyStereotype(xsdAttrStereotype);
		}
		
		return umlClass;
	}
	
	public Object caseProperty(Property property) {
		// immutable properties are XSD attributes
		Stereotype hdfAttribute = HL7ResourceUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.HDF_ATTRIBUTE);
		if (hdfAttribute != null) {
			Boolean isImmutable = (Boolean)property.getValue(hdfAttribute, IHDFProfileConstants.IS_IMMUTABLE);
			if (Boolean.TRUE == isImmutable) {
				Stereotype xsdAttrStereotype = XSDTransformUtil.getXSDStereotype(property, IXSDProfileConstants.ATTRIBUTE);
				if (xsdAttrStereotype != null) {
					org.eclipse.uml2.uml.util.UMLUtil.safeApplyStereotype(property, xsdAttrStereotype);
				}
				
				// XSD attributes with defaults may not be required
				if (property.getDefault() != null) {
					property.setLower(0);
				}
				
				// XSD attributes must use simple data type
				if (property.getType() instanceof Classifier) {
					List<String> allParentNames = UMLUtil.getAllParentNames((Classifier)property.getType());
					if (allParentNames.contains("CD")) {
						Classifier type_cs = XSDDatatypeUtil.getDatatypeByName(property.getNearestPackage(), "cs");
						property.setType(type_cs);
					}
					else if (allParentNames.contains("BL")) {
						Classifier type_bl = XSDDatatypeUtil.getDatatypeByName(property.getNearestPackage(), "bl");
						property.setType(type_bl);
						
						// workaround for HL7 models that have value of "True"
						if (property.getDefault() != null) {
							property.setDefault(property.getDefault().toLowerCase());
						}
					}
				}
			}
		}
		
		return property;
	}
	
	/**
	 * Apply vocabulary constraint stereotype to property.
	 */
	private void assignVocabularyConstraint(Property property,
			Stereotype rimStereotype, String attrName) {

		try {
			String code = (String) property.getClass_().getValue(rimStereotype, attrName);
			String codeSystem = (String) property.getClass_().getValue(rimStereotype, attrName + "System");
			
			if (code != null || codeSystem != null) {
				Stereotype codeSystemStereo = HL7ResourceUtil.applyHDFStereotype(property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
				if (codeSystemStereo != null) {
					property.setValue(codeSystemStereo, IHDFProfileConstants.CODE, code);
					property.setValue(codeSystemStereo, IHDFProfileConstants.CODE_SYSTEM_NAME, codeSystem);
				}
			}

			String conceptDomainPropertyName = 
				attrName.substring(0, attrName.indexOf("Code")) + "ConceptDomain";
			String conceptDomain = (String) property.getClass_().getValue(rimStereotype, conceptDomainPropertyName);

			if (conceptDomain != null) {
				Stereotype conceptDomainStereo = HL7ResourceUtil.applyHDFStereotype(property, IHDFProfileConstants.CONCEPT_DOMAIN_CONSTRAINT);
				if (conceptDomainStereo != null) {
					property.setValue(conceptDomainStereo, IHDFProfileConstants.CONCEPT_DOMAIN_NAME, conceptDomain);
				}
			}
		} catch (IllegalArgumentException ex) {
			// stereotype not assigned or illegal property name for stereotype
		}
	}

}
