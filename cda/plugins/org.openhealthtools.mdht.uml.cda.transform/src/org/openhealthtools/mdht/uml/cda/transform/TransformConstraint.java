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

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformConstraint extends TransformAbstract {
	public TransformConstraint(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseConstraint(Constraint constraint) {
		// remove all spec languages other than the first OCL expression
		ValueSpecification spec = constraint.getSpecification();
		if (spec instanceof OpaqueExpression) {
			List<String> languages = new ArrayList<String>(((OpaqueExpression) spec).getLanguages());
			String oclBody = null;
			for (int i=0; i<languages.size(); i++) {
				String lang = languages.get(i);
				if ("OCL".equals(lang)) {
					oclBody = ((OpaqueExpression) spec).getBodies().get(i);
					break;
				}
			}
			
			if (oclBody == null) {
				removeModelElement(constraint);
				return null;
			}
			else {
				((OpaqueExpression) spec).getLanguages().clear();
				((OpaqueExpression) spec).getBodies().clear();
				((OpaqueExpression) spec).getLanguages().add("OCL");
				((OpaqueExpression) spec).getBodies().add(oclBody);
			}
		}
		
		Class constrainedClass = null;
		if (constraint.getContext() instanceof Class) {
			constrainedClass = (Class) constraint.getContext();
		}
		else {
			return null;
		}

		String constraintName = normalizeConstraintName(constraint.getName());
		String constraintPrefix = createConstraintName(constrainedClass, null);
		if (!constraintName.startsWith(constraintPrefix)) {
			constraintName = constraintPrefix + constraintName;
		}
		constraint.setName(constraintName);
		
		String severity = SEVERITY_ERROR;
		String message = null;
		Stereotype validation = CDAProfileUtil.getAppliedCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
		if (validation != null) {
			message = (String) constraint.getValue(validation, ICDAProfileConstants.VALIDATION_MESSAGE);
			severity = getValidationSeverity(constraint);
			CDAProfileUtil.unapplyCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
		}
		
		if (SEVERITY_INFO.equals(severity)) {
			addValidationInfo(constrainedClass, constraint.getName(), message);
		} else if (SEVERITY_WARNING.equals(severity)) {
			addValidationWarning(constrainedClass, constraint.getName(), message);
		} else {
			addValidationError(constrainedClass, constraint.getName(), message);
		}

		return constraint;
	}
}
