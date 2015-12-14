/**
 * Copyright: NEHTA 2015
 * Author: Joerg Kiegeland, Distributed Models Pty Ltd 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhealthtools.mdht.api.transform;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class APITransformCDAAssociation extends APITransformCDAAssociationRectified {

	private Class constrainedClass;

	public APITransformCDAAssociation(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public void removeModelElement(Element element) {
		// do nothing
	}

	@Override
	public void addValidationMessage(Class constrainedClass, String constraintName, String message) {
		this.constrainedClass = constrainedClass;
		super.addValidationMessage(constrainedClass, constraintName, message);
	}

	@Override
	public Object caseAssociation(Association association) {
		constrainedClass = null;
		Object result = super.caseAssociation(association);
		if (result != null && constrainedClass != null) {
			Constraint constraint = constrainedClass.getOwnedRules().get(constrainedClass.getOwnedRules().size() - 1);
			constraint.getConstrainedElements().clear();
			constraint.getConstrainedElements().add(association);
		}
		return result;
	}
}
