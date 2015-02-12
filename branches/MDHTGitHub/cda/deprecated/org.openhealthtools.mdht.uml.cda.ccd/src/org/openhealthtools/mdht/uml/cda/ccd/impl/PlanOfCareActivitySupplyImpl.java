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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivitySupplyOperations;
import org.openhealthtools.mdht.uml.cda.impl.SupplyImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity Supply</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivitySupplyImpl extends SupplyImpl implements PlanOfCareActivitySupply {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivitySupplyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUPPLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupplyMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyMoodCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupplyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupplyId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySupplyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySupplyOperations.validatePlanOfCareActivitySupplyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySupply init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PlanOfCareActivitySupplyImpl
