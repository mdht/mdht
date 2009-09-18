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
	public boolean ContinuityOfCareDocument_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_problemSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_problemSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_familyHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_familyHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_socialHistorySection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_socialHistorySection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_alertsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_alertsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_medicationSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_medicationSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_resultsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_resultsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_proceduresSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_proceduresSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_encountersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_encountersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_planOfCareSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_planOfCareSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_immunizationsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_immunizationsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_vitalSignsSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_vitalSignsSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_medicalEquipmentSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_medicalEquipmentSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_functionalStatusSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_functionalStatusSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_advanceDirectivesSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_advanceDirectivesSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_payersSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_payersSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ContinuityOfCareDocument_purposeSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ContinuityOfCareDocumentOperations.ContinuityOfCareDocument_purposeSection(this, diagnostics, context);
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
