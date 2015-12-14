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

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Property;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;
import org.openhealthtools.mdht.uml.transform.ecore.IEcoreProfileReflection.ValidationStereotypeKind;

public class APITransformCDAPropertyConstraint extends APITransformCDAPropertyConstraintRectified {

	public APITransformCDAPropertyConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public void removeModelElement(Element element) {
		// do nothing
	}

	@Override
	protected Constraint addOCLConstraint(Property property, ValidationStereotypeKind stereotype, StringBuffer body, String constraintName) {
		Constraint result = super.addOCLConstraint(property, stereotype, body, constraintName);
		if (result != null) {
			result.getConstrainedElements().clear();
			result.getConstrainedElements().add(property);
		}
		return result;
	}
}
