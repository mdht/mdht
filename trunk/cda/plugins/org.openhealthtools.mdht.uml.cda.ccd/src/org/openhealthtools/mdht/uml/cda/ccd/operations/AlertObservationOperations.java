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
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Alert Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAgentRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Agent Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validatePlayingEntityRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAlertStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AlertObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AlertObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInformationSource(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateInformationSource(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__INFORMATION_SOURCE,
						 CCDPlugin.INSTANCE.getString("InformationSource"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Agent Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant2 | participant.typeCode = vocab::ParticipationType::CSM )";

	/**
	 * The cached OCL invariant for the '{@link #validateAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Agent Representation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAgentRepresentation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->exists(participant : cda::Participant2 | participant.typeCode = vocab::ParticipationType::CSM )
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAgentRepresentation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__AGENT_REPRESENTATION,
						 CCDPlugin.INSTANCE.getString("AgentRepresentation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |"+
"  entity.classCode = vocab::EntityClassRoot::MMAT and not entity.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Entity Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlayingEntityRequired(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant.participantRole.playingEntity->one(entity : cda::PlayingEntity |
	 *   entity.classCode = vocab::EntityClassRoot::MMAT and not entity.code.oclIsUndefined())
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePlayingEntityRequired(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__PLAYING_ENTITY_REQUIRED,
						 CCDPlugin.INSTANCE.getString("PlayingEntityRequired"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.18')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationTemplateId(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.18')
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationTemplateId(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("AlertObservationTemplateId"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationMoodCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationMoodCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationMoodCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationStatusCode(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14')
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationStatusCode(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("AlertObservationStatusCode"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationEffectiveTime(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationEffectiveTime(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("AlertObservationEffectiveTime"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationValue(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationValue(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->forAll(element | element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationValue(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationValue(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.value->forAll(element | element.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = element.oclAsType(datatypes::CE) in 
	 * not value.codeSystem.oclIsUndefined() or not value.codeSystemName.oclIsUndefined())
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationValue(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_VALUE,
						 CCDPlugin.INSTANCE.getString("AlertObservationValue"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::AlertStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationAlertStatusObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::AlertStatusObservation))
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationAlertStatusObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("AlertObservationAlertStatusObservation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAlertObservationReactionObservation(AlertObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)
	 * @param alertObservation The receiving '<em><b>Alert Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateAlertObservationReactionObservation(AlertObservation alertObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.ALERT_OBSERVATION);
			try {
				VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(alertObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.ALERT_OBSERVATION__ALERT_OBSERVATION_REACTION_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("AlertObservationReactionObservation"),
						 new Object [] { alertObservation }));
			}
			return false;
		}
		return true;
	}

} // AlertObservationOperations