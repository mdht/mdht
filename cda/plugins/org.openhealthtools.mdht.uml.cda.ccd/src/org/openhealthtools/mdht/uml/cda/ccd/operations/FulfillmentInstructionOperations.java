/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fulfillment Instruction</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction#FulfillmentInstruction_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction#FulfillmentInstruction_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FulfillmentInstructionOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FulfillmentInstructionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #FulfillmentInstruction_templateId(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FulfillmentInstruction_templateId(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.43')";

	/**
	 * The cached OCL invariant for the '{@link #FulfillmentInstruction_templateId(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FulfillmentInstruction_templateId(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.43')
	 * @param fulfillmentInstruction The receiving '<em><b>Fulfillment Instruction</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FulfillmentInstruction_templateId(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FULFILLMENT_INSTRUCTION);
			try {
				FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fulfillmentInstruction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("FulfillmentInstruction_templateId"),
						 new Object [] { fulfillmentInstruction }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #FulfillmentInstruction_moodCode(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FulfillmentInstruction_moodCode(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::INT";

	/**
	 * The cached OCL invariant for the '{@link #FulfillmentInstruction_moodCode(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Fulfillment Instruction mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FulfillmentInstruction_moodCode(FulfillmentInstruction, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::INT
	 * @param fulfillmentInstruction The receiving '<em><b>Fulfillment Instruction</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean FulfillmentInstruction_moodCode(FulfillmentInstruction fulfillmentInstruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.FULFILLMENT_INSTRUCTION);
			try {
				FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(fulfillmentInstruction)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.FULFILLMENT_INSTRUCTION__FULFILLMENT_INSTRUCTION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("FulfillmentInstruction_moodCode"),
						 new Object [] { fulfillmentInstruction }));
			}
			return false;
		}
		return true;
	}

} // FulfillmentInstructionOperations