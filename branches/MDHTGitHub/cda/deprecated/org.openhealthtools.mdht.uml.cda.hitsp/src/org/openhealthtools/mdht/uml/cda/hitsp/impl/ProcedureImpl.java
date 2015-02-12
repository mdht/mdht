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
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ProcedureOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.ProcedureEntryProcedureActivityProcedureImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProcedureImpl extends ProcedureEntryProcedureActivityProcedureImpl implements Procedure {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.PROCEDURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPProcedureHasCodeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateHITSPProcedureHasCodeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPProcedureHasCodeOriginalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateHITSPProcedureHasCodeOriginalText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPProcedurePerformerAssignedEntity(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateHITSPProcedurePerformerAssignedEntity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPProcedureTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateHITSPProcedureTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHITSPProcedureTargetSiteCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProcedureOperations.validateHITSPProcedureTargetSiteCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Procedure init() {
    		CDAUtil.init(this);
    		return this;
	}
} //ProcedureImpl
