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
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PolicyActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PolicyActivityImpl extends ActImpl implements PolicyActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.POLICY_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PolicyActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.PolicyActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PolicyActivity_classCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.PolicyActivity_classCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PolicyActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.PolicyActivity_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PolicyActivity_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.PolicyActivity_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PolicyActivity_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PolicyActivityOperations.PolicyActivity_statusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolicyActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PolicyActivityImpl
