/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentAndPlanSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.AssessmentSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.ChiefComplaintSectionProcNote;
import org.openhealthtools.mdht.uml.cda.cdt.ObjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ProgressNote;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.SubjectiveSection;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ProgressNoteOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProgressNoteImpl extends GeneralHeaderConstraintsImpl implements ProgressNote {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.PROGRESS_NOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteBothAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteBothAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEvent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEvent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasServiceEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasComponentOfElement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasComponentOfElement(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterEffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteHasEncompassingEncounterFacilityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteHasEncompassingEncounterFacilityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteChiefComplaintSectionProcNote(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteChiefComplaintSectionProcNote(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteObjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteObjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNotePhysicalExaminationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNotePhysicalExaminationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteReviewOfSystemsSectionIHE(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteReviewOfSystemsSectionIHE(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgressNoteSubjectiveSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateProgressNoteSubjectiveSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSectionProcNote getAssessmentAndPlanSection() {
		return ProgressNoteOperations.getAssessmentAndPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentSectionProcNote getAssessmentSection() {
		return ProgressNoteOperations.getAssessmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanSection() {
		return ProgressNoteOperations.getPlanSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection getAlertsSection() {
		return ProgressNoteOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChiefComplaintSectionProcNote getChiefComplaintSection() {
		return ProgressNoteOperations.getChiefComplaintSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ProgressNoteOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectiveSection getObjectiveSection() {
		return ProgressNoteOperations.getObjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExaminationSection getPhysicalExaminationSection() {
		return ProgressNoteOperations.getPhysicalExaminationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return ProgressNoteOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return ProgressNoteOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ProgressNoteOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE getReviewOfSystemsSection() {
		return ProgressNoteOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectiveSection getSubjectiveSection() {
		return ProgressNoteOperations.getSubjectiveSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNoteOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProgressNoteImpl
