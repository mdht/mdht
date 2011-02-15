/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>CS</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystemName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateCodeSystemVersion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Version</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.CS#validateDisplayName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSOperations extends CVOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CSOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOriginalText(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOriginalText(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.originalText.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateOriginalText(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Original Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOriginalText(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.originalText.oclIsUndefined()
	 * @param cs The receiving '<em><b>CS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateOriginalText(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.CS);
			try {
				VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.CS__ORIGINAL_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateOriginalText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(cs, context) }),
						 new Object [] { cs }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeSystem(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystem(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.codeSystem.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeSystem(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystem(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.codeSystem.oclIsUndefined()
	 * @param cs The receiving '<em><b>CS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodeSystem(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.CS);
			try {
				VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.CS__CODE_SYSTEM,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCodeSystem", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(cs, context) }),
						 new Object [] { cs }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeSystemName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.codeSystemName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeSystemName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.codeSystemName.oclIsUndefined()
	 * @param cs The receiving '<em><b>CS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodeSystemName(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.CS);
			try {
				VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_SYSTEM_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.CS__CODE_SYSTEM_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCodeSystemName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(cs, context) }),
						 new Object [] { cs }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCodeSystemVersion(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Version</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemVersion(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.codeSystemVersion.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateCodeSystemVersion(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Code System Version</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCodeSystemVersion(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.codeSystemVersion.oclIsUndefined()
	 * @param cs The receiving '<em><b>CS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateCodeSystemVersion(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.CS);
			try {
				VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CODE_SYSTEM_VERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.CS__CODE_SYSTEM_VERSION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCodeSystemVersion", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(cs, context) }),
						 new Object [] { cs }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDisplayName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Display Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisplayName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.displayName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDisplayName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Display Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDisplayName(CS, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.displayName.oclIsUndefined()
	 * @param cs The receiving '<em><b>CS</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDisplayName(CS cs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.CS);
			try {
				VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DISPLAY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(cs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.CS__DISPLAY_NAME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateDisplayName", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(cs, context) }),
						 new Object [] { cs }));
			}
			return false;
		}
		return true;
	}

} // CSOperations