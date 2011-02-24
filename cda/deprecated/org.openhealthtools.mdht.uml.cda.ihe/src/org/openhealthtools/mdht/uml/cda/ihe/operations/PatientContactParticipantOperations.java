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
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Contact Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientContactParticipantOperations extends ParticipationOperations {
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
	protected PatientContactParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactParticipantTemplateId(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTemplateId(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.2.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactParticipantTemplateId(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTemplateId(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.2.4')
	 * @param patientContactParticipant The receiving '<em><b>Patient Contact Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactParticipantTemplateId(PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_PARTICIPANT);
			try {
				VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactParticipant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID,
						 IHEPlugin.INSTANCE.getString("PatientContactParticipantTemplateId"),
						 new Object [] { patientContactParticipant }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactParticipantTime(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTime(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.time.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactParticipantTime(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTime(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.time.oclIsUndefined()
	 * @param patientContactParticipant The receiving '<em><b>Patient Contact Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactParticipantTime(PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_PARTICIPANT);
			try {
				VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactParticipant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TIME,
						 IHEPlugin.INSTANCE.getString("PatientContactParticipantTime"),
						 new Object [] { patientContactParticipant }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePatientContactParticipantTypeCode(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTypeCode(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::IND";

	/**
	 * The cached OCL invariant for the '{@link #validatePatientContactParticipantTypeCode(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePatientContactParticipantTypeCode(PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::IND
	 * @param patientContactParticipant The receiving '<em><b>Patient Contact Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePatientContactParticipantTypeCode(PatientContactParticipant patientContactParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PATIENT_CONTACT_PARTICIPANT);
			try {
				VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(patientContactParticipant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 IHEValidator.DIAGNOSTIC_SOURCE,
						 IHEValidator.PATIENT_CONTACT_PARTICIPANT__PATIENT_CONTACT_PARTICIPANT_TYPE_CODE,
						 IHEPlugin.INSTANCE.getString("PatientContactParticipantTypeCode"),
						 new Object [] { patientContactParticipant }));
			}
			return false;
		}
		return true;
	}

} // PatientContactParticipantOperations