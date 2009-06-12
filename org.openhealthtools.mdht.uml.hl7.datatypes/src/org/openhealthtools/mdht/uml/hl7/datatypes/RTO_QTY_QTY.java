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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RTO QTY QTY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getNumerator <em>Numerator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getDenominator <em>Denominator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_QTY_QTY()
 * @model
 * @generated
 */
public interface RTO_QTY_QTY extends QTY {
	/**
	 * Returns the value of the '<em><b>Numerator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numerator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numerator</em>' containment reference.
	 * @see #setNumerator(QTY)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_QTY_QTY_Numerator()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	QTY getNumerator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getNumerator <em>Numerator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numerator</em>' containment reference.
	 * @see #getNumerator()
	 * @generated
	 */
	void setNumerator(QTY value);

	/**
	 * Returns the value of the '<em><b>Denominator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Denominator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denominator</em>' containment reference.
	 * @see #setDenominator(QTY)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getRTO_QTY_QTY_Denominator()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	QTY getDenominator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.RTO_QTY_QTY#getDenominator <em>Denominator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denominator</em>' containment reference.
	 * @see #getDenominator()
	 * @generated
	 */
	void setDenominator(QTY value);

} // RTO_QTY_QTY
