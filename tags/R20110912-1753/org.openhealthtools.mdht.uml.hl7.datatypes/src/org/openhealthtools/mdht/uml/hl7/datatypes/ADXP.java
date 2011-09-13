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
package org.openhealthtools.mdht.uml.hl7.datatypes;

import org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADXP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType <em>Part Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getADXP()
 * @model extendedMetaData="kind='mixed'"
 * @generated
 */
public interface ADXP extends ST {
	/**
	 * Returns the value of the '<em><b>Part Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType
	 * @see #isSetPartType()
	 * @see #unsetPartType()
	 * @see #setPartType(AddressPartType)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getADXP_PartType()
	 * @model unsettable="true" transient="true" ordered="false"
	 * @generated
	 */
	AddressPartType getPartType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType <em>Part Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Type</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.AddressPartType
	 * @see #isSetPartType()
	 * @see #unsetPartType()
	 * @see #getPartType()
	 * @generated
	 */
	void setPartType(AddressPartType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType <em>Part Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPartType()
	 * @see #getPartType()
	 * @see #setPartType(AddressPartType)
	 * @generated
	 */
	void unsetPartType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.ADXP#getPartType <em>Part Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Part Type</em>' attribute is set.
	 * @see #unsetPartType()
	 * @see #getPartType()
	 * @see #setPartType(AddressPartType)
	 * @generated
	 */
	boolean isSetPartType();

} // ADXP
