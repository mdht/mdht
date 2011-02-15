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
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.util.DatatypesValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>ST</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateThumbnail(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.ST#validateIntegrityCheck(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integrity Check</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class STOperations extends EDOperations
{
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected STOperations() {
		super();
	}

    /**
	 * The cached OCL expression body for the '{@link #validateThumbnail(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail</em>}' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateThumbnail(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static final String VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.thumbnail.oclIsUndefined()";

    /**
	 * The cached OCL invariant for the '{@link #validateThumbnail(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Thumbnail</em>}' invariant operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateThumbnail(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static Constraint VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.thumbnail.oclIsUndefined()
	 * @param st The receiving '<em><b>ST</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
    public static  boolean validateThumbnail(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		if (VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.ST);
			try {
				VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_THUMBNAIL__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(st)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.ST__THUMBNAIL,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateThumbnail", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(st, context) }),
						 new Object [] { st }));
			}
			return false;
		}
		return true;
	}

    /**
	 * The cached OCL expression body for the '{@link #validateReference(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reference</em>}' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateReference(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static final String VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.reference.oclIsUndefined()";

    /**
	 * The cached OCL invariant for the '{@link #validateReference(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateReference(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static Constraint VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.reference.oclIsUndefined()
	 * @param st The receiving '<em><b>ST</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
    public static  boolean validateReference(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		if (VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.ST);
			try {
				VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(st)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.ST__REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(st, context) }),
						 new Object [] { st }));
			}
			return false;
		}
		return true;
	}

    /**
	 * The cached OCL expression body for the '{@link #validateIntegrityCheck(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integrity Check</em>}' operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateIntegrityCheck(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static final String VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.integrityCheck.oclIsUndefined()";

    /**
	 * The cached OCL invariant for the '{@link #validateIntegrityCheck(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Integrity Check</em>}' invariant operation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #validateIntegrityCheck(ST, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
    protected static Constraint VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.integrityCheck.oclIsUndefined()
	 * @param st The receiving '<em><b>ST</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
    public static  boolean validateIntegrityCheck(ST st, DiagnosticChain diagnostics, Map<Object, Object> context)
    {
		if (VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(DatatypesPackage.Literals.ST);
			try {
				VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTEGRITY_CHECK__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(st)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DatatypesValidator.DIAGNOSTIC_SOURCE,
						 DatatypesValidator.ST__INTEGRITY_CHECK,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateIntegrityCheck", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(st, context) }),
						 new Object [] { st }));
			}
			return false;
		}
		return true;
	}

} // STOperations