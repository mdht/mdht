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

import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;

import org.openhealthtools.mdht.uml.cda.ccd.operations.AuthorizationActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authorization Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AuthorizationActivityImpl extends ActImpl implements AuthorizationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorizationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.AUTHORIZATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AuthorizationActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.AuthorizationActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AuthorizationActivity_classCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.AuthorizationActivity_classCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AuthorizationActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.AuthorizationActivity_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AuthorizationActivity_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AuthorizationActivityOperations.AuthorizationActivity_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizationActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AuthorizationActivityImpl
