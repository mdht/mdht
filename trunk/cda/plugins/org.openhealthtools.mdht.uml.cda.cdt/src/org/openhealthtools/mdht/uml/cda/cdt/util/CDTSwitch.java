/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
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

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.cdt.CDTPackage
 * @generated
 */
public class CDTSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CDTPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CDTSwitch() {
		if (modelPackage == null) {
			modelPackage = CDTPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CDTPackage.GENERAL_HEADER_CONSTRAINTS: {
				GeneralHeaderConstraints generalHeaderConstraints = (GeneralHeaderConstraints)theEObject;
				T result = caseGeneralHeaderConstraints(generalHeaderConstraints);
				if (result == null) result = caseClinicalDocument(generalHeaderConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.HISTORY_AND_PHYSICAL: {
				HistoryAndPhysical historyAndPhysical = (HistoryAndPhysical)theEObject;
				T result = caseHistoryAndPhysical(historyAndPhysical);
				if (result == null) result = caseGeneralHeaderConstraints(historyAndPhysical);
				if (result == null) result = caseClinicalDocument(historyAndPhysical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.CONSULTATION_NOTE: {
				ConsultationNote consultationNote = (ConsultationNote)theEObject;
				T result = caseConsultationNote(consultationNote);
				if (result == null) result = caseGeneralHeaderConstraints(consultationNote);
				if (result == null) result = caseClinicalDocument(consultationNote);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection)theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) result = caseSection(reasonForReferralSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.REASON_FOR_VISIT_SECTION_CONSULT: {
				ReasonForVisitSectionConsult reasonForVisitSectionConsult = (ReasonForVisitSectionConsult)theEObject;
				T result = caseReasonForVisitSectionConsult(reasonForVisitSectionConsult);
				if (result == null) result = caseSection(reasonForVisitSectionConsult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.LEVEL_ONE_CONFORMANCE: {
				LevelOneConformance levelOneConformance = (LevelOneConformance)theEObject;
				T result = caseLevelOneConformance(levelOneConformance);
				if (result == null) result = caseGeneralHeaderConstraints(levelOneConformance);
				if (result == null) result = caseClinicalDocument(levelOneConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.LEVEL_TWO_CONFORMANCE: {
				LevelTwoConformance levelTwoConformance = (LevelTwoConformance)theEObject;
				T result = caseLevelTwoConformance(levelTwoConformance);
				if (result == null) result = caseLevelOneConformance(levelTwoConformance);
				if (result == null) result = caseGeneralHeaderConstraints(levelTwoConformance);
				if (result == null) result = caseClinicalDocument(levelTwoConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.LEVEL_THREE_CONFORMANCE: {
				LevelThreeConformance levelThreeConformance = (LevelThreeConformance)theEObject;
				T result = caseLevelThreeConformance(levelThreeConformance);
				if (result == null) result = caseLevelTwoConformance(levelThreeConformance);
				if (result == null) result = caseLevelOneConformance(levelThreeConformance);
				if (result == null) result = caseGeneralHeaderConstraints(levelThreeConformance);
				if (result == null) result = caseClinicalDocument(levelThreeConformance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.PHYSICAL_EXAMINATION_SECTION: {
				PhysicalExaminationSection physicalExaminationSection = (PhysicalExaminationSection)theEObject;
				T result = casePhysicalExaminationSection(physicalExaminationSection);
				if (result == null) result = caseSection(physicalExaminationSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION: {
				PastMedicalHistorySection pastMedicalHistorySection = (PastMedicalHistorySection)theEObject;
				T result = casePastMedicalHistorySection(pastMedicalHistorySection);
				if (result == null) result = caseSection(pastMedicalHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection)theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) result = caseSection(reviewOfSystemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.GENERAL_STATUS_SECTION: {
				GeneralStatusSection generalStatusSection = (GeneralStatusSection)theEObject;
				T result = caseGeneralStatusSection(generalStatusSection);
				if (result == null) result = caseSection(generalStatusSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.DIAGNOSTIC_FINDINGS: {
				DiagnosticFindings diagnosticFindings = (DiagnosticFindings)theEObject;
				T result = caseDiagnosticFindings(diagnosticFindings);
				if (result == null) result = caseResultsSection(diagnosticFindings);
				if (result == null) result = caseSection(diagnosticFindings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection)theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseSection(vitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.ASSESSMENT_SECTION: {
				AssessmentSection assessmentSection = (AssessmentSection)theEObject;
				T result = caseAssessmentSection(assessmentSection);
				if (result == null) result = caseSection(assessmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.PLAN_SECTION: {
				PlanSection planSection = (PlanSection)theEObject;
				T result = casePlanSection(planSection);
				if (result == null) result = caseSection(planSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection)theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) result = caseSection(assessmentAndPlanSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.REASON_FOR_VISIT_SECTION: {
				ReasonForVisitSection reasonForVisitSection = (ReasonForVisitSection)theEObject;
				T result = caseReasonForVisitSection(reasonForVisitSection);
				if (result == null) result = caseSection(reasonForVisitSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection)theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) result = caseSection(chiefComplaintSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.REASON_FOR_VISIT_AND_CHIEF_COMPLAINT_SECTION: {
				ReasonForVisitAndChiefComplaintSection reasonForVisitAndChiefComplaintSection = (ReasonForVisitAndChiefComplaintSection)theEObject;
				T result = caseReasonForVisitAndChiefComplaintSection(reasonForVisitAndChiefComplaintSection);
				if (result == null) result = caseSection(reasonForVisitAndChiefComplaintSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.HISTORY_OF_PRESENT_ILLNESS: {
				HistoryOfPresentIllness historyOfPresentIllness = (HistoryOfPresentIllness)theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) result = caseIHE_HistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) result = caseSection(historyOfPresentIllness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.PAST_MEDICAL_HISTORY_SECTION_CONSULT: {
				PastMedicalHistorySectionConsult pastMedicalHistorySectionConsult = (PastMedicalHistorySectionConsult)theEObject;
				T result = casePastMedicalHistorySectionConsult(pastMedicalHistorySectionConsult);
				if (result == null) result = caseSection(pastMedicalHistorySectionConsult);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CDTPackage.CDT_REGISTRY_DELEGATE: {
				CDTRegistryDelegate cdtRegistryDelegate = (CDTRegistryDelegate)theEObject;
				T result = caseCDTRegistryDelegate(cdtRegistryDelegate);
				if (result == null) result = caseRegistryDelegate(cdtRegistryDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History And Physical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History And Physical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryAndPhysical(HistoryAndPhysical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consultation Note</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsultationNote(ConsultationNote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Three Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Three Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelThreeConformance(LevelThreeConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForReferralSection(ReasonForReferralSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit Section Consult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitSectionConsult(ReasonForVisitSectionConsult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitSection(ReasonForVisitSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintSection(ChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Visit And Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Visit And Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForVisitAndChiefComplaintSection(ReasonForVisitAndChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Past Medical History Section Consult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Past Medical History Section Consult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePastMedicalHistorySectionConsult(PastMedicalHistorySectionConsult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level One Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level One Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelOneConformance(LevelOneConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Level Two Conformance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Level Two Conformance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLevelTwoConformance(LevelTwoConformance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Examination Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Examination Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExaminationSection(PhysicalExaminationSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Past Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Past Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePastMedicalHistorySection(PastMedicalHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralStatusSection(GeneralStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Findings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Findings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticFindings(DiagnosticFindings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSection(VitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentSection(AssessmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanSection(PlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDTRegistryDelegate(CDTRegistryDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HistoryOfPresentIllness(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistryDelegate(RegistryDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CDTSwitch
