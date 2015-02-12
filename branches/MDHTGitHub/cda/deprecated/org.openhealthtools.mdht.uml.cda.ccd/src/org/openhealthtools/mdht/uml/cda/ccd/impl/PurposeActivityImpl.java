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
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PurposeActivityOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PurposeActivityImpl extends ActImpl implements PurposeActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PURPOSE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityHasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityHasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityReasonType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityReasonType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePurposeActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.validatePurposeActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurposeActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PurposeActivityImpl
