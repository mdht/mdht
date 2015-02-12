/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
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
	public boolean validateCoverageActivityInformationSource(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityInformationSource(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivitySequenceNumber(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivitySequenceNumber(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityStatusCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityStatusCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoverageActivityPolicyActivity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CoverageActivityOperations.validateCoverageActivityPolicyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyActivity> getPolicyActivities() {
		return CoverageActivityOperations.getPolicyActivities(this);
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
