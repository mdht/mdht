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
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Episode Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#EpisodeObservation_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#EpisodeObservation_classCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#EpisodeObservation_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#EpisodeObservation_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation#EpisodeObservation_code(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EpisodeObservationOperations extends ObservationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EpisodeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #EpisodeObservation_templateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_templateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.41')";

	/**
	 * The cached OCL invariant for the '{@link #EpisodeObservation_templateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_templateId(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.41')
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EpisodeObservation_templateId(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.EPISODE_OBSERVATION);
			try {
				EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EPISODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("EpisodeObservation_templateId"),
						 new Object [] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EpisodeObservation_classCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_classCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #EpisodeObservation_classCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_classCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClassObservation::OBS
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EpisodeObservation_classCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.EPISODE_OBSERVATION);
			try {
				EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EPISODE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("EpisodeObservation_classCode"),
						 new Object [] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EpisodeObservation_moodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_moodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #EpisodeObservation_moodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_moodCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_ActMoodDocumentObservation::EVN
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EpisodeObservation_moodCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.EPISODE_OBSERVATION);
			try {
				EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EPISODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("EpisodeObservation_moodCode"),
						 new Object [] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EpisodeObservation_statusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_statusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("+
"value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')";

	/**
	 * The cached OCL invariant for the '{@link #EpisodeObservation_statusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_statusCode(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined() and self.statusCode.oclIsTypeOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed' and value.codeSystem = '2.16.840.1.113883.5.14' and value.codeSystemName = 'ActStatus')
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EpisodeObservation_statusCode(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.EPISODE_OBSERVATION);
			try {
				EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EPISODE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("EpisodeObservation_statusCode"),
						 new Object [] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #EpisodeObservation_code(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_code(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4' and value.codeSystemName = 'ActCode')";

	/**
	 * The cached OCL invariant for the '{@link #EpisodeObservation_code(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Episode Observation code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EpisodeObservation_code(EpisodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.code.oclIsUndefined() and self.code.oclIsTypeOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4' and value.codeSystemName = 'ActCode')
	 * @param episodeObservation The receiving '<em><b>Episode Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean EpisodeObservation_code(EpisodeObservation episodeObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.EPISODE_OBSERVATION);
			try {
				EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(EPISODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(episodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.EPISODE_OBSERVATION__EPISODE_OBSERVATION_CODE,
						 CCDPlugin.INSTANCE.getString("EpisodeObservation_code"),
						 new Object [] { episodeObservation }));
			}
			return false;
		}
		return true;
	}

} // EpisodeObservationOperations