/*******************************************************************************
 * Copyright (c) 2009 David A Carlson.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *     
 * $Id$
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ConditionalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.CoverageEntry;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeSummary;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.LanguageCommunication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDocument;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDosing;
import org.openhealthtools.mdht.uml.cda.ihe.PayersSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDosing;
import org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;

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
 * @see org.openhealthtools.mdht.uml.cda.ihe.IHEPackage
 * @generated
 */
public class IHESwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static IHEPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHESwitch() {
		if (modelPackage == null) {
			modelPackage = IHEPackage.eINSTANCE;
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
			case IHEPackage.IMMUNIZATIONS_SECTION: {
				ImmunizationsSection immunizationsSection = (ImmunizationsSection)theEObject;
				T result = caseImmunizationsSection(immunizationsSection);
				if (result == null) result = caseCCD_ImmunizationsSection(immunizationsSection);
				if (result == null) result = caseSection(immunizationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICATIONS_ADMINISTERED_SECTION: {
				MedicationsAdministeredSection medicationsAdministeredSection = (MedicationsAdministeredSection)theEObject;
				T result = caseMedicationsAdministeredSection(medicationsAdministeredSection);
				if (result == null) result = caseSection(medicationsAdministeredSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CONCERN_ENTRY: {
				ConcernEntry concernEntry = (ConcernEntry)theEObject;
				T result = caseConcernEntry(concernEntry);
				if (result == null) result = caseProblemAct(concernEntry);
				if (result == null) result = caseAct(concernEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICAL_DOCUMENT: {
				MedicalDocument medicalDocument = (MedicalDocument)theEObject;
				T result = caseMedicalDocument(medicalDocument);
				if (result == null) result = caseClinicalDocument(medicalDocument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ACTIVE_PROBLEMS_SECTION: {
				ActiveProblemsSection activeProblemsSection = (ActiveProblemsSection)theEObject;
				T result = caseActiveProblemsSection(activeProblemsSection);
				if (result == null) result = caseProblemSection(activeProblemsSection);
				if (result == null) result = caseSection(activeProblemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.PROBLEM_CONCERN_ENTRY: {
				ProblemConcernEntry problemConcernEntry = (ProblemConcernEntry)theEObject;
				T result = caseProblemConcernEntry(problemConcernEntry);
				if (result == null) result = caseConcernEntry(problemConcernEntry);
				if (result == null) result = caseProblemAct(problemConcernEntry);
				if (result == null) result = caseAct(problemConcernEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.PROBLEM_ENTRY: {
				ProblemEntry problemEntry = (ProblemEntry)theEObject;
				T result = caseProblemEntry(problemEntry);
				if (result == null) result = caseProblemObservation(problemEntry);
				if (result == null) result = caseObservation(problemEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICATION: {
				Medication medication = (Medication)theEObject;
				T result = caseMedication(medication);
				if (result == null) result = caseMedicationActivity(medication);
				if (result == null) result = caseSubstanceAdministration(medication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICATIONS_SECTION: {
				MedicationsSection medicationsSection = (MedicationsSection)theEObject;
				T result = caseMedicationsSection(medicationsSection);
				if (result == null) result = caseCCD_MedicationsSection(medicationsSection);
				if (result == null) result = caseSection(medicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ALLERGY_INTOLERANCE_CONCERN: {
				AllergyIntoleranceConcern allergyIntoleranceConcern = (AllergyIntoleranceConcern)theEObject;
				T result = caseAllergyIntoleranceConcern(allergyIntoleranceConcern);
				if (result == null) result = caseConcernEntry(allergyIntoleranceConcern);
				if (result == null) result = caseProblemAct(allergyIntoleranceConcern);
				if (result == null) result = caseAct(allergyIntoleranceConcern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ALLERGY_INTOLERANCE: {
				AllergyIntolerance allergyIntolerance = (AllergyIntolerance)theEObject;
				T result = caseAllergyIntolerance(allergyIntolerance);
				if (result == null) result = caseProblemEntry(allergyIntolerance);
				if (result == null) result = caseProblemObservation(allergyIntolerance);
				if (result == null) result = caseObservation(allergyIntolerance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ALLERGIES_REACTIONS_SECTION: {
				AllergiesReactionsSection allergiesReactionsSection = (AllergiesReactionsSection)theEObject;
				T result = caseAllergiesReactionsSection(allergiesReactionsSection);
				if (result == null) result = caseAlertsSection(allergiesReactionsSection);
				if (result == null) result = caseSection(allergiesReactionsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.NORMAL_DOSING: {
				NormalDosing normalDosing = (NormalDosing)theEObject;
				T result = caseNormalDosing(normalDosing);
				if (result == null) result = caseMedication(normalDosing);
				if (result == null) result = caseMedicationActivity(normalDosing);
				if (result == null) result = caseSubstanceAdministration(normalDosing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.TAPERED_DOSE: {
				TaperedDose taperedDose = (TaperedDose)theEObject;
				T result = caseTaperedDose(taperedDose);
				if (result == null) result = caseMedication(taperedDose);
				if (result == null) result = caseMedicationActivity(taperedDose);
				if (result == null) result = caseSubstanceAdministration(taperedDose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.SPLIT_DOSING: {
				SplitDosing splitDosing = (SplitDosing)theEObject;
				T result = caseSplitDosing(splitDosing);
				if (result == null) result = caseMedication(splitDosing);
				if (result == null) result = caseMedicationActivity(splitDosing);
				if (result == null) result = caseSubstanceAdministration(splitDosing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CONDITIONAL_DOSING: {
				ConditionalDosing conditionalDosing = (ConditionalDosing)theEObject;
				T result = caseConditionalDosing(conditionalDosing);
				if (result == null) result = caseMedication(conditionalDosing);
				if (result == null) result = caseMedicationActivity(conditionalDosing);
				if (result == null) result = caseSubstanceAdministration(conditionalDosing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.COMBINATION_MEDICATION: {
				CombinationMedication combinationMedication = (CombinationMedication)theEObject;
				T result = caseCombinationMedication(combinationMedication);
				if (result == null) result = caseMedication(combinationMedication);
				if (result == null) result = caseMedicationActivity(combinationMedication);
				if (result == null) result = caseSubstanceAdministration(combinationMedication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.VITAL_SIGNS_SECTION: {
				VitalSignsSection vitalSignsSection = (VitalSignsSection)theEObject;
				T result = caseVitalSignsSection(vitalSignsSection);
				if (result == null) result = caseCCD_VitalSignsSection(vitalSignsSection);
				if (result == null) result = caseSection(vitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CODED_VITAL_SIGNS_SECTION: {
				CodedVitalSignsSection codedVitalSignsSection = (CodedVitalSignsSection)theEObject;
				T result = caseCodedVitalSignsSection(codedVitalSignsSection);
				if (result == null) result = caseVitalSignsSection(codedVitalSignsSection);
				if (result == null) result = caseCCD_VitalSignsSection(codedVitalSignsSection);
				if (result == null) result = caseSection(codedVitalSignsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.VITAL_SIGN_OBSERVATION: {
				VitalSignObservation vitalSignObservation = (VitalSignObservation)theEObject;
				T result = caseVitalSignObservation(vitalSignObservation);
				if (result == null) result = caseResultObservation(vitalSignObservation);
				if (result == null) result = caseObservation(vitalSignObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.SIMPLE_OBSERVATION: {
				SimpleObservation simpleObservation = (SimpleObservation)theEObject;
				T result = caseSimpleObservation(simpleObservation);
				if (result == null) result = caseObservation(simpleObservation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.VITAL_SIGNS_ORGANIZER: {
				VitalSignsOrganizer vitalSignsOrganizer = (VitalSignsOrganizer)theEObject;
				T result = caseVitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseCCD_VitalSignsOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseResultOrganizer(vitalSignsOrganizer);
				if (result == null) result = caseOrganizer(vitalSignsOrganizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.PAYERS_SECTION: {
				PayersSection payersSection = (PayersSection)theEObject;
				T result = casePayersSection(payersSection);
				if (result == null) result = caseCCD_PayersSection(payersSection);
				if (result == null) result = caseSection(payersSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.HISTORY_OF_PAST_ILLNESS_SECTION: {
				HistoryOfPastIllnessSection historyOfPastIllnessSection = (HistoryOfPastIllnessSection)theEObject;
				T result = caseHistoryOfPastIllnessSection(historyOfPastIllnessSection);
				if (result == null) result = caseSection(historyOfPastIllnessSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CHIEF_COMPLAINT_SECTION: {
				ChiefComplaintSection chiefComplaintSection = (ChiefComplaintSection)theEObject;
				T result = caseChiefComplaintSection(chiefComplaintSection);
				if (result == null) result = caseSection(chiefComplaintSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.REASON_FOR_REFERRAL_SECTION: {
				ReasonForReferralSection reasonForReferralSection = (ReasonForReferralSection)theEObject;
				T result = caseReasonForReferralSection(reasonForReferralSection);
				if (result == null) result = caseSection(reasonForReferralSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.HISTORY_OF_PRESENT_ILLNESS: {
				HistoryOfPresentIllness historyOfPresentIllness = (HistoryOfPresentIllness)theEObject;
				T result = caseHistoryOfPresentIllness(historyOfPresentIllness);
				if (result == null) result = caseSection(historyOfPresentIllness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.SURGERIES_SECTION: {
				SurgeriesSection surgeriesSection = (SurgeriesSection)theEObject;
				T result = caseSurgeriesSection(surgeriesSection);
				if (result == null) result = caseProceduresSection(surgeriesSection);
				if (result == null) result = caseSection(surgeriesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CODED_SURGERIES_SECTION: {
				CodedSurgeriesSection codedSurgeriesSection = (CodedSurgeriesSection)theEObject;
				T result = caseCodedSurgeriesSection(codedSurgeriesSection);
				if (result == null) result = caseSurgeriesSection(codedSurgeriesSection);
				if (result == null) result = caseProceduresSection(codedSurgeriesSection);
				if (result == null) result = caseSection(codedSurgeriesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.HOSPITAL_ADMISSION_DIAGNOSIS_SECTION: {
				HospitalAdmissionDiagnosisSection hospitalAdmissionDiagnosisSection = (HospitalAdmissionDiagnosisSection)theEObject;
				T result = caseHospitalAdmissionDiagnosisSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = caseSection(hospitalAdmissionDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.DISCHARGE_DIAGNOSIS_SECTION: {
				DischargeDiagnosisSection dischargeDiagnosisSection = (DischargeDiagnosisSection)theEObject;
				T result = caseDischargeDiagnosisSection(dischargeDiagnosisSection);
				if (result == null) result = caseSection(dischargeDiagnosisSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ADMISSION_MEDICATION_HISTORY_SECTION: {
				AdmissionMedicationHistorySection admissionMedicationHistorySection = (AdmissionMedicationHistorySection)theEObject;
				T result = caseAdmissionMedicationHistorySection(admissionMedicationHistorySection);
				if (result == null) result = caseSection(admissionMedicationHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.HOSPITAL_DISCHARGE_MEDICATIONS_SECTION: {
				HospitalDischargeMedicationsSection hospitalDischargeMedicationsSection = (HospitalDischargeMedicationsSection)theEObject;
				T result = caseHospitalDischargeMedicationsSection(hospitalDischargeMedicationsSection);
				if (result == null) result = caseSection(hospitalDischargeMedicationsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CODED_ADVANCE_DIRECTIVES_SECTION: {
				CodedAdvanceDirectivesSection codedAdvanceDirectivesSection = (CodedAdvanceDirectivesSection)theEObject;
				T result = caseCodedAdvanceDirectivesSection(codedAdvanceDirectivesSection);
				if (result == null) result = caseAdvanceDirectivesSection(codedAdvanceDirectivesSection);
				if (result == null) result = caseCCD_AdvanceDirectivesSection(codedAdvanceDirectivesSection);
				if (result == null) result = caseSection(codedAdvanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ADVANCE_DIRECTIVES_SECTION: {
				AdvanceDirectivesSection advanceDirectivesSection = (AdvanceDirectivesSection)theEObject;
				T result = caseAdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseCCD_AdvanceDirectivesSection(advanceDirectivesSection);
				if (result == null) result = caseSection(advanceDirectivesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.PHYSICAL_EXAM_NARRATIVE_SECTION: {
				PhysicalExamNarrativeSection physicalExamNarrativeSection = (PhysicalExamNarrativeSection)theEObject;
				T result = casePhysicalExamNarrativeSection(physicalExamNarrativeSection);
				if (result == null) result = caseSection(physicalExamNarrativeSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.PHYSICAL_EXAM_SECTION: {
				PhysicalExamSection physicalExamSection = (PhysicalExamSection)theEObject;
				T result = casePhysicalExamSection(physicalExamSection);
				if (result == null) result = casePhysicalExamNarrativeSection(physicalExamSection);
				if (result == null) result = caseSection(physicalExamSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.REVIEW_OF_SYSTEMS_SECTION: {
				ReviewOfSystemsSection reviewOfSystemsSection = (ReviewOfSystemsSection)theEObject;
				T result = caseReviewOfSystemsSection(reviewOfSystemsSection);
				if (result == null) result = caseSection(reviewOfSystemsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.HOSPITAL_COURSE_SECTION: {
				HospitalCourseSection hospitalCourseSection = (HospitalCourseSection)theEObject;
				T result = caseHospitalCourseSection(hospitalCourseSection);
				if (result == null) result = caseSection(hospitalCourseSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CODED_RESULTS_SECTION: {
				CodedResultsSection codedResultsSection = (CodedResultsSection)theEObject;
				T result = caseCodedResultsSection(codedResultsSection);
				if (result == null) result = caseSection(codedResultsSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ASSESSMENT_AND_PLAN_SECTION: {
				AssessmentAndPlanSection assessmentAndPlanSection = (AssessmentAndPlanSection)theEObject;
				T result = caseAssessmentAndPlanSection(assessmentAndPlanSection);
				if (result == null) result = caseSection(assessmentAndPlanSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.CARE_PLAN_SECTION: {
				CarePlanSection carePlanSection = (CarePlanSection)theEObject;
				T result = caseCarePlanSection(carePlanSection);
				if (result == null) result = casePlanOfCareSection(carePlanSection);
				if (result == null) result = caseSection(carePlanSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.FAMILY_MEDICAL_HISTORY_SECTION: {
				FamilyMedicalHistorySection familyMedicalHistorySection = (FamilyMedicalHistorySection)theEObject;
				T result = caseFamilyMedicalHistorySection(familyMedicalHistorySection);
				if (result == null) result = caseFamilyHistorySection(familyMedicalHistorySection);
				if (result == null) result = caseSection(familyMedicalHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.SOCIAL_HISTORY_SECTION: {
				SocialHistorySection socialHistorySection = (SocialHistorySection)theEObject;
				T result = caseSocialHistorySection(socialHistorySection);
				if (result == null) result = caseCCD_SocialHistorySection(socialHistorySection);
				if (result == null) result = caseSection(socialHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.ENCOUNTER_HISTORY_SECTION: {
				EncounterHistorySection encounterHistorySection = (EncounterHistorySection)theEObject;
				T result = caseEncounterHistorySection(encounterHistorySection);
				if (result == null) result = caseEncountersSection(encounterHistorySection);
				if (result == null) result = caseSection(encounterHistorySection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICAL_DEVICES_SECTION: {
				MedicalDevicesSection medicalDevicesSection = (MedicalDevicesSection)theEObject;
				T result = caseMedicalDevicesSection(medicalDevicesSection);
				if (result == null) result = caseMedicalEquipmentSection(medicalDevicesSection);
				if (result == null) result = caseSection(medicalDevicesSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.LANGUAGE_COMMUNICATION: {
				LanguageCommunication languageCommunication = (LanguageCommunication)theEObject;
				T result = caseLanguageCommunication(languageCommunication);
				if (result == null) result = caseCDA_LanguageCommunication(languageCommunication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.MEDICAL_SUMMARY: {
				MedicalSummary medicalSummary = (MedicalSummary)theEObject;
				T result = caseMedicalSummary(medicalSummary);
				if (result == null) result = caseMedicalDocument(medicalSummary);
				if (result == null) result = caseClinicalDocument(medicalSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.DISCHARGE_SUMMARY: {
				DischargeSummary dischargeSummary = (DischargeSummary)theEObject;
				T result = caseDischargeSummary(dischargeSummary);
				if (result == null) result = caseMedicalSummary(dischargeSummary);
				if (result == null) result = caseMedicalDocument(dischargeSummary);
				if (result == null) result = caseClinicalDocument(dischargeSummary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case IHEPackage.COVERAGE_ENTRY: {
				CoverageEntry coverageEntry = (CoverageEntry)theEObject;
				T result = caseCoverageEntry(coverageEntry);
				if (result == null) result = caseCoverageActivity(coverageEntry);
				if (result == null) result = caseAct(coverageEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allergy Intolerance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllergyIntolerance(AllergyIntolerance object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Normal Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normal Dosing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNormalDosing(NormalDosing object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Split Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Dosing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitDosing(SplitDosing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Dosing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Dosing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalDosing(ConditionalDosing object) {
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
	public T caseSocialHistorySection(SocialHistorySection object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Medical Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medical Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedicalSummary(MedicalSummary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discharge Summary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDischargeSummary(DischargeSummary object) {
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
	public T caseCCD_VitalSignsOrganizer(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer object) {
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
	public T caseCCD_SocialHistorySection(org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection object) {
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
	public T caseCDA_LanguageCommunication(org.openhealthtools.mdht.uml.cda.LanguageCommunication object) {
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

} //IHESwitch
