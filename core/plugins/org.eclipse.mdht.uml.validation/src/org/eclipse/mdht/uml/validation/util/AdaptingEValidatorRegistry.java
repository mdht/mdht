/*******************************************************************************
 * Copyright (c) 2012 Christian W. Damus and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Christian W. Damus - initial API and implementation
 *
 *******************************************************************************/
package org.eclipse.mdht.uml.validation.util;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EValidatorRegistryImpl;
import org.eclipse.emf.validation.service.ModelValidationService;

/**
 * A validator registry that provides validators that delegate to the {@link ModelValidationService} in addition to doing the usual intrinsic
 * validation.
 */
public class AdaptingEValidatorRegistry extends EValidatorRegistryImpl {

	private static final long serialVersionUID = 1L;

	public AdaptingEValidatorRegistry() {
		this(EValidator.Registry.INSTANCE);
	}

	public AdaptingEValidatorRegistry(EValidator.Registry delegate) {
		super(delegate);
	}

	@Override
	protected Object delegatedGet(Object key) {
		// if super returns null, that's fine, because we'll ge a validator that only uses the ModelValidationService
		EValidator result = new EValidatorAdapter((EValidator) super.delegatedGet(key));
		put((EPackage) key, result); // for next time
		return result;
	}

}
