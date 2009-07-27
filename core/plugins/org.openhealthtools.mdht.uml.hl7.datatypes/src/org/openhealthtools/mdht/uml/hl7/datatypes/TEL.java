/**
 * Copyright (c) 2009 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TEL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUseablePeriod <em>Useable Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL()
 * @model
 * @generated
 */
public interface TEL extends URL {
	/**
	 * Returns the value of the '<em><b>Useable Period</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Useable Period</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Useable Period</em>' containment reference list.
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL_UseablePeriod()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SXCM_TS> getUseablePeriod();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' attribute list.
	 * The list contents are of type {@link org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse}.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' attribute list.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.TelecommunicationAddressUse
	 * @see #isSetUse()
	 * @see #unsetUse()
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getTEL_Use()
	 * @model unsettable="true" ordered="false"
	 * @generated
	 */
	EList<TelecommunicationAddressUse> getUse();

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUse <em>Use</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUse()
	 * @see #getUse()
	 * @generated
	 */
	void unsetUse();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.TEL#getUse <em>Use</em>}' attribute list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use</em>' attribute list is set.
	 * @see #unsetUse()
	 * @see #getUse()
	 * @generated
	 */
	boolean isSetUse();

} // TEL
