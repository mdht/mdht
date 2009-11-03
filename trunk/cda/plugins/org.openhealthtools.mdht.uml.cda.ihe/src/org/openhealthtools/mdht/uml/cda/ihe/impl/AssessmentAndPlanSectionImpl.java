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

import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;

import org.openhealthtools.mdht.uml.cda.ihe.operations.AssessmentAndPlanSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assessment And Plan Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AssessmentAndPlanSectionImpl extends SectionImpl implements AssessmentAndPlanSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssessmentAndPlanSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.ASSESSMENT_AND_PLAN_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssessmentAndPlanSection_templateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSectionOperations.AssessmentAndPlanSection_templateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AssessmentAndPlanSection_code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AssessmentAndPlanSectionOperations.AssessmentAndPlanSection_code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssessmentAndPlanSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //AssessmentAndPlanSectionImpl
