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
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatus;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
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
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document code' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_CODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document title' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TITLE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Continuity Of Care Document template Id' of 'Continuity Of Care Document'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONTINUITY_OF_CARE_DOCUMENT__CONTINUITY_OF_CARE_DOCUMENT_TEMPLATE_ID = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act template Id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act class Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_CLASS_CODE = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act mood Code' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_MOOD_CODE = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act id' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_ID = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Act problem Observation' of 'Problem Act'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_ACT__PROBLEM_ACT_PROBLEM_OBSERVATION = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation template Id' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation mood Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_MOOD_CODE = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation status Code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_STATUS_CODE = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation effective Time' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_EFFECTIVE_TIME = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Observation code' of 'Problem Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_OBSERVATION__PROBLEM_OBSERVATION_CODE = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section template Id' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TEMPLATE_ID = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section code' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_CODE = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section title' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_TITLE = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Section problem Act' of 'Problem Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_SECTION__PROBLEM_SECTION_PROBLEM_ACT = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Status template Id' of 'Problem Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS__PROBLEM_STATUS_TEMPLATE_ID = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Status value' of 'Problem Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_STATUS__PROBLEM_STATUS_VALUE = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status template Id' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_TEMPLATE_ID = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status code' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_CODE = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Problem Health Status value' of 'Problem Health Status'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROBLEM_HEALTH_STATUS__PROBLEM_HEALTH_STATUS_VALUE = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation template Id' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation class Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation mood Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_CODE = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation status Code' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Status Observation value' of 'Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation template Id' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation class Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation mood Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation status Code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Episode Observation code' of 'Episode Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Awareness template Id' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Patient Awareness type Code' of 'Patient Awareness'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section template Id' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TEMPLATE_ID = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section code' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_CODE = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Section title' of 'Family History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_SECTION__FAMILY_HISTORY_SECTION_TITLE = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation template Id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation id' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_ID = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Observation status Code' of 'Family History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_OBSERVATION__FAMILY_HISTORY_OBSERVATION_STATUS_CODE = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Organizer template Id' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_TEMPLATE_ID = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Family History Organizer status Code' of 'Family History Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FAMILY_HISTORY_ORGANIZER__FAMILY_HISTORY_ORGANIZER_STATUS_CODE = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Organizer template Id' of 'Result Organizer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Result Observation template Id' of 'Result Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Section template Id' of 'Social History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Social History Observation template Id' of 'Social History Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SOCIAL_HISTORY_OBSERVATION__SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section template Id' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section code' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_CODE = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Section title' of 'Encounters Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Immunizations Section template Id' of 'Immunizations Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEMPLATE_ID = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity template Id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity id' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity code' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounters Activity effective Time' of 'Encounters Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity template Id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity id' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity status Code' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity medication Series Number Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Activity medication Status Observation' of 'Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity template Id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_TEMPLATE_ID = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity id' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_ID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity status Code' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_STATUS_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supply Activity medication Status Observation' of 'Supply Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUPPLY_ACTIVITY__SUPPLY_ACTIVITY_MEDICATION_STATUS_OBSERVATION = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section template Id' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TEMPLATE_ID = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section code' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_CODE = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alerts Section title' of 'Alerts Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERTS_SECTION__ALERTS_SECTION_TITLE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Observation template Id' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Observation status Code' of 'Alert Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reaction Observation template Id' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Reaction Observation status Code' of 'Reaction Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REACTION_OBSERVATION__REACTION_OBSERVATION_STATUS_CODE = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation template Id' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation status Code' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_STATUS_CODE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Severity Observation value' of 'Severity Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEVERITY_OBSERVATION__SEVERITY_OBSERVATION_VALUE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Status Observation template Id' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__ALERT_STATUS_OBSERVATION_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Alert Status Observation value' of 'Alert Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ALERT_STATUS_OBSERVATION__ALERT_STATUS_OBSERVATION_VALUE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Cause Of Death Observation template Id' of 'Cause Of Death Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CAUSE_OF_DEATH_OBSERVATION__CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section template Id' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TEMPLATE_ID = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section code' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_CODE = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Results Section title' of 'Results Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESULTS_SECTION__RESULTS_SECTION_TITLE = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation template Id' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation status Code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation code' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_CODE = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Series Number Observation value' of 'Medication Series Number Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_SERIES_NUMBER_OBSERVATION__MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Status Observation template Id' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__MEDICATION_STATUS_OBSERVATION_TEMPLATE_ID = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Medication Status Observation value' of 'Medication Status Observation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MEDICATION_STATUS_OBSERVATION__MEDICATION_STATUS_OBSERVATION_VALUE = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Encounter Location template Id' of 'Encounter Location'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ENCOUNTER_LOCATION__ENCOUNTER_LOCATION_TEMPLATE_ID = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Product template Id' of 'Product'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PRODUCT__PRODUCT_TEMPLATE_ID = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section template Id' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TEMPLATE_ID = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section code' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_CODE = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Procedures Section title' of 'Procedures Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PROCEDURES_SECTION__PROCEDURES_SECTION_TITLE = 96;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 96;

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
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_code(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_title(continuityOfCareDocument, diagnostics, context);
		if (result || diagnostics != null) result &= validateContinuityOfCareDocument_ContinuityOfCareDocument_templateId(continuityOfCareDocument, diagnostics, context);
		return result;
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
	 * Validates the ContinuityOfCareDocument_title constraint of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocument_ContinuityOfCareDocument_title(ContinuityOfCareDocument continuityOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return continuityOfCareDocument.ContinuityOfCareDocument_title(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_code(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_templateId(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_classCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_moodCode(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_id(problemAct, diagnostics, context);
		if (result || diagnostics != null) result &= validateProblemAct_ProblemAct_problemObservation(problemAct, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProblemAct_code constraint of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProblemAct_ProblemAct_code(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return problemAct.ProblemAct_code(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_templateId(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_id(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_statusCode(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_medicationSeriesNumberObservation(medicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMedicationActivity_MedicationActivity_medicationStatusObservation(medicationActivity, diagnostics, context);
		return result;
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
