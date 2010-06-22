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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SubstanceAdministrationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivityOperations extends SubstanceAdministrationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMoodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT 
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityMoodCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationActivityMoodCode"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.24')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.24')
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("MedicationActivityTemplateId"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.id->isEmpty()
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("MedicationActivityId"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityStatusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.statusCode.oclIsUndefined()
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityStatusCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationActivityStatusCode"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityMedicationSeriesNumberObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("MedicationActivityMedicationSeriesNumberObservation"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMedicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMedicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMedicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityMedicationStatusObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("MedicationActivityMedicationStatusObservation"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityPatientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Patient Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPatientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::PatientInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityPatientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Patient Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityPatientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(ccd::PatientInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityPatientInstruction(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PATIENT_INSTRUCTION,
						 CCDPlugin.INSTANCE.getString("MedicationActivityPatientInstruction"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation(MedicationActivity) <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(ccd::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation(MedicationActivity) <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(ccd::MedicationSeriesNumberObservation)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationSeriesNumberObservation getMedicationSeriesNumberObservation(MedicationActivity medicationActivity) {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(40));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (MedicationSeriesNumberObservation) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation(MedicationActivity) <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationStatusObservation))->asSequence()->first().oclAsType(ccd::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation(MedicationActivity) <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::MedicationStatusObservation))->asSequence()->first().oclAsType(ccd::MedicationStatusObservation)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  MedicationStatusObservation getMedicationStatusObservation(MedicationActivity medicationActivity) {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(41));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (MedicationStatusObservation) query.evaluate(medicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientInstructions(MedicationActivity) <em>Get Patient Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PatientInstruction)).oclAsType(ccd::PatientInstruction)";

	/**
	 * The cached OCL query for the '{@link #getPatientInstructions(MedicationActivity) <em>Get Patient Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(ccd::PatientInstruction)).oclAsType(ccd::PatientInstruction)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<PatientInstruction> getPatientInstructions(MedicationActivity medicationActivity) {
		if (GET_PATIENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(42));
			try {
				GET_PATIENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PatientInstruction> result = (Collection<PatientInstruction>) query.evaluate(medicationActivity);
		return new BasicEList.UnmodifiableEList<PatientInstruction>(result.size(), result.toArray());
	}

} // MedicationActivityOperations