/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>emspcr</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		PatientCareReportTest.class, EMSCurrentMedicationSectionTest.class, CurrentlyOnMedicationTest.class,
		PatientOnAnticoagulantsTest.class, CurrentMedicationTest.class, EMSCardiacArrestEventSectionTest.class,
		CardiacArrestTest.class, EMSAdvanceDirectivesSectionTest.class, AdvanceDirectiveObservationTest.class,
		EMSAllergiesAndAdverseReactionsSectionTest.class, NonDrugAllergyOrganizerTest.class,
		ExistenceOfNonDrugAllergyTest.class, NonDrugAllergyTest.class, EMSPastMedicalHistorySectionTest.class,
		ExistenceOfHistoryOfConditionTest.class, HistoryOfConditionTest.class, EMSSocialHistorySectionTest.class,
		ExistenceOfDrugUseIndicationTest.class, DrugUseIndicationTest.class, EMSPhysicalAssessmentSectionTest.class,
		PhysicalAssessmentOrganizerTest.class, SkinAssessmentTest.class, PatientPregnancyTest.class,
		LastOralIntakeTest.class, PatientAgeTest.class, ThrombolyticContraindicationsTest.class,
		BarriersToPatientCareTest.class, EMSMedicationsAdministeredSectionTest.class, MedicationAdministeredTest.class,
		EMSProceduresPerformedSectionTest.class, ProcedureTest.class, EMSPatientCareNarrativeSectionTest.class,
		EMSSceneSectionTest.class, FirstUnitIndicatorTest.class, FirstUnitOnSceneTest.class,
		ScenePatientCountTest.class, MassCasualtyIndicatorTest.class, LocationTypeObservationTest.class,
		EMSDispatchSectionTest.class, EmergencyMedicalDispatchObservationTest.class,
		ComplaintReportedByDispatchTest.class, EMSDispositionSectionTest.class,
		NumberOfPatientsTransportedObservationTest.class, IncidentDispositionObservationTest.class,
		TransportModeObservationTest.class, TransportMethodObservationTest.class,
		ReasonForChoosingDestinationObservationTest.class, PrearrivalActivationObservationTest.class,
		PatientConditionChangeAtDestinationObservationTest.class, EMSPersonnelAdverseEventSectionTest.class,
		AdverseEventIndicatorTest.class, AdverseEventTypeObservationTest.class, EMSProtocolSectionTest.class,
		ProtocolObservationTest.class, CandidatePatientRegistryTypeTest.class, EMSResponseSectionTest.class,
		DelayOrganizerTest.class, DispatchLocationOrganizerTest.class, ResponseOdometerReadingOrganizerTest.class,
		ResponseModeToSceneTest.class, EMSSituationSectionTest.class, ComplaintTest.class, PossibleInjuryTest.class,
		ProviderPrimaryImpressionTest.class, PrimarySymptomTest.class, OtherSymptomsTest.class,
		ProviderSecondaryImpressionsTest.class, InitialPatientAcuityTest.class, TimesSectionTest.class,
		CallTimeTest.class, UnitNotifiedTimeTest.class, UnitEnRouteTimeTest.class, UnitOnSceneTimeTest.class,
		UnitAtPatientTimeTest.class, UnitLeftSceneTimeTest.class, PatientArrivedAtDestinationTimeTest.class,
		UnitBackInServiceTimeTest.class, DispatchNotifiedTimeTest.class, EMSVitalSignsSectionTest.class,
		VitalSignsOrganizerTest.class, PriorAidVitalsTest.class, AdditionalVitalSignsOrganizerTest.class,
		StrokeScoreTest.class, PainScoreTest.class, LevelOfResponsivenessTest.class, BloodGlucoseTest.class,
		CarbonMonoxideTest.class, CarbonDioxideTest.class, CardiacRhythmTest.class,
		GlasgowComaScoreOrganizerTest.class, GlasgowEyeTest.class, GlasgowMotorTest.class, GlasgowQualifierTest.class,
		GlasgowTotalTest.class, GlasgowVerbalTest.class, EMSInjuryIncidentDescriptionSectionTest.class,
		InjuryCauseCategoryTest.class, InjuryMechanismTest.class, TraumaCenterCriteriaTest.class,
		InjuryRiskFactorTest.class, VehicleImpactAreaTest.class, PatientLocationInVehicleTest.class,
		VehicleOccupantSafetyEquipmentTest.class, AirbagDeploymentStatusTest.class, HeightOfFallTest.class,
		DisasterTypeTest.class, EMSBillingSectionTest.class, BillingConditionTest.class,
		LevelOfServiceObservationTest.class, EMSDrugAllergyTest.class, ExistenceOfDrugAllergyObservationTest.class,
		MedicationNotAdministeredReasonObservationTest.class, MedicationResponseObservationTest.class,
		MedicationComplicationObservationTest.class, MedicationPriorAdministrationObservationTest.class,
		PatientBodyWeightTest.class, LengthBasedPatientBodyWeightClassTest.class, FaceAssessmentTest.class,
		HeadAssessmentTest.class, NeckAssessmentTest.class, ChestAndLungsAssessmentTest.class,
		HeartAssessmentTest.class, AbdomenAssessmentTest.class, PelvicAndGenitourinaryAssessmentTest.class,
		BackAndSpineAssessmentTest.class, ExtremitiesAssessmentTest.class, EyeAssessmentTest.class,
		MentalStatusAssessmentTest.class, CardiacArrestWithTimingTest.class, CardiacArrestCauseTest.class,
		PriorCPRTest.class, PriorAEDUseTest.class, ArrestRhythmTest.class, ReturnOfSpontaneousCirculationTest.class,
		DestinationRhythmTest.class, AbandonedProcedureReasonObservationTest.class, ProcedurePriorIndicatorTest.class,
		ProcedureNumberOfAttemptsObservationTest.class, ProcedureSuccessfulObservationTest.class,
		ProcedureComplicationsObservationTest.class, ProcedurePatientResponseObservationTest.class,
		AirwayConfirmationObservationTest.class, ReasonProcedureNotAttemptedObservationTest.class,
		ComplaintTypeTest.class, ComplaintDurationTest.class, ComplaintOrganSystemTest.class,
		NeurologicalAssessmentTest.class, SystolicBloodPressureTest.class, DiastolicBloodPressureTest.class,
		HeartRateTest.class, RespiratoryRateTest.class, BodyTemperatureTest.class, OxygenSaturationTest.class,
		ProtocolAgeCategoryTest.class, DispatchLocationNameTest.class, DispatchLocationLatitudeTest.class,
		DispatchLocationLongitudeTest.class, DispatchDelayTest.class, ResponseDelayTest.class, SceneDelayTest.class,
		TransportDelayTest.class, TurnaroundDelayTest.class, ResponseBeginningOdometerReadingTest.class,
		ResponseOnSceneOdometerReadingTest.class, ResponseDestinationOdometerReadingTest.class,
		ResponseEndingOdometerReadingTest.class, NonDrugAllergyOrganizerActuallyDregTest.class,
		EMSDrugAllergyOrganizerTest.class })
public class EmspcrTests {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(EmspcrTests.class);
	}

} // EmspcrTests
