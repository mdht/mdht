/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Resource Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * the description of the characteristics of a resource that are independent of the resource content
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseDocumentation <em>Release Documentation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseFormat <em>Release Format</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAbstractResourceDescription()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractResourceDescription' kind='elementOnly'"
 * @generated
 */
public interface AbstractResourceDescription extends ResourceDescription {
	/**
	 * Returns the value of the '<em><b>Release Documentation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * documentation about the frequency and natureof releases (version) of this resource.<i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">
	 * <sub>OMV 2.4.1 pp 18</sub>
	 * </i>
	 * 
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Release Documentation</em>' containment reference.
	 * @see #setReleaseDocumentation(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAbstractResourceDescription_ReleaseDocumentation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseDocumentation' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getReleaseDocumentation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.AbstractResourceDescription#getReleaseDocumentation
	 * <em>Release Documentation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Release Documentation</em>' containment reference.
	 * @see #getReleaseDocumentation()
	 * @generated
	 */
	void setReleaseDocumentation(OpaqueData value);

	/**
	 * Returns the value of the '<em><b>Release Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.SourceAndNotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a format and notation that thereleases (versions) of this resource are published in
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Release Format</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getAbstractResourceDescription_ReleaseFormat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseFormat' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceAndNotation> getReleaseFormat();

} // AbstractResourceDescription
