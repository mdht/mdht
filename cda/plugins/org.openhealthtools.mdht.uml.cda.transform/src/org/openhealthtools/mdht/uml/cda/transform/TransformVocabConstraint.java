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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;
import org.openhealthtools.mdht.uml.hdf.util.IHDFProfileConstants;

public class TransformVocabConstraint extends TransformAbstract {

	public TransformVocabConstraint(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseProperty(Property property) {
		if (isRemoved(property)) {
			return null;
		}
		
		// only process properties that are owned by a Class
		if (property.getClass_() == null) {
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
		
		StringBuffer body = getValueExpression(property);
		if (body == null) {
			return;
		}
		
		boolean needsAnd = false;
		if (code != null && code.length() > 0) {
			body.append("value.code = '");
			body.append(code);
			body.append("'");
			needsAnd = true;
		}
		if (codeSystem != null && codeSystem.length() > 0) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystem = '");
			body.append(codeSystem);
			body.append("'");
			needsAnd = true;
		}
		if (codeSystemName != null && codeSystemName.length() > 0) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystemName = '");
			body.append(codeSystemName);
			body.append("'");
			needsAnd = true;
		}
		if (codeSystemVersion != null && codeSystemVersion.length() > 0) {
			if (needsAnd) {
				body.append(" and ");
			}
			body.append("value.codeSystemVersion = '");
			body.append(codeSystemVersion);
			body.append("'");
		}

		if (body.length() > 0) {
			body.append(")");
			addOCLConstraint(property, body);
		}
		
	}

	private StringBuffer getValueExpression(Property property) {
		Property cdaProperty = getCDAProperty(property);
		if (cdaProperty == null) {
			String message = "Cannot find CDA property for: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			System.err.println(message);
			return null;
		}
		
		// check property type, including if redefined with restricted type
		if (!isCDType(property)) {
			String message = "Property is not CD type: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			System.err.println(message);
			return null;
		}

		StringBuffer body = new StringBuffer();
		String selfName = "self." + cdaProperty.getName();
//		String cdaTypeQName = cdaProperty.getType().getQualifiedName();
		String templateTypeQName = property.getType().getQualifiedName();
		
		if (property.getUpper() == 0) {
			// element is prohibited in redefinition
			// place-holder for when this is supported in UML 2.2
		}
		else if (cdaProperty.getUpper() == 1) {
			// single-valued CDA property
			if (property.getLower() == 1) {
				body.append("not ");
				body.append(selfName);
				body.append(".oclIsUndefined() and ");
			}
			body.append(selfName + ".oclIsTypeOf(" + templateTypeQName + ") and ");
			body.append(LF);
			body.append("let value : " + templateTypeQName + " = ");
			// add final opening paren because there is always a closing paren
			body.append(selfName + ".oclAsType(" + templateTypeQName + ") in (");
			body.append(LF);
		}
		else if (cdaProperty.getUpper() > 0 
				|| cdaProperty.getUpper() == LiteralUnlimitedNatural.UNLIMITED) {
			// multi-valued property
			
			if (property.getLower() == 1 && property.getUpper() == 1) {
				body.append(selfName);
				body.append("->size() = 1 and ");
			}
			else if (property.getLower() >= 1) {
				body.append("not ");
				body.append(selfName);
				body.append("->isEmpty() and ");
			}

			body.append(selfName);
			body.append("->forAll(element | element.oclIsTypeOf(" + templateTypeQName + ") and ");
			body.append(LF);
			
			body.append("let value : " + templateTypeQName);
			body.append(" = element.oclAsType(" + templateTypeQName + ") in ");
			body.append(LF);
		}
		
		return body;
	}

	private boolean isCDType(Property property) {
		Classifier type = (Classifier) property.getType();
		List<Classifier> allTypes = new ArrayList<Classifier>(type.allParents());
		allTypes.add(0, type);
		
		for (Classifier classifier : allTypes) {
			if ("datatypes::CD".equals(classifier.getQualifiedName())) {
				return true;
			}
		}
		
		return false;
	}
	
}
