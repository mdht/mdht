/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Reference Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a document.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getEvent <em>Event</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentReferenceContext#getRelated <em>Related</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext()
 * @model extendedMetaData="name='DocumentReference.Context' kind='elementOnly'"
 * @generated
 */
public interface DocumentReferenceContext extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the clinical encounter or type of care that the document content is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContext#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a "History and Physical Report" in which the procedure being documented is necessarily a "History and Physical" act.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Event</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_Event()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='event' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getEvent();

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time period over which the service that is described by the document was provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContext#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Facility Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of facility where the patient was seen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Facility Type</em>' containment reference.
	 * @see #setFacilityType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_FacilityType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='facilityType' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getFacilityType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContext#getFacilityType <em>Facility Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Type</em>' containment reference.
	 * @see #getFacilityType()
	 * @generated
	 */
	void setFacilityType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Practice Setting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property may convey specifics about the practice setting where the content was created, often reflecting the clinical specialty.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practice Setting</em>' containment reference.
	 * @see #setPracticeSetting(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_PracticeSetting()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='practiceSetting' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPracticeSetting();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContext#getPracticeSetting <em>Practice Setting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practice Setting</em>' containment reference.
	 * @see #getPracticeSetting()
	 * @generated
	 */
	void setPracticeSetting(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Source Patient Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Patient Information as known when the document was published. May be a reference to a version specific, or contained.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Patient Info</em>' containment reference.
	 * @see #setSourcePatientInfo(Reference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_SourcePatientInfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sourcePatientInfo' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSourcePatientInfo();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentReferenceContext#getSourcePatientInfo <em>Source Patient Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Patient Info</em>' containment reference.
	 * @see #getSourcePatientInfo()
	 * @generated
	 */
	void setSourcePatientInfo(Reference value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.DocumentReferenceRelated}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Related identifiers or resources associated with the DocumentReference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentReferenceContext_Related()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='related' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DocumentReferenceRelated> getRelated();

} // DocumentReferenceContext
