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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;

import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity#ProcedureActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity#ProcedureActivity_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity#ProcedureActivity_id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity#ProcedureActivity_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity#ProcedureActivity_effectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcedureActivityOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcedureActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #ProcedureActivity_templateId(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_templateId(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.29')";

	/**
	 * The cached OCL invariant for the '{@link #ProcedureActivity_templateId(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_templateId(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.29')
	 * @param procedureActivity The receiving '<em><b>Procedure Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProcedureActivity_templateId(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY);
			try {
				PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURE_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProcedureActivity_templateId"),
						 new Object [] { procedureActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProcedureActivity_moodCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_moodCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #ProcedureActivity_moodCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_moodCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param procedureActivity The receiving '<em><b>Procedure Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProcedureActivity_moodCode(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY);
			try {
				PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURE_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("ProcedureActivity_moodCode"),
						 new Object [] { procedureActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProcedureActivity_id(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_id(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #ProcedureActivity_id(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_id(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param procedureActivity The receiving '<em><b>Procedure Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProcedureActivity_id(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY);
			try {
				PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURE_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("ProcedureActivity_id"),
						 new Object [] { procedureActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProcedureActivity_statusCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_statusCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.1.11.20.15')";

	/**
	 * The cached OCL invariant for the '{@link #ProcedureActivity_statusCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_statusCode(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.1.11.20.15')
	 * @param procedureActivity The receiving '<em><b>Procedure Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProcedureActivity_statusCode(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY);
			try {
				PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURE_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("ProcedureActivity_statusCode"),
						 new Object [] { procedureActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #ProcedureActivity_effectiveTime(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_effectiveTime(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #ProcedureActivity_effectiveTime(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Procedure Activity effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcedureActivity_effectiveTime(ProcedureActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param procedureActivity The receiving '<em><b>Procedure Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean ProcedureActivity_effectiveTime(ProcedureActivity procedureActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROCEDURE_ACTIVITY);
			try {
				PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(PROCEDURE_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(procedureActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROCEDURE_ACTIVITY__PROCEDURE_ACTIVITY_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("ProcedureActivity_effectiveTime"),
						 new Object [] { procedureActivity }));
			}
			return false;
		}
		return true;
	}

} // ProcedureActivityOperations