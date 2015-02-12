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
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Verification</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification#validateAdvanceDirectiveVerificationTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveVerificationOperations extends ParticipationOperations {
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
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.58')";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.58')
	 * @param advanceDirectiveVerification The receiving '<em><b>Advance Directive Verification</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAdvanceDirectiveVerificationTemplateId(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerificationTemplateId"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::VRF";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateAdvanceDirectiveVerificationTypeCode(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TYPE_CODE,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerificationTypeCode"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Verification Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean validateAdvanceDirectiveVerificationTime(AdvanceDirectiveVerification advanceDirectiveVerification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ADVANCE_DIRECTIVE_VERIFICATION);
			try {
				VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ADVANCE_DIRECTIVE_VERIFICATION_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(advanceDirectiveVerification)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ADVANCE_DIRECTIVE_VERIFICATION__ADVANCE_DIRECTIVE_VERIFICATION_TIME,
						 CCDPlugin.INSTANCE.getString("AdvanceDirectiveVerificationTime"),
						 new Object [] { advanceDirectiveVerification }));
			}
			return false;
		}
		return true;
	}

} // AdvanceDirectiveVerificationOperations