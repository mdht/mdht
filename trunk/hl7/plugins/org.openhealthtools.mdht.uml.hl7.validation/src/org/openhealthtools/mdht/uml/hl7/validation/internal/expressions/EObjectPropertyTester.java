/*******************************************************************************
 * Copyright (c) 2006, 2008 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/

package org.openhealthtools.mdht.uml.hl7.validation.internal.expressions;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * A property tester for use in XML enablement expressions on {@link EObject}s.
 * This tester supports the following properties:
 * <dl>
 * <dt>ePackage</dt>
 * <dd>value is the expected namespace URI of the {@link EPackage} containing the object's {@link org.eclipse.emf.ecore.EClass}</dd>
 * </dl>
 */
public class EObjectPropertyTester extends PropertyTester {

	/**
	 * Initializes me.
	 */
	public EObjectPropertyTester() {
		super();
	}

	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		boolean result = false;

		if ("ePackage".equals(property)) { //$NON-NLS-1$
			EPackage actual = ((EObject) receiver).eClass().getEPackage();

			// check for null just in case
			result = (actual != null) && actual.getNsURI().equals(expectedValue);
		}

		return result;
	}

}
