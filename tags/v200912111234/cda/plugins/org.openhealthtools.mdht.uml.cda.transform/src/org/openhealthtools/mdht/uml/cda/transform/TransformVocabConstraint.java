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
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;
import org.openhealthtools.mdht.uml.cda.transform.internal.Logger;

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
		
		Stereotype vocabSpecification = CDAProfileUtil.getAppliedCDAStereotype(
				property, ICDAProfileConstants.VOCAB_SPECIFICATION);
		
		if (vocabSpecification != null) {
			String codeSystem = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM);
			String codeSystemName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_NAME);
			String codeSystemVersion = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE_SYSTEM_VERSION);
			String code = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_CODE);
			String displayName = (String) property.getValue(vocabSpecification, ICDAProfileConstants.VOCAB_SPECIFICATION_DISPLAY_NAME);
			
			addAnnotation(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);
			addConstraint(property, codeSystem, codeSystemName, code, displayName, codeSystemVersion);

			removeModelElement(property);
		}
		
		return property;
	}

	private void addAnnotation(Property property, String codeSystem, String codeSystemName,
			String code, String displayName, String codeSystemVersion) {
		
		if (SEVERITY_INFO.equals(getValidationSeverity(property))) {
			// omit annotation for MAY constraints
			return;
		}

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
		
		if (codeSystem == null && codeSystemName == null && code == null) {
			return;
		}

		StringBuffer body = getValueExpression(property);
		if (body == null) {
			return;
		}

		if (SEVERITY_INFO.equals(getValidationSeverity(property))) {
			// constraint only applies if code system is undefined
			body.append("not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined()");
		}
		else {
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
			
			/*
			 * Only add this constraint if codeSystem is not specified.
			 */
			if ((codeSystem == null || codeSystem.length() == 0)
					&& codeSystemName != null && codeSystemName.length() > 0) {
				if (needsAnd) {
					body.append(" and ");
				}
				body.append("value.codeSystemName = '");
				body.append(codeSystemName);
				body.append("'");
				needsAnd = true;
			}
			
//			if (codeSystemVersion != null && codeSystemVersion.length() > 0) {
//				if (needsAnd) {
//					body.append(" and ");
//				}
//				body.append("value.codeSystemVersion = '");
//				body.append(codeSystemVersion);
//				body.append("'");
//			}
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
			return null;
		}
		if (property.getType() == null) {
			String message = "Property has no type: " + property.getQualifiedName();
			Logger.log(Logger.WARNING, message);
			// if property type is null, use type from redefined property
		}
		
		// check property type, including if redefined with restricted type
		if (!isCDType(property)) {
			String message = "Property is not CD type: " + property.getQualifiedName();
			Logger.log(Logger.ERROR, message);
			return null;
		}

		StringBuffer body = new StringBuffer();
		String selfName = "self." + cdaProperty.getName();
		String cdaTypeQName = cdaProperty.getType().getQualifiedName();
		String templateTypeQName = property.getType() == null ? 
				cdaTypeQName : property.getType().getQualifiedName();
		
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
			body.append(selfName + ".oclIsKindOf(" + templateTypeQName + ") and ");
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
			body.append("->forAll(element | element.oclIsKindOf(" + templateTypeQName + ") and ");
			body.append(LF);
			
			body.append("let value : " + templateTypeQName);
			body.append(" = element.oclAsType(" + templateTypeQName + ") in ");
			body.append(LF);
		}
		
		return body;
	}

	private boolean isCDType(Property property) {
		Classifier type = (Classifier) property.getType();
		if (type == null) {
			Property cdaProperty = getCDAProperty(property);
			if (cdaProperty != null)
				type = (Classifier) cdaProperty.getType();
			else
				return false;
		}
		
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
