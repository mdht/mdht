/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity Synopsis</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * The URI, local namespace and name and optional designation of an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntityDescription</i>. <i
 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">EntitySynopsis</i> represents entities when they are referenced from the context of a single code
 * system, such as
 * the resolution of value sets and association graphs.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.EntitySynopsis#getDesignation <em>Designation</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntitySynopsis()
 * @model extendedMetaData="name='EntitySynopsis' kind='elementOnly'"
 * @generated
 */
public interface EntitySynopsis extends URIAndEntityName {
	/**
	 * Returns the value of the '<em><b>Designation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a designation considered appropriate for the entity in the specific context of use
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Designation</em>' attribute.
	 * @see #setDesignation(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getEntitySynopsis_Designation()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='designation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDesignation();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.EntitySynopsis#getDesignation <em>Designation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Designation</em>' attribute.
	 * @see #getDesignation()
	 * @generated
	 */
	void setDesignation(String value);

} // EntitySynopsis
