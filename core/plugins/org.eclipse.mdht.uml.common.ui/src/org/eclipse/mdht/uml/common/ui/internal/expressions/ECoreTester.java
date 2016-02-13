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
package org.eclipse.mdht.uml.common.ui.internal.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.gmf.runtime.notation.View;

/**
 * Property tester for Ecore aspects of selected elements.
 */
public class ECoreTester extends PropertyTester {
	private static final String PROPERTY_ECLASS = "eclass";

	public ECoreTester() {
		super();
	}

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean result = false;

		if (PROPERTY_ECLASS.equals(property)) {
			result = testEClass(receiver, ((String) expectedValue).trim());
		}

		return result;
	}

	private boolean testEClass(Object receiver, String eclassName) {
		boolean result = false;

		// adapt (Eclipse-ishly)
		if (receiver instanceof IAdaptable) {
			receiver = ((IAdaptable) receiver).getAdapter(EObject.class);
		}

		// unwrap (EMF-ishly)
		receiver = AdapterFactoryEditingDomain.unwrap(receiver);

		// unview (GMF-ishly)
		if (receiver instanceof View) {
			receiver = ((View) receiver).getElement();
		}

		if (receiver instanceof EObject) {
			EClass eclass = ((EObject) receiver).eClass();

			String epackageName = null;
			int colon = eclassName.indexOf(':');
			if (colon > 0) { // correct: don't accept an initial colon
				epackageName = eclassName.substring(0, colon);
				eclassName = eclassName.substring(colon + 1);
			}

			result = eclass.getName().equals(eclassName) &&
					((epackageName == null) || eclass.getEPackage().getName().equals(epackageName));
		}

		return result;
	}
}
