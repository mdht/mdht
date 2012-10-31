/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import org.openhealthtools.mdht.cts2.core.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Msg</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * An <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Entity">EntityDescription</i> as returned from a service
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg#getEntityDescription <em>Entity Description</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionMsg()
 * @model extendedMetaData="name='EntityDescriptionMsg' kind='elementOnly'"
 * @generated
 */
public interface EntityDescriptionMsg extends Message {
	/**
	 * Returns the value of the '<em><b>Entity Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A choice of the possible types of entity description
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Entity Description</em>' containment reference.
	 * @see #setEntityDescription(EntityDescription)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getEntityDescriptionMsg_EntityDescription()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='EntityDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityDescription getEntityDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.EntityDescriptionMsg#getEntityDescription <em>Entity Description</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Description</em>' containment reference.
	 * @see #getEntityDescription()
	 * @generated
	 */
	void setEntityDescription(EntityDescription value);

} // EntityDescriptionMsg
