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
import org.eclipse.uml2.uml.OpaqueExpression;
import org.openhealthtools.mdht.uml.cda.transform.TransformLogicalConstraint;
import org.openhealthtools.mdht.uml.transform.IBaseModelReflection;
import org.openhealthtools.mdht.uml.transform.TransformerOptions;

public class APITransformLogicalConstraint extends TransformLogicalConstraint {

	public APITransformLogicalConstraint(TransformerOptions options, IBaseModelReflection baseModelReflection) {
		super(options, baseModelReflection);
	}

	@Override
	public Object caseConstraint(Constraint constraint) {
		String analysis = null;
		if (constraint.getSpecification() instanceof OpaqueExpression) {
			OpaqueExpression opaqueExpression = (OpaqueExpression) constraint.getSpecification();
			if (!opaqueExpression.getLanguages().isEmpty() && "Analysis".equals(opaqueExpression.getLanguages().get(0))) {
				analysis = opaqueExpression.getBodies().get(0);
			}
		}
		Object result = super.caseConstraint(constraint);
		if (analysis != null && constraint.getSpecification() instanceof OpaqueExpression) {
			OpaqueExpression opaqueExpression = (OpaqueExpression) constraint.getSpecification();
			if (!(!opaqueExpression.getLanguages().isEmpty() && "Analysis".equals(opaqueExpression.getLanguages().get(0)))) {
				opaqueExpression.getLanguages().add(0, "Analysis");
				opaqueExpression.getBodies().add(0, analysis);
			}
		}
		return result;
	}
}
