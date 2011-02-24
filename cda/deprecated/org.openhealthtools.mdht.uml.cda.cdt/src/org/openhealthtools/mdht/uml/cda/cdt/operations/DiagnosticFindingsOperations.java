/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperations;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Findings</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings#validateDiagnosticFindingsTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Findings Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticFindingsOperations extends ResultsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticFindingsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDiagnosticFindingsTitle(DiagnosticFindings, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Findings Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticFindingsTitle(DiagnosticFindings, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.title.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDiagnosticFindingsTitle(DiagnosticFindings, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diagnostic Findings Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDiagnosticFindingsTitle(DiagnosticFindings, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.title.oclIsUndefined()
	 * @param diagnosticFindings The receiving '<em><b>Diagnostic Findings</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateDiagnosticFindingsTitle(DiagnosticFindings diagnosticFindings, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDTPackage.Literals.DIAGNOSTIC_FINDINGS);
			try {
				VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DIAGNOSTIC_FINDINGS_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(diagnosticFindings)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDTValidator.DIAGNOSTIC_SOURCE,
						 CDTValidator.DIAGNOSTIC_FINDINGS__DIAGNOSTIC_FINDINGS_TITLE,
						 CDTPlugin.INSTANCE.getString("DiagnosticFindingsTitle"),
						 new Object [] { diagnosticFindings }));
			}
			return false;
		}
		return true;
	}

} // DiagnosticFindingsOperations