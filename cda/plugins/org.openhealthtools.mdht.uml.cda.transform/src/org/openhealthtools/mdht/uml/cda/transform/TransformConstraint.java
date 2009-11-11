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

import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.Stereotype;
import org.openhealthtools.mdht.uml.cda.resources.util.CDAProfileUtil;
import org.openhealthtools.mdht.uml.cda.resources.util.ICDAProfileConstants;

public class TransformConstraint extends TransformAbstract {

	public TransformConstraint(EcoreTransformerOptions options) {
		super(options);
	}
	
	public Object caseConstraint(Constraint constraint) {
		Class constrainedClass = null;
		if (constraint.getContext() instanceof Class) {
			constrainedClass = (Class) constraint.getContext();
		}
		else {
			return null;
		}

		constraint.setName(normalizeConstraintName(constraint.getName()));
		
		String severity = SEVERITY_ERROR;
		String message = null;
		Stereotype validation = CDAProfileUtil.getAppliedCDAStereotype(constraint, ICDAProfileConstants.CONSTRAINT_VALIDATION);
		if (validation != null) {
			message = (String) constraint.getValue(validation, ICDAProfileConstants.VALIDATION_MESSAGE);
			EnumerationLiteral literal = (EnumerationLiteral) constraint.getValue(validation, ICDAProfileConstants.VALIDATION_SEVERITY);
			severity = (literal != null) ? literal.getName() : SEVERITY_ERROR;
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
