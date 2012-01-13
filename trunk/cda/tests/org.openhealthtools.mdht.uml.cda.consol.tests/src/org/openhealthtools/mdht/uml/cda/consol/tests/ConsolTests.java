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
		GeneralHeaderConstraintsTest.class, GeneralHeaderConstraints_RecordTargetTest.class,
		RecordTarget_PatientRoleTest.class, PatientRole_PatientTest.class, Patient_GuardianTest.class,
		Patient_LanguageCommunicationTest.class, Patient_BirthplaceTest.class, Birthplace_PlaceTest.class,
		PatientRole_ProviderOrganizationTest.class, GeneralHeaderConstraints_ComponentOfTest.class,
		ComponentOf_EncompassingEncounterTest.class, GeneralHeaderConstraints_AuthorTest.class,
		Author_AssignedAuthorTest.class, AssignedAuthor_AuthoringDeviceTest.class,
		GeneralHeaderConstraints_PersonTest.class, GeneralHeaderConstraints_DataEntererTest.class,
		DataEnterer_AssignedEntityTest.class, GeneralHeaderConstraints_CustodianTest.class,
		Custodian_AssignedCustodianTest.class, AssignedCustodian_CustodianOrganizationTest.class,
		GeneralHeaderConstraints_InformationRecipientTest.class, InformationRecipient_IntendedRecipientTest.class,
		IntendedRecipient_OrganizationTest.class, GeneralHeaderConstraints_LegalAuthenticatorTest.class,
		LegalAuthenticator_AssignedEntityTest.class, GeneralHeaderConstraints_AuthenticatorTest.class,
		Authenticator_AssignedEntityTest.class, GeneralHeaderConstraints_InformantTest.class,
		Informant_AssignedEntityTest.class, Informant_RelatedEntityTest.class,
		GeneralHeaderConstraints_ParticipantSupportTest.class, GeneralHeaderConstraints_InFulfillmentOfTest.class,
		InFulfillmentOf_OrderTest.class, AllergyProblemActTest.class, AllergyObservationTest.class,
		ReactionObservationTest.class, SeverityObservationTest.class, ProcedureActivityProcedureTest.class,
		IndicationTest.class, ServiceDeliveryLocationTest.class, MedicationActivityTest.class,
		MedicationSupplyOrderTest.class, InstructionsTest.class, MedicationDispenseTest.class, DrugVehicleTest.class,
		ProductInstanceTest.class, ProductInstance_ScopingEntityTest.class, ProductInstance_PlayingDeviceTest.class,
		AllergyStatusObservationTest.class, AgeObservationTest.class, HealthStatusObservationTest.class,
		CommentTest.class, MedicationSeriesNumberObservationTest.class, MedicationStatusObservationTest.class,
		InternalReferenceTest.class, MedicationTypeTest.class, NonMedicinalSupplyActivityTest.class,
		MedicationFullfillmentInstructionsTest.class, ProblemConcernActTest.class, ProblemObservationTest.class,
		ProblemStatusTest.class, ContinuityOfCareDocumentTest.class, AdvanceDirectivesSectionEntriesOptionalTest.class,
		AdvanceDirectiveObservationTest.class, AdvanceDirectiveObservation_ReferenceTest.class,
		Reference_ExternalDocumentTest.class, AdvanceDirectiveObservation_CustodianTest.class,
		Custodian_CustodianRoleTest.class, CustodianRole_CustodianEntityTest.class,
		AdvanceDirectiveObservation_VerifierTest.class, AllergiesSectionTest.class,
		AllergiesSectionEntriesOptionalTest.class, EncountersSectionEntriesOptionalTest.class,
		EncounterActivitiesTest.class, ImmunizationsSectionEntriesOptionalTest.class, ImmunizationActivityTest.class,
		ImmunizationRefusalReasonTest.class, PayersSectionTest.class, CoverageActivityTest.class,
		PolicyActivityTest.class, AuthorizationActivityTest.class, MedicationsSectionTest.class,
		MedicationsSectionEntriesOptionalTest.class, PlanOfCareSectionTest.class, PlanOfCareActivityActTest.class,
		PlanOfCareActivityEncounterTest.class, PlanOfCareActivityObservationTest.class,
		PlanOfCareActivityProcedureTest.class, PlanOfCareActivitySubstanceAdministrationTest.class,
		PlanOfCareActivitySupplyTest.class, ProceduresSectionTest.class, ProceduresSectionEntriesOptionalTest.class,
		ProcedureActivityObservationTest.class, ProcedureActivityActTest.class,
		VitalSignsSectionEntriesOptionalTest.class, VitalSignsOrganizerTest.class, VitalSignObservationTest.class,
		FamilyHistorySectionTest.class, FamilyHistoryOrganizerTest.class, FamilyHistoryObservationTest.class,
		FamilyHistoryDeathObservationTest.class, SocialHistorySectionTest.class, SocialHistoryObservationTest.class,
		PregnancyObservationTest.class, EstimatedDateOfDeliveryTest.class, ResultsSectionTest.class,
		ResultsSectionEntriesOptionalTest.class, ResultOrganizerTest.class, ResultObservationTest.class,
		MedicalEquipmentSectionTest.class, FunctionalStatusSectionTest.class, ProblemSectionTest.class,
		ProblemSectionEntriesOptionalTest.class, SocialHistoryStatusObservationTest.class, PurposeSectionTest.class,
		PurposeActivityTest.class, AdvanceDirectivesSectionTest.class, AdvanceDirectiveVerificationTest.class,
		AdvanceDirectiveStatusObservationTest.class, EncountersSectionTest.class, EncounterTest.class,
		ImmunizationsSectionTest.class, InsuranceProviderTest.class, PayerEntryTest.class, CoveredPartyTest.class,
		PolicySubscriberTest.class, ExternalReferenceTest.class, VitalSignsSectionTest.class,
		HistoryOfPastIllnessSectionTest.class, ChiefComplaintSectionTest.class, ReasonForReferralSectionTest.class,
		HistoryOfPresentIllnessSectionTest.class, HospitalAdmissionDiagnosisSectionTest.class,
		HospitalAdmissionMedicationsSectionEntriesOptionalTest.class, MedicationsAdministeredSectionTest.class,
		PhysicalExamSectionTest.class, GeneralStatusSectionTest.class, ReviewOfSystemsSectionTest.class,
		AssessmentAndPlanSectionTest.class, LanguageSpokenTest.class, HealthcareProviderTest.class,
		SurgicalDrainsSectionTest.class, UnstructuredDocumentTest.class, ScanOriginalAuthorTest.class,
		ScanningDeviceTest.class, ScanDataEntererTest.class, MedicationInformationTest.class,
		UnstructuredOrScannedDocumentTest.class, ReferralSummaryTest.class, DischargeSummaryTest.class,
		DischargeSummary_ComponentOfTest.class, ComponentOf_EncompassingEncounter3Test.class,
		EncompassingEncounter3_ResponsiblePartyTest.class, EncompassingEncounter3_EncounterParticipantTest.class,
		HospitalDischargeDiagnosisSectionTest.class, HospitalDischargeDiagnosisTest.class,
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
		PreoperativeDiagnosisSectionTest.class, ProcedureDescriptionSectionTest.class,
		ProcedureDispositionSectionTest.class, ProcedureEstimatedBloodLossSectionTest.class,
		ProcedureFindingsSectionTest.class, ProcedureImplantsSectionTest.class, ProcedureIndicationsSectionTest.class,
		ProcedureSpecimensTakenSectionTest.class, SubjectiveSectionTest.class, ConsultationNoteTest.class,
		ConsultationNote_ComponentOfTest.class, ComponentOf_EncompassingEncounter2Test.class,
		EncompassingEncounter2_ResponsiblePartyTest.class, EncompassingEncounter2_EncounterParticipantTest.class,
		AssessmentSectionTest.class, HistoryAndPhysicalNoteTest.class, HistoryAndPhysicalNote_ComponentOfTest.class,
		ComponentOf_EncompassingEncounter4Test.class, EncompassingEncounter4_ResponsiblePartyTest.class,
		EncompassingEncounter4_EncounterParticipantTest.class })
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
