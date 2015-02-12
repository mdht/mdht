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
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatusObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationNoAdditionalParticipants(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->isEmpty()
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationNoAdditionalParticipants(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS,
						 CCDPlugin.INSTANCE.getString("StatusObservationNoAdditionalParticipants"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.57')";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationTemplateId(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.57')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationTemplateId(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("StatusObservationTemplateId"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationClassCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationClassCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservationClassCode"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationMoodCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationMoodCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservationMoodCode"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '33999-4' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservationCode"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationStatusCode(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed')
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationStatusCode(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("StatusObservationStatusCode"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))";

	/**
	 * The cached OCL invariant for the '{@link #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStatusObservationValue(StatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CE))
	 * @param statusObservation The receiving '<em><b>Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateStatusObservationValue(StatusObservation statusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.STATUS_OBSERVATION);
			try {
				VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(statusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.STATUS_OBSERVATION__STATUS_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("StatusObservationValue"),
						 new Object [] { statusObservation }));
			}
			return false;
		}
		return true;
	}

} // StatusObservationOperations