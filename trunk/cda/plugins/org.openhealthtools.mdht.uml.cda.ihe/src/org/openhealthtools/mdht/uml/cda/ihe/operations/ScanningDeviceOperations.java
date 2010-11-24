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
import org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.AuthorOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scanning Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceTimeEqualsDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceHasAssignedAuthoringDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ScanningDevice#validateScanningDeviceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScanningDeviceOperations extends AuthorOperations {
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
	protected ScanningDeviceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.time.value = self.getClinicalDocument().effectiveTime.value";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Time Equals Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.time.value = self.getClinicalDocument().effectiveTime.value
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanningDeviceTimeEqualsDocumentEffectiveTime(ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNING_DEVICE__SCANNING_DEVICE_TIME_EQUALS_DOCUMENT_EFFECTIVE_TIME,
						 IHEPlugin.INSTANCE.getString("ScanningDeviceTimeEqualsDocumentEffectiveTime"),
						 new Object [] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- does not test device root oid"+
"self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthorId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- does not test device root oid
	 * self.assignedAuthor.id->forAll(ident : datatypes::II | not ident.root.oclIsUndefined())
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanningDeviceHasAssignedAuthorId(ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHOR_ID,
						 IHEPlugin.INSTANCE.getString("ScanningDeviceHasAssignedAuthorId"),
						 new Object [] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "-- does not test value of code or displayName"+
"self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'"+
"   and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()"+
"   and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Has Assigned Authoring Device Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * -- does not test value of code or displayName
	 * self.assignedAuthor.assignedAuthoringDevice.code.codeSystem = '1.2.840.10008.2.16.4'
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.code.oclIsUndefined()
	 *    and not self.assignedAuthor.assignedAuthoringDevice.code.displayName.oclIsUndefined()
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanningDeviceHasAssignedAuthoringDeviceCode(ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNING_DEVICE__SCANNING_DEVICE_HAS_ASSIGNED_AUTHORING_DEVICE_CODE,
						 IHEPlugin.INSTANCE.getString("ScanningDeviceHasAssignedAuthoringDeviceCode"),
						 new Object [] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateScanningDeviceTemplateId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTemplateId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateScanningDeviceTemplateId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scanning Device Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateScanningDeviceTemplateId(ScanningDevice, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.2.20.2')
	 * @param scanningDevice The receiving '<em><b>Scanning Device</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateScanningDeviceTemplateId(ScanningDevice scanningDevice, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.SCANNING_DEVICE);
			try {
				VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCANNING_DEVICE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(scanningDevice)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.SCANNING_DEVICE__SCANNING_DEVICE_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("ScanningDeviceTemplateId"),
						 new Object [] { scanningDevice }));
			}
			return false;
		}
		return true;
	}

} // ScanningDeviceOperations