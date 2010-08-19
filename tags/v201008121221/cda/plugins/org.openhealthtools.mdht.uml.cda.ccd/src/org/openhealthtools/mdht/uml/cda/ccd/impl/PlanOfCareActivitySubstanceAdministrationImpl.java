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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PlanOfCareActivitySubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.cda.impl.SubstanceAdministrationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan Of Care Activity Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PlanOfCareActivitySubstanceAdministrationImpl extends SubstanceAdministrationImpl implements PlanOfCareActivitySubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlanOfCareActivitySubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministrationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministrationId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlanOfCareActivitySubstanceAdministrationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanOfCareActivitySubstanceAdministration init() {
    		CDAUtil.init(this);
    		return this;
	}
} //PlanOfCareActivitySubstanceAdministrationImpl
