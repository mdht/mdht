/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ContinuityOfCareDocumentOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuity Of Care Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ContinuityOfCareDocumentImpl extends ClinicalDocumentImpl implements ContinuityOfCareDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuityOfCareDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.CONTINUITY_OF_CARE_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentServiceEventRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentServiceEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentServiceEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentNoTemplateIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentNoTemplateIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentOneOrTwoRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentOneOrTwoRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasAssignedAuthorNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentHasInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentHasInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentProblemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProblemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentFamilyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFamilyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentSocialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentSocialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAlertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAlertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentResultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentResultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentProceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentProceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentEncountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentEncountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentPlanOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPlanOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentImmunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentImmunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentVitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentVitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentMedicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicalEquipmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentFunctionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentFunctionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentAdvanceDirectivesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentAdvanceDirectivesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentPayersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPayersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContinuityOfCareDocumentPurposeSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentPurposeSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemSection getProblemSection() {
		return ContinuityOfCareDocumentOperations.getProblemSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FamilyHistorySection getFamilyHistorySection() {
		return ContinuityOfCareDocumentOperations.getFamilyHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SocialHistorySection getSocialHistorySection() {
		return ContinuityOfCareDocumentOperations.getSocialHistorySection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertsSection getAlertsSection() {
		return ContinuityOfCareDocumentOperations.getAlertsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsSection getMedicationsSection() {
		return ContinuityOfCareDocumentOperations.getMedicationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultsSection getResultsSection() {
		return ContinuityOfCareDocumentOperations.getResultsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProceduresSection getProceduresSection() {
		return ContinuityOfCareDocumentOperations.getProceduresSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncountersSection getEncountersSection() {
		return ContinuityOfCareDocumentOperations.getEncountersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareSection getPlanOfCareSection() {
		return ContinuityOfCareDocumentOperations.getPlanOfCareSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImmunizationsSection getImmunizationsSection() {
		return ContinuityOfCareDocumentOperations.getImmunizationsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsSection getVitalSignsSection() {
		return ContinuityOfCareDocumentOperations.getVitalSignsSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalEquipmentSection getMedicalEquipmentSection() {
		return ContinuityOfCareDocumentOperations.getMedicalEquipmentSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection getFunctionalStatusSection() {
		return ContinuityOfCareDocumentOperations.getFunctionalStatusSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectivesSection getAdvanceDirectivesSection() {
		return ContinuityOfCareDocumentOperations.getAdvanceDirectivesSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayersSection getPayersSection() {
		return ContinuityOfCareDocumentOperations.getPayersSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeSection getPurposeSection() {
		return ContinuityOfCareDocumentOperations.getPurposeSection(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuityOfCareDocument init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ContinuityOfCareDocumentImpl
