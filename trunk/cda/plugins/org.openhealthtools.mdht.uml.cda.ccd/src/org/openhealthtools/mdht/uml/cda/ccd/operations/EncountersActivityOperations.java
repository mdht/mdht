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
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.EncounterOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#EncountersActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#EncountersActivity_id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#EncountersActivity_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity#EncountersActivity_effectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersActivityOperations extends EncounterOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #EncountersActivity_templateId(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_templateId(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.21')";

	/**
	 * The cached OCL invariant for the '{@link #EncountersActivity_templateId(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_templateId(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.21')
	 * @param encountersActivity The receiving '<em><b>Encounters Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EncountersActivity_templateId(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_ACTIVITY);
			try {
				ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ENCOUNTERS_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("EncountersActivity_templateId"),
						 new Object [] { encountersActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EncountersActivity_id(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_id(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #EncountersActivity_id(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_id(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param encountersActivity The receiving '<em><b>Encounters Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EncountersActivity_id(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_ACTIVITY);
			try {
				ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ENCOUNTERS_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("EncountersActivity_id"),
						 new Object [] { encountersActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EncountersActivity_code(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_code(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.1.11.13955' and value.codeSystemName = 'EncounterCode')";

	/**
	 * The cached OCL invariant for the '{@link #EncountersActivity_code(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_code(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.1.11.13955' and value.codeSystemName = 'EncounterCode')
	 * @param encountersActivity The receiving '<em><b>Encounters Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EncountersActivity_code(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_ACTIVITY);
			try {
				ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ENCOUNTERS_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_CODE,
						 CCDPlugin.INSTANCE.getString("EncountersActivity_code"),
						 new Object [] { encountersActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EncountersActivity_effectiveTime(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_effectiveTime(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #EncountersActivity_effectiveTime(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Encounters Activity effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EncountersActivity_effectiveTime(EncountersActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param encountersActivity The receiving '<em><b>Encounters Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EncountersActivity_effectiveTime(EncountersActivity encountersActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ENCOUNTERS_ACTIVITY);
			try {
				ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encountersActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ENCOUNTERS_ACTIVITY__ENCOUNTERS_ACTIVITY_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("EncountersActivity_effectiveTime"),
						 new Object [] { encountersActivity }));
			}
			return false;
		}
		return true;
	}

} // EncountersActivityOperations