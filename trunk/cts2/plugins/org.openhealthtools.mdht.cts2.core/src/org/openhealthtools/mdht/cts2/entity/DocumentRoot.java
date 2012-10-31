/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.entity;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescription <em>Entity Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescriptionMsg <em>Entity Description Msg</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDirectory <em>Entity Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityList <em>Entity List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityReferenceMsg <em>Entity Reference Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

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
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_EntityDescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityDescription getEntityDescription();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescription <em>Entity Description</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Description</em>' containment reference.
	 * @see #getEntityDescription()
	 * @generated
	 */
	void setEntityDescription(EntityDescription value);

	/**
	 * Returns the value of the '<em><b>Entity Description Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Description Msg</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Description Msg</em>' containment reference.
	 * @see #setEntityDescriptionMsg(EntityDescriptionMsg)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_EntityDescriptionMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityDescriptionMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityDescriptionMsg getEntityDescriptionMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDescriptionMsg <em>Entity Description Msg</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Description Msg</em>' containment reference.
	 * @see #getEntityDescriptionMsg()
	 * @generated
	 */
	void setEntityDescriptionMsg(EntityDescriptionMsg value);

	/**
	 * Returns the value of the '<em><b>Entity Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Directory</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Directory</em>' containment reference.
	 * @see #setEntityDirectory(EntityDirectory)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_EntityDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityDirectory getEntityDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityDirectory <em>Entity Directory</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Directory</em>' containment reference.
	 * @see #getEntityDirectory()
	 * @generated
	 */
	void setEntityDirectory(EntityDirectory value);

	/**
	 * Returns the value of the '<em><b>Entity List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity List</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity List</em>' containment reference.
	 * @see #setEntityList(EntityList)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_EntityList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityList' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityList getEntityList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityList <em>Entity List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity List</em>' containment reference.
	 * @see #getEntityList()
	 * @generated
	 */
	void setEntityList(EntityList value);

	/**
	 * Returns the value of the '<em><b>Entity Reference Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity Reference Msg</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Entity Reference Msg</em>' containment reference.
	 * @see #setEntityReferenceMsg(EntityReferenceMsg)
	 * @see org.openhealthtools.mdht.cts2.entity.EntityPackage#getDocumentRoot_EntityReferenceMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EntityReferenceMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	EntityReferenceMsg getEntityReferenceMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.entity.DocumentRoot#getEntityReferenceMsg <em>Entity Reference Msg</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Entity Reference Msg</em>' containment reference.
	 * @see #getEntityReferenceMsg()
	 * @generated
	 */
	void setEntityReferenceMsg(EntityReferenceMsg value);

} // DocumentRoot
