/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionEntryOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ProblemEntryImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConditionEntryImpl extends ProblemEntryImpl implements ConditionEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.CONDITION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasOnsetDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasOnsetDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryHasUnknownResolutionDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionEntryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateConditionEntryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemEntryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ConditionEntryOperations.validateProblemEntryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEntry init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ConditionEntryImpl
