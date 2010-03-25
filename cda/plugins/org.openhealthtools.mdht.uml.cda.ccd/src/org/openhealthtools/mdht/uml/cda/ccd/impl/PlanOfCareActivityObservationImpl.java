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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivityObservationImpl extends ObservationImpl implements PlanOfCareActivityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivityObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservationMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityObservationOperations.validatePlanOfCareActivityObservationMoodCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityObservationOperations.validatePlanOfCareActivityObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityObservationOperations.validatePlanOfCareActivityObservationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityObservationOperations.validatePlanOfCareActivityObservationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivityObservation init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PlanOfCareActivityObservationImpl
