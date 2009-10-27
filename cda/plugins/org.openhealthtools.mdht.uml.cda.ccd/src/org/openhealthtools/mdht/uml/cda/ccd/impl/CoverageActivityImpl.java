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
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.CoverageActivityOperations;

import org.openhealthtools.mdht.uml.cda.impl.ActImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coverage Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoverageActivityImpl extends ActImpl implements CoverageActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoverageActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.COVERAGE_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoverageActivity_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.CoverageActivity_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoverageActivity_classCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.CoverageActivity_classCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoverageActivity_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.CoverageActivity_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoverageActivity_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.CoverageActivity_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CoverageActivity_statusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.CoverageActivity_statusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity init() {
    		CDAUtil.init(this);
    		return this;
	}
} //CoverageActivityImpl
