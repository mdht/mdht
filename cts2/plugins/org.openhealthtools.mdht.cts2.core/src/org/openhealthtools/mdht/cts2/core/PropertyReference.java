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
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A reference to a CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> model element. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">PropertyReference</i> may reference a model attribute, a <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Property</i> or a special element such as match strength.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceTarget <em>Reference Target</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType <em>Reference Type</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getPropertyReference()
 * @model extendedMetaData="name='PropertyReference' kind='elementOnly'"
 * @generated
 */
public interface PropertyReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Target</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Reference Target</em>' containment reference.
	 * @see #setReferenceTarget(URIAndEntityName)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getPropertyReference_ReferenceTarget()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	URIAndEntityName getReferenceTarget();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceTarget <em>Reference Target</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Target</em>' containment reference.
	 * @see #getReferenceTarget()
	 * @generated
	 */
	void setReferenceTarget(URIAndEntityName value);

	/**
	 * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openhealthtools.mdht.cts2.core.TargetReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the type of thing being referenced
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Reference Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @see #isSetReferenceType()
	 * @see #unsetReferenceType()
	 * @see #setReferenceType(TargetReferenceType)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getPropertyReference_ReferenceType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='referenceType'"
	 * @generated
	 */
	TargetReferenceType getReferenceType();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Reference Type</em>' attribute.
	 * @see org.openhealthtools.mdht.cts2.core.TargetReferenceType
	 * @see #isSetReferenceType()
	 * @see #unsetReferenceType()
	 * @see #getReferenceType()
	 * @generated
	 */
	void setReferenceType(TargetReferenceType value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType <em>Reference Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isSetReferenceType()
	 * @see #getReferenceType()
	 * @see #setReferenceType(TargetReferenceType)
	 * @generated
	 */
	void unsetReferenceType();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.cts2.core.PropertyReference#getReferenceType <em>Reference Type</em>}'
	 * attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Reference Type</em>' attribute is set.
	 * @see #unsetReferenceType()
	 * @see #getReferenceType()
	 * @see #setReferenceType(TargetReferenceType)
	 * @generated
	 */
	boolean isSetReferenceType();

} // PropertyReference
