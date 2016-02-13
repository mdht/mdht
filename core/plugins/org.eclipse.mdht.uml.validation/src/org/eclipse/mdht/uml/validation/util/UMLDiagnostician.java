/*******************************************************************************
 * Copyright (c) 2006, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     Christian W. Damus - customize diagnostician to use ModelValidationService (artf3285)
 *                        - validate model in UML-to-Ecore transformation (artf3037)
 *
 * $Id$
 *******************************************************************************/
package org.eclipse.mdht.uml.validation.util;

import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * A diagnostician for UML models that integrates the {@code EPackage}'s intrinsic {@link EValidator} and the {@link ModelValidationService}.
 */
public class UMLDiagnostician extends Diagnostician {
	private final AdapterFactory adapterFactory;

	private final IProgressMonitor progressMonitor;

	/**
	 * Initializes me with the global validator and adapter-factory registries. I will not track progress.
	 */
	public UMLDiagnostician() {
		this(
			EValidator.Registry.INSTANCE,
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
	}

	/**
	 * Initializes me with a validator registry and adapter factory. I will not track progress.
	 *
	 * @param eValidatorRegistry
	 *            the registry in which to find validators to validate objects
	 * @param adapterFactory
	 *            an optional adapter factory, used primarily to get object labels for construction of validation failure messages. May be
	 *            {@code null}
	 */
	public UMLDiagnostician(EValidator.Registry eValidatorRegistry, AdapterFactory adapterFactory) {
		this(eValidatorRegistry, adapterFactory, null);
	}

	/**
	 * Initializes me with a validator registry, adapter factory, and monitor to track progress.
	 *
	 * @param eValidatorRegistry
	 *            the registry in which to find validators to validate objects
	 * @param adapterFactory
	 *            an optional adapter factory, used primarily to get object labels for construction of validation failure messages. May be
	 *            {@code null}
	 * @param progressMonitor
	 *            an optional progress monitor, that will be ticked for every object validated. May be {@code null}
	 */
	public UMLDiagnostician(EValidator.Registry eValidatorRegistry, AdapterFactory adapterFactory,
			IProgressMonitor progressMonitor) {
		super(adapt(eValidatorRegistry));

		this.adapterFactory = adapterFactory;
		this.progressMonitor = (progressMonitor == null)
				? new NullProgressMonitor()
				: progressMonitor;
	}

	/**
	 * Initializes me with the shared validator registry and an adapter factory and a monitor to track progress.
	 *
	 * @param adapterFactory
	 *            an optional adapter factory, used primarily to get object labels for construction of validation failure messages. May be
	 *            {@code null}
	 * @param progressMonitor
	 *            an optional progress monitor, that will be ticked for every object validated. May be {@code null}
	 */
	public UMLDiagnostician(AdapterFactory adapterFactory, IProgressMonitor progressMonitor) {
		this(EValidator.Registry.INSTANCE, adapterFactory, progressMonitor);
	}

	/**
	 * Initializes me with the shared validator registry and composed registered adapter factories, and a monitor to track progress.
	 *
	 * @param progressMonitor
	 *            an optional progress monitor, that will be ticked for every object validated. May be {@code null}
	 */
	public UMLDiagnostician(IProgressMonitor progressMonitor) {
		this(
			EValidator.Registry.INSTANCE,
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE), progressMonitor);
	}

	/**
	 * Integrate the model validation service.
	 *
	 * @param registry
	 *            a validator registry to adapt for model validation service
	 * @return the adapted registry, which may be the same as the input if already adapted
	 */
	private static EValidator.Registry adapt(EValidator.Registry registry) {
		return (registry instanceof AdaptingEValidatorRegistry)
				? registry
				: new AdaptingEValidatorRegistry(registry);
	}

	@Override
	public String getObjectLabel(EObject eObject) {
		if ((adapterFactory != null) && !eObject.eIsProxy()) {
			IItemLabelProvider itemLabelProvider = (IItemLabelProvider) adapterFactory.adapt(
				eObject, IItemLabelProvider.class);
			if (itemLabelProvider != null) {
				return itemLabelProvider.getText(eObject);
			}
		}

		return super.getObjectLabel(eObject);
	}

	@Override
	public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		progressMonitor.worked(1);
		return super.validate(eClass, eObject, diagnostics, context);
	}
}
