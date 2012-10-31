/*******************************************************************************
 * Copyright (c) 2012 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.cts2.entity;

import org.openhealthtools.mdht.cts2.core.EntityReference;
import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityReference</i> as returned from a service
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg#getEntityReference <em>Entity Reference</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityReferenceMsg()
 * @model extendedMetaData="name='EntityReferenceMsg' kind='elementOnly'"
 * @generated
 */
public interface EntityReferenceMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Entity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Reference</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Reference</em>' containment reference.
	 * @see #setEntityReference(EntityReference)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityReferenceMsg_EntityReference()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='entityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityReference getEntityReference();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityReferenceMsg#getEntityReference <em>Entity Reference</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Reference</em>' containment reference.
	 * @see #getEntityReference()
	 * @generated
	 */
	void setEntityReference(EntityReference value);

} // EntityReferenceMsg
