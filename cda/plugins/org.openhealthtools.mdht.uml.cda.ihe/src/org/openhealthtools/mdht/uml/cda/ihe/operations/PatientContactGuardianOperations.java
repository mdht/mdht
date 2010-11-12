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
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.GuardianOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Contact Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientContactGuardianOperations extends GuardianOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientContactGuardianOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactGuardianTemplateId(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianTemplateId(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactGuardianTemplateId(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianTemplateId(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.2.4')
	 * @param patientContactGuardian The receiving '<em><b>Patient Contact Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactGuardianTemplateId(PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN);
			try {
				VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactGuardian)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("PatientContactGuardianTemplateId"),
						 new Object [] { patientContactGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactGuardianAddr(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianAddr(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.addr->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactGuardianAddr(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianAddr(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.addr->isEmpty()
	 * @param patientContactGuardian The receiving '<em><b>Patient Contact Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactGuardianAddr(PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN);
			try {
				VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactGuardian)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_ADDR,
						 IHEPlugin.INSTANCE.getString("PatientContactGuardianAddr"),
						 new Object [] { patientContactGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactGuardianClassCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianClassCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.classCode.oclIsUndefined() and self.classCode=vocab::RoleClass::GUAR";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactGuardianClassCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianClassCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.classCode.oclIsUndefined() and self.classCode=vocab::RoleClass::GUAR
	 * @param patientContactGuardian The receiving '<em><b>Patient Contact Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactGuardianClassCode(PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN);
			try {
				VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactGuardian)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_CLASS_CODE,
						 IHEPlugin.INSTANCE.getString("PatientContactGuardianClassCode"),
						 new Object [] { patientContactGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactGuardianCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.111')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactGuardianCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianCode(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.111')
	 * @param patientContactGuardian The receiving '<em><b>Patient Contact Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactGuardianCode(PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN);
			try {
				VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactGuardian)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_CODE,
						 IHEPlugin.INSTANCE.getString("PatientContactGuardianCode"),
						 new Object [] { patientContactGuardian }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactGuardianTelecom(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianTelecom(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.telecom->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactGuardianTelecom(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactGuardianTelecom(PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.telecom->isEmpty()
	 * @param patientContactGuardian The receiving '<em><b>Patient Contact Guardian</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactGuardianTelecom(PatientContactGuardian patientContactGuardian, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_GUARDIAN);
			try {
				VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactGuardian)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_GUARDIAN__PATIENT_CONTACT_GUARDIAN_TELECOM,
						 IHEPlugin.INSTANCE.getString("PatientContactGuardianTelecom"),
						 new Object [] { patientContactGuardian }));
			}
			return false;
		}
		return true;
	}

} // PatientContactGuardianOperations