/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.CDTRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.LevelOneConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelThreeConformance;
import org.openhealthtools.mdht.uml.cda.cdt.LevelTwoConformance;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.PlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitAndChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage
 * @generated
 */
public class CDTValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CDTValidator INSTANCE = new CDTValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.cdt";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Confidentiality Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_CONFIDENTIALITY_CODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Effective Time' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_EFFECTIVE_TIME = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_ID = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Language Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_LANGUAGE_CODE = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Realm Code' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_REALM_CODE = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Title' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TITLE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Type Id' of 'General Header Constraints'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_HEADER_CONSTRAINTS__GENERAL_HEADER_CONSTRAINTS_TYPE_ID = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Both Assessment And Plan' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Both Plan And Assessment' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_PLAN_AND_ASSESSMENT = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Combined Plan And Assessment' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_COMBINED_PLAN_AND_ASSESSMENT = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Reason For Visit And Chief Complaint' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__GENERAL_HEADER_CONSTRAINTS_CODE = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical History Of Present Illness' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Past Medical History Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Medications Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Alerts Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ALERTS_SECTION = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Social History Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Family History Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Review Of Systems Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Physical Examination Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Vital Signs Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical General Status Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Results Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_RESULTS_SECTION = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Problem Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROBLEM_SECTION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Procedures Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROCEDURES_SECTION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate History And Physical Immunizations Section' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'History And Physical'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int HISTORY_AND_PHYSICAL__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Referral Or Visit' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_REFERRAL_OR_VISIT = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Code' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note History Of Present Illness' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Physical Examination Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PHYSICAL_EXAMINATION_SECTION = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Problem Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PROBLEM_SECTION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Procedures Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PROCEDURES_SECTION = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Past Medical History Section Consult' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION_CONSULT = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Immunizations Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_IMMUNIZATIONS_SECTION = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Medications Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_MEDICATIONS_SECTION = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Alerts Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_ALERTS_SECTION = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Social History Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Family History Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_FAMILY_HISTORY_SECTION = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Review Of Systems Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Vital Signs Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_VITAL_SIGNS_SECTION = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note General Status Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_GENERAL_STATUS_SECTION = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Consultation Note Results Section' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__CONSULTATION_NOTE_RESULTS_SECTION = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Consultation Note'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONSULTATION_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level Three Conformance Template Id' of 'Level Three Conformance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEVEL_THREE_CONFORMANCE__LEVEL_THREE_CONFORMANCE_TEMPLATE_ID = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Template Id' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_TEMPLATE_ID = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Referral Section Code' of 'Reason For Referral Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_REFERRAL_SECTION__REASON_FOR_REFERRAL_SECTION_CODE = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Consult Template Id' of 'Reason For Visit Section Consult'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_TEMPLATE_ID = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Consult Code' of 'Reason For Visit Section Consult'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_SECTION_CONSULT__REASON_FOR_VISIT_SECTION_CONSULT_CODE = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Template Id' of 'Reason For Visit Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_TEMPLATE_ID = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit Section Code' of 'Reason For Visit Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_SECTION__REASON_FOR_VISIT_SECTION_CODE = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Template Id' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Chief Complaint Section Code' of 'Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CHIEF_COMPLAINT_SECTION__CHIEF_COMPLAINT_SECTION_CODE = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit And Chief Complaint Section Template Id' of 'Reason For Visit And Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reason For Visit And Chief Complaint Section Code' of 'Reason For Visit And Chief Complaint Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION__REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION_CODE = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Template Id' of 'Past Medical History Section Consult'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEMPLATE_ID = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Code' of 'Past Medical History Section Consult'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_CODE = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Consult Text' of 'Past Medical History Section Consult'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION_CONSULT__PAST_MEDICAL_HISTORY_SECTION_CONSULT_TEXT = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level One Conformance Template Id' of 'Level One Conformance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEVEL_ONE_CONFORMANCE__LEVEL_ONE_CONFORMANCE_TEMPLATE_ID = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Level Two Conformance Template Id' of 'Level Two Conformance'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LEVEL_TWO_CONFORMANCE__LEVEL_TWO_CONFORMANCE_TEMPLATE_ID = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Examination Section Template Id' of 'Physical Examination Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAMINATION_SECTION__PHYSICAL_EXAMINATION_SECTION_TEMPLATE_ID = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Physical Examination Section Code' of 'Physical Examination Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PHYSICAL_EXAMINATION_SECTION__PHYSICAL_EXAMINATION_SECTION_CODE = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Clinical Statements' of 'Past Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_CLINICAL_STATEMENTS = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Template Id' of 'Past Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Code' of 'Past Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_CODE = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Past Medical History Section Text' of 'Past Medical History Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAST_MEDICAL_HISTORY_SECTION__PAST_MEDICAL_HISTORY_SECTION_TEXT = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Template Id' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_TEMPLATE_ID = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Review Of Systems Section Code' of 'Review Of Systems Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int REVIEW_OF_SYSTEMS_SECTION__REVIEW_OF_SYSTEMS_SECTION_CODE = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Status Section Template Id' of 'General Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_TEMPLATE_ID = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Status Section Code' of 'General Status Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GENERAL_STATUS_SECTION__GENERAL_STATUS_SECTION_CODE = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Diagnostic Findings Title' of 'Diagnostic Findings'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DIAGNOSTIC_FINDINGS__DIAGNOSTIC_FINDINGS_TITLE = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Clinical Statements' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CLINICAL_STATEMENTS = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Template Id' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Code' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Text' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Vital Signs Section Vital Signs Organizer' of 'Vital Signs Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Template Id' of 'Assessment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_TEMPLATE_ID = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment Section Code' of 'Assessment Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_SECTION__ASSESSMENT_SECTION_CODE = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Section Template Id' of 'Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_SECTION__PLAN_SECTION_TEMPLATE_ID = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Section Code' of 'Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PLAN_SECTION__PLAN_SECTION_CODE = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Template Id' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_TEMPLATE_ID = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Assessment And Plan Section Code' of 'Assessment And Plan Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ASSESSMENT_AND_PLAN_SECTION__ASSESSMENT_AND_PLAN_SECTION_CODE = 75;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 84;

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
	protected CCDValidator ccdValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IHEValidator iheValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTValidator() {
		super();
		ccdValidator = CCDValidator.INSTANCE;
		iheValidator = IHEValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CDTPackage.eINSTANCE;
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
			case CDTPackage.GENERAL_HEADER_CONSTRAINTS:
				return validateGeneralHeaderConstraints((GeneralHeaderConstraints)value, diagnostics, context);
			case CDTPackage.HISTORY_AND_PHYSICAL:
				return validateHistoryAndPhysical((HistoryAndPhysical)value, diagnostics, context);
			case CDTPackage.CONSULTATION_NOTE:
				return validateConsultationNote((ConsultationNote)value, diagnostics, context);
			case CDTPackage.REASON_FOR_REFERRAL_SECTION:
				return validateReasonForReferralSection((ReasonForReferralSection)value, diagnostics, context);
			case CDTPackage.REASON_FOR_VISIT_SECTION_CONSULT:
				return validateReasonForVisitSectionConsult((ReasonForVisitSectionConsult)value, diagnostics, context);
			case CDTPackage.LEVEL_ONE_CONFORMANCE:
				return validateLevelOneConformance((LevelOneConformance)value, diagnostics, context);
			case CDTPackage.LEVEL_TWO_CONFORMANCE:
				return validateLevelTwoConformance((LevelTwoConformance)value, diagnostics, context);
			case CDTPackage.LEVEL_THREE_CONFORMANCE:
				return validateLevelThreeConformance((LevelThreeConformance)value, diagnostics, context);
			case CDTPackage.PHYSICAL_EXAMINATION_SECTION:
				return validatePhysicalExaminationSection((PhysicalExaminationSection)value, diagnostics, context);
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION:
				return validatePastMedicalHistorySection((PastMedicalHistorySection)value, diagnostics, context);
			case CDTPackage.REVIEW_OF_SYSTEMS_SECTION:
				return validateReviewOfSystemsSection((ReviewOfSystemsSection)value, diagnostics, context);
			case CDTPackage.GENERAL_STATUS_SECTION:
				return validateGeneralStatusSection((GeneralStatusSection)value, diagnostics, context);
			case CDTPackage.DIAGNOSTIC_FINDINGS:
				return validateDiagnosticFindings((DiagnosticFindings)value, diagnostics, context);
			case CDTPackage.VITAL_SIGNS_SECTION:
				return validateVitalSignsSection((VitalSignsSection)value, diagnostics, context);
			case CDTPackage.ASSESSMENT_SECTION:
				return validateAssessmentSection((AssessmentSection)value, diagnostics, context);
			case CDTPackage.PLAN_SECTION:
				return validatePlanSection((PlanSection)value, diagnostics, context);
			case CDTPackage.ASSESSMENT_AND_PLAN_SECTION:
				return validateAssessmentAndPlanSection((AssessmentAndPlanSection)value, diagnostics, context);
			case CDTPackage.REASON_FOR_VISIT_SECTION:
				return validateReasonForVisitSection((ReasonForVisitSection)value, diagnostics, context);
			case CDTPackage.CHIEF_COMPLAINT_SECTION:
				return validateChiefComplaintSection((ChiefComplaintSection)value, diagnostics, context);
			case CDTPackage.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION:
				return validateReasonForVisitAndChiefComplaintSection((ReasonForVisitAndChiefComplaintSection)value, diagnostics, context);
			case CDTPackage.HISTORY_OF_PRESENT_ILLNESS:
				return validateHistoryOfPresentIllness((HistoryOfPresentIllness)value, diagnostics, context);
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION_CONSULT:
				return validatePastMedicalHistorySectionConsult((PastMedicalHistorySectionConsult)value, diagnostics, context);
			case CDTPackage.CDT_REGISTRY_DELEGATE:
				return validateCDTRegistryDelegate((CDTRegistryDelegate)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(generalHeaderConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(generalHeaderConstraints, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsConfidentialityCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsConfidentialityCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsEffectiveTime constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsEffectiveTime(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsLanguageCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsLanguageCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsRealmCode constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsRealmCode(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTitle constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTitle(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTypeId constraint of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(GeneralHeaderConstraints generalHeaderConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalHeaderConstraints.validateGeneralHeaderConstraintsTypeId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateGeneralHeaderConstraintsTemplateId(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateGeneralHeaderConstraintsCode(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalBothAssessmentAndPlan(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalBothPlanAndAssessment(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalCombinedPlanAndAssessment(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalHistoryOfPresentIllness(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalPastMedicalHistorySection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalMedicationsSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalAlertsSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalSocialHistorySection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalFamilyHistorySection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalReviewOfSystemsSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalPhysicalExaminationSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalVitalSignsSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalGeneralStatusSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalResultsSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalProblemSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalProceduresSection(historyAndPhysical, diagnostics, context);
		if (result || diagnostics != null) result &= validateHistoryAndPhysical_validateHistoryAndPhysicalImmunizationsSection(historyAndPhysical, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateHistoryAndPhysicalBothAssessmentAndPlan constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalBothAssessmentAndPlan(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalBothPlanAndAssessment constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalBothPlanAndAssessment(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalBothPlanAndAssessment(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalCombinedPlanAndAssessment constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalCombinedPlanAndAssessment(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalCombinedPlanAndAssessment(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalReasonForVisitAndChiefComplaint constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateGeneralHeaderConstraintsCode(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateGeneralHeaderConstraintsCode", getObjectLabel(historyAndPhysical, context) },
						 new Object[] { historyAndPhysical },
						 context));
			}
			return false;
		}
		return validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(historyAndPhysical, diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalHistoryOfPresentIllness constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalHistoryOfPresentIllness(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalPastMedicalHistorySection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalPastMedicalHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalMedicationsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalAlertsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalAlertsSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalSocialHistorySection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalFamilyHistorySection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalReviewOfSystemsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalReviewOfSystemsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalReviewOfSystemsSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalPhysicalExaminationSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalPhysicalExaminationSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalVitalSignsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalGeneralStatusSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalGeneralStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalResultsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalResultsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalProblemSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalProblemSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalProceduresSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateHistoryAndPhysicalImmunizationsSection constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return historyAndPhysical.validateHistoryAndPhysicalImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysical_validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateGeneralHeaderConstraintsTemplateId", getObjectLabel(historyAndPhysical, context) },
						 new Object[] { historyAndPhysical },
						 context));
			}
			return false;
		}
		return validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(historyAndPhysical, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateGeneralHeaderConstraintsTemplateId(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateGeneralHeaderConstraintsCode(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteReferralOrVisit(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteHistoryOfPresentIllness(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNotePhysicalExaminationSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteProblemSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteProceduresSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNotePastMedicalHistorySectionConsult(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteImmunizationsSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteMedicationsSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteAlertsSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteSocialHistorySection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteFamilyHistorySection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteReviewOfSystemsSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteVitalSignsSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteGeneralStatusSection(consultationNote, diagnostics, context);
		if (result || diagnostics != null) result &= validateConsultationNote_validateConsultationNoteResultsSection(consultationNote, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateConsultationNoteReferralOrVisit constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteReferralOrVisit(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteReferralOrVisit(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsCode constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateGeneralHeaderConstraintsCode(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateGeneralHeaderConstraintsCode", getObjectLabel(consultationNote, context) },
						 new Object[] { consultationNote },
						 context));
			}
			return false;
		}
		return validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(consultationNote, diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteHistoryOfPresentIllness constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteHistoryOfPresentIllness(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteHistoryOfPresentIllness(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNotePhysicalExaminationSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNotePhysicalExaminationSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNotePhysicalExaminationSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteProblemSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteProblemSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteProblemSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteProceduresSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteProceduresSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteProceduresSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNotePastMedicalHistorySectionConsult constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNotePastMedicalHistorySectionConsult(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNotePastMedicalHistorySectionConsult(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteImmunizationsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteImmunizationsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteImmunizationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteMedicationsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteMedicationsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteMedicationsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteAlertsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteAlertsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteAlertsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteSocialHistorySection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteSocialHistorySection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteSocialHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteFamilyHistorySection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteFamilyHistorySection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteFamilyHistorySection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteReviewOfSystemsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteReviewOfSystemsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteReviewOfSystemsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteVitalSignsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteVitalSignsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteVitalSignsSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteGeneralStatusSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteGeneralStatusSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteGeneralStatusSection(diagnostics, context);
	}

	/**
	 * Validates the validateConsultationNoteResultsSection constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateConsultationNoteResultsSection(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return consultationNote.validateConsultationNoteResultsSection(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsultationNote_validateGeneralHeaderConstraintsTemplateId(ConsultationNote consultationNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 new Object[] { "validateGeneralHeaderConstraintsTemplateId", getObjectLabel(consultationNote, context) },
						 new Object[] { consultationNote },
						 context));
			}
			return false;
		}
		return validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTemplateId(consultationNote, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelThreeConformance(LevelThreeConformance levelThreeConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelThreeConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateLevelThreeConformance_validateLevelThreeConformanceTemplateId(levelThreeConformance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLevelThreeConformanceTemplateId constraint of '<em>Level Three Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelThreeConformance_validateLevelThreeConformanceTemplateId(LevelThreeConformance levelThreeConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return levelThreeConformance.validateLevelThreeConformanceTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(reasonForReferralSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForReferralSection_validateReasonForReferralSectionCode(reasonForReferralSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForReferralSectionTemplateId constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionTemplateId(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForReferralSectionCode constraint of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForReferralSection_validateReasonForReferralSectionCode(ReasonForReferralSection reasonForReferralSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForReferralSection.validateReasonForReferralSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSectionConsult(ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultTemplateId(reasonForVisitSectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultCode(reasonForVisitSectionConsult, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForVisitSectionConsultTemplateId constraint of '<em>Reason For Visit Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultTemplateId(ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitSectionConsult.validateReasonForVisitSectionConsultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForVisitSectionConsultCode constraint of '<em>Reason For Visit Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSectionConsult_validateReasonForVisitSectionConsultCode(ReasonForVisitSectionConsult reasonForVisitSectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitSectionConsult.validateReasonForVisitSectionConsultCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSection(ReasonForVisitSection reasonForVisitSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitSection_validateReasonForVisitSectionTemplateId(reasonForVisitSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitSection_validateReasonForVisitSectionCode(reasonForVisitSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForVisitSectionTemplateId constraint of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSection_validateReasonForVisitSectionTemplateId(ReasonForVisitSection reasonForVisitSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitSection.validateReasonForVisitSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForVisitSectionCode constraint of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitSection_validateReasonForVisitSectionCode(ReasonForVisitSection reasonForVisitSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitSection.validateReasonForVisitSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(chiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateChiefComplaintSection_validateChiefComplaintSectionCode(chiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateChiefComplaintSectionTemplateId constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateChiefComplaintSectionCode constraint of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChiefComplaintSection_validateChiefComplaintSectionCode(ChiefComplaintSection chiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return chiefComplaintSection.validateChiefComplaintSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitAndChiefComplaintSection(ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionTemplateId(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionCode(reasonForVisitAndChiefComplaintSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReasonForVisitAndChiefComplaintSectionTemplateId constraint of '<em>Reason For Visit And Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionTemplateId(ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitAndChiefComplaintSection.validateReasonForVisitAndChiefComplaintSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReasonForVisitAndChiefComplaintSectionCode constraint of '<em>Reason For Visit And Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReasonForVisitAndChiefComplaintSection_validateReasonForVisitAndChiefComplaintSectionCode(ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reasonForVisitAndChiefComplaintSection.validateReasonForVisitAndChiefComplaintSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryOfPresentIllness(HistoryOfPresentIllness historyOfPresentIllness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessTemplateId(historyOfPresentIllness, diagnostics, context);
		if (result || diagnostics != null) result &= iheValidator.validateHistoryOfPresentIllness_validateHistoryOfPresentIllnessCode(historyOfPresentIllness, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsult(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultTemplateId(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultCode(pastMedicalHistorySectionConsult, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultText(pastMedicalHistorySectionConsult, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePastMedicalHistorySectionConsultTemplateId constraint of '<em>Past Medical History Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultTemplateId(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePastMedicalHistorySectionConsultCode constraint of '<em>Past Medical History Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultCode(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultCode(diagnostics, context);
	}

	/**
	 * Validates the validatePastMedicalHistorySectionConsultText constraint of '<em>Past Medical History Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySectionConsult_validatePastMedicalHistorySectionConsultText(PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySectionConsult.validatePastMedicalHistorySectionConsultText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOneConformance(LevelOneConformance levelOneConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelOneConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateLevelOneConformance_validateLevelOneConformanceTemplateId(levelOneConformance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLevelOneConformanceTemplateId constraint of '<em>Level One Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelOneConformance_validateLevelOneConformanceTemplateId(LevelOneConformance levelOneConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return levelOneConformance.validateLevelOneConformanceTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelTwoConformance(LevelTwoConformance levelTwoConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(levelTwoConformance, diagnostics, context);
		if (result || diagnostics != null) result &= validateLevelTwoConformance_validateLevelTwoConformanceTemplateId(levelTwoConformance, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateLevelTwoConformanceTemplateId constraint of '<em>Level Two Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLevelTwoConformance_validateLevelTwoConformanceTemplateId(LevelTwoConformance levelTwoConformance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return levelTwoConformance.validateLevelTwoConformanceTemplateId(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExaminationSection(PhysicalExaminationSection physicalExaminationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExaminationSection_validatePhysicalExaminationSectionTemplateId(physicalExaminationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePhysicalExaminationSection_validatePhysicalExaminationSectionCode(physicalExaminationSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePhysicalExaminationSectionTemplateId constraint of '<em>Physical Examination Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExaminationSection_validatePhysicalExaminationSectionTemplateId(PhysicalExaminationSection physicalExaminationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExaminationSection.validatePhysicalExaminationSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePhysicalExaminationSectionCode constraint of '<em>Physical Examination Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalExaminationSection_validatePhysicalExaminationSectionCode(PhysicalExaminationSection physicalExaminationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return physicalExaminationSection.validatePhysicalExaminationSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySection(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionClinicalStatements(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionTemplateId(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionCode(pastMedicalHistorySection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePastMedicalHistorySection_validatePastMedicalHistorySectionText(pastMedicalHistorySection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePastMedicalHistorySectionClinicalStatements constraint of '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionClinicalStatements(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySection.validatePastMedicalHistorySectionClinicalStatements(diagnostics, context);
	}

	/**
	 * Validates the validatePastMedicalHistorySectionTemplateId constraint of '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionTemplateId(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySection.validatePastMedicalHistorySectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePastMedicalHistorySectionCode constraint of '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionCode(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySection.validatePastMedicalHistorySectionCode(diagnostics, context);
	}

	/**
	 * Validates the validatePastMedicalHistorySectionText constraint of '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePastMedicalHistorySection_validatePastMedicalHistorySectionText(PastMedicalHistorySection pastMedicalHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return pastMedicalHistorySection.validatePastMedicalHistorySectionText(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(reviewOfSystemsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(reviewOfSystemsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateReviewOfSystemsSectionTemplateId constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionTemplateId(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateReviewOfSystemsSectionCode constraint of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReviewOfSystemsSection_validateReviewOfSystemsSectionCode(ReviewOfSystemsSection reviewOfSystemsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return reviewOfSystemsSection.validateReviewOfSystemsSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStatusSection(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralStatusSection_validateGeneralStatusSectionTemplateId(generalStatusSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralStatusSection_validateGeneralStatusSectionCode(generalStatusSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateGeneralStatusSectionTemplateId constraint of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStatusSection_validateGeneralStatusSectionTemplateId(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalStatusSection.validateGeneralStatusSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateGeneralStatusSectionCode constraint of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralStatusSection_validateGeneralStatusSectionCode(GeneralStatusSection generalStatusSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return generalStatusSection.validateGeneralStatusSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticFindings(DiagnosticFindings diagnosticFindings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTemplateId(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionCode(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionTitle(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionText(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= ccdValidator.validateResultsSection_validateResultsSectionResultOrganizer(diagnosticFindings, diagnostics, context);
		if (result || diagnostics != null) result &= validateDiagnosticFindings_validateDiagnosticFindingsTitle(diagnosticFindings, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateDiagnosticFindingsTitle constraint of '<em>Diagnostic Findings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiagnosticFindings_validateDiagnosticFindingsTitle(DiagnosticFindings diagnosticFindings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return diagnosticFindings.validateDiagnosticFindingsTitle(diagnostics, context);
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
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionClinicalStatements(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionTemplateId(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionCode(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionText(vitalSignsSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateVitalSignsSection_validateVitalSignsSectionVitalSignsOrganizer(vitalSignsSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateVitalSignsSectionClinicalStatements constraint of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsSection_validateVitalSignsSectionClinicalStatements(VitalSignsSection vitalSignsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return vitalSignsSection.validateVitalSignsSectionClinicalStatements(diagnostics, context);
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
	public boolean validateAssessmentSection(AssessmentSection assessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentSection_validateAssessmentSectionTemplateId(assessmentSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentSection_validateAssessmentSectionCode(assessmentSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentSectionTemplateId constraint of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSection_validateAssessmentSectionTemplateId(AssessmentSection assessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentSection.validateAssessmentSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentSectionCode constraint of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentSection_validateAssessmentSectionCode(AssessmentSection assessmentSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentSection.validateAssessmentSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanSection(PlanSection planSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanSection_validatePlanSectionTemplateId(planSection, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlanSection_validatePlanSectionCode(planSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validatePlanSectionTemplateId constraint of '<em>Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanSection_validatePlanSectionTemplateId(PlanSection planSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planSection.validatePlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validatePlanSectionCode constraint of '<em>Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanSection_validatePlanSectionCode(PlanSection planSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return planSection.validatePlanSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(assessmentAndPlanSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(assessmentAndPlanSection, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionTemplateId constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionTemplateId(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionTemplateId(diagnostics, context);
	}

	/**
	 * Validates the validateAssessmentAndPlanSectionCode constraint of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssessmentAndPlanSection_validateAssessmentAndPlanSectionCode(AssessmentAndPlanSection assessmentAndPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return assessmentAndPlanSection.validateAssessmentAndPlanSectionCode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCDTRegistryDelegate(CDTRegistryDelegate cdtRegistryDelegate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cdtRegistryDelegate, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CDTPlugin.INSTANCE;
	}

} //CDTValidator
