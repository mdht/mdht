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
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasDoseQuantityOrRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Dose Quantity Or Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasConsents(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Consents</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasPreconditionCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Precondition Criterion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasReasonProblem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason Problem</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityHasProduct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Product</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationSeriesNumberObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityMedicationStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityPatientInstruction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Patient Instruction</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#validateMedicationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getMedicationStatusObservation() <em>Get Medication Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getPatientInstructions() <em>Get Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
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
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Dose Quantity Or Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Dose Quantity Or Rate Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.doseQuantity.oclIsUndefined() or not self.rateQuantity.oclIsUndefined()
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasDoseQuantityOrRateQuantity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_DOSE_QUANTITY_OR_RATE_QUANTITY,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasDoseQuantityOrRateQuantity"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasConsents(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Consents</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasConsents(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().authorization->exists(auth : cda::Authorization | "+
"   not auth.oclIsUndefined() and not auth.consent.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasConsents(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Consents</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasConsents(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getClinicalDocument().authorization->exists(auth : cda::Authorization | 
	 *    not auth.oclIsUndefined() and not auth.consent.oclIsUndefined())
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasConsents(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_CONSENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_CONSENTS,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasConsents"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityInformationSource(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInformationSource(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "+
"or not self.getSection().informant->isEmpty()"+
"or not self.getClinicalDocument().informant->isEmpty()"+
"or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"+
"or (self.entryRelationship->exists(rel : cda::EntryRelationship | "+
"   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"+
"   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityInformationSource(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityInformationSource(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 * or not self.getSection().informant->isEmpty()
	 * or not self.getClinicalDocument().informant->isEmpty()
	 * or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 * or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityInformationSource(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INFORMATION_SOURCE,
						 CCDPlugin.INSTANCE.getString("MedicationActivityInformationSource"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasPreconditionCriterion(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Precondition Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasPreconditionCriterion(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasPreconditionCriterion(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Precondition Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasPreconditionCriterion(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.precondition->exists(precondition : cda::Precondition | not precondition.criterion.oclIsUndefined())
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasPreconditionCriterion(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRECONDITION_CRITERION,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasPreconditionCriterion"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRel : cda::EntryRelationship | entryRel.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasReason(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasReason"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasReasonProblem(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason Problem</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasReasonProblem(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : "+
"cda::ClinicalStatement | not target.oclIsUndefined() and "+
"  (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasReasonProblem(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Reason Problem</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasReasonProblem(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEntryRelationshipTargets(vocab::x_ActRelationshipEntryRelationship::RSON, cda::ClinicalStatement)->forAll(target : 
	 * 
	 * cda::ClinicalStatement | not target.oclIsUndefined() and 
	 *   (target.oclIsKindOf(ccd::ProblemAct) or target.oclIsKindOf(ccd::ProblemObservation)))
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasReasonProblem(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_REASON_PROBLEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_REASON_PROBLEM,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasReasonProblem"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityHasProduct(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasProduct(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityHasProduct(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Has Product</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityHasProduct(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.consumable.manufacturedProduct.oclIsKindOf(ccd::Product)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityHasProduct(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_HAS_PRODUCT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_HAS_PRODUCT,
						 CCDPlugin.INSTANCE.getString("MedicationActivityHasProduct"),
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
	 * The cached OCL expression body for the '{@link #validateMedicationActivityEffectiveTime(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTime(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.effectiveTime->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityEffectiveTime(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityEffectiveTime(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.effectiveTime->isEmpty()
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityEffectiveTime(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_EFFECTIVE_TIME,
						 CCDPlugin.INSTANCE.getString("MedicationActivityEffectiveTime"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.maxDoseQuantity.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Max Dose Quantity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityMaxDoseQuantity(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.maxDoseQuantity.oclIsUndefined()
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityMaxDoseQuantity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_MAX_DOSE_QUANTITY,
						 CCDPlugin.INSTANCE.getString("MedicationActivityMaxDoseQuantity"),
						 new Object [] { medicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in ("+
"value.codeSystem = '2.16.840.1.113883.5.112')";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Route Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityRouteCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.routeCode.oclIsUndefined() and self.routeCode.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.routeCode.oclAsType(datatypes::CE) in (
	 * value.codeSystem = '2.16.840.1.113883.5.112')
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityRouteCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_ROUTE_CODE,
						 CCDPlugin.INSTANCE.getString("MedicationActivityRouteCode"),
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
	 * The cached OCL expression body for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)";

	/**
	 * The cached OCL invariant for the '{@link #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reaction Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMedicationActivityReactionObservation(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(ccd::ReactionObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::CAUS)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateMedicationActivityReactionObservation(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(CCDPackage.Literals.MEDICATION_ACTIVITY);
			try {
				VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 CCDValidator.DIAGNOSTIC_SOURCE,
						 CCDValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REACTION_OBSERVATION,
						 CCDPlugin.INSTANCE.getString("MedicationActivityReactionObservation"),
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
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(61));
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
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(62));
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
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(63));
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

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservation(MedicationActivity) <em>Get Reaction Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservation(MedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::ReactionObservation))->asSequence()->first().oclAsType(ccd::ReactionObservation)
	 * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  ReactionObservation getReactionObservation(MedicationActivity medicationActivity) {
		if (GET_REACTION_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(CCDPackage.Literals.MEDICATION_ACTIVITY, CCDPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(64));
			try {
				GET_REACTION_OBSERVATION__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATION__EOCL_QRY);
		return (ReactionObservation) query.evaluate(medicationActivity);
	}

} // MedicationActivityOperations