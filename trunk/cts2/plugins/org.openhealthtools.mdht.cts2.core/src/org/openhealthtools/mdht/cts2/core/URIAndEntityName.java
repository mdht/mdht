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
 * A representation of the model object '<em><b>URI And Entity Name</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The combination of a URI and/or and ScopedEntityName.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getNamespace <em>Namespace</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getHref <em>Href</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getURIAndEntityName()
 * @model extendedMetaData="name='URIAndEntityName' kind='elementOnly'"
 * @generated
 */
public interface URIAndEntityName extends EObject {
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
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getURIAndEntityName_Namespace()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.NamespaceIdentifier"
	 *        extendedMetaData="kind='element' name='namespace' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getNamespace <em>Namespace</em>}' attribute.
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
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getURIAndEntityName_Name()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that resolves to the full <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntityDescription</i> represented by this resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getURIAndEntityName_Href()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.RenderingURI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that uniquely references the target entity
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getURIAndEntityName_Uri()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI" required="true"
	 *        extendedMetaData="kind='attribute' name='uri'"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.URIAndEntityName#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // URIAndEntityName
