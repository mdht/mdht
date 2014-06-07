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
 * A representation of the model object '<em><b>Resource Description</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <!-- begin-model-doc -->
 * 
 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceDescription </i>represents the shared characteristics common to both abstract and
 * resource version descriptions. <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">ResourceDescription </i>is an abstract type and, as such, cannot
 * be directly
 * created. Resource descriptions are <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Changeable</i>, meaning that they have identity and can be
 * created, updated and deleted.
 * <!-- end-model-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getKeyword <em>Keyword</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceType <em>Resource Type</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceSynopsis <em>Resource Synopsis</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAdditionalDocumentation <em>Additional Documentation</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceAndRole <em>Source And Role</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getRights <em>Rights</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getNote <em>Note</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getProperty <em>Property</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAlternateID <em>Alternate ID</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceStatements <em>Source Statements</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAbout <em>About</em>}</li>
 * <li>{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getFormalName <em>Formal Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription()
 * @model abstract="true"
 *        extendedMetaData="name='ResourceDescription' kind='elementOnly'"
 * @generated
 */
public interface ResourceDescription extends Changeable {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * additional identifiers that are used to index and locatethe resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Keyword</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_Keyword()
	 * @model unique="false" dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getKeyword();

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.URIAndEntityName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the class(es) that this resource instantiates
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Resource Type</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_ResourceType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceType' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<URIAndEntityName> getResourceType();

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
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_ResourceSynopsis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resourceSynopsis' namespace='##targetNamespace'"
	 * @generated
	 */
	EntryDescription getResourceSynopsis();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getResourceSynopsis <em>Resource Synopsis</em>}'
	 * containment reference.
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
	 * Returns the value of the '<em><b>Additional Documentation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to a document thatprovide additional information about the resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Additional Documentation</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_AdditionalDocumentation()
	 * @model unique="false" dataType="org.openhealthtools.mdht.cts2.core.PersistentURI"
	 *        extendedMetaData="kind='element' name='additionalDocumentation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAdditionalDocumentation();

	/**
	 * Returns the value of the '<em><b>Source And Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.SourceAndRoleReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a reference to an individual, organization of bibliographic reference that participated in the creation, validation, review, dissemination of
	 * this resource and therole(s) they
	 * played
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source And Role</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_SourceAndRole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourceAndRole' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SourceAndRoleReference> getSourceAndRole();

	/**
	 * Returns the value of the '<em><b>Rights</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * copyright and IP information. Note that <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">rights</i> applies to the source resource, not the
	 * CTS<sub xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">2</sub> rendering.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Rights</em>' containment reference.
	 * @see #setRights(OpaqueData)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_Rights()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rights' namespace='##targetNamespace'"
	 * @generated
	 */
	OpaqueData getRights();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getRights <em>Rights</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Rights</em>' containment reference.
	 * @see #getRights()
	 * @generated
	 */
	void setRights(OpaqueData value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Comment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an additional note or comment about the resource
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Note</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_Note()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='note' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Comment> getNote();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.openhealthtools.mdht.cts2.core.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * additional information about the resource that doesnot fit into any of the attributes described above
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_Property()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Property> getProperty();

	/**
	 * Returns the value of the '<em><b>Alternate ID</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * an alternative identifier that uniquely names this resource in other environments as contexts. As an example, if a resource had both an ISO
	 * Object Identifier and a DNS name, the DNS name might
	 * be assigned as the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">entryID</i> of the resource by one service while the ISO OID would be
	 * recorded as an <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">alternateURI </i>using the "urn:oid" prefix. Note that <i
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">alternateId</i>s can be added or removed
	 * during resource updates.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Alternate ID</em>' attribute list.
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_AlternateID()
	 * @model unique="false" dataType="org.openhealthtools.mdht.cts2.core.ExternalURI"
	 *        extendedMetaData="kind='element' name='alternateID' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getAlternateID();

	/**
	 * Returns the value of the '<em><b>Source Statements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">DirectoryURI</i> that references the set of statements that were used to construct the
	 * containing resource. This attribute must (may?) be present if and only if the service supports the
	 * <b xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">Statement</b> profile
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Source Statements</em>' attribute.
	 * @see #setSourceStatements(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_SourceStatements()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.StatementDirectoryURI"
	 *        extendedMetaData="kind='element' name='sourceStatements' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceStatements();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getSourceStatements <em>Source Statements</em>}'
	 * attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Statements</em>' attribute.
	 * @see #getSourceStatements()
	 * @generated
	 */
	void setSourceStatements(String value);

	/**
	 * Returns the value of the '<em><b>About</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the (or a) definitive URI that represents the resource being described. Note that this is NOT the URI of the resource description in the CTS2
	 * format, but of the resource itself. As an example, the
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">about </i>URI for the Wine ontology would be
	 * "http://www.w3.org/TR/2003/PR-owl-guide-20031209/wine#". The <a href="//http://ncit.nci.nih.gov/ncitbrowser/"
	 * xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">NCI Thesaurus</a> has, amongst others, the
	 * <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">about </i>URI of http://ncicb.nci.nih.gov/xml/owl/EVS/Thesaurus.owl#. HL7 uses ISO Object
	 * Identifiers (OIDs) to label resources so, from the HL7 perspective, the <i xmlns="http://schema.omg.org/spec/CTS2/1.0/Core">about</i> URI of
	 * the NCI Thesaurus would
	 * be "urn:oid:2.16.840.1.113883.3.26.1.1"
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>About</em>' attribute.
	 * @see #setAbout(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_About()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.ExternalURI" required="true"
	 *        extendedMetaData="kind='attribute' name='about'"
	 * @generated
	 */
	String getAbout();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getAbout <em>About</em>}' attribute.
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
	 * the formal or officially assigned name of this resource, if any
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Formal Name</em>' attribute.
	 * @see #setFormalName(String)
	 * @see org.openhealthtools.mdht.cts2.core.CorePackage#getResourceDescription_FormalName()
	 * @model dataType="org.openhealthtools.mdht.cts2.core.String"
	 *        extendedMetaData="kind='attribute' name='formalName'"
	 * @generated
	 */
	String getFormalName();

	/**
	 * Sets the value of the '{@link org.openhealthtools.mdht.cts2.core.ResourceDescription#getFormalName <em>Formal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Formal Name</em>' attribute.
	 * @see #getFormalName()
	 * @generated
	 */
	void setFormalName(String value);

} // ResourceDescription
