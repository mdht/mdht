/*******************************************************************************
 * Copyright (c) 2010 David A Carlson.
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
package org.eclipse.mdht.uml.cda.core.profile;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Null Flavor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.eclipse.mdht.uml.cda.core.profile.NullFlavor#getNullFlavor <em>Null Flavor</em>}</li>
 * </ul>
 *
 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getNullFlavor()
 * @model
 * @generated
 */
public interface NullFlavor extends PropertyValidation {
	/**
	 * Returns the value of the '<em><b>Null Flavor</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.mdht.uml.cda.core.profile.NullFlavorKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Null Flavor</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.NullFlavorKind
	 * @see #setNullFlavor(NullFlavorKind)
	 * @see org.eclipse.mdht.uml.cda.core.profile.CDAPackage#getNullFlavor_NullFlavor()
	 * @model ordered="false"
	 * @generated
	 */
	NullFlavorKind getNullFlavor();

	/**
	 * Sets the value of the '{@link org.eclipse.mdht.uml.cda.core.profile.NullFlavor#getNullFlavor <em>Null Flavor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Null Flavor</em>' attribute.
	 * @see org.eclipse.mdht.uml.cda.core.profile.NullFlavorKind
	 * @see #getNullFlavor()
	 * @generated
	 */
	void setNullFlavor(NullFlavorKind value);

} // NullFlavor
