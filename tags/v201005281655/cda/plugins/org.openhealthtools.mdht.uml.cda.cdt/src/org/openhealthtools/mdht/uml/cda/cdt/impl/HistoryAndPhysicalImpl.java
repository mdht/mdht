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
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
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
	public boolean validateHistoryAndPhysicalBothAssessmentAndPlan(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothAssessmentAndPlan(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalBothPlanAndAssessment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothPlanAndAssessment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHistoryAndPhysicalCombinedPlanAndAssessment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalCombinedPlanAndAssessment(this, diagnostics, context);
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
	public boolean validateHistoryAndPhysicalReviewOfSystemsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReviewOfSystemsSection(this, diagnostics, context);
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
	public boolean validateHistoryAndPhysicalResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalOperations.validateHistoryAndPhysicalResultsSection(this, diagnostics, context);
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
