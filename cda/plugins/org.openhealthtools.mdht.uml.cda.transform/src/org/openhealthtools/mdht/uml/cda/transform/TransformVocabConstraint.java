/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
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
package org.openhealthtools.mdht.uml.cda.transform;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class TransformVocabConstraint extends TransformAbstract {

	public TransformVocabConstraint(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}
		
		Stereotype enumConstraint = EcoreTransformUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.ENUMERATION_CONSTRAINT);
		Stereotype valueSet = EcoreTransformUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.VALUE_SET_CONSTRAINT);
		Stereotype codeSystem = EcoreTransformUtil.getAppliedHDFStereotype(
				property, IHDFProfileConstants.CODE_SYSTEM_CONSTRAINT);
		
		if (enumConstraint != null) {
			Enumeration enumeration = (Enumeration) property.getValue(enumConstraint, IHDFProfileConstants.ENUMERATION_VALUE);
			//TODO check for stereotype on Enumeration
			
			if (enumeration != null) {
				addAnnotation(property, null, enumeration.getName(), null, null, null);
				addConstraint(property, null, enumeration.getName(), null, null, null);
			}

			//TODO May need to retain property if there are other constraints, e.g. multiplicity
			//   maybe check if there is a property redefinition relationship?
			removeModelElement(property);
		}
		else if (valueSet != null) {
			String valueSetOID = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_OID);
			String valueSetName = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_NAME);
			String valueSetVersion = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_VERSION_DATE);
			String rootCode = (String) property.getValue(valueSet, IHDFProfileConstants.VALUE_SET_ROOT_CODE);

			addAnnotation(property, valueSetOID, valueSetName, rootCode, null, valueSetVersion);
			addConstraint(property, valueSetOID, valueSetName, rootCode, null, valueSetVersion);

			removeModelElement(property);
		}
		else if (codeSystem != null) {
			String codeSystemOID = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_OID);
			String codeSystemName = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_NAME);
			String codeSystemVersion = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_SYSTEM_VERSION);
			String code = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE);
			String codePrintName = (String) property.getValue(codeSystem, IHDFProfileConstants.CODE_PRINT_NAME);
			
			addAnnotation(property, codeSystemOID, codeSystemName, code, codePrintName, codeSystemVersion);
			addConstraint(property, codeSystemOID, codeSystemName, code, codePrintName, codeSystemVersion);

			removeModelElement(property);
		}
		
		return property;
	}

	private void addAnnotation(Property property, String codeSystem, String codeSystemName,
			String code, String displayName, String codeSystemVersion) {

		AnnotationsUtil annotationsUtil = new AnnotationsUtil(property.getClass_());
		if (codeSystem != null) {
			annotationsUtil.setAnnotation(property.getName()+".codeSystem", codeSystem);
		}
		if (codeSystemName != null) {
			annotationsUtil.setAnnotation(property.getName()+".codeSystemName", codeSystemName);
		}
		if (codeSystemVersion != null) {
			annotationsUtil.setAnnotation(property.getName()+".codeSystemVersion", codeSystemVersion);
		}
		if (code != null) {
			annotationsUtil.setAnnotation(property.getName()+".code", code);
		}
		if (displayName != null) {
			annotationsUtil.setAnnotation(property.getName()+".displayName", displayName);
		}
		
		annotationsUtil.saveAnnotations();
	}

	private void addConstraint(Property property, String codeSystem, String codeSystemName,
			String code, String displayName, String codeSystemVersion) {
		String constraintName = property.getClass_().getName() + "_" + property.getName();
		Constraint constraint = property.getClass_().createOwnedRule(constraintName, UMLPackage.eINSTANCE.getConstraint());
		constraint.getConstrainedElements().add(property.getClass_());

		String selfName = "self." + property.getName() + ".";
		StringBuffer body = new StringBuffer();
		
		// not self.statusCode.oclIsUndefined()
		body.append("not ");
		body.append(selfName);
		body.append("oclIsUndefined()");
		
		// and self.statusCode.code = 'xyz'
		if (code != null && code.length() > 0) {
			body.append(" and ");
			body.append(selfName);
			body.append("code = '");
			body.append(code);
			body.append("'");
		}
		if (codeSystem != null && codeSystem.length() > 0) {
			body.append(" and ");
			body.append(selfName);
			body.append("codeSystem = '");
			body.append(codeSystem);
			body.append("'");
		}
		if (codeSystemName != null && codeSystemName.length() > 0) {
			body.append(" and ");
			body.append(selfName);
			body.append("codeSystemName = '");
			body.append(codeSystemName);
			body.append("'");
		}
		if (codeSystemVersion != null && codeSystemVersion.length() > 0) {
			body.append(" and ");
			body.append(selfName);
			body.append("codeSystemVersion = '");
			body.append(codeSystemVersion);
			body.append("'");
		}

		if (body.length() > 0) {
			OpaqueExpression expression = (OpaqueExpression)constraint.createSpecification(null, null, UMLPackage.eINSTANCE.getOpaqueExpression());
			expression.getLanguages().add("OCL");
			expression.getBodies().add(body.toString());
		}
		
		//TODO get severity level from stereotype
		addValidationError(property.getClass_(), constraintName, null);
	}

}
