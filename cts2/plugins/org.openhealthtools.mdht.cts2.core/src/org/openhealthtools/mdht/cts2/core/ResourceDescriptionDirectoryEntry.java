/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Description Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">A</i>
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DirectoryEntry </i>that identifies the elements of a resource description that appear in every
 * directory of resources of a particular type. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceDescriptionDirectoryEntry </i>is an
 * abstract type and is realized in
 * the implementing subtypes listed in <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">CTS2ResourceType</i>
 * 
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getResourceSynopsis <em>Resource Synopsis</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getAbout <em>About</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getFormalName <em>Formal Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescriptionDirectoryEntry()
 * @model abstract="true"
 *        extendedMetaData="name='ResourceDescriptionDirectoryEntry' kind='elementOnly'"
 * @generated
 */
public interface ResourceDescriptionDirectoryEntry extends DirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Resource Synopsis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a textual summary of the resource - what it is, what it is for, etc.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource Synopsis</em>' containment reference.
	 * @see #setResourceSynopsis(EntryDescription)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescriptionDirectoryEntry_ResourceSynopsis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceSynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryDescription getResourceSynopsis();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getResourceSynopsis
	 * <em>Resource Synopsis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Resource Synopsis</em>' containment reference.
	 * @see #getResourceSynopsis()
	 * @generated
	 */
	void setResourceSynopsis(EntryDescription value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the (or a) definitive URI that represents the resource being described.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescriptionDirectoryEntry_About()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI" required="true"
	 *        extendedMetaData="kind='attribute' name='about'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getAbout <em>About</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>About</em>' attribute.
	 * @see #getAbout()
	 * @generated
	 */
	void setAbout(String value);

	/**
	 * Returns the value of the '<em><b>Formal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the formal or officially assigned name of this resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Formal Name</em>' attribute.
	 * @see #setFormalName(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescriptionDirectoryEntry_FormalName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='formalName'"
	 * @generated
	 */
	String getFormalName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescriptionDirectoryEntry#getFormalName <em>Formal Name</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Formal Name</em>' attribute.
	 * @see #getFormalName()
	 * @generated
	 */
	void setFormalName(String value);

} // ResourceDescriptionDirectoryEntry
