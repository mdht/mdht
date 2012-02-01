/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>consol</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		GeneralHeaderConstraintsTest.class, AllergyProblemActTest.class, AllergyObservationTest.class,
		ReactionObservationTest.class, SeverityObservationTest.class, ProcedureActivityProcedureTest.class,
		IndicationTest.class, ServiceDeliveryLocationTest.class, MedicationActivityTest.class,
		MedicationSupplyOrderTest.class, InstructionsTest.class, MedicationDispenseTest.class, DrugVehicleTest.class,
		ProductInstanceTest.class, AllergyStatusObservationTest.class, AgeObservationTest.class,
		HealthStatusObservationTest.class, CommentTest.class, InternalReferenceTest.class, MedicationTypeTest.class,
		NonMedicinalSupplyActivityTest.class, MedicationFullfillmentInstructionsTest.class,
		ProblemConcernActTest.class, ProblemObservationTest.class, ProblemStatusTest.class,
		ContinuityOfCareDocumentTest.class, AllergiesSectionTest.class, AllergiesSectionEntriesOptionalTest.class,
		MedicationsSectionTest.class, MedicationsSectionEntriesOptionalTest.class, ProblemSectionTest.class,
		ProblemSectionEntriesOptionalTest.class, ProceduresSectionTest.class,
		ProceduresSectionEntriesOptionalTest.class, ProcedureActivityObservationTest.class,
		ProcedureActivityActTest.class, ResultsSectionTest.class, ResultsSectionEntriesOptionalTest.class,
		ResultOrganizerTest.class, ResultObservationTest.class, AdvanceDirectivesSectionTest.class,
		AdvanceDirectivesSectionEntriesOptionalTest.class, AdvanceDirectiveObservationTest.class,
		EncountersSectionTest.class, EncountersSectionEntriesOptionalTest.class, EncounterActivitiesTest.class,
		FamilyHistorySectionTest.class, FamilyHistoryOrganizerTest.class, FamilyHistoryObservationTest.class,
		FamilyHistoryDeathObservationTest.class, FunctionalStatusSectionTest.class,
		ImmunizationsSectionEntriesOptionalTest.class, ImmunizationActivityTest.class,
		ImmunizationRefusalReasonTest.class, MedicalEquipmentSectionTest.class, PayersSectionTest.class,
		CoverageActivityTest.class, PolicyActivityTest.class, AuthorizationActivityTest.class,
		PlanOfCareSectionTest.class, PlanOfCareActivityActTest.class, PlanOfCareActivityEncounterTest.class,
		PlanOfCareActivityObservationTest.class, PlanOfCareActivityProcedureTest.class,
		PlanOfCareActivitySubstanceAdministrationTest.class, PlanOfCareActivitySupplyTest.class,
		SocialHistorySectionTest.class, SocialHistoryObservationTest.class, PregnancyObservationTest.class,
		EstimatedDateOfDeliveryTest.class, VitalSignsSectionEntriesOptionalTest.class, VitalSignsOrganizerTest.class,
		VitalSignObservationTest.class, SocialHistoryStatusObservationTest.class, PurposeSectionTest.class,
		PurposeActivityTest.class, AdvanceDirectiveVerificationTest.class, AdvanceDirectiveStatusObservationTest.class,
		EncounterTest.class, ImmunizationsSectionTest.class, InsuranceProviderTest.class, PayerEntryTest.class,
		CoveredPartyTest.class, PolicySubscriberTest.class, ExternalReferenceTest.class, VitalSignsSectionTest.class,
		HistoryOfPastIllnessSectionTest.class, ChiefComplaintSectionTest.class, ReasonForReferralSectionTest.class,
		HistoryOfPresentIllnessSectionTest.class, HospitalAdmissionDiagnosisSectionTest.class,
		HospitalAdmissionMedicationsSectionEntriesOptionalTest.class, AdmissionMedicationTest.class,
		MedicationsAdministeredSectionTest.class, PhysicalExamSectionTest.class, GeneralStatusSectionTest.class,
		ReviewOfSystemsSectionTest.class, AssessmentAndPlanSectionTest.class, LanguageSpokenTest.class,
		HealthcareProviderTest.class, SurgicalDrainsSectionTest.class, UnstructuredDocumentTest.class,
		ScanOriginalAuthorTest.class, ScanningDeviceTest.class, ScanDataEntererTest.class,
		MedicationInformationTest.class, UnstructuredOrScannedDocumentTest.class, ReferralSummaryTest.class,
		DischargeSummaryTest.class, HospitalDischargeDiagnosisSectionTest.class, HospitalDischargeDiagnosisTest.class,
		DischargeDietSectionTest.class, HospitalDischargeMedicationsSectionEntriesOptionalTest.class,
		DischargeMedicationTest.class, HospitalCourseSectionTest.class,
		ChiefComplaintAndReasonForVisitSectionTest.class, HospitalConsultationsSectionTest.class,
		HospitalDischargeInstructionsSectionTest.class, HospitalDischargePhysicalSectionTest.class,
		HospitalDischargeStudiesSummarySectionTest.class, ReasonForVisitSectionTest.class,
		PreconditionForSubstanceAdministrationTest.class, ImmunizationMedicationInformationTest.class,
		ProcedureSpecimenTest.class, ProcedurePerformerTest.class, ProcedureEncounterTest.class,
		MedicationInformationManufacturedMaterialTest.class, FamilyHistorySubjectTest.class,
		HospitalDischargeMedicationsSectionTest.class, RelatedInformantTest.class, EncounterPerformerTest.class,
		EncounterPerformerAssignedEntityTest.class, AllergyObservationParticipantTest.class,
		AllergyObservationParticipantRoleTest.class, AllergyObservationPlayingEntityTest.class,
		AnesthesiaSectionTest.class, ComplicationsSectionTest.class, DICOMObjectCatalogSectionTest.class,
		FindingsSectionTest.class, InterventionsSectionTest.class, MedicalHistorySectionTest.class,
		ObjectiveSectionTest.class, OperativeNoteFluidSectionTest.class,
		OperativeNoteSurgicalProcedureSectionTest.class, PlannedProcedureSectionTest.class,
		PostoperativeDiagnosisSectionTest.class, PostprocedureDiagnosisSectionTest.class,
		PostprocedureDiagnosisTest.class, PreoperativeDiagnosisSectionTest.class,
		ProcedureDescriptionSectionTest.class, ProcedureDispositionSectionTest.class,
		ProcedureEstimatedBloodLossSectionTest.class, ProcedureFindingsSectionTest.class,
		ProcedureImplantsSectionTest.class, ProcedureIndicationsSectionTest.class,
		ProcedureSpecimensTakenSectionTest.class, SubjectiveSectionTest.class, ConsultationNoteTest.class,

		AssessmentSectionTest.class, HistoryAndPhysicalNoteTest.class, OperativeNoteTest.class,
		ProcedureNoteTest.class, ProgressNoteTest.class,

		PreoperativeDiagnosisTest.class, InstructionsSectionTest.class, HospitalAdmissionDiagnosisTest.class,
		MedicationDispenseAssignedEntityTest.class, ImmunizationMedicationInformationManufacturedMaterialTest.class })
public class ConsolTests {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(ConsolTests.class);
	}

} // ConsolTests
