/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Manifest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A manifest that defines a set of documents.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentManifest#getRelated <em>Related</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentManifest()
 * @model extendedMetaData="name='DocumentManifest' kind='elementOnly'"
 * @generated
 */
public interface DocumentManifest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Master Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single identifier that uniquely identifies this manifest. Principally used to refer to the manifest in non-FHIR contexts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master Identifier</em>' containment reference.
	 * @see #setMasterIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_MasterIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='masterIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getMasterIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getMasterIdentifier <em>Master Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Master Identifier</em>' containment reference.
	 * @see #getMasterIdentifier()
	 * @generated
	 */
	void setMasterIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Other identifiers associated with the document manifest, including version independent  identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what the set of documents is about. The documents can be about a person, (patient or healthcare practitioner), a device (i.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure). If the documents cross more than one subject, then more than one subject is allowed here (unusual use case).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient, practitioner, or organization for which this set of documents is intended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the kind of this set of documents (e.g. Patient Summary, Discharge Summary, Prescription, etc.). The type of a set of documents may be the same as one of the documents in it - especially if there is only one - but it may be wider.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is responsible for adding the information to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the document manifest was created for submission to the server (not necessarily the same thing as the actual resource last modified time, since it may be modified, replicated etc).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the source system, application, or software that produced the document manifest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Uri)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Uri value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this document manifest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(DocumentReferenceStatus)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReferenceStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DocumentReferenceStatus value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of the source document. This is sometimes known as the "title".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentManifest#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DocumentManifestContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The manifest list.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentManifestContent> getContent();

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DocumentManifestRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related identifiers or resources associated with the DocumentManifest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentManifest_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentManifestRelated> getRelated();

} // DocumentManifest
