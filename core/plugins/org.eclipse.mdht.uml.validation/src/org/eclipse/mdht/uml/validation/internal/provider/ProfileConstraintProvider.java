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
package org.eclipse.mdht.uml.validation.internal.provider;

import static org.eclipse.mdht.uml.validation.internal.provider.ValidationProfileUtil.getBundleName;
import static org.eclipse.mdht.uml.validation.internal.provider.ValidationProfileUtil.getConstraintProvider;
import static org.eclipse.mdht.uml.validation.internal.provider.ValidationProfileUtil.getValidatingProfiles;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.EMFEventType;
import org.eclipse.emf.validation.IValidationContext;
import org.eclipse.emf.validation.model.IModelConstraint;
import org.eclipse.emf.validation.service.AbstractConstraintProvider;
import org.eclipse.emf.validation.service.ConstraintFactory;
import org.eclipse.emf.validation.service.IConstraintDescriptor;
import org.eclipse.mdht.uml.validation.ConstraintProvider;
import org.eclipse.mdht.uml.validation.Diagnostic;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.util.UMLUtil;

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
		initCache(eObject);

		return super.getBatchConstraints(eObject, constraints);
	}

	@Override
	public Collection<IModelConstraint> getLiveConstraints(Notification notification,
			Collection<IModelConstraint> constraints) {

		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			initCache((EObject) notifier);
		}

		return super.getLiveConstraints(notification, constraints);
	}

	private void initCache(EObject eObject) {
		if (eObject instanceof Element) {
			discoverConstraints((Element) eObject);
		} else {
			currentCache = ConstraintCache.NULL;
		}
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
		IModelConstraint result = ConstraintFactory.getInstance().newConstraint(
			new ProfileConstraintDescriptor(bundleName, diagnostic));

		Stereotype stereotypeContext = getStereotypeContext(diagnostic);
		if (stereotypeContext != null) {
			// we need to "cast" an element as the applied stereotype to evaluate the constraint on it
			result = stereotypeCast(result, stereotypeContext);
		}

		return result;
	}

	private Stereotype getStereotypeContext(Diagnostic diagnostic) {
		Stereotype result = null;

		Namespace context = diagnostic.getBase_Constraint().getContext();
		if (context instanceof Stereotype) {
			result = (Stereotype) context;
		}

		return result;
	}

	private IModelConstraint stereotypeCast(IModelConstraint constraint, Stereotype stereotype) {
		return new StereotypeCastingConstraintWrapper(constraint, stereotype);
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

	private static class StereotypeCastingConstraintWrapper implements IModelConstraint {
		private final IModelConstraint delegate;

		private final StereotypeCastingValidationContextWrapper contextWrapper;

		StereotypeCastingConstraintWrapper(IModelConstraint constraint, Stereotype stereotype) {
			this.delegate = constraint;
			this.contextWrapper = new StereotypeCastingValidationContextWrapper(stereotype);
		}

		public IConstraintDescriptor getDescriptor() {
			return delegate.getDescriptor();
		}

		public IStatus validate(IValidationContext ctx) {
			contextWrapper.setDelegate(ctx);
			return delegate.validate(contextWrapper);
		}
	}

	private static class StereotypeCastingValidationContextWrapper implements IValidationContext {
		private final Stereotype stereotype;

		private IValidationContext delegate;

		StereotypeCastingValidationContextWrapper(Stereotype stereotype) {
			this.stereotype = stereotype;
		}

		void setDelegate(IValidationContext ctx) {
			this.delegate = ctx;
		}

		public EObject getTarget() {
			// cast the element as the stereotype
			Element element = (Element) delegate.getTarget();
			EObject result = element;

			EObject application = element.getStereotypeApplication(stereotype);

			if (application == null) {
				// the element must have some sub-stereotype applied, then
				List<Stereotype> applied = element.getAppliedSubstereotypes(stereotype);
				if (!applied.isEmpty()) {
					application = element.getStereotypeApplication(applied.get(0));
				}
			}

			if (application != null) {
				result = application;
			}

			return result;
		}

		public void addResult(EObject eObject) {
			delegate.addResult(asElement(eObject));
		}

		public void addResults(Collection<? extends EObject> eObjects) {
			for (EObject next : eObjects) {
				addResult(next);
			}
		}

		public IStatus createFailureStatus(Object... messageArgument) {
			Object[] args = new Object[messageArgument.length];

			for (int i = 0; i < messageArgument.length; i++) {
				if (messageArgument[i] instanceof EObject) {
					args[i] = asElement((EObject) messageArgument[i]);
				} else {
					args[i] = messageArgument[i];
				}
			}

			return delegate.createFailureStatus(args);
		}

		public void skipCurrentConstraintFor(EObject eObject) {
			delegate.skipCurrentConstraintFor(asElement(eObject));
		}

		public void skipCurrentConstraintForAll(Collection<?> eObjects) {
			List<Object> toSkip = new java.util.ArrayList<Object>(eObjects.size());
			for (Object next : eObjects) {
				if (next instanceof EObject) {
					toSkip.add(asElement((EObject) next));
				} else {
					toSkip.add(next);
				}
			}

			delegate.skipCurrentConstraintForAll(toSkip);
		}

		private EObject asElement(EObject eObject) {
			EObject result = eObject;

			if (!(eObject instanceof Element)) {
				Element element = UMLUtil.getBaseElement(eObject);
				if (element != null) {
					result = element;
				}
			}

			return result;
		}

		//
		// Delegation methods
		//

		public String getCurrentConstraintId() {
			return delegate.getCurrentConstraintId();
		}

		public EMFEventType getEventType() {
			return delegate.getEventType();
		}

		public List<Notification> getAllEvents() {
			return delegate.getAllEvents();
		}

		public EStructuralFeature getFeature() {
			return delegate.getFeature();
		}

		public Object getFeatureNewValue() {
			return delegate.getFeatureNewValue();
		}

		public void disableCurrentConstraint(Throwable exception) {
			delegate.disableCurrentConstraint(exception);
		}

		public Object getCurrentConstraintData() {
			return delegate.getCurrentConstraintData();
		}

		public Object putCurrentConstraintData(Object newData) {
			return delegate.putCurrentConstraintData(newData);
		}

		public Set<EObject> getResultLocus() {
			return delegate.getResultLocus();
		}

		public IStatus createSuccessStatus() {
			return delegate.createSuccessStatus();
		}
	}
}
