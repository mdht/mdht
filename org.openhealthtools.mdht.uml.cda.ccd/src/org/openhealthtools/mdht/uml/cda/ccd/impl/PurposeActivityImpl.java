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
	public boolean PurposeActivity_hasReason(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_hasReason(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_reasonType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_reasonType(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_classCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_classCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PurposeActivity_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PurposeActivityOperations.PurposeActivity_statusCode(this, diagnostics, context);
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
