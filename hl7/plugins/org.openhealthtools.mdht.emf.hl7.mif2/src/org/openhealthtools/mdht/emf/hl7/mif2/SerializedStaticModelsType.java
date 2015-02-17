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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serialized Static Models Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType#getSerializedStaticModel <em>Serialized Static Model</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedStaticModelsType()
 * @model extendedMetaData="name='serializedStaticModels_._type' kind='elementOnly'"
 * @generated
 */
public interface SerializedStaticModelsType extends EObject {
	/**
	 * Returns the value of the '<em><b>Serialized Static Model</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.emf.hl7.mif2.GlobalSerializedStaticModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A static Model in standard (flat) notation.  Used for CIM, LIM, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Serialized Static Model</em>' containment reference list.
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedStaticModelsType_SerializedStaticModel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='serializedStaticModel' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<GlobalSerializedStaticModel> getSerializedStaticModel();

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"2.1.4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies what schema version the content complies with.
	 * UML: Part of a complex tag value
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @see org.openhealthtools.mdht.emf.hl7.mif2.Mif2Package#getSerializedStaticModelsType_SchemaVersion()
	 * @model default="2.1.4" unsettable="true" dataType="org.openhealthtools.mdht.emf.hl7.mif2.Version" required="true"
	 *        extendedMetaData="kind='attribute' name='schemaVersion'"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Unsets the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link org.openhealthtools.mdht.emf.hl7.mif2.SerializedStaticModelsType#getSchemaVersion <em>Schema Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Version</em>' attribute is set.
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	boolean isSetSchemaVersion();

} // SerializedStaticModelsType
