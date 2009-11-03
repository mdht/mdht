/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.*;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Section template Id' of 'Medication Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SECTION__MEDICATION_SECTION_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Section code' of 'Medication Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SECTION__MEDICATION_SECTION_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Section title' of 'Medication Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SECTION__MEDICATION_SECTION_TITLE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document template Id' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document problem Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROBLEM_SECTION = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document family History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FAMILY_HISTORY_SECTION = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document social History Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_SOCIAL_HISTORY_SECTION = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document alerts Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ALERTS_SECTION = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document medication Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICATION_SECTION = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document results Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_RESULTS_SECTION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document procedures Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PROCEDURES_SECTION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document encounters Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ENCOUNTERS_SECTION = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document plan Of Care Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PLAN_OF_CARE_SECTION = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document immunizations Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_IMMUNIZATIONS_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document vital Signs Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_VITAL_SIGNS_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document medical Equipment Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_MEDICAL_EQUIPMENT_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document functional Status Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_FUNCTIONAL_STATUS_SECTION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document advance Directives Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_ADVANCE_DIRECTIVES_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document payers Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PAYERS_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document purpose Section' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_PURPOSE_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act class Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CLASS_CODE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act mood Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_MOOD_CODE = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ID = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act code null Flavor' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CODE_NULL_FLAVOR = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act problem Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_PROBLEM_OBSERVATION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation mood Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation status Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation effective Time' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CODE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section template Id' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section code' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section title' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TITLE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section problem Act' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_PROBLEM_ACT = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Status template Id' of 'Problem Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS__PROBLEM_STATUS_TEMPLATE_ID = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Status value' of 'Problem Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS__PROBLEM_STATUS_VALUE = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status template Id' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status code' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status value' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_VALUE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation status Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation value' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Awareness template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Awareness type Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section code' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_CODE = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section title' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TITLE = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation status Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Organizer template Id' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Organizer status Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer mood Code' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_MOOD_CODE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer result Observation' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_RESULT_OBSERVATION = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation mood Code' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_MOOD_CODE = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation effective Time' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_EFFECTIVE_TIME = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation value' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_VALUE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Section template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Section code' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Section title' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TITLE = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Observation template Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section code' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section title' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section code' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_CODE = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section title' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TITLE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity template Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ID = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_CODE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity effective Time' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity mood Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity template Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity status Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity medication Series Number Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity medication Status Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity patient Instruction' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PATIENT_INSTRUCTION = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity template Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity status Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity medication Status Observation' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity fulfillment Instruction' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_FULFILLMENT_INSTRUCTION = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section template Id' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEMPLATE_ID = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section code' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_CODE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section title' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TITLE = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Observation template Id' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Observation status Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reaction Observation template Id' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reaction Observation status Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation template Id' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_TEMPLATE_ID = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CODE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation status Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_STATUS_CODE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation value' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_VALUE = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Status Observation template Id' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__ALERT_STATUS_OBSERVATION_TEMPLATE_ID = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Status Observation value' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__ALERT_STATUS_OBSERVATION_VALUE = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cause Of Death Observation template Id' of 'Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section template Id' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section code' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_CODE = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section title' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TITLE = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section result Organizer' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_RESULT_ORGANIZER = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation template Id' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation status Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation value' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Status Observation template Id' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__MEDICATION_STATUS_OBSERVATION_TEMPLATE_ID = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Status Observation value' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__MEDICATION_STATUS_OBSERVATION_VALUE = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounter Location template Id' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Product template Id' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_TEMPLATE_ID = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section template Id' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section code' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_CODE = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section title' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section procedure Activity' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_PROCEDURE_ACTIVITY = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Section template Id' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Section code' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_CODE = 129;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Section title' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_TITLE = 130;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Section plan Of Care Activity' of 'Plan Of Care Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_SECTION__PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY = 131;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 132;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section code' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 133;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section title' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TITLE = 134;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Section vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 135;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medical Equipment Section template Id' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID = 136;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medical Equipment Section code' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_CODE = 137;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medical Equipment Section title' of 'Medical Equipment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICAL_EQUIPMENT_SECTION__MEDICAL_EQUIPMENT_SECTION_TITLE = 138;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section template Id' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID = 139;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section code' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_CODE = 140;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section title' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_TITLE = 141;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section problem Act' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_PROBLEM_ACT = 142;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Section result Organizer' of 'Functional Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_SECTION__FUNCTIONAL_STATUS_SECTION_RESULT_ORGANIZER = 143;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section template Id' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TEMPLATE_ID = 144;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section code' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_CODE = 145;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section title' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_TITLE = 146;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directives Section advance Directive Observation' of 'Advance Directives Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVES_SECTION__ADVANCE_DIRECTIVES_SECTION_ADVANCE_DIRECTIVE_OBSERVATION = 147;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payers Section template Id' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TEMPLATE_ID = 148;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payers Section code' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_CODE = 149;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Payers Section title' of 'Payers Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAYERS_SECTION__PAYERS_SECTION_TITLE = 150;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Section template Id' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TEMPLATE_ID = 151;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Section code' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_CODE = 152;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Section title' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_TITLE = 153;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Section purpose Activity' of 'Purpose Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_SECTION__PURPOSE_SECTION_PURPOSE_ACTIVITY = 154;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity has Reason' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_HAS_REASON = 155;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity reason Type' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_REASON_TYPE = 156;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity template Id' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_TEMPLATE_ID = 157;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity class Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CLASS_CODE = 158;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity mood Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_MOOD_CODE = 159;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_CODE = 160;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Purpose Activity status Code' of 'Purpose Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PURPOSE_ACTIVITY__PURPOSE_ACTIVITY_STATUS_CODE = 161;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Vital Signs Organizer template Id' of 'Vital Signs Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_ORGANIZER__VITAL_SIGNS_ORGANIZER_TEMPLATE_ID = 162;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation template Id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID = 163;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation class Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE = 164;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation mood Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE = 165;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation id' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ID = 166;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation status Code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE = 167;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation effective Time' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME = 168;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation code' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_CODE = 169;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Observation advance Directive Verification' of 'Advance Directive Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_OBSERVATION__ADVANCE_DIRECTIVE_OBSERVATION_ADVANCE_DIRECTIVE_VERIFICATION = 170;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Status Observation template Id' of 'Advance Directive Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ADVANCE_DIRECTIVE_STATUS_OBSERVATION_TEMPLATE_ID = 171;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Status Observation value' of 'Advance Directive Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_STATUS_OBSERVATION__ADVANCE_DIRECTIVE_STATUS_OBSERVATION_VALUE = 172;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Verification template Id' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID = 173;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Verification type Code' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE = 174;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Advance Directive Verification time' of 'Advance Directive Verification'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TIME = 175;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coverage Activity template Id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_TEMPLATE_ID = 176;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coverage Activity class Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_CLASS_CODE = 177;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coverage Activity mood Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_MOOD_CODE = 178;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coverage Activity id' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_ID = 179;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Coverage Activity status Code' of 'Coverage Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COVERAGE_ACTIVITY__COVERAGE_ACTIVITY_STATUS_CODE = 180;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Policy Activity template Id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID = 181;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Policy Activity class Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE = 182;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Policy Activity mood Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE = 183;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Policy Activity id' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_ID = 184;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Policy Activity status Code' of 'Policy Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE = 185;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authorization Activity template Id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_TEMPLATE_ID = 186;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authorization Activity class Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_CLASS_CODE = 187;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authorization Activity mood Code' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_MOOD_CODE = 188;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Authorization Activity id' of 'Authorization Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AUTHORIZATION_ACTIVITY__AUTHORIZATION_ACTIVITY_ID = 189;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Activity template Id' of 'Plan Of Care Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY__PLAN_OF_CARE_ACTIVITY_TEMPLATE_ID = 190;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Plan Of Care Activity id' of 'Plan Of Care Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_OF_CARE_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ID = 191;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedure Activity template Id' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_TEMPLATE_ID = 192;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedure Activity mood Code' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_MOOD_CODE = 193;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedure Activity id' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_ID = 194;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedure Activity status Code' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_STATUS_CODE = 195;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedure Activity effective Time' of 'Procedure Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_EFFECTIVE_TIME = 196;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Instruction template Id' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_TEMPLATE_ID = 197;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Instruction mood Code' of 'Patient Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_INSTRUCTION__PATIENT_INSTRUCTION_MOOD_CODE = 198;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fulfillment Instruction template Id' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_TEMPLATE_ID = 199;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Fulfillment Instruction mood Code' of 'Fulfillment Instruction'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_MOOD_CODE = 200;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Observation template Id' of 'Functional Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_OBSERVATION__FUNCTIONAL_STATUS_OBSERVATION_TEMPLATE_ID = 201;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Functional Status Observation value' of 'Functional Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FUNCTIONAL_STATUS_OBSERVATION__FUNCTIONAL_STATUS_OBSERVATION_VALUE = 202;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Product Instance template Id' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_TEMPLATE_ID = 203;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Product Instance class Code' of 'Product Instance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT_INSTANCE__PRODUCT_INSTANCE_CLASS_CODE = 204;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 204;

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
			case CCDPackage.MEDICATION_SECTION:
				return validateMedicationSection((MedicationSection)value, diagnostics, context);
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT:
				return validateContinuityOfCareDocument((ContinuityOfCareDocument)value, diagnostics, context);
			case CCDPackage.PROBLEM_ACT:
				return validateProblemAct((ProblemAct)value, diagnostics, context);
			case CCDPackage.PROBLEM_OBSERVATION:
				return validateProblemObservation((ProblemObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_SECTION:
				return validateProblemSection((ProblemSection)value, diagnostics, context);
			case CCDPackage.PROBLEM_STATUS:
				return validateProblemStatus((ProblemStatus)value, diagnostics, context);
			case CCDPackage.STATUS_OBSERVATION:
				return validateStatusObservation((StatusObservation)value, diagnostics, context);
			case CCDPackage.PROBLEM_HEALTH_STATUS:
				return validateProblemHealthStatus((ProblemHealthStatus)value, diagnostics, context);
			case CCDPackage.EPISODE_OBSERVATION:
				return validateEpisodeObservation((EpisodeObservation)value, diagnostics, context);
			case CCDPackage.PATIENT_AWARENESS:
				return validatePatientAwareness((PatientAwareness)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_SECTION:
				return validateFamilyHistorySection((FamilyHistorySection)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_OBSERVATION:
				return validateFamilyHistoryObservation((FamilyHistoryObservation)value, diagnostics, context);
			case CCDPackage.FAMILY_HISTORY_ORGANIZER:
				return validateFamilyHistoryOrganizer((FamilyHistoryOrganizer)value, diagnostics, context);
			case CCDPackage.RESULT_ORGANIZER:
				return validateResultOrganizer((ResultOrganizer)value, diagnostics, context);
			case CCDPackage.RESULT_OBSERVATION:
				return validateResultObservation((ResultObservation)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_SECTION:
				return validateSocialHistorySection((SocialHistorySection)value, diagnostics, context);
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION:
				return validateSocialHistoryObservation((SocialHistoryObservation)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_SECTION:
				return validateEncountersSection((EncountersSection)value, diagnostics, context);
			case CCDPackage.IMMUNIZATIONS_SECTION:
				return validateImmunizationsSection((ImmunizationsSection)value, diagnostics, context);
			case CCDPackage.ENCOUNTERS_ACTIVITY:
				return validateEncountersActivity((EncountersActivity)value, diagnostics, context);
			case CCDPackage.MEDICATION_ACTIVITY:
				return validateMedicationActivity((MedicationActivity)value, diagnostics, context);
			case CCDPackage.SUPPLY_ACTIVITY:
				return validateSupplyActivity((SupplyActivity)value, diagnostics, context);
			case CCDPackage.ALERTS_SECTION:
				return validateAlertsSection((AlertsSection)value, diagnostics, context);
			case CCDPackage.ALERT_OBSERVATION:
				return validateAlertObservation((AlertObservation)value, diagnostics, context);
			case CCDPackage.REACTION_OBSERVATION:
				return validateReactionObservation((ReactionObservation)value, diagnostics, context);
			case CCDPackage.SEVERITY_OBSERVATION:
				return validateSeverityObservation((SeverityObservation)value, diagnostics, context);
			case CCDPackage.ALERT_STATUS_OBSERVATION:
				return validateAlertStatusObservation((AlertStatusObservation)value, diagnostics, context);
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION:
				return validateCauseOfDeathObservation((CauseOfDeathObservation)value, diagnostics, context);
			case CCDPackage.RESULTS_SECTION:
				return validateResultsSection((ResultsSection)value, diagnostics, context);
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION:
				return validateMedicationSeriesNumberObservation((MedicationSeriesNumberObservation)value, diagnostics, context);
			case CCDPackage.MEDICATION_STATUS_OBSERVATION:
				return validateMedicationStatusObservation((MedicationStatusObservation)value, diagnostics, context);
			case CCDPackage.ENCOUNTER_LOCATION:
				return validateEncounterLocation((EncounterLocation)value, diagnostics, context);
			case CCDPackage.PRODUCT:
				return validateProduct((Product)value, diagnostics, context);
			case CCDPackage.PROCEDURES_SECTION:
				return validateProceduresSection((ProceduresSection)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_SECTION:
				return validatePlanOfCareSection((PlanOfCareSection)value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION:
				return validateMedicalEquipmentSection((MedicalEquipmentSection)value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_SECTION:
				return validateFunctionalStatusSection((FunctionalStatusSection)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION:
				return validateAdvanceDirectivesSection((AdvanceDirectivesSection)value, diagnostics, context);
			case CCDPackage.PAYERS_SECTION:
				return validatePayersSection((PayersSection)value, diagnostics, context);
			case CCDPackage.PURPOSE_SECTION:
				return validatePurposeSection((PurposeSection)value, diagnostics, context);
			case CCDPackage.PURPOSE_ACTIVITY:
				return validatePurposeActivity((PurposeActivity)value, diagnostics, context);
			case CCDPackage.VITAL_SIGNS_ORGANIZER:
				return validateVitalSignsOrganizer((VitalSignsOrganizer)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_OBSERVATION:
				return validateAdvanceDirectiveObservation((AdvanceDirectiveObservation)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION:
				return validateAdvanceDirectiveStatusObservation((AdvanceDirectiveStatusObservation)value, diagnostics, context);
			case CCDPackage.ADVANCE_DIRECTIVE_VERIFICATION:
				return validateAdvanceDirectiveVerification((AdvanceDirectiveVerification)value, diagnostics, context);
			case CCDPackage.COVERAGE_ACTIVITY:
				return validateCoverageActivity((CoverageActivity)value, diagnostics, context);
			case CCDPackage.POLICY_ACTIVITY:
				return validatePolicyActivity((PolicyActivity)value, diagnostics, context);
			case CCDPackage.AUTHORIZATION_ACTIVITY:
				return validateAuthorizationActivity((AuthorizationActivity)value, diagnostics, context);
			case CCDPackage.PLAN_OF_CARE_ACTIVITY:
				return validatePlanOfCareActivity((PlanOfCareActivity)value, diagnostics, context);
			case CCDPackage.PROCEDURE_ACTIVITY:
				return validateProcedureActivity((ProcedureActivity)value, diagnostics, context);
			case CCDPackage.PATIENT_INSTRUCTION:
				return validatePatientInstruction((PatientInstruction)value, diagnostics, context);
			case CCDPackage.FULFILLMENT_INSTRUCTION:
				return validateFulfillmentInstruction((FulfillmentInstruction)value, diagnostics, context);
			case CCDPackage.FUNCTIONAL_STATUS_OBSERVATION:
				return validateFunctionalStatusObservation((FunctionalStatusObservation)value, diagnostics, context);
			case CCDPackage.PRODUCT_INSTANCE:
				return validateProductInstance((ProductInstance)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSection(MedicationSection medicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSection_MedicationSection_templateId(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSection_MedicationSection_code(medicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSection_MedicationSection_title(medicationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationSection_templateId constraint of '<em>Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSection_MedicationSection_templateId(MedicationSection medicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSection.MedicationSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicationSection_code constraint of '<em>Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSection_MedicationSection_code(MedicationSection medicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSection.MedicationSection_code(diagnostics, context);
	}

	/**
	 * Validates the MedicationSection_title constraint of '<em>Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSection_MedicationSection_title(MedicationSection medicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSection.MedicationSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_code(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_problemSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_familyHistorySection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_socialHistorySection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_alertsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_medicationSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_resultsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_proceduresSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_encountersSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_planOfCareSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_immunizationsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_vitalSignsSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_medicalEquipmentSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_functionalStatusSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_advanceDirectivesSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_payersSection(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_purposeSection(continuityOfCareDocument, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ContinuityOfCareDocument_templateId constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_templateId(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_code constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_code(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_code(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_problemSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_problemSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_problemSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_familyHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_familyHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_familyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_socialHistorySection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_socialHistorySection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_socialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_alertsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_alertsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_alertsSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_medicationSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_medicationSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_medicationSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_resultsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_resultsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_resultsSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_proceduresSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_proceduresSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_proceduresSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_encountersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_encountersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_encountersSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_planOfCareSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_planOfCareSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_planOfCareSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_immunizationsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_immunizationsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_immunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_vitalSignsSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_vitalSignsSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_vitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_medicalEquipmentSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_medicalEquipmentSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_medicalEquipmentSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_functionalStatusSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_functionalStatusSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_functionalStatusSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_advanceDirectivesSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_advanceDirectivesSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_advanceDirectivesSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_payersSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_payersSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_payersSection(diagnostics, context);
	}

	/**
	 * Validates the ContinuityOfCareDocument_purposeSection constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_purposeSection(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_purposeSection(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_templateId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_classCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_moodCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_id(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_code_nullFlavor(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_problemObservation(problemAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemAct_templateId constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_templateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_classCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_classCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_classCode(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_moodCode constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_moodCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_moodCode(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_id constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_id(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_id(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_code_nullFlavor constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_code_nullFlavor(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_code_nullFlavor(diagnostics, context);
	}

	/**
	 * Validates the ProblemAct_problemObservation constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_problemObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_problemObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_templateId(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_moodCode(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_statusCode(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_effectiveTime(problemObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemObservation_ProblemObservation_code(problemObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemObservation_templateId constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_templateId(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemObservation_moodCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_moodCode(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_moodCode(diagnostics, context);
	}

	/**
	 * Validates the ProblemObservation_statusCode constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_statusCode(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the ProblemObservation_effectiveTime constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_effectiveTime(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_effectiveTime(diagnostics, context);
	}

	/**
	 * Validates the ProblemObservation_code constraint of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemObservation_ProblemObservation_code(ProblemObservation problemObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemObservation.ProblemObservation_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_ProblemSection_templateId(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_ProblemSection_code(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_ProblemSection_title(problemSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemSection_ProblemSection_problemAct(problemSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemSection_templateId constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_ProblemSection_templateId(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.ProblemSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemSection_code constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_ProblemSection_code(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.ProblemSection_code(diagnostics, context);
	}

	/**
	 * Validates the ProblemSection_title constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_ProblemSection_title(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.ProblemSection_title(diagnostics, context);
	}

	/**
	 * Validates the ProblemSection_problemAct constraint of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemSection_ProblemSection_problemAct(ProblemSection problemSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemSection.ProblemSection_problemAct(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus(ProblemStatus problemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatus_ProblemStatus_templateId(problemStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemStatus_ProblemStatus_value(problemStatus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemStatus_templateId constraint of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus_ProblemStatus_templateId(ProblemStatus problemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatus.ProblemStatus_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemStatus_value constraint of '<em>Problem Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemStatus_ProblemStatus_value(ProblemStatus problemStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemStatus.ProblemStatus_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatus_ProblemHealthStatus_templateId(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatus_ProblemHealthStatus_code(problemHealthStatus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemHealthStatus_ProblemHealthStatus_value(problemHealthStatus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemHealthStatus_templateId constraint of '<em>Problem Health Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus_ProblemHealthStatus_templateId(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemHealthStatus.ProblemHealthStatus_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProblemHealthStatus_code constraint of '<em>Problem Health Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus_ProblemHealthStatus_code(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemHealthStatus.ProblemHealthStatus_code(diagnostics, context);
	}

	/**
	 * Validates the ProblemHealthStatus_value constraint of '<em>Problem Health Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemHealthStatus_ProblemHealthStatus_value(ProblemHealthStatus problemHealthStatus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemHealthStatus.ProblemHealthStatus_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(statusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(statusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StatusObservation_templateId constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_templateId(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the StatusObservation_classCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_classCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_classCode(diagnostics, context);
	}

	/**
	 * Validates the StatusObservation_moodCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_moodCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_moodCode(diagnostics, context);
	}

	/**
	 * Validates the StatusObservation_code constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_code(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_code(diagnostics, context);
	}

	/**
	 * Validates the StatusObservation_statusCode constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_statusCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the StatusObservation_value constraint of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatusObservation_StatusObservation_value(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return statusObservation.StatusObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_templateId(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_classCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_moodCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_statusCode(episodeObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEpisodeObservation_EpisodeObservation_code(episodeObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EpisodeObservation_templateId constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_templateId(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the EpisodeObservation_classCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_classCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_classCode(diagnostics, context);
	}

	/**
	 * Validates the EpisodeObservation_moodCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_moodCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_moodCode(diagnostics, context);
	}

	/**
	 * Validates the EpisodeObservation_statusCode constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_statusCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the EpisodeObservation_code constraint of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEpisodeObservation_EpisodeObservation_code(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return episodeObservation.EpisodeObservation_code(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_PatientAwareness_templateId(patientAwareness, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientAwareness_PatientAwareness_typeCode(patientAwareness, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PatientAwareness_templateId constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_PatientAwareness_templateId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.PatientAwareness_templateId(diagnostics, context);
	}

	/**
	 * Validates the PatientAwareness_typeCode constraint of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientAwareness_PatientAwareness_typeCode(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientAwareness.PatientAwareness_typeCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_templateId(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_code(familyHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistorySection_FamilyHistorySection_title(familyHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistorySection_templateId constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_templateId(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_templateId(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistorySection_code constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_code(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_code(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistorySection_title constraint of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistorySection_FamilyHistorySection_title(FamilyHistorySection familyHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistorySection.FamilyHistorySection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_templateId(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_id(familyHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_statusCode(familyHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistoryObservation_templateId constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_FamilyHistoryObservation_templateId(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.FamilyHistoryObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistoryObservation_id constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_FamilyHistoryObservation_id(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.FamilyHistoryObservation_id(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistoryObservation_statusCode constraint of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryObservation_FamilyHistoryObservation_statusCode(FamilyHistoryObservation familyHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryObservation.FamilyHistoryObservation_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_templateId(familyHistoryOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_statusCode(familyHistoryOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FamilyHistoryOrganizer_templateId constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_templateId(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.FamilyHistoryOrganizer_templateId(diagnostics, context);
	}

	/**
	 * Validates the FamilyHistoryOrganizer_statusCode constraint of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamilyHistoryOrganizer_FamilyHistoryOrganizer_statusCode(FamilyHistoryOrganizer familyHistoryOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return familyHistoryOrganizer.FamilyHistoryOrganizer_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_templateId(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_moodCode(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_id(resultOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_resultObservation(resultOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultOrganizer_templateId constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_ResultOrganizer_templateId(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.ResultOrganizer_templateId(diagnostics, context);
	}

	/**
	 * Validates the ResultOrganizer_moodCode constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_ResultOrganizer_moodCode(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.ResultOrganizer_moodCode(diagnostics, context);
	}

	/**
	 * Validates the ResultOrganizer_id constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_ResultOrganizer_id(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.ResultOrganizer_id(diagnostics, context);
	}

	/**
	 * Validates the ResultOrganizer_resultObservation constraint of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultOrganizer_ResultOrganizer_resultObservation(ResultOrganizer resultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultOrganizer.ResultOrganizer_resultObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_templateId(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_moodCode(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_id(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_effectiveTime(resultObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultObservation_ResultObservation_value(resultObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultObservation_templateId constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_templateId(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the ResultObservation_moodCode constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_moodCode(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_moodCode(diagnostics, context);
	}

	/**
	 * Validates the ResultObservation_id constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_id(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_id(diagnostics, context);
	}

	/**
	 * Validates the ResultObservation_effectiveTime constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_effectiveTime(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_effectiveTime(diagnostics, context);
	}

	/**
	 * Validates the ResultObservation_value constraint of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultObservation_ResultObservation_value(ResultObservation resultObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultObservation.ResultObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_SocialHistorySection_templateId(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_SocialHistorySection_code(socialHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistorySection_SocialHistorySection_title(socialHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SocialHistorySection_templateId constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_SocialHistorySection_templateId(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.SocialHistorySection_templateId(diagnostics, context);
	}

	/**
	 * Validates the SocialHistorySection_code constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_SocialHistorySection_code(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.SocialHistorySection_code(diagnostics, context);
	}

	/**
	 * Validates the SocialHistorySection_title constraint of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistorySection_SocialHistorySection_title(SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistorySection.SocialHistorySection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(socialHistoryObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSocialHistoryObservation_SocialHistoryObservation_templateId(socialHistoryObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SocialHistoryObservation_templateId constraint of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSocialHistoryObservation_SocialHistoryObservation_templateId(SocialHistoryObservation socialHistoryObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return socialHistoryObservation.SocialHistoryObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_EncountersSection_templateId(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_EncountersSection_code(encountersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersSection_EncountersSection_title(encountersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EncountersSection_templateId constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_EncountersSection_templateId(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.EncountersSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the EncountersSection_code constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_EncountersSection_code(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.EncountersSection_code(diagnostics, context);
	}

	/**
	 * Validates the EncountersSection_title constraint of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersSection_EncountersSection_title(EncountersSection encountersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersSection.EncountersSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_ImmunizationsSection_templateId(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_ImmunizationsSection_code(immunizationsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateImmunizationsSection_ImmunizationsSection_title(immunizationsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ImmunizationsSection_templateId constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_ImmunizationsSection_templateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.ImmunizationsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the ImmunizationsSection_code constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_ImmunizationsSection_code(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.ImmunizationsSection_code(diagnostics, context);
	}

	/**
	 * Validates the ImmunizationsSection_title constraint of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImmunizationsSection_ImmunizationsSection_title(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return immunizationsSection.ImmunizationsSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_EncountersActivity_templateId(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_EncountersActivity_id(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_EncountersActivity_code(encountersActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncountersActivity_EncountersActivity_effectiveTime(encountersActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EncountersActivity_templateId constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_EncountersActivity_templateId(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.EncountersActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the EncountersActivity_id constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_EncountersActivity_id(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.EncountersActivity_id(diagnostics, context);
	}

	/**
	 * Validates the EncountersActivity_code constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_EncountersActivity_code(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.EncountersActivity_code(diagnostics, context);
	}

	/**
	 * Validates the EncountersActivity_effectiveTime constraint of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncountersActivity_EncountersActivity_effectiveTime(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encountersActivity.EncountersActivity_effectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_moodCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_templateId(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_id(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_statusCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_medicationStatusObservation(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_patientInstruction(medicationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationActivity_moodCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_moodCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_templateId constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_templateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_id constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_id(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_id(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_statusCode constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_statusCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_statusCode(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_medicationSeriesNumberObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_medicationSeriesNumberObservation(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_medicationStatusObservation constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_medicationStatusObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_medicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the MedicationActivity_patientInstruction constraint of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationActivity_MedicationActivity_patientInstruction(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationActivity.MedicationActivity_patientInstruction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_SupplyActivity_templateId(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_SupplyActivity_id(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_SupplyActivity_statusCode(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_SupplyActivity_medicationStatusObservation(supplyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateSupplyActivity_SupplyActivity_fulfillmentInstruction(supplyActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SupplyActivity_templateId constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_SupplyActivity_templateId(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.SupplyActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the SupplyActivity_id constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_SupplyActivity_id(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.SupplyActivity_id(diagnostics, context);
	}

	/**
	 * Validates the SupplyActivity_statusCode constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_SupplyActivity_statusCode(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.SupplyActivity_statusCode(diagnostics, context);
	}

	/**
	 * Validates the SupplyActivity_medicationStatusObservation constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_SupplyActivity_medicationStatusObservation(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.SupplyActivity_medicationStatusObservation(diagnostics, context);
	}

	/**
	 * Validates the SupplyActivity_fulfillmentInstruction constraint of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupplyActivity_SupplyActivity_fulfillmentInstruction(SupplyActivity supplyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return supplyActivity.SupplyActivity_fulfillmentInstruction(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_AlertsSection_templateId(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_AlertsSection_code(alertsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertsSection_AlertsSection_title(alertsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AlertsSection_templateId constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_AlertsSection_templateId(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.AlertsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the AlertsSection_code constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_AlertsSection_code(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.AlertsSection_code(diagnostics, context);
	}

	/**
	 * Validates the AlertsSection_title constraint of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertsSection_AlertsSection_title(AlertsSection alertsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertsSection.AlertsSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_AlertObservation_templateId(alertObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertObservation_AlertObservation_statusCode(alertObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AlertObservation_templateId constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_AlertObservation_templateId(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.AlertObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the AlertObservation_statusCode constraint of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertObservation_AlertObservation_statusCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertObservation.AlertObservation_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_ReactionObservation_templateId(reactionObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateReactionObservation_ReactionObservation_statusCode(reactionObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReactionObservation_templateId constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_ReactionObservation_templateId(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.ReactionObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the ReactionObservation_statusCode constraint of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReactionObservation_ReactionObservation_statusCode(ReactionObservation reactionObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reactionObservation.ReactionObservation_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_SeverityObservation_templateId(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_SeverityObservation_code(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_SeverityObservation_statusCode(severityObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeverityObservation_SeverityObservation_value(severityObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SeverityObservation_templateId constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_SeverityObservation_templateId(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.SeverityObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the SeverityObservation_code constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_SeverityObservation_code(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.SeverityObservation_code(diagnostics, context);
	}

	/**
	 * Validates the SeverityObservation_statusCode constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_SeverityObservation_statusCode(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.SeverityObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the SeverityObservation_value constraint of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeverityObservation_SeverityObservation_value(SeverityObservation severityObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return severityObservation.SeverityObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation(AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertStatusObservation_AlertStatusObservation_templateId(alertStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAlertStatusObservation_AlertStatusObservation_value(alertStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AlertStatusObservation_templateId constraint of '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation_AlertStatusObservation_templateId(AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertStatusObservation.AlertStatusObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the AlertStatusObservation_value constraint of '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlertStatusObservation_AlertStatusObservation_value(AlertStatusObservation alertStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return alertStatusObservation.AlertStatusObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation(CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_templateId(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_id(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFamilyHistoryObservation_FamilyHistoryObservation_statusCode(causeOfDeathObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCauseOfDeathObservation_CauseOfDeathObservation_templateId(causeOfDeathObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CauseOfDeathObservation_templateId constraint of '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCauseOfDeathObservation_CauseOfDeathObservation_templateId(CauseOfDeathObservation causeOfDeathObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return causeOfDeathObservation.CauseOfDeathObservation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_ResultsSection_templateId(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_ResultsSection_code(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_ResultsSection_title(resultsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultsSection_ResultsSection_resultOrganizer(resultsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultsSection_templateId constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_ResultsSection_templateId(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.ResultsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the ResultsSection_code constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_ResultsSection_code(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.ResultsSection_code(diagnostics, context);
	}

	/**
	 * Validates the ResultsSection_title constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_ResultsSection_title(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.ResultsSection_title(diagnostics, context);
	}

	/**
	 * Validates the ResultsSection_resultOrganizer constraint of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultsSection_ResultsSection_resultOrganizer(ResultsSection resultsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resultsSection.ResultsSection_resultOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_templateId(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_statusCode(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_code(medicationSeriesNumberObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_value(medicationSeriesNumberObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationSeriesNumberObservation_templateId constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_templateId(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.MedicationSeriesNumberObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicationSeriesNumberObservation_statusCode constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_statusCode(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.MedicationSeriesNumberObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the MedicationSeriesNumberObservation_code constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_code(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.MedicationSeriesNumberObservation_code(diagnostics, context);
	}

	/**
	 * Validates the MedicationSeriesNumberObservation_value constraint of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationSeriesNumberObservation_MedicationSeriesNumberObservation_value(MedicationSeriesNumberObservation medicationSeriesNumberObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationSeriesNumberObservation.MedicationSeriesNumberObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation(MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationStatusObservation_MedicationStatusObservation_templateId(medicationStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationStatusObservation_MedicationStatusObservation_value(medicationStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicationStatusObservation_templateId constraint of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation_MedicationStatusObservation_templateId(MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationStatusObservation.MedicationStatusObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicationStatusObservation_value constraint of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationStatusObservation_MedicationStatusObservation_value(MedicationStatusObservation medicationStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicationStatusObservation.MedicationStatusObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(encounterLocation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEncounterLocation_EncounterLocation_templateId(encounterLocation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EncounterLocation_templateId constraint of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterLocation_EncounterLocation_templateId(EncounterLocation encounterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return encounterLocation.EncounterLocation_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(product, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateManufacturedProduct_manufacturedDrugOrOtherMaterial(product, diagnostics, context);
		if (result || diagnostics != null) result &= validateProduct_Product_templateId(product, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Product_templateId constraint of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProduct_Product_templateId(Product product, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return product.Product_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_ProceduresSection_templateId(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_ProceduresSection_code(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_ProceduresSection_title(proceduresSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateProceduresSection_ProceduresSection_procedureActivity(proceduresSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProceduresSection_templateId constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_ProceduresSection_templateId(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.ProceduresSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProceduresSection_code constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_ProceduresSection_code(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.ProceduresSection_code(diagnostics, context);
	}

	/**
	 * Validates the ProceduresSection_title constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_ProceduresSection_title(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.ProceduresSection_title(diagnostics, context);
	}

	/**
	 * Validates the ProceduresSection_procedureActivity constraint of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProceduresSection_ProceduresSection_procedureActivity(ProceduresSection proceduresSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return proceduresSection.ProceduresSection_procedureActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_PlanOfCareSection_templateId(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_PlanOfCareSection_code(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_PlanOfCareSection_title(planOfCareSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareSection_PlanOfCareSection_planOfCareActivity(planOfCareSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PlanOfCareSection_templateId constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_PlanOfCareSection_templateId(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.PlanOfCareSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the PlanOfCareSection_code constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_PlanOfCareSection_code(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.PlanOfCareSection_code(diagnostics, context);
	}

	/**
	 * Validates the PlanOfCareSection_title constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_PlanOfCareSection_title(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.PlanOfCareSection_title(diagnostics, context);
	}

	/**
	 * Validates the PlanOfCareSection_planOfCareActivity constraint of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareSection_PlanOfCareSection_planOfCareActivity(PlanOfCareSection planOfCareSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareSection.PlanOfCareSection_planOfCareActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_templateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_code(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_title(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_VitalSignsSection_vitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSignsSection_templateId constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_VitalSignsSection_templateId(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.VitalSignsSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsSection_code constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_VitalSignsSection_code(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.VitalSignsSection_code(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsSection_title constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_VitalSignsSection_title(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.VitalSignsSection_title(diagnostics, context);
	}

	/**
	 * Validates the VitalSignsSection_vitalSignsOrganizer constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_VitalSignsSection_vitalSignsOrganizer(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.VitalSignsSection_vitalSignsOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_MedicalEquipmentSection_templateId(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_MedicalEquipmentSection_code(medicalEquipmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicalEquipmentSection_MedicalEquipmentSection_title(medicalEquipmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MedicalEquipmentSection_templateId constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_MedicalEquipmentSection_templateId(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.MedicalEquipmentSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the MedicalEquipmentSection_code constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_MedicalEquipmentSection_code(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.MedicalEquipmentSection_code(diagnostics, context);
	}

	/**
	 * Validates the MedicalEquipmentSection_title constraint of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicalEquipmentSection_MedicalEquipmentSection_title(MedicalEquipmentSection medicalEquipmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return medicalEquipmentSection.MedicalEquipmentSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_templateId(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_code(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_title(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_problemAct(functionalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusSection_FunctionalStatusSection_resultOrganizer(functionalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FunctionalStatusSection_templateId constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_templateId(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.FunctionalStatusSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the FunctionalStatusSection_code constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_code(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.FunctionalStatusSection_code(diagnostics, context);
	}

	/**
	 * Validates the FunctionalStatusSection_title constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_title(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.FunctionalStatusSection_title(diagnostics, context);
	}

	/**
	 * Validates the FunctionalStatusSection_problemAct constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_problemAct(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.FunctionalStatusSection_problemAct(diagnostics, context);
	}

	/**
	 * Validates the FunctionalStatusSection_resultOrganizer constraint of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection_FunctionalStatusSection_resultOrganizer(FunctionalStatusSection functionalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusSection.FunctionalStatusSection_resultOrganizer(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_code(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_title(advanceDirectivesSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectivesSection_AdvanceDirectivesSection_advanceDirectiveObservation(advanceDirectivesSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdvanceDirectivesSection_templateId constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_AdvanceDirectivesSection_templateId(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.AdvanceDirectivesSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectivesSection_code constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_AdvanceDirectivesSection_code(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.AdvanceDirectivesSection_code(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectivesSection_title constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_AdvanceDirectivesSection_title(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.AdvanceDirectivesSection_title(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectivesSection_advanceDirectiveObservation constraint of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectivesSection_AdvanceDirectivesSection_advanceDirectiveObservation(AdvanceDirectivesSection advanceDirectivesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectivesSection.AdvanceDirectivesSection_advanceDirectiveObservation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_PayersSection_templateId(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_PayersSection_code(payersSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePayersSection_PayersSection_title(payersSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PayersSection_templateId constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_PayersSection_templateId(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.PayersSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the PayersSection_code constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_PayersSection_code(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.PayersSection_code(diagnostics, context);
	}

	/**
	 * Validates the PayersSection_title constraint of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePayersSection_PayersSection_title(PayersSection payersSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return payersSection.PayersSection_title(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_PurposeSection_templateId(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_PurposeSection_code(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_PurposeSection_title(purposeSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeSection_PurposeSection_purposeActivity(purposeSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PurposeSection_templateId constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_PurposeSection_templateId(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.PurposeSection_templateId(diagnostics, context);
	}

	/**
	 * Validates the PurposeSection_code constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_PurposeSection_code(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.PurposeSection_code(diagnostics, context);
	}

	/**
	 * Validates the PurposeSection_title constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_PurposeSection_title(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.PurposeSection_title(diagnostics, context);
	}

	/**
	 * Validates the PurposeSection_purposeActivity constraint of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeSection_PurposeSection_purposeActivity(PurposeSection purposeSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeSection.PurposeSection_purposeActivity(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_hasReason(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_reasonType(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_templateId(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_classCode(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_moodCode(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_code(purposeActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePurposeActivity_PurposeActivity_statusCode(purposeActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PurposeActivity_hasReason constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_hasReason(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_hasReason(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_reasonType constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_reasonType(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_reasonType(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_templateId constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_templateId(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_classCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_classCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_classCode(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_moodCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_moodCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_code constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_code(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_code(diagnostics, context);
	}

	/**
	 * Validates the PurposeActivity_statusCode constraint of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivity_PurposeActivity_statusCode(PurposeActivity purposeActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return purposeActivity.PurposeActivity_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_templateId(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_moodCode(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_id(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultOrganizer_ResultOrganizer_resultObservation(vitalSignsOrganizer, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsOrganizer_VitalSignsOrganizer_templateId(vitalSignsOrganizer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the VitalSignsOrganizer_templateId constraint of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsOrganizer_VitalSignsOrganizer_templateId(VitalSignsOrganizer vitalSignsOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsOrganizer.VitalSignsOrganizer_templateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_templateId(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_classCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_moodCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_id(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_statusCode(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_effectiveTime(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_code(advanceDirectiveObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_advanceDirectiveVerification(advanceDirectiveObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdvanceDirectiveObservation_templateId constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_templateId(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_classCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_classCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_classCode(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_moodCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_moodCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_moodCode(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_id constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_id(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_id(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_statusCode constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_statusCode(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_statusCode(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_effectiveTime constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_effectiveTime(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_effectiveTime(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_code constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_code(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_code(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveObservation_advanceDirectiveVerification constraint of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveObservation_AdvanceDirectiveObservation_advanceDirectiveVerification(AdvanceDirectiveObservation advanceDirectiveObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveObservation.AdvanceDirectiveObservation_advanceDirectiveVerification(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveStatusObservation_AdvanceDirectiveStatusObservation_templateId(advanceDirectiveStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveStatusObservation_AdvanceDirectiveStatusObservation_value(advanceDirectiveStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdvanceDirectiveStatusObservation_templateId constraint of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation_AdvanceDirectiveStatusObservation_templateId(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveStatusObservation.AdvanceDirectiveStatusObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveStatusObservation_value constraint of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveStatusObservation_AdvanceDirectiveStatusObservation_value(AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveStatusObservation.AdvanceDirectiveStatusObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_templateId(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_typeCode(advanceDirectiveVerification, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_time(advanceDirectiveVerification, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdvanceDirectiveVerification_templateId constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.AdvanceDirectiveVerification_templateId(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveVerification_typeCode constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.AdvanceDirectiveVerification_typeCode(diagnostics, context);
	}

	/**
	 * Validates the AdvanceDirectiveVerification_time constraint of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerification_AdvanceDirectiveVerification_time(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return advanceDirectiveVerification.AdvanceDirectiveVerification_time(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_CoverageActivity_templateId(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_CoverageActivity_classCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_CoverageActivity_moodCode(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_CoverageActivity_id(coverageActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCoverageActivity_CoverageActivity_statusCode(coverageActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CoverageActivity_templateId constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_CoverageActivity_templateId(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.CoverageActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the CoverageActivity_classCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_CoverageActivity_classCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.CoverageActivity_classCode(diagnostics, context);
	}

	/**
	 * Validates the CoverageActivity_moodCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_CoverageActivity_moodCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.CoverageActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the CoverageActivity_id constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_CoverageActivity_id(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.CoverageActivity_id(diagnostics, context);
	}

	/**
	 * Validates the CoverageActivity_statusCode constraint of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivity_CoverageActivity_statusCode(CoverageActivity coverageActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return coverageActivity.CoverageActivity_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_PolicyActivity_templateId(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_PolicyActivity_classCode(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_PolicyActivity_moodCode(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_PolicyActivity_id(policyActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePolicyActivity_PolicyActivity_statusCode(policyActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PolicyActivity_templateId constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_PolicyActivity_templateId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.PolicyActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the PolicyActivity_classCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_PolicyActivity_classCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.PolicyActivity_classCode(diagnostics, context);
	}

	/**
	 * Validates the PolicyActivity_moodCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_PolicyActivity_moodCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.PolicyActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the PolicyActivity_id constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_PolicyActivity_id(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.PolicyActivity_id(diagnostics, context);
	}

	/**
	 * Validates the PolicyActivity_statusCode constraint of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePolicyActivity_PolicyActivity_statusCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return policyActivity.PolicyActivity_statusCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_AuthorizationActivity_templateId(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_AuthorizationActivity_classCode(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_AuthorizationActivity_moodCode(authorizationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateAuthorizationActivity_AuthorizationActivity_id(authorizationActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AuthorizationActivity_templateId constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_AuthorizationActivity_templateId(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.AuthorizationActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the AuthorizationActivity_classCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_AuthorizationActivity_classCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.AuthorizationActivity_classCode(diagnostics, context);
	}

	/**
	 * Validates the AuthorizationActivity_moodCode constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_AuthorizationActivity_moodCode(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.AuthorizationActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the AuthorizationActivity_id constraint of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuthorizationActivity_AuthorizationActivity_id(AuthorizationActivity authorizationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return authorizationActivity.AuthorizationActivity_id(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivity(PlanOfCareActivity planOfCareActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivity_PlanOfCareActivity_templateId(planOfCareActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanOfCareActivity_PlanOfCareActivity_id(planOfCareActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PlanOfCareActivity_templateId constraint of '<em>Plan Of Care Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivity_PlanOfCareActivity_templateId(PlanOfCareActivity planOfCareActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivity.PlanOfCareActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the PlanOfCareActivity_id constraint of '<em>Plan Of Care Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivity_PlanOfCareActivity_id(PlanOfCareActivity planOfCareActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planOfCareActivity.PlanOfCareActivity_id(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivity_ProcedureActivity_templateId(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivity_ProcedureActivity_moodCode(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivity_ProcedureActivity_id(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivity_ProcedureActivity_statusCode(procedureActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcedureActivity_ProcedureActivity_effectiveTime(procedureActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProcedureActivity_templateId constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_ProcedureActivity_templateId(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.ProcedureActivity_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProcedureActivity_moodCode constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_ProcedureActivity_moodCode(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.ProcedureActivity_moodCode(diagnostics, context);
	}

	/**
	 * Validates the ProcedureActivity_id constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_ProcedureActivity_id(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.ProcedureActivity_id(diagnostics, context);
	}

	/**
	 * Validates the ProcedureActivity_statusCode constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_ProcedureActivity_statusCode(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.ProcedureActivity_statusCode(diagnostics, context);
	}

	/**
	 * Validates the ProcedureActivity_effectiveTime constraint of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcedureActivity_ProcedureActivity_effectiveTime(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return procedureActivity.ProcedureActivity_effectiveTime(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientInstruction_PatientInstruction_templateId(patientInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validatePatientInstruction_PatientInstruction_moodCode(patientInstruction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PatientInstruction_templateId constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_PatientInstruction_templateId(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.PatientInstruction_templateId(diagnostics, context);
	}

	/**
	 * Validates the PatientInstruction_moodCode constraint of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientInstruction_PatientInstruction_moodCode(PatientInstruction patientInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return patientInstruction.PatientInstruction_moodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentInstruction_FulfillmentInstruction_templateId(fulfillmentInstruction, diagnostics, context);
		if (result || diagnostics != null) result &= validateFulfillmentInstruction_FulfillmentInstruction_moodCode(fulfillmentInstruction, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FulfillmentInstruction_templateId constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_FulfillmentInstruction_templateId(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.FulfillmentInstruction_templateId(diagnostics, context);
	}

	/**
	 * Validates the FulfillmentInstruction_moodCode constraint of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstruction_FulfillmentInstruction_moodCode(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return fulfillmentInstruction.FulfillmentInstruction_moodCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation(FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_templateId(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_classCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_moodCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_code(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_statusCode(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatusObservation_StatusObservation_value(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusObservation_FunctionalStatusObservation_templateId(functionalStatusObservation, diagnostics, context);
		if (result || diagnostics != null) result &= validateFunctionalStatusObservation_FunctionalStatusObservation_value(functionalStatusObservation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FunctionalStatusObservation_templateId constraint of '<em>Functional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation_FunctionalStatusObservation_templateId(FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusObservation.FunctionalStatusObservation_templateId(diagnostics, context);
	}

	/**
	 * Validates the FunctionalStatusObservation_value constraint of '<em>Functional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusObservation_FunctionalStatusObservation_value(FunctionalStatusObservation functionalStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return functionalStatusObservation.FunctionalStatusObservation_value(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateParticipantRole_playingEntityChoice(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductInstance_ProductInstance_templateId(productInstance, diagnostics, context);
		if (result || diagnostics != null) result &= validateProductInstance_ProductInstance_classCode(productInstance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProductInstance_templateId constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_ProductInstance_templateId(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.ProductInstance_templateId(diagnostics, context);
	}

	/**
	 * Validates the ProductInstance_classCode constraint of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductInstance_ProductInstance_classCode(ProductInstance productInstance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return productInstance.ProductInstance_classCode(diagnostics, context);
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
