/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Composition#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getDate <em>Date</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getTitle <em>Title</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getAttester <em>Attester</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getCustodian <em>Custodian</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.Composition#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getComposition()
 * @model extendedMetaData="name='Composition' kind='elementOnly'"
 * @generated
 */
public interface Composition extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Logical Identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The composition editing time, when the composition was last logically changed by the author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Date()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Type()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getType <em>Type</em>}' containment reference.
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
	 * A categorization for the type of the composition. This may be implied by or derived from the code specified in the Composition Type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official human-readable label for the composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Title()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getTitle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(CompositionStatus)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	CompositionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CompositionStatus value);

	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The code specifying the level of confidentiality of the Composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality</em>' containment reference.
	 * @see #setConfidentiality(Code)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Confidentiality()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confidentiality' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getConfidentiality();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getConfidentiality <em>Confidentiality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' containment reference.
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(Code value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (I.e. machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Subject()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies who is responsible for the information in the composition.  (Not necessarily who typed it in.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getComposition_Author()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getAuthor();

	/**
	 * Returns the value of the '<em><b>Attester</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CompositionAttester}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A participant who has attested to the accuracy of the composition/document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attester</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getComposition_Attester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attester' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositionAttester> getAttester();

	/**
	 * Returns the value of the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custodian</em>' containment reference.
	 * @see #setCustodian(Reference)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Custodian()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custodian' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getCustodian();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getCustodian <em>Custodian</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custodian</em>' containment reference.
	 * @see #getCustodian()
	 * @generated
	 */
	void setCustodian(Reference value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CompositionEvent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The clinical service, such as a colonoscopy or an appendectomy, being documented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getComposition_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositionEvent> getEvent();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the clinical encounter or type of care this documentation is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getComposition_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Composition#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Section</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CompositionSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the sections that make up the composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Section</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getComposition_Section()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='section' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CompositionSection> getSection();

} // Composition
