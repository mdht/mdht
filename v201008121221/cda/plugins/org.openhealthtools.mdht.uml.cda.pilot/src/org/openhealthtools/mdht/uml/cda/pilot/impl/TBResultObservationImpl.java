/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.pilot.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultObservationImpl;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNPackage;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;
import org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TB Result Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TBResultObservationImpl extends ResultObservationImpl implements TBResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TBResultObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TBPNPackage.Literals.TB_RESULT_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTBResultObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultObservationOperations.validateTBResultObservationClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultObservationOperations.validateResultObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultObservationOperations.validateResultObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultObservationStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TBResultObservationOperations.validateResultObservationStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TBResultObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //TBResultObservationImpl
