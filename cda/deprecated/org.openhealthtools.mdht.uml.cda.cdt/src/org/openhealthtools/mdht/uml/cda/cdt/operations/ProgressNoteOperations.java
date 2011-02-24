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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Progress Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasComponentOfElement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteHasEncompassingEncounterFacilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteChiefComplaintSectionProcNote(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section Proc Note</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteObjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNotePhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteReviewOfSystemsSectionIHE(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section IHE</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateProgressNoteSubjectiveSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAssessmentAndPlanSection() <em>Get Assessment And Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAssessmentSection() <em>Get Assessment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getPlanSection() <em>Get Plan Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getChiefComplaintSection() <em>Get Chief Complaint Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getObjectiveSection() <em>Get Objective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getPhysicalExaminationSection() <em>Get Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#getSubjectiveSection() <em>Get Subjective Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ProgressNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgressNoteOperations extends GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNoteOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))"+
"   xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))"+
"      and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))
	 *    xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))
	 *       and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection)))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteAssessmentAndPlan(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_ASSESSMENT_AND_PLAN,
						 CDTPlugin.INSTANCE.getString("ProgressNoteAssessmentAndPlan"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote)) in"+
"  let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))"+
"    in (assessmentExists or planExists) implies (assessmentExists and planExists)";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Both Assessment And Plan</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteBothAssessmentAndPlan(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * let assessmentExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote)) in
	 *   let planExists : Boolean = self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))
	 *     in (assessmentExists or planExists) implies (assessmentExists and planExists)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteBothAssessmentAndPlan(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_BOTH_ASSESSMENT_AND_PLAN,
						 CDTPlugin.INSTANCE.getString("ProgressNoteBothAssessmentAndPlan"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() "+
"  and not doc.serviceEvent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEvent(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() 
	 *   and not doc.serviceEvent.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasServiceEvent(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasServiceEvent"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()"+
"  and doc.serviceEvent.code.code = '371532007' and doc.serviceEvent.code.codeSystem = '2.16.840.1.113883.6.96' )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()
	 *   and doc.serviceEvent.code.code = '371532007' and doc.serviceEvent.code.codeSystem = '2.16.840.1.113883.6.96' )
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasServiceEventCode(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_CODE,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasServiceEventCode"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()"+
" and not doc.serviceEvent.effectiveTime.oclIsUndefined() and not doc.serviceEvent.effectiveTime.low.oclIsUndefined() )";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Service Event Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasServiceEventEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.documentationOf->exists(doc : cda::DocumentationOf | not doc.oclIsUndefined() and not doc.serviceEvent.oclIsUndefined()
	 *  and not doc.serviceEvent.effectiveTime.oclIsUndefined() and not doc.serviceEvent.effectiveTime.low.oclIsUndefined() )
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasServiceEventEffectiveTime(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_SERVICE_EVENT_EFFECTIVE_TIME,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasServiceEventEffectiveTime"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Component Of Element</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasComponentOfElement(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasComponentOfElement(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_COMPONENT_OF_ELEMENT,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasComponentOfElement"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf.encompassingEncounter.id->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf.encompassingEncounter.id->notEmpty()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasEncompassingEncounterId(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_ID,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterId"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.encompassingEncounter.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.encompassingEncounter.effectiveTime.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasEncompassingEncounterEffectiveTime(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterEffectiveTime"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.componentOf.encompassingEncounter.effectiveTime.low.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Effective Time Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.componentOf.encompassingEncounter.effectiveTime.low.oclIsUndefined()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME_LOW,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterEffectiveTimeLow"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.componentOf.encompassingEncounter.location.healthCareFacility.id->notEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Has Encompassing Encounter Facility Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.componentOf.encompassingEncounter.location.healthCareFacility.id->notEmpty()
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteHasEncompassingEncounterFacilityId(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_HAS_ENCOMPASSING_ENCOUNTER_FACILITY_ID,
						 CDTPlugin.INSTANCE.getString("ProgressNoteHasEncompassingEncounterFacilityId"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Alerts Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteAlertsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteAlertsSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_ALERTS_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteAlertsSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteChiefComplaintSectionProcNote(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section Proc Note</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSectionProcNote(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSectionProcNote))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteChiefComplaintSectionProcNote(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Chief Complaint Section Proc Note</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteChiefComplaintSectionProcNote(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSectionProcNote))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteChiefComplaintSectionProcNote(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_CHIEF_COMPLAINT_SECTION_PROC_NOTE,
						 CDTPlugin.INSTANCE.getString("ProgressNoteChiefComplaintSectionProcNote"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Medications Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteMedicationsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteMedicationsSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_MEDICATIONS_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteMedicationsSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ObjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Objective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteObjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ObjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteObjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_OBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_OBJECTIVE_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteObjectiveSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Physical Examination Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNotePhysicalExaminationSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNotePhysicalExaminationSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_PHYSICAL_EXAMINATION_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNotePhysicalExaminationSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteProblemSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteProblemSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_PROBLEM_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteProblemSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteResultsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteResultsSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_RESULTS_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteResultsSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteVitalSignsSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteVitalSignsSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_VITAL_SIGNS_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteVitalSignsSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteReviewOfSystemsSectionIHE(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section IHE</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSectionIHE(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteReviewOfSystemsSectionIHE(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Review Of Systems Section IHE</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteReviewOfSystemsSectionIHE(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteReviewOfSystemsSectionIHE(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_REVIEW_OF_SYSTEMS_SECTION_IHE,
						 CDTPlugin.INSTANCE.getString("ProgressNoteReviewOfSystemsSectionIHE"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::SubjectiveSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Progress Note Subjective Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProgressNoteSubjectiveSection(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::SubjectiveSection))
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProgressNoteSubjectiveSection(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROGRESS_NOTE_SUBJECTIVE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__PROGRESS_NOTE_SUBJECTIVE_SECTION,
						 CDTPlugin.INSTANCE.getString("ProgressNoteSubjectiveSection"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))->asSequence()->first().oclAsType(cdt::AssessmentAndPlanSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentAndPlanSection(ProgressNote) <em>Get Assessment And Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentAndPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentAndPlanSectionProcNote))->asSequence()->first().oclAsType(cdt::AssessmentAndPlanSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AssessmentAndPlanSectionProcNote getAssessmentAndPlanSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(78));
			try {
				GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_AND_PLAN_SECTION__EOCL_QRY);
		return (AssessmentAndPlanSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSESSMENT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))->asSequence()->first().oclAsType(cdt::AssessmentSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getAssessmentSection(ProgressNote) <em>Get Assessment Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessmentSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSESSMENT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::AssessmentSectionProcNote))->asSequence()->first().oclAsType(cdt::AssessmentSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AssessmentSectionProcNote getAssessmentSection(ProgressNote progressNote) {
		if (GET_ASSESSMENT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(79));
			try {
				GET_ASSESSMENT_SECTION__EOCL_QRY = helper.createQuery(GET_ASSESSMENT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ASSESSMENT_SECTION__EOCL_QRY);
		return (AssessmentSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanSection(ProgressNote) <em>Get Plan Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))->asSequence()->first().oclAsType(ccd::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanSection(ProgressNote) <em>Get Plan Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::PlanOfCareSection))->asSequence()->first().oclAsType(ccd::PlanOfCareSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PlanOfCareSection getPlanSection(ProgressNote progressNote) {
		if (GET_PLAN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(80));
			try {
				GET_PLAN_SECTION__EOCL_QRY = helper.createQuery(GET_PLAN_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_SECTION__EOCL_QRY);
		return (PlanOfCareSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAlertsSection(ProgressNote) <em>Get Alerts Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALERTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))->asSequence()->first().oclAsType(ccd::AlertsSection)";

	/**
	 * The cached OCL query for the '{@link #getAlertsSection(ProgressNote) <em>Get Alerts Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlertsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALERTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::AlertsSection))->asSequence()->first().oclAsType(ccd::AlertsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  AlertsSection getAlertsSection(ProgressNote progressNote) {
		if (GET_ALERTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(81));
			try {
				GET_ALERTS_SECTION__EOCL_QRY = helper.createQuery(GET_ALERTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALERTS_SECTION__EOCL_QRY);
		return (AlertsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSectionProcNote))->asSequence()->first().oclAsType(cdt::ChiefComplaintSectionProcNote)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaintSection(ProgressNote) <em>Get Chief Complaint Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaintSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ChiefComplaintSectionProcNote))->asSequence()->first().oclAsType(cdt::ChiefComplaintSectionProcNote)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ChiefComplaintSectionProcNote getChiefComplaintSection(ProgressNote progressNote) {
		if (GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(82));
			try {
				GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT_SECTION__EOCL_QRY);
		return (ChiefComplaintSectionProcNote) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationsSection(ProgressNote) <em>Get Medications Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->first().oclAsType(ccd::MedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicationsSection(ProgressNote) <em>Get Medications Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::MedicationsSection))->asSequence()->first().oclAsType(ccd::MedicationsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationsSection getMedicationsSection(ProgressNote progressNote) {
		if (GET_MEDICATIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(83));
			try {
				GET_MEDICATIONS_SECTION__EOCL_QRY = helper.createQuery(GET_MEDICATIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATIONS_SECTION__EOCL_QRY);
		return (MedicationsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ObjectiveSection))->asSequence()->first().oclAsType(cdt::ObjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getObjectiveSection(ProgressNote) <em>Get Objective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ObjectiveSection))->asSequence()->first().oclAsType(cdt::ObjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ObjectiveSection getObjectiveSection(ProgressNote progressNote) {
		if (GET_OBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(84));
			try {
				GET_OBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_OBJECTIVE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OBJECTIVE_SECTION__EOCL_QRY);
		return (ObjectiveSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPhysicalExaminationSection(ProgressNote) <em>Get Physical Examination Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))->asSequence()->first().oclAsType(cdt::PhysicalExaminationSection)";

	/**
	 * The cached OCL query for the '{@link #getPhysicalExaminationSection(ProgressNote) <em>Get Physical Examination Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysicalExaminationSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::PhysicalExaminationSection))->asSequence()->first().oclAsType(cdt::PhysicalExaminationSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  PhysicalExaminationSection getPhysicalExaminationSection(ProgressNote progressNote) {
		if (GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(85));
			try {
				GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY = helper.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PHYSICAL_EXAMINATION_SECTION__EOCL_QRY);
		return (PhysicalExaminationSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ProgressNote) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))->asSequence()->first().oclAsType(ccd::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ProgressNote) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ProblemSection))->asSequence()->first().oclAsType(ccd::ProblemSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ProblemSection getProblemSection(ProgressNote progressNote) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(86));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ProgressNote) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))->asSequence()->first().oclAsType(ccd::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ProgressNote) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ccd::ResultsSection))->asSequence()->first().oclAsType(ccd::ResultsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ResultsSection getResultsSection(ProgressNote progressNote) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(87));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(ProgressNote) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))->asSequence()->first().oclAsType(cdt::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(ProgressNote) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::VitalSignsSection))->asSequence()->first().oclAsType(cdt::VitalSignsSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  VitalSignsSection getVitalSignsSection(ProgressNote progressNote) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(88));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(cdt::ReviewOfSystemsSectionIHE)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystemsSection(ProgressNote) <em>Get Review Of Systems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystemsSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::ReviewOfSystemsSectionIHE))->asSequence()->first().oclAsType(cdt::ReviewOfSystemsSectionIHE)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ReviewOfSystemsSectionIHE getReviewOfSystemsSection(ProgressNote progressNote) {
		if (GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(89));
			try {
				GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS_SECTION__EOCL_QRY);
		return (ReviewOfSystemsSectionIHE) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUBJECTIVE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::SubjectiveSection))->asSequence()->first().oclAsType(cdt::SubjectiveSection)";

	/**
	 * The cached OCL query for the '{@link #getSubjectiveSection(ProgressNote) <em>Get Subjective Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectiveSection(ProgressNote)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUBJECTIVE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(cdt::SubjectiveSection))->asSequence()->first().oclAsType(cdt::SubjectiveSection)
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  SubjectiveSection getSubjectiveSection(ProgressNote progressNote) {
		if (GET_SUBJECTIVE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CDTPackage.Literals.PROGRESS_NOTE, CDTPackage.Literals.PROGRESS_NOTE.getEAllOperations().get(90));
			try {
				GET_SUBJECTIVE_SECTION__EOCL_QRY = helper.createQuery(GET_SUBJECTIVE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUBJECTIVE_SECTION__EOCL_QRY);
		return (SubjectiveSection) query.evaluate(progressNote);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsTemplateId(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.21.1')
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsTemplateId(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(progressNote, context) }),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateGeneralHeaderConstraintsCode(ProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.6.1' and not value.code.oclIsUndefined())
	 * @param progressNote The receiving '<em><b>Progress Note</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateGeneralHeaderConstraintsCode(ProgressNote progressNote, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.PROGRESS_NOTE);
			try {
				VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(progressNote)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.PROGRESS_NOTE__GENERAL_HEADER_CONSTRAINTS_CODE,
						 CDTPlugin.INSTANCE.getString("GeneralHeaderConstraintsCode"),
						 new Object [] { progressNote }));
			}
			return false;
		}
		return true;
	}

} // ProgressNoteOperations