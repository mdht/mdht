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
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#PolicyActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#PolicyActivity_classCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#PolicyActivity_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#PolicyActivity_id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#PolicyActivity_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PolicyActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #PolicyActivity_templateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_templateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.26')";

	/**
	 * The cached OCL invariant for the '{@link #PolicyActivity_templateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_templateId(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.26')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PolicyActivity_templateId(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PolicyActivity_templateId"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PolicyActivity_classCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_classCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #PolicyActivity_classCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_classCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PolicyActivity_classCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivity_classCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PolicyActivity_moodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_moodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #PolicyActivity_moodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_moodCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PolicyActivity_moodCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivity_moodCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PolicyActivity_id(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_id(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #PolicyActivity_id(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_id(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PolicyActivity_id(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("PolicyActivity_id"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #PolicyActivity_statusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_statusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #PolicyActivity_statusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Policy Activity status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PolicyActivity_statusCode(PolicyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param policyActivity The receiving '<em><b>Policy Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean PolicyActivity_statusCode(PolicyActivity policyActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.POLICY_ACTIVITY);
			try {
				POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(policyActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.POLICY_ACTIVITY__POLICY_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("PolicyActivity_statusCode"),
						 new Object [] { policyActivity }));
			}
			return false;
		}
		return true;
	}

} // PolicyActivityOperations