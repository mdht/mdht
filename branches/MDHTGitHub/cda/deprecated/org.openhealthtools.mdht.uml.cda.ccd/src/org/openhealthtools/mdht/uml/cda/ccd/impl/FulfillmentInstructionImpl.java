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
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.operations.FulfillmentInstructionOperations;
import org.openhealthtools.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fulfillment Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FulfillmentInstructionImpl extends ActImpl implements FulfillmentInstruction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CCDPackage.Literals.FULFILLMENT_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstructionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FulfillmentInstructionOperations.validateFulfillmentInstructionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFulfillmentInstructionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FulfillmentInstructionOperations.validateFulfillmentInstructionMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FulfillmentInstruction init() {
    		CDAUtil.init(this);
    		return this;
	}
} //FulfillmentInstructionImpl
