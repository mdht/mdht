/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentReference#getMasterIdentifier <em>Master Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getFormat <em>Format</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getAuthenticator <em>Authenticator</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getCreated <em>Created</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getIndexed <em>Indexed</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getDocStatus <em>Doc Status</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getRelatesTo <em>Relates To</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getContent <em>Content</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReference#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReference()
 * @model extendedMetaData="name='DocumentReference' kind='elementOnly'"
 * @generated
 */
public interface DocumentReference extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Master Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Document identifier as assigned by the source of the document. This identifier is specific to this version of the document. This unique identifier may be used elsewhere to identify this version of the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Master Identifier</em>' containment reference.
	 * @see #setMasterIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_MasterIdentifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='masterIdentifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getMasterIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getMasterIdentifier <em>Master Identifier</em>}' containment reference.
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
	 * Other identifiers associated with the document, including version independent identifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Identifier()
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
	 * Who or what the document is about. The document can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of farm animals, or a set of patients that share a common exposure).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the particular kind of document. This usually equates to the purpose of making the document. It is recommended that the value Set be drawn from a coding scheme providing a fine level of granularity such as LOINC.  (e.g. Patient Summary, Discharge Summary, Prescription, etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A categorization for the type of document - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Uri}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier of the document encoding, structure, and template that the document conforms to beyond the base format indicated in the mimeType.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Format</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Format()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='format' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Uri> getFormat();

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is responsible for adding the information to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the organization or group who is responsible for ongoing maintenance of and access to the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custodian</em>' containment reference.
	 * @see #setCustodian(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Custodian()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custodian' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCustodian();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getCustodian <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' containment reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Reference value);

	/**
	 * Returns the value of the '<em><b>Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which person or organization authenticates that this document is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authenticator</em>' containment reference.
	 * @see #setAuthenticator(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Authenticator()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authenticator' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthenticator();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getAuthenticator <em>Authenticator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authenticator</em>' containment reference.
	 * @see #getAuthenticator()
	 * @generated
	 */
	void setAuthenticator(Reference value);

	/**
	 * Returns the value of the '<em><b>Created</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the document was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Created</em>' containment reference.
	 * @see #setCreated(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Created()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='created' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getCreated();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getCreated <em>Created</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created</em>' containment reference.
	 * @see #getCreated()
	 * @generated
	 */
	void setCreated(DateTime value);

	/**
	 * Returns the value of the '<em><b>Indexed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the document reference was created.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indexed</em>' containment reference.
	 * @see #setIndexed(Instant)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Indexed()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='indexed' namespace='##targetNamespace'"
	 * @generated
	 */
	Instant getIndexed();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getIndexed <em>Indexed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexed</em>' containment reference.
	 * @see #getIndexed()
	 * @generated
	 */
	void setIndexed(Instant value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of this document reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Code)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Code value);

	/**
	 * Returns the value of the '<em><b>Doc Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The status of the underlying document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Doc Status</em>' containment reference.
	 * @see #setDocStatus(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_DocStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='docStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getDocStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getDocStatus <em>Doc Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doc Status</em>' containment reference.
	 * @see #getDocStatus()
	 * @generated
	 */
	void setDocStatus(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Relates To</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DocumentReferenceRelatesTo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relationships that this document has with other document references that already exist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relates To</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_RelatesTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='relatesTo' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceRelatesTo> getRelatesTo();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human-readable description of the source document. This is sometimes known as the "title".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of Security-Tag codes specifying the level of privacy/security of the Document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getConfidentiality();

	/**
	 * Returns the value of the '<em><b>Content</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Attachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The document or url to the document along with critical metadata to prove content has integrity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Content</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Content()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='content' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attachment> getContent();

	/**
	 * Returns the value of the '<em><b>Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical context in which the document was prepared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' containment reference.
	 * @see #setContext(DocumentReferenceContext)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReference_Context()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='context' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReferenceContext getContext();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReference#getContext <em>Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' containment reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(DocumentReferenceContext value);

} // DocumentReference
