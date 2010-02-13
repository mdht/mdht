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
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
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
	public boolean validateServiceEventRequired(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateServiceEventRequired(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateServiceEventClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoTemplateIdExtension(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateNoTemplateIdExtension(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOneOrTwoRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateOneOrTwoRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasAssignedAuthorNullFlavor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateHasAssignedAuthorNullFlavor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHasInformationRecipient(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateHasInformationRecipient(this, diagnostics, context);
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
	public boolean validateContinuityOfCareDocumentMedicationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.validateContinuityOfCareDocumentMedicationSection(this, diagnostics, context);
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
	public ContinuityOfCareDocument init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ContinuityOfCareDocumentImpl
