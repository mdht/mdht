/*******************************************************************************
 * Copyright (c) 2009 Sean Muir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.oclconstraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.validation.internal.CDAConstraint;
import org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.Ocl;

public class MissingOCLConstraint extends AbstractModelConstraint implements CDAConstraint {

	protected static final OCL EOCL_ENV = OCL.newInstance();

	private static final String ID_INVALIDOCL = OCL_GROUP + "missingOCL";

	public static void register() {
		Ocl.registerConstraints(ID_INVALIDOCL, new MissingOCLConstraint());

	}

	public MissingOCLConstraint() {
		super();
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		if (context.getTarget() instanceof Constraint) {

			Constraint constraint = (Constraint) context.getTarget();

			ValueSpecification vs = constraint.getSpecification();

			if (vs instanceof OpaqueExpression) {

				OpaqueExpression oe = (OpaqueExpression) vs;

				int languageCtr = 0;

				String ocl = null;
				String analysis = null;

				for (String language : oe.getLanguages()) {

					if ("OCL".equalsIgnoreCase(language)) {
						ocl = oe.getBodies().get(languageCtr);

					}

					if ("Analysis".equalsIgnoreCase(language)) {
						analysis = oe.getBodies().get(languageCtr);
					}

					languageCtr++;
				}

				if (analysis != null) {

					if (ocl == null || ocl.trim().length() == 0) {
						result = context.createFailureStatus(new Object[] { constraint.getQualifiedName() });
					}
				}

			}
		}

		// }

		// final Class rimClass = (Class) context.getTarget();

		return result;
	}

}
