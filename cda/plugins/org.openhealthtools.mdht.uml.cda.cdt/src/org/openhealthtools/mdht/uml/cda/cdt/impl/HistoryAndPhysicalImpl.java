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
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalImpl extends GeneralHeaderConstraintsImpl implements HistoryAndPhysical {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CDTPackage.Literals.HISTORY_AND_PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalBothAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateGeneralHeaderConstraintsCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalHistoryOfPresentIllness(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHistoryOfPresentIllness(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalPastMedicalHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPastMedicalHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalReviewOfSystemsSectionIHE(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReviewOfSystemsSectionIHE(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalPhysicalExaminationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPhysicalExaminationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalGeneralStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalGeneralStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalDiagnosticFindings(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalDiagnosticFindings(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryOfPresentIllness getHistoryOfPresentIllness() {
		return HistoryAndPhysicalOperations.getHistoryOfPresentIllness(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PastMedicalHistorySection getPastMedicalHistorySection() {
		return HistoryAndPhysicalOperations.getPastMedicalHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return HistoryAndPhysicalOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection getAlertsSection() {
		return HistoryAndPhysicalOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return HistoryAndPhysicalOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return HistoryAndPhysicalOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReviewOfSystemsSectionIHE getReviewOfSystemsSection() {
		return HistoryAndPhysicalOperations.getReviewOfSystemsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalExaminationSection getPhysicalExaminationSection() {
		return HistoryAndPhysicalOperations.getPhysicalExaminationSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return HistoryAndPhysicalOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralStatusSection getGeneralStatusSection() {
		return HistoryAndPhysicalOperations.getGeneralStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getDiagnosticFindings() {
		return HistoryAndPhysicalOperations.getDiagnosticFindings(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return HistoryAndPhysicalOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return HistoryAndPhysicalOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return HistoryAndPhysicalOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysical init() {
    		CDAUtil.init(this);
    		return this;
	}
} //HistoryAndPhysicalImpl
