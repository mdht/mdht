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
package org.eclipse.mdht.uml.validation.internal.provider;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.validation.model.IClientSelector;
import org.eclipse.uml2.uml.Package;

/**
 * A validation client-context selector that matches elements in models profiled by a profile that has the <tt>{@literal <<constraintProvider>>}</tt>
 * stereotype applied.
 */
public class ProfileClientSelector implements IClientSelector {

	public ProfileClientSelector() {
		super();
	}

	public boolean selects(Object object) {
		// for now, let's only support validating profiles applied to the root package
		Package context = getRootPackage(object);

		return (context != null) && ValidationProfileUtil.getValidatingProfiles(context).iterator().hasNext();
	}

	protected Package getRootPackage(Object object) {
		Package result = null;

		if (object instanceof EObject) {
			EObject root = EcoreUtil.getRootContainer((EObject) object);
			if (root instanceof Package) {
				result = (Package) root;
			}
		}

		return result;
	}

}
