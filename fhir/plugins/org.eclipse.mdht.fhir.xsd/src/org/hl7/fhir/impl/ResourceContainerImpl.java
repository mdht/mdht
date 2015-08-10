/**
 */
package org.hl7.fhir.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.hl7.fhir.Account;
import org.hl7.fhir.AllergyIntolerance;
import org.hl7.fhir.Appointment;
import org.hl7.fhir.AppointmentResponse;
import org.hl7.fhir.AuditEvent;
import org.hl7.fhir.Basic;
import org.hl7.fhir.Binary;
import org.hl7.fhir.BodySite;
import org.hl7.fhir.Bundle;
import org.hl7.fhir.CarePlan;
import org.hl7.fhir.Claim;
import org.hl7.fhir.ClaimResponse;
import org.hl7.fhir.ClinicalImpression;
import org.hl7.fhir.Communication;
import org.hl7.fhir.CommunicationRequest;
import org.hl7.fhir.Composition;
import org.hl7.fhir.ConceptMap;
import org.hl7.fhir.Condition;
import org.hl7.fhir.Conformance;
import org.hl7.fhir.Contract;
import org.hl7.fhir.Contraindication;
import org.hl7.fhir.Coverage;
import org.hl7.fhir.DataElement;
import org.hl7.fhir.Device;
import org.hl7.fhir.DeviceComponent;
import org.hl7.fhir.DeviceMetric;
import org.hl7.fhir.DeviceUseRequest;
import org.hl7.fhir.DeviceUseStatement;
import org.hl7.fhir.DiagnosticOrder;
import org.hl7.fhir.DiagnosticReport;
import org.hl7.fhir.DocumentManifest;
import org.hl7.fhir.DocumentReference;
import org.hl7.fhir.EligibilityRequest;
import org.hl7.fhir.EligibilityResponse;
import org.hl7.fhir.Encounter;
import org.hl7.fhir.EnrollmentRequest;
import org.hl7.fhir.EnrollmentResponse;
import org.hl7.fhir.EpisodeOfCare;
import org.hl7.fhir.ExplanationOfBenefit;
import org.hl7.fhir.FamilyMemberHistory;
import org.hl7.fhir.FhirPackage;
import org.hl7.fhir.Flag;
import org.hl7.fhir.Goal;
import org.hl7.fhir.Group;
import org.hl7.fhir.HealthcareService;
import org.hl7.fhir.ImagingObjectSelection;
import org.hl7.fhir.ImagingStudy;
import org.hl7.fhir.Immunization;
import org.hl7.fhir.ImmunizationRecommendation;
import org.hl7.fhir.ImplementationGuide;
import org.hl7.fhir.List;
import org.hl7.fhir.Location;
import org.hl7.fhir.Media;
import org.hl7.fhir.Medication;
import org.hl7.fhir.MedicationAdministration;
import org.hl7.fhir.MedicationDispense;
import org.hl7.fhir.MedicationPrescription;
import org.hl7.fhir.MedicationStatement;
import org.hl7.fhir.MessageHeader;
import org.hl7.fhir.NamingSystem;
import org.hl7.fhir.NutritionOrder;
import org.hl7.fhir.Observation;
import org.hl7.fhir.OperationDefinition;
import org.hl7.fhir.OperationOutcome;
import org.hl7.fhir.Order;
import org.hl7.fhir.OrderResponse;
import org.hl7.fhir.Organization;
import org.hl7.fhir.Parameters;
import org.hl7.fhir.Patient;
import org.hl7.fhir.PaymentNotice;
import org.hl7.fhir.PaymentReconciliation;
import org.hl7.fhir.Person;
import org.hl7.fhir.Practitioner;
import org.hl7.fhir.Procedure;
import org.hl7.fhir.ProcedureRequest;
import org.hl7.fhir.ProcessRequest;
import org.hl7.fhir.ProcessResponse;
import org.hl7.fhir.Provenance;
import org.hl7.fhir.Questionnaire;
import org.hl7.fhir.QuestionnaireResponse;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.Slot;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.Substance;
import org.hl7.fhir.SupplyDelivery;
import org.hl7.fhir.SupplyRequest;
import org.hl7.fhir.TestScript;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.VisionPrescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getAccount <em>Account</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDeviceComponent <em>Device Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDeviceUseRequest <em>Device Use Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDiagnosticOrder <em>Diagnostic Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEligibilityRequest <em>Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEligibilityResponse <em>Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getImagingObjectSelection <em>Imaging Object Selection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getImplementationGuide <em>Implementation Guide</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedicationPrescription <em>Medication Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getOrderResponse <em>Order Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getProcedureRequest <em>Procedure Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getProcessRequest <em>Process Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getProcessResponse <em>Process Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getQuestionnaireResponse <em>Questionnaire Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSupplyDelivery <em>Supply Delivery</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getSupplyRequest <em>Supply Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getTestScript <em>Test Script</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getVisionPrescription <em>Vision Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.ResourceContainerImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceContainerImpl extends MinimalEObjectImpl.Container implements ResourceContainer {
	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected Account account;

	/**
	 * The cached value of the '{@link #getAllergyIntolerance() <em>Allergy Intolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergyIntolerance()
	 * @generated
	 * @ordered
	 */
	protected AllergyIntolerance allergyIntolerance;

	/**
	 * The cached value of the '{@link #getAppointment() <em>Appointment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointment()
	 * @generated
	 * @ordered
	 */
	protected Appointment appointment;

	/**
	 * The cached value of the '{@link #getAppointmentResponse() <em>Appointment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppointmentResponse()
	 * @generated
	 * @ordered
	 */
	protected AppointmentResponse appointmentResponse;

	/**
	 * The cached value of the '{@link #getAuditEvent() <em>Audit Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditEvent()
	 * @generated
	 * @ordered
	 */
	protected AuditEvent auditEvent;

	/**
	 * The cached value of the '{@link #getBasic() <em>Basic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasic()
	 * @generated
	 * @ordered
	 */
	protected Basic basic;

	/**
	 * The cached value of the '{@link #getBinary() <em>Binary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinary()
	 * @generated
	 * @ordered
	 */
	protected Binary binary;

	/**
	 * The cached value of the '{@link #getBodySite() <em>Body Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySite()
	 * @generated
	 * @ordered
	 */
	protected BodySite bodySite;

	/**
	 * The cached value of the '{@link #getBundle() <em>Bundle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBundle()
	 * @generated
	 * @ordered
	 */
	protected Bundle bundle;

	/**
	 * The cached value of the '{@link #getCarePlan() <em>Care Plan</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarePlan()
	 * @generated
	 * @ordered
	 */
	protected CarePlan carePlan;

	/**
	 * The cached value of the '{@link #getClaim() <em>Claim</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaim()
	 * @generated
	 * @ordered
	 */
	protected Claim claim;

	/**
	 * The cached value of the '{@link #getClaimResponse() <em>Claim Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimResponse()
	 * @generated
	 * @ordered
	 */
	protected ClaimResponse claimResponse;

	/**
	 * The cached value of the '{@link #getClinicalImpression() <em>Clinical Impression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalImpression()
	 * @generated
	 * @ordered
	 */
	protected ClinicalImpression clinicalImpression;

	/**
	 * The cached value of the '{@link #getCommunication() <em>Communication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunication()
	 * @generated
	 * @ordered
	 */
	protected Communication communication;

	/**
	 * The cached value of the '{@link #getCommunicationRequest() <em>Communication Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationRequest()
	 * @generated
	 * @ordered
	 */
	protected CommunicationRequest communicationRequest;

	/**
	 * The cached value of the '{@link #getComposition() <em>Composition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposition()
	 * @generated
	 * @ordered
	 */
	protected Composition composition;

	/**
	 * The cached value of the '{@link #getConceptMap() <em>Concept Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceptMap()
	 * @generated
	 * @ordered
	 */
	protected ConceptMap conceptMap;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getConformance() <em>Conformance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConformance()
	 * @generated
	 * @ordered
	 */
	protected Conformance conformance;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected Contract contract;

	/**
	 * The cached value of the '{@link #getContraindication() <em>Contraindication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContraindication()
	 * @generated
	 * @ordered
	 */
	protected Contraindication contraindication;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected Coverage coverage;

	/**
	 * The cached value of the '{@link #getDataElement() <em>Data Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataElement()
	 * @generated
	 * @ordered
	 */
	protected DataElement dataElement;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * The cached value of the '{@link #getDeviceComponent() <em>Device Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceComponent()
	 * @generated
	 * @ordered
	 */
	protected DeviceComponent deviceComponent;

	/**
	 * The cached value of the '{@link #getDeviceMetric() <em>Device Metric</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceMetric()
	 * @generated
	 * @ordered
	 */
	protected DeviceMetric deviceMetric;

	/**
	 * The cached value of the '{@link #getDeviceUseRequest() <em>Device Use Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceUseRequest()
	 * @generated
	 * @ordered
	 */
	protected DeviceUseRequest deviceUseRequest;

	/**
	 * The cached value of the '{@link #getDeviceUseStatement() <em>Device Use Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceUseStatement()
	 * @generated
	 * @ordered
	 */
	protected DeviceUseStatement deviceUseStatement;

	/**
	 * The cached value of the '{@link #getDiagnosticOrder() <em>Diagnostic Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticOrder()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticOrder diagnosticOrder;

	/**
	 * The cached value of the '{@link #getDiagnosticReport() <em>Diagnostic Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticReport()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticReport diagnosticReport;

	/**
	 * The cached value of the '{@link #getDocumentManifest() <em>Document Manifest</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentManifest()
	 * @generated
	 * @ordered
	 */
	protected DocumentManifest documentManifest;

	/**
	 * The cached value of the '{@link #getDocumentReference() <em>Document Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentReference()
	 * @generated
	 * @ordered
	 */
	protected DocumentReference documentReference;

	/**
	 * The cached value of the '{@link #getEligibilityRequest() <em>Eligibility Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityRequest()
	 * @generated
	 * @ordered
	 */
	protected EligibilityRequest eligibilityRequest;

	/**
	 * The cached value of the '{@link #getEligibilityResponse() <em>Eligibility Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityResponse()
	 * @generated
	 * @ordered
	 */
	protected EligibilityResponse eligibilityResponse;

	/**
	 * The cached value of the '{@link #getEncounter() <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncounter()
	 * @generated
	 * @ordered
	 */
	protected Encounter encounter;

	/**
	 * The cached value of the '{@link #getEnrollmentRequest() <em>Enrollment Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentRequest()
	 * @generated
	 * @ordered
	 */
	protected EnrollmentRequest enrollmentRequest;

	/**
	 * The cached value of the '{@link #getEnrollmentResponse() <em>Enrollment Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnrollmentResponse()
	 * @generated
	 * @ordered
	 */
	protected EnrollmentResponse enrollmentResponse;

	/**
	 * The cached value of the '{@link #getEpisodeOfCare() <em>Episode Of Care</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeOfCare()
	 * @generated
	 * @ordered
	 */
	protected EpisodeOfCare episodeOfCare;

	/**
	 * The cached value of the '{@link #getExplanationOfBenefit() <em>Explanation Of Benefit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplanationOfBenefit()
	 * @generated
	 * @ordered
	 */
	protected ExplanationOfBenefit explanationOfBenefit;

	/**
	 * The cached value of the '{@link #getFamilyMemberHistory() <em>Family Member History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyMemberHistory()
	 * @generated
	 * @ordered
	 */
	protected FamilyMemberHistory familyMemberHistory;

	/**
	 * The cached value of the '{@link #getFlag() <em>Flag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlag()
	 * @generated
	 * @ordered
	 */
	protected Flag flag;

	/**
	 * The cached value of the '{@link #getGoal() <em>Goal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoal()
	 * @generated
	 * @ordered
	 */
	protected Goal goal;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected Group group;

	/**
	 * The cached value of the '{@link #getHealthcareService() <em>Healthcare Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcareService()
	 * @generated
	 * @ordered
	 */
	protected HealthcareService healthcareService;

	/**
	 * The cached value of the '{@link #getImagingObjectSelection() <em>Imaging Object Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingObjectSelection()
	 * @generated
	 * @ordered
	 */
	protected ImagingObjectSelection imagingObjectSelection;

	/**
	 * The cached value of the '{@link #getImagingStudy() <em>Imaging Study</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagingStudy()
	 * @generated
	 * @ordered
	 */
	protected ImagingStudy imagingStudy;

	/**
	 * The cached value of the '{@link #getImmunization() <em>Immunization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunization()
	 * @generated
	 * @ordered
	 */
	protected Immunization immunization;

	/**
	 * The cached value of the '{@link #getImmunizationRecommendation() <em>Immunization Recommendation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationRecommendation()
	 * @generated
	 * @ordered
	 */
	protected ImmunizationRecommendation immunizationRecommendation;

	/**
	 * The cached value of the '{@link #getImplementationGuide() <em>Implementation Guide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationGuide()
	 * @generated
	 * @ordered
	 */
	protected ImplementationGuide implementationGuide;

	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected List list;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedia()
	 * @generated
	 * @ordered
	 */
	protected Media media;

	/**
	 * The cached value of the '{@link #getMedication() <em>Medication</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedication()
	 * @generated
	 * @ordered
	 */
	protected Medication medication;

	/**
	 * The cached value of the '{@link #getMedicationAdministration() <em>Medication Administration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationAdministration()
	 * @generated
	 * @ordered
	 */
	protected MedicationAdministration medicationAdministration;

	/**
	 * The cached value of the '{@link #getMedicationDispense() <em>Medication Dispense</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationDispense()
	 * @generated
	 * @ordered
	 */
	protected MedicationDispense medicationDispense;

	/**
	 * The cached value of the '{@link #getMedicationPrescription() <em>Medication Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationPrescription()
	 * @generated
	 * @ordered
	 */
	protected MedicationPrescription medicationPrescription;

	/**
	 * The cached value of the '{@link #getMedicationStatement() <em>Medication Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatement()
	 * @generated
	 * @ordered
	 */
	protected MedicationStatement medicationStatement;

	/**
	 * The cached value of the '{@link #getMessageHeader() <em>Message Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageHeader()
	 * @generated
	 * @ordered
	 */
	protected MessageHeader messageHeader;

	/**
	 * The cached value of the '{@link #getNamingSystem() <em>Naming System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamingSystem()
	 * @generated
	 * @ordered
	 */
	protected NamingSystem namingSystem;

	/**
	 * The cached value of the '{@link #getNutritionOrder() <em>Nutrition Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNutritionOrder()
	 * @generated
	 * @ordered
	 */
	protected NutritionOrder nutritionOrder;

	/**
	 * The cached value of the '{@link #getObservation() <em>Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObservation()
	 * @generated
	 * @ordered
	 */
	protected Observation observation;

	/**
	 * The cached value of the '{@link #getOperationDefinition() <em>Operation Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationDefinition()
	 * @generated
	 * @ordered
	 */
	protected OperationDefinition operationDefinition;

	/**
	 * The cached value of the '{@link #getOperationOutcome() <em>Operation Outcome</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationOutcome()
	 * @generated
	 * @ordered
	 */
	protected OperationOutcome operationOutcome;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

	/**
	 * The cached value of the '{@link #getOrderResponse() <em>Order Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderResponse()
	 * @generated
	 * @ordered
	 */
	protected OrderResponse orderResponse;

	/**
	 * The cached value of the '{@link #getOrganization() <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganization()
	 * @generated
	 * @ordered
	 */
	protected Organization organization;

	/**
	 * The cached value of the '{@link #getPatient() <em>Patient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatient()
	 * @generated
	 * @ordered
	 */
	protected Patient patient;

	/**
	 * The cached value of the '{@link #getPaymentNotice() <em>Payment Notice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentNotice()
	 * @generated
	 * @ordered
	 */
	protected PaymentNotice paymentNotice;

	/**
	 * The cached value of the '{@link #getPaymentReconciliation() <em>Payment Reconciliation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentReconciliation()
	 * @generated
	 * @ordered
	 */
	protected PaymentReconciliation paymentReconciliation;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The cached value of the '{@link #getPractitioner() <em>Practitioner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPractitioner()
	 * @generated
	 * @ordered
	 */
	protected Practitioner practitioner;

	/**
	 * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedure()
	 * @generated
	 * @ordered
	 */
	protected Procedure procedure;

	/**
	 * The cached value of the '{@link #getProcedureRequest() <em>Procedure Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureRequest()
	 * @generated
	 * @ordered
	 */
	protected ProcedureRequest procedureRequest;

	/**
	 * The cached value of the '{@link #getProcessRequest() <em>Process Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessRequest()
	 * @generated
	 * @ordered
	 */
	protected ProcessRequest processRequest;

	/**
	 * The cached value of the '{@link #getProcessResponse() <em>Process Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessResponse()
	 * @generated
	 * @ordered
	 */
	protected ProcessResponse processResponse;

	/**
	 * The cached value of the '{@link #getProvenance() <em>Provenance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvenance()
	 * @generated
	 * @ordered
	 */
	protected Provenance provenance;

	/**
	 * The cached value of the '{@link #getQuestionnaire() <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaire()
	 * @generated
	 * @ordered
	 */
	protected Questionnaire questionnaire;

	/**
	 * The cached value of the '{@link #getQuestionnaireResponse() <em>Questionnaire Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionnaireResponse()
	 * @generated
	 * @ordered
	 */
	protected QuestionnaireResponse questionnaireResponse;

	/**
	 * The cached value of the '{@link #getReferralRequest() <em>Referral Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferralRequest()
	 * @generated
	 * @ordered
	 */
	protected ReferralRequest referralRequest;

	/**
	 * The cached value of the '{@link #getRelatedPerson() <em>Related Person</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedPerson()
	 * @generated
	 * @ordered
	 */
	protected RelatedPerson relatedPerson;

	/**
	 * The cached value of the '{@link #getRiskAssessment() <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessment riskAssessment;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected Schedule schedule;

	/**
	 * The cached value of the '{@link #getSearchParameter() <em>Search Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSearchParameter()
	 * @generated
	 * @ordered
	 */
	protected SearchParameter searchParameter;

	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected Slot slot;

	/**
	 * The cached value of the '{@link #getSpecimen() <em>Specimen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimen()
	 * @generated
	 * @ordered
	 */
	protected Specimen specimen;

	/**
	 * The cached value of the '{@link #getStructureDefinition() <em>Structure Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureDefinition()
	 * @generated
	 * @ordered
	 */
	protected StructureDefinition structureDefinition;

	/**
	 * The cached value of the '{@link #getSubscription() <em>Subscription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscription()
	 * @generated
	 * @ordered
	 */
	protected Subscription subscription;

	/**
	 * The cached value of the '{@link #getSubstance() <em>Substance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstance()
	 * @generated
	 * @ordered
	 */
	protected Substance substance;

	/**
	 * The cached value of the '{@link #getSupplyDelivery() <em>Supply Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyDelivery()
	 * @generated
	 * @ordered
	 */
	protected SupplyDelivery supplyDelivery;

	/**
	 * The cached value of the '{@link #getSupplyRequest() <em>Supply Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplyRequest()
	 * @generated
	 * @ordered
	 */
	protected SupplyRequest supplyRequest;

	/**
	 * The cached value of the '{@link #getTestScript() <em>Test Script</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestScript()
	 * @generated
	 * @ordered
	 */
	protected TestScript testScript;

	/**
	 * The cached value of the '{@link #getValueSet() <em>Value Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueSet()
	 * @generated
	 * @ordered
	 */
	protected ValueSet valueSet;

	/**
	 * The cached value of the '{@link #getVisionPrescription() <em>Vision Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisionPrescription()
	 * @generated
	 * @ordered
	 */
	protected VisionPrescription visionPrescription;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected Parameters parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getResourceContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccount(Account newAccount, NotificationChain msgs) {
		Account oldAccount = account;
		account = newAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACCOUNT, oldAccount, newAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(Account newAccount) {
		if (newAccount != account) {
			NotificationChain msgs = null;
			if (account != null)
				msgs = ((InternalEObject)account).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACCOUNT, null, msgs);
			if (newAccount != null)
				msgs = ((InternalEObject)newAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ACCOUNT, null, msgs);
			msgs = basicSetAccount(newAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ACCOUNT, newAccount, newAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance getAllergyIntolerance() {
		return allergyIntolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergyIntolerance(AllergyIntolerance newAllergyIntolerance, NotificationChain msgs) {
		AllergyIntolerance oldAllergyIntolerance = allergyIntolerance;
		allergyIntolerance = newAllergyIntolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, oldAllergyIntolerance, newAllergyIntolerance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllergyIntolerance(AllergyIntolerance newAllergyIntolerance) {
		if (newAllergyIntolerance != allergyIntolerance) {
			NotificationChain msgs = null;
			if (allergyIntolerance != null)
				msgs = ((InternalEObject)allergyIntolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, null, msgs);
			if (newAllergyIntolerance != null)
				msgs = ((InternalEObject)newAllergyIntolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, null, msgs);
			msgs = basicSetAllergyIntolerance(newAllergyIntolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE, newAllergyIntolerance, newAllergyIntolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment getAppointment() {
		return appointment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Appointment newAppointment, NotificationChain msgs) {
		Appointment oldAppointment = appointment;
		appointment = newAppointment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, oldAppointment, newAppointment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Appointment newAppointment) {
		if (newAppointment != appointment) {
			NotificationChain msgs = null;
			if (appointment != null)
				msgs = ((InternalEObject)appointment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, null, msgs);
			if (newAppointment != null)
				msgs = ((InternalEObject)newAppointment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, null, msgs);
			msgs = basicSetAppointment(newAppointment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT, newAppointment, newAppointment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse getAppointmentResponse() {
		return appointmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentResponse(AppointmentResponse newAppointmentResponse, NotificationChain msgs) {
		AppointmentResponse oldAppointmentResponse = appointmentResponse;
		appointmentResponse = newAppointmentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, oldAppointmentResponse, newAppointmentResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentResponse(AppointmentResponse newAppointmentResponse) {
		if (newAppointmentResponse != appointmentResponse) {
			NotificationChain msgs = null;
			if (appointmentResponse != null)
				msgs = ((InternalEObject)appointmentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, null, msgs);
			if (newAppointmentResponse != null)
				msgs = ((InternalEObject)newAppointmentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, null, msgs);
			msgs = basicSetAppointmentResponse(newAppointmentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE, newAppointmentResponse, newAppointmentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent getAuditEvent() {
		return auditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditEvent(AuditEvent newAuditEvent, NotificationChain msgs) {
		AuditEvent oldAuditEvent = auditEvent;
		auditEvent = newAuditEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, oldAuditEvent, newAuditEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditEvent(AuditEvent newAuditEvent) {
		if (newAuditEvent != auditEvent) {
			NotificationChain msgs = null;
			if (auditEvent != null)
				msgs = ((InternalEObject)auditEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, null, msgs);
			if (newAuditEvent != null)
				msgs = ((InternalEObject)newAuditEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, null, msgs);
			msgs = basicSetAuditEvent(newAuditEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT, newAuditEvent, newAuditEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic getBasic() {
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
		Basic oldBasic = basic;
		basic = newBasic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BASIC, oldBasic, newBasic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic(Basic newBasic) {
		if (newBasic != basic) {
			NotificationChain msgs = null;
			if (basic != null)
				msgs = ((InternalEObject)basic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BASIC, null, msgs);
			if (newBasic != null)
				msgs = ((InternalEObject)newBasic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BASIC, null, msgs);
			msgs = basicSetBasic(newBasic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BASIC, newBasic, newBasic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getBinary() {
		return binary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(Binary newBinary, NotificationChain msgs) {
		Binary oldBinary = binary;
		binary = newBinary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BINARY, oldBinary, newBinary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinary(Binary newBinary) {
		if (newBinary != binary) {
			NotificationChain msgs = null;
			if (binary != null)
				msgs = ((InternalEObject)binary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BINARY, null, msgs);
			if (newBinary != null)
				msgs = ((InternalEObject)newBinary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BINARY, null, msgs);
			msgs = basicSetBinary(newBinary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BINARY, newBinary, newBinary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite getBodySite() {
		return bodySite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(BodySite newBodySite, NotificationChain msgs) {
		BodySite oldBodySite = bodySite;
		bodySite = newBodySite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BODY_SITE, oldBodySite, newBodySite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(BodySite newBodySite) {
		if (newBodySite != bodySite) {
			NotificationChain msgs = null;
			if (bodySite != null)
				msgs = ((InternalEObject)bodySite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BODY_SITE, null, msgs);
			if (newBodySite != null)
				msgs = ((InternalEObject)newBodySite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BODY_SITE, null, msgs);
			msgs = basicSetBodySite(newBodySite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BODY_SITE, newBodySite, newBodySite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		return bundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		Bundle oldBundle = bundle;
		bundle = newBundle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BUNDLE, oldBundle, newBundle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		if (newBundle != bundle) {
			NotificationChain msgs = null;
			if (bundle != null)
				msgs = ((InternalEObject)bundle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BUNDLE, null, msgs);
			if (newBundle != null)
				msgs = ((InternalEObject)newBundle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__BUNDLE, null, msgs);
			msgs = basicSetBundle(newBundle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__BUNDLE, newBundle, newBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan getCarePlan() {
		return carePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarePlan(CarePlan newCarePlan, NotificationChain msgs) {
		CarePlan oldCarePlan = carePlan;
		carePlan = newCarePlan;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, oldCarePlan, newCarePlan);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarePlan(CarePlan newCarePlan) {
		if (newCarePlan != carePlan) {
			NotificationChain msgs = null;
			if (carePlan != null)
				msgs = ((InternalEObject)carePlan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, null, msgs);
			if (newCarePlan != null)
				msgs = ((InternalEObject)newCarePlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, null, msgs);
			msgs = basicSetCarePlan(newCarePlan, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CARE_PLAN, newCarePlan, newCarePlan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		return claim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs) {
		Claim oldClaim = claim;
		claim = newClaim;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM, oldClaim, newClaim);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		if (newClaim != claim) {
			NotificationChain msgs = null;
			if (claim != null)
				msgs = ((InternalEObject)claim).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM, null, msgs);
			if (newClaim != null)
				msgs = ((InternalEObject)newClaim).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM, null, msgs);
			msgs = basicSetClaim(newClaim, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM, newClaim, newClaim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		return claimResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(ClaimResponse newClaimResponse, NotificationChain msgs) {
		ClaimResponse oldClaimResponse = claimResponse;
		claimResponse = newClaimResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, oldClaimResponse, newClaimResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		if (newClaimResponse != claimResponse) {
			NotificationChain msgs = null;
			if (claimResponse != null)
				msgs = ((InternalEObject)claimResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, null, msgs);
			if (newClaimResponse != null)
				msgs = ((InternalEObject)newClaimResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, null, msgs);
			msgs = basicSetClaimResponse(newClaimResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE, newClaimResponse, newClaimResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression getClinicalImpression() {
		return clinicalImpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalImpression(ClinicalImpression newClinicalImpression, NotificationChain msgs) {
		ClinicalImpression oldClinicalImpression = clinicalImpression;
		clinicalImpression = newClinicalImpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, oldClinicalImpression, newClinicalImpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalImpression(ClinicalImpression newClinicalImpression) {
		if (newClinicalImpression != clinicalImpression) {
			NotificationChain msgs = null;
			if (clinicalImpression != null)
				msgs = ((InternalEObject)clinicalImpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, null, msgs);
			if (newClinicalImpression != null)
				msgs = ((InternalEObject)newClinicalImpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, null, msgs);
			msgs = basicSetClinicalImpression(newClinicalImpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION, newClinicalImpression, newClinicalImpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getCommunication() {
		return communication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
		Communication oldCommunication = communication;
		communication = newCommunication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, oldCommunication, newCommunication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(Communication newCommunication) {
		if (newCommunication != communication) {
			NotificationChain msgs = null;
			if (communication != null)
				msgs = ((InternalEObject)communication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, null, msgs);
			if (newCommunication != null)
				msgs = ((InternalEObject)newCommunication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, null, msgs);
			msgs = basicSetCommunication(newCommunication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION, newCommunication, newCommunication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest getCommunicationRequest() {
		return communicationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationRequest(CommunicationRequest newCommunicationRequest, NotificationChain msgs) {
		CommunicationRequest oldCommunicationRequest = communicationRequest;
		communicationRequest = newCommunicationRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, oldCommunicationRequest, newCommunicationRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationRequest(CommunicationRequest newCommunicationRequest) {
		if (newCommunicationRequest != communicationRequest) {
			NotificationChain msgs = null;
			if (communicationRequest != null)
				msgs = ((InternalEObject)communicationRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, null, msgs);
			if (newCommunicationRequest != null)
				msgs = ((InternalEObject)newCommunicationRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, null, msgs);
			msgs = basicSetCommunicationRequest(newCommunicationRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST, newCommunicationRequest, newCommunicationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getComposition() {
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		Composition oldComposition = composition;
		composition = newComposition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPOSITION, oldComposition, newComposition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Composition newComposition) {
		if (newComposition != composition) {
			NotificationChain msgs = null;
			if (composition != null)
				msgs = ((InternalEObject)composition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPOSITION, null, msgs);
			if (newComposition != null)
				msgs = ((InternalEObject)newComposition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COMPOSITION, null, msgs);
			msgs = basicSetComposition(newComposition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COMPOSITION, newComposition, newComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap getConceptMap() {
		return conceptMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptMap(ConceptMap newConceptMap, NotificationChain msgs) {
		ConceptMap oldConceptMap = conceptMap;
		conceptMap = newConceptMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, oldConceptMap, newConceptMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptMap(ConceptMap newConceptMap) {
		if (newConceptMap != conceptMap) {
			NotificationChain msgs = null;
			if (conceptMap != null)
				msgs = ((InternalEObject)conceptMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, null, msgs);
			if (newConceptMap != null)
				msgs = ((InternalEObject)newConceptMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, null, msgs);
			msgs = basicSetConceptMap(newConceptMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP, newConceptMap, newConceptMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance getConformance() {
		return conformance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(Conformance newConformance, NotificationChain msgs) {
		Conformance oldConformance = conformance;
		conformance = newConformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONFORMANCE, oldConformance, newConformance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(Conformance newConformance) {
		if (newConformance != conformance) {
			NotificationChain msgs = null;
			if (conformance != null)
				msgs = ((InternalEObject)conformance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONFORMANCE, null, msgs);
			if (newConformance != null)
				msgs = ((InternalEObject)newConformance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONFORMANCE, null, msgs);
			msgs = basicSetConformance(newConformance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONFORMANCE, newConformance, newConformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		Contract oldContract = contract;
		contract = newContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRACT, oldContract, newContract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Contract newContract) {
		if (newContract != contract) {
			NotificationChain msgs = null;
			if (contract != null)
				msgs = ((InternalEObject)contract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRACT, null, msgs);
			if (newContract != null)
				msgs = ((InternalEObject)newContract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRACT, null, msgs);
			msgs = basicSetContract(newContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRACT, newContract, newContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraindication getContraindication() {
		return contraindication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContraindication(Contraindication newContraindication, NotificationChain msgs) {
		Contraindication oldContraindication = contraindication;
		contraindication = newContraindication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION, oldContraindication, newContraindication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraindication(Contraindication newContraindication) {
		if (newContraindication != contraindication) {
			NotificationChain msgs = null;
			if (contraindication != null)
				msgs = ((InternalEObject)contraindication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION, null, msgs);
			if (newContraindication != null)
				msgs = ((InternalEObject)newContraindication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION, null, msgs);
			msgs = basicSetContraindication(newContraindication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION, newContraindication, newContraindication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		Coverage oldCoverage = coverage;
		coverage = newCoverage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE, oldCoverage, newCoverage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		if (newCoverage != coverage) {
			NotificationChain msgs = null;
			if (coverage != null)
				msgs = ((InternalEObject)coverage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE, null, msgs);
			if (newCoverage != null)
				msgs = ((InternalEObject)newCoverage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__COVERAGE, null, msgs);
			msgs = basicSetCoverage(newCoverage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__COVERAGE, newCoverage, newCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement getDataElement() {
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataElement(DataElement newDataElement, NotificationChain msgs) {
		DataElement oldDataElement = dataElement;
		dataElement = newDataElement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT, oldDataElement, newDataElement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElement(DataElement newDataElement) {
		if (newDataElement != dataElement) {
			NotificationChain msgs = null;
			if (dataElement != null)
				msgs = ((InternalEObject)dataElement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT, null, msgs);
			if (newDataElement != null)
				msgs = ((InternalEObject)newDataElement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT, null, msgs);
			msgs = basicSetDataElement(newDataElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT, newDataElement, newDataElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE, null, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE, null, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent getDeviceComponent() {
		return deviceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceComponent(DeviceComponent newDeviceComponent, NotificationChain msgs) {
		DeviceComponent oldDeviceComponent = deviceComponent;
		deviceComponent = newDeviceComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT, oldDeviceComponent, newDeviceComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceComponent(DeviceComponent newDeviceComponent) {
		if (newDeviceComponent != deviceComponent) {
			NotificationChain msgs = null;
			if (deviceComponent != null)
				msgs = ((InternalEObject)deviceComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT, null, msgs);
			if (newDeviceComponent != null)
				msgs = ((InternalEObject)newDeviceComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT, null, msgs);
			msgs = basicSetDeviceComponent(newDeviceComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT, newDeviceComponent, newDeviceComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric getDeviceMetric() {
		return deviceMetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceMetric(DeviceMetric newDeviceMetric, NotificationChain msgs) {
		DeviceMetric oldDeviceMetric = deviceMetric;
		deviceMetric = newDeviceMetric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, oldDeviceMetric, newDeviceMetric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceMetric(DeviceMetric newDeviceMetric) {
		if (newDeviceMetric != deviceMetric) {
			NotificationChain msgs = null;
			if (deviceMetric != null)
				msgs = ((InternalEObject)deviceMetric).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, null, msgs);
			if (newDeviceMetric != null)
				msgs = ((InternalEObject)newDeviceMetric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, null, msgs);
			msgs = basicSetDeviceMetric(newDeviceMetric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC, newDeviceMetric, newDeviceMetric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest getDeviceUseRequest() {
		return deviceUseRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUseRequest(DeviceUseRequest newDeviceUseRequest, NotificationChain msgs) {
		DeviceUseRequest oldDeviceUseRequest = deviceUseRequest;
		deviceUseRequest = newDeviceUseRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST, oldDeviceUseRequest, newDeviceUseRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUseRequest(DeviceUseRequest newDeviceUseRequest) {
		if (newDeviceUseRequest != deviceUseRequest) {
			NotificationChain msgs = null;
			if (deviceUseRequest != null)
				msgs = ((InternalEObject)deviceUseRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST, null, msgs);
			if (newDeviceUseRequest != null)
				msgs = ((InternalEObject)newDeviceUseRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST, null, msgs);
			msgs = basicSetDeviceUseRequest(newDeviceUseRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST, newDeviceUseRequest, newDeviceUseRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement getDeviceUseStatement() {
		return deviceUseStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUseStatement(DeviceUseStatement newDeviceUseStatement, NotificationChain msgs) {
		DeviceUseStatement oldDeviceUseStatement = deviceUseStatement;
		deviceUseStatement = newDeviceUseStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT, oldDeviceUseStatement, newDeviceUseStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUseStatement(DeviceUseStatement newDeviceUseStatement) {
		if (newDeviceUseStatement != deviceUseStatement) {
			NotificationChain msgs = null;
			if (deviceUseStatement != null)
				msgs = ((InternalEObject)deviceUseStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT, null, msgs);
			if (newDeviceUseStatement != null)
				msgs = ((InternalEObject)newDeviceUseStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT, null, msgs);
			msgs = basicSetDeviceUseStatement(newDeviceUseStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT, newDeviceUseStatement, newDeviceUseStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrder getDiagnosticOrder() {
		return diagnosticOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticOrder(DiagnosticOrder newDiagnosticOrder, NotificationChain msgs) {
		DiagnosticOrder oldDiagnosticOrder = diagnosticOrder;
		diagnosticOrder = newDiagnosticOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER, oldDiagnosticOrder, newDiagnosticOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticOrder(DiagnosticOrder newDiagnosticOrder) {
		if (newDiagnosticOrder != diagnosticOrder) {
			NotificationChain msgs = null;
			if (diagnosticOrder != null)
				msgs = ((InternalEObject)diagnosticOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER, null, msgs);
			if (newDiagnosticOrder != null)
				msgs = ((InternalEObject)newDiagnosticOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER, null, msgs);
			msgs = basicSetDiagnosticOrder(newDiagnosticOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER, newDiagnosticOrder, newDiagnosticOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport getDiagnosticReport() {
		return diagnosticReport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticReport(DiagnosticReport newDiagnosticReport, NotificationChain msgs) {
		DiagnosticReport oldDiagnosticReport = diagnosticReport;
		diagnosticReport = newDiagnosticReport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, oldDiagnosticReport, newDiagnosticReport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticReport(DiagnosticReport newDiagnosticReport) {
		if (newDiagnosticReport != diagnosticReport) {
			NotificationChain msgs = null;
			if (diagnosticReport != null)
				msgs = ((InternalEObject)diagnosticReport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, null, msgs);
			if (newDiagnosticReport != null)
				msgs = ((InternalEObject)newDiagnosticReport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, null, msgs);
			msgs = basicSetDiagnosticReport(newDiagnosticReport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT, newDiagnosticReport, newDiagnosticReport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest getDocumentManifest() {
		return documentManifest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentManifest(DocumentManifest newDocumentManifest, NotificationChain msgs) {
		DocumentManifest oldDocumentManifest = documentManifest;
		documentManifest = newDocumentManifest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST, oldDocumentManifest, newDocumentManifest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentManifest(DocumentManifest newDocumentManifest) {
		if (newDocumentManifest != documentManifest) {
			NotificationChain msgs = null;
			if (documentManifest != null)
				msgs = ((InternalEObject)documentManifest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST, null, msgs);
			if (newDocumentManifest != null)
				msgs = ((InternalEObject)newDocumentManifest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST, null, msgs);
			msgs = basicSetDocumentManifest(newDocumentManifest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST, newDocumentManifest, newDocumentManifest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference getDocumentReference() {
		return documentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DocumentReference newDocumentReference, NotificationChain msgs) {
		DocumentReference oldDocumentReference = documentReference;
		documentReference = newDocumentReference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, oldDocumentReference, newDocumentReference);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(DocumentReference newDocumentReference) {
		if (newDocumentReference != documentReference) {
			NotificationChain msgs = null;
			if (documentReference != null)
				msgs = ((InternalEObject)documentReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, null, msgs);
			if (newDocumentReference != null)
				msgs = ((InternalEObject)newDocumentReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, null, msgs);
			msgs = basicSetDocumentReference(newDocumentReference, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE, newDocumentReference, newDocumentReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest getEligibilityRequest() {
		return eligibilityRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibilityRequest(EligibilityRequest newEligibilityRequest, NotificationChain msgs) {
		EligibilityRequest oldEligibilityRequest = eligibilityRequest;
		eligibilityRequest = newEligibilityRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST, oldEligibilityRequest, newEligibilityRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityRequest(EligibilityRequest newEligibilityRequest) {
		if (newEligibilityRequest != eligibilityRequest) {
			NotificationChain msgs = null;
			if (eligibilityRequest != null)
				msgs = ((InternalEObject)eligibilityRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST, null, msgs);
			if (newEligibilityRequest != null)
				msgs = ((InternalEObject)newEligibilityRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST, null, msgs);
			msgs = basicSetEligibilityRequest(newEligibilityRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST, newEligibilityRequest, newEligibilityRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse getEligibilityResponse() {
		return eligibilityResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibilityResponse(EligibilityResponse newEligibilityResponse, NotificationChain msgs) {
		EligibilityResponse oldEligibilityResponse = eligibilityResponse;
		eligibilityResponse = newEligibilityResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE, oldEligibilityResponse, newEligibilityResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityResponse(EligibilityResponse newEligibilityResponse) {
		if (newEligibilityResponse != eligibilityResponse) {
			NotificationChain msgs = null;
			if (eligibilityResponse != null)
				msgs = ((InternalEObject)eligibilityResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE, null, msgs);
			if (newEligibilityResponse != null)
				msgs = ((InternalEObject)newEligibilityResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE, null, msgs);
			msgs = basicSetEligibilityResponse(newEligibilityResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE, newEligibilityResponse, newEligibilityResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		return encounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Encounter newEncounter, NotificationChain msgs) {
		Encounter oldEncounter = encounter;
		encounter = newEncounter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, oldEncounter, newEncounter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		if (newEncounter != encounter) {
			NotificationChain msgs = null;
			if (encounter != null)
				msgs = ((InternalEObject)encounter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, null, msgs);
			if (newEncounter != null)
				msgs = ((InternalEObject)newEncounter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, null, msgs);
			msgs = basicSetEncounter(newEncounter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENCOUNTER, newEncounter, newEncounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest getEnrollmentRequest() {
		return enrollmentRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentRequest(EnrollmentRequest newEnrollmentRequest, NotificationChain msgs) {
		EnrollmentRequest oldEnrollmentRequest = enrollmentRequest;
		enrollmentRequest = newEnrollmentRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, oldEnrollmentRequest, newEnrollmentRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentRequest(EnrollmentRequest newEnrollmentRequest) {
		if (newEnrollmentRequest != enrollmentRequest) {
			NotificationChain msgs = null;
			if (enrollmentRequest != null)
				msgs = ((InternalEObject)enrollmentRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, null, msgs);
			if (newEnrollmentRequest != null)
				msgs = ((InternalEObject)newEnrollmentRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, null, msgs);
			msgs = basicSetEnrollmentRequest(newEnrollmentRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST, newEnrollmentRequest, newEnrollmentRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse getEnrollmentResponse() {
		return enrollmentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentResponse(EnrollmentResponse newEnrollmentResponse, NotificationChain msgs) {
		EnrollmentResponse oldEnrollmentResponse = enrollmentResponse;
		enrollmentResponse = newEnrollmentResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, oldEnrollmentResponse, newEnrollmentResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentResponse(EnrollmentResponse newEnrollmentResponse) {
		if (newEnrollmentResponse != enrollmentResponse) {
			NotificationChain msgs = null;
			if (enrollmentResponse != null)
				msgs = ((InternalEObject)enrollmentResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, null, msgs);
			if (newEnrollmentResponse != null)
				msgs = ((InternalEObject)newEnrollmentResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, null, msgs);
			msgs = basicSetEnrollmentResponse(newEnrollmentResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE, newEnrollmentResponse, newEnrollmentResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpisodeOfCare(EpisodeOfCare newEpisodeOfCare, NotificationChain msgs) {
		EpisodeOfCare oldEpisodeOfCare = episodeOfCare;
		episodeOfCare = newEpisodeOfCare;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, oldEpisodeOfCare, newEpisodeOfCare);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisodeOfCare(EpisodeOfCare newEpisodeOfCare) {
		if (newEpisodeOfCare != episodeOfCare) {
			NotificationChain msgs = null;
			if (episodeOfCare != null)
				msgs = ((InternalEObject)episodeOfCare).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, null, msgs);
			if (newEpisodeOfCare != null)
				msgs = ((InternalEObject)newEpisodeOfCare).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, null, msgs);
			msgs = basicSetEpisodeOfCare(newEpisodeOfCare, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE, newEpisodeOfCare, newEpisodeOfCare));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit getExplanationOfBenefit() {
		return explanationOfBenefit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit, NotificationChain msgs) {
		ExplanationOfBenefit oldExplanationOfBenefit = explanationOfBenefit;
		explanationOfBenefit = newExplanationOfBenefit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, oldExplanationOfBenefit, newExplanationOfBenefit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit) {
		if (newExplanationOfBenefit != explanationOfBenefit) {
			NotificationChain msgs = null;
			if (explanationOfBenefit != null)
				msgs = ((InternalEObject)explanationOfBenefit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, null, msgs);
			if (newExplanationOfBenefit != null)
				msgs = ((InternalEObject)newExplanationOfBenefit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, null, msgs);
			msgs = basicSetExplanationOfBenefit(newExplanationOfBenefit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT, newExplanationOfBenefit, newExplanationOfBenefit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory getFamilyMemberHistory() {
		return familyMemberHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory, NotificationChain msgs) {
		FamilyMemberHistory oldFamilyMemberHistory = familyMemberHistory;
		familyMemberHistory = newFamilyMemberHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, oldFamilyMemberHistory, newFamilyMemberHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory) {
		if (newFamilyMemberHistory != familyMemberHistory) {
			NotificationChain msgs = null;
			if (familyMemberHistory != null)
				msgs = ((InternalEObject)familyMemberHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, null, msgs);
			if (newFamilyMemberHistory != null)
				msgs = ((InternalEObject)newFamilyMemberHistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, null, msgs);
			msgs = basicSetFamilyMemberHistory(newFamilyMemberHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY, newFamilyMemberHistory, newFamilyMemberHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag getFlag() {
		return flag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(Flag newFlag, NotificationChain msgs) {
		Flag oldFlag = flag;
		flag = newFlag;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FLAG, oldFlag, newFlag);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(Flag newFlag) {
		if (newFlag != flag) {
			NotificationChain msgs = null;
			if (flag != null)
				msgs = ((InternalEObject)flag).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FLAG, null, msgs);
			if (newFlag != null)
				msgs = ((InternalEObject)newFlag).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__FLAG, null, msgs);
			msgs = basicSetFlag(newFlag, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__FLAG, newFlag, newFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		Goal oldGoal = goal;
		goal = newGoal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GOAL, oldGoal, newGoal);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		if (newGoal != goal) {
			NotificationChain msgs = null;
			if (goal != null)
				msgs = ((InternalEObject)goal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GOAL, null, msgs);
			if (newGoal != null)
				msgs = ((InternalEObject)newGoal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GOAL, null, msgs);
			msgs = basicSetGoal(newGoal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GOAL, newGoal, newGoal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		Group oldGroup = group;
		group = newGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GROUP, oldGroup, newGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		if (newGroup != group) {
			NotificationChain msgs = null;
			if (group != null)
				msgs = ((InternalEObject)group).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GROUP, null, msgs);
			if (newGroup != null)
				msgs = ((InternalEObject)newGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__GROUP, null, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService getHealthcareService() {
		return healthcareService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthcareService(HealthcareService newHealthcareService, NotificationChain msgs) {
		HealthcareService oldHealthcareService = healthcareService;
		healthcareService = newHealthcareService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, oldHealthcareService, newHealthcareService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthcareService(HealthcareService newHealthcareService) {
		if (newHealthcareService != healthcareService) {
			NotificationChain msgs = null;
			if (healthcareService != null)
				msgs = ((InternalEObject)healthcareService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, null, msgs);
			if (newHealthcareService != null)
				msgs = ((InternalEObject)newHealthcareService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, null, msgs);
			msgs = basicSetHealthcareService(newHealthcareService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE, newHealthcareService, newHealthcareService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelection getImagingObjectSelection() {
		return imagingObjectSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingObjectSelection(ImagingObjectSelection newImagingObjectSelection, NotificationChain msgs) {
		ImagingObjectSelection oldImagingObjectSelection = imagingObjectSelection;
		imagingObjectSelection = newImagingObjectSelection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION, oldImagingObjectSelection, newImagingObjectSelection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingObjectSelection(ImagingObjectSelection newImagingObjectSelection) {
		if (newImagingObjectSelection != imagingObjectSelection) {
			NotificationChain msgs = null;
			if (imagingObjectSelection != null)
				msgs = ((InternalEObject)imagingObjectSelection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION, null, msgs);
			if (newImagingObjectSelection != null)
				msgs = ((InternalEObject)newImagingObjectSelection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION, null, msgs);
			msgs = basicSetImagingObjectSelection(newImagingObjectSelection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION, newImagingObjectSelection, newImagingObjectSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy getImagingStudy() {
		return imagingStudy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingStudy(ImagingStudy newImagingStudy, NotificationChain msgs) {
		ImagingStudy oldImagingStudy = imagingStudy;
		imagingStudy = newImagingStudy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, oldImagingStudy, newImagingStudy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		if (newImagingStudy != imagingStudy) {
			NotificationChain msgs = null;
			if (imagingStudy != null)
				msgs = ((InternalEObject)imagingStudy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, null, msgs);
			if (newImagingStudy != null)
				msgs = ((InternalEObject)newImagingStudy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, null, msgs);
			msgs = basicSetImagingStudy(newImagingStudy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY, newImagingStudy, newImagingStudy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization getImmunization() {
		return immunization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunization(Immunization newImmunization, NotificationChain msgs) {
		Immunization oldImmunization = immunization;
		immunization = newImmunization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, oldImmunization, newImmunization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunization(Immunization newImmunization) {
		if (newImmunization != immunization) {
			NotificationChain msgs = null;
			if (immunization != null)
				msgs = ((InternalEObject)immunization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, null, msgs);
			if (newImmunization != null)
				msgs = ((InternalEObject)newImmunization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, null, msgs);
			msgs = basicSetImmunization(newImmunization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION, newImmunization, newImmunization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation getImmunizationRecommendation() {
		return immunizationRecommendation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation, NotificationChain msgs) {
		ImmunizationRecommendation oldImmunizationRecommendation = immunizationRecommendation;
		immunizationRecommendation = newImmunizationRecommendation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, oldImmunizationRecommendation, newImmunizationRecommendation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation) {
		if (newImmunizationRecommendation != immunizationRecommendation) {
			NotificationChain msgs = null;
			if (immunizationRecommendation != null)
				msgs = ((InternalEObject)immunizationRecommendation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, null, msgs);
			if (newImmunizationRecommendation != null)
				msgs = ((InternalEObject)newImmunizationRecommendation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, null, msgs);
			msgs = basicSetImmunizationRecommendation(newImmunizationRecommendation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION, newImmunizationRecommendation, newImmunizationRecommendation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationGuide getImplementationGuide() {
		return implementationGuide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationGuide(ImplementationGuide newImplementationGuide, NotificationChain msgs) {
		ImplementationGuide oldImplementationGuide = implementationGuide;
		implementationGuide = newImplementationGuide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, oldImplementationGuide, newImplementationGuide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationGuide(ImplementationGuide newImplementationGuide) {
		if (newImplementationGuide != implementationGuide) {
			NotificationChain msgs = null;
			if (implementationGuide != null)
				msgs = ((InternalEObject)implementationGuide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, null, msgs);
			if (newImplementationGuide != null)
				msgs = ((InternalEObject)newImplementationGuide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, null, msgs);
			msgs = basicSetImplementationGuide(newImplementationGuide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE, newImplementationGuide, newImplementationGuide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		List oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media getMedia() {
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(Media newMedia, NotificationChain msgs) {
		Media oldMedia = media;
		media = newMedia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDIA, oldMedia, newMedia);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Media newMedia) {
		if (newMedia != media) {
			NotificationChain msgs = null;
			if (media != null)
				msgs = ((InternalEObject)media).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDIA, null, msgs);
			if (newMedia != null)
				msgs = ((InternalEObject)newMedia).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDIA, null, msgs);
			msgs = basicSetMedia(newMedia, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDIA, newMedia, newMedia));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication getMedication() {
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Medication newMedication, NotificationChain msgs) {
		Medication oldMedication = medication;
		medication = newMedication;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION, oldMedication, newMedication);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(Medication newMedication) {
		if (newMedication != medication) {
			NotificationChain msgs = null;
			if (medication != null)
				msgs = ((InternalEObject)medication).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION, null, msgs);
			if (newMedication != null)
				msgs = ((InternalEObject)newMedication).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION, null, msgs);
			msgs = basicSetMedication(newMedication, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION, newMedication, newMedication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration getMedicationAdministration() {
		return medicationAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationAdministration(MedicationAdministration newMedicationAdministration, NotificationChain msgs) {
		MedicationAdministration oldMedicationAdministration = medicationAdministration;
		medicationAdministration = newMedicationAdministration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, oldMedicationAdministration, newMedicationAdministration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationAdministration(MedicationAdministration newMedicationAdministration) {
		if (newMedicationAdministration != medicationAdministration) {
			NotificationChain msgs = null;
			if (medicationAdministration != null)
				msgs = ((InternalEObject)medicationAdministration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, null, msgs);
			if (newMedicationAdministration != null)
				msgs = ((InternalEObject)newMedicationAdministration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, null, msgs);
			msgs = basicSetMedicationAdministration(newMedicationAdministration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION, newMedicationAdministration, newMedicationAdministration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense getMedicationDispense() {
		return medicationDispense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationDispense(MedicationDispense newMedicationDispense, NotificationChain msgs) {
		MedicationDispense oldMedicationDispense = medicationDispense;
		medicationDispense = newMedicationDispense;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, oldMedicationDispense, newMedicationDispense);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationDispense(MedicationDispense newMedicationDispense) {
		if (newMedicationDispense != medicationDispense) {
			NotificationChain msgs = null;
			if (medicationDispense != null)
				msgs = ((InternalEObject)medicationDispense).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, null, msgs);
			if (newMedicationDispense != null)
				msgs = ((InternalEObject)newMedicationDispense).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, null, msgs);
			msgs = basicSetMedicationDispense(newMedicationDispense, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE, newMedicationDispense, newMedicationDispense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescription getMedicationPrescription() {
		return medicationPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationPrescription(MedicationPrescription newMedicationPrescription, NotificationChain msgs) {
		MedicationPrescription oldMedicationPrescription = medicationPrescription;
		medicationPrescription = newMedicationPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION, oldMedicationPrescription, newMedicationPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationPrescription(MedicationPrescription newMedicationPrescription) {
		if (newMedicationPrescription != medicationPrescription) {
			NotificationChain msgs = null;
			if (medicationPrescription != null)
				msgs = ((InternalEObject)medicationPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION, null, msgs);
			if (newMedicationPrescription != null)
				msgs = ((InternalEObject)newMedicationPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION, null, msgs);
			msgs = basicSetMedicationPrescription(newMedicationPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION, newMedicationPrescription, newMedicationPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement getMedicationStatement() {
		return medicationStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationStatement(MedicationStatement newMedicationStatement, NotificationChain msgs) {
		MedicationStatement oldMedicationStatement = medicationStatement;
		medicationStatement = newMedicationStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, oldMedicationStatement, newMedicationStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationStatement(MedicationStatement newMedicationStatement) {
		if (newMedicationStatement != medicationStatement) {
			NotificationChain msgs = null;
			if (medicationStatement != null)
				msgs = ((InternalEObject)medicationStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, null, msgs);
			if (newMedicationStatement != null)
				msgs = ((InternalEObject)newMedicationStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, null, msgs);
			msgs = basicSetMedicationStatement(newMedicationStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT, newMedicationStatement, newMedicationStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader getMessageHeader() {
		return messageHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageHeader(MessageHeader newMessageHeader, NotificationChain msgs) {
		MessageHeader oldMessageHeader = messageHeader;
		messageHeader = newMessageHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, oldMessageHeader, newMessageHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageHeader(MessageHeader newMessageHeader) {
		if (newMessageHeader != messageHeader) {
			NotificationChain msgs = null;
			if (messageHeader != null)
				msgs = ((InternalEObject)messageHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, null, msgs);
			if (newMessageHeader != null)
				msgs = ((InternalEObject)newMessageHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, null, msgs);
			msgs = basicSetMessageHeader(newMessageHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER, newMessageHeader, newMessageHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem getNamingSystem() {
		return namingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingSystem(NamingSystem newNamingSystem, NotificationChain msgs) {
		NamingSystem oldNamingSystem = namingSystem;
		namingSystem = newNamingSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, oldNamingSystem, newNamingSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingSystem(NamingSystem newNamingSystem) {
		if (newNamingSystem != namingSystem) {
			NotificationChain msgs = null;
			if (namingSystem != null)
				msgs = ((InternalEObject)namingSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, null, msgs);
			if (newNamingSystem != null)
				msgs = ((InternalEObject)newNamingSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, null, msgs);
			msgs = basicSetNamingSystem(newNamingSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM, newNamingSystem, newNamingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder getNutritionOrder() {
		return nutritionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionOrder(NutritionOrder newNutritionOrder, NotificationChain msgs) {
		NutritionOrder oldNutritionOrder = nutritionOrder;
		nutritionOrder = newNutritionOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, oldNutritionOrder, newNutritionOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionOrder(NutritionOrder newNutritionOrder) {
		if (newNutritionOrder != nutritionOrder) {
			NotificationChain msgs = null;
			if (nutritionOrder != null)
				msgs = ((InternalEObject)nutritionOrder).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, null, msgs);
			if (newNutritionOrder != null)
				msgs = ((InternalEObject)newNutritionOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, null, msgs);
			msgs = basicSetNutritionOrder(newNutritionOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER, newNutritionOrder, newNutritionOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation() {
		return observation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		Observation oldObservation = observation;
		observation = newObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION, oldObservation, newObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Observation newObservation) {
		if (newObservation != observation) {
			NotificationChain msgs = null;
			if (observation != null)
				msgs = ((InternalEObject)observation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION, null, msgs);
			if (newObservation != null)
				msgs = ((InternalEObject)newObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OBSERVATION, null, msgs);
			msgs = basicSetObservation(newObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OBSERVATION, newObservation, newObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getOperationDefinition() {
		return operationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationDefinition(OperationDefinition newOperationDefinition, NotificationChain msgs) {
		OperationDefinition oldOperationDefinition = operationDefinition;
		operationDefinition = newOperationDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, oldOperationDefinition, newOperationDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationDefinition(OperationDefinition newOperationDefinition) {
		if (newOperationDefinition != operationDefinition) {
			NotificationChain msgs = null;
			if (operationDefinition != null)
				msgs = ((InternalEObject)operationDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, null, msgs);
			if (newOperationDefinition != null)
				msgs = ((InternalEObject)newOperationDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, null, msgs);
			msgs = basicSetOperationDefinition(newOperationDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION, newOperationDefinition, newOperationDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome getOperationOutcome() {
		return operationOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationOutcome(OperationOutcome newOperationOutcome, NotificationChain msgs) {
		OperationOutcome oldOperationOutcome = operationOutcome;
		operationOutcome = newOperationOutcome;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, oldOperationOutcome, newOperationOutcome);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationOutcome(OperationOutcome newOperationOutcome) {
		if (newOperationOutcome != operationOutcome) {
			NotificationChain msgs = null;
			if (operationOutcome != null)
				msgs = ((InternalEObject)operationOutcome).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, null, msgs);
			if (newOperationOutcome != null)
				msgs = ((InternalEObject)newOperationOutcome).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, null, msgs);
			msgs = basicSetOperationOutcome(newOperationOutcome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME, newOperationOutcome, newOperationOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORDER, oldOrder, newOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderResponse getOrderResponse() {
		return orderResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderResponse(OrderResponse newOrderResponse, NotificationChain msgs) {
		OrderResponse oldOrderResponse = orderResponse;
		orderResponse = newOrderResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE, oldOrderResponse, newOrderResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderResponse(OrderResponse newOrderResponse) {
		if (newOrderResponse != orderResponse) {
			NotificationChain msgs = null;
			if (orderResponse != null)
				msgs = ((InternalEObject)orderResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE, null, msgs);
			if (newOrderResponse != null)
				msgs = ((InternalEObject)newOrderResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE, null, msgs);
			msgs = basicSetOrderResponse(newOrderResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE, newOrderResponse, newOrderResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		return organization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		Organization oldOrganization = organization;
		organization = newOrganization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, oldOrganization, newOrganization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		if (newOrganization != organization) {
			NotificationChain msgs = null;
			if (organization != null)
				msgs = ((InternalEObject)organization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, null, msgs);
			if (newOrganization != null)
				msgs = ((InternalEObject)newOrganization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, null, msgs);
			msgs = basicSetOrganization(newOrganization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__ORGANIZATION, newOrganization, newOrganization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		Patient oldPatient = patient;
		patient = newPatient;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PATIENT, oldPatient, newPatient);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		if (newPatient != patient) {
			NotificationChain msgs = null;
			if (patient != null)
				msgs = ((InternalEObject)patient).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PATIENT, null, msgs);
			if (newPatient != null)
				msgs = ((InternalEObject)newPatient).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PATIENT, null, msgs);
			msgs = basicSetPatient(newPatient, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PATIENT, newPatient, newPatient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice getPaymentNotice() {
		return paymentNotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentNotice(PaymentNotice newPaymentNotice, NotificationChain msgs) {
		PaymentNotice oldPaymentNotice = paymentNotice;
		paymentNotice = newPaymentNotice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, oldPaymentNotice, newPaymentNotice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentNotice(PaymentNotice newPaymentNotice) {
		if (newPaymentNotice != paymentNotice) {
			NotificationChain msgs = null;
			if (paymentNotice != null)
				msgs = ((InternalEObject)paymentNotice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, null, msgs);
			if (newPaymentNotice != null)
				msgs = ((InternalEObject)newPaymentNotice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, null, msgs);
			msgs = basicSetPaymentNotice(newPaymentNotice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE, newPaymentNotice, newPaymentNotice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation getPaymentReconciliation() {
		return paymentReconciliation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentReconciliation(PaymentReconciliation newPaymentReconciliation, NotificationChain msgs) {
		PaymentReconciliation oldPaymentReconciliation = paymentReconciliation;
		paymentReconciliation = newPaymentReconciliation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, oldPaymentReconciliation, newPaymentReconciliation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentReconciliation(PaymentReconciliation newPaymentReconciliation) {
		if (newPaymentReconciliation != paymentReconciliation) {
			NotificationChain msgs = null;
			if (paymentReconciliation != null)
				msgs = ((InternalEObject)paymentReconciliation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, null, msgs);
			if (newPaymentReconciliation != null)
				msgs = ((InternalEObject)newPaymentReconciliation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, null, msgs);
			msgs = basicSetPaymentReconciliation(newPaymentReconciliation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION, newPaymentReconciliation, newPaymentReconciliation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERSON, oldPerson, newPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		if (newPerson != person) {
			NotificationChain msgs = null;
			if (person != null)
				msgs = ((InternalEObject)person).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERSON, null, msgs);
			if (newPerson != null)
				msgs = ((InternalEObject)newPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PERSON, null, msgs);
			msgs = basicSetPerson(newPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PERSON, newPerson, newPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPractitioner() {
		return practitioner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Practitioner newPractitioner, NotificationChain msgs) {
		Practitioner oldPractitioner = practitioner;
		practitioner = newPractitioner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, oldPractitioner, newPractitioner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Practitioner newPractitioner) {
		if (newPractitioner != practitioner) {
			NotificationChain msgs = null;
			if (practitioner != null)
				msgs = ((InternalEObject)practitioner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, null, msgs);
			if (newPractitioner != null)
				msgs = ((InternalEObject)newPractitioner).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, null, msgs);
			msgs = basicSetPractitioner(newPractitioner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PRACTITIONER, newPractitioner, newPractitioner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		return procedure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		Procedure oldProcedure = procedure;
		procedure = newProcedure;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE, oldProcedure, newProcedure);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		if (newProcedure != procedure) {
			NotificationChain msgs = null;
			if (procedure != null)
				msgs = ((InternalEObject)procedure).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE, null, msgs);
			if (newProcedure != null)
				msgs = ((InternalEObject)newProcedure).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE, null, msgs);
			msgs = basicSetProcedure(newProcedure, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE, newProcedure, newProcedure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest getProcedureRequest() {
		return procedureRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureRequest(ProcedureRequest newProcedureRequest, NotificationChain msgs) {
		ProcedureRequest oldProcedureRequest = procedureRequest;
		procedureRequest = newProcedureRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST, oldProcedureRequest, newProcedureRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureRequest(ProcedureRequest newProcedureRequest) {
		if (newProcedureRequest != procedureRequest) {
			NotificationChain msgs = null;
			if (procedureRequest != null)
				msgs = ((InternalEObject)procedureRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST, null, msgs);
			if (newProcedureRequest != null)
				msgs = ((InternalEObject)newProcedureRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST, null, msgs);
			msgs = basicSetProcedureRequest(newProcedureRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST, newProcedureRequest, newProcedureRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest getProcessRequest() {
		return processRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessRequest(ProcessRequest newProcessRequest, NotificationChain msgs) {
		ProcessRequest oldProcessRequest = processRequest;
		processRequest = newProcessRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST, oldProcessRequest, newProcessRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRequest(ProcessRequest newProcessRequest) {
		if (newProcessRequest != processRequest) {
			NotificationChain msgs = null;
			if (processRequest != null)
				msgs = ((InternalEObject)processRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST, null, msgs);
			if (newProcessRequest != null)
				msgs = ((InternalEObject)newProcessRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST, null, msgs);
			msgs = basicSetProcessRequest(newProcessRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST, newProcessRequest, newProcessRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse getProcessResponse() {
		return processResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessResponse(ProcessResponse newProcessResponse, NotificationChain msgs) {
		ProcessResponse oldProcessResponse = processResponse;
		processResponse = newProcessResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE, oldProcessResponse, newProcessResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessResponse(ProcessResponse newProcessResponse) {
		if (newProcessResponse != processResponse) {
			NotificationChain msgs = null;
			if (processResponse != null)
				msgs = ((InternalEObject)processResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE, null, msgs);
			if (newProcessResponse != null)
				msgs = ((InternalEObject)newProcessResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE, null, msgs);
			msgs = basicSetProcessResponse(newProcessResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE, newProcessResponse, newProcessResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance getProvenance() {
		return provenance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(Provenance newProvenance, NotificationChain msgs) {
		Provenance oldProvenance = provenance;
		provenance = newProvenance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROVENANCE, oldProvenance, newProvenance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(Provenance newProvenance) {
		if (newProvenance != provenance) {
			NotificationChain msgs = null;
			if (provenance != null)
				msgs = ((InternalEObject)provenance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROVENANCE, null, msgs);
			if (newProvenance != null)
				msgs = ((InternalEObject)newProvenance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PROVENANCE, null, msgs);
			msgs = basicSetProvenance(newProvenance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PROVENANCE, newProvenance, newProvenance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		return questionnaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		Questionnaire oldQuestionnaire = questionnaire;
		questionnaire = newQuestionnaire;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, oldQuestionnaire, newQuestionnaire);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		if (newQuestionnaire != questionnaire) {
			NotificationChain msgs = null;
			if (questionnaire != null)
				msgs = ((InternalEObject)questionnaire).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, null, msgs);
			if (newQuestionnaire != null)
				msgs = ((InternalEObject)newQuestionnaire).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, null, msgs);
			msgs = basicSetQuestionnaire(newQuestionnaire, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE, newQuestionnaire, newQuestionnaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponse getQuestionnaireResponse() {
		return questionnaireResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse, NotificationChain msgs) {
		QuestionnaireResponse oldQuestionnaireResponse = questionnaireResponse;
		questionnaireResponse = newQuestionnaireResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, oldQuestionnaireResponse, newQuestionnaireResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaireResponse(QuestionnaireResponse newQuestionnaireResponse) {
		if (newQuestionnaireResponse != questionnaireResponse) {
			NotificationChain msgs = null;
			if (questionnaireResponse != null)
				msgs = ((InternalEObject)questionnaireResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, null, msgs);
			if (newQuestionnaireResponse != null)
				msgs = ((InternalEObject)newQuestionnaireResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, null, msgs);
			msgs = basicSetQuestionnaireResponse(newQuestionnaireResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE, newQuestionnaireResponse, newQuestionnaireResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest getReferralRequest() {
		return referralRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralRequest(ReferralRequest newReferralRequest, NotificationChain msgs) {
		ReferralRequest oldReferralRequest = referralRequest;
		referralRequest = newReferralRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST, oldReferralRequest, newReferralRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralRequest(ReferralRequest newReferralRequest) {
		if (newReferralRequest != referralRequest) {
			NotificationChain msgs = null;
			if (referralRequest != null)
				msgs = ((InternalEObject)referralRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST, null, msgs);
			if (newReferralRequest != null)
				msgs = ((InternalEObject)newReferralRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST, null, msgs);
			msgs = basicSetReferralRequest(newReferralRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST, newReferralRequest, newReferralRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson getRelatedPerson() {
		return relatedPerson;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPerson(RelatedPerson newRelatedPerson, NotificationChain msgs) {
		RelatedPerson oldRelatedPerson = relatedPerson;
		relatedPerson = newRelatedPerson;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, oldRelatedPerson, newRelatedPerson);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPerson(RelatedPerson newRelatedPerson) {
		if (newRelatedPerson != relatedPerson) {
			NotificationChain msgs = null;
			if (relatedPerson != null)
				msgs = ((InternalEObject)relatedPerson).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, null, msgs);
			if (newRelatedPerson != null)
				msgs = ((InternalEObject)newRelatedPerson).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, null, msgs);
			msgs = basicSetRelatedPerson(newRelatedPerson, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON, newRelatedPerson, newRelatedPerson));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment getRiskAssessment() {
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		RiskAssessment oldRiskAssessment = riskAssessment;
		riskAssessment = newRiskAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, oldRiskAssessment, newRiskAssessment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		if (newRiskAssessment != riskAssessment) {
			NotificationChain msgs = null;
			if (riskAssessment != null)
				msgs = ((InternalEObject)riskAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, null, msgs);
			if (newRiskAssessment != null)
				msgs = ((InternalEObject)newRiskAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, null, msgs);
			msgs = basicSetRiskAssessment(newRiskAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT, newRiskAssessment, newRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		Schedule oldSchedule = schedule;
		schedule = newSchedule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SCHEDULE, oldSchedule, newSchedule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		if (newSchedule != schedule) {
			NotificationChain msgs = null;
			if (schedule != null)
				msgs = ((InternalEObject)schedule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SCHEDULE, null, msgs);
			if (newSchedule != null)
				msgs = ((InternalEObject)newSchedule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SCHEDULE, null, msgs);
			msgs = basicSetSchedule(newSchedule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SCHEDULE, newSchedule, newSchedule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter getSearchParameter() {
		return searchParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParameter(SearchParameter newSearchParameter, NotificationChain msgs) {
		SearchParameter oldSearchParameter = searchParameter;
		searchParameter = newSearchParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, oldSearchParameter, newSearchParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchParameter(SearchParameter newSearchParameter) {
		if (newSearchParameter != searchParameter) {
			NotificationChain msgs = null;
			if (searchParameter != null)
				msgs = ((InternalEObject)searchParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, null, msgs);
			if (newSearchParameter != null)
				msgs = ((InternalEObject)newSearchParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, null, msgs);
			msgs = basicSetSearchParameter(newSearchParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER, newSearchParameter, newSearchParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getSlot() {
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs) {
		Slot oldSlot = slot;
		slot = newSlot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SLOT, oldSlot, newSlot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(Slot newSlot) {
		if (newSlot != slot) {
			NotificationChain msgs = null;
			if (slot != null)
				msgs = ((InternalEObject)slot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SLOT, null, msgs);
			if (newSlot != null)
				msgs = ((InternalEObject)newSlot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SLOT, null, msgs);
			msgs = basicSetSlot(newSlot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SLOT, newSlot, newSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen getSpecimen() {
		return specimen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Specimen newSpecimen, NotificationChain msgs) {
		Specimen oldSpecimen = specimen;
		specimen = newSpecimen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN, oldSpecimen, newSpecimen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Specimen newSpecimen) {
		if (newSpecimen != specimen) {
			NotificationChain msgs = null;
			if (specimen != null)
				msgs = ((InternalEObject)specimen).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN, null, msgs);
			if (newSpecimen != null)
				msgs = ((InternalEObject)newSpecimen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SPECIMEN, null, msgs);
			msgs = basicSetSpecimen(newSpecimen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SPECIMEN, newSpecimen, newSpecimen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getStructureDefinition() {
		return structureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		StructureDefinition oldStructureDefinition = structureDefinition;
		structureDefinition = newStructureDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, oldStructureDefinition, newStructureDefinition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		if (newStructureDefinition != structureDefinition) {
			NotificationChain msgs = null;
			if (structureDefinition != null)
				msgs = ((InternalEObject)structureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, null, msgs);
			if (newStructureDefinition != null)
				msgs = ((InternalEObject)newStructureDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, null, msgs);
			msgs = basicSetStructureDefinition(newStructureDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION, newStructureDefinition, newStructureDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription getSubscription() {
		return subscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Subscription newSubscription, NotificationChain msgs) {
		Subscription oldSubscription = subscription;
		subscription = newSubscription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, oldSubscription, newSubscription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(Subscription newSubscription) {
		if (newSubscription != subscription) {
			NotificationChain msgs = null;
			if (subscription != null)
				msgs = ((InternalEObject)subscription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, null, msgs);
			if (newSubscription != null)
				msgs = ((InternalEObject)newSubscription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, null, msgs);
			msgs = basicSetSubscription(newSubscription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION, newSubscription, newSubscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance getSubstance() {
		return substance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(Substance newSubstance, NotificationChain msgs) {
		Substance oldSubstance = substance;
		substance = newSubstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, oldSubstance, newSubstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(Substance newSubstance) {
		if (newSubstance != substance) {
			NotificationChain msgs = null;
			if (substance != null)
				msgs = ((InternalEObject)substance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, null, msgs);
			if (newSubstance != null)
				msgs = ((InternalEObject)newSubstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, null, msgs);
			msgs = basicSetSubstance(newSubstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUBSTANCE, newSubstance, newSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyDelivery getSupplyDelivery() {
		return supplyDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyDelivery(SupplyDelivery newSupplyDelivery, NotificationChain msgs) {
		SupplyDelivery oldSupplyDelivery = supplyDelivery;
		supplyDelivery = newSupplyDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, oldSupplyDelivery, newSupplyDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyDelivery(SupplyDelivery newSupplyDelivery) {
		if (newSupplyDelivery != supplyDelivery) {
			NotificationChain msgs = null;
			if (supplyDelivery != null)
				msgs = ((InternalEObject)supplyDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, null, msgs);
			if (newSupplyDelivery != null)
				msgs = ((InternalEObject)newSupplyDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, null, msgs);
			msgs = basicSetSupplyDelivery(newSupplyDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY, newSupplyDelivery, newSupplyDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupplyRequest getSupplyRequest() {
		return supplyRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupplyRequest(SupplyRequest newSupplyRequest, NotificationChain msgs) {
		SupplyRequest oldSupplyRequest = supplyRequest;
		supplyRequest = newSupplyRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, oldSupplyRequest, newSupplyRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplyRequest(SupplyRequest newSupplyRequest) {
		if (newSupplyRequest != supplyRequest) {
			NotificationChain msgs = null;
			if (supplyRequest != null)
				msgs = ((InternalEObject)supplyRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, null, msgs);
			if (newSupplyRequest != null)
				msgs = ((InternalEObject)newSupplyRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, null, msgs);
			msgs = basicSetSupplyRequest(newSupplyRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST, newSupplyRequest, newSupplyRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestScript getTestScript() {
		return testScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTestScript(TestScript newTestScript, NotificationChain msgs) {
		TestScript oldTestScript = testScript;
		testScript = newTestScript;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, oldTestScript, newTestScript);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestScript(TestScript newTestScript) {
		if (newTestScript != testScript) {
			NotificationChain msgs = null;
			if (testScript != null)
				msgs = ((InternalEObject)testScript).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, null, msgs);
			if (newTestScript != null)
				msgs = ((InternalEObject)newTestScript).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, null, msgs);
			msgs = basicSetTestScript(newTestScript, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT, newTestScript, newTestScript));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getValueSet() {
		return valueSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		ValueSet oldValueSet = valueSet;
		valueSet = newValueSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VALUE_SET, oldValueSet, newValueSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(ValueSet newValueSet) {
		if (newValueSet != valueSet) {
			NotificationChain msgs = null;
			if (valueSet != null)
				msgs = ((InternalEObject)valueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VALUE_SET, null, msgs);
			if (newValueSet != null)
				msgs = ((InternalEObject)newValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VALUE_SET, null, msgs);
			msgs = basicSetValueSet(newValueSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VALUE_SET, newValueSet, newValueSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription getVisionPrescription() {
		return visionPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisionPrescription(VisionPrescription newVisionPrescription, NotificationChain msgs) {
		VisionPrescription oldVisionPrescription = visionPrescription;
		visionPrescription = newVisionPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, oldVisionPrescription, newVisionPrescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisionPrescription(VisionPrescription newVisionPrescription) {
		if (newVisionPrescription != visionPrescription) {
			NotificationChain msgs = null;
			if (visionPrescription != null)
				msgs = ((InternalEObject)visionPrescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, null, msgs);
			if (newVisionPrescription != null)
				msgs = ((InternalEObject)newVisionPrescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, null, msgs);
			msgs = basicSetVisionPrescription(newVisionPrescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION, newVisionPrescription, newVisionPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getParameters() {
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs) {
		Parameters oldParameters = parameters;
		parameters = newParameters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PARAMETERS, oldParameters, newParameters);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameters newParameters) {
		if (newParameters != parameters) {
			NotificationChain msgs = null;
			if (parameters != null)
				msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PARAMETERS, null, msgs);
			if (newParameters != null)
				msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FhirPackage.RESOURCE_CONTAINER__PARAMETERS, null, msgs);
			msgs = basicSetParameters(newParameters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FhirPackage.RESOURCE_CONTAINER__PARAMETERS, newParameters, newParameters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return basicSetAccount(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return basicSetAllergyIntolerance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return basicSetAppointmentResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return basicSetAuditEvent(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return basicSetBasic(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return basicSetBinary(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return basicSetBundle(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return basicSetCarePlan(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return basicSetClinicalImpression(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return basicSetCommunicationRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return basicSetComposition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return basicSetConceptMap(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONFORMANCE:
				return basicSetConformance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION:
				return basicSetContraindication(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT:
				return basicSetDataElement(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT:
				return basicSetDeviceComponent(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return basicSetDeviceMetric(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST:
				return basicSetDeviceUseRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT:
				return basicSetDeviceUseStatement(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER:
				return basicSetDiagnosticOrder(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return basicSetDiagnosticReport(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST:
				return basicSetDocumentManifest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST:
				return basicSetEligibilityRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE:
				return basicSetEligibilityResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return basicSetEnrollmentRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return basicSetEnrollmentResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return basicSetEpisodeOfCare(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return basicSetExplanationOfBenefit(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return basicSetFamilyMemberHistory(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return basicSetFlag(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return basicSetGoal(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return basicSetHealthcareService(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION:
				return basicSetImagingObjectSelection(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return basicSetImagingStudy(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return basicSetImmunization(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return basicSetImmunizationRecommendation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return basicSetImplementationGuide(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return basicSetList(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDIA:
				return basicSetMedia(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return basicSetMedicationAdministration(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return basicSetMedicationDispense(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION:
				return basicSetMedicationPrescription(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return basicSetMedicationStatement(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return basicSetMessageHeader(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return basicSetNamingSystem(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return basicSetNutritionOrder(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return basicSetOperationDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return basicSetOperationOutcome(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ORDER:
				return basicSetOrder(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE:
				return basicSetOrderResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return basicSetPaymentNotice(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return basicSetPaymentReconciliation(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return basicSetPerson(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST:
				return basicSetProcedureRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST:
				return basicSetProcessRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE:
				return basicSetProcessResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return basicSetQuestionnaireResponse(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST:
				return basicSetReferralRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return basicSetRelatedPerson(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return basicSetSearchParameter(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return basicSetSlot(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return basicSetStructureDefinition(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return basicSetSupplyDelivery(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return basicSetSupplyRequest(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return basicSetTestScript(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return basicSetVisionPrescription(null, msgs);
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return basicSetParameters(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return getAccount();
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return getAppointment();
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return getAppointmentResponse();
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return getAuditEvent();
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return getBasic();
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return getBinary();
			case FhirPackage.RESOURCE_CONTAINER__BODY_SITE:
				return getBodySite();
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return getBundle();
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return getCarePlan();
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return getClaim();
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return getClinicalImpression();
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return getCommunication();
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return getComposition();
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return getConceptMap();
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return getCondition();
			case FhirPackage.RESOURCE_CONTAINER__CONFORMANCE:
				return getConformance();
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return getContract();
			case FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return getCoverage();
			case FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT:
				return getDataElement();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return getDevice();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT:
				return getDeviceComponent();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return getDeviceMetric();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST:
				return getDeviceUseRequest();
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT:
				return getDeviceUseStatement();
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER:
				return getDiagnosticOrder();
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return getDiagnosticReport();
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST:
				return getDocumentManifest();
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return getDocumentReference();
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST:
				return getEligibilityRequest();
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE:
				return getEligibilityResponse();
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return getEncounter();
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return getEnrollmentRequest();
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse();
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit();
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory();
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return getFlag();
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return getGoal();
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return getGroup();
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION:
				return getImagingObjectSelection();
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return getImmunization();
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation();
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return getImplementationGuide();
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return getList();
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return getLocation();
			case FhirPackage.RESOURCE_CONTAINER__MEDIA:
				return getMedia();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return getMedication();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return getMedicationDispense();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION:
				return getMedicationPrescription();
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return getMedicationStatement();
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return getMessageHeader();
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return getNamingSystem();
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return getNutritionOrder();
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return getObservation();
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return getOperationDefinition();
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return getOperationOutcome();
			case FhirPackage.RESOURCE_CONTAINER__ORDER:
				return getOrder();
			case FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE:
				return getOrderResponse();
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return getOrganization();
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return getPatient();
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return getPaymentNotice();
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation();
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return getPerson();
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return getProcedure();
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST:
				return getProcedureRequest();
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST:
				return getProcessRequest();
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE:
				return getProcessResponse();
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return getProvenance();
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return getQuestionnaireResponse();
			case FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST:
				return getReferralRequest();
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return getRelatedPerson();
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return getRiskAssessment();
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return getSchedule();
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return getSearchParameter();
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return getSlot();
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return getSpecimen();
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return getStructureDefinition();
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return getSubscription();
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return getSubstance();
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return getSupplyDelivery();
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return getSupplyRequest();
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return getTestScript();
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return getValueSet();
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return getVisionPrescription();
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return getParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				setAccount((Account)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				setAuditEvent((AuditEvent)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				setBasic((Basic)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				setBinary((Binary)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BODY_SITE:
				setBodySite((BodySite)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				setCarePlan((CarePlan)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				setClaim((Claim)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				setComposition((Composition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				setConceptMap((ConceptMap)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				setCondition((Condition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONFORMANCE:
				setConformance((Conformance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				setContract((Contract)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION:
				setContraindication((Contraindication)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT:
				setDataElement((DataElement)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT:
				setDeviceComponent((DeviceComponent)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST:
				setDeviceUseRequest((DeviceUseRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT:
				setDeviceUseStatement((DeviceUseStatement)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER:
				setDiagnosticOrder((DiagnosticOrder)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST:
				setDocumentManifest((DocumentManifest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST:
				setEligibilityRequest((EligibilityRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE:
				setEligibilityResponse((EligibilityResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				setFlag((Flag)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				setGoal((Goal)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				setGroup((Group)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION:
				setImagingObjectSelection((ImagingObjectSelection)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				setImmunization((Immunization)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				setList((List)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDIA:
				setMedia((Media)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				setMedication((Medication)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION:
				setMedicationPrescription((MedicationPrescription)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORDER:
				setOrder((Order)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE:
				setOrderResponse((OrderResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				setPerson((Person)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				setPractitioner((Practitioner)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST:
				setProcedureRequest((ProcedureRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST:
				setProcessRequest((ProcessRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE:
				setProcessResponse((ProcessResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				setProvenance((Provenance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST:
				setReferralRequest((ReferralRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				setSlot((Slot)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				setSubscription((Subscription)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				setSubstance((Substance)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				setTestScript((TestScript)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)newValue);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				setParameters((Parameters)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				setAccount((Account)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				setAuditEvent((AuditEvent)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				setBasic((Basic)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				setBinary((Binary)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BODY_SITE:
				setBodySite((BodySite)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				setBundle((Bundle)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				setCarePlan((CarePlan)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				setClaim((Claim)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				setComposition((Composition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				setConceptMap((ConceptMap)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				setCondition((Condition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONFORMANCE:
				setConformance((Conformance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				setContract((Contract)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION:
				setContraindication((Contraindication)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT:
				setDataElement((DataElement)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				setDevice((Device)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT:
				setDeviceComponent((DeviceComponent)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST:
				setDeviceUseRequest((DeviceUseRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT:
				setDeviceUseStatement((DeviceUseStatement)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER:
				setDiagnosticOrder((DiagnosticOrder)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST:
				setDocumentManifest((DocumentManifest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST:
				setEligibilityRequest((EligibilityRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE:
				setEligibilityResponse((EligibilityResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				setFlag((Flag)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				setGoal((Goal)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				setGroup((Group)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION:
				setImagingObjectSelection((ImagingObjectSelection)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				setImmunization((Immunization)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				setImplementationGuide((ImplementationGuide)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				setList((List)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				setLocation((Location)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDIA:
				setMedia((Media)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				setMedication((Medication)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION:
				setMedicationPrescription((MedicationPrescription)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				setObservation((Observation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORDER:
				setOrder((Order)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE:
				setOrderResponse((OrderResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				setPerson((Person)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				setPractitioner((Practitioner)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST:
				setProcedureRequest((ProcedureRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST:
				setProcessRequest((ProcessRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE:
				setProcessResponse((ProcessResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				setProvenance((Provenance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				setQuestionnaireResponse((QuestionnaireResponse)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST:
				setReferralRequest((ReferralRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				setSlot((Slot)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				setSubscription((Subscription)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				setSubstance((Substance)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				setSupplyDelivery((SupplyDelivery)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				setSupplyRequest((SupplyRequest)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				setTestScript((TestScript)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)null);
				return;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				setParameters((Parameters)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FhirPackage.RESOURCE_CONTAINER__ACCOUNT:
				return account != null;
			case FhirPackage.RESOURCE_CONTAINER__ALLERGY_INTOLERANCE:
				return allergyIntolerance != null;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT:
				return appointment != null;
			case FhirPackage.RESOURCE_CONTAINER__APPOINTMENT_RESPONSE:
				return appointmentResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__AUDIT_EVENT:
				return auditEvent != null;
			case FhirPackage.RESOURCE_CONTAINER__BASIC:
				return basic != null;
			case FhirPackage.RESOURCE_CONTAINER__BINARY:
				return binary != null;
			case FhirPackage.RESOURCE_CONTAINER__BODY_SITE:
				return bodySite != null;
			case FhirPackage.RESOURCE_CONTAINER__BUNDLE:
				return bundle != null;
			case FhirPackage.RESOURCE_CONTAINER__CARE_PLAN:
				return carePlan != null;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM:
				return claim != null;
			case FhirPackage.RESOURCE_CONTAINER__CLAIM_RESPONSE:
				return claimResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__CLINICAL_IMPRESSION:
				return clinicalImpression != null;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION:
				return communication != null;
			case FhirPackage.RESOURCE_CONTAINER__COMMUNICATION_REQUEST:
				return communicationRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__COMPOSITION:
				return composition != null;
			case FhirPackage.RESOURCE_CONTAINER__CONCEPT_MAP:
				return conceptMap != null;
			case FhirPackage.RESOURCE_CONTAINER__CONDITION:
				return condition != null;
			case FhirPackage.RESOURCE_CONTAINER__CONFORMANCE:
				return conformance != null;
			case FhirPackage.RESOURCE_CONTAINER__CONTRACT:
				return contract != null;
			case FhirPackage.RESOURCE_CONTAINER__CONTRAINDICATION:
				return contraindication != null;
			case FhirPackage.RESOURCE_CONTAINER__COVERAGE:
				return coverage != null;
			case FhirPackage.RESOURCE_CONTAINER__DATA_ELEMENT:
				return dataElement != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE:
				return device != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_COMPONENT:
				return deviceComponent != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_METRIC:
				return deviceMetric != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_REQUEST:
				return deviceUseRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__DEVICE_USE_STATEMENT:
				return deviceUseStatement != null;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_ORDER:
				return diagnosticOrder != null;
			case FhirPackage.RESOURCE_CONTAINER__DIAGNOSTIC_REPORT:
				return diagnosticReport != null;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_MANIFEST:
				return documentManifest != null;
			case FhirPackage.RESOURCE_CONTAINER__DOCUMENT_REFERENCE:
				return documentReference != null;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_REQUEST:
				return eligibilityRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__ELIGIBILITY_RESPONSE:
				return eligibilityResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__ENCOUNTER:
				return encounter != null;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_REQUEST:
				return enrollmentRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__ENROLLMENT_RESPONSE:
				return enrollmentResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__EPISODE_OF_CARE:
				return episodeOfCare != null;
			case FhirPackage.RESOURCE_CONTAINER__EXPLANATION_OF_BENEFIT:
				return explanationOfBenefit != null;
			case FhirPackage.RESOURCE_CONTAINER__FAMILY_MEMBER_HISTORY:
				return familyMemberHistory != null;
			case FhirPackage.RESOURCE_CONTAINER__FLAG:
				return flag != null;
			case FhirPackage.RESOURCE_CONTAINER__GOAL:
				return goal != null;
			case FhirPackage.RESOURCE_CONTAINER__GROUP:
				return group != null;
			case FhirPackage.RESOURCE_CONTAINER__HEALTHCARE_SERVICE:
				return healthcareService != null;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_OBJECT_SELECTION:
				return imagingObjectSelection != null;
			case FhirPackage.RESOURCE_CONTAINER__IMAGING_STUDY:
				return imagingStudy != null;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION:
				return immunization != null;
			case FhirPackage.RESOURCE_CONTAINER__IMMUNIZATION_RECOMMENDATION:
				return immunizationRecommendation != null;
			case FhirPackage.RESOURCE_CONTAINER__IMPLEMENTATION_GUIDE:
				return implementationGuide != null;
			case FhirPackage.RESOURCE_CONTAINER__LIST:
				return list != null;
			case FhirPackage.RESOURCE_CONTAINER__LOCATION:
				return location != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDIA:
				return media != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION:
				return medication != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_ADMINISTRATION:
				return medicationAdministration != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_DISPENSE:
				return medicationDispense != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_PRESCRIPTION:
				return medicationPrescription != null;
			case FhirPackage.RESOURCE_CONTAINER__MEDICATION_STATEMENT:
				return medicationStatement != null;
			case FhirPackage.RESOURCE_CONTAINER__MESSAGE_HEADER:
				return messageHeader != null;
			case FhirPackage.RESOURCE_CONTAINER__NAMING_SYSTEM:
				return namingSystem != null;
			case FhirPackage.RESOURCE_CONTAINER__NUTRITION_ORDER:
				return nutritionOrder != null;
			case FhirPackage.RESOURCE_CONTAINER__OBSERVATION:
				return observation != null;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_DEFINITION:
				return operationDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__OPERATION_OUTCOME:
				return operationOutcome != null;
			case FhirPackage.RESOURCE_CONTAINER__ORDER:
				return order != null;
			case FhirPackage.RESOURCE_CONTAINER__ORDER_RESPONSE:
				return orderResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__ORGANIZATION:
				return organization != null;
			case FhirPackage.RESOURCE_CONTAINER__PATIENT:
				return patient != null;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_NOTICE:
				return paymentNotice != null;
			case FhirPackage.RESOURCE_CONTAINER__PAYMENT_RECONCILIATION:
				return paymentReconciliation != null;
			case FhirPackage.RESOURCE_CONTAINER__PERSON:
				return person != null;
			case FhirPackage.RESOURCE_CONTAINER__PRACTITIONER:
				return practitioner != null;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE:
				return procedure != null;
			case FhirPackage.RESOURCE_CONTAINER__PROCEDURE_REQUEST:
				return procedureRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_REQUEST:
				return processRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__PROCESS_RESPONSE:
				return processResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__PROVENANCE:
				return provenance != null;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE:
				return questionnaire != null;
			case FhirPackage.RESOURCE_CONTAINER__QUESTIONNAIRE_RESPONSE:
				return questionnaireResponse != null;
			case FhirPackage.RESOURCE_CONTAINER__REFERRAL_REQUEST:
				return referralRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__RELATED_PERSON:
				return relatedPerson != null;
			case FhirPackage.RESOURCE_CONTAINER__RISK_ASSESSMENT:
				return riskAssessment != null;
			case FhirPackage.RESOURCE_CONTAINER__SCHEDULE:
				return schedule != null;
			case FhirPackage.RESOURCE_CONTAINER__SEARCH_PARAMETER:
				return searchParameter != null;
			case FhirPackage.RESOURCE_CONTAINER__SLOT:
				return slot != null;
			case FhirPackage.RESOURCE_CONTAINER__SPECIMEN:
				return specimen != null;
			case FhirPackage.RESOURCE_CONTAINER__STRUCTURE_DEFINITION:
				return structureDefinition != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSCRIPTION:
				return subscription != null;
			case FhirPackage.RESOURCE_CONTAINER__SUBSTANCE:
				return substance != null;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_DELIVERY:
				return supplyDelivery != null;
			case FhirPackage.RESOURCE_CONTAINER__SUPPLY_REQUEST:
				return supplyRequest != null;
			case FhirPackage.RESOURCE_CONTAINER__TEST_SCRIPT:
				return testScript != null;
			case FhirPackage.RESOURCE_CONTAINER__VALUE_SET:
				return valueSet != null;
			case FhirPackage.RESOURCE_CONTAINER__VISION_PRESCRIPTION:
				return visionPrescription != null;
			case FhirPackage.RESOURCE_CONTAINER__PARAMETERS:
				return parameters != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceContainerImpl
