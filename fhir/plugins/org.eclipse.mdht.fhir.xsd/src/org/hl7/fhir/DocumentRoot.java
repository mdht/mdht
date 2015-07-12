/**
 */
package org.hl7.fhir;

import java.lang.String;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceComponent <em>Device Component</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceUseRequest <em>Device Use Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDiagnosticOrder <em>Diagnostic Order</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEligibilityRequest <em>Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEligibilityResponse <em>Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImagingObjectSelection <em>Imaging Object Selection</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationPrescription <em>Medication Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOrderResponse <em>Order Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProcedureRequest <em>Procedure Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProcessRequest <em>Process Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProcessResponse <em>Process Response</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getQuestionnaireAnswers <em>Questionnaire Answers</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.DocumentRoot#getVisionPrescription <em>Vision Prescription</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FhirPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Allergy Intolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #setAllergyIntolerance(AllergyIntolerance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AllergyIntolerance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AllergyIntolerance' namespace='##targetNamespace'"
	 * @generated
	 */
	AllergyIntolerance getAllergyIntolerance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAllergyIntolerance <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allergy Intolerance</em>' containment reference.
	 * @see #getAllergyIntolerance()
	 * @generated
	 */
	void setAllergyIntolerance(AllergyIntolerance value);

	/**
	 * Returns the value of the '<em><b>Appointment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment</em>' containment reference.
	 * @see #setAppointment(Appointment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Appointment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Appointment' namespace='##targetNamespace'"
	 * @generated
	 */
	Appointment getAppointment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAppointment <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment</em>' containment reference.
	 * @see #getAppointment()
	 * @generated
	 */
	void setAppointment(Appointment value);

	/**
	 * Returns the value of the '<em><b>Appointment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Appointment Response</em>' containment reference.
	 * @see #setAppointmentResponse(AppointmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AppointmentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AppointmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	AppointmentResponse getAppointmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAppointmentResponse <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Appointment Response</em>' containment reference.
	 * @see #getAppointmentResponse()
	 * @generated
	 */
	void setAppointmentResponse(AppointmentResponse value);

	/**
	 * Returns the value of the '<em><b>Audit Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Audit Event</em>' containment reference.
	 * @see #setAuditEvent(AuditEvent)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_AuditEvent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AuditEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	AuditEvent getAuditEvent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getAuditEvent <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audit Event</em>' containment reference.
	 * @see #getAuditEvent()
	 * @generated
	 */
	void setAuditEvent(AuditEvent value);

	/**
	 * Returns the value of the '<em><b>Basic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic</em>' containment reference.
	 * @see #setBasic(Basic)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Basic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Basic' namespace='##targetNamespace'"
	 * @generated
	 */
	Basic getBasic();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBasic <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic</em>' containment reference.
	 * @see #getBasic()
	 * @generated
	 */
	void setBasic(Basic value);

	/**
	 * Returns the value of the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binary</em>' containment reference.
	 * @see #setBinary(Binary)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Binary()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Binary' namespace='##targetNamespace'"
	 * @generated
	 */
	Binary getBinary();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBinary <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary</em>' containment reference.
	 * @see #getBinary()
	 * @generated
	 */
	void setBinary(Binary value);

	/**
	 * Returns the value of the '<em><b>Body Site</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Site</em>' containment reference.
	 * @see #setBodySite(BodySite)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_BodySite()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BodySite' namespace='##targetNamespace'"
	 * @generated
	 */
	BodySite getBodySite();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBodySite <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Site</em>' containment reference.
	 * @see #getBodySite()
	 * @generated
	 */
	void setBodySite(BodySite value);

	/**
	 * Returns the value of the '<em><b>Bundle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for a collection of resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bundle</em>' containment reference.
	 * @see #setBundle(Bundle)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Bundle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Bundle' namespace='##targetNamespace'"
	 * @generated
	 */
	Bundle getBundle();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getBundle <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bundle</em>' containment reference.
	 * @see #getBundle()
	 * @generated
	 */
	void setBundle(Bundle value);

	/**
	 * Returns the value of the '<em><b>Care Plan</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient for a period of time, possibly limited to care for a specific condition or set of conditions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Care Plan</em>' containment reference.
	 * @see #setCarePlan(CarePlan)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CarePlan()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CarePlan' namespace='##targetNamespace'"
	 * @generated
	 */
	CarePlan getCarePlan();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCarePlan <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Plan</em>' containment reference.
	 * @see #getCarePlan()
	 * @generated
	 */
	void setCarePlan(CarePlan value);

	/**
	 * Returns the value of the '<em><b>Claim</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim</em>' containment reference.
	 * @see #setClaim(Claim)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Claim()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Claim' namespace='##targetNamespace'"
	 * @generated
	 */
	Claim getClaim();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClaim <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim</em>' containment reference.
	 * @see #getClaim()
	 * @generated
	 */
	void setClaim(Claim value);

	/**
	 * Returns the value of the '<em><b>Claim Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the adjudication details from the processing of a Claim resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Claim Response</em>' containment reference.
	 * @see #setClaimResponse(ClaimResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ClaimResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClaimResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimResponse getClaimResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClaimResponse <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Response</em>' containment reference.
	 * @see #getClaimResponse()
	 * @generated
	 */
	void setClaimResponse(ClaimResponse value);

	/**
	 * Returns the value of the '<em><b>Clinical Impression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #setClinicalImpression(ClinicalImpression)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ClinicalImpression()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ClinicalImpression' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalImpression getClinicalImpression();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getClinicalImpression <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Impression</em>' containment reference.
	 * @see #getClinicalImpression()
	 * @generated
	 */
	void setClinicalImpression(ClinicalImpression value);

	/**
	 * Returns the value of the '<em><b>Communication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An occurrence of information being transmitted. E.g., an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication</em>' containment reference.
	 * @see #setCommunication(Communication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Communication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Communication' namespace='##targetNamespace'"
	 * @generated
	 */
	Communication getCommunication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCommunication <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication</em>' containment reference.
	 * @see #getCommunication()
	 * @generated
	 */
	void setCommunication(Communication value);

	/**
	 * Returns the value of the '<em><b>Communication Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to convey information. E.g., the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Request</em>' containment reference.
	 * @see #setCommunicationRequest(CommunicationRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_CommunicationRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CommunicationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationRequest getCommunicationRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCommunicationRequest <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Request</em>' containment reference.
	 * @see #getCommunicationRequest()
	 * @generated
	 */
	void setCommunicationRequest(CommunicationRequest value);

	/**
	 * Returns the value of the '<em><b>Composition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Composition</em>' containment reference.
	 * @see #setComposition(Composition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Composition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Composition' namespace='##targetNamespace'"
	 * @generated
	 */
	Composition getComposition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getComposition <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composition</em>' containment reference.
	 * @see #getComposition()
	 * @generated
	 */
	void setComposition(Composition value);

	/**
	 * Returns the value of the '<em><b>Concept Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Concept Map</em>' containment reference.
	 * @see #setConceptMap(ConceptMap)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ConceptMap()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ConceptMap' namespace='##targetNamespace'"
	 * @generated
	 */
	ConceptMap getConceptMap();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getConceptMap <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept Map</em>' containment reference.
	 * @see #getConceptMap()
	 * @generated
	 */
	void setConceptMap(ConceptMap value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a Diagnosis during an Encounter; populating a problem List or a Summary Statement, such as a Discharge Summary.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Condition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conformance</em>' containment reference.
	 * @see #setConformance(Conformance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Conformance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Conformance' namespace='##targetNamespace'"
	 * @generated
	 */
	Conformance getConformance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getConformance <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' containment reference.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Conformance value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference.
	 * @see #setContract(Contract)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Contract()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contract' namespace='##targetNamespace'"
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getContract <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' containment reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

	/**
	 * Returns the value of the '<em><b>Contraindication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient.  E.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contraindication</em>' containment reference.
	 * @see #setContraindication(Contraindication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Contraindication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Contraindication' namespace='##targetNamespace'"
	 * @generated
	 */
	Contraindication getContraindication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getContraindication <em>Contraindication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contraindication</em>' containment reference.
	 * @see #getContraindication()
	 * @generated
	 */
	void setContraindication(Contraindication value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Financial instrument which may be used to pay for or reimburse for health care products and services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' containment reference.
	 * @see #setCoverage(Coverage)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Coverage()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Coverage' namespace='##targetNamespace'"
	 * @generated
	 */
	Coverage getCoverage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getCoverage <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' containment reference.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(Coverage value);

	/**
	 * Returns the value of the '<em><b>Data Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The formal description of a single piece of information that can be gathered and reported.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Element</em>' containment reference.
	 * @see #setDataElement(DataElement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DataElement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DataElement' namespace='##targetNamespace'"
	 * @generated
	 */
	DataElement getDataElement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDataElement <em>Data Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Element</em>' containment reference.
	 * @see #getDataElement()
	 * @generated
	 */
	void setDataElement(DataElement value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource identifies an instance of a manufactured thing that is used in the provision of healthcare without being substantially changed through that activity. The device may be a machine, an insert, a computer, an application, etc. This includes durable (reusable) medical equipment as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' containment reference.
	 * @see #setDevice(Device)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Device()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Device' namespace='##targetNamespace'"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDevice <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' containment reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Device Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Component</em>' containment reference.
	 * @see #setDeviceComponent(DeviceComponent)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceComponent getDeviceComponent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceComponent <em>Device Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Component</em>' containment reference.
	 * @see #getDeviceComponent()
	 * @generated
	 */
	void setDeviceComponent(DeviceComponent value);

	/**
	 * Returns the value of the '<em><b>Device Metric</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes a measurement, calculation or setting capability of a medical device.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Metric</em>' containment reference.
	 * @see #setDeviceMetric(DeviceMetric)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceMetric()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceMetric' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceMetric getDeviceMetric();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceMetric <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Metric</em>' containment reference.
	 * @see #getDeviceMetric()
	 * @generated
	 */
	void setDeviceMetric(DeviceMetric value);

	/**
	 * Returns the value of the '<em><b>Device Use Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Use Request</em>' containment reference.
	 * @see #setDeviceUseRequest(DeviceUseRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceUseRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceUseRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseRequest getDeviceUseRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceUseRequest <em>Device Use Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Use Request</em>' containment reference.
	 * @see #getDeviceUseRequest()
	 * @generated
	 */
	void setDeviceUseRequest(DeviceUseRequest value);

	/**
	 * Returns the value of the '<em><b>Device Use Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #setDeviceUseStatement(DeviceUseStatement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DeviceUseStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DeviceUseStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	DeviceUseStatement getDeviceUseStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDeviceUseStatement <em>Device Use Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Use Statement</em>' containment reference.
	 * @see #getDeviceUseStatement()
	 * @generated
	 */
	void setDeviceUseStatement(DeviceUseStatement value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of a request for a diagnostic investigation service to be performed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Order</em>' containment reference.
	 * @see #setDiagnosticOrder(DiagnosticOrder)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DiagnosticOrder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagnosticOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticOrder getDiagnosticOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDiagnosticOrder <em>Diagnostic Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Order</em>' containment reference.
	 * @see #getDiagnosticOrder()
	 * @generated
	 */
	void setDiagnosticOrder(DiagnosticOrder value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretation, and formatted representation of diagnostic reports.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #setDiagnosticReport(DiagnosticReport)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DiagnosticReport()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DiagnosticReport' namespace='##targetNamespace'"
	 * @generated
	 */
	DiagnosticReport getDiagnosticReport();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDiagnosticReport <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Report</em>' containment reference.
	 * @see #getDiagnosticReport()
	 * @generated
	 */
	void setDiagnosticReport(DiagnosticReport value);

	/**
	 * Returns the value of the '<em><b>Document Manifest</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A manifest that defines a set of documents.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Manifest</em>' containment reference.
	 * @see #setDocumentManifest(DocumentManifest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DocumentManifest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentManifest' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentManifest getDocumentManifest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDocumentManifest <em>Document Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Manifest</em>' containment reference.
	 * @see #getDocumentManifest()
	 * @generated
	 */
	void setDocumentManifest(DocumentManifest value);

	/**
	 * Returns the value of the '<em><b>Document Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Document Reference</em>' containment reference.
	 * @see #setDocumentReference(DocumentReference)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_DocumentReference()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentReference' namespace='##targetNamespace'"
	 * @generated
	 */
	DocumentReference getDocumentReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getDocumentReference <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Reference</em>' containment reference.
	 * @see #getDocumentReference()
	 * @generated
	 */
	void setDocumentReference(DocumentReference value);

	/**
	 * Returns the value of the '<em><b>Eligibility Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility Request</em>' containment reference.
	 * @see #setEligibilityRequest(EligibilityRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EligibilityRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EligibilityRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityRequest getEligibilityRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEligibilityRequest <em>Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Request</em>' containment reference.
	 * @see #getEligibilityRequest()
	 * @generated
	 */
	void setEligibilityRequest(EligibilityRequest value);

	/**
	 * Returns the value of the '<em><b>Eligibility Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eligibility Response</em>' containment reference.
	 * @see #setEligibilityResponse(EligibilityResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EligibilityResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EligibilityResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EligibilityResponse getEligibilityResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEligibilityResponse <em>Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eligibility Response</em>' containment reference.
	 * @see #getEligibilityResponse()
	 * @generated
	 */
	void setEligibilityResponse(EligibilityResponse value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Encounter)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Encounter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Encounter getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Encounter value);

	/**
	 * Returns the value of the '<em><b>Enrollment Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the insurance Enrollment details to the insurer regarding a specified coverage.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #setEnrollmentRequest(EnrollmentRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EnrollmentRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnrollmentRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentRequest getEnrollmentRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEnrollmentRequest <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Request</em>' containment reference.
	 * @see #getEnrollmentRequest()
	 * @generated
	 */
	void setEnrollmentRequest(EnrollmentRequest value);

	/**
	 * Returns the value of the '<em><b>Enrollment Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides Enrollment and plan details from the processing of an Enrollment resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #setEnrollmentResponse(EnrollmentResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EnrollmentResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EnrollmentResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	EnrollmentResponse getEnrollmentResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEnrollmentResponse <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enrollment Response</em>' containment reference.
	 * @see #getEnrollmentResponse()
	 * @generated
	 */
	void setEnrollmentResponse(EnrollmentResponse value);

	/**
	 * Returns the value of the '<em><b>Episode Of Care</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #setEpisodeOfCare(EpisodeOfCare)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_EpisodeOfCare()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='EpisodeOfCare' namespace='##targetNamespace'"
	 * @generated
	 */
	EpisodeOfCare getEpisodeOfCare();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getEpisodeOfCare <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode Of Care</em>' containment reference.
	 * @see #getEpisodeOfCare()
	 * @generated
	 */
	void setEpisodeOfCare(EpisodeOfCare value);

	/**
	 * Returns the value of the '<em><b>Explanation Of Benefit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #setExplanationOfBenefit(ExplanationOfBenefit)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ExplanationOfBenefit()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExplanationOfBenefit' namespace='##targetNamespace'"
	 * @generated
	 */
	ExplanationOfBenefit getExplanationOfBenefit();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getExplanationOfBenefit <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explanation Of Benefit</em>' containment reference.
	 * @see #getExplanationOfBenefit()
	 * @generated
	 */
	void setExplanationOfBenefit(ExplanationOfBenefit value);

	/**
	 * Returns the value of the '<em><b>Family Member History</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family Member History</em>' containment reference.
	 * @see #setFamilyMemberHistory(FamilyMemberHistory)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_FamilyMemberHistory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='FamilyMemberHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	FamilyMemberHistory getFamilyMemberHistory();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getFamilyMemberHistory <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family Member History</em>' containment reference.
	 * @see #getFamilyMemberHistory()
	 * @generated
	 */
	void setFamilyMemberHistory(FamilyMemberHistory value);

	/**
	 * Returns the value of the '<em><b>Flag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prospective warnings of potential issues when providing care to the patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flag</em>' containment reference.
	 * @see #setFlag(Flag)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Flag()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Flag' namespace='##targetNamespace'"
	 * @generated
	 */
	Flag getFlag();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getFlag <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flag</em>' containment reference.
	 * @see #getFlag()
	 * @generated
	 */
	void setFlag(Flag value);

	/**
	 * Returns the value of the '<em><b>Goal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the intended objective(s) of patient care, for example, weight loss, restoring an activity of daily living, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Goal</em>' containment reference.
	 * @see #setGoal(Goal)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Goal()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Goal' namespace='##targetNamespace'"
	 * @generated
	 */
	Goal getGoal();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGoal <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' containment reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(Goal value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized.  I.e. A collection of entities that isn't an Organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference.
	 * @see #setGroup(Group)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Group()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Group' namespace='##targetNamespace'"
	 * @generated
	 */
	Group getGroup();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getGroup <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' containment reference.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(Group value);

	/**
	 * Returns the value of the '<em><b>Healthcare Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of a Healthcare Service available at a location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #setHealthcareService(HealthcareService)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_HealthcareService()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='HealthcareService' namespace='##targetNamespace'"
	 * @generated
	 */
	HealthcareService getHealthcareService();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getHealthcareService <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthcare Service</em>' containment reference.
	 * @see #getHealthcareService()
	 * @generated
	 */
	void setHealthcareService(HealthcareService value);

	/**
	 * Returns the value of the '<em><b>Imaging Object Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of DICOM SOP Instances of a patient, selected for some application purpose, e.g., quality assurance, teaching, conference, consulting, etc.  Objects selected can be from different studies, but must be of the same patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Object Selection</em>' containment reference.
	 * @see #setImagingObjectSelection(ImagingObjectSelection)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImagingObjectSelection()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagingObjectSelection' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingObjectSelection getImagingObjectSelection();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImagingObjectSelection <em>Imaging Object Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Object Selection</em>' containment reference.
	 * @see #getImagingObjectSelection()
	 * @generated
	 */
	void setImagingObjectSelection(ImagingObjectSelection value);

	/**
	 * Returns the value of the '<em><b>Imaging Study</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Representation of the content produced in a DICOM imaging study. A study comprises a set of Series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A Series is of only one modality (e.g., X-ray, CT, MR, ultrasound), but a Study may have multiple Series of different modalities.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imaging Study</em>' containment reference.
	 * @see #setImagingStudy(ImagingStudy)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImagingStudy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImagingStudy' namespace='##targetNamespace'"
	 * @generated
	 */
	ImagingStudy getImagingStudy();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImagingStudy <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imaging Study</em>' containment reference.
	 * @see #getImagingStudy()
	 * @generated
	 */
	void setImagingStudy(ImagingStudy value);

	/**
	 * Returns the value of the '<em><b>Immunization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Immunization event information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization</em>' containment reference.
	 * @see #setImmunization(Immunization)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Immunization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Immunization' namespace='##targetNamespace'"
	 * @generated
	 */
	Immunization getImmunization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImmunization <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization</em>' containment reference.
	 * @see #getImmunization()
	 * @generated
	 */
	void setImmunization(Immunization value);

	/**
	 * Returns the value of the '<em><b>Immunization Recommendation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A patient's point-of-time immunization status and recommendation with optional supporting justification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #setImmunizationRecommendation(ImmunizationRecommendation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ImmunizationRecommendation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ImmunizationRecommendation' namespace='##targetNamespace'"
	 * @generated
	 */
	ImmunizationRecommendation getImmunizationRecommendation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getImmunizationRecommendation <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immunization Recommendation</em>' containment reference.
	 * @see #getImmunizationRecommendation()
	 * @generated
	 */
	void setImmunizationRecommendation(ImmunizationRecommendation value);

	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of information summarized from a list of other resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(List)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_List()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='List' namespace='##targetNamespace'"
	 * @generated
	 */
	List getList();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(List value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Location()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Media</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Media</em>' containment reference.
	 * @see #setMedia(Media)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Media()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Media' namespace='##targetNamespace'"
	 * @generated
	 */
	Media getMedia();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedia <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Media</em>' containment reference.
	 * @see #getMedia()
	 * @generated
	 */
	void setMedia(Media value);

	/**
	 * Returns the value of the '<em><b>Medication</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication</em>' containment reference.
	 * @see #setMedication(Medication)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Medication()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Medication' namespace='##targetNamespace'"
	 * @generated
	 */
	Medication getMedication();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedication <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication</em>' containment reference.
	 * @see #getMedication()
	 * @generated
	 */
	void setMedication(Medication value);

	/**
	 * Returns the value of the '<em><b>Medication Administration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.
	 * 
	 * Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Administration</em>' containment reference.
	 * @see #setMedicationAdministration(MedicationAdministration)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationAdministration()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationAdministration' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationAdministration getMedicationAdministration();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationAdministration <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Administration</em>' containment reference.
	 * @see #getMedicationAdministration()
	 * @generated
	 */
	void setMedicationAdministration(MedicationAdministration value);

	/**
	 * Returns the value of the '<em><b>Medication Dispense</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dispensing a medication to a named patient.  This includes a description of the supply provided and the instructions for administering the medication.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #setMedicationDispense(MedicationDispense)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationDispense()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationDispense' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationDispense getMedicationDispense();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationDispense <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Dispense</em>' containment reference.
	 * @see #getMedicationDispense()
	 * @generated
	 */
	void setMedicationDispense(MedicationDispense value);

	/**
	 * Returns the value of the '<em><b>Medication Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Prescription</em>' containment reference.
	 * @see #setMedicationPrescription(MedicationPrescription)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationPrescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationPrescription getMedicationPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationPrescription <em>Medication Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Prescription</em>' containment reference.
	 * @see #getMedicationPrescription()
	 * @generated
	 */
	void setMedicationPrescription(MedicationPrescription value);

	/**
	 * Returns the value of the '<em><b>Medication Statement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A record of medication being taken by a patient, or that the medication has been given to a patient where the record is the result of a report from the patient or another clinician.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Medication Statement</em>' containment reference.
	 * @see #setMedicationStatement(MedicationStatement)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MedicationStatement()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MedicationStatement' namespace='##targetNamespace'"
	 * @generated
	 */
	MedicationStatement getMedicationStatement();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMedicationStatement <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Statement</em>' containment reference.
	 * @see #getMedicationStatement()
	 * @generated
	 */
	void setMedicationStatement(MedicationStatement value);

	/**
	 * Returns the value of the '<em><b>Message Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The header for a message exchange that is either requesting or responding to an action.  The Reference(s) that are the subject of the action as well as other Information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Header</em>' containment reference.
	 * @see #setMessageHeader(MessageHeader)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_MessageHeader()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='MessageHeader' namespace='##targetNamespace'"
	 * @generated
	 */
	MessageHeader getMessageHeader();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getMessageHeader <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Header</em>' containment reference.
	 * @see #getMessageHeader()
	 * @generated
	 */
	void setMessageHeader(MessageHeader value);

	/**
	 * Returns the value of the '<em><b>Naming System</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Naming System</em>' containment reference.
	 * @see #setNamingSystem(NamingSystem)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_NamingSystem()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NamingSystem' namespace='##targetNamespace'"
	 * @generated
	 */
	NamingSystem getNamingSystem();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getNamingSystem <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Naming System</em>' containment reference.
	 * @see #getNamingSystem()
	 * @generated
	 */
	void setNamingSystem(NamingSystem value);

	/**
	 * Returns the value of the '<em><b>Nutrition Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #setNutritionOrder(NutritionOrder)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_NutritionOrder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='NutritionOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	NutritionOrder getNutritionOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getNutritionOrder <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nutrition Order</em>' containment reference.
	 * @see #getNutritionOrder()
	 * @generated
	 */
	void setNutritionOrder(NutritionOrder value);

	/**
	 * Returns the value of the '<em><b>Observation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measurements and simple assertions made about a patient, device or other subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Observation</em>' containment reference.
	 * @see #setObservation(Observation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Observation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Observation' namespace='##targetNamespace'"
	 * @generated
	 */
	Observation getObservation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getObservation <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Observation</em>' containment reference.
	 * @see #getObservation()
	 * @generated
	 */
	void setObservation(Observation value);

	/**
	 * Returns the value of the '<em><b>Operation Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Definition</em>' containment reference.
	 * @see #setOperationDefinition(OperationDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OperationDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationDefinition getOperationDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOperationDefinition <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Definition</em>' containment reference.
	 * @see #getOperationDefinition()
	 * @generated
	 */
	void setOperationDefinition(OperationDefinition value);

	/**
	 * Returns the value of the '<em><b>Operation Outcome</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A collection of error, warning or information messages that result from a system action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #setOperationOutcome(OperationOutcome)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OperationOutcome()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OperationOutcome' namespace='##targetNamespace'"
	 * @generated
	 */
	OperationOutcome getOperationOutcome();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOperationOutcome <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Outcome</em>' containment reference.
	 * @see #getOperationOutcome()
	 * @generated
	 */
	void setOperationOutcome(OperationOutcome value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request to perform an action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(Order)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Order()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Order' namespace='##targetNamespace'"
	 * @generated
	 */
	Order getOrder();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(Order value);

	/**
	 * Returns the value of the '<em><b>Order Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A response to an order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order Response</em>' containment reference.
	 * @see #setOrderResponse(OrderResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_OrderResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='OrderResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderResponse getOrderResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOrderResponse <em>Order Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Response</em>' containment reference.
	 * @see #getOrderResponse()
	 * @generated
	 */
	void setOrderResponse(OrderResponse value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(Organization)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Organization()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Organization' namespace='##targetNamespace'"
	 * @generated
	 */
	Organization getOrganization();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(Organization value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This special resource type is used to represent [operation](operations.html] request and response. It has no other use, and there is no RESTful end=point associated with it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference.
	 * @see #setParameters(Parameters)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Parameters()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Parameters' namespace='##targetNamespace'"
	 * @generated
	 */
	Parameters getParameters();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getParameters <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters</em>' containment reference.
	 * @see #getParameters()
	 * @generated
	 */
	void setParameters(Parameters value);

	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference.
	 * @see #setPatient(Patient)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Patient()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Patient' namespace='##targetNamespace'"
	 * @generated
	 */
	Patient getPatient();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPatient <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient</em>' containment reference.
	 * @see #getPatient()
	 * @generated
	 */
	void setPatient(Patient value);

	/**
	 * Returns the value of the '<em><b>Payment Notice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Notice</em>' containment reference.
	 * @see #setPaymentNotice(PaymentNotice)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PaymentNotice()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentNotice' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentNotice getPaymentNotice();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPaymentNotice <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Notice</em>' containment reference.
	 * @see #getPaymentNotice()
	 * @generated
	 */
	void setPaymentNotice(PaymentNotice value);

	/**
	 * Returns the value of the '<em><b>Payment Reconciliation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides payment details and claim references supporting a bulk payment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #setPaymentReconciliation(PaymentReconciliation)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_PaymentReconciliation()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PaymentReconciliation' namespace='##targetNamespace'"
	 * @generated
	 */
	PaymentReconciliation getPaymentReconciliation();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPaymentReconciliation <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Reconciliation</em>' containment reference.
	 * @see #getPaymentReconciliation()
	 * @generated
	 */
	void setPaymentReconciliation(PaymentReconciliation value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Demographics and administrative information about a person independent of a specific health-related context.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Person</em>' containment reference.
	 * @see #setPerson(Person)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Person()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPerson <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' containment reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Practitioner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person who is directly or indirectly involved in the provisioning of healthcare.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Practitioner</em>' containment reference.
	 * @see #setPractitioner(Practitioner)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Practitioner()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Practitioner' namespace='##targetNamespace'"
	 * @generated
	 */
	Practitioner getPractitioner();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getPractitioner <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Practitioner</em>' containment reference.
	 * @see #getPractitioner()
	 * @generated
	 */
	void setPractitioner(Practitioner value);

	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An action that is or was performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(Procedure)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Procedure()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Procedure' namespace='##targetNamespace'"
	 * @generated
	 */
	Procedure getProcedure();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(Procedure value);

	/**
	 * Returns the value of the '<em><b>Procedure Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A request for a procedure to be performed. May be a proposal or an order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Procedure Request</em>' containment reference.
	 * @see #setProcedureRequest(ProcedureRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ProcedureRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcedureRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcedureRequest getProcedureRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProcedureRequest <em>Procedure Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure Request</em>' containment reference.
	 * @see #getProcedureRequest()
	 * @generated
	 */
	void setProcedureRequest(ProcedureRequest value);

	/**
	 * Returns the value of the '<em><b>Process Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Request</em>' containment reference.
	 * @see #setProcessRequest(ProcessRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ProcessRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessRequest getProcessRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProcessRequest <em>Process Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Request</em>' containment reference.
	 * @see #getProcessRequest()
	 * @generated
	 */
	void setProcessRequest(ProcessRequest value);

	/**
	 * Returns the value of the '<em><b>Process Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This resource provides processing status, errors and notes from the processing of a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Process Response</em>' containment reference.
	 * @see #setProcessResponse(ProcessResponse)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ProcessResponse()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ProcessResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	ProcessResponse getProcessResponse();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProcessResponse <em>Process Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Response</em>' containment reference.
	 * @see #getProcessResponse()
	 * @generated
	 */
	void setProcessResponse(ProcessResponse value);

	/**
	 * Returns the value of the '<em><b>Provenance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g., Document Completion - has the artifact been legally authenticated), all of which may impact Security, Privacy, and Trust policies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Provenance</em>' containment reference.
	 * @see #setProvenance(Provenance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Provenance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Provenance' namespace='##targetNamespace'"
	 * @generated
	 */
	Provenance getProvenance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getProvenance <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provenance</em>' containment reference.
	 * @see #getProvenance()
	 * @generated
	 */
	void setProvenance(Provenance value);

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Questionnaire)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Questionnaire()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Questionnaire getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Questionnaire value);

	/**
	 * Returns the value of the '<em><b>Questionnaire Answers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire Answers</em>' containment reference.
	 * @see #setQuestionnaireAnswers(QuestionnaireAnswers)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_QuestionnaireAnswers()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='QuestionnaireAnswers' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireAnswers getQuestionnaireAnswers();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getQuestionnaireAnswers <em>Questionnaire Answers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire Answers</em>' containment reference.
	 * @see #getQuestionnaireAnswers()
	 * @generated
	 */
	void setQuestionnaireAnswers(QuestionnaireAnswers value);

	/**
	 * Returns the value of the '<em><b>Referral Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referral Request</em>' containment reference.
	 * @see #setReferralRequest(ReferralRequest)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ReferralRequest()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ReferralRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferralRequest getReferralRequest();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getReferralRequest <em>Referral Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referral Request</em>' containment reference.
	 * @see #getReferralRequest()
	 * @generated
	 */
	void setReferralRequest(ReferralRequest value);

	/**
	 * Returns the value of the '<em><b>Related Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Person</em>' containment reference.
	 * @see #setRelatedPerson(RelatedPerson)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RelatedPerson()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RelatedPerson' namespace='##targetNamespace'"
	 * @generated
	 */
	RelatedPerson getRelatedPerson();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRelatedPerson <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Person</em>' containment reference.
	 * @see #getRelatedPerson()
	 * @generated
	 */
	void setRelatedPerson(RelatedPerson value);

	/**
	 * Returns the value of the '<em><b>Risk Assessment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #setRiskAssessment(RiskAssessment)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_RiskAssessment()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RiskAssessment' namespace='##targetNamespace'"
	 * @generated
	 */
	RiskAssessment getRiskAssessment();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getRiskAssessment <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Assessment</em>' containment reference.
	 * @see #getRiskAssessment()
	 * @generated
	 */
	void setRiskAssessment(RiskAssessment value);

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A container for slot(s) of time that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference.
	 * @see #setSchedule(Schedule)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Schedule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Schedule' namespace='##targetNamespace'"
	 * @generated
	 */
	Schedule getSchedule();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSchedule <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schedule</em>' containment reference.
	 * @see #getSchedule()
	 * @generated
	 */
	void setSchedule(Schedule value);

	/**
	 * Returns the value of the '<em><b>Search Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Search Parameter that defines a named search item that can be used to search/filter on a resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Search Parameter</em>' containment reference.
	 * @see #setSearchParameter(SearchParameter)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_SearchParameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SearchParameter' namespace='##targetNamespace'"
	 * @generated
	 */
	SearchParameter getSearchParameter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSearchParameter <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Search Parameter</em>' containment reference.
	 * @see #getSearchParameter()
	 * @generated
	 */
	void setSearchParameter(SearchParameter value);

	/**
	 * Returns the value of the '<em><b>Slot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A slot of time on a schedule that may be available for booking appointments.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Slot</em>' containment reference.
	 * @see #setSlot(Slot)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Slot()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Slot' namespace='##targetNamespace'"
	 * @generated
	 */
	Slot getSlot();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSlot <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot</em>' containment reference.
	 * @see #getSlot()
	 * @generated
	 */
	void setSlot(Slot value);

	/**
	 * Returns the value of the '<em><b>Specimen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sample for analysis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Specimen</em>' containment reference.
	 * @see #setSpecimen(Specimen)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Specimen()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Specimen' namespace='##targetNamespace'"
	 * @generated
	 */
	Specimen getSpecimen();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSpecimen <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specimen</em>' containment reference.
	 * @see #getSpecimen()
	 * @generated
	 */
	void setSpecimen(Specimen value);

	/**
	 * Returns the value of the '<em><b>Structure Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structure Definition</em>' containment reference.
	 * @see #setStructureDefinition(StructureDefinition)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_StructureDefinition()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StructureDefinition' namespace='##targetNamespace'"
	 * @generated
	 */
	StructureDefinition getStructureDefinition();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getStructureDefinition <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Structure Definition</em>' containment reference.
	 * @see #getStructureDefinition()
	 * @generated
	 */
	void setStructureDefinition(StructureDefinition value);

	/**
	 * Returns the value of the '<em><b>Subscription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subscription</em>' containment reference.
	 * @see #setSubscription(Subscription)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Subscription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subscription' namespace='##targetNamespace'"
	 * @generated
	 */
	Subscription getSubscription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubscription <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscription</em>' containment reference.
	 * @see #getSubscription()
	 * @generated
	 */
	void setSubscription(Subscription value);

	/**
	 * Returns the value of the '<em><b>Substance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A homogeneous material with a definite composition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substance</em>' containment reference.
	 * @see #setSubstance(Substance)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Substance()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Substance' namespace='##targetNamespace'"
	 * @generated
	 */
	Substance getSubstance();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSubstance <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substance</em>' containment reference.
	 * @see #getSubstance()
	 * @generated
	 */
	void setSubstance(Substance value);

	/**
	 * Returns the value of the '<em><b>Supply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A supply - a  request for something, and provision of what is supplied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Supply</em>' containment reference.
	 * @see #setSupply(Supply)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_Supply()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Supply' namespace='##targetNamespace'"
	 * @generated
	 */
	Supply getSupply();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getSupply <em>Supply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supply</em>' containment reference.
	 * @see #getSupply()
	 * @generated
	 */
	void setSupply(Supply value);

	/**
	 * Returns the value of the '<em><b>Value Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A value set specifies a set of codes drawn from one or more code systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Set</em>' containment reference.
	 * @see #setValueSet(ValueSet)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_ValueSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ValueSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ValueSet getValueSet();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getValueSet <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Set</em>' containment reference.
	 * @see #getValueSet()
	 * @generated
	 */
	void setValueSet(ValueSet value);

	/**
	 * Returns the value of the '<em><b>Vision Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An authorization for the supply of glasses and/or contact lenses to a patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #setVisionPrescription(VisionPrescription)
	 * @see org.hl7.fhir.FhirPackage#getDocumentRoot_VisionPrescription()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='VisionPrescription' namespace='##targetNamespace'"
	 * @generated
	 */
	VisionPrescription getVisionPrescription();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.DocumentRoot#getVisionPrescription <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vision Prescription</em>' containment reference.
	 * @see #getVisionPrescription()
	 * @generated
	 */
	void setVisionPrescription(VisionPrescription value);

} // DocumentRoot
