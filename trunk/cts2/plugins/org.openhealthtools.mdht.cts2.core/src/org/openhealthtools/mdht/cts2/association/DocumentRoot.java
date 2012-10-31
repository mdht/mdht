/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.association;

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
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getMixed <em>Mixed</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociation <em>Association</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationDirectory <em>Association Directory</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationGraph <em>Association Graph</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationList <em>Association List</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationMsg <em>Association Msg</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot()
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
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_Mixed()
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
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_XMLNSPrefixMap()
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
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Association</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A "semantic" assertion about a relationship between a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Association">subject</i> entity and a
	 * target entity, literal or compound expression as represented by an unnamed blank node ("bnode").
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Association</em>' containment reference.
	 * @see #setAssociation(Association)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_Association()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Association' namespace='##targetNamespace'"
	 * @generated
	 */
	Association getAssociation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociation <em>Association</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association</em>' containment reference.
	 * @see #getAssociation()
	 * @generated
	 */
	void setAssociation(Association value);

	/**
	 * Returns the value of the '<em><b>Association Directory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Directory</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association Directory</em>' containment reference.
	 * @see #setAssociationDirectory(AssociationDirectory)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_AssociationDirectory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationDirectory' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationDirectory getAssociationDirectory();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationDirectory <em>Association Directory</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association Directory</em>' containment reference.
	 * @see #getAssociationDirectory()
	 * @generated
	 */
	void setAssociationDirectory(AssociationDirectory value);

	/**
	 * Returns the value of the '<em><b>Association Graph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Graph</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association Graph</em>' containment reference.
	 * @see #setAssociationGraph(AssociationGraph)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_AssociationGraph()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationGraph' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationGraph getAssociationGraph();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationGraph <em>Association Graph</em>}'
	 * containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association Graph</em>' containment reference.
	 * @see #getAssociationGraph()
	 * @generated
	 */
	void setAssociationGraph(AssociationGraph value);

	/**
	 * Returns the value of the '<em><b>Association List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association List</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association List</em>' containment reference.
	 * @see #setAssociationList(AssociationList)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_AssociationList()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationList' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationList getAssociationList();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationList <em>Association List</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association List</em>' containment reference.
	 * @see #getAssociationList()
	 * @generated
	 */
	void setAssociationList(AssociationList value);

	/**
	 * Returns the value of the '<em><b>Association Msg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Msg</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Association Msg</em>' containment reference.
	 * @see #setAssociationMsg(AssociationMsg)
	 * @see org.openhealthtools.mdht.cts2.association.AssociationPackage#getDocumentRoot_AssociationMsg()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AssociationMsg' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationMsg getAssociationMsg();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.association.DocumentRoot#getAssociationMsg <em>Association Msg</em>}' containment
	 * reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Association Msg</em>' containment reference.
	 * @see #getAssociationMsg()
	 * @generated
	 */
	void setAssociationMsg(AssociationMsg value);

} // DocumentRoot
