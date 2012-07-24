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
 *                        - use the UML binding for OCL to avoid dependence on generated Ecore (artf3317)
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.validation.internal.classifiers;

import static org.openhealthtools.mdht.uml.validation.ocl.EcoreProfileEnvironment.isQueryConstraint;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ModelValidationService;
import org.eclipse.emf.validation.service.ValidationEvent;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.uml.OCL;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.ValueSpecification;
import org.openhealthtools.mdht.uml.validation.ocl.EcoreProfileEnvironmentFactory;
import org.openhealthtools.mdht.uml.validation.provider.AbstractMultiConstraint;

/**
 * Constraints on OCL constraints in CDA models
 */
public class OCLConstraintConstraints extends AbstractMultiConstraint {

	final private static String ANALYSISLANGUAGE = "ANALYSIS";

	final private static String OCLLANGUAGE = "OCL";

	final private static String UNIMPLEMENTABLE = "UNIMPLEMENTABLE";

	public OCLConstraintConstraints() {
		super();
	}

	public IStatus validateInvalidOCLConstraint(IValidationContext context) {

		IStatus result = context.createSuccessStatus();

		if (context.getTarget() instanceof Constraint) {
			Constraint constraint = (Constraint) context.getTarget();
			ValueSpecification vs = constraint.getSpecification();

			if (vs instanceof OpaqueExpression) {
				OpaqueExpression oe = (OpaqueExpression) vs;
				int languageCtr = 0;

				for (String language : oe.getLanguages()) {
					if (OCLLANGUAGE.equalsIgnoreCase(language)) {
						String ocl = oe.getBodies().get(languageCtr);

						if ((ocl != null) && (constraint.getContext() instanceof Classifier)) {
							try {
								OCL.Helper helper = getOCLCache(context).helper((Classifier) constraint.getContext());
								if (isQueryConstraint(constraint)) {
									helper.createQuery(ocl);
								} else {
									helper.createInvariant(ocl);
								}
							} catch (ParserException pe) {
								Object[] data = new Object[2];
								data[0] = constraint.getName();
								data[1] = pe.getMessage();

								result = context.createFailureStatus(data);
							}
						}
					}

					languageCtr++;
				}

			}
		}

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

	private OCLCache getOCLCache(IValidationContext ctx) {
		OCLCache result = (OCLCache) ctx.getCurrentConstraintData();

		if (result == null) {
			result = OCLCache.create(ctx.getTarget());
			ctx.putCurrentConstraintData(result);
		}

		return result;
	}

	//
	// Nested types
	//

	private static final class OCLCache {
		private static final Map<Reference<OCLCache>, OCL> INSTANCES = new java.util.HashMap<Reference<OCLCache>, OCL>();

		private static final ReferenceQueue<OCLCache> QUEUE = new ReferenceQueue<OCLConstraintConstraints.OCLCache>();

		static {
			ModelValidationService.getInstance().addValidationListener(createCleanupListener());
		}

		private final OCL ocl;

		private OCLCache(ResourceSet rset) {
			ocl = OCL.newInstance((rset == null)
					? new EcoreProfileEnvironmentFactory()
					: new EcoreProfileEnvironmentFactory(rset));
			INSTANCES.put(new PhantomReference<OCLCache>(this, QUEUE), ocl);
		}

		static OCLCache create(EObject context) {
			Resource res = context.eResource();

			OCLCache result = new OCLCache((res == null)
					? null
					: res.getResourceSet());

			// take this opportunity to clean up the queue
			cleanUpOCLCaches();

			return result;
		}

		OCL.Helper helper(Classifier context) {
			OCL.Helper result = ocl.createOCLHelper();
			result.setContext(context);
			return result;
		}

		static void cleanUpOCLCaches() {
			for (Reference<? extends OCLCache> next = QUEUE.poll(); next != null; next = QUEUE.poll()) {
				next.clear();

				OCL ocl = INSTANCES.remove(next);
				if (ocl != null) {
					ocl.dispose();
				}
			}
		}

		private static IValidationListener createCleanupListener() {
			return new IValidationListener() {

				public void validationOccurred(ValidationEvent event) {
					cleanUpOCLCaches();
				}
			};
		}
	}
}
