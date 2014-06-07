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
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Awareness</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessParticipantRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Participant Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness#validatePatientAwarenessAwarenessCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Awareness Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientAwarenessOperations extends ParticipationOperations {
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
	protected PatientAwarenessOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientAwarenessParticipantRoleId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Participant Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessParticipantRoleId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participantRole.id->one(id : datatypes::II |"+
"  not id.root.oclIsUndefined())"+
"-- TODO compare with ClinicalDocument/recordTarget/patientRole/id";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientAwarenessParticipantRoleId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Participant Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessParticipantRoleId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participantRole.id->one(id : datatypes::II |
	 *   not id.root.oclIsUndefined())
	 * -- TODO compare with ClinicalDocument/recordTarget/patientRole/id
	 * @param patientAwareness The receiving '<em><b>Patient Awareness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientAwarenessParticipantRoleId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PATIENT_AWARENESS);
			try {
				VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_AWARENESS_PARTICIPANT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientAwareness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PATIENT_AWARENESS__PATIENT_AWARENESS_PARTICIPANT_ROLE_ID,
						 CCDPlugin.INSTANCE.getString("PatientAwarenessParticipantRoleId"),
						 new Object [] { patientAwareness }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientAwarenessTemplateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessTemplateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.48')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientAwarenessTemplateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessTemplateId(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.48')
	 * @param patientAwareness The receiving '<em><b>Patient Awareness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientAwarenessTemplateId(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PATIENT_AWARENESS);
			try {
				VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_AWARENESS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientAwareness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PATIENT_AWARENESS__PATIENT_AWARENESS_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("PatientAwarenessTemplateId"),
						 new Object [] { patientAwareness }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientAwarenessTypeCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessTypeCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::SBJ";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientAwarenessTypeCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessTypeCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::SBJ
	 * @param patientAwareness The receiving '<em><b>Patient Awareness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientAwarenessTypeCode(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PATIENT_AWARENESS);
			try {
				VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_AWARENESS_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientAwareness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PATIENT_AWARENESS__PATIENT_AWARENESS_TYPE_CODE,
						 CCDPlugin.INSTANCE.getString("PatientAwarenessTypeCode"),
						 new Object [] { patientAwareness }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientAwarenessAwarenessCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Awareness Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessAwarenessCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.awarenessCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientAwarenessAwarenessCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Awareness Awareness Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientAwarenessAwarenessCode(PatientAwareness, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.awarenessCode.oclIsUndefined()
	 * @param patientAwareness The receiving '<em><b>Patient Awareness</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientAwarenessAwarenessCode(PatientAwareness patientAwareness, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PATIENT_AWARENESS);
			try {
				VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_AWARENESS_AWARENESS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientAwareness)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PATIENT_AWARENESS__PATIENT_AWARENESS_AWARENESS_CODE,
						 CCDPlugin.INSTANCE.getString("PatientAwarenessAwarenessCode"),
						 new Object [] { patientAwareness }));
			}
			return false;
		}
		return true;
	}

} // PatientAwarenessOperations