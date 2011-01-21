/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.ActOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEntryRelationshipRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Entry Relationship Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActSubjectOfTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Subject Of Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsAlertObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Alert Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActCodeNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Code Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#validateProblemActEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProblemActOperations extends ActOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProblemActOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActEntryRelationshipRequired(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Entry Relationship Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEntryRelationshipRequired(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.entryRelationship->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActEntryRelationshipRequired(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Entry Relationship Required</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEntryRelationshipRequired(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.entryRelationship->isEmpty()
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActEntryRelationshipRequired(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_ENTRY_RELATIONSHIP_REQUIRED,
						 CCDPlugin.INSTANCE.getString("ProblemActEntryRelationshipRequired"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActSubjectOfTarget(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Subject Of Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActSubjectOfTarget(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and "+
"  (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActSubjectOfTarget(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Subject Of Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActSubjectOfTarget(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::SUBJ, cda::ClinicalStatement)->forAll(target : cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemObservation) or target.oclIsKindOf(ccd::AlertObservation)))
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActSubjectOfTarget(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_SUBJECT_OF_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_SUBJECT_OF_TARGET,
						 CCDPlugin.INSTANCE.getString("ProblemActSubjectOfTarget"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActContainsProblemObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Problem Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsProblemObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActContainsProblemObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Problem Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsProblemObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::ProblemSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::ProblemObservation))
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActContainsProblemObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PROBLEM_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("ProblemActContainsProblemObservation"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActContainsAlertObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Alert Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsAlertObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()"+
"   ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActContainsAlertObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Alert Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsAlertObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSection().oclIsKindOf(ccd::AlertsSection) implies self.getObservations()
	 *    ->exists(obs : cda::Observation | obs.oclIsKindOf(ccd::AlertObservation))
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActContainsAlertObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CONTAINS_ALERT_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("ProblemActContainsAlertObservation"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActContainsPatientAwareness(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Patient Awareness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsPatientAwareness(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActContainsPatientAwareness(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Contains Patient Awareness</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActContainsPatientAwareness(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->one(partic : cda::Participant2 | partic.oclIsKindOf(ccd::PatientAwareness))
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActContainsPatientAwareness(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CONTAINS_PATIENT_AWARENESS,
						 CCDPlugin.INSTANCE.getString("ProblemActContainsPatientAwareness"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActTemplateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActTemplateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.27')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActTemplateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActTemplateId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.27')
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActTemplateId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("ProblemActTemplateId"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActClassCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActClassCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActClassCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActClassCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActClassCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CLASS_CODE,
						 CCDPlugin.INSTANCE.getString("ProblemActClassCode"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActMoodCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActMoodCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActMoodCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActMoodCode(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::EVN
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActMoodCode(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("ProblemActMoodCode"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActId(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActId(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_ID,
						 CCDPlugin.INSTANCE.getString("ProblemActId"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActCodeNullFlavor(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Code Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActCodeNullFlavor(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.code.nullFlavor = vocab::NullFlavor::NA";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActCodeNullFlavor(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Code Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActCodeNullFlavor(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.code.nullFlavor = vocab::NullFlavor::NA
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActCodeNullFlavor(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_CODE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_CODE_NULL_FLAVOR,
						 CCDPlugin.INSTANCE.getString("ProblemActCodeNullFlavor"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActEffectiveTime(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEffectiveTime(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActEffectiveTime(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEffectiveTime(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime.oclIsUndefined()
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActEffectiveTime(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("ProblemActEffectiveTime"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemActEpisodeObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEpisodeObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::EpisodeObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemActEpisodeObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Act Episode Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemActEpisodeObservation(ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::EpisodeObservation))
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateProblemActEpisodeObservation(ProblemAct problemAct, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.PROBLEM_ACT);
			try {
				VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_ACT_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(problemAct)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.PROBLEM_ACT__PROBLEM_ACT_EPISODE_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("ProblemActEpisodeObservation"),
						 new Object [] { problemAct }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEpisodeObservation(ProblemAct) <em>Get Episode Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(ProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EPISODE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::EpisodeObservation))->asSequence()->first().oclAsType(ccd::EpisodeObservation)";

	/**
	 * The cached OCL query for the '{@link #getEpisodeObservation(ProblemAct) <em>Get Episode Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpisodeObservation(ProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EPISODE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::EpisodeObservation))->asSequence()->first().oclAsType(ccd::EpisodeObservation)
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EpisodeObservation getEpisodeObservation(ProblemAct problemAct) {
		if (GET_EPISODE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.PROBLEM_ACT, CCDPackage.Literals.PROBLEM_ACT.getEAllOperations().get(55));
			try {
				GET_EPISODE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_EPISODE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EPISODE_OBSERVATION__EOCL_QRY);
		return (EpisodeObservation) query.evaluate(problemAct);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemObservations(ProblemAct) <em>Get Problem Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(ProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemObservation)).oclAsType(ccd::ProblemObservation)";

	/**
	 * The cached OCL query for the '{@link #getProblemObservations(ProblemAct) <em>Get Problem Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemObservations(ProblemAct)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ProblemObservation)).oclAsType(ccd::ProblemObservation)
	 * @param problemAct The receiving '<em><b>Problem Act</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ProblemObservation> getProblemObservations(ProblemAct problemAct) {
		if (GET_PROBLEM_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.PROBLEM_ACT, CCDPackage.Literals.PROBLEM_ACT.getEAllOperations().get(56));
			try {
				GET_PROBLEM_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ProblemObservation> result = (Collection<ProblemObservation>) query.evaluate(problemAct);
		return new BasicEList.UnmodifiableEList<ProblemObservation>(result.size(), result.toArray());
	}

} // ProblemActOperations