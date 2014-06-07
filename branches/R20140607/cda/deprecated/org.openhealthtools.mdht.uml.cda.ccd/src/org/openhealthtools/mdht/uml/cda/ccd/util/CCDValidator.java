/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;
import org.openhealthtools.mdht.uml.cda.ccd.CoveredParty;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.Support;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public class CCDValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CCDValidator INSTANCE = new CCDValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.ccd";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Has Medication Or Supply Activity' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Template Id' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEMPLATE_ID = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Code' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Title' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TITLE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Text' of 'Medications Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATIONS_SECTION__MEDICATIONS_SECTION_TEXT = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Required' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_REQUIRED = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Class Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_CLASS_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Service Event Effective Time' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SERVICE_EVENT_EFFECTIVE_TIME = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document No Template Id Extension' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_NO_TEMPLATE_ID_EXTENSION = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document One Or Two Record Target' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ONE_OR_TWO_RECORD_TARGET = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Assigned Author' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Assigned Author Null Flavor' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_ASSIGNED_AUTHOR_NULL_FLAVOR = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Has Information Recipient' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_HAS_INFORMATION_RECIPIENT = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Template Id' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Language Code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_LANGUAGE_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Problem Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Family History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Social History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Alerts Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Medications Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATIONS_SECTION = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Results Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Procedures Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Encounters Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Plan Of Care Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Immunizations Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Vital Signs Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Medical Equipment Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Functional Status Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Advance Directives Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Payers Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Continuity Of Care Document Purpose Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Entry Relationship Required' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Subject Of Target' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_SUBJECT_OF_TARGET = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Problem Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Alert Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Contains Patient Awareness' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Class Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CLASS_CODE = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Mood Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_MOOD_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ID = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Code Null Flavor' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CODE_NULL_FLAVOR = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Effective Time' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_EFFECTIVE_TIME = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Act Episode Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_EPISODE_OBSERVATION = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Information Source' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_INFORMATION_SOURCE = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Contains Patient Awareness' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CONTAINS_PATIENT_AWARENESS = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Mood Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Status Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Effective Time' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Problem Status Observation' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_STATUS_OBSERVATION = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Problem Health Status Observation' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_PROBLEM_HEALTH_STATUS_OBSERVATION = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Observation Age Observation' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_AGE_OBSERVATION = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Template Id' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Code' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Title' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TITLE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Text' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEXT = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Problem Section Problem Act' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_PROBLEM_ACT = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation No Additional Participants' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation One Entry Relationship SUBJ' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_ONE_ENTRY_RELATIONSHIP_SUBJ = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Exists Entry Relationship SAS' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_EXISTS_ENTRY_RELATIONSHIP_SAS = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Status Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Value' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Problem Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Code' of 'Problem Health Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Episode Observation Value' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_VALUE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Participant Role Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_PARTICIPANT_ROLE_ID = 283;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 284;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Type Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE = 285;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Awareness Awareness Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_AWARENESS_CODE = 286;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Code' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_CODE = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Section Title' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TITLE = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 287;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID = 288;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Status Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE = 289;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Template Id' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID = 290;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Organizer Status Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE = 291;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Component Element' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_COMPONENT_ELEMENT = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Information Source' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_INFORMATION_SOURCE = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Mood Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_ID = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_CODE = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Status Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_STATUS_CODE = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_RESULT_OBSERVATION = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Reference Range Required' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_REFERENCE_RANGE_REQUIRED = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation No Observation Range Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Information Source' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_INFORMATION_SOURCE = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Mood Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_MOOD_CODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_ID = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Effective Time' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_EFFECTIVE_TIME = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Status Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_STATUS_CODE = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Method Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_METHOD_CODE = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Interpretation Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_INTERPRETATION_CODE = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Observation Value' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Code' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Section Title' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TITLE = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Social History Observation Template Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 292;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Code' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_CODE = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Section Title' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Clinical Statements' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_CLINICAL_STATEMENTS = 213;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 214;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Code' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_CODE = 215;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Title' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TITLE = 216;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Immunizations Section Text' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEXT = 217;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Template Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 293;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Class Code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_CLASS_CODE = 294;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Mood Code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_MOOD_CODE = 295;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ID = 296;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounters Activity Effective Time' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME = 297;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Mood Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Dose Quantity Or Rate Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Consents' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_CONSENTS = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Information Source' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INFORMATION_SOURCE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Precondition Criterion' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Reason' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Reason Problem' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON_PROBLEM = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Has Product' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRODUCT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Template Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Status Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Effective Time' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Max Dose Quantity' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Route Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Medication Series Number Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Medication Status Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Patient Instruction' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PATIENT_INSTRUCTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Reaction Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REACTION_OBSERVATION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Template Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Status Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Effective Time' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_EFFECTIVE_TIME = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Quantity' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_QUANTITY = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Repeat Number' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_REPEAT_NUMBER = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Medication Status Observation' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Fulfillment Instruction' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Template Id' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEMPLATE_ID = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Code' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_CODE = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Title' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TITLE = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Text' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEXT = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alerts Section Problem Act' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_PROBLEM_ACT = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Information Source' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_INFORMATION_SOURCE = 298;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Agent Representation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_AGENT_REPRESENTATION = 299;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Playing Entity Required' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED = 300;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Template Id' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID = 301;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Mood Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_MOOD_CODE = 302;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Status Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE = 303;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Effective Time' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_EFFECTIVE_TIME = 304;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Alert Status Observation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION = 305;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Alert Observation Reaction Observation' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_REACTION_OBSERVATION = 306;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Template Id' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Class Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_CLASS_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Mood Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_MOOD_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Status Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reaction Observation Severity Observation' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_SEVERITY_OBSERVATION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Template Id' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Class Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CLASS_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Mood Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_MOOD_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Status Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_STATUS_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Severity Observation Value' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_VALUE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 307;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Family History Observation Template Id' of 'Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAUSE_OF_DEATH_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 308;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Template Id' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Code' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_CODE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Title' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TITLE = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Text' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEXT = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Results Section Result Organizer' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_RESULT_ORGANIZER = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Template Id' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Class Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Mood Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Status Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Series Number Observation Value' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Template Id' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 309;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Encounter Location Type Code' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TYPE_CODE = 310;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL = 311;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Code' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_CODE = 312;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Code Original Text' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT = 313;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Has Material Name' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_HAS_MATERIAL_NAME = 314;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Template Id' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_TEMPLATE_ID = 315;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Template Id' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Code' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_CODE = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedures Section Title' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Code' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Title' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TITLE = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Text' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEXT = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Act' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Encounter' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Observation' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Procedure' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_PROCEDURE = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Substance Administration' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Plan Of Care Activity Supply' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_SUPPLY = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 218;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Code' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 219;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Title' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TITLE = 220;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Text' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT = 221;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 222;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 225;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Code' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_CODE = 226;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medical Equipment Section Title' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TITLE = 227;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Clinical Statements' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CLINICAL_STATEMENTS = 228;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 229;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Code' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE = 230;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Functional Status Section Title' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE = 231;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 232;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Code' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_CODE = 233;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Title' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TITLE = 234;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directives Section Advance Directive Observation' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE_OBSERVATION = 235;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID = 242;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Code' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_CODE = 243;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Title' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TITLE = 244;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Text' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEXT = 245;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payers Section Coverage Activity' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_COVERAGE_ACTIVITY = 246;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Information Source' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_INFORMATION_SOURCE = 247;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Sequence Number' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_SEQUENCE_NUMBER = 248;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Template Id' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TEMPLATE_ID = 271;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Code' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_CODE = 272;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Title' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TITLE = 273;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Text' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TEXT = 274;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Section Purpose Activity' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_PURPOSE_ACTIVITY = 275;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Has Reason' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_HAS_REASON = 276;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Reason Type' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_REASON_TYPE = 277;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Template Id' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_TEMPLATE_ID = 278;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Class Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CLASS_CODE = 279;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Mood Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_MOOD_CODE = 280;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CODE = 281;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Purpose Activity Status Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_STATUS_CODE = 282;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Organizer Information Source' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_INFORMATION_SOURCE = 223;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Result Organizer Template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 224;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Template Id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID = 236;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Class Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE = 237;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Mood Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE = 238;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ID = 239;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Status Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE = 240;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Observation Effective Time' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME = 241;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Advance Directive Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 316;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Template Id' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID = 317;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Type Code' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE = 318;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Advance Directive Verification Time' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TIME = 319;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Template Id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID = 249;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Class Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CLASS_CODE = 250;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Mood Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_MOOD_CODE = 251;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_ID = 252;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Status Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_STATUS_CODE = 253;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CODE = 254;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Activity Policy Activity' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_POLICY_ACTIVITY = 255;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Payer Entity Is Required' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED = 256;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party Is Required' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED = 257;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party Time' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY_TIME = 258;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Subscriber Is Allowed' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED = 259;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Subscriber Time' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_SUBSCRIBER_TIME = 260;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Entry Relationship REFR' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR = 261;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Entry Relationship Target' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET = 262;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Template Id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID = 263;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Class Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE = 264;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Mood Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE = 265;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ID = 266;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Status Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE = 267;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Payer Entity' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_PAYER_ENTITY = 268;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Covered Party' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_COVERED_PARTY = 269;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Activity Policy Subscriber' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_POLICY_SUBSCRIBER = 270;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Payer Entity Id' of 'Payer Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYER_ENTITY__PAYER_ENTITY_ID = 330;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Covered Party Id' of 'Covered Party'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERED_PARTY__COVERED_PARTY_ID = 331;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Covered Party Code' of 'Covered Party'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERED_PARTY__COVERED_PARTY_CODE = 332;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Policy Subscriber Id' of 'Policy Subscriber'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_SUBSCRIBER__POLICY_SUBSCRIBER_ID = 333;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Template Id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_TEMPLATE_ID = 320;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Class Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_CLASS_CODE = 321;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Mood Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_MOOD_CODE = 322;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Authorization Activity Id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ID = 323;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Mood Code Value' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE_VALUE = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Template Id' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Id' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_ID = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Mood Code' of 'Plan Of Care Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ACT__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Instruction Template Id' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Patient Instruction Mood Code' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_MOOD_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Mood Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MOOD_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Author' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_AUTHOR = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Performer' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PERFORMER = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Participant Location' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PARTICIPANT_LOCATION = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Information Source' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_INFORMATION_SOURCE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Supply Activity Has Product' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_HAS_PRODUCT = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fulfillment Instruction Template Id' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Fulfillment Instruction Mood Code' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_MOOD_CODE = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Status Observation Template Id' of 'Functional Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 324;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Template Id' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID = 325;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Product Instance Class Code' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE = 326;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Template Id' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_TEMPLATE_ID = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Class Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CLASS_CODE = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Mood Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_MOOD_CODE = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_CODE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Status Code' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_STATUS_CODE = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Age Observation Value' of 'Age Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AGE_OBSERVATION__AGE_OBSERVATION_VALUE = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Mood Code Value' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE_VALUE = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Template Id' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Id' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_ID = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Mood Code' of 'Plan Of Care Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_OBSERVATION__PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Mood Code Value' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE_VALUE = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Template Id' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Id' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_ID = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Encounter Mood Code' of 'Plan Of Care Activity Encounter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PLAN_OF_CARE_ACTIVITY_ENCOUNTER_MOOD_CODE = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Mood Code Value' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE_VALUE = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Template Id' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Id' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_ID = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Procedure Mood Code' of 'Plan Of Care Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_PROCEDURE__PLAN_OF_CARE_ACTIVITY_PROCEDURE_MOOD_CODE = 204;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Mood Code Value' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE_VALUE = 205;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Template Id' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID = 206;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Id' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ID = 207;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Substance Administration Mood Code' of 'Plan Of Care Activity Substance Administration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION__PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_MOOD_CODE = 208;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Mood Code Value' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE_VALUE = 209;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Template Id' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_TEMPLATE_ID = 210;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Id' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_ID = 211;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Supply Mood Code' of 'Plan Of Care Activity Supply'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY_SUPPLY__PLAN_OF_CARE_ACTIVITY_SUPPLY_MOOD_CODE = 212;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Act Template Id' of 'Procedure Activity Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_ACT__PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID = 327;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Observation Template Id' of 'Procedure Activity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_OBSERVATION__PROCEDURE_ACTIVITY_OBSERVATION_TEMPLATE_ID = 328;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Procedure Activity Procedure Template Id' of 'Procedure Activity Procedure'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY_PROCEDURE__PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID = 329;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Class Code' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_CLASS_CODE = 334;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Id' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_ID = 335;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Coverage Plan Description Mood Code' of 'Coverage Plan Description'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_PLAN_DESCRIPTION__COVERAGE_PLAN_DESCRIPTION_MOOD_CODE = 336;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Template Id' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_TEMPLATE_ID = 337;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Class Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CLASS_CODE = 338;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Mood Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_MOOD_CODE = 339;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Comment Code' of 'Comment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMMENT__COMMENT_CODE = 340;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 340;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CDAValidator cdaValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDValidator() {
		super();
		cdaValidator = CDAValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CCDPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CCDPackage.MEDICATIONS_SECTION:
				return validateMedicationsSection((MedicationsSection)value, diagnostics, context);
			case CCDPackage.MEDICATION_ACTIVITY:
				return validateMedicationActivity((MedicationActivity)value, diagnostics, context);
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return validateMedicationSeriesNumberObservation((MedicationSeriesNumberObservation)value, diagnostics, context);
			case CCDPackage.MEDICATION_STATUS_OBSERVATION:
				return validateMedicationStatusObservation((MedicationStatusObservation)value, diagnostics, context);
			case CCDPackage.STATUS_OBSERVATION:
				return validateStatusObservation((StatusObservation)value, diagnostics, context);
			case CCDPackage.PATIENT_INSTRUCTION:
				return validatePatientInstruction((PatientInstruction)value, diagnostics, context);
			case CCDPackage.REACTION_OBSERVATION:
				return validateReactionObservation((ReactionObservation)value, diagnostics, context);
			case CCDPackage.SEVERITY_OBSERVATION:
				return validateSeverityObservation((SeverityObservation)value, diagnostics, context);
			case CCDPackage.SUPPLY_ACTIVITY:
				return validateSupplyActivity((SupplyActivity)value, diagnostics, context);
			case CCDPackage.FULFILLMENT_INSTRUCTION:
				return validateFulfillmentInstruction((FulfillmentInstruction)value, diagnostics, context);
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return validateContinuityOfCareDocument((ContinuityOfCareDocument)value, diagnostics, context);
			case CCDPackage.PROBLEM_SECTION:
				return validateProblemSection((ProblemSection)value, diagnostics, context);
			case CCDPackage.PROBLEM_ACT:
				return validateProblemAct((ProblemAct)value, diagnostics, context);
			case CCDPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_OBSERVATION:
				return validateProblemObservation((ProblemObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_STATUS_OBSERVATION:
				return validateProblemStatusObservation((ProblemStatusObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_HEALTH_STATUS_OBSERVATION:
				return validateProblemHealthStatusObservation((ProblemHealthStatusObservation)value, diagnostics, context);
			case CCDPackage.AGE_OBSERVATION:
				return validateAgeObservation((AgeObservation)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case CCDPackage.ALERTS_SECTION:
				return validateAlertsSection((AlertsSection)value, diagnostics, context);
			case CCDPackage.RESULTS_SECTION:
				return validateResultsSection((ResultsSection)value, diagnostics, context);
			case CCDPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
			case CCDPackage.RESULT_OBSERVATION:
				return validateResultObservation((ResultObservation)value, diagnostics, context);
			case CCDPackage.PROCEDURES_SECTION:
				return validateProceduresSection((ProceduresSection)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY:
				return validatePlanOfCareActivity((PlanOfCareActivity)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ACT:
				return validatePlanOfCareActivityAct((PlanOfCareActivityAct)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER:
				return validatePlanOfCareActivityEncounter((PlanOfCareActivityEncounter)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION:
				return validatePlanOfCareActivityObservation((PlanOfCareActivityObservation)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE:
				return validatePlanOfCareActivityProcedure((PlanOfCareActivityProcedure)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION:
				return validatePlanOfCareActivitySubstanceAdministration((PlanOfCareActivitySubstanceAdministration)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY:
				return validatePlanOfCareActivitySupply((PlanOfCareActivitySupply)value, diagnostics, context);
			case CCDPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer)value, diagnostics, context);
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection)value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return validateAdvanceDirectiveObservation((AdvanceDirectiveObservation)value, diagnostics, context);
			case CCDPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case CCDPackage.COVERAGE_ACTIVITY:
				return validateCoverageActivity((CoverageActivity)value, diagnostics, context);
			case CCDPackage.POLICY_ACTIVITY:
				return validatePolicyActivity((PolicyActivity)value, diagnostics, context);
			case CCDPackage.PURPOSE_SECTION:
				return validatePurposeSection((PurposeSection)value, diagnostics, context);
			case CCDPackage.PURPOSE_ACTIVITY:
				return validatePurposeActivity((PurposeActivity)value, diagnostics, context);
			case CCDPackage.PATIENT_AWARENESS:
				return validatePatientAwareness((PatientAwareness)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_OBSERVATION:
				return validateFamilyHistoryObservation((FamilyHistoryObservation)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_ORGANIZER:
				return validateFamilyHistoryOrganizer((FamilyHistoryOrganizer)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION:
				return validateSocialHistoryObservation((SocialHistoryObservation)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_ACTIVITY:
				return validateEncountersActivity((EncountersActivity)value, diagnostics, context);
			case CCDPackage.ALERT_OBSERVATION:
				return validateAlertObservation((AlertObservation)value, diagnostics, context);
			case CCDPackage.ALERT_STATUS_OBSERVATION:
				return validateAlertStatusObservation((AlertStatusObservation)value, diagnostics, context);
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION:
				return validateCauseOfDeathObservation((CauseOfDeathObservation)value, diagnostics, context);
			case CCDPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case CCDPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return validateAdvanceDirectiveStatusObservation((AdvanceDirectiveStatusObservation)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return validateAdvanceDirectiveVerification((AdvanceDirectiveVerification)value, diagnostics, context);
			case CCDPackage.AUTHORIZATION_ACTIVITY:
				return validateAuthorizationActivity((AuthorizationActivity)value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY:
				return validateProcedureActivity((ProcedureActivity)value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_OBSERVATION:
				return validateFunctionalStatusObservation((FunctionalStatusObservation)value, diagnostics, context);
			case CCDPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance)value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_ACT:
				return validateProcedureActivityAct((ProcedureActivityAct)value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_OBSERVATION:
				return validateProcedureActivityObservation((ProcedureActivityObservation)value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY_PROCEDURE:
				return validateProcedureActivityProcedure((ProcedureActivityProcedure)value, diagnostics, context);
			case CCDPackage.PAYER_ENTITY:
				return validatePayerEntity((PayerEntity)value, diagnostics, context);
			case CCDPackage.COVERED_PARTY:
				return validateCoveredParty((CoveredParty)value, diagnostics, context);
			case CCDPackage.POLICY_SUBSCRIBER:
				return validatePolicySubscriber((PolicySubscriber)value, diagnostics, context);
			case CCDPackage.COVERAGE_PLAN_DESCRIPTION:
				return validateCoveragePlanDescription((CoveragePlanDescription)value, diagnostics, context);
			case CCDPackage.SUPPORT_PARTICIPANT:
				return validateSupportParticipant((SupportParticipant)value, diagnostics, context);
			case CCDPackage.SUPPORT:
				return validateSupport((Support)value, diagnostics, context);
			case CCDPackage.SUPPORT_GUARDIAN:
				return validateSupportGuardian((SupportGuardian)value, diagnostics, context);
			case CCDPackage.COMMENT:
				return validateComment((Comment)value, diagnostics, context);
			case CCDPackage.CCD_REGISTRY_DELEGATE:
				return validateCCDRegistryDelegate((CCDRegistryDelegate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateMedicationsSectionTemplateId(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateMedicationsSectionCode(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateMedicationsSectionTitle(medicationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationsSection_validateMedicationsSectionText(medicationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationsSectionHasMedicationOrSupplyActivity constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionHasMedicationOrSupplyActivity(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionHasMedicationOrSupplyActivity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionTemplateId constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionTemplateId(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionCode constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionCode(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionTitle constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionTitle(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationsSectionText constraint of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsSection_validateMedicationsSectionText(MedicationsSection medicationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationsSection.validateMedicationsSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(continuityOfCareDocument, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(continuityOfCareDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventRequired constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventRequired(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventRequired(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventClassCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventClassCode(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentServiceEventEffectiveTime constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentServiceEventEffectiveTime(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentServiceEventEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentNoTemplateIdExtension constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentNoTemplateIdExtension(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentNoTemplateIdExtension(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentOneOrTwoRecordTarget constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentOneOrTwoRecordTarget(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentOneOrTwoRecordTarget(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasAssignedAuthor constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthor(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasAssignedAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentHasInformationRecipient constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentHasInformationRecipient(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentHasInformationRecipient(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentTemplateId constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentTemplateId(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentCode(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentLanguageCode constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentLanguageCode(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentProblemSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentProblemSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentFamilyHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentFamilyHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentSocialHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentSocialHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentAlertsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentAlertsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentAlertsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentMedicationsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicationsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentResultsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentResultsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentProceduresSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentProceduresSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentEncountersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentEncountersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentEncountersSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPlanOfCareSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPlanOfCareSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPlanOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentImmunizationsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentImmunizationsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentVitalSignsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentVitalSignsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentMedicalEquipmentSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentMedicalEquipmentSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentMedicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentFunctionalStatusSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentFunctionalStatusSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentFunctionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentAdvanceDirectivesSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentAdvanceDirectivesSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentAdvanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPayersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPayersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPayersSection(diagnostics, context);
	}

	/**
	 * Validates the validateContinuityOfCareDocumentPurposeSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_validateContinuityOfCareDocumentPurposeSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.validateContinuityOfCareDocumentPurposeSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActEntryRelationshipRequired(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActSubjectOfTarget(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActContainsProblemObservation(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActContainsAlertObservation(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActContainsPatientAwareness(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActTemplateId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActClassCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActMoodCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActCodeNullFlavor(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActEffectiveTime(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_validateProblemActEpisodeObservation(problemAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemActEntryRelationshipRequired constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEntryRelationshipRequired(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEntryRelationshipRequired(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActSubjectOfTarget constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActSubjectOfTarget(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActSubjectOfTarget(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsProblemObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsProblemObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsProblemObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsAlertObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsAlertObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsAlertObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActContainsPatientAwareness constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActContainsPatientAwareness(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActTemplateId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActTemplateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActClassCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActClassCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActMoodCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActMoodCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActCodeNullFlavor constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActCodeNullFlavor(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActCodeNullFlavor(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActEffectiveTime constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEffectiveTime(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProblemActEpisodeObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_validateProblemActEpisodeObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.validateProblemActEpisodeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationInformationSource(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationContainsPatientAwareness(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationTemplateId(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationMoodCode(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationStatusCode(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationEffectiveTime(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationProblemStatusObservation(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_validateProblemObservationAgeObservation(problemObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemObservationInformationSource constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationInformationSource(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationContainsPatientAwareness constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationContainsPatientAwareness(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationContainsPatientAwareness(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationTemplateId constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationTemplateId(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationMoodCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationMoodCode(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationStatusCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationStatusCode(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationEffectiveTime constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationEffectiveTime(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationProblemStatusObservation constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationProblemStatusObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationProblemStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationProblemHealthStatusObservation constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationProblemHealthStatusObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationProblemHealthStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateProblemObservationAgeObservation constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_validateProblemObservationAgeObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.validateProblemObservationAgeObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_validateProblemSectionTemplateId(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_validateProblemSectionCode(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_validateProblemSectionTitle(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_validateProblemSectionText(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_validateProblemSectionProblemAct(problemSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProblemSectionTemplateId constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionTemplateId(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionCode constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionCode(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionTitle constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionTitle(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionText constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionText(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateProblemSectionProblemAct constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_validateProblemSectionProblemAct(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.validateProblemSectionProblemAct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatusObservation_validateStatusObservationTemplateId(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(problemStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(problemStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatusObservation_validateStatusObservationTemplateId(ProblemStatusObservation problemStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(problemStatusObservation, context) },
						 new Object[] { problemStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(problemStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationTemplateId(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(statusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationNoAdditionalParticipants constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationNoAdditionalParticipants(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationNoAdditionalParticipants(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationTemplateId(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationClassCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationClassCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationMoodCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationMoodCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationStatusCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationStatusCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationValue constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_validateStatusObservationValue(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.validateStatusObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatusObservation(ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(problemHealthStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatusObservation_validateStatusObservationTemplateId(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatusObservation_validateStatusObservationCode(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(problemHealthStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(problemHealthStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Problem Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatusObservation_validateStatusObservationTemplateId(ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(problemHealthStatusObservation, context) },
						 new Object[] { problemHealthStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(problemHealthStatusObservation, diagnostics, context);
	}

	/**
	 * Validates the validateStatusObservationCode constraint of '<em>Problem Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatusObservation_validateStatusObservationCode(ProblemHealthStatusObservation problemHealthStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationCode", getObjectLabel(problemHealthStatusObservation, context) },
						 new Object[] { problemHealthStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationCode(problemHealthStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(episodeObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationTemplateId(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationClassCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationMoodCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationStatusCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_validateEpisodeObservationValue(episodeObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEpisodeObservationOneEntryRelationshipSUBJ constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationOneEntryRelationshipSUBJ(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationOneEntryRelationshipSUBJ(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationExistsEntryRelationshipSAS constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationExistsEntryRelationshipSAS(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationExistsEntryRelationshipSAS(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationTemplateId constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationTemplateId(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationClassCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationClassCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationMoodCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationMoodCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationStatusCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationStatusCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateEpisodeObservationValue constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_validateEpisodeObservationValue(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.validateEpisodeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientAwareness, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_validatePatientAwarenessParticipantRoleId(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_validatePatientAwarenessTemplateId(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_validatePatientAwarenessTypeCode(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_validatePatientAwarenessAwarenessCode(patientAwareness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientAwarenessParticipantRoleId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessParticipantRoleId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessParticipantRoleId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessTemplateId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessTemplateId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessTypeCode constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessTypeCode(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validatePatientAwarenessAwarenessCode constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_validatePatientAwarenessAwarenessCode(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.validatePatientAwarenessAwarenessCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_validateFamilyHistorySectionCode(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_validateFamilyHistorySectionTitle(familyHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyHistorySectionTemplateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionTemplateId(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionCode constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionCode(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistorySectionTitle constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_validateFamilyHistorySectionTitle(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.validateFamilyHistorySectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationTemplateId(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationId(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(familyHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryObservationTemplateId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationTemplateId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryObservationStatusCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.validateFamilyHistoryObservationStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(familyHistoryOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerTemplateId(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerStatusCode(familyHistoryOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerTemplateId constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerTemplateId(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFamilyHistoryOrganizerStatusCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_validateFamilyHistoryOrganizerStatusCode(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.validateFamilyHistoryOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerComponentElement(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerInformationSource(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerTemplateId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerMoodCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerStatusCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerResultObservation(resultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultOrganizerComponentElement constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerComponentElement(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerComponentElement(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerInformationSource constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerInformationSource(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerTemplateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerMoodCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerMoodCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerId(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerStatusCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerStatusCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerResultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_validateResultOrganizerResultObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.validateResultOrganizerResultObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationReferenceRangeRequired(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationNoObservationRangeCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationInformationSource(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationTemplateId(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationMoodCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationId(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationEffectiveTime(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationStatusCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationMethodCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationInterpretationCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_validateResultObservationValue(resultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultObservationReferenceRangeRequired constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationReferenceRangeRequired(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationReferenceRangeRequired(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationNoObservationRangeCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationNoObservationRangeCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationNoObservationRangeCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationInformationSource constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationInformationSource(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationTemplateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationTemplateId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationMoodCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationMoodCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationEffectiveTime constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationEffectiveTime(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationStatusCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationStatusCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationMethodCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationMethodCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationMethodCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationInterpretationCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationInterpretationCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationInterpretationCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultObservationValue constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_validateResultObservationValue(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.validateResultObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistorySection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateSocialHistorySectionTemplateId(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateSocialHistorySectionCode(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_validateSocialHistorySectionTitle(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSocialHistorySectionTemplateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionTemplateId(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionCode constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionCode(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateSocialHistorySectionTitle constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_validateSocialHistorySectionTitle(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.validateSocialHistorySectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(socialHistoryObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(socialHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSocialHistoryObservationTemplateId constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_validateSocialHistoryObservationTemplateId(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.validateSocialHistoryObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateEncountersSectionTemplateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateEncountersSectionCode(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_validateEncountersSectionTitle(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncountersSectionTemplateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionTemplateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionCode constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionCode(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersSectionTitle constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_validateEncountersSectionTitle(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.validateEncountersSectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(immunizationsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateImmunizationsSectionClinicalStatements(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateImmunizationsSectionTemplateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateImmunizationsSectionCode(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateImmunizationsSectionTitle(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_validateImmunizationsSectionText(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateImmunizationsSectionClinicalStatements constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionClinicalStatements(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionClinicalStatements(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTemplateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionTemplateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionCode constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionCode(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionTitle constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionTitle(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateImmunizationsSectionText constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_validateImmunizationsSectionText(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.validateImmunizationsSectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encountersActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_validateEncountersActivityTemplateId(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_validateEncountersActivityClassCode(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_validateEncountersActivityMoodCode(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_validateEncountersActivityId(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_validateEncountersActivityEffectiveTime(encountersActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncountersActivityTemplateId constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityTemplateId(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityClassCode constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityClassCode(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityMoodCode constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityMoodCode(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityId constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityId(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateEncountersActivityEffectiveTime constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_validateEncountersActivityEffectiveTime(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.validateEncountersActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityMoodCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasConsents(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityInformationSource(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasReason(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasReasonProblem(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityHasProduct(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityTemplateId(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityId(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityStatusCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityEffectiveTime(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityRouteCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPatientInstruction(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityReactionObservation(medicationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationActivityMoodCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMoodCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasDoseQuantityOrRateQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasDoseQuantityOrRateQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasConsents constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasConsents(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasConsents(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityInformationSource constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityInformationSource(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasPreconditionCriterion constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasPreconditionCriterion(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasPreconditionCriterion(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasReason constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasReason(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasReason(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasReasonProblem constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasReasonProblem(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasReasonProblem(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityHasProduct constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityHasProduct(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityTemplateId constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityId constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityStatusCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityStatusCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityEffectiveTime constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityEffectiveTime(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMaxDoseQuantity constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMaxDoseQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityRouteCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityRouteCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityRouteCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMedicationSeriesNumberObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMedicationSeriesNumberObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityMedicationStatusObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityMedicationStatusObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityMedicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityPatientInstruction constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityPatientInstruction(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityPatientInstruction(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationActivityReactionObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_validateMedicationActivityReactionObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.validateMedicationActivityReactionObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supplyActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityMoodCode(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityHasAuthor(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityHasPerformer(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityHasParticipantLocation(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityInformationSource(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityHasProduct(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityTemplateId(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityId(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityStatusCode(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityEffectiveTime(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityQuantity(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityRepeatNumber(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(supplyActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSupplyActivityMoodCode constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityMoodCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasAuthor constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasAuthor(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasAuthor(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasPerformer constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasPerformer(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasPerformer(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasParticipantLocation constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasParticipantLocation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasParticipantLocation(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityInformationSource constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityInformationSource(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityHasProduct constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityHasProduct(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityHasProduct(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityTemplateId constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityTemplateId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityId constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityStatusCode constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityStatusCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityEffectiveTime constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityEffectiveTime(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityQuantity constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityQuantity(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityQuantity(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityRepeatNumber constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityRepeatNumber(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityRepeatNumber(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityMedicationStatusObservation constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityMedicationStatusObservation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityMedicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateSupplyActivityFulfillmentInstruction constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_validateSupplyActivityFulfillmentInstruction(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.validateSupplyActivityFulfillmentInstruction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_validateAlertsSectionTemplateId(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_validateAlertsSectionCode(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_validateAlertsSectionTitle(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_validateAlertsSectionText(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_validateAlertsSectionProblemAct(alertsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAlertsSectionTemplateId constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionTemplateId(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionCode constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionCode(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionTitle constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionTitle(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionText constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionText(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateAlertsSectionProblemAct constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_validateAlertsSectionProblemAct(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.validateAlertsSectionProblemAct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationInformationSource(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationAgentRepresentation(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationPlayingEntityRequired(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationTemplateId(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationMoodCode(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationStatusCode(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationEffectiveTime(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationAlertStatusObservation(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_validateAlertObservationReactionObservation(alertObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAlertObservationInformationSource constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationInformationSource(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationAgentRepresentation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationAgentRepresentation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationAgentRepresentation(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationPlayingEntityRequired constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationPlayingEntityRequired(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationPlayingEntityRequired(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationTemplateId constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationTemplateId(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationMoodCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationMoodCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationStatusCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationStatusCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationEffectiveTime constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationEffectiveTime(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationAlertStatusObservation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationAlertStatusObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationAlertStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the validateAlertObservationReactionObservation constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_validateAlertObservationReactionObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.validateAlertObservationReactionObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reactionObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_validateReactionObservationTemplateId(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_validateReactionObservationClassCode(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_validateReactionObservationMoodCode(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_validateReactionObservationStatusCode(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_validateReactionObservationSeverityObservation(reactionObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReactionObservationTemplateId constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationTemplateId(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationClassCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationClassCode(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationMoodCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationMoodCode(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationStatusCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationStatusCode(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateReactionObservationSeverityObservation constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_validateReactionObservationSeverityObservation(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.validateReactionObservationSeverityObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(severityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationTemplateId(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationClassCode(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationMoodCode(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationCode(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationStatusCode(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_validateSeverityObservationValue(severityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateSeverityObservationTemplateId constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationTemplateId(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationClassCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationClassCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationMoodCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationMoodCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationStatusCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationStatusCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateSeverityObservationValue constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_validateSeverityObservationValue(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.validateSeverityObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation(AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(alertStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertStatusObservation_validateStatusObservationTemplateId(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(alertStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation_validateStatusObservationTemplateId(AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(alertStatusObservation, context) },
						 new Object[] { alertStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(alertStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation(CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(causeOfDeathObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationId(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_validateFamilyHistoryObservationStatusCode(causeOfDeathObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFamilyHistoryObservationTemplateId constraint of '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation_validateFamilyHistoryObservationTemplateId(CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateFamilyHistoryObservationTemplateId", getObjectLabel(causeOfDeathObservation, context) },
						 new Object[] { causeOfDeathObservation },
						 context));
			}
			return false;
		}
		return validateFamilyHistoryObservation_validateFamilyHistoryObservationTemplateId(causeOfDeathObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionTemplateId(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionCode(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionTitle(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionText(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_validateResultsSectionResultOrganizer(resultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateResultsSectionTemplateId constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionTemplateId(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionCode constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionCode(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionTitle constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionTitle(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionText constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionText(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateResultsSectionResultOrganizer constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_validateResultsSectionResultOrganizer(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.validateResultsSectionResultOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationSeriesNumberObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationTemplateId(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationClassCode(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationMoodCode(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationStatusCode(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationCode(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationValue(medicationSeriesNumberObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationTemplateId constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationTemplateId(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationClassCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationClassCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationMoodCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationMoodCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationStatusCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationStatusCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicationSeriesNumberObservationValue constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_validateMedicationSeriesNumberObservationValue(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.validateMedicationSeriesNumberObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation(MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicationStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationStatusObservation_validateStatusObservationTemplateId(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(medicationStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation_validateStatusObservationTemplateId(MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(medicationStatusObservation, context) },
						 new Object[] { medicationStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(medicationStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(encounterLocation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterLocation_validateEncounterLocationTemplateId(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterLocation_validateEncounterLocationTypeCode(encounterLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateEncounterLocationTemplateId constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationTemplateId(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateEncounterLocationTypeCode constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_validateEncounterLocationTypeCode(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.validateEncounterLocationTypeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(product, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_validateManufacturedDrugOrOtherMaterial(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_validateProductHasMaterial(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_validateProductHasMaterialCode(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_validateProductHasMaterialCodeOriginalText(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_validateProductHasMaterialName(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_validateProductTemplateId(product, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProductHasMaterial constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterial(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductHasMaterial(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialCode constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialCode(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductHasMaterialCode(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialCodeOriginalText constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialCodeOriginalText(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductHasMaterialCodeOriginalText(diagnostics, context);
	}

	/**
	 * Validates the validateProductHasMaterialName constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductHasMaterialName(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductHasMaterialName(diagnostics, context);
	}

	/**
	 * Validates the validateProductTemplateId constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_validateProductTemplateId(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.validateProductTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(proceduresSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_validateProceduresSectionTemplateId(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_validateProceduresSectionCode(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_validateProceduresSectionTitle(proceduresSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProceduresSectionTemplateId constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionTemplateId(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionCode constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionCode(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateProceduresSectionTitle constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_validateProceduresSectionTitle(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.validateProceduresSectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionCode(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionTitle(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionText(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareSectionTemplateId constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionTemplateId(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionCode constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionCode(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionTitle constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionTitle(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionText constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionText(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityAct constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityAct(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityEncounter constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityEncounter(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityObservation constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityObservation(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivityProcedure constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivityProcedure(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareSectionPlanOfCareActivitySupply constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.validatePlanOfCareSectionPlanOfCareActivitySupply(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivity(PlanOfCareActivity planOfCareActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(planOfCareActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTitle(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionTemplateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionCode constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionCode(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionTitle constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionTitle(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionText constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionText(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionText(diagnostics, context);
	}

	/**
	 * Validates the validateVitalSignsSectionVitalSignsOrganizer constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionVitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(medicalEquipmentSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(medicalEquipmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateMedicalEquipmentSectionTemplateId constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionTemplateId(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionCode constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionCode(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateMedicalEquipmentSectionTitle constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_validateMedicalEquipmentSectionTitle(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.validateMedicalEquipmentSectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateFunctionalStatusSectionCode(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(functionalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFunctionalStatusSectionClinicalStatements constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionClinicalStatements(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionClinicalStatements(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionTemplateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionTemplateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionCode constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionCode(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateFunctionalStatusSectionTitle constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_validateFunctionalStatusSectionTitle(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.validateFunctionalStatusSectionTitle(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectivesSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionTemplateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTemplateId(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionCode constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionCode(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionTitle constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionTitle(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectivesSectionAdvanceDirectiveObservation constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_validateAdvanceDirectivesSectionAdvanceDirectiveObservation(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.validateAdvanceDirectivesSectionAdvanceDirectiveObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payersSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validatePayersSectionTemplateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validatePayersSectionCode(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validatePayersSectionTitle(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validatePayersSectionText(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_validatePayersSectionCoverageActivity(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePayersSectionTemplateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionTemplateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionCode constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionCode(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionTitle constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionTitle(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionText constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionText(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePayersSectionCoverageActivity constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_validatePayersSectionCoverageActivity(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.validatePayersSectionCoverageActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_validatePurposeSectionTemplateId(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_validatePurposeSectionCode(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_validatePurposeSectionTitle(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_validatePurposeSectionText(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_validatePurposeSectionPurposeActivity(purposeSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePurposeSectionTemplateId constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionTemplateId(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionCode constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionCode(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionTitle constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionTitle(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionTitle(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionText constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionText(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionText(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeSectionPurposeActivity constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_validatePurposeSectionPurposeActivity(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.validatePurposeSectionPurposeActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(purposeActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityHasReason(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityReasonType(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityTemplateId(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityClassCode(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityMoodCode(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityCode(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_validatePurposeActivityStatusCode(purposeActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePurposeActivityHasReason constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityHasReason(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityHasReason(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityReasonType constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityReasonType(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityReasonType(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityTemplateId constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityTemplateId(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityClassCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityClassCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityMoodCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityMoodCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validatePurposeActivityStatusCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_validatePurposeActivityStatusCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.validatePurposeActivityStatusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(vitalSignsOrganizer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerComponentElement(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerMoodCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerStatusCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_validateResultOrganizerResultObservation(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignsOrganizerInformationSource constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateVitalSignsOrganizerInformationSource(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.validateVitalSignsOrganizerInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateResultOrganizerTemplateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_validateResultOrganizerTemplateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateResultOrganizerTemplateId", getObjectLabel(vitalSignsOrganizer, context) },
						 new Object[] { vitalSignsOrganizer },
						 context));
			}
			return false;
		}
		return validateResultOrganizer_validateResultOrganizerTemplateId(vitalSignsOrganizer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationTemplateId(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationClassCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationMoodCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationId(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationStatusCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationEffectiveTime(advanceDirectiveObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationTemplateId constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationTemplateId(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationClassCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationClassCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationMoodCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationMoodCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationId constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationId(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationStatusCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationStatusCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveObservationEffectiveTime constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_validateAdvanceDirectiveObservationEffectiveTime(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.validateAdvanceDirectiveObservationEffectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveStatusObservation_validateStatusObservationTemplateId(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(advanceDirectiveStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation_validateStatusObservationTemplateId(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(advanceDirectiveStatusObservation, context) },
						 new Object[] { advanceDirectiveStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(advanceDirectiveStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(advanceDirectiveVerification, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTemplateId(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTypeCode(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTime(advanceDirectiveVerification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTemplateId constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTypeCode constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTypeCode(diagnostics, context);
	}

	/**
	 * Validates the validateAdvanceDirectiveVerificationTime constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.validateAdvanceDirectiveVerificationTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coverageActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityInformationSource(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivitySequenceNumber(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityTemplateId(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityClassCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityMoodCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityId(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityStatusCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_validateCoverageActivityPolicyActivity(coverageActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoverageActivityInformationSource constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityInformationSource(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityInformationSource(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivitySequenceNumber constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivitySequenceNumber(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivitySequenceNumber(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityTemplateId constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityTemplateId(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityClassCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityClassCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityMoodCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityMoodCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityId constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityId(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityId(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityStatusCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityStatusCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoverageActivityPolicyActivity constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_validateCoverageActivityPolicyActivity(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.validateCoverageActivityPolicyActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(policyActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityPayerEntityIsRequired(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityCoveredPartyIsRequired(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityCoveredPartyTime(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivitySubscriberIsAllowed(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivitySubscriberTime(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityEntryRelationshipREFR(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityEntryRelationshipTarget(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityTemplateId(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityClassCode(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityMoodCode(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityId(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityStatusCode(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityPayerEntity(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityCoveredParty(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_validatePolicyActivityPolicySubscriber(policyActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePolicyActivityPayerEntityIsRequired constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityPayerEntityIsRequired(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityPayerEntityIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredPartyIsRequired constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredPartyIsRequired(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredPartyIsRequired(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredPartyTime constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredPartyTime(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredPartyTime(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivitySubscriberIsAllowed constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivitySubscriberIsAllowed(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivitySubscriberIsAllowed(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivitySubscriberTime constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivitySubscriberTime(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivitySubscriberTime(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityEntryRelationshipREFR constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityEntryRelationshipREFR(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityEntryRelationshipREFR(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityEntryRelationshipTarget constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityEntryRelationshipTarget(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityEntryRelationshipTarget(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityTemplateId constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityTemplateId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityClassCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityClassCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityMoodCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityMoodCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityId constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityId(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityStatusCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityStatusCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityPayerEntity constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityPayerEntity(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityPayerEntity(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityCoveredParty constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityCoveredParty(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityCoveredParty(diagnostics, context);
	}

	/**
	 * Validates the validatePolicyActivityPolicySubscriber constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_validatePolicyActivityPolicySubscriber(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.validatePolicyActivityPolicySubscriber(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntity(PayerEntity payerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(payerEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(payerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayerEntity_validatePayerEntityId(payerEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePayerEntityId constraint of '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayerEntity_validatePayerEntityId(PayerEntity payerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payerEntity.validatePayerEntityId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty(CoveredParty coveredParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coveredParty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoveredParty_validateCoveredPartyId(coveredParty, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoveredParty_validateCoveredPartyCode(coveredParty, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoveredPartyId constraint of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty_validateCoveredPartyId(CoveredParty coveredParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveredParty.validateCoveredPartyId(diagnostics, context);
	}

	/**
	 * Validates the validateCoveredPartyCode constraint of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveredParty_validateCoveredPartyCode(CoveredParty coveredParty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveredParty.validateCoveredPartyCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySubscriber(PolicySubscriber policySubscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(policySubscriber, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(policySubscriber, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicySubscriber_validatePolicySubscriberId(policySubscriber, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePolicySubscriberId constraint of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicySubscriber_validatePolicySubscriberId(PolicySubscriber policySubscriber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policySubscriber.validatePolicySubscriberId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(authorizationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_validateAuthorizationActivityTemplateId(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_validateAuthorizationActivityClassCode(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_validateAuthorizationActivityMoodCode(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_validateAuthorizationActivityId(authorizationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAuthorizationActivityTemplateId constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityTemplateId(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityClassCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityClassCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityMoodCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityMoodCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAuthorizationActivityId constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_validateAuthorizationActivityId(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.validateAuthorizationActivityId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct(PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCodeValue(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(planOfCareActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCode(planOfCareActivityAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityActMoodCodeValue constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCodeValue(PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActTemplateId constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActTemplateId(PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActId constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityActMoodCode constraint of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityAct_validatePlanOfCareActivityActMoodCode(PlanOfCareActivityAct planOfCareActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityAct.validatePlanOfCareActivityActMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(procedureActivity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(patientInstruction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientInstruction_validatePatientInstructionTemplateId(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientInstruction_validatePatientInstructionMoodCode(patientInstruction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePatientInstructionTemplateId constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_validatePatientInstructionTemplateId(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.validatePatientInstructionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePatientInstructionMoodCode constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_validatePatientInstructionMoodCode(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.validatePatientInstructionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fulfillmentInstruction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentInstruction_validateFulfillmentInstructionTemplateId(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentInstruction_validateFulfillmentInstructionMoodCode(fulfillmentInstruction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateFulfillmentInstructionTemplateId constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_validateFulfillmentInstructionTemplateId(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.validateFulfillmentInstructionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateFulfillmentInstructionMoodCode constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_validateFulfillmentInstructionMoodCode(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.validateFulfillmentInstructionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation(FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(functionalStatusObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationNoAdditionalParticipants(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusObservation_validateStatusObservationTemplateId(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationClassCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationMoodCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationStatusCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_validateStatusObservationValue(functionalStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateStatusObservationTemplateId constraint of '<em>Functional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation_validateStatusObservationTemplateId(FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "validateStatusObservationTemplateId", getObjectLabel(functionalStatusObservation, context) },
						 new Object[] { functionalStatusObservation },
						 context));
			}
			return false;
		}
		return validateStatusObservation_validateStatusObservationTemplateId(functionalStatusObservation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productInstance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_validatePlayingEntityChoice(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductInstance_validateProductInstanceTemplateId(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductInstance_validateProductInstanceClassCode(productInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProductInstanceTemplateId constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_validateProductInstanceTemplateId(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.validateProductInstanceTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateProductInstanceClassCode constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_validateProductInstanceClassCode(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.validateProductInstanceClassCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ageObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationTemplateId(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationClassCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationMoodCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationStatusCode(ageObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAgeObservation_validateAgeObservationValue(ageObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAgeObservationTemplateId constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationTemplateId(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationClassCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationClassCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationMoodCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationMoodCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationStatusCode constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationStatusCode(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationStatusCode(diagnostics, context);
	}

	/**
	 * Validates the validateAgeObservationValue constraint of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgeObservation_validateAgeObservationValue(AgeObservation ageObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ageObservation.validateAgeObservationValue(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation(PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(planOfCareActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(planOfCareActivityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationMoodCodeValue constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCodeValue(PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationTemplateId constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationId constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityObservationMoodCode constraint of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(PlanOfCareActivityObservation planOfCareActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityObservation.validatePlanOfCareActivityObservationMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter(PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityEncounter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCodeValue(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(planOfCareActivityEncounter, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(planOfCareActivityEncounter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterMoodCodeValue constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCodeValue(PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterTemplateId constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterId constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityEncounterMoodCode constraint of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(PlanOfCareActivityEncounter planOfCareActivityEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityEncounter.validatePlanOfCareActivityEncounterMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure(PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(planOfCareActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(planOfCareActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureMoodCodeValue constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCodeValue(PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureTemplateId constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureTemplateId(PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureId constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureId(PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivityProcedureMoodCode constraint of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityProcedure_validatePlanOfCareActivityProcedureMoodCode(PlanOfCareActivityProcedure planOfCareActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivityProcedure.validatePlanOfCareActivityProcedureMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivitySubstanceAdministration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationId(planOfCareActivitySubstanceAdministration, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCode(planOfCareActivitySubstanceAdministration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationTemplateId constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationTemplateId(PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationId constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationId(PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySubstanceAdministrationMoodCode constraint of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministration_validatePlanOfCareActivitySubstanceAdministrationMoodCode(PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySubstanceAdministration.validatePlanOfCareActivitySubstanceAdministrationMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply(PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(planOfCareActivitySupply, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCodeValue(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyTemplateId(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyId(planOfCareActivitySupply, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCode(planOfCareActivitySupply, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyMoodCodeValue constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCodeValue(PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyMoodCodeValue(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyTemplateId constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyTemplateId(PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyId constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyId(PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanOfCareActivitySupplyMoodCode constraint of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupply_validatePlanOfCareActivitySupplyMoodCode(PlanOfCareActivitySupply planOfCareActivitySupply, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivitySupply.validatePlanOfCareActivitySupplyMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityAct, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityAct_validateProcedureActivityActTemplateId(procedureActivityAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureActivityActTemplateId constraint of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityAct_validateProcedureActivityActTemplateId(ProcedureActivityAct procedureActivityAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityAct.validateProcedureActivityActTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation(ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityObservation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityObservation_validateProcedureActivityObservationTemplateId(procedureActivityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureActivityObservationTemplateId constraint of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityObservation_validateProcedureActivityObservationTemplateId(ProcedureActivityObservation procedureActivityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityObservation.validateProcedureActivityObservationTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procedureActivityProcedure, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivityProcedure, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(procedureActivityProcedure, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateProcedureActivityProcedureTemplateId constraint of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivityProcedure_validateProcedureActivityProcedureTemplateId(ProcedureActivityProcedure procedureActivityProcedure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivityProcedure.validateProcedureActivityProcedureTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(coveragePlanDescription, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionClassCode(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionId(coveragePlanDescription, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoveragePlanDescription_validateCoveragePlanDescriptionMoodCode(coveragePlanDescription, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCoveragePlanDescriptionClassCode constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionClassCode(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCoveragePlanDescriptionId constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionId(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionId(diagnostics, context);
	}

	/**
	 * Validates the validateCoveragePlanDescriptionMoodCode constraint of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoveragePlanDescription_validateCoveragePlanDescriptionMoodCode(CoveragePlanDescription coveragePlanDescription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coveragePlanDescription.validateCoveragePlanDescriptionMoodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportParticipant(SupportParticipant supportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supportParticipant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupport(Support support, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(support, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupportGuardian(SupportGuardian supportGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(supportGuardian, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supportGuardian, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateGuardian_validateGuardianChoice(supportGuardian, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(comment, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentTemplateId(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentClassCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentMoodCode(comment, diagnostics, context);
		if (result || diagnostics != null) result &= validateComment_validateCommentCode(comment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateCommentTemplateId constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentTemplateId(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateCommentClassCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentClassCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentClassCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentMoodCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentMoodCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentMoodCode(diagnostics, context);
	}

	/**
	 * Validates the validateCommentCode constraint of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComment_validateCommentCode(Comment comment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return comment.validateCommentCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCCDRegistryDelegate(CCDRegistryDelegate ccdRegistryDelegate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ccdRegistryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CCDPlugin.INSTANCE;
	}

} //CCDValidator
