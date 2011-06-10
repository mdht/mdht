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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.cda.validation.internal.CDAConstraint;
import org.openhealthtools.mdht.uml.cda.validation.internal.classifiers.Ocl;

public class InvalidOCLConstraint extends AbstractModelConstraint implements CDAConstraint {

	protected static final OCL EOCL_ENV = OCL.newInstance();

	private static final String ID_INVALIDOCL = OCL_GROUP + "invalidOCL";

	public static void register() {
		Ocl.registerConstraints(ID_INVALIDOCL, new InvalidOCLConstraint());

	}

	public InvalidOCLConstraint() {
		super();
	}

	@Override
	public IStatus validate(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		EPackage ePackage = null;

		if (context.getTarget() instanceof Constraint) {

			Constraint constraint = (Constraint) context.getTarget();

			ValueSpecification vs = constraint.getSpecification();

			if (vs instanceof OpaqueExpression) {

				OpaqueExpression oe = (OpaqueExpression) vs;

				int languageCtr = 0;

				for (String language : oe.getLanguages()) {

					if ("OCL".equalsIgnoreCase(language)) {

						String ocl = oe.getBodies().get(languageCtr);

						OCL.Helper helper = EOCL_ENV.createOCLHelper();

						// TODO fix ugly loop
						for (org.eclipse.uml2.uml.Package p : constraint.allOwningPackages()) {

							if (p.getAppliedStereotype("CDA::CodegenSupport") != null) {

								Stereotype s = p.getAppliedStereotype("CDA::CodegenSupport");

								String nsuri = (String) p.getValue(s, "nsURI");

								if (EPackage.Registry.INSTANCE.containsKey(nsuri)) {

									ePackage = EPackage.Registry.INSTANCE.getEPackage(nsuri);
									break;
								}

							}

						}

						if (constraint.getOwner() instanceof NamedElement) {

							String name = ((NamedElement) constraint.getOwner()).getName();

							if ((ePackage != null) && (ePackage.getEClassifier(name) != null)) {

								helper.setContext(ePackage.getEClassifier(name));

								try {

									helper.createInvariant(ocl);

								} catch (ParserException pe) {

									Object[] data = new Object[2];
									data[0] = constraint.getName();
									data[1] = pe.getMessage();

									result = context.createFailureStatus(data);

								}

							}
						}

					}

					languageCtr++;
				}

			}
		}

		// }

		// final Class rimClass = (Class) context.getTarget();

		return result;
	}

}
