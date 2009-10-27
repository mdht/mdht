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
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_moodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_templateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_statusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_medicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_medicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#MedicationActivity_patientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity patient Instruction</em>}</li>
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
	 * The cached OCL expression body for the '{@link #MedicationActivity_moodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_moodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentSubstanceMood::EVN or self.moodCode=vocab::x_DocumentSubstanceMood::INT ";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_moodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_moodCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean MedicationActivity_moodCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MOOD_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_moodCode"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_templateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_templateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.hasTemplateId('2.16.840.1.113883.10.20.1.24')";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_templateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_templateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.hasTemplateId('2.16.840.1.113883.10.20.1.24')
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationActivity_templateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_TEMPLATE_ID,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_templateId"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_id(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_id(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.id->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_id(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_id(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean MedicationActivity_id(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ID,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_id"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_statusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_statusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.statusCode.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_statusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_statusCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

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
	public static  boolean MedicationActivity_statusCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STATUS_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_statusCode"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_medicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_medicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_medicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Series Number Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_medicationSeriesNumberObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationSeriesNumberObservation))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationActivity_medicationSeriesNumberObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_SERIES_NUMBER_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_medicationSeriesNumberObservation"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_medicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_medicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_medicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity medication Status Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_medicationStatusObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | entryRelationship.observation.oclIsKindOf(ccd::MedicationStatusObservation))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationActivity_medicationStatusObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MEDICATION_STATUS_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_medicationStatusObservation"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #MedicationActivity_patientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity patient Instruction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_patientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.act.oclIsKindOf(ccd::PatientInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #MedicationActivity_patientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Medication Activity patient Instruction</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MedicationActivity_patientInstruction(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | entryRelationship.act.oclIsKindOf(ccd::PatientInstruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean MedicationActivity_patientInstruction(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(MEDICATION_ACTIVITY_PATIENT_INSTRUCTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PATIENT_INSTRUCTION,
						 CCDPlugin.INSTANCE.getString("MedicationActivity_patientInstruction"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

} // MedicationActivityOperations