/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Result;
import org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage
 * @generated
 */
public class HITSPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HITSPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HITSPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HITSPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HITSPSwitch<Adapter> modelSwitch =
		new HITSPSwitch<Adapter>() {
			@Override
			public Adapter caseAllergyDrugSensitivity(AllergyDrugSensitivity object) {
				return createAllergyDrugSensitivityAdapter();
			}
			@Override
			public Adapter caseMedication(Medication object) {
				return createMedicationAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseConditionEntry(ConditionEntry object) {
				return createConditionEntryAdapter();
			}
			@Override
			public Adapter casePatientSummary(PatientSummary object) {
				return createPatientSummaryAdapter();
			}
			@Override
			public Adapter caseProblemListSection(ProblemListSection object) {
				return createProblemListSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsSection(MedicationsSection object) {
				return createMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseVitalSignsSection(VitalSignsSection object) {
				return createVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseVitalSign(VitalSign object) {
				return createVitalSignAdapter();
			}
			@Override
			public Adapter casePayersSection(PayersSection object) {
				return createPayersSectionAdapter();
			}
			@Override
			public Adapter caseAllergiesReactionsSection(AllergiesReactionsSection object) {
				return createAllergiesReactionsSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPastIllnessSection(HistoryOfPastIllnessSection object) {
				return createHistoryOfPastIllnessSectionAdapter();
			}
			@Override
			public Adapter caseChiefComplaintSection(ChiefComplaintSection object) {
				return createChiefComplaintSectionAdapter();
			}
			@Override
			public Adapter caseReasonForReferralSection(ReasonForReferralSection object) {
				return createReasonForReferralSectionAdapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllness(HistoryOfPresentIllness object) {
				return createHistoryOfPresentIllnessAdapter();
			}
			@Override
			public Adapter caseSurgeriesSection(SurgeriesSection object) {
				return createSurgeriesSectionAdapter();
			}
			@Override
			public Adapter caseFunctionalStatusSection(FunctionalStatusSection object) {
				return createFunctionalStatusSectionAdapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosisSection(HospitalAdmissionDiagnosisSection object) {
				return createHospitalAdmissionDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseDischargeDiagnosisSection(DischargeDiagnosisSection object) {
				return createDischargeDiagnosisSectionAdapter();
			}
			@Override
			public Adapter caseAdmissionMedicationHistorySection(AdmissionMedicationHistorySection object) {
				return createAdmissionMedicationHistorySectionAdapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSection(HospitalDischargeMedicationsSection object) {
				return createHospitalDischargeMedicationsSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection(MedicationsAdministeredSection object) {
				return createMedicationsAdministeredSectionAdapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection(AdvanceDirectivesSection object) {
				return createAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection(ImmunizationsSection object) {
				return createImmunizationsSectionAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection(PhysicalExamSection object) {
				return createPhysicalExamSectionAdapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection(ReviewOfSystemsSection object) {
				return createReviewOfSystemsSectionAdapter();
			}
			@Override
			public Adapter caseHospitalCourseSection(HospitalCourseSection object) {
				return createHospitalCourseSectionAdapter();
			}
			@Override
			public Adapter caseDiagnosticResultsSection(DiagnosticResultsSection object) {
				return createDiagnosticResultsSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection(AssessmentAndPlanSection object) {
				return createAssessmentAndPlanSectionAdapter();
			}
			@Override
			public Adapter casePlanOfCareSection(PlanOfCareSection object) {
				return createPlanOfCareSectionAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySection(FamilyHistorySection object) {
				return createFamilyHistorySectionAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(SocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseEncountersSection(EncountersSection object) {
				return createEncountersSectionAdapter();
			}
			@Override
			public Adapter caseMedicalEquipmentSection(MedicalEquipmentSection object) {
				return createMedicalEquipmentSectionAdapter();
			}
			@Override
			public Adapter caseResult(Result object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseProblemAct(ProblemAct object) {
				return createProblemActAdapter();
			}
			@Override
			public Adapter caseConcernEntry(ConcernEntry object) {
				return createConcernEntryAdapter();
			}
			@Override
			public Adapter caseAllergyIntoleranceConcern(AllergyIntoleranceConcern object) {
				return createAllergyIntoleranceConcernAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseMedicationActivity(MedicationActivity object) {
				return createMedicationActivityAdapter();
			}
			@Override
			public Adapter caseMedication_1(org.openhealthtools.mdht.uml.cda.ihe.Medication object) {
				return createMedication_1Adapter();
			}
			@Override
			public Adapter caseProblemConcernEntry(ProblemConcernEntry object) {
				return createProblemConcernEntryAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseProblemObservation(ProblemObservation object) {
				return createProblemObservationAdapter();
			}
			@Override
			public Adapter caseProblemEntry(ProblemEntry object) {
				return createProblemEntryAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseProblemSection(ProblemSection object) {
				return createProblemSectionAdapter();
			}
			@Override
			public Adapter caseActiveProblemsSection(ActiveProblemsSection object) {
				return createActiveProblemsSectionAdapter();
			}
			@Override
			public Adapter caseMedicationSection(MedicationSection object) {
				return createMedicationSectionAdapter();
			}
			@Override
			public Adapter caseMedicationsSection_1(org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection object) {
				return createMedicationsSection_1Adapter();
			}
			@Override
			public Adapter caseVitalSignsSection_1(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection object) {
				return createVitalSignsSection_1Adapter();
			}
			@Override
			public Adapter caseVitalSignsSection_2(org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection object) {
				return createVitalSignsSection_2Adapter();
			}
			@Override
			public Adapter caseCodedVitalSignsSection(CodedVitalSignsSection object) {
				return createCodedVitalSignsSectionAdapter();
			}
			@Override
			public Adapter caseResultObservation(ResultObservation object) {
				return createResultObservationAdapter();
			}
			@Override
			public Adapter caseVitalSignObservation(VitalSignObservation object) {
				return createVitalSignObservationAdapter();
			}
			@Override
			public Adapter casePayersSection_1(org.openhealthtools.mdht.uml.cda.ccd.PayersSection object) {
				return createPayersSection_1Adapter();
			}
			@Override
			public Adapter casePayersSection_2(org.openhealthtools.mdht.uml.cda.ihe.PayersSection object) {
				return createPayersSection_2Adapter();
			}
			@Override
			public Adapter caseAlertsSection(AlertsSection object) {
				return createAlertsSectionAdapter();
			}
			@Override
			public Adapter caseAllergiesReactionsSection_1(org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection object) {
				return createAllergiesReactionsSection_1Adapter();
			}
			@Override
			public Adapter caseHistoryOfPastIllnessSection_1(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection object) {
				return createHistoryOfPastIllnessSection_1Adapter();
			}
			@Override
			public Adapter caseChiefComplaintSection_1(org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection object) {
				return createChiefComplaintSection_1Adapter();
			}
			@Override
			public Adapter caseReasonForReferralSection_1(org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection object) {
				return createReasonForReferralSection_1Adapter();
			}
			@Override
			public Adapter caseHistoryOfPresentIllness_1(org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness object) {
				return createHistoryOfPresentIllness_1Adapter();
			}
			@Override
			public Adapter caseProceduresSection(ProceduresSection object) {
				return createProceduresSectionAdapter();
			}
			@Override
			public Adapter caseSurgeriesSection_1(org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection object) {
				return createSurgeriesSection_1Adapter();
			}
			@Override
			public Adapter caseCodedSurgeriesSection(CodedSurgeriesSection object) {
				return createCodedSurgeriesSectionAdapter();
			}
			@Override
			public Adapter caseFunctionalStatusSection_1(org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection object) {
				return createFunctionalStatusSection_1Adapter();
			}
			@Override
			public Adapter caseHospitalAdmissionDiagnosisSection_1(org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection object) {
				return createHospitalAdmissionDiagnosisSection_1Adapter();
			}
			@Override
			public Adapter caseDischargeDiagnosisSection_1(org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection object) {
				return createDischargeDiagnosisSection_1Adapter();
			}
			@Override
			public Adapter caseAdmissionMedicationHistorySection_1(org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection object) {
				return createAdmissionMedicationHistorySection_1Adapter();
			}
			@Override
			public Adapter caseHospitalDischargeMedicationsSection_1(org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection object) {
				return createHospitalDischargeMedicationsSection_1Adapter();
			}
			@Override
			public Adapter caseMedicationsAdministeredSection_1(org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection object) {
				return createMedicationsAdministeredSection_1Adapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection_1(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection object) {
				return createAdvanceDirectivesSection_1Adapter();
			}
			@Override
			public Adapter caseAdvanceDirectivesSection_2(org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection object) {
				return createAdvanceDirectivesSection_2Adapter();
			}
			@Override
			public Adapter caseCodedAdvanceDirectivesSection(CodedAdvanceDirectivesSection object) {
				return createCodedAdvanceDirectivesSectionAdapter();
			}
			@Override
			public Adapter caseImmunizationsSection_1(org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection object) {
				return createImmunizationsSection_1Adapter();
			}
			@Override
			public Adapter caseImmunizationsSection_2(org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection object) {
				return createImmunizationsSection_2Adapter();
			}
			@Override
			public Adapter casePhysicalExamNarrativeSection(PhysicalExamNarrativeSection object) {
				return createPhysicalExamNarrativeSectionAdapter();
			}
			@Override
			public Adapter casePhysicalExamSection_1(org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection object) {
				return createPhysicalExamSection_1Adapter();
			}
			@Override
			public Adapter caseReviewOfSystemsSection_1(org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection object) {
				return createReviewOfSystemsSection_1Adapter();
			}
			@Override
			public Adapter caseHospitalCourseSection_1(org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection object) {
				return createHospitalCourseSection_1Adapter();
			}
			@Override
			public Adapter caseCodedResultsSection(CodedResultsSection object) {
				return createCodedResultsSectionAdapter();
			}
			@Override
			public Adapter caseAssessmentAndPlanSection_1(org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection object) {
				return createAssessmentAndPlanSection_1Adapter();
			}
			@Override
			public Adapter casePlanOfCareSection_1(org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection object) {
				return createPlanOfCareSection_1Adapter();
			}
			@Override
			public Adapter caseCarePlanSection(CarePlanSection object) {
				return createCarePlanSectionAdapter();
			}
			@Override
			public Adapter caseFamilyHistorySection_1(org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection object) {
				return createFamilyHistorySection_1Adapter();
			}
			@Override
			public Adapter caseFamilyMedicalHistorySection(FamilyMedicalHistorySection object) {
				return createFamilyMedicalHistorySectionAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection_1(org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection object) {
				return createSocialHistorySection_1Adapter();
			}
			@Override
			public Adapter caseSocialHistorySection_2(org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection object) {
				return createSocialHistorySection_2Adapter();
			}
			@Override
			public Adapter caseEncountersSection_1(org.openhealthtools.mdht.uml.cda.ccd.EncountersSection object) {
				return createEncountersSection_1Adapter();
			}
			@Override
			public Adapter caseEncounterHistorySection(EncounterHistorySection object) {
				return createEncounterHistorySectionAdapter();
			}
			@Override
			public Adapter caseMedicalEquipmentSection_1(org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection object) {
				return createMedicalEquipmentSection_1Adapter();
			}
			@Override
			public Adapter caseMedicalDevicesSection(MedicalDevicesSection object) {
				return createMedicalDevicesSectionAdapter();
			}
			@Override
			public Adapter caseSimpleObservation(SimpleObservation object) {
				return createSimpleObservationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity <em>Allergy Drug Sensitivity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity
	 * @generated
	 */
	public Adapter createAllergyDrugSensitivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary <em>Patient Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary
	 * @generated
	 */
	public Adapter createPatientSummaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSign <em>Vital Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.VitalSign
	 * @generated
	 */
	public Adapter createVitalSignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PayersSection
	 * @generated
	 */
	public Adapter createPayersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection
	 * @generated
	 */
	public Adapter createAllergiesReactionsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection <em>Problem List Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection
	 * @generated
	 */
	public Adapter createProblemListSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllnessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection
	 * @generated
	 */
	public Adapter createSurgeriesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.DischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createDischargeDiagnosisSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AdmissionMedicationHistorySection
	 * @generated
	 */
	public Adapter createAdmissionMedicationHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection <em>Diagnostic Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.DiagnosticResultsSection
	 * @generated
	 */
	public Adapter createDiagnosticResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.EncountersSection
	 * @generated
	 */
	public Adapter createEncountersSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.MedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.Result <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.Result
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry <em>Condition Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry
	 * @generated
	 */
	public Adapter createConditionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemAct <em>Problem Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemAct
	 * @generated
	 */
	public Adapter createProblemActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry <em>Concern Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ConcernEntry
	 * @generated
	 */
	public Adapter createConcernEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern <em>Allergy Intolerance Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern
	 * @generated
	 */
	public Adapter createAllergyIntoleranceConcernAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity <em>Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity
	 * @generated
	 */
	public Adapter createMedicationActivityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.Medication
	 * @generated
	 */
	public Adapter createMedication_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry <em>Problem Concern Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry
	 * @generated
	 */
	public Adapter createProblemConcernEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection <em>Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection
	 * @generated
	 */
	public Adapter createVitalSignsSection_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection <em>Coded Vital Signs Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.CodedVitalSignsSection
	 * @generated
	 */
	public Adapter createCodedVitalSignsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation <em>Vital Sign Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation
	 * @generated
	 */
	public Adapter createVitalSignObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.PayersSection
	 * @generated
	 */
	public Adapter createPayersSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.PayersSection <em>Payers Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.PayersSection
	 * @generated
	 */
	public Adapter createPayersSection_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.AlertsSection <em>Alerts Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.AlertsSection
	 * @generated
	 */
	public Adapter createAlertsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection <em>Allergies Reactions Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection
	 * @generated
	 */
	public Adapter createAllergiesReactionsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemSection <em>Problem Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemSection
	 * @generated
	 */
	public Adapter createProblemSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection <em>Active Problems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection
	 * @generated
	 */
	public Adapter createActiveProblemsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection <em>History Of Past Illness Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPastIllnessSection
	 * @generated
	 */
	public Adapter createHistoryOfPastIllnessSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection <em>Chief Complaint Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ChiefComplaintSection
	 * @generated
	 */
	public Adapter createChiefComplaintSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection <em>Reason For Referral Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ReasonForReferralSection
	 * @generated
	 */
	public Adapter createReasonForReferralSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness <em>History Of Present Illness</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HistoryOfPresentIllness
	 * @generated
	 */
	public Adapter createHistoryOfPresentIllness_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection <em>Procedures Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection
	 * @generated
	 */
	public Adapter createProceduresSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection <em>Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.SurgeriesSection
	 * @generated
	 */
	public Adapter createSurgeriesSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection <em>Coded Surgeries Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.CodedSurgeriesSection
	 * @generated
	 */
	public Adapter createCodedSurgeriesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection <em>Functional Status Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.FunctionalStatusSection
	 * @generated
	 */
	public Adapter createFunctionalStatusSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection <em>Hospital Admission Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HospitalAdmissionDiagnosisSection
	 * @generated
	 */
	public Adapter createHospitalAdmissionDiagnosisSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection <em>Discharge Diagnosis Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.DischargeDiagnosisSection
	 * @generated
	 */
	public Adapter createDischargeDiagnosisSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSection <em>Medication Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.MedicationSection
	 * @generated
	 */
	public Adapter createMedicationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection <em>Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection
	 * @generated
	 */
	public Adapter createMedicationsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection <em>Admission Medication History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection
	 * @generated
	 */
	public Adapter createAdmissionMedicationHistorySection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection <em>Hospital Discharge Medications Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection
	 * @generated
	 */
	public Adapter createHospitalDischargeMedicationsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection <em>Medications Administered Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicationsAdministeredSection
	 * @generated
	 */
	public Adapter createMedicationsAdministeredSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection <em>Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createAdvanceDirectivesSection_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection <em>Coded Advance Directives Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.CodedAdvanceDirectivesSection
	 * @generated
	 */
	public Adapter createCodedAdvanceDirectivesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection <em>Immunizations Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ImmunizationsSection
	 * @generated
	 */
	public Adapter createImmunizationsSection_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection <em>Physical Exam Narrative Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamNarrativeSection
	 * @generated
	 */
	public Adapter createPhysicalExamNarrativeSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection <em>Physical Exam Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection
	 * @generated
	 */
	public Adapter createPhysicalExamSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection <em>Review Of Systems Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ReviewOfSystemsSection
	 * @generated
	 */
	public Adapter createReviewOfSystemsSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection <em>Hospital Course Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.HospitalCourseSection
	 * @generated
	 */
	public Adapter createHospitalCourseSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection <em>Coded Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.CodedResultsSection
	 * @generated
	 */
	public Adapter createCodedResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection <em>Assessment And Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.AssessmentAndPlanSection
	 * @generated
	 */
	public Adapter createAssessmentAndPlanSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection <em>Plan Of Care Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection
	 * @generated
	 */
	public Adapter createPlanOfCareSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection <em>Care Plan Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.CarePlanSection
	 * @generated
	 */
	public Adapter createCarePlanSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection <em>Family History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection
	 * @generated
	 */
	public Adapter createFamilyHistorySection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection <em>Family Medical History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.FamilyMedicalHistorySection
	 * @generated
	 */
	public Adapter createFamilyMedicalHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySection_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.EncountersSection <em>Encounters Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.EncountersSection
	 * @generated
	 */
	public Adapter createEncountersSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection <em>Encounter History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection
	 * @generated
	 */
	public Adapter createEncounterHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection <em>Medical Equipment Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.MedicalEquipmentSection
	 * @generated
	 */
	public Adapter createMedicalEquipmentSection_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection <em>Medical Devices Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.MedicalDevicesSection
	 * @generated
	 */
	public Adapter createMedicalDevicesSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation <em>Simple Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.SimpleObservation
	 * @generated
	 */
	public Adapter createSimpleObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry <em>Problem Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry
	 * @generated
	 */
	public Adapter createProblemEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //HITSPAdapterFactory
