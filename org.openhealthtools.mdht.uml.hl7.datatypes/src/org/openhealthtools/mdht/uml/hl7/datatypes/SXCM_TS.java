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

import org.openhealthtools.mdht.uml.hl7.vocab.SetOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SXCM TS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getSXCM_TS()
 * @model
 * @generated
 */
public interface SXCM_TS extends TS {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"I"</code>.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.uml.hl7.vocab.SetOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.SetOperator
	 * @see #setOperator(SetOperator)
	 * @see org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage#getSXCM_TS_Operator()
	 * @model default="I" ordered="false"
	 * @generated
	 */
	SetOperator getOperator();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see org.openhealthtools.mdht.uml.hl7.vocab.SetOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(SetOperator value);

} // SXCM_TS
