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
 * A representation of the model object '<em><b>Scoped Entity Name</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The combination of a namespace identifier and a local name. Scoped entity names are not portable - they only work within the context of a single
 * service instance, as different services may assign different
 * namespace identifiers to the same namespace and different services may make different choices of the appropriate local identifier to use to
 * represent an entity. As an example, one service may choose to use the entity code
 * while a second may use another designation that is known to be unique.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getNamespace <em>Namespace</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getScopedEntityName()
 * @model extendedMetaData="name='ScopedEntityName' kind='elementOnly'"
 * @generated
 */
public interface ScopedEntityName extends EObject {
	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an identifier that references a unique namespace URI within the context of the service
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getScopedEntityName_Namespace()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NamespaceIdentifier" required="true"
	 *        extendedMetaData="kind='element' name='namespace' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the local entity name within the context of the namespace. What is chosen for the entity name is service specific
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getScopedEntityName_Name()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ScopedEntityName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ScopedEntityName
