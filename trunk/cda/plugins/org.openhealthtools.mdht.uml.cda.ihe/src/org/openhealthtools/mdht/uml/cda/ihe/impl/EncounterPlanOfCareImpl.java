/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivityEncounterOperations;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterPlanOfCareOperations;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encounter Plan Of Care</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EncounterPlanOfCareImpl extends EncounterEntryImpl implements EncounterPlanOfCare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterPlanOfCareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.ENCOUNTER_PLAN_OF_CARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterMoodCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterPlanOfCareOperations.validatePlanOfCareActivityEncounterTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivityEncounterMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivityEncounterOperations.validatePlanOfCareActivityEncounterMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncounterPlanOfCareMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EncounterPlanOfCareOperations.validateEncounterPlanOfCareMoodCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncounterPlanOfCare init() {
    		CDAUtil.init(this);
    		return this;
	}
} //EncounterPlanOfCareImpl
