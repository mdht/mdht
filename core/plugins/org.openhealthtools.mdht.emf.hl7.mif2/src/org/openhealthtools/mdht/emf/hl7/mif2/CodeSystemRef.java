/*******************************************************************************
 * Copyright (c) 2006, 2009 David A Carlson
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.emf.hl7.mif2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code System Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to a coding system including its package location and OID.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemRef#getOid <em>Oid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemRef()
 * @model extendedMetaData="name='CodeSystemRef' kind='empty'"
 * @generated
 */
public interface CodeSystemRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Oid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oid</em>' attribute.
	 * @see #setOid(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getCodeSystemRef_Oid()
	 * @model dataType="org.openhealthtools.mdht.emf.hl7.mif2.Oid" required="true"
	 *        extendedMetaData="kind='attribute' name='oid'"
	 * @generated
	 */
	String getOid();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.CodeSystemRef#getOid <em>Oid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oid</em>' attribute.
	 * @see #getOid()
	 * @generated
	 */
	void setOid(String value);

} // CodeSystemRef
