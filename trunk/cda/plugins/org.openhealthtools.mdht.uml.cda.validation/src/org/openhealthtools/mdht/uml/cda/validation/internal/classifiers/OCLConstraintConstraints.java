/*******************************************************************************
 * Copyright (c) 2010, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Christian W. Damus - refactor on prototype of profile-based constraint provider (artf3285)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.validation.provider.AbstractMultiConstraint;

/**
 * Constraints on OCL constraints in CDA models
 */
public class OCLConstraintConstraints extends AbstractMultiConstraint {

	final private static String ANALYSISLANGUAGE = "ANALYSIS";

	final private static String OCLLANGUAGE = "OCL";

	final private static String UNIMPLEMENTABLE = "UNIMPLEMENTABLE";

	protected static final OCL EOCL_ENV = OCL.newInstance();

	public OCLConstraintConstraints() {
		super();
	}

	public IStatus validateInvalidOCLConstraint(IValidationContext context) {

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

	public IStatus validateMissingOCLConstraint(IValidationContext context) {

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

					if (OCLLANGUAGE.equalsIgnoreCase(language)) {
						ocl = oe.getBodies().get(languageCtr);
					}

					if (ANALYSISLANGUAGE.equalsIgnoreCase(language)) {
						analysis = oe.getBodies().get(languageCtr);
					}

					languageCtr++;
				}

				if (analysis != null) {

					boolean unimplementable = false;
					for (Comment comment : constraint.getOwnedComments()) {
						if (comment.getBody() != null && comment.getBody().startsWith(UNIMPLEMENTABLE)) {
							unimplementable = true;
						}
					}

					if (!unimplementable && (ocl == null || ocl.trim().length() == 0)) {
						result = context.createFailureStatus(new Object[] { constraint.getQualifiedName() });
					}
				}

			}
		}

		return result;
	}
}
