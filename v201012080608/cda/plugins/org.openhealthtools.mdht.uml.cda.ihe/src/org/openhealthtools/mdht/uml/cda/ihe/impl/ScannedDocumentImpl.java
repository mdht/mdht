/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ScannedDocumentOperations;
import org.openhealthtools.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scanned Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ScannedDocumentImpl extends ClinicalDocumentImpl implements ScannedDocument {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScannedDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.SCANNED_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTypeIdFixed(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTypeIdFixed(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasOneRecordTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasOneRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasAssignedAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentPatientRoleId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentPatientRoleId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientRoleAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientRoleAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientGenderCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientGenderCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasPatientBirthYear(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasPatientBirthYear(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasOriginalAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasOriginalAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasScanningDevice(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasScanningDevice(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasScanDataEnterer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasScanDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasRepresentedCustodianOrganizationName(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationName(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasRepresentedCustodianOrganizationAddr(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasRepresentedCustodianOrganizationAddr(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentLegalAuthenticatorAssignedEntityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentLegalAuthenticatorAssignedEntityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBody(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBody(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyBinaryText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyBinaryText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyTextMediaType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextMediaType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentHasNonXMLBodyTextRepresentation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentHasNonXMLBodyTextRepresentation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentConfidentialityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentConfidentialityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentLanguageCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScannedDocumentTypeId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ScannedDocumentOperations.validateScannedDocumentTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScannedDocument init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ScannedDocumentImpl
