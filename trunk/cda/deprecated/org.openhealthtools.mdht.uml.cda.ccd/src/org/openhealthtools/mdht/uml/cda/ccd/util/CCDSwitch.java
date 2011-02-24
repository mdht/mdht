/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Procedure;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CoveragePlanDescription;
import org.openhealthtools.mdht.uml.cda.ccd.CoveredParty;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistoryOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.PatientAwareness;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.PayerEntity;
import org.openhealthtools.mdht.uml.cda.ccd.PayersSection;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySupply;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemHealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ProductInstance;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeSection;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.cda.ccd.Support;
import org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;
import org.openhealthtools.mdht.uml.hl7.rim.Participation;
import org.openhealthtools.mdht.uml.hl7.rim.Role;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.ccd.CCDPackage
 * @generated
 */
public class CCDSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CCDPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CCDSwitch() {
		if (modelPackage == null) {
			modelPackage = CCDPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CCDPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection)theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) result = caseSection(medicationsSection);
				if (result == null) result = caseAct(medicationsSection);
				if (result == null) result = caseInfrastructureRoot(medicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.MEDICATION_ACTIVITY: {
				MedicationActivity medicationActivity = (MedicationActivity)theEObject;
				T result = caseMedicationActivity(medicationActivity);
				if (result == null) result = caseSubstanceAdministration(medicationActivity);
				if (result == null) result = caseClinicalStatement(medicationActivity);
				if (result == null) result = caseAct(medicationActivity);
				if (result == null) result = caseInfrastructureRoot(medicationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.MEDICATION_SERIES_NUMBER_OBSERVATION: {
				MedicationSeriesNumberObservation medicationSeriesNumberObservation = (MedicationSeriesNumberObservation)theEObject;
				T result = caseMedicationSeriesNumberObservation(medicationSeriesNumberObservation);
				if (result == null) result = caseObservation(medicationSeriesNumberObservation);
				if (result == null) result = caseClinicalStatement(medicationSeriesNumberObservation);
				if (result == null) result = caseAct(medicationSeriesNumberObservation);
				if (result == null) result = caseInfrastructureRoot(medicationSeriesNumberObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.MEDICATION_STATUS_OBSERVATION: {
				MedicationStatusObservation medicationStatusObservation = (MedicationStatusObservation)theEObject;
				T result = caseMedicationStatusObservation(medicationStatusObservation);
				if (result == null) result = caseStatusObservation(medicationStatusObservation);
				if (result == null) result = caseObservation(medicationStatusObservation);
				if (result == null) result = caseClinicalStatement(medicationStatusObservation);
				if (result == null) result = caseAct(medicationStatusObservation);
				if (result == null) result = caseInfrastructureRoot(medicationStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.STATUS_OBSERVATION: {
				StatusObservation statusObservation = (StatusObservation)theEObject;
				T result = caseStatusObservation(statusObservation);
				if (result == null) result = caseObservation(statusObservation);
				if (result == null) result = caseClinicalStatement(statusObservation);
				if (result == null) result = caseAct(statusObservation);
				if (result == null) result = caseInfrastructureRoot(statusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PATIENT_INSTRUCTION: {
				PatientInstruction patientInstruction = (PatientInstruction)theEObject;
				T result = casePatientInstruction(patientInstruction);
				if (result == null) result = caseCDA_Act(patientInstruction);
				if (result == null) result = caseClinicalStatement(patientInstruction);
				if (result == null) result = caseAct(patientInstruction);
				if (result == null) result = caseInfrastructureRoot(patientInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.REACTION_OBSERVATION: {
				ReactionObservation reactionObservation = (ReactionObservation)theEObject;
				T result = caseReactionObservation(reactionObservation);
				if (result == null) result = caseObservation(reactionObservation);
				if (result == null) result = caseClinicalStatement(reactionObservation);
				if (result == null) result = caseAct(reactionObservation);
				if (result == null) result = caseInfrastructureRoot(reactionObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SEVERITY_OBSERVATION: {
				SeverityObservation severityObservation = (SeverityObservation)theEObject;
				T result = caseSeverityObservation(severityObservation);
				if (result == null) result = caseObservation(severityObservation);
				if (result == null) result = caseClinicalStatement(severityObservation);
				if (result == null) result = caseAct(severityObservation);
				if (result == null) result = caseInfrastructureRoot(severityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SUPPLY_ACTIVITY: {
				SupplyActivity supplyActivity = (SupplyActivity)theEObject;
				T result = caseSupplyActivity(supplyActivity);
				if (result == null) result = caseSupply(supplyActivity);
				if (result == null) result = caseClinicalStatement(supplyActivity);
				if (result == null) result = caseAct(supplyActivity);
				if (result == null) result = caseInfrastructureRoot(supplyActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FULFILLMENT_INSTRUCTION: {
				FulfillmentInstruction fulfillmentInstruction = (FulfillmentInstruction)theEObject;
				T result = caseFulfillmentInstruction(fulfillmentInstruction);
				if (result == null) result = caseCDA_Act(fulfillmentInstruction);
				if (result == null) result = caseClinicalStatement(fulfillmentInstruction);
				if (result == null) result = caseAct(fulfillmentInstruction);
				if (result == null) result = caseInfrastructureRoot(fulfillmentInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.CONTINUITY_OF_CARE_DOCUMENT: {
				ContinuityOfCareDocument continuityOfCareDocument = (ContinuityOfCareDocument)theEObject;
				T result = caseContinuityOfCareDocument(continuityOfCareDocument);
				if (result == null) result = caseClinicalDocument(continuityOfCareDocument);
				if (result == null) result = caseAct(continuityOfCareDocument);
				if (result == null) result = caseInfrastructureRoot(continuityOfCareDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROBLEM_SECTION: {
				ProblemSection problemSection = (ProblemSection)theEObject;
				T result = caseProblemSection(problemSection);
				if (result == null) result = caseSection(problemSection);
				if (result == null) result = caseAct(problemSection);
				if (result == null) result = caseInfrastructureRoot(problemSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROBLEM_ACT: {
				ProblemAct problemAct = (ProblemAct)theEObject;
				T result = caseProblemAct(problemAct);
				if (result == null) result = caseCDA_Act(problemAct);
				if (result == null) result = caseClinicalStatement(problemAct);
				if (result == null) result = caseAct(problemAct);
				if (result == null) result = caseInfrastructureRoot(problemAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.EPISODE_OBSERVATION: {
				EpisodeObservation episodeObservation = (EpisodeObservation)theEObject;
				T result = caseEpisodeObservation(episodeObservation);
				if (result == null) result = caseObservation(episodeObservation);
				if (result == null) result = caseClinicalStatement(episodeObservation);
				if (result == null) result = caseAct(episodeObservation);
				if (result == null) result = caseInfrastructureRoot(episodeObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROBLEM_OBSERVATION: {
				ProblemObservation problemObservation = (ProblemObservation)theEObject;
				T result = caseProblemObservation(problemObservation);
				if (result == null) result = caseObservation(problemObservation);
				if (result == null) result = caseClinicalStatement(problemObservation);
				if (result == null) result = caseAct(problemObservation);
				if (result == null) result = caseInfrastructureRoot(problemObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROBLEM_STATUS_OBSERVATION: {
				ProblemStatusObservation problemStatusObservation = (ProblemStatusObservation)theEObject;
				T result = caseProblemStatusObservation(problemStatusObservation);
				if (result == null) result = caseStatusObservation(problemStatusObservation);
				if (result == null) result = caseObservation(problemStatusObservation);
				if (result == null) result = caseClinicalStatement(problemStatusObservation);
				if (result == null) result = caseAct(problemStatusObservation);
				if (result == null) result = caseInfrastructureRoot(problemStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROBLEM_HEALTH_STATUS_OBSERVATION: {
				ProblemHealthStatusObservation problemHealthStatusObservation = (ProblemHealthStatusObservation)theEObject;
				T result = caseProblemHealthStatusObservation(problemHealthStatusObservation);
				if (result == null) result = caseStatusObservation(problemHealthStatusObservation);
				if (result == null) result = caseObservation(problemHealthStatusObservation);
				if (result == null) result = caseClinicalStatement(problemHealthStatusObservation);
				if (result == null) result = caseAct(problemHealthStatusObservation);
				if (result == null) result = caseInfrastructureRoot(problemHealthStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.AGE_OBSERVATION: {
				AgeObservation ageObservation = (AgeObservation)theEObject;
				T result = caseAgeObservation(ageObservation);
				if (result == null) result = caseObservation(ageObservation);
				if (result == null) result = caseClinicalStatement(ageObservation);
				if (result == null) result = caseAct(ageObservation);
				if (result == null) result = caseInfrastructureRoot(ageObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FAMILY_HISTORY_SECTION: {
				FamilyHistorySection familyHistorySection = (FamilyHistorySection)theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) result = caseSection(familyHistorySection);
				if (result == null) result = caseAct(familyHistorySection);
				if (result == null) result = caseInfrastructureRoot(familyHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection)theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) result = caseSection(socialHistorySection);
				if (result == null) result = caseAct(socialHistorySection);
				if (result == null) result = caseInfrastructureRoot(socialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ALERTS_SECTION: {
				AlertsSection alertsSection = (AlertsSection)theEObject;
				T result = caseAlertsSection(alertsSection);
				if (result == null) result = caseSection(alertsSection);
				if (result == null) result = caseAct(alertsSection);
				if (result == null) result = caseInfrastructureRoot(alertsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.RESULTS_SECTION: {
				ResultsSection resultsSection = (ResultsSection)theEObject;
				T result = caseResultsSection(resultsSection);
				if (result == null) result = caseSection(resultsSection);
				if (result == null) result = caseAct(resultsSection);
				if (result == null) result = caseInfrastructureRoot(resultsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.RESULT_ORGANIZER: {
				ResultOrganizer resultOrganizer = (ResultOrganizer)theEObject;
				T result = caseResultOrganizer(resultOrganizer);
				if (result == null) result = caseOrganizer(resultOrganizer);
				if (result == null) result = caseClinicalStatement(resultOrganizer);
				if (result == null) result = caseAct(resultOrganizer);
				if (result == null) result = caseInfrastructureRoot(resultOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.RESULT_OBSERVATION: {
				ResultObservation resultObservation = (ResultObservation)theEObject;
				T result = caseResultObservation(resultObservation);
				if (result == null) result = caseObservation(resultObservation);
				if (result == null) result = caseClinicalStatement(resultObservation);
				if (result == null) result = caseAct(resultObservation);
				if (result == null) result = caseInfrastructureRoot(resultObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROCEDURES_SECTION: {
				ProceduresSection proceduresSection = (ProceduresSection)theEObject;
				T result = caseProceduresSection(proceduresSection);
				if (result == null) result = caseSection(proceduresSection);
				if (result == null) result = caseAct(proceduresSection);
				if (result == null) result = caseInfrastructureRoot(proceduresSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection)theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) result = caseSection(encountersSection);
				if (result == null) result = caseAct(encountersSection);
				if (result == null) result = caseInfrastructureRoot(encountersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_SECTION: {
				PlanOfCareSection planOfCareSection = (PlanOfCareSection)theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) result = caseSection(planOfCareSection);
				if (result == null) result = caseAct(planOfCareSection);
				if (result == null) result = caseInfrastructureRoot(planOfCareSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY: {
				PlanOfCareActivity planOfCareActivity = (PlanOfCareActivity)theEObject;
				T result = casePlanOfCareActivity(planOfCareActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ACT: {
				PlanOfCareActivityAct planOfCareActivityAct = (PlanOfCareActivityAct)theEObject;
				T result = casePlanOfCareActivityAct(planOfCareActivityAct);
				if (result == null) result = caseCDA_Act(planOfCareActivityAct);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivityAct);
				if (result == null) result = caseClinicalStatement(planOfCareActivityAct);
				if (result == null) result = caseAct(planOfCareActivityAct);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER: {
				PlanOfCareActivityEncounter planOfCareActivityEncounter = (PlanOfCareActivityEncounter)theEObject;
				T result = casePlanOfCareActivityEncounter(planOfCareActivityEncounter);
				if (result == null) result = caseEncounter(planOfCareActivityEncounter);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivityEncounter);
				if (result == null) result = caseClinicalStatement(planOfCareActivityEncounter);
				if (result == null) result = caseAct(planOfCareActivityEncounter);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityEncounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION: {
				PlanOfCareActivityObservation planOfCareActivityObservation = (PlanOfCareActivityObservation)theEObject;
				T result = casePlanOfCareActivityObservation(planOfCareActivityObservation);
				if (result == null) result = caseObservation(planOfCareActivityObservation);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivityObservation);
				if (result == null) result = caseClinicalStatement(planOfCareActivityObservation);
				if (result == null) result = caseAct(planOfCareActivityObservation);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_PROCEDURE: {
				PlanOfCareActivityProcedure planOfCareActivityProcedure = (PlanOfCareActivityProcedure)theEObject;
				T result = casePlanOfCareActivityProcedure(planOfCareActivityProcedure);
				if (result == null) result = caseProcedure(planOfCareActivityProcedure);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivityProcedure);
				if (result == null) result = caseClinicalStatement(planOfCareActivityProcedure);
				if (result == null) result = caseAct(planOfCareActivityProcedure);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION: {
				PlanOfCareActivitySubstanceAdministration planOfCareActivitySubstanceAdministration = (PlanOfCareActivitySubstanceAdministration)theEObject;
				T result = casePlanOfCareActivitySubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseSubstanceAdministration(planOfCareActivitySubstanceAdministration);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseClinicalStatement(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseAct(planOfCareActivitySubstanceAdministration);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivitySubstanceAdministration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PLAN_OF_CARE_ACTIVITY_SUPPLY: {
				PlanOfCareActivitySupply planOfCareActivitySupply = (PlanOfCareActivitySupply)theEObject;
				T result = casePlanOfCareActivitySupply(planOfCareActivitySupply);
				if (result == null) result = caseSupply(planOfCareActivitySupply);
				if (result == null) result = casePlanOfCareActivity(planOfCareActivitySupply);
				if (result == null) result = caseClinicalStatement(planOfCareActivitySupply);
				if (result == null) result = caseAct(planOfCareActivitySupply);
				if (result == null) result = caseInfrastructureRoot(planOfCareActivitySupply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection)theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) result = caseSection(immunizationsSection);
				if (result == null) result = caseAct(immunizationsSection);
				if (result == null) result = caseInfrastructureRoot(immunizationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection)theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseSection(vitalSignsSection);
				if (result == null) result = caseAct(vitalSignsSection);
				if (result == null) result = caseInfrastructureRoot(vitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer)theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseResultOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseClinicalStatement(vitalSignsOrganizer);
				if (result == null) result = caseAct(vitalSignsOrganizer);
				if (result == null) result = caseInfrastructureRoot(vitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.MEDICAL_EQUIPMENT_SECTION: {
				MedicalEquipmentSection medicalEquipmentSection = (MedicalEquipmentSection)theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) result = caseSection(medicalEquipmentSection);
				if (result == null) result = caseAct(medicalEquipmentSection);
				if (result == null) result = caseInfrastructureRoot(medicalEquipmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection)theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) result = caseSection(functionalStatusSection);
				if (result == null) result = caseAct(functionalStatusSection);
				if (result == null) result = caseInfrastructureRoot(functionalStatusSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection)theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseSection(advanceDirectivesSection);
				if (result == null) result = caseAct(advanceDirectivesSection);
				if (result == null) result = caseInfrastructureRoot(advanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ADVANCE_DIRECTIVE_OBSERVATION: {
				AdvanceDirectiveObservation advanceDirectiveObservation = (AdvanceDirectiveObservation)theEObject;
				T result = caseAdvanceDirectiveObservation(advanceDirectiveObservation);
				if (result == null) result = caseObservation(advanceDirectiveObservation);
				if (result == null) result = caseClinicalStatement(advanceDirectiveObservation);
				if (result == null) result = caseAct(advanceDirectiveObservation);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection)theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) result = caseSection(payersSection);
				if (result == null) result = caseAct(payersSection);
				if (result == null) result = caseInfrastructureRoot(payersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.COVERAGE_ACTIVITY: {
				CoverageActivity coverageActivity = (CoverageActivity)theEObject;
				T result = caseCoverageActivity(coverageActivity);
				if (result == null) result = caseCDA_Act(coverageActivity);
				if (result == null) result = caseClinicalStatement(coverageActivity);
				if (result == null) result = caseAct(coverageActivity);
				if (result == null) result = caseInfrastructureRoot(coverageActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.POLICY_ACTIVITY: {
				PolicyActivity policyActivity = (PolicyActivity)theEObject;
				T result = casePolicyActivity(policyActivity);
				if (result == null) result = caseCDA_Act(policyActivity);
				if (result == null) result = caseClinicalStatement(policyActivity);
				if (result == null) result = caseAct(policyActivity);
				if (result == null) result = caseInfrastructureRoot(policyActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PURPOSE_SECTION: {
				PurposeSection purposeSection = (PurposeSection)theEObject;
				T result = casePurposeSection(purposeSection);
				if (result == null) result = caseSection(purposeSection);
				if (result == null) result = caseAct(purposeSection);
				if (result == null) result = caseInfrastructureRoot(purposeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PURPOSE_ACTIVITY: {
				PurposeActivity purposeActivity = (PurposeActivity)theEObject;
				T result = casePurposeActivity(purposeActivity);
				if (result == null) result = caseCDA_Act(purposeActivity);
				if (result == null) result = caseClinicalStatement(purposeActivity);
				if (result == null) result = caseAct(purposeActivity);
				if (result == null) result = caseInfrastructureRoot(purposeActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PATIENT_AWARENESS: {
				PatientAwareness patientAwareness = (PatientAwareness)theEObject;
				T result = casePatientAwareness(patientAwareness);
				if (result == null) result = caseParticipant2(patientAwareness);
				if (result == null) result = caseParticipation(patientAwareness);
				if (result == null) result = caseInfrastructureRoot(patientAwareness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FAMILY_HISTORY_OBSERVATION: {
				FamilyHistoryObservation familyHistoryObservation = (FamilyHistoryObservation)theEObject;
				T result = caseFamilyHistoryObservation(familyHistoryObservation);
				if (result == null) result = caseObservation(familyHistoryObservation);
				if (result == null) result = caseClinicalStatement(familyHistoryObservation);
				if (result == null) result = caseAct(familyHistoryObservation);
				if (result == null) result = caseInfrastructureRoot(familyHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FAMILY_HISTORY_ORGANIZER: {
				FamilyHistoryOrganizer familyHistoryOrganizer = (FamilyHistoryOrganizer)theEObject;
				T result = caseFamilyHistoryOrganizer(familyHistoryOrganizer);
				if (result == null) result = caseOrganizer(familyHistoryOrganizer);
				if (result == null) result = caseClinicalStatement(familyHistoryOrganizer);
				if (result == null) result = caseAct(familyHistoryOrganizer);
				if (result == null) result = caseInfrastructureRoot(familyHistoryOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SOCIAL_HISTORY_OBSERVATION: {
				SocialHistoryObservation socialHistoryObservation = (SocialHistoryObservation)theEObject;
				T result = caseSocialHistoryObservation(socialHistoryObservation);
				if (result == null) result = caseObservation(socialHistoryObservation);
				if (result == null) result = caseClinicalStatement(socialHistoryObservation);
				if (result == null) result = caseAct(socialHistoryObservation);
				if (result == null) result = caseInfrastructureRoot(socialHistoryObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ENCOUNTERS_ACTIVITY: {
				EncountersActivity encountersActivity = (EncountersActivity)theEObject;
				T result = caseEncountersActivity(encountersActivity);
				if (result == null) result = caseEncounter(encountersActivity);
				if (result == null) result = caseClinicalStatement(encountersActivity);
				if (result == null) result = caseAct(encountersActivity);
				if (result == null) result = caseInfrastructureRoot(encountersActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ALERT_OBSERVATION: {
				AlertObservation alertObservation = (AlertObservation)theEObject;
				T result = caseAlertObservation(alertObservation);
				if (result == null) result = caseObservation(alertObservation);
				if (result == null) result = caseClinicalStatement(alertObservation);
				if (result == null) result = caseAct(alertObservation);
				if (result == null) result = caseInfrastructureRoot(alertObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ALERT_STATUS_OBSERVATION: {
				AlertStatusObservation alertStatusObservation = (AlertStatusObservation)theEObject;
				T result = caseAlertStatusObservation(alertStatusObservation);
				if (result == null) result = caseStatusObservation(alertStatusObservation);
				if (result == null) result = caseObservation(alertStatusObservation);
				if (result == null) result = caseClinicalStatement(alertStatusObservation);
				if (result == null) result = caseAct(alertStatusObservation);
				if (result == null) result = caseInfrastructureRoot(alertStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.CAUSE_OF_DEATH_OBSERVATION: {
				CauseOfDeathObservation causeOfDeathObservation = (CauseOfDeathObservation)theEObject;
				T result = caseCauseOfDeathObservation(causeOfDeathObservation);
				if (result == null) result = caseFamilyHistoryObservation(causeOfDeathObservation);
				if (result == null) result = caseObservation(causeOfDeathObservation);
				if (result == null) result = caseClinicalStatement(causeOfDeathObservation);
				if (result == null) result = caseAct(causeOfDeathObservation);
				if (result == null) result = caseInfrastructureRoot(causeOfDeathObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ENCOUNTER_LOCATION: {
				EncounterLocation encounterLocation = (EncounterLocation)theEObject;
				T result = caseEncounterLocation(encounterLocation);
				if (result == null) result = caseParticipant2(encounterLocation);
				if (result == null) result = caseParticipation(encounterLocation);
				if (result == null) result = caseInfrastructureRoot(encounterLocation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T result = caseProduct(product);
				if (result == null) result = caseManufacturedProduct(product);
				if (result == null) result = caseRole(product);
				if (result == null) result = caseInfrastructureRoot(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ADVANCE_DIRECTIVE_STATUS_OBSERVATION: {
				AdvanceDirectiveStatusObservation advanceDirectiveStatusObservation = (AdvanceDirectiveStatusObservation)theEObject;
				T result = caseAdvanceDirectiveStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) result = caseStatusObservation(advanceDirectiveStatusObservation);
				if (result == null) result = caseObservation(advanceDirectiveStatusObservation);
				if (result == null) result = caseClinicalStatement(advanceDirectiveStatusObservation);
				if (result == null) result = caseAct(advanceDirectiveStatusObservation);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.ADVANCE_DIRECTIVE_VERIFICATION: {
				AdvanceDirectiveVerification advanceDirectiveVerification = (AdvanceDirectiveVerification)theEObject;
				T result = caseAdvanceDirectiveVerification(advanceDirectiveVerification);
				if (result == null) result = caseParticipant2(advanceDirectiveVerification);
				if (result == null) result = caseParticipation(advanceDirectiveVerification);
				if (result == null) result = caseInfrastructureRoot(advanceDirectiveVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.AUTHORIZATION_ACTIVITY: {
				AuthorizationActivity authorizationActivity = (AuthorizationActivity)theEObject;
				T result = caseAuthorizationActivity(authorizationActivity);
				if (result == null) result = caseCDA_Act(authorizationActivity);
				if (result == null) result = caseClinicalStatement(authorizationActivity);
				if (result == null) result = caseAct(authorizationActivity);
				if (result == null) result = caseInfrastructureRoot(authorizationActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROCEDURE_ACTIVITY: {
				ProcedureActivity procedureActivity = (ProcedureActivity)theEObject;
				T result = caseProcedureActivity(procedureActivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.FUNCTIONAL_STATUS_OBSERVATION: {
				FunctionalStatusObservation functionalStatusObservation = (FunctionalStatusObservation)theEObject;
				T result = caseFunctionalStatusObservation(functionalStatusObservation);
				if (result == null) result = caseStatusObservation(functionalStatusObservation);
				if (result == null) result = caseObservation(functionalStatusObservation);
				if (result == null) result = caseClinicalStatement(functionalStatusObservation);
				if (result == null) result = caseAct(functionalStatusObservation);
				if (result == null) result = caseInfrastructureRoot(functionalStatusObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PRODUCT_INSTANCE: {
				ProductInstance productInstance = (ProductInstance)theEObject;
				T result = caseProductInstance(productInstance);
				if (result == null) result = caseParticipantRole(productInstance);
				if (result == null) result = caseRole(productInstance);
				if (result == null) result = caseInfrastructureRoot(productInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROCEDURE_ACTIVITY_ACT: {
				ProcedureActivityAct procedureActivityAct = (ProcedureActivityAct)theEObject;
				T result = caseProcedureActivityAct(procedureActivityAct);
				if (result == null) result = caseCDA_Act(procedureActivityAct);
				if (result == null) result = caseProcedureActivity(procedureActivityAct);
				if (result == null) result = caseClinicalStatement(procedureActivityAct);
				if (result == null) result = caseAct(procedureActivityAct);
				if (result == null) result = caseInfrastructureRoot(procedureActivityAct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROCEDURE_ACTIVITY_OBSERVATION: {
				ProcedureActivityObservation procedureActivityObservation = (ProcedureActivityObservation)theEObject;
				T result = caseProcedureActivityObservation(procedureActivityObservation);
				if (result == null) result = caseObservation(procedureActivityObservation);
				if (result == null) result = caseProcedureActivity(procedureActivityObservation);
				if (result == null) result = caseClinicalStatement(procedureActivityObservation);
				if (result == null) result = caseAct(procedureActivityObservation);
				if (result == null) result = caseInfrastructureRoot(procedureActivityObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PROCEDURE_ACTIVITY_PROCEDURE: {
				ProcedureActivityProcedure procedureActivityProcedure = (ProcedureActivityProcedure)theEObject;
				T result = caseProcedureActivityProcedure(procedureActivityProcedure);
				if (result == null) result = caseProcedure(procedureActivityProcedure);
				if (result == null) result = caseProcedureActivity(procedureActivityProcedure);
				if (result == null) result = caseClinicalStatement(procedureActivityProcedure);
				if (result == null) result = caseAct(procedureActivityProcedure);
				if (result == null) result = caseInfrastructureRoot(procedureActivityProcedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.PAYER_ENTITY: {
				PayerEntity payerEntity = (PayerEntity)theEObject;
				T result = casePayerEntity(payerEntity);
				if (result == null) result = caseAssignedEntity(payerEntity);
				if (result == null) result = caseRole(payerEntity);
				if (result == null) result = caseInfrastructureRoot(payerEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.COVERED_PARTY: {
				CoveredParty coveredParty = (CoveredParty)theEObject;
				T result = caseCoveredParty(coveredParty);
				if (result == null) result = caseParticipantRole(coveredParty);
				if (result == null) result = caseRole(coveredParty);
				if (result == null) result = caseInfrastructureRoot(coveredParty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.POLICY_SUBSCRIBER: {
				PolicySubscriber policySubscriber = (PolicySubscriber)theEObject;
				T result = casePolicySubscriber(policySubscriber);
				if (result == null) result = caseParticipantRole(policySubscriber);
				if (result == null) result = caseRole(policySubscriber);
				if (result == null) result = caseInfrastructureRoot(policySubscriber);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.COVERAGE_PLAN_DESCRIPTION: {
				CoveragePlanDescription coveragePlanDescription = (CoveragePlanDescription)theEObject;
				T result = caseCoveragePlanDescription(coveragePlanDescription);
				if (result == null) result = caseCDA_Act(coveragePlanDescription);
				if (result == null) result = caseClinicalStatement(coveragePlanDescription);
				if (result == null) result = caseAct(coveragePlanDescription);
				if (result == null) result = caseInfrastructureRoot(coveragePlanDescription);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SUPPORT_PARTICIPANT: {
				SupportParticipant supportParticipant = (SupportParticipant)theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) result = caseParticipant1(supportParticipant);
				if (result == null) result = caseSupport(supportParticipant);
				if (result == null) result = caseParticipation(supportParticipant);
				if (result == null) result = caseInfrastructureRoot(supportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.SUPPORT_GUARDIAN: {
				SupportGuardian supportGuardian = (SupportGuardian)theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) result = caseGuardian(supportGuardian);
				if (result == null) result = caseSupport(supportGuardian);
				if (result == null) result = caseRole(supportGuardian);
				if (result == null) result = caseInfrastructureRoot(supportGuardian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseCDA_Act(comment);
				if (result == null) result = caseClinicalStatement(comment);
				if (result == null) result = caseAct(comment);
				if (result == null) result = caseInfrastructureRoot(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CCDPackage.CCD_REGISTRY_DELEGATE: {
				CCDRegistryDelegate ccdRegistryDelegate = (CCDRegistryDelegate)theEObject;
				T result = caseCCDRegistryDelegate(ccdRegistryDelegate);
				if (result == null) result = caseRegistryDelegate(ccdRegistryDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsSection(MedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Continuity Of Care Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuityOfCareDocument(ContinuityOfCareDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemSection(ProblemSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemAct(ProblemAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Episode Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Episode Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpisodeObservation(EpisodeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistorySection(FamilyHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistorySection(SocialHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alerts Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alerts Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertsSection(AlertsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultsSection(ResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultOrganizer(ResultOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultObservation(ResultObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedures Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProceduresSection(ProceduresSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersSection(EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareSection(PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivity(PlanOfCareActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivityProcedure(PlanOfCareActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySubstanceAdministration(PlanOfCareActivitySubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlanOfCareActivitySupply(PlanOfCareActivitySupply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunizations Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunizationsSection(ImmunizationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsSection(VitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Signs Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignsOrganizer(VitalSignsOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Equipment Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalEquipmentSection(MedicalEquipmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusSection(FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directives Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveObservation(AdvanceDirectiveObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payers Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayersSection(PayersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageActivity(CoverageActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicyActivity(PolicyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeSection(PurposeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Purpose Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePurposeActivity(PurposeActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemObservation(ProblemObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemStatusObservation(ProblemStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatusObservation(StatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Health Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Health Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemHealthStatusObservation(ProblemHealthStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Age Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgeObservation(AgeObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Awareness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Awareness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientAwareness(PatientAwareness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryObservation(FamilyHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family History Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyHistoryOrganizer(FamilyHistoryOrganizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social History Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialHistoryObservation(SocialHistoryObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounters Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncountersActivity(EncountersActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationActivity(MedicationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Series Number Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSeriesNumberObservation(MedicationSeriesNumberObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationStatusObservation(MedicationStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientInstruction(PatientInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplyActivity(SupplyActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fulfillment Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fulfillment Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFulfillmentInstruction(FulfillmentInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertObservation(AlertObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alert Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alert Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlertStatusObservation(AlertStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reaction Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactionObservation(ReactionObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Severity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeverityObservation(SeverityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause Of Death Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause Of Death Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCauseOfDeathObservation(CauseOfDeathObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterLocation(EncounterLocation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveStatusObservation(AdvanceDirectiveStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Advance Directive Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdvanceDirectiveVerification(AdvanceDirectiveVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorizationActivity(AuthorizationActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivity(ProcedureActivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Status Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Status Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalStatusObservation(FunctionalStatusObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductInstance(ProductInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityAct(ProcedureActivityAct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityObservation(ProcedureActivityObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureActivityProcedure(ProcedureActivityProcedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Payer Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Payer Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePayerEntity(PayerEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Covered Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveredParty(CoveredParty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Policy Subscriber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePolicySubscriber(PolicySubscriber object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Plan Description</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Plan Description</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoveragePlanDescription(CoveragePlanDescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportParticipant(SupportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupport(Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Support Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupportGuardian(SupportGuardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComment(Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCCDRegistryDelegate(CCDRegistryDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAct(Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalDocument(ClinicalDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalStatement(ClinicalStatement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Act</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObservation(Observation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Organizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrganizer(Organizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounter(Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedure(Procedure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupply(Supply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipation(Participation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant2(Participant2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRole(Role object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manufactured Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManufacturedProduct(ManufacturedProduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant Role</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipantRole(ParticipantRole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assigned Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssignedEntity(AssignedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Participant1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParticipant1(Participant1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardian(Guardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registry Delegate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegistryDelegate(RegistryDelegate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CCDSwitch
