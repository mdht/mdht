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
		CommentTest.class, InternalReferenceTest.class, MedicationTypeTest.class, NonMedicinalSupplyActivityTest.class,
		MedicationFullfillmentInstructionsTest.class, ProblemConcernActTest.class, ProblemObservationTest.class,
		ProblemStatusTest.class, ContinuityOfCareDocumentTest.class,
		ContinuityOfCareDocument_DocumentationOfTest.class, DocumentationOf_ServiceEvent3Test.class,
		ServiceEvent3_PerformerTest.class, Performer_AssignedEntityTest.class,
		ContinuityOfCareDocument_AuthorTest.class, Author_AssignedAuthor3Test.class, AllergiesSectionTest.class,
		AllergiesSectionEntriesOptionalTest.class, MedicationsSectionTest.class,
		MedicationsSectionEntriesOptionalTest.class, ProblemSectionTest.class, ProblemSectionEntriesOptionalTest.class,
		ProceduresSectionTest.class, ProceduresSectionEntriesOptionalTest.class,
		ProcedureActivityObservationTest.class, ProcedureActivityActTest.class, ResultsSectionTest.class,
		ResultsSectionEntriesOptionalTest.class, ResultOrganizerTest.class, ResultObservationTest.class,
		AdvanceDirectivesSectionTest.class, AdvanceDirectivesSectionEntriesOptionalTest.class,
		AdvanceDirectiveObservationTest.class, AdvanceDirectiveObservation_ReferenceTest.class,
		Reference_ExternalDocumentTest.class, AdvanceDirectiveObservation_CustodianTest.class,
		Custodian_CustodianRoleTest.class, CustodianRole_CustodianEntityTest.class,
		AdvanceDirectiveObservation_VerifierTest.class, EncountersSectionTest.class,
		EncountersSectionEntriesOptionalTest.class, EncounterActivitiesTest.class, FamilyHistorySectionTest.class,
		FamilyHistoryOrganizerTest.class, FamilyHistoryObservationTest.class, FamilyHistoryDeathObservationTest.class,
		FunctionalStatusSectionTest.class, ImmunizationsSectionEntriesOptionalTest.class,
		ImmunizationActivityTest.class, ImmunizationRefusalReasonTest.class, MedicalEquipmentSectionTest.class,
		PayersSectionTest.class, CoverageActivityTest.class, PolicyActivityTest.class, AuthorizationActivityTest.class,
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
		UnstructuredDocument_RecordTargetTest.class, RecordTarget_PatientRole2Test.class,
		UnstructuredDocument_AuthorTest.class, Author_AssignedAuthor2Test.class,
		UnstructuredDocument_CustodianTest.class, Custodian_AssignedCustodian3Test.class,
		AssignedCustodian3_CustodianOrganizationTest.class, UnstructuredDocument_ComponentTest.class,
		Component_NonXMLBodyTest.class, ScanOriginalAuthorTest.class, ScanningDeviceTest.class,
		ScanDataEntererTest.class, MedicationInformationTest.class, UnstructuredOrScannedDocumentTest.class,
		ReferralSummaryTest.class, DischargeSummaryTest.class, DischargeSummary_ComponentOfTest.class,
		ComponentOf_EncompassingEncounter3Test.class, EncompassingEncounter3_ResponsiblePartyTest.class,
		EncompassingEncounter3_EncounterParticipantTest.class, HospitalDischargeDiagnosisSectionTest.class,
		HospitalDischargeDiagnosisTest.class, DischargeDietSectionTest.class,
		HospitalDischargeMedicationsSectionEntriesOptionalTest.class, DischargeMedicationTest.class,
		HospitalCourseSectionTest.class, ChiefComplaintAndReasonForVisitSectionTest.class,
		HospitalConsultationsSectionTest.class, HospitalDischargeInstructionsSectionTest.class,
		HospitalDischargePhysicalSectionTest.class, HospitalDischargeStudiesSummarySectionTest.class,
		ReasonForVisitSectionTest.class, PreconditionForSubstanceAdministrationTest.class,
		ImmunizationMedicationInformationTest.class, ProcedureSpecimenTest.class, ProcedurePerformerTest.class,
		ProcedureEncounterTest.class, MedicationInformationManufacturedMaterialTest.class,
		FamilyHistorySubjectTest.class, HospitalDischargeMedicationsSectionTest.class, RelatedInformantTest.class,
		EncounterPerformerTest.class, EncounterPerformerAssignedEntityTest.class,
		AllergyObservationParticipantTest.class, AllergyObservationParticipantRoleTest.class,
		AllergyObservationPlayingEntityTest.class, AnesthesiaSectionTest.class, ComplicationsSectionTest.class,
		DICOMObjectCatalogSectionTest.class, FindingsSectionTest.class, InterventionsSectionTest.class,
		MedicalHistorySectionTest.class, ObjectiveSectionTest.class, OperativeNoteFluidSectionTest.class,
		OperativeNoteSurgicalProcedureSectionTest.class, PlannedProcedureSectionTest.class,
		PostoperativeDiagnosisSectionTest.class, PostprocedureDiagnosisSectionTest.class,
		PostprocedureDiagnosisTest.class, PreoperativeDiagnosisSectionTest.class,
		ProcedureDescriptionSectionTest.class, ProcedureDispositionSectionTest.class,
		ProcedureEstimatedBloodLossSectionTest.class, ProcedureFindingsSectionTest.class,
		ProcedureImplantsSectionTest.class, ProcedureIndicationsSectionTest.class,
		ProcedureSpecimensTakenSectionTest.class, SubjectiveSectionTest.class, ConsultationNoteTest.class,
		ConsultationNote_ComponentOfTest.class, ComponentOf_EncompassingEncounter2Test.class,
		EncompassingEncounter2_ResponsiblePartyTest.class, EncompassingEncounter2_EncounterParticipantTest.class,
		AssessmentSectionTest.class, HistoryAndPhysicalNoteTest.class, HistoryAndPhysicalNote_ComponentOfTest.class,
		ComponentOf_EncompassingEncounter4Test.class, EncompassingEncounter4_ResponsiblePartyTest.class,
		EncompassingEncounter4_EncounterParticipantTest.class, OperativeNoteTest.class,
		OperativeNote_DocumentationOfTest.class, DocumentationOf_ServiceEventTest.class,
		ServiceEvent_PrimaryPerformerTest.class, ProcedureNoteTest.class, ProcedureNote_ComponentOfTest.class,
		ComponentOf_EncompassingEncounter5Test.class, EncompassingEncounter5_LocationTest.class,
		Location_HealthCareFacilityTest.class, EncompassingEncounter5_EncounterParticipantTest.class,
		ProcedureNote_IndividualTest.class, ProcedureNote_PrimaryCarePhysicianTest.class,
		ProcedureNote_ProviderTest.class, Provider_AssociatedEntityTest.class, ProcedureNote_DocumentationOfTest.class,
		DocumentationOf_ServiceEvent1Test.class, ServiceEvent1_PrimaryPerformerTest.class, ProgressNoteTest.class,
		ProgressNote_DocumentationOfTest.class, DocumentationOf_ServiceEvent2Test.class,
		ProgressNote_ComponentOfTest.class, ComponentOf_EncompassingEncounter6Test.class,
		EncompassingEncounter6_LocationTest.class, Location_HealthCareFacility1Test.class,
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
