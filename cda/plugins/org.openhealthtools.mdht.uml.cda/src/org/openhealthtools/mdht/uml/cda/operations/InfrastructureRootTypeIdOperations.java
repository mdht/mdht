/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.CDAPackage;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.util.CDAValidator;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.ANYOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Infrastructure Root Type Id</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId#validateRedefinedRootroot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Rootroot</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId#validateRedefinedExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfrastructureRootTypeIdOperations extends ANYOperations {
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
	protected InfrastructureRootTypeIdOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRedefinedRootroot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Rootroot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedRootroot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.root='2.16.840.1.113883.1.3'";

	/**
	 * The cached OCL invariant for the '{@link #validateRedefinedRootroot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Rootroot</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedRootroot(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.root='2.16.840.1.113883.1.3'
	 * @param infrastructureRootTypeId The receiving '<em><b>Infrastructure Root Type Id</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateRedefinedRootroot(InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID);
			try {
				VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REDEFINED_ROOTROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infrastructureRootTypeId)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_ROOTROOT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateRedefinedRootroot", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infrastructureRootTypeId, context) }),
						 new Object [] { infrastructureRootTypeId }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.extension.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Redefined Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateRedefinedExtension(InfrastructureRootTypeId, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.extension.oclIsUndefined()
	 * @param infrastructureRootTypeId The receiving '<em><b>Infrastructure Root Type Id</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateRedefinedExtension(InfrastructureRootTypeId infrastructureRootTypeId, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CDAPackage.Literals.INFRASTRUCTURE_ROOT_TYPE_ID);
			try {
				VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_REDEFINED_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(infrastructureRootTypeId)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CDAValidator.DIAGNOSTIC_SOURCE,
						 CDAValidator.INFRASTRUCTURE_ROOT_TYPE_ID__REDEFINED_EXTENSION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateRedefinedExtension", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(infrastructureRootTypeId, context) }),
						 new Object [] { infrastructureRootTypeId }));
			}
			return false;
		}
		return true;
	}

} // InfrastructureRootTypeIdOperations