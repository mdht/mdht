/**
 */
package org.hl7.fhir;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encounter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Encounter#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getStatusHistory <em>Status History</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getType <em>Type</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getIncomingReferral <em>Incoming Referral</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getParticipant <em>Participant</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getLength <em>Length</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getReason <em>Reason</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getIndication <em>Indication</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getHospitalization <em>Hospitalization</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getServiceProvider <em>Service Provider</em>}</li>
 *   <li>{@link org.hl7.fhir.Encounter#getPartOf <em>Part Of</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getEncounter()
 * @model extendedMetaData="name='Encounter' kind='elementOnly'"
 * @generated
 */
public interface Encounter extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier(s) by which this encounter is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * planned | arrived | in-progress | onleave | finished | cancelled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(EncounterState)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterState getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(EncounterState value);

	/**
	 * Returns the value of the '<em><b>Status History</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterStatusHistory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current status is always found in the current version of the resource. This status history permits the encounter resource to contain the status history without the needing to read through the historical versions of the resource, or even have the server store them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status History</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_StatusHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='statusHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterStatusHistory> getStatusHistory();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * inpatient | outpatient | ambulatory | emergency +.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' containment reference.
	 * @see #setClass(EncounterClass)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Class()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterClass getClass_();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getClass_ <em>Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' containment reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EncounterClass value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getType();

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The patient present at the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Patient()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Reference value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as govt reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_EpisodeOfCare()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='episodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getEpisodeOfCare();

	/**
	 * Returns the value of the '<em><b>Incoming Referral</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The referral request that this encounter satisfies (incoming referral).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Referral</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_IncomingReferral()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='incomingReferral' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIncomingReferral();

	/**
	 * Returns the value of the '<em><b>Participant</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterParticipant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of people responsible for providing the service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Participant</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Participant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='participant' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterParticipant> getParticipant();

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The appointment that scheduled this encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Appointment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Reference value);

	/**
	 * Returns the value of the '<em><b>Period</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start and end time of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period</em>' containment reference.
	 * @see #setPeriod(Period)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Period()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='period' namespace='##targetNamespace'"
	 * @generated
	 */
	Period getPeriod();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPeriod <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' containment reference.
	 * @see #getPeriod()
	 * @generated
	 */
	void setPeriod(Period value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' containment reference.
	 * @see #setLength(Duration)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Length()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='length' namespace='##targetNamespace'"
	 * @generated
	 */
	Duration getLength();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getLength <em>Length</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' containment reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(Duration value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableConcept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reason</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Reason()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reason' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableConcept> getReason();

	/**
	 * Returns the value of the '<em><b>Indication</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Indication</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Indication()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='indication' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getIndication();

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the urgency of the encounter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Priority</em>' containment reference.
	 * @see #setPriority(CodeableConcept)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Priority()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='priority' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeableConcept getPriority();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPriority <em>Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' containment reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(CodeableConcept value);

	/**
	 * Returns the value of the '<em><b>Hospitalization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details about an admission to a clinic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hospitalization</em>' containment reference.
	 * @see #setHospitalization(EncounterHospitalization)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Hospitalization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='hospitalization' namespace='##targetNamespace'"
	 * @generated
	 */
	EncounterHospitalization getHospitalization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getHospitalization <em>Hospitalization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hospitalization</em>' containment reference.
	 * @see #getHospitalization()
	 * @generated
	 */
	void setHospitalization(EncounterHospitalization value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.EncounterLocation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of locations at which the patient has been.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see org.hl7.fhir.FhirPackage#getEncounter_Location()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='location' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EncounterLocation> getLocation();

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An organization that is in charge of maintaining the information of this Encounter (e.g., who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Provider</em>' containment reference.
	 * @see #setServiceProvider(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_ServiceProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceProvider' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getServiceProvider();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getServiceProvider <em>Service Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' containment reference.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(Reference value);

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Another Encounter of which this encounter is a part of (administratively or in time).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference.
	 * @see #setPartOf(Reference)
	 * @see org.hl7.fhir.FhirPackage#getEncounter_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPartOf();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Encounter#getPartOf <em>Part Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Of</em>' containment reference.
	 * @see #getPartOf()
	 * @generated
	 */
	void setPartOf(Reference value);

} // Encounter
