/**
 */
package org.hl7.fhir.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

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
import org.hl7.fhir.DocumentRoot;
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
import org.hl7.fhir.QuestionnaireAnswers;
import org.hl7.fhir.ReferralRequest;
import org.hl7.fhir.RelatedPerson;
import org.hl7.fhir.RiskAssessment;
import org.hl7.fhir.Schedule;
import org.hl7.fhir.SearchParameter;
import org.hl7.fhir.Slot;
import org.hl7.fhir.Specimen;
import org.hl7.fhir.StructureDefinition;
import org.hl7.fhir.Subscription;
import org.hl7.fhir.Substance;
import org.hl7.fhir.Supply;
import org.hl7.fhir.ValueSet;
import org.hl7.fhir.VisionPrescription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAllergyIntolerance <em>Allergy Intolerance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAppointment <em>Appointment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAppointmentResponse <em>Appointment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getAuditEvent <em>Audit Event</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBasic <em>Basic</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBinary <em>Binary</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBodySite <em>Body Site</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getBundle <em>Bundle</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCarePlan <em>Care Plan</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClaim <em>Claim</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClaimResponse <em>Claim Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getClinicalImpression <em>Clinical Impression</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCommunication <em>Communication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCommunicationRequest <em>Communication Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getComposition <em>Composition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getConceptMap <em>Concept Map</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getContraindication <em>Contraindication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDataElement <em>Data Element</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceComponent <em>Device Component</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceMetric <em>Device Metric</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceUseRequest <em>Device Use Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDeviceUseStatement <em>Device Use Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDiagnosticOrder <em>Diagnostic Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDiagnosticReport <em>Diagnostic Report</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDocumentManifest <em>Document Manifest</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getDocumentReference <em>Document Reference</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEligibilityRequest <em>Eligibility Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEligibilityResponse <em>Eligibility Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEnrollmentRequest <em>Enrollment Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEnrollmentResponse <em>Enrollment Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getEpisodeOfCare <em>Episode Of Care</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getExplanationOfBenefit <em>Explanation Of Benefit</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getFamilyMemberHistory <em>Family Member History</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getFlag <em>Flag</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGoal <em>Goal</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getHealthcareService <em>Healthcare Service</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImagingObjectSelection <em>Imaging Object Selection</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImagingStudy <em>Imaging Study</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImmunization <em>Immunization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getImmunizationRecommendation <em>Immunization Recommendation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getList <em>List</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedia <em>Media</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedication <em>Medication</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationAdministration <em>Medication Administration</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationDispense <em>Medication Dispense</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationPrescription <em>Medication Prescription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMedicationStatement <em>Medication Statement</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getMessageHeader <em>Message Header</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNamingSystem <em>Naming System</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getNutritionOrder <em>Nutrition Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getObservation <em>Observation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOperationDefinition <em>Operation Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOperationOutcome <em>Operation Outcome</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOrderResponse <em>Order Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPatient <em>Patient</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPaymentNotice <em>Payment Notice</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPaymentReconciliation <em>Payment Reconciliation</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getPractitioner <em>Practitioner</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProcedureRequest <em>Procedure Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProcessRequest <em>Process Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProcessResponse <em>Process Response</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getProvenance <em>Provenance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getQuestionnaireAnswers <em>Questionnaire Answers</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getReferralRequest <em>Referral Request</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRelatedPerson <em>Related Person</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSearchParameter <em>Search Parameter</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSpecimen <em>Specimen</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getStructureDefinition <em>Structure Definition</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubscription <em>Subscription</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSubstance <em>Substance</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getSupply <em>Supply</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getValueSet <em>Value Set</em>}</li>
 *   <li>{@link org.hl7.fhir.impl.DocumentRootImpl#getVisionPrescription <em>Vision Prescription</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FhirPackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, FhirPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllergyIntolerance getAllergyIntolerance() {
		return (AllergyIntolerance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllergyIntolerance(AllergyIntolerance newAllergyIntolerance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), newAllergyIntolerance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllergyIntolerance(AllergyIntolerance newAllergyIntolerance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AllergyIntolerance(), newAllergyIntolerance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Appointment getAppointment() {
		return (Appointment)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointment(Appointment newAppointment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), newAppointment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointment(Appointment newAppointment) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Appointment(), newAppointment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppointmentResponse getAppointmentResponse() {
		return (AppointmentResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppointmentResponse(AppointmentResponse newAppointmentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), newAppointmentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppointmentResponse(AppointmentResponse newAppointmentResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AppointmentResponse(), newAppointmentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuditEvent getAuditEvent() {
		return (AuditEvent)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuditEvent(AuditEvent newAuditEvent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), newAuditEvent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditEvent(AuditEvent newAuditEvent) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_AuditEvent(), newAuditEvent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic getBasic() {
		return (Basic)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasic(Basic newBasic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), newBasic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasic(Basic newBasic) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Basic(), newBasic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary getBinary() {
		return (Binary)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinary(Binary newBinary, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), newBinary, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinary(Binary newBinary) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Binary(), newBinary);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodySite getBodySite() {
		return (BodySite)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_BodySite(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBodySite(BodySite newBodySite, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_BodySite(), newBodySite, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodySite(BodySite newBodySite) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_BodySite(), newBodySite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bundle getBundle() {
		return (Bundle)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBundle(Bundle newBundle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), newBundle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBundle(Bundle newBundle) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Bundle(), newBundle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePlan getCarePlan() {
		return (CarePlan)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarePlan(CarePlan newCarePlan, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), newCarePlan, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarePlan(CarePlan newCarePlan) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CarePlan(), newCarePlan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Claim getClaim() {
		return (Claim)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaim(Claim newClaim, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), newClaim, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaim(Claim newClaim) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Claim(), newClaim);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimResponse getClaimResponse() {
		return (ClaimResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimResponse(ClaimResponse newClaimResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), newClaimResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimResponse(ClaimResponse newClaimResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ClaimResponse(), newClaimResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalImpression getClinicalImpression() {
		return (ClinicalImpression)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalImpression(ClinicalImpression newClinicalImpression, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), newClinicalImpression, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalImpression(ClinicalImpression newClinicalImpression) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ClinicalImpression(), newClinicalImpression);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Communication getCommunication() {
		return (Communication)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunication(Communication newCommunication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunication(Communication newCommunication) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Communication(), newCommunication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationRequest getCommunicationRequest() {
		return (CommunicationRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationRequest(CommunicationRequest newCommunicationRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), newCommunicationRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationRequest(CommunicationRequest newCommunicationRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_CommunicationRequest(), newCommunicationRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Composition getComposition() {
		return (Composition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComposition(Composition newComposition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), newComposition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComposition(Composition newComposition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Composition(), newComposition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConceptMap getConceptMap() {
		return (ConceptMap)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConceptMap(ConceptMap newConceptMap, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), newConceptMap, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceptMap(ConceptMap newConceptMap) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ConceptMap(), newConceptMap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return (Condition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Condition(), newCondition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conformance getConformance() {
		return (Conformance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Conformance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConformance(Conformance newConformance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Conformance(), newConformance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConformance(Conformance newConformance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Conformance(), newConformance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contract getContract() {
		return (Contract)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContract(Contract newContract, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), newContract, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContract(Contract newContract) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Contract(), newContract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contraindication getContraindication() {
		return (Contraindication)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Contraindication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContraindication(Contraindication newContraindication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Contraindication(), newContraindication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContraindication(Contraindication newContraindication) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Contraindication(), newContraindication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Coverage getCoverage() {
		return (Coverage)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoverage(Coverage newCoverage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), newCoverage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoverage(Coverage newCoverage) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Coverage(), newCoverage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement getDataElement() {
		return (DataElement)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DataElement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataElement(DataElement newDataElement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DataElement(), newDataElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataElement(DataElement newDataElement) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DataElement(), newDataElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		return (Device)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Device(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Device(), newDevice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Device(), newDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceComponent getDeviceComponent() {
		return (DeviceComponent)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceComponent(DeviceComponent newDeviceComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceComponent(), newDeviceComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceComponent(DeviceComponent newDeviceComponent) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceComponent(), newDeviceComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceMetric getDeviceMetric() {
		return (DeviceMetric)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceMetric(DeviceMetric newDeviceMetric, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), newDeviceMetric, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceMetric(DeviceMetric newDeviceMetric) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceMetric(), newDeviceMetric);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseRequest getDeviceUseRequest() {
		return (DeviceUseRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUseRequest(DeviceUseRequest newDeviceUseRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseRequest(), newDeviceUseRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUseRequest(DeviceUseRequest newDeviceUseRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseRequest(), newDeviceUseRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceUseStatement getDeviceUseStatement() {
		return (DeviceUseStatement)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeviceUseStatement(DeviceUseStatement newDeviceUseStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseStatement(), newDeviceUseStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceUseStatement(DeviceUseStatement newDeviceUseStatement) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DeviceUseStatement(), newDeviceUseStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticOrder getDiagnosticOrder() {
		return (DiagnosticOrder)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticOrder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticOrder(DiagnosticOrder newDiagnosticOrder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticOrder(), newDiagnosticOrder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticOrder(DiagnosticOrder newDiagnosticOrder) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticOrder(), newDiagnosticOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticReport getDiagnosticReport() {
		return (DiagnosticReport)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagnosticReport(DiagnosticReport newDiagnosticReport, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), newDiagnosticReport, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticReport(DiagnosticReport newDiagnosticReport) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DiagnosticReport(), newDiagnosticReport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentManifest getDocumentManifest() {
		return (DocumentManifest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DocumentManifest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentManifest(DocumentManifest newDocumentManifest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DocumentManifest(), newDocumentManifest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentManifest(DocumentManifest newDocumentManifest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DocumentManifest(), newDocumentManifest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentReference getDocumentReference() {
		return (DocumentReference)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentReference(DocumentReference newDocumentReference, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), newDocumentReference, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentReference(DocumentReference newDocumentReference) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_DocumentReference(), newDocumentReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityRequest getEligibilityRequest() {
		return (EligibilityRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibilityRequest(EligibilityRequest newEligibilityRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityRequest(), newEligibilityRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityRequest(EligibilityRequest newEligibilityRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityRequest(), newEligibilityRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityResponse getEligibilityResponse() {
		return (EligibilityResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEligibilityResponse(EligibilityResponse newEligibilityResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityResponse(), newEligibilityResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEligibilityResponse(EligibilityResponse newEligibilityResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EligibilityResponse(), newEligibilityResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Encounter getEncounter() {
		return (Encounter)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncounter(Encounter newEncounter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), newEncounter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncounter(Encounter newEncounter) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Encounter(), newEncounter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentRequest getEnrollmentRequest() {
		return (EnrollmentRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentRequest(EnrollmentRequest newEnrollmentRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), newEnrollmentRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentRequest(EnrollmentRequest newEnrollmentRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentRequest(), newEnrollmentRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnrollmentResponse getEnrollmentResponse() {
		return (EnrollmentResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnrollmentResponse(EnrollmentResponse newEnrollmentResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), newEnrollmentResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnrollmentResponse(EnrollmentResponse newEnrollmentResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EnrollmentResponse(), newEnrollmentResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeOfCare getEpisodeOfCare() {
		return (EpisodeOfCare)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEpisodeOfCare(EpisodeOfCare newEpisodeOfCare, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), newEpisodeOfCare, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpisodeOfCare(EpisodeOfCare newEpisodeOfCare) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_EpisodeOfCare(), newEpisodeOfCare);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExplanationOfBenefit getExplanationOfBenefit() {
		return (ExplanationOfBenefit)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), newExplanationOfBenefit, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplanationOfBenefit(ExplanationOfBenefit newExplanationOfBenefit) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ExplanationOfBenefit(), newExplanationOfBenefit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyMemberHistory getFamilyMemberHistory() {
		return (FamilyMemberHistory)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), newFamilyMemberHistory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamilyMemberHistory(FamilyMemberHistory newFamilyMemberHistory) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_FamilyMemberHistory(), newFamilyMemberHistory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flag getFlag() {
		return (Flag)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlag(Flag newFlag, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), newFlag, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(Flag newFlag) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Flag(), newFlag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Goal getGoal() {
		return (Goal)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGoal(Goal newGoal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), newGoal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoal(Goal newGoal) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Goal(), newGoal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getGroup() {
		return (Group)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Group(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(Group newGroup, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Group(), newGroup, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(Group newGroup) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Group(), newGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealthcareService getHealthcareService() {
		return (HealthcareService)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthcareService(HealthcareService newHealthcareService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), newHealthcareService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHealthcareService(HealthcareService newHealthcareService) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_HealthcareService(), newHealthcareService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingObjectSelection getImagingObjectSelection() {
		return (ImagingObjectSelection)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImagingObjectSelection(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingObjectSelection(ImagingObjectSelection newImagingObjectSelection, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImagingObjectSelection(), newImagingObjectSelection, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingObjectSelection(ImagingObjectSelection newImagingObjectSelection) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImagingObjectSelection(), newImagingObjectSelection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagingStudy getImagingStudy() {
		return (ImagingStudy)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImagingStudy(ImagingStudy newImagingStudy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), newImagingStudy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagingStudy(ImagingStudy newImagingStudy) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImagingStudy(), newImagingStudy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Immunization getImmunization() {
		return (Immunization)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunization(Immunization newImmunization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), newImmunization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunization(Immunization newImmunization) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Immunization(), newImmunization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationRecommendation getImmunizationRecommendation() {
		return (ImmunizationRecommendation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), newImmunizationRecommendation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmunizationRecommendation(ImmunizationRecommendation newImmunizationRecommendation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ImmunizationRecommendation(), newImmunizationRecommendation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List getList() {
		return (List)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_List(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(List newList, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_List(), newList, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(List newList) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_List(), newList);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return (Location)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Location(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Location(), newLocation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Location(), newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media getMedia() {
		return (Media)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Media(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedia(Media newMedia, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Media(), newMedia, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedia(Media newMedia) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Media(), newMedia);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication getMedication() {
		return (Medication)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedication(Medication newMedication, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), newMedication, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedication(Medication newMedication) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Medication(), newMedication);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationAdministration getMedicationAdministration() {
		return (MedicationAdministration)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationAdministration(MedicationAdministration newMedicationAdministration, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), newMedicationAdministration, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationAdministration(MedicationAdministration newMedicationAdministration) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationAdministration(), newMedicationAdministration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationDispense getMedicationDispense() {
		return (MedicationDispense)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationDispense(MedicationDispense newMedicationDispense, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), newMedicationDispense, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationDispense(MedicationDispense newMedicationDispense) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationDispense(), newMedicationDispense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationPrescription getMedicationPrescription() {
		return (MedicationPrescription)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationPrescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationPrescription(MedicationPrescription newMedicationPrescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationPrescription(), newMedicationPrescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationPrescription(MedicationPrescription newMedicationPrescription) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationPrescription(), newMedicationPrescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationStatement getMedicationStatement() {
		return (MedicationStatement)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMedicationStatement(MedicationStatement newMedicationStatement, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), newMedicationStatement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationStatement(MedicationStatement newMedicationStatement) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MedicationStatement(), newMedicationStatement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageHeader getMessageHeader() {
		return (MessageHeader)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageHeader(MessageHeader newMessageHeader, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), newMessageHeader, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageHeader(MessageHeader newMessageHeader) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_MessageHeader(), newMessageHeader);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingSystem getNamingSystem() {
		return (NamingSystem)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamingSystem(NamingSystem newNamingSystem, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), newNamingSystem, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamingSystem(NamingSystem newNamingSystem) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NamingSystem(), newNamingSystem);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NutritionOrder getNutritionOrder() {
		return (NutritionOrder)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNutritionOrder(NutritionOrder newNutritionOrder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), newNutritionOrder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNutritionOrder(NutritionOrder newNutritionOrder) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_NutritionOrder(), newNutritionOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getObservation() {
		return (Observation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObservation(Observation newObservation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObservation(Observation newObservation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Observation(), newObservation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationDefinition getOperationDefinition() {
		return (OperationDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationDefinition(OperationDefinition newOperationDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), newOperationDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationDefinition(OperationDefinition newOperationDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OperationDefinition(), newOperationDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationOutcome getOperationOutcome() {
		return (OperationOutcome)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOperationOutcome(OperationOutcome newOperationOutcome, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), newOperationOutcome, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationOutcome(OperationOutcome newOperationOutcome) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OperationOutcome(), newOperationOutcome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		return (Order)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Order(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Order(), newOrder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(Order newOrder) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Order(), newOrder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderResponse getOrderResponse() {
		return (OrderResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_OrderResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrderResponse(OrderResponse newOrderResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_OrderResponse(), newOrderResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderResponse(OrderResponse newOrderResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_OrderResponse(), newOrderResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Organization getOrganization() {
		return (Organization)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrganization(Organization newOrganization, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), newOrganization, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganization(Organization newOrganization) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Organization(), newOrganization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameters getParameters() {
		return (Parameters)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), newParameters, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameters(Parameters newParameters) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Parameters(), newParameters);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient getPatient() {
		return (Patient)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatient(Patient newPatient, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), newPatient, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatient(Patient newPatient) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Patient(), newPatient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentNotice getPaymentNotice() {
		return (PaymentNotice)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentNotice(PaymentNotice newPaymentNotice, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), newPaymentNotice, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentNotice(PaymentNotice newPaymentNotice) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PaymentNotice(), newPaymentNotice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PaymentReconciliation getPaymentReconciliation() {
		return (PaymentReconciliation)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaymentReconciliation(PaymentReconciliation newPaymentReconciliation, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), newPaymentReconciliation, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentReconciliation(PaymentReconciliation newPaymentReconciliation) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_PaymentReconciliation(), newPaymentReconciliation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		return (Person)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Person(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerson(Person newPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Person(), newPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Person(), newPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Practitioner getPractitioner() {
		return (Practitioner)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPractitioner(Practitioner newPractitioner, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), newPractitioner, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPractitioner(Practitioner newPractitioner) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Practitioner(), newPractitioner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure getProcedure() {
		return (Procedure)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedure(Procedure newProcedure, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedure(Procedure newProcedure) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Procedure(), newProcedure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureRequest getProcedureRequest() {
		return (ProcedureRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ProcedureRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcedureRequest(ProcedureRequest newProcedureRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ProcedureRequest(), newProcedureRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcedureRequest(ProcedureRequest newProcedureRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ProcedureRequest(), newProcedureRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessRequest getProcessRequest() {
		return (ProcessRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ProcessRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessRequest(ProcessRequest newProcessRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ProcessRequest(), newProcessRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessRequest(ProcessRequest newProcessRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ProcessRequest(), newProcessRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessResponse getProcessResponse() {
		return (ProcessResponse)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ProcessResponse(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessResponse(ProcessResponse newProcessResponse, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ProcessResponse(), newProcessResponse, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessResponse(ProcessResponse newProcessResponse) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ProcessResponse(), newProcessResponse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provenance getProvenance() {
		return (Provenance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvenance(Provenance newProvenance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), newProvenance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvenance(Provenance newProvenance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Provenance(), newProvenance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionnaire getQuestionnaire() {
		return (Questionnaire)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaire(Questionnaire newQuestionnaire, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), newQuestionnaire, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaire(Questionnaire newQuestionnaire) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Questionnaire(), newQuestionnaire);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireAnswers getQuestionnaireAnswers() {
		return (QuestionnaireAnswers)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireAnswers(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuestionnaireAnswers(QuestionnaireAnswers newQuestionnaireAnswers, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireAnswers(), newQuestionnaireAnswers, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionnaireAnswers(QuestionnaireAnswers newQuestionnaireAnswers) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_QuestionnaireAnswers(), newQuestionnaireAnswers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferralRequest getReferralRequest() {
		return (ReferralRequest)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ReferralRequest(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferralRequest(ReferralRequest newReferralRequest, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ReferralRequest(), newReferralRequest, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferralRequest(ReferralRequest newReferralRequest) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ReferralRequest(), newReferralRequest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelatedPerson getRelatedPerson() {
		return (RelatedPerson)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelatedPerson(RelatedPerson newRelatedPerson, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), newRelatedPerson, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedPerson(RelatedPerson newRelatedPerson) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RelatedPerson(), newRelatedPerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskAssessment getRiskAssessment() {
		return (RiskAssessment)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), newRiskAssessment, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_RiskAssessment(), newRiskAssessment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schedule getSchedule() {
		return (Schedule)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSchedule(Schedule newSchedule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), newSchedule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedule(Schedule newSchedule) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Schedule(), newSchedule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SearchParameter getSearchParameter() {
		return (SearchParameter)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSearchParameter(SearchParameter newSearchParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), newSearchParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSearchParameter(SearchParameter newSearchParameter) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_SearchParameter(), newSearchParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getSlot() {
		return (Slot)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlot(Slot newSlot, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlot(Slot newSlot) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Slot(), newSlot);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specimen getSpecimen() {
		return (Specimen)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecimen(Specimen newSpecimen, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), newSpecimen, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecimen(Specimen newSpecimen) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Specimen(), newSpecimen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureDefinition getStructureDefinition() {
		return (StructureDefinition)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStructureDefinition(StructureDefinition newStructureDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureDefinition(StructureDefinition newStructureDefinition) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_StructureDefinition(), newStructureDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscription getSubscription() {
		return (Subscription)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscription(Subscription newSubscription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), newSubscription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscription(Subscription newSubscription) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Subscription(), newSubscription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Substance getSubstance() {
		return (Substance)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubstance(Substance newSubstance, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), newSubstance, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstance(Substance newSubstance) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Substance(), newSubstance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supply getSupply() {
		return (Supply)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_Supply(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSupply(Supply newSupply, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_Supply(), newSupply, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupply(Supply newSupply) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_Supply(), newSupply);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSet getValueSet() {
		return (ValueSet)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueSet(ValueSet newValueSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), newValueSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueSet(ValueSet newValueSet) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_ValueSet(), newValueSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisionPrescription getVisionPrescription() {
		return (VisionPrescription)getMixed().get(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVisionPrescription(VisionPrescription newVisionPrescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), newVisionPrescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisionPrescription(VisionPrescription newVisionPrescription) {
		((FeatureMap.Internal)getMixed()).set(FhirPackage.eINSTANCE.getDocumentRoot_VisionPrescription(), newVisionPrescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return basicSetAllergyIntolerance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return basicSetAppointment(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return basicSetAppointmentResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return basicSetAuditEvent(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return basicSetBasic(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return basicSetBinary(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BODY_SITE:
				return basicSetBodySite(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return basicSetBundle(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return basicSetCarePlan(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return basicSetClaim(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return basicSetClaimResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return basicSetClinicalImpression(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return basicSetCommunication(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return basicSetCommunicationRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return basicSetComposition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return basicSetConceptMap(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return basicSetCondition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONFORMANCE:
				return basicSetConformance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return basicSetContract(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__CONTRAINDICATION:
				return basicSetContraindication(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return basicSetCoverage(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DATA_ELEMENT:
				return basicSetDataElement(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return basicSetDevice(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_COMPONENT:
				return basicSetDeviceComponent(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return basicSetDeviceMetric(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_REQUEST:
				return basicSetDeviceUseRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_STATEMENT:
				return basicSetDeviceUseStatement(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_ORDER:
				return basicSetDiagnosticOrder(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return basicSetDiagnosticReport(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_MANIFEST:
				return basicSetDocumentManifest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return basicSetDocumentReference(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_REQUEST:
				return basicSetEligibilityRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_RESPONSE:
				return basicSetEligibilityResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return basicSetEncounter(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return basicSetEnrollmentRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return basicSetEnrollmentResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return basicSetEpisodeOfCare(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return basicSetExplanationOfBenefit(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return basicSetFamilyMemberHistory(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return basicSetFlag(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return basicSetGoal(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return basicSetGroup(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return basicSetHealthcareService(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMAGING_OBJECT_SELECTION:
				return basicSetImagingObjectSelection(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return basicSetImagingStudy(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return basicSetImmunization(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return basicSetImmunizationRecommendation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return basicSetList(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return basicSetLocation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDIA:
				return basicSetMedia(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return basicSetMedication(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return basicSetMedicationAdministration(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return basicSetMedicationDispense(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_PRESCRIPTION:
				return basicSetMedicationPrescription(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return basicSetMedicationStatement(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return basicSetMessageHeader(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return basicSetNamingSystem(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return basicSetNutritionOrder(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return basicSetObservation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return basicSetOperationDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return basicSetOperationOutcome(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ORDER:
				return basicSetOrder(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ORDER_RESPONSE:
				return basicSetOrderResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return basicSetOrganization(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return basicSetParameters(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return basicSetPatient(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return basicSetPaymentNotice(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return basicSetPaymentReconciliation(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return basicSetPerson(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return basicSetPractitioner(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return basicSetProcedure(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE_REQUEST:
				return basicSetProcedureRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROCESS_REQUEST:
				return basicSetProcessRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROCESS_RESPONSE:
				return basicSetProcessResponse(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return basicSetProvenance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return basicSetQuestionnaire(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_ANSWERS:
				return basicSetQuestionnaireAnswers(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__REFERRAL_REQUEST:
				return basicSetReferralRequest(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return basicSetRelatedPerson(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return basicSetSchedule(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return basicSetSearchParameter(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return basicSetSlot(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return basicSetSpecimen(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return basicSetStructureDefinition(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return basicSetSubscription(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return basicSetSubstance(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__SUPPLY:
				return basicSetSupply(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return basicSetValueSet(null, msgs);
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return basicSetVisionPrescription(null, msgs);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance();
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return getAppointment();
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return getAppointmentResponse();
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return getAuditEvent();
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return getBasic();
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return getBinary();
			case FhirPackage.DOCUMENT_ROOT__BODY_SITE:
				return getBodySite();
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle();
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return getCarePlan();
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return getClaim();
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return getClaimResponse();
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return getClinicalImpression();
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication();
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return getCommunicationRequest();
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return getComposition();
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return getConceptMap();
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition();
			case FhirPackage.DOCUMENT_ROOT__CONFORMANCE:
				return getConformance();
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract();
			case FhirPackage.DOCUMENT_ROOT__CONTRAINDICATION:
				return getContraindication();
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage();
			case FhirPackage.DOCUMENT_ROOT__DATA_ELEMENT:
				return getDataElement();
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_COMPONENT:
				return getDeviceComponent();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return getDeviceMetric();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_REQUEST:
				return getDeviceUseRequest();
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_STATEMENT:
				return getDeviceUseStatement();
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_ORDER:
				return getDiagnosticOrder();
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return getDiagnosticReport();
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_MANIFEST:
				return getDocumentManifest();
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return getDocumentReference();
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_REQUEST:
				return getEligibilityRequest();
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_RESPONSE:
				return getEligibilityResponse();
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return getEncounter();
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return getEnrollmentRequest();
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse();
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return getEpisodeOfCare();
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit();
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory();
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return getFlag();
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return getGoal();
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return getGroup();
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return getHealthcareService();
			case FhirPackage.DOCUMENT_ROOT__IMAGING_OBJECT_SELECTION:
				return getImagingObjectSelection();
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return getImagingStudy();
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return getImmunization();
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation();
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return getList();
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation();
			case FhirPackage.DOCUMENT_ROOT__MEDIA:
				return getMedia();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return getMedication();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return getMedicationDispense();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_PRESCRIPTION:
				return getMedicationPrescription();
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return getMedicationStatement();
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return getMessageHeader();
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return getNamingSystem();
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return getNutritionOrder();
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation();
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return getOperationDefinition();
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return getOperationOutcome();
			case FhirPackage.DOCUMENT_ROOT__ORDER:
				return getOrder();
			case FhirPackage.DOCUMENT_ROOT__ORDER_RESPONSE:
				return getOrderResponse();
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization();
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return getParameters();
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return getPatient();
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return getPaymentNotice();
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation();
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return getPerson();
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return getPractitioner();
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure();
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE_REQUEST:
				return getProcedureRequest();
			case FhirPackage.DOCUMENT_ROOT__PROCESS_REQUEST:
				return getProcessRequest();
			case FhirPackage.DOCUMENT_ROOT__PROCESS_RESPONSE:
				return getProcessResponse();
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance();
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return getQuestionnaire();
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_ANSWERS:
				return getQuestionnaireAnswers();
			case FhirPackage.DOCUMENT_ROOT__REFERRAL_REQUEST:
				return getReferralRequest();
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return getRelatedPerson();
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return getRiskAssessment();
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return getSchedule();
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return getSearchParameter();
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return getSlot();
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return getSpecimen();
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition();
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return getSubscription();
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return getSubstance();
			case FhirPackage.DOCUMENT_ROOT__SUPPLY:
				return getSupply();
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet();
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return getVisionPrescription();
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				setAppointment((Appointment)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				setAuditEvent((AuditEvent)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				setBasic((Basic)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				setBinary((Binary)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BODY_SITE:
				setBodySite((BodySite)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				setCarePlan((CarePlan)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				setClaim((Claim)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((Communication)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				setComposition((Composition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				setConceptMap((ConceptMap)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((Condition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONFORMANCE:
				setConformance((Conformance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((Contract)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRAINDICATION:
				setContraindication((Contraindication)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DATA_ELEMENT:
				setDataElement((DataElement)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_COMPONENT:
				setDeviceComponent((DeviceComponent)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_REQUEST:
				setDeviceUseRequest((DeviceUseRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_STATEMENT:
				setDeviceUseStatement((DeviceUseStatement)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_ORDER:
				setDiagnosticOrder((DiagnosticOrder)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_MANIFEST:
				setDocumentManifest((DocumentManifest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_REQUEST:
				setEligibilityRequest((EligibilityRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_RESPONSE:
				setEligibilityResponse((EligibilityResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				setEncounter((Encounter)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				setGoal((Goal)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_OBJECT_SELECTION:
				setImagingObjectSelection((ImagingObjectSelection)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				setImmunization((Immunization)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				setList((List)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDIA:
				setMedia((Media)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				setMedication((Medication)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_PRESCRIPTION:
				setMedicationPrescription((MedicationPrescription)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((Observation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORDER:
				setOrder((Order)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORDER_RESPONSE:
				setOrderResponse((OrderResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				setParameters((Parameters)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				setPatient((Patient)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				setPractitioner((Practitioner)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((Procedure)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE_REQUEST:
				setProcedureRequest((ProcedureRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_REQUEST:
				setProcessRequest((ProcessRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_RESPONSE:
				setProcessResponse((ProcessResponse)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((Provenance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_ANSWERS:
				setQuestionnaireAnswers((QuestionnaireAnswers)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__REFERRAL_REQUEST:
				setReferralRequest((ReferralRequest)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				setSchedule((Schedule)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				setSpecimen((Specimen)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				setSubscription((Subscription)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				setSubstance((Substance)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY:
				setSupply((Supply)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((ValueSet)newValue);
				return;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)newValue);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				setAllergyIntolerance((AllergyIntolerance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				setAppointment((Appointment)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				setAppointmentResponse((AppointmentResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				setAuditEvent((AuditEvent)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				setBasic((Basic)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				setBinary((Binary)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BODY_SITE:
				setBodySite((BodySite)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				setBundle((Bundle)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				setCarePlan((CarePlan)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				setClaim((Claim)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				setClaimResponse((ClaimResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				setClinicalImpression((ClinicalImpression)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				setCommunication((Communication)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				setCommunicationRequest((CommunicationRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				setComposition((Composition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				setConceptMap((ConceptMap)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				setCondition((Condition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONFORMANCE:
				setConformance((Conformance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				setContract((Contract)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__CONTRAINDICATION:
				setContraindication((Contraindication)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				setCoverage((Coverage)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DATA_ELEMENT:
				setDataElement((DataElement)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				setDevice((Device)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_COMPONENT:
				setDeviceComponent((DeviceComponent)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				setDeviceMetric((DeviceMetric)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_REQUEST:
				setDeviceUseRequest((DeviceUseRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_STATEMENT:
				setDeviceUseStatement((DeviceUseStatement)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_ORDER:
				setDiagnosticOrder((DiagnosticOrder)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				setDiagnosticReport((DiagnosticReport)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_MANIFEST:
				setDocumentManifest((DocumentManifest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				setDocumentReference((DocumentReference)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_REQUEST:
				setEligibilityRequest((EligibilityRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_RESPONSE:
				setEligibilityResponse((EligibilityResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				setEncounter((Encounter)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				setEnrollmentRequest((EnrollmentRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				setEnrollmentResponse((EnrollmentResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				setEpisodeOfCare((EpisodeOfCare)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				setExplanationOfBenefit((ExplanationOfBenefit)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				setFamilyMemberHistory((FamilyMemberHistory)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				setFlag((Flag)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				setGoal((Goal)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				setGroup((Group)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				setHealthcareService((HealthcareService)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_OBJECT_SELECTION:
				setImagingObjectSelection((ImagingObjectSelection)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				setImagingStudy((ImagingStudy)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				setImmunization((Immunization)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				setImmunizationRecommendation((ImmunizationRecommendation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				setList((List)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				setLocation((Location)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDIA:
				setMedia((Media)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				setMedication((Medication)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				setMedicationAdministration((MedicationAdministration)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				setMedicationDispense((MedicationDispense)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_PRESCRIPTION:
				setMedicationPrescription((MedicationPrescription)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				setMedicationStatement((MedicationStatement)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				setMessageHeader((MessageHeader)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				setNamingSystem((NamingSystem)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				setNutritionOrder((NutritionOrder)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				setObservation((Observation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				setOperationDefinition((OperationDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				setOperationOutcome((OperationOutcome)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORDER:
				setOrder((Order)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORDER_RESPONSE:
				setOrderResponse((OrderResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				setOrganization((Organization)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				setParameters((Parameters)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				setPatient((Patient)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				setPaymentNotice((PaymentNotice)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				setPaymentReconciliation((PaymentReconciliation)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				setPerson((Person)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				setPractitioner((Practitioner)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				setProcedure((Procedure)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE_REQUEST:
				setProcedureRequest((ProcedureRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_REQUEST:
				setProcessRequest((ProcessRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_RESPONSE:
				setProcessResponse((ProcessResponse)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				setProvenance((Provenance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				setQuestionnaire((Questionnaire)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_ANSWERS:
				setQuestionnaireAnswers((QuestionnaireAnswers)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__REFERRAL_REQUEST:
				setReferralRequest((ReferralRequest)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				setRelatedPerson((RelatedPerson)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				setSchedule((Schedule)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				setSearchParameter((SearchParameter)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				setSlot((Slot)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				setSpecimen((Specimen)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				setStructureDefinition((StructureDefinition)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				setSubscription((Subscription)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				setSubstance((Substance)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY:
				setSupply((Supply)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				setValueSet((ValueSet)null);
				return;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				setVisionPrescription((VisionPrescription)null);
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
			case FhirPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case FhirPackage.DOCUMENT_ROOT__ALLERGY_INTOLERANCE:
				return getAllergyIntolerance() != null;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT:
				return getAppointment() != null;
			case FhirPackage.DOCUMENT_ROOT__APPOINTMENT_RESPONSE:
				return getAppointmentResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__AUDIT_EVENT:
				return getAuditEvent() != null;
			case FhirPackage.DOCUMENT_ROOT__BASIC:
				return getBasic() != null;
			case FhirPackage.DOCUMENT_ROOT__BINARY:
				return getBinary() != null;
			case FhirPackage.DOCUMENT_ROOT__BODY_SITE:
				return getBodySite() != null;
			case FhirPackage.DOCUMENT_ROOT__BUNDLE:
				return getBundle() != null;
			case FhirPackage.DOCUMENT_ROOT__CARE_PLAN:
				return getCarePlan() != null;
			case FhirPackage.DOCUMENT_ROOT__CLAIM:
				return getClaim() != null;
			case FhirPackage.DOCUMENT_ROOT__CLAIM_RESPONSE:
				return getClaimResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__CLINICAL_IMPRESSION:
				return getClinicalImpression() != null;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION:
				return getCommunication() != null;
			case FhirPackage.DOCUMENT_ROOT__COMMUNICATION_REQUEST:
				return getCommunicationRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__COMPOSITION:
				return getComposition() != null;
			case FhirPackage.DOCUMENT_ROOT__CONCEPT_MAP:
				return getConceptMap() != null;
			case FhirPackage.DOCUMENT_ROOT__CONDITION:
				return getCondition() != null;
			case FhirPackage.DOCUMENT_ROOT__CONFORMANCE:
				return getConformance() != null;
			case FhirPackage.DOCUMENT_ROOT__CONTRACT:
				return getContract() != null;
			case FhirPackage.DOCUMENT_ROOT__CONTRAINDICATION:
				return getContraindication() != null;
			case FhirPackage.DOCUMENT_ROOT__COVERAGE:
				return getCoverage() != null;
			case FhirPackage.DOCUMENT_ROOT__DATA_ELEMENT:
				return getDataElement() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE:
				return getDevice() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_COMPONENT:
				return getDeviceComponent() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_METRIC:
				return getDeviceMetric() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_REQUEST:
				return getDeviceUseRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__DEVICE_USE_STATEMENT:
				return getDeviceUseStatement() != null;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_ORDER:
				return getDiagnosticOrder() != null;
			case FhirPackage.DOCUMENT_ROOT__DIAGNOSTIC_REPORT:
				return getDiagnosticReport() != null;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_MANIFEST:
				return getDocumentManifest() != null;
			case FhirPackage.DOCUMENT_ROOT__DOCUMENT_REFERENCE:
				return getDocumentReference() != null;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_REQUEST:
				return getEligibilityRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__ELIGIBILITY_RESPONSE:
				return getEligibilityResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__ENCOUNTER:
				return getEncounter() != null;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_REQUEST:
				return getEnrollmentRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__ENROLLMENT_RESPONSE:
				return getEnrollmentResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__EPISODE_OF_CARE:
				return getEpisodeOfCare() != null;
			case FhirPackage.DOCUMENT_ROOT__EXPLANATION_OF_BENEFIT:
				return getExplanationOfBenefit() != null;
			case FhirPackage.DOCUMENT_ROOT__FAMILY_MEMBER_HISTORY:
				return getFamilyMemberHistory() != null;
			case FhirPackage.DOCUMENT_ROOT__FLAG:
				return getFlag() != null;
			case FhirPackage.DOCUMENT_ROOT__GOAL:
				return getGoal() != null;
			case FhirPackage.DOCUMENT_ROOT__GROUP:
				return getGroup() != null;
			case FhirPackage.DOCUMENT_ROOT__HEALTHCARE_SERVICE:
				return getHealthcareService() != null;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_OBJECT_SELECTION:
				return getImagingObjectSelection() != null;
			case FhirPackage.DOCUMENT_ROOT__IMAGING_STUDY:
				return getImagingStudy() != null;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION:
				return getImmunization() != null;
			case FhirPackage.DOCUMENT_ROOT__IMMUNIZATION_RECOMMENDATION:
				return getImmunizationRecommendation() != null;
			case FhirPackage.DOCUMENT_ROOT__LIST:
				return getList() != null;
			case FhirPackage.DOCUMENT_ROOT__LOCATION:
				return getLocation() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDIA:
				return getMedia() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION:
				return getMedication() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_ADMINISTRATION:
				return getMedicationAdministration() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_DISPENSE:
				return getMedicationDispense() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_PRESCRIPTION:
				return getMedicationPrescription() != null;
			case FhirPackage.DOCUMENT_ROOT__MEDICATION_STATEMENT:
				return getMedicationStatement() != null;
			case FhirPackage.DOCUMENT_ROOT__MESSAGE_HEADER:
				return getMessageHeader() != null;
			case FhirPackage.DOCUMENT_ROOT__NAMING_SYSTEM:
				return getNamingSystem() != null;
			case FhirPackage.DOCUMENT_ROOT__NUTRITION_ORDER:
				return getNutritionOrder() != null;
			case FhirPackage.DOCUMENT_ROOT__OBSERVATION:
				return getObservation() != null;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_DEFINITION:
				return getOperationDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__OPERATION_OUTCOME:
				return getOperationOutcome() != null;
			case FhirPackage.DOCUMENT_ROOT__ORDER:
				return getOrder() != null;
			case FhirPackage.DOCUMENT_ROOT__ORDER_RESPONSE:
				return getOrderResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__ORGANIZATION:
				return getOrganization() != null;
			case FhirPackage.DOCUMENT_ROOT__PARAMETERS:
				return getParameters() != null;
			case FhirPackage.DOCUMENT_ROOT__PATIENT:
				return getPatient() != null;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_NOTICE:
				return getPaymentNotice() != null;
			case FhirPackage.DOCUMENT_ROOT__PAYMENT_RECONCILIATION:
				return getPaymentReconciliation() != null;
			case FhirPackage.DOCUMENT_ROOT__PERSON:
				return getPerson() != null;
			case FhirPackage.DOCUMENT_ROOT__PRACTITIONER:
				return getPractitioner() != null;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE:
				return getProcedure() != null;
			case FhirPackage.DOCUMENT_ROOT__PROCEDURE_REQUEST:
				return getProcedureRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_REQUEST:
				return getProcessRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__PROCESS_RESPONSE:
				return getProcessResponse() != null;
			case FhirPackage.DOCUMENT_ROOT__PROVENANCE:
				return getProvenance() != null;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE:
				return getQuestionnaire() != null;
			case FhirPackage.DOCUMENT_ROOT__QUESTIONNAIRE_ANSWERS:
				return getQuestionnaireAnswers() != null;
			case FhirPackage.DOCUMENT_ROOT__REFERRAL_REQUEST:
				return getReferralRequest() != null;
			case FhirPackage.DOCUMENT_ROOT__RELATED_PERSON:
				return getRelatedPerson() != null;
			case FhirPackage.DOCUMENT_ROOT__RISK_ASSESSMENT:
				return getRiskAssessment() != null;
			case FhirPackage.DOCUMENT_ROOT__SCHEDULE:
				return getSchedule() != null;
			case FhirPackage.DOCUMENT_ROOT__SEARCH_PARAMETER:
				return getSearchParameter() != null;
			case FhirPackage.DOCUMENT_ROOT__SLOT:
				return getSlot() != null;
			case FhirPackage.DOCUMENT_ROOT__SPECIMEN:
				return getSpecimen() != null;
			case FhirPackage.DOCUMENT_ROOT__STRUCTURE_DEFINITION:
				return getStructureDefinition() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSCRIPTION:
				return getSubscription() != null;
			case FhirPackage.DOCUMENT_ROOT__SUBSTANCE:
				return getSubstance() != null;
			case FhirPackage.DOCUMENT_ROOT__SUPPLY:
				return getSupply() != null;
			case FhirPackage.DOCUMENT_ROOT__VALUE_SET:
				return getValueSet() != null;
			case FhirPackage.DOCUMENT_ROOT__VISION_PRESCRIPTION:
				return getVisionPrescription() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
