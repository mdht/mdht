/*******************************************************************************
 * Copyright (c) 2009, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda;

import org.openhealthtools.mdht.uml.hl7.datatypes.INT;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region Of Interest Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.RegionOfInterestValue#isUnsorted <em>Unsorted</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterestValue()
 * @model
 * @generated
 */
public interface RegionOfInterestValue extends INT {
	/**
	 * Returns the value of the '<em><b>Unsorted</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsorted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsorted</em>' attribute.
	 * @see #setUnsorted(boolean)
	 * @see org.openhealthtools.mdht.uml.cda.CDAPackage#getRegionOfInterestValue_Unsorted()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isUnsorted();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.cda.RegionOfInterestValue#isUnsorted <em>Unsorted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsorted</em>' attribute.
	 * @see #isUnsorted()
	 * @generated
	 */
	void setUnsorted(boolean value);

} // RegionOfInterestValue
