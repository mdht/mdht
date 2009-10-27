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

import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Verification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#AdvanceDirectiveVerification_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#AdvanceDirectiveVerification_typeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#AdvanceDirectiveVerification_time(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveVerificationOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveVerificationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.58')";

	/**
	 * The cached OCL invariant for the '{@link #AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.58')
	 * @param advanceDirectiveVerification The receiving '<em><b>Advance Directive Verification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdvanceDirectiveVerification_templateId(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerification_templateId"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::VRF";

	/**
	 * The cached OCL invariant for the '{@link #AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::VRF
	 * @param advanceDirectiveVerification The receiving '<em><b>Advance Directive Verification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdvanceDirectiveVerification_typeCode(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerification_typeCode"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #AdvanceDirectiveVerification_time(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_time(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #AdvanceDirectiveVerification_time(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Advance Directive Verification time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AdvanceDirectiveVerification_time(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.time.oclIsUndefined()
	 * @param advanceDirectiveVerification The receiving '<em><b>Advance Directive Verification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean AdvanceDirectiveVerification_time(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TIME,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerification_time"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveVerificationOperations