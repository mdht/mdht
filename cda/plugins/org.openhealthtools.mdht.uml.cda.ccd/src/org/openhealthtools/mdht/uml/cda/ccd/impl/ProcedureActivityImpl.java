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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityImpl extends ActImpl implements ProcedureActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PROCEDURE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcedureActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityOperations.ProcedureActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcedureActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityOperations.ProcedureActivity_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcedureActivity_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityOperations.ProcedureActivity_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcedureActivity_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityOperations.ProcedureActivity_statusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcedureActivity_effectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureActivityOperations.ProcedureActivity_effectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProcedureActivityImpl
