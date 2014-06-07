/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Guardian;
import org.openhealthtools.mdht.uml.cda.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Participant1;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.RegistryDelegate;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ContinuityOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivity;
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Comment;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPRegistryDelegate;
import org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationCombinationMedication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationConditionalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationNormalDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationSplitDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Procedure;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.Support;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian;
import org.openhealthtools.mdht.uml.cda.hitsp.SupportParticipant;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.UnstructuredDocument;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDose;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterActivity;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HealthcareProvidersPharmacies;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContact;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ihe.ProductEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ScannedDocument;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDose;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
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
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage
 * @generated
 */
public class HITSPSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HITSPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HITSPSwitch() {
		if (modelPackage == null) {
			modelPackage = HITSPPackage.eINSTANCE;
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
			case HITSPPackage.ALLERGY_DRUG_SENSITIVITY: {
				AllergyDrugSensitivity allergyDrugSensitivity = (AllergyDrugSensitivity)theEObject;
				T result = caseAllergyDrugSensitivity(allergyDrugSensitivity);
				if (result == null) result = caseAllergyIntoleranceConcern(allergyDrugSensitivity);
				if (result == null) result = caseConcernEntry(allergyDrugSensitivity);
				if (result == null) result = caseProblemAct(allergyDrugSensitivity);
				if (result == null) result = caseCDA_Act(allergyDrugSensitivity);
				if (result == null) result = caseClinicalStatement(allergyDrugSensitivity);
				if (result == null) result = caseAct(allergyDrugSensitivity);
				if (result == null) result = caseInfrastructureRoot(allergyDrugSensitivity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseIHE_Medication(medication);
				if (result == null) result = caseMedicationActivity(medication);
				if (result == null) result = caseSubstanceAdministration(medication);
				if (result == null) result = caseClinicalStatement(medication);
				if (result == null) result = caseAct(medication);
				if (result == null) result = caseInfrastructureRoot(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = caseProblemConcernEntry(condition);
				if (result == null) result = caseConcernEntry(condition);
				if (result == null) result = caseProblemAct(condition);
				if (result == null) result = caseCDA_Act(condition);
				if (result == null) result = caseClinicalStatement(condition);
				if (result == null) result = caseAct(condition);
				if (result == null) result = caseInfrastructureRoot(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.CONDITION_ENTRY: {
				ConditionEntry conditionEntry = (ConditionEntry)theEObject;
				T result = caseConditionEntry(conditionEntry);
				if (result == null) result = caseProblemEntry(conditionEntry);
				if (result == null) result = caseProblemObservation(conditionEntry);
				if (result == null) result = caseObservation(conditionEntry);
				if (result == null) result = caseClinicalStatement(conditionEntry);
				if (result == null) result = caseAct(conditionEntry);
				if (result == null) result = caseInfrastructureRoot(conditionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PATIENT_SUMMARY: {
				PatientSummary patientSummary = (PatientSummary)theEObject;
				T result = casePatientSummary(patientSummary);
				if (result == null) result = caseContinuityOfCareDocument(patientSummary);
				if (result == null) result = caseMedicalDocument(patientSummary);
				if (result == null) result = caseGeneralHeaderConstraints(patientSummary);
				if (result == null) result = caseClinicalDocument(patientSummary);
				if (result == null) result = caseAct(patientSummary);
				if (result == null) result = caseInfrastructureRoot(patientSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PROBLEM_LIST_SECTION: {
				ProblemListSection problemListSection = (ProblemListSection)theEObject;
				T result = caseProblemListSection(problemListSection);
				if (result == null) result = caseActiveProblemsSection(problemListSection);
				if (result == null) result = caseProblemSection(problemListSection);
				if (result == null) result = caseSection(problemListSection);
				if (result == null) result = caseAct(problemListSection);
				if (result == null) result = caseInfrastructureRoot(problemListSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection)theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) result = caseIHE_MedicationsSection(medicationsSection);
				if (result == null) result = caseCCD_MedicationsSection(medicationsSection);
				if (result == null) result = caseSection(medicationsSection);
				if (result == null) result = caseAct(medicationsSection);
				if (result == null) result = caseInfrastructureRoot(medicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection)theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseCodedAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseIHE_AdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseCCD_AdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseSection(advanceDirectivesSection);
				if (result == null) result = caseAct(advanceDirectivesSection);
				if (result == null) result = caseInfrastructureRoot(advanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ALLERGIES_REACTIONS_SECTION: {
				AllergiesReactionsSection allergiesReactionsSection = (AllergiesReactionsSection)theEObject;
				T result = caseAllergiesReactionsSection(allergiesReactionsSection);
				if (result == null) result = caseIHE_AllergiesReactionsSection(allergiesReactionsSection);
				if (result == null) result = caseAlertsSection(allergiesReactionsSection);
				if (result == null) result = caseSection(allergiesReactionsSection);
				if (result == null) result = caseAct(allergiesReactionsSection);
				if (result == null) result = caseInfrastructureRoot(allergiesReactionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ENCOUNTERS_SECTION: {
				EncountersSection encountersSection = (EncountersSection)theEObject;
				T result = caseEncountersSection(encountersSection);
				if (result == null) result = caseEncounterHistorySection(encountersSection);
				if (result == null) result = caseCCD_EncountersSection(encountersSection);
				if (result == null) result = caseSection(encountersSection);
				if (result == null) result = caseAct(encountersSection);
				if (result == null) result = caseInfrastructureRoot(encountersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ENCOUNTER: {
				Encounter encounter = (Encounter)theEObject;
				T result = caseEncounter(encounter);
				if (result == null) result = caseEncounterActivity(encounter);
				if (result == null) result = caseEncounterEntry(encounter);
				if (result == null) result = caseEncountersActivity(encounter);
				if (result == null) result = caseCDA_Encounter(encounter);
				if (result == null) result = caseClinicalStatement(encounter);
				if (result == null) result = caseAct(encounter);
				if (result == null) result = caseInfrastructureRoot(encounter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection)theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) result = caseIHE_ImmunizationsSection(immunizationsSection);
				if (result == null) result = caseCCD_ImmunizationsSection(immunizationsSection);
				if (result == null) result = caseSection(immunizationsSection);
				if (result == null) result = caseAct(immunizationsSection);
				if (result == null) result = caseInfrastructureRoot(immunizationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.IMMUNIZATION: {
				Immunization immunization = (Immunization)theEObject;
				T result = caseImmunization(immunization);
				if (result == null) result = caseIHE_Immunization(immunization);
				if (result == null) result = caseMedicationActivity(immunization);
				if (result == null) result = caseSubstanceAdministration(immunization);
				if (result == null) result = caseClinicalStatement(immunization);
				if (result == null) result = caseAct(immunization);
				if (result == null) result = caseInfrastructureRoot(immunization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection)theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) result = caseIHE_PayersSection(payersSection);
				if (result == null) result = caseCCD_PayersSection(payersSection);
				if (result == null) result = caseSection(payersSection);
				if (result == null) result = caseAct(payersSection);
				if (result == null) result = caseInfrastructureRoot(payersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.SURGERIES_SECTION: {
				SurgeriesSection surgeriesSection = (SurgeriesSection)theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
				if (result == null) result = caseCodedSurgeriesSection(surgeriesSection);
				if (result == null) result = caseIHE_SurgeriesSection(surgeriesSection);
				if (result == null) result = caseProceduresSection(surgeriesSection);
				if (result == null) result = caseSection(surgeriesSection);
				if (result == null) result = caseAct(surgeriesSection);
				if (result == null) result = caseInfrastructureRoot(surgeriesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PROCEDURE: {
				Procedure procedure = (Procedure)theEObject;
				T result = caseProcedure(procedure);
				if (result == null) result = caseProcedureEntryProcedureActivityProcedure(procedure);
				if (result == null) result = caseProcedureActivityProcedure(procedure);
				if (result == null) result = caseProcedureEntry(procedure);
				if (result == null) result = caseCDA_Procedure(procedure);
				if (result == null) result = caseProcedureActivity(procedure);
				if (result == null) result = caseClinicalStatement(procedure);
				if (result == null) result = caseAct(procedure);
				if (result == null) result = caseInfrastructureRoot(procedure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PLAN_OF_CARE_SECTION: {
				PlanOfCareSection planOfCareSection = (PlanOfCareSection)theEObject;
				T result = casePlanOfCareSection(planOfCareSection);
				if (result == null) result = caseCarePlanSection(planOfCareSection);
				if (result == null) result = caseCCD_PlanOfCareSection(planOfCareSection);
				if (result == null) result = caseSection(planOfCareSection);
				if (result == null) result = caseAct(planOfCareSection);
				if (result == null) result = caseInfrastructureRoot(planOfCareSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection)theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseCodedVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseIHE_VitalSignsSection(vitalSignsSection);
				if (result == null) result = caseCCD_VitalSignsSection(vitalSignsSection);
				if (result == null) result = caseSection(vitalSignsSection);
				if (result == null) result = caseAct(vitalSignsSection);
				if (result == null) result = caseInfrastructureRoot(vitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.DIAGNOSTIC_RESULTS_SECTION: {
				DiagnosticResultsSection diagnosticResultsSection = (DiagnosticResultsSection)theEObject;
				T result = caseDiagnosticResultsSection(diagnosticResultsSection);
				if (result == null) result = caseCodedResultsSection(diagnosticResultsSection);
				if (result == null) result = caseSection(diagnosticResultsSection);
				if (result == null) result = caseAct(diagnosticResultsSection);
				if (result == null) result = caseInfrastructureRoot(diagnosticResultsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = caseResultObservation(result);
				if (theResult == null) theResult = caseSimpleObservation(result);
				if (theResult == null) theResult = caseObservation(result);
				if (theResult == null) theResult = caseClinicalStatement(result);
				if (theResult == null) theResult = caseAct(result);
				if (theResult == null) theResult = caseInfrastructureRoot(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case HITSPPackage.VITAL_SIGN: {
				VitalSign vitalSign = (VitalSign)theEObject;
				T result = caseVitalSign(vitalSign);
				if (result == null) result = caseVitalSignObservation(vitalSign);
				if (result == null) result = caseResultObservation(vitalSign);
				if (result == null) result = caseSimpleObservation(vitalSign);
				if (result == null) result = caseObservation(vitalSign);
				if (result == null) result = caseClinicalStatement(vitalSign);
				if (result == null) result = caseAct(vitalSign);
				if (result == null) result = caseInfrastructureRoot(vitalSign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				HistoryOfPastIllnessSection historyOfPastIllnessSection = (HistoryOfPastIllnessSection)theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) result = caseIHE_HistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) result = caseSection(historyOfPastIllnessSection);
				if (result == null) result = caseAct(historyOfPastIllnessSection);
				if (result == null) result = caseInfrastructureRoot(historyOfPastIllnessSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection)theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) result = caseIHE_ChiefComplaintSection(chiefComplaintSection);
				if (result == null) result = caseSection(chiefComplaintSection);
				if (result == null) result = caseAct(chiefComplaintSection);
				if (result == null) result = caseInfrastructureRoot(chiefComplaintSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection)theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) result = caseIHE_ReasonForReferralSection(reasonForReferralSection);
				if (result == null) result = caseSection(reasonForReferralSection);
				if (result == null) result = caseAct(reasonForReferralSection);
				if (result == null) result = caseInfrastructureRoot(reasonForReferralSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HISTORY_OF_PRESENT_ILLNESS: {
				HistoryOfPresentIllness historyOfPresentIllness = (HistoryOfPresentIllness)theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) result = caseIHE_HistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) result = caseSection(historyOfPresentIllness);
				if (result == null) result = caseAct(historyOfPresentIllness);
				if (result == null) result = caseInfrastructureRoot(historyOfPresentIllness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.FUNCTIONAL_STATUS_SECTION: {
				FunctionalStatusSection functionalStatusSection = (FunctionalStatusSection)theEObject;
				T result = caseFunctionalStatusSection(functionalStatusSection);
				if (result == null) result = caseCCD_FunctionalStatusSection(functionalStatusSection);
				if (result == null) result = caseSection(functionalStatusSection);
				if (result == null) result = caseAct(functionalStatusSection);
				if (result == null) result = caseInfrastructureRoot(functionalStatusSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection)theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseIHE_HospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseAct(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(hospitalAdmissionDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.DISCHARGE_DIAGNOSIS_SECTION: {
				DischargeDiagnosisSection dischargeDiagnosisSection = (DischargeDiagnosisSection)theEObject;
				T result = caseDischargeDiagnosisSection(dischargeDiagnosisSection);
				if (result == null) result = caseIHE_DischargeDiagnosisSection(dischargeDiagnosisSection);
				if (result == null) result = caseSection(dischargeDiagnosisSection);
				if (result == null) result = caseAct(dischargeDiagnosisSection);
				if (result == null) result = caseInfrastructureRoot(dischargeDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ADMISSION_MEDICATION_HISTORY_SECTION: {
				AdmissionMedicationHistorySection admissionMedicationHistorySection = (AdmissionMedicationHistorySection)theEObject;
				T result = caseAdmissionMedicationHistorySection(admissionMedicationHistorySection);
				if (result == null) result = caseIHE_AdmissionMedicationHistorySection(admissionMedicationHistorySection);
				if (result == null) result = caseSection(admissionMedicationHistorySection);
				if (result == null) result = caseAct(admissionMedicationHistorySection);
				if (result == null) result = caseInfrastructureRoot(admissionMedicationHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection)theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseIHE_HospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseAct(hospitalDischargeMedicationsSection);
				if (result == null) result = caseInfrastructureRoot(hospitalDischargeMedicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection)theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) result = caseIHE_MedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) result = caseSection(medicationsAdministeredSection);
				if (result == null) result = caseAct(medicationsAdministeredSection);
				if (result == null) result = caseInfrastructureRoot(medicationsAdministeredSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection)theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) result = caseIHE_PhysicalExamSection(physicalExamSection);
				if (result == null) result = casePhysicalExamNarrativeSection(physicalExamSection);
				if (result == null) result = caseSection(physicalExamSection);
				if (result == null) result = caseAct(physicalExamSection);
				if (result == null) result = caseInfrastructureRoot(physicalExamSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection)theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) result = caseIHE_ReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) result = caseSection(reviewOfSystemsSection);
				if (result == null) result = caseAct(reviewOfSystemsSection);
				if (result == null) result = caseInfrastructureRoot(reviewOfSystemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HOSPITAL_COURSE_SECTION: {
				HospitalCourseSection hospitalCourseSection = (HospitalCourseSection)theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) result = caseIHE_HospitalCourseSection(hospitalCourseSection);
				if (result == null) result = caseSection(hospitalCourseSection);
				if (result == null) result = caseAct(hospitalCourseSection);
				if (result == null) result = caseInfrastructureRoot(hospitalCourseSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection)theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) result = caseIHE_AssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) result = caseSection(assessmentAndPlanSection);
				if (result == null) result = caseAct(assessmentAndPlanSection);
				if (result == null) result = caseInfrastructureRoot(assessmentAndPlanSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.FAMILY_HISTORY_SECTION: {
				FamilyHistorySection familyHistorySection = (FamilyHistorySection)theEObject;
				T result = caseFamilyHistorySection(familyHistorySection);
				if (result == null) result = caseFamilyMedicalHistorySection(familyHistorySection);
				if (result == null) result = caseCCD_FamilyHistorySection(familyHistorySection);
				if (result == null) result = caseSection(familyHistorySection);
				if (result == null) result = caseAct(familyHistorySection);
				if (result == null) result = caseInfrastructureRoot(familyHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection)theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) result = caseIHE_SocialHistorySection(socialHistorySection);
				if (result == null) result = caseCCD_SocialHistorySection(socialHistorySection);
				if (result == null) result = caseSection(socialHistorySection);
				if (result == null) result = caseAct(socialHistorySection);
				if (result == null) result = caseInfrastructureRoot(socialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICAL_EQUIPMENT_SECTION: {
				MedicalEquipmentSection medicalEquipmentSection = (MedicalEquipmentSection)theEObject;
				T result = caseMedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) result = caseMedicalDevicesSection(medicalEquipmentSection);
				if (result == null) result = caseCCD_MedicalEquipmentSection(medicalEquipmentSection);
				if (result == null) result = caseSection(medicalEquipmentSection);
				if (result == null) result = caseAct(medicalEquipmentSection);
				if (result == null) result = caseInfrastructureRoot(medicalEquipmentSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.LANGUAGE_SPOKEN: {
				LanguageSpoken languageSpoken = (LanguageSpoken)theEObject;
				T result = caseLanguageSpoken(languageSpoken);
				if (result == null) result = caseIHE_LanguageCommunication(languageSpoken);
				if (result == null) result = caseLanguageCommunication(languageSpoken);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.INSURANCE_PROVIDER: {
				InsuranceProvider insuranceProvider = (InsuranceProvider)theEObject;
				T result = caseInsuranceProvider(insuranceProvider);
				if (result == null) result = caseCoverageEntry(insuranceProvider);
				if (result == null) result = caseCoverageActivity(insuranceProvider);
				if (result == null) result = caseCDA_Act(insuranceProvider);
				if (result == null) result = caseClinicalStatement(insuranceProvider);
				if (result == null) result = caseAct(insuranceProvider);
				if (result == null) result = caseInfrastructureRoot(insuranceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HEALTHCARE_PROVIDER: {
				HealthcareProvider healthcareProvider = (HealthcareProvider)theEObject;
				T result = caseHealthcareProvider(healthcareProvider);
				if (result == null) result = caseHealthcareProvidersPharmacies(healthcareProvider);
				if (result == null) result = casePerformer1(healthcareProvider);
				if (result == null) result = caseParticipation(healthcareProvider);
				if (result == null) result = caseInfrastructureRoot(healthcareProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.COMMENT: {
				Comment comment = (Comment)theEObject;
				T result = caseComment(comment);
				if (result == null) result = caseIHE_Comment(comment);
				if (result == null) result = caseCCD_Comment(comment);
				if (result == null) result = caseCDA_Act(comment);
				if (result == null) result = caseClinicalStatement(comment);
				if (result == null) result = caseAct(comment);
				if (result == null) result = caseInfrastructureRoot(comment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_NORMAL_DOSE: {
				MedicationNormalDose medicationNormalDose = (MedicationNormalDose)theEObject;
				T result = caseMedicationNormalDose(medicationNormalDose);
				if (result == null) result = caseMedication(medicationNormalDose);
				if (result == null) result = caseNormalDose(medicationNormalDose);
				if (result == null) result = caseIHE_Medication(medicationNormalDose);
				if (result == null) result = caseMedicationActivity(medicationNormalDose);
				if (result == null) result = caseSubstanceAdministration(medicationNormalDose);
				if (result == null) result = caseClinicalStatement(medicationNormalDose);
				if (result == null) result = caseAct(medicationNormalDose);
				if (result == null) result = caseInfrastructureRoot(medicationNormalDose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_SPLIT_DOSE: {
				MedicationSplitDose medicationSplitDose = (MedicationSplitDose)theEObject;
				T result = caseMedicationSplitDose(medicationSplitDose);
				if (result == null) result = caseMedication(medicationSplitDose);
				if (result == null) result = caseSplitDose(medicationSplitDose);
				if (result == null) result = caseIHE_Medication(medicationSplitDose);
				if (result == null) result = caseMedicationActivity(medicationSplitDose);
				if (result == null) result = caseSubstanceAdministration(medicationSplitDose);
				if (result == null) result = caseClinicalStatement(medicationSplitDose);
				if (result == null) result = caseAct(medicationSplitDose);
				if (result == null) result = caseInfrastructureRoot(medicationSplitDose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_TAPERED_DOSE: {
				MedicationTaperedDose medicationTaperedDose = (MedicationTaperedDose)theEObject;
				T result = caseMedicationTaperedDose(medicationTaperedDose);
				if (result == null) result = caseMedication(medicationTaperedDose);
				if (result == null) result = caseTaperedDose(medicationTaperedDose);
				if (result == null) result = caseIHE_Medication(medicationTaperedDose);
				if (result == null) result = caseMedicationActivity(medicationTaperedDose);
				if (result == null) result = caseSubstanceAdministration(medicationTaperedDose);
				if (result == null) result = caseClinicalStatement(medicationTaperedDose);
				if (result == null) result = caseAct(medicationTaperedDose);
				if (result == null) result = caseInfrastructureRoot(medicationTaperedDose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_CONDITIONAL_DOSE: {
				MedicationConditionalDose medicationConditionalDose = (MedicationConditionalDose)theEObject;
				T result = caseMedicationConditionalDose(medicationConditionalDose);
				if (result == null) result = caseConditionalDose(medicationConditionalDose);
				if (result == null) result = caseMedication(medicationConditionalDose);
				if (result == null) result = caseIHE_Medication(medicationConditionalDose);
				if (result == null) result = caseMedicationActivity(medicationConditionalDose);
				if (result == null) result = caseSubstanceAdministration(medicationConditionalDose);
				if (result == null) result = caseClinicalStatement(medicationConditionalDose);
				if (result == null) result = caseAct(medicationConditionalDose);
				if (result == null) result = caseInfrastructureRoot(medicationConditionalDose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_COMBINATION_MEDICATION: {
				MedicationCombinationMedication medicationCombinationMedication = (MedicationCombinationMedication)theEObject;
				T result = caseMedicationCombinationMedication(medicationCombinationMedication);
				if (result == null) result = caseCombinationMedication(medicationCombinationMedication);
				if (result == null) result = caseMedication(medicationCombinationMedication);
				if (result == null) result = caseIHE_Medication(medicationCombinationMedication);
				if (result == null) result = caseMedicationActivity(medicationCombinationMedication);
				if (result == null) result = caseSubstanceAdministration(medicationCombinationMedication);
				if (result == null) result = caseClinicalStatement(medicationCombinationMedication);
				if (result == null) result = caseAct(medicationCombinationMedication);
				if (result == null) result = caseInfrastructureRoot(medicationCombinationMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.SUPPORT: {
				Support support = (Support)theEObject;
				T result = caseSupport(support);
				if (result == null) result = casePatientContact(support);
				if (result == null) result = caseCCD_Support(support);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.SUPPORT_GUARDIAN: {
				SupportGuardian supportGuardian = (SupportGuardian)theEObject;
				T result = caseSupportGuardian(supportGuardian);
				if (result == null) result = casePatientContactGuardian(supportGuardian);
				if (result == null) result = caseSupport(supportGuardian);
				if (result == null) result = caseCCD_SupportGuardian(supportGuardian);
				if (result == null) result = casePatientContact(supportGuardian);
				if (result == null) result = caseGuardian(supportGuardian);
				if (result == null) result = caseCCD_Support(supportGuardian);
				if (result == null) result = caseRole(supportGuardian);
				if (result == null) result = caseInfrastructureRoot(supportGuardian);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.SUPPORT_PARTICIPANT: {
				SupportParticipant supportParticipant = (SupportParticipant)theEObject;
				T result = caseSupportParticipant(supportParticipant);
				if (result == null) result = casePatientContactParticipant(supportParticipant);
				if (result == null) result = caseSupport(supportParticipant);
				if (result == null) result = caseCCD_SupportParticipant(supportParticipant);
				if (result == null) result = casePatientContact(supportParticipant);
				if (result == null) result = caseParticipant1(supportParticipant);
				if (result == null) result = caseCCD_Support(supportParticipant);
				if (result == null) result = caseParticipation(supportParticipant);
				if (result == null) result = caseInfrastructureRoot(supportParticipant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.UNSTRUCTURED_DOCUMENT: {
				UnstructuredDocument unstructuredDocument = (UnstructuredDocument)theEObject;
				T result = caseUnstructuredDocument(unstructuredDocument);
				if (result == null) result = caseMedicalDocument(unstructuredDocument);
				if (result == null) result = caseScannedDocument(unstructuredDocument);
				if (result == null) result = caseGeneralHeaderConstraints(unstructuredDocument);
				if (result == null) result = caseClinicalDocument(unstructuredDocument);
				if (result == null) result = caseAct(unstructuredDocument);
				if (result == null) result = caseInfrastructureRoot(unstructuredDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.MEDICATION_INFORMATION: {
				MedicationInformation medicationInformation = (MedicationInformation)theEObject;
				T result = caseMedicationInformation(medicationInformation);
				if (result == null) result = caseProductEntry(medicationInformation);
				if (result == null) result = caseProduct(medicationInformation);
				if (result == null) result = caseManufacturedProduct(medicationInformation);
				if (result == null) result = caseRole(medicationInformation);
				if (result == null) result = caseInfrastructureRoot(medicationInformation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HITSPPackage.HITSP_REGISTRY_DELEGATE: {
				HITSPRegistryDelegate hitspRegistryDelegate = (HITSPRegistryDelegate)theEObject;
				T result = caseHITSPRegistryDelegate(hitspRegistryDelegate);
				if (result == null) result = caseRegistryDelegate(hitspRegistryDelegate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Drug Sensitivity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Drug Sensitivity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyDrugSensitivity(AllergyDrugSensitivity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEntry(ConditionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientSummary(PatientSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem List Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem List Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemListSection(ProblemListSection object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergiesReactionsSection(AllergiesReactionsSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmunization(Immunization object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurgeriesSection(SurgeriesSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnosticResultsSection(DiagnosticResultsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSign(VitalSign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChiefComplaintSection(ChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReasonForReferralSection(ReasonForReferralSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeDiagnosisSection(DischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdmissionMedicationHistorySection(AdmissionMedicationHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamSection(PhysicalExamSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHospitalCourseSection(HospitalCourseSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Spoken</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageSpoken(LanguageSpoken object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceProvider(InsuranceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareProvider(HealthcareProvider object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Normal Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationNormalDose(MedicationNormalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Split Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationSplitDose(MedicationSplitDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Tapered Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationTaperedDose(MedicationTaperedDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Conditional Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationConditionalDose(MedicationConditionalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Combination Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationCombinationMedication(MedicationCombinationMedication object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unstructured Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnstructuredDocument(UnstructuredDocument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication Information</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicationInformation(MedicationInformation object) {
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
	public T caseHITSPRegistryDelegate(HITSPRegistryDelegate object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concern Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcernEntry(ConcernEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance Concern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance Concern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntoleranceConcern(AllergyIntoleranceConcern object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_Medication(org.openhealthtools.mdht.uml.cda.ihe.Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Problem Concern Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Concern Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemConcernEntry(ProblemConcernEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Problem Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Problem Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProblemEntry(ProblemEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalDocument(MedicalDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Active Problems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active Problems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiveProblemsSection(ActiveProblemsSection object) {
		return null;
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
	public T caseCCD_MedicationsSection(org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection object) {
		return null;
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
	public T caseIHE_MedicationsSection(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection object) {
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
	public T caseCCD_AdvanceDirectivesSection(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection object) {
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
	public T caseIHE_AdvanceDirectivesSection(org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Advance Directives Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Advance Directives Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodedAdvanceDirectivesSection(CodedAdvanceDirectivesSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergies Reactions Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_AllergiesReactionsSection(org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection object) {
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
	public T caseCCD_EncountersSection(org.openhealthtools.mdht.uml.cda.ccd.EncountersSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterHistorySection(EncounterHistorySection object) {
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
	public T caseCDA_Encounter(org.openhealthtools.mdht.uml.cda.Encounter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterEntry(EncounterEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Encounter Activity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encounter Activity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncounterActivity(EncounterActivity object) {
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
	public T caseCCD_ImmunizationsSection(org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection object) {
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
	public T caseIHE_ImmunizationsSection(org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immunization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_Immunization(org.openhealthtools.mdht.uml.cda.ihe.Immunization object) {
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
	public T caseCCD_PayersSection(org.openhealthtools.mdht.uml.cda.ccd.PayersSection object) {
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
	public T caseIHE_PayersSection(org.openhealthtools.mdht.uml.cda.ihe.PayersSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_SurgeriesSection(org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Surgeries Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodedSurgeriesSection(CodedSurgeriesSection object) {
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
	public T caseCDA_Procedure(org.openhealthtools.mdht.uml.cda.Procedure object) {
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
	public T caseCCD_PlanOfCareSection(org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Care Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Care Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCarePlanSection(CarePlanSection object) {
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
	public T caseCCD_VitalSignsSection(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection object) {
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
	public T caseIHE_VitalSignsSection(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Vital Signs Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Vital Signs Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodedVitalSignsSection(CodedVitalSignsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coded Results Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodedResultsSection(CodedResultsSection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simple Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleObservation(SimpleObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vital Sign Observation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVitalSignObservation(VitalSignObservation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Past Illness Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HistoryOfPastIllnessSection(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chief Complaint Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_ChiefComplaintSection(org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reason For Referral Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_ReasonForReferralSection(org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Of Present Illness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HistoryOfPresentIllness(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness object) {
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
	public T caseCCD_FunctionalStatusSection(org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Admission Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HospitalAdmissionDiagnosisSection(org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Diagnosis Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_DischargeDiagnosisSection(org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admission Medication History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_AdmissionMedicationHistorySection(org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Discharge Medications Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HospitalDischargeMedicationsSection(org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medications Administered Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_MedicationsAdministeredSection(org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Narrative Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalExamNarrativeSection(PhysicalExamNarrativeSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Exam Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_PhysicalExamSection(org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Review Of Systems Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_ReviewOfSystemsSection(org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hospital Course Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_HospitalCourseSection(org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assessment And Plan Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_AssessmentAndPlanSection(org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection object) {
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
	public T caseCCD_FamilyHistorySection(org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family Medical History Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family Medical History Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamilyMedicalHistorySection(FamilyMedicalHistorySection object) {
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
	public T caseCCD_SocialHistorySection(org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection object) {
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
	public T caseIHE_SocialHistorySection(org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection object) {
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
	public T caseCCD_MedicalEquipmentSection(org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medical Devices Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Devices Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalDevicesSection(MedicalDevicesSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLanguageCommunication(LanguageCommunication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Language Communication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIHE_LanguageCommunication(org.openhealthtools.mdht.uml.cda.ihe.LanguageCommunication object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Coverage Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coverage Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoverageEntry(CoverageEntry object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performer1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformer1(Performer1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcare Providers Pharmacies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcare Providers Pharmacies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcareProvidersPharmacies(HealthcareProvidersPharmacies object) {
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
	public T caseCCD_Comment(org.openhealthtools.mdht.uml.cda.ccd.Comment object) {
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
	public T caseIHE_Comment(org.openhealthtools.mdht.uml.cda.ihe.Comment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Normal Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDose(NormalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitDose(SplitDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tapered Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tapered Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaperedDose(TaperedDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Dose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Dose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDose(ConditionalDose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Combination Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Combination Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCombinationMedication(CombinationMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEntry(ProcedureEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Entry Procedure Activity Procedure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureEntryProcedureActivityProcedure(ProcedureEntryProcedureActivityProcedure object) {
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
	public T caseCCD_Support(org.openhealthtools.mdht.uml.cda.ccd.Support object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContact(PatientContact object) {
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
	public T caseCCD_SupportGuardian(org.openhealthtools.mdht.uml.cda.ccd.SupportGuardian object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact Guardian</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact Guardian</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContactGuardian(PatientContactGuardian object) {
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
	public T caseCCD_SupportParticipant(org.openhealthtools.mdht.uml.cda.ccd.SupportParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Contact Participant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Contact Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientContactParticipant(PatientContactParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scanned Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scanned Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScannedDocument(ScannedDocument object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Product Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductEntry(ProductEntry object) {
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

} //HITSPSwitch
