/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalPastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalReviewOfSystemsSectionIHE(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section IHE</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalPhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getPhysicalExaminationSection() <em>Get Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSection))"+
"   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection))"+
"      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSection))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection)))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalAssessmentAndPlan(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalAssessmentAndPlan"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection)) in"+
"  let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection))"+
"    in (assessmentExists or planExists) implies (assessmentExists and planExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSection)) in
	 *   let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PlanSection))
	 *     in (assessmentExists or planExists) implies (assessmentExists and planExists)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalBothAssessmentAndPlan(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalBothAssessmentAndPlan"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitAndChiefComplaintSection))"+
"   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection))"+
"      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitAndChiefComplaintSection))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection)))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalReasonForVisitAndChiefComplaint"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let reasonExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection)) in"+
"  let complaintExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection))"+
"    in (reasonExists or complaintExists) implies (reasonExists and complaintExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let reasonExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReasonForVisitSection)) in
	 *   let complaintExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSection))
	 *     in (reasonExists or complaintExists) implies (reasonExists and complaintExists)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalBothReasonForVisitAndChiefComplaint"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__GENERAL_HEADER_CONSTRAINTS_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalHistoryOfPresentIllness(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalHistoryOfPresentIllness"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalPastMedicalHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalPastMedicalHistorySection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalMedicationsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalMedicationsSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalAlertsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_ALERTS_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalAlertsSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalSocialHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalSocialHistorySection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalFamilyHistorySection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalFamilyHistorySection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalReviewOfSystemsSectionIHE(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section IHE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReviewOfSystemsSectionIHE(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalReviewOfSystemsSectionIHE(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section IHE</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalReviewOfSystemsSectionIHE(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalReviewOfSystemsSectionIHE(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION_IHE,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalReviewOfSystemsSectionIHE"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalPhysicalExaminationSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalPhysicalExaminationSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalVitalSignsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalVitalSignsSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalGeneralStatusSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalGeneralStatusSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalDiagnosticFindings(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalDiagnosticFindings"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProblemSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalProblemSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROBLEM_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalProblemSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalProceduresSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_PROCEDURES_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalProceduresSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateHistoryAndPhysicalImmunizationsSection(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION,
						 CDTPlugin.INSTANCE.getString("HistoryAndPhysicalImmunizationsSection"),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness(HistoryAndPhysical) <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))->asSequence()->first().oclAsType(cdt::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness(HistoryAndPhysical) <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::HistoryOfPresentIllness))->asSequence()->first().oclAsType(cdt::HistoryOfPresentIllness)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  HistoryOfPresentIllness getHistoryOfPresentIllness(HistoryAndPhysical historyAndPhysical) {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(76));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (HistoryOfPresentIllness) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPastMedicalHistorySection(HistoryAndPhysical) <em>Get Past Medical History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySection))->asSequence()->first().oclAsType(cdt::PastMedicalHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getPastMedicalHistorySection(HistoryAndPhysical) <em>Get Past Medical History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPastMedicalHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PastMedicalHistorySection))->asSequence()->first().oclAsType(cdt::PastMedicalHistorySection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PastMedicalHistorySection getPastMedicalHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(77));
			try {
				GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAST_MEDICAL_HISTORY_SECTION__EOCL_QRY);
		return (PastMedicalHistorySection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(HistoryAndPhysical) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->first().oclAsType(ccd::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(HistoryAndPhysical) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->first().oclAsType(ccd::MedicationsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationsSection getMedicationsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(78));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(HistoryAndPhysical) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))->asSequence()->first().oclAsType(ccd::AlertsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(HistoryAndPhysical) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))->asSequence()->first().oclAsType(ccd::AlertsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AlertsSection getAlertsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_ALERTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(79));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AlertsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(HistoryAndPhysical) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))->asSequence()->first().oclAsType(ccd::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistorySection(HistoryAndPhysical) <em>Get Social History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::SocialHistorySection))->asSequence()->first().oclAsType(ccd::SocialHistorySection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SocialHistorySection getSocialHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(80));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistorySection(HistoryAndPhysical) <em>Get Family History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))->asSequence()->first().oclAsType(ccd::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistorySection(HistoryAndPhysical) <em>Get Family History Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistorySection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::FamilyHistorySection))->asSequence()->first().oclAsType(ccd::FamilyHistorySection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  FamilyHistorySection getFamilyHistorySection(HistoryAndPhysical historyAndPhysical) {
		if (GET_FAMILY_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(81));
			try {
				GET_FAMILY_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY_SECTION__EOCL_QRY);
		return (FamilyHistorySection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(HistoryAndPhysical) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(cdt::ReviewOfSystemsSectionIHE)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(HistoryAndPhysical) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(cdt::ReviewOfSystemsSectionIHE)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ReviewOfSystemsSectionIHE getReviewOfSystemsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(82));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSectionIHE) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExaminationSection(HistoryAndPhysical) <em>Get Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))->asSequence()->first().oclAsType(cdt::PhysicalExaminationSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExaminationSection(HistoryAndPhysical) <em>Get Physical Examination Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))->asSequence()->first().oclAsType(cdt::PhysicalExaminationSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PhysicalExaminationSection getPhysicalExaminationSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(83));
			try {
				GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY);
		return (PhysicalExaminationSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(HistoryAndPhysical) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))->asSequence()->first().oclAsType(cdt::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(HistoryAndPhysical) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))->asSequence()->first().oclAsType(cdt::VitalSignsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  VitalSignsSection getVitalSignsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(84));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralStatusSection(HistoryAndPhysical) <em>Get General Status Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_STATUS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))->asSequence()->first().oclAsType(cdt::GeneralStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralStatusSection(HistoryAndPhysical) <em>Get General Status Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralStatusSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_STATUS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::GeneralStatusSection))->asSequence()->first().oclAsType(cdt::GeneralStatusSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  GeneralStatusSection getGeneralStatusSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_GENERAL_STATUS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(85));
			try {
				GET_GENERAL_STATUS_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_STATUS_SECTION__EOCL_QRY);
		return (GeneralStatusSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDiagnosticFindings(HistoryAndPhysical) <em>Get Diagnostic Findings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DIAGNOSTIC_FINDINGS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))->asSequence()->first().oclAsType(ccd::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getDiagnosticFindings(HistoryAndPhysical) <em>Get Diagnostic Findings</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticFindings(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DIAGNOSTIC_FINDINGS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))->asSequence()->first().oclAsType(ccd::ResultsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ResultsSection getDiagnosticFindings(HistoryAndPhysical historyAndPhysical) {
		if (GET_DIAGNOSTIC_FINDINGS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(86));
			try {
				GET_DIAGNOSTIC_FINDINGS__EOCL_QRY = helper.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DIAGNOSTIC_FINDINGS__EOCL_QRY);
		return (ResultsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(HistoryAndPhysical) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))->asSequence()->first().oclAsType(ccd::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(HistoryAndPhysical) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))->asSequence()->first().oclAsType(ccd::ProblemSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemSection getProblemSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(87));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(HistoryAndPhysical) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))->asSequence()->first().oclAsType(ccd::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(HistoryAndPhysical) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProceduresSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProceduresSection))->asSequence()->first().oclAsType(ccd::ProceduresSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProceduresSection getProceduresSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(88));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizationsSection(HistoryAndPhysical) <em>Get Immunizations Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))->asSequence()->first().oclAsType(ccd::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizationsSection(HistoryAndPhysical) <em>Get Immunizations Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizationsSection(HistoryAndPhysical)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ImmunizationsSection))->asSequence()->first().oclAsType(ccd::ImmunizationsSection)
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ImmunizationsSection getImmunizationsSection(HistoryAndPhysical historyAndPhysical) {
		if (GET_IMMUNIZATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL, CDTPackage.Literals.HISTORY_AND_PHYSICAL.getEAllOperations().get(89));
			try {
				GET_IMMUNIZATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS_SECTION__EOCL_QRY);
		return (ImmunizationsSection) query.evaluate(historyAndPhysical);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.2')
	 * @param historyAndPhysical The receiving '<em><b>History And Physical</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(HistoryAndPhysical historyAndPhysical, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.HISTORY_AND_PHYSICAL);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(historyAndPhysical)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.HISTORY_AND_PHYSICAL__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(historyAndPhysical, context) }),
						 new Object [] { historyAndPhysical }));
			}
			return false;
		}
		return true;
	}

} // HistoryAndPhysicalOperations