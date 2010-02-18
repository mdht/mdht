/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionEntryOperations extends ProblemEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionEntryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryCode(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.2')
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryCode(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_CODE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryCode"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryValue(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = element.oclAsType(datatypes::CD) in 
	 * value.codeSystem = '2.16.840.1.113883.3.88.12.3221.7.4')
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryValue(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_VALUE,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryValue"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConditionEntryEffectiveTime(ConditionEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param conditionEntry The receiving '<em><b>Condition Entry</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateConditionEntryEffectiveTime(ConditionEntry conditionEntry, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CONDITION_ENTRY);
			try {
				VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(conditionEntry)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HITSPValidator.DIAGNOSTIC_SOURCE,
						 HITSPValidator.CONDITION_ENTRY__CONDITION_ENTRY_EFFECTIVE_TIME,
						 HITSPPlugin.INSTANCE.getString("ConditionEntryEffectiveTime"),
						 new Object [] { conditionEntry }));
			}
			return false;
		}
		return true;
	}

} // ConditionEntryOperations