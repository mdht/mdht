/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.cts2.core;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Version Description Directory Entry</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * A summary of a resource version.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialResourceVersionId <em>Official Resource Version
 * Id</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialReleaseDate <em>Official Release Date</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getDocumentURI <em>Document URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescriptionDirectoryEntry()
 * @model extendedMetaData="name='ResourceVersionDescriptionDirectoryEntry' kind='elementOnly'"
 * @generated
 */
public interface ResourceVersionDescriptionDirectoryEntry extends ResourceDescriptionDirectoryEntry {
	/**
	 * Returns the value of the '<em><b>Official Resource Version Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a label or identifier that was assigned to this version by its publisher
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Resource Version Id</em>' attribute.
	 * @see #setOfficialResourceVersionId(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescriptionDirectoryEntry_OfficialResourceVersionId()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='officialResourceVersionId' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOfficialResourceVersionId();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialResourceVersionId
	 * <em>Official Resource Version Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Resource Version Id</em>' attribute.
	 * @see #getOfficialResourceVersionId()
	 * @generated
	 */
	void setOfficialResourceVersionId(String value);

	/**
	 * Returns the value of the '<em><b>Official Release Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * information about the source, format, release date, version identifier, etc. of a specific version of an abstract resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Official Release Date</em>' attribute.
	 * @see #setOfficialReleaseDate(XMLGregorianCalendar)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescriptionDirectoryEntry_OfficialReleaseDate()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DateAndTime"
	 *        extendedMetaData="kind='element' name='officialReleaseDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getOfficialReleaseDate();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getOfficialReleaseDate
	 * <em>Official Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Official Release Date</em>' attribute.
	 * @see #getOfficialReleaseDate()
	 * @generated
	 */
	void setOfficialReleaseDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Document URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a URI that identifies the specific version, language and notation of the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">about</i> resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Document URI</em>' attribute.
	 * @see #setDocumentURI(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceVersionDescriptionDirectoryEntry_DocumentURI()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.DocumentURI" required="true"
	 *        extendedMetaData="kind='attribute' name='documentURI'"
	 * @generated
	 */
	String getDocumentURI();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceVersionDescriptionDirectoryEntry#getDocumentURI <em>Document URI</em>}
	 * ' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Document URI</em>' attribute.
	 * @see #getDocumentURI()
	 * @generated
	 */
	void setDocumentURI(String value);

} // ResourceVersionDescriptionDirectoryEntry
