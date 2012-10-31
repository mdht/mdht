/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The URI, namespace/name (if known) and a list of code systems that make assertions about the entity.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntityReference#getName <em>Name</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntityReference#getKnownEntityDescription <em>Known Entity Description</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntityReference#getAbout <em>About</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityReference()
 * @model extendedMetaData="name='EntityReference' kind='elementOnly'"
 * @generated
 */
public interface EntityReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the namespace and name by which this entity is known within the context of the service implementation
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ScopedEntityName)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityReference_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	ScopedEntityName getName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.EntityReference#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ScopedEntityName value);

	/**
	 * Returns the value of the '<em><b>Known Entity Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.DescriptionInCodeSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a version of a code system that makes one or more assertions about the referenced entity. Note that only one version of a given
	 * code system is allowed in the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">describingCodeSystem</i>
	 * list. Unless specified otherwise in a specific call, the code system version with the tag "CURRENT" must be used.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Known Entity Description</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityReference_KnownEntityDescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='knownEntityDescription' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DescriptionInCodeSystem> getKnownEntityDescription();

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the entity URI. This is an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ExternalURI</i> if the <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entityReferenceType </i>is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">NAMED_ENTITY</i> and a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">LocalURI</i> is the
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entityReferenceType</i> is <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ANONYMOUS_ENTITY.</i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntityReference_About()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.URI" required="true"
	 *        extendedMetaData="kind='attribute' name='about'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.EntityReference#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

} // EntityReference
