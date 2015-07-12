/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referral Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organisation.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getSpecialty <em>Specialty</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getRequester <em>Requester</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getDateSent <em>Date Sent</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getDescription <em>Description</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getServiceRequested <em>Service Requested</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getSupportingInformation <em>Supporting Information</em>}</li>
 *   <li>{@link org.hl7.fhir.ReferralRequest#getFulfillmentTime <em>Fulfillment Time</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getReferralRequest()
 * @model extendedMetaData="name='ReferralRequest' kind='elementOnly'"
 * @generated
 */
public interface ReferralRequest extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The workflow status of the referral or transfer of care request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(ReferralStatus)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferralStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ReferralStatus value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business Id that uniquely identifies the referral/care transfer request instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the type of referral (or where applicable the type of transfer of care) request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getType();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Specialty</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specialty</em>' containment reference.
	 * @see #setSpecialty(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Specialty()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='specialty' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getSpecialty();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getSpecialty <em>Specialty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialty</em>' containment reference.
	 * @see #getSpecialty()
	 * @generated
	 */
	void setSpecialty(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An indication of the urgency of referral (or where applicable the type of transfer of care) request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient who is the subject of a referral or transfer of care request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Requester</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare provider or provider organization who/which initaited the referral/transfer of care request. Can also be  Patient (a self referral).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requester</em>' containment reference.
	 * @see #setRequester(Reference)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Requester()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requester' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getRequester();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getRequester <em>Requester</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requester</em>' containment reference.
	 * @see #getRequester()
	 * @generated
	 */
	void setRequester(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Recipient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='recipient' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getRecipient();

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The encounter at which the request for referral or transfer of care is initiated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Date Sent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date/DateTime the request for referral or transfer of care is sent by the author.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date Sent</em>' containment reference.
	 * @see #setDateSent(DateTime)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_DateSent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dateSent' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getDateSent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getDateSent <em>Date Sent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Sent</em>' containment reference.
	 * @see #getDateSent()
	 * @generated
	 */
	void setDateSent(DateTime value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description of clinical condition indicating why referral/transfer of care is requested.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference.
	 * @see #setReason(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getReason();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getReason <em>Reason</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' containment reference.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reason gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getDescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Service Requested</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service(s) that is/are requested to be provided to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Requested</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_ServiceRequested()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceRequested' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getServiceRequested();

	/**
	 * Returns the value of the '<em><b>Supporting Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supporting Information</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_SupportingInformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='supportingInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getSupportingInformation();

	/**
	 * Returns the value of the '<em><b>Fulfillment Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period of time within which the services identified in the referral/transfer of care is specified or required to occur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fulfillment Time</em>' containment reference.
	 * @see #setFulfillmentTime(Period)
	 * @see org.hl7.fhir.FhirPackage#getReferralRequest_FulfillmentTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fulfillmentTime' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getFulfillmentTime();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.ReferralRequest#getFulfillmentTime <em>Fulfillment Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fulfillment Time</em>' containment reference.
	 * @see #getFulfillmentTime()
	 * @generated
	 */
	void setFulfillmentTime(Period value);

} // ReferralRequest
