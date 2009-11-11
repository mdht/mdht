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
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveVerificationOperations;
import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveVerificationImpl extends Participant2Impl implements AdvanceDirectiveVerification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerificationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerificationTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveVerificationTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveVerificationOperations.validateAdvanceDirectiveVerificationTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveVerification init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AdvanceDirectiveVerificationImpl
