/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of Junit 4 test cases for IHE document
 * processing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ActiveProblemsSectionOperationsTest.class, IntakeOutputSectionOperationsTest.class, AdmissionMedicationHistorySectionOperationsTest.class,
		LanguageCommunicationOperationsTest.class, AdvanceDirectivesSectionOperationsTest.class, MedicalDevicesSectionOperationsTest.class,
		AllergiesReactionsSectionOperationsTest.class, MedicalDocumentOperationsTest.class, AllergyIntoleranceConcernOperationsTest.class, MedicalSummaryOperationsTest.class,
		AllergyIntoleranceOperationsTest.class, MedicationOperationsTest.class, MedicationsAdministeredSectionOperationsTest.class, AssessmentAndPlanSectionOperationsTest.class,
		MedicationsSectionOperationsTest.class, CarePlanSectionOperationsTest.class, NormalDoseOperationsTest.class, ChiefComplaintSectionOperationsTest.class,
		ObservationRequestEntryOperationsTest.class, CodedAdvanceDirectivesSectionOperationsTest.class, PayerEntryOperationsTest.class, CodedResultsSectionOperationsTest.class,
		PayersSectionOperationsTest.class, CodedSurgeriesSectionOperationsTest.class, PHRExtractOperationsTest.class, CodedVitalSignsSectionOperationsTest.class,
		PHRUpdateOperationsTest.class, CombinationMedicationOperationsTest.class, PhysicalExamNarrativeSectionOperationsTest.class, CommentOperationsTest.class,
		PhysicalExamSectionOperationsTest.class, ConcernEntryOperationsTest.class, PregnancyObservationOperationsTest.class, ConditionalDoseOperationsTest.class,
		ProblemConcernEntryOperationsTest.class, CoverageEntryOperationsTest.class, ProblemEntryOperationsTest.class, DischargeDiagnosisSectionOperationsTest.class,
		ProblemStatusObservationOperationsTest.class, DischargeSummaryOperationsTest.class, ProcedureEntryPlanOfCareActivityProcedureOperationsTest.class,
		EncounterActivityOperationsTest.class, ProcedureEntryProcedureActivityProcedureOperationsTest.class, EncounterEntryOperationsTest.class, ProductEntryOperationsTest.class,
		EncounterHistorySectionOperationsTest.class, ReasonForReferralSectionOperationsTest.class, EncounterPlanOfCareOperationsTest.class,
		ReviewOfSystemsSectionOperationsTest.class, ExternalReferenceTest.class, ScanDataEntererOperationsTest.class, FamilyMedicalHistorySectionOperationsTest.class,
		ScanningDeviceOperationsTest.class, HealthcareProvidersPharmaciesOperationsTest.class, SeverityOperationsTest.class, HealthStatusObservationTest.class,
		SimpleObservationOperationsTest.class, HistoryOfPastIllnessSectionOperationsTest.class, SocialHistorySectionOperationsTest.class,
		HistoryOfPresentIllnessOperationsTest.class, SplitDoseOperationsTest.class, HospitalAdmissionDiagnosisSectionOperationsTest.class, SurgeriesSectionOperationsTest.class,
		HospitalCourseSectionOperationsTest.class, TaperedDoseOperationsTest.class, HospitalDischargeMedicationsSectionOperationsTest.class, TempMedication.class,
		IHERegistryDelegateOperationsTest.class, VitalSignObservationOperationsTest.class, ImmunizationOperationsTest.class, VitalSignsOrganizerOperationsTest.class,
		ImmunizationsSectionOperationsTest.class, VitalSignsSectionOperationsTest.class

})
public class AllIHEOperationsTests {
	// Nothing
} // AllIHEOperationsTests