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
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultObservationImpl extends ObservationImpl implements ResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.RESULT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultObservation_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationOperations.ResultObservation_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultObservation_moodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationOperations.ResultObservation_moodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultObservation_id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationOperations.ResultObservation_id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultObservation_effectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationOperations.ResultObservation_effectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ResultObservation_value(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultObservationOperations.ResultObservation_value(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ResultObservationImpl
