/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.AuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scan Original Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor#validateScanOriginalAuthorHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor#validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Represented Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanOriginalAuthor#validateScanOriginalAuthorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScanOriginalAuthorOperations extends AuthorOperations {
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
	protected ScanOriginalAuthorOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanOriginalAuthorHasAssignedAuthorId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorHasAssignedAuthorId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor.id->forAll(ident : datatypes::II |"+
"   not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanOriginalAuthorHasAssignedAuthorId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorHasAssignedAuthorId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.id->forAll(ident : datatypes::II |
	 *    not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined())
	 * @param scanOriginalAuthor The receiving '<em><b>Scan Original Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanOriginalAuthorHasAssignedAuthorId(ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_ORIGINAL_AUTHOR);
			try {
				VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanOriginalAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_ID,
						 IHEPlugin.INSTANCE.getString("ScanOriginalAuthorHasAssignedAuthorId"),
						 new Object [] { scanOriginalAuthor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Represented Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II |"+
"   not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Has Assigned Author Represented Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.assignedAuthor.representedOrganization.id->forAll(ident : datatypes::II |
	 *    not ident.root.oclIsUndefined() and not ident.extension.oclIsUndefined())
	 * @param scanOriginalAuthor The receiving '<em><b>Scan Original Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId(ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_ORIGINAL_AUTHOR);
			try {
				VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanOriginalAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_HAS_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION_ID,
						 IHEPlugin.INSTANCE.getString("ScanOriginalAuthorHasAssignedAuthorRepresentedOrganizationId"),
						 new Object [] { scanOriginalAuthor }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanOriginalAuthorTemplateId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorTemplateId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateScanOriginalAuthorTemplateId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scan Original Author Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanOriginalAuthorTemplateId(ScanOriginalAuthor, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.1')
	 * @param scanOriginalAuthor The receiving '<em><b>Scan Original Author</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanOriginalAuthorTemplateId(ScanOriginalAuthor scanOriginalAuthor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCAN_ORIGINAL_AUTHOR);
			try {
				VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanOriginalAuthor)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCAN_ORIGINAL_AUTHOR__SCAN_ORIGINAL_AUTHOR_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ScanOriginalAuthorTemplateId"),
						 new Object [] { scanOriginalAuthor }));
			}
			return false;
		}
		return true;
	}

} // ScanOriginalAuthorOperations