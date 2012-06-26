/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.validation.internal.provider;

import static org.openhealthtools.mdht.uml.validation.internal.provider.ValidationProfileUtil.getBundleName;
import static org.openhealthtools.mdht.uml.validation.internal.provider.ValidationProfileUtil.getConstraintProvider;
import static org.openhealthtools.mdht.uml.validation.internal.provider.ValidationProfileUtil.getValidatingProfiles;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintProvider;
import org.eclipse.emf.validation.service.ConstraintFactory;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.openhealthtools.mdht.uml.validation.ConstraintProvider;
import org.openhealthtools.mdht.uml.validation.Diagnostic;

/**
 * A constraint provider that defines constraints based on <tt>{@literal <<diagnostic>>}</tt> constraints in UML profiles.
 */
public class ProfileConstraintProvider extends AbstractConstraintProvider {
	private ConstraintCache currentCache = ConstraintCache.NULL;

	public ProfileConstraintProvider() {
		super();
	}

	@Override
	public Collection<IModelConstraint> getBatchConstraints(EObject eObject, Collection<IModelConstraint> constraints) {
		if (eObject instanceof Element) {
			discoverConstraints((Element) eObject);
		} else {
			currentCache = ConstraintCache.NULL;
		}

		return super.getBatchConstraints(eObject, constraints);
	}

	private void discoverConstraints(Element element) {
		Package context = element.getNearestPackage();
		for (Package parent = (context != null)
				? context.getNestingPackage()
				: null; (parent != null); parent = context.getNestingPackage()) {
			context = parent;
		}

		currentCache = (context != null)
				? ConstraintCache.get(context, this)
				: ConstraintCache.NULL;
	}

	@Override
	protected List<IModelConstraint> getConstraints() {
		return currentCache.getConstraints();
	}

	List<IModelConstraint> createConstraints(Package context) {
		List<IModelConstraint> result = new java.util.ArrayList<IModelConstraint>();

		for (Profile profile : getValidatingProfiles(context)) {
			final String bundleName = getBundleName(profile);
			final ConstraintProvider provider = getConstraintProvider(profile);

			if ((bundleName != null) && (provider != null)) {
				collectModelConstraints(result, bundleName, provider.getDiagnostics());
			}
		}

		return result;
	}

	private void collectModelConstraints(Collection<? super IModelConstraint> collection, String bundleName,
			Iterable<? extends Diagnostic> diagnostics) {

		for (Diagnostic next : diagnostics) {
			IModelConstraint modelConstraint = createModelConstraint(bundleName, next);
			if (modelConstraint != null) { // it might be null if it was misspecified
				collection.add(modelConstraint);
			}
		}
	}

	IModelConstraint createModelConstraint(String bundleName, Diagnostic diagnostic) {
		return ConstraintFactory.getInstance().newConstraint(new ProfileConstraintDescriptor(bundleName, diagnostic));
	}

	//
	// Nested types
	//

	private static class ConstraintCache extends AdapterImpl {
		static final ConstraintCache NULL = new ConstraintCache();

		private final List<IModelConstraint> constraints;

		ConstraintCache() {
			constraints = Collections.emptyList();
		}

		ConstraintCache(Package context, ProfileConstraintProvider provider) {
			constraints = provider.createConstraints(context);
			context.eAdapters().add(this);
		}

		List<IModelConstraint> getConstraints() {
			return constraints;
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type == ProfileConstraintProvider.class;
		}

		static ConstraintCache get(Package context, ProfileConstraintProvider provider) {
			ConstraintCache result = (ConstraintCache) EcoreUtil.getExistingAdapter(
				context, ProfileConstraintProvider.class);

			if (result == null) {
				result = new ConstraintCache(context, provider);
			}

			return result;
		}
	}
}
