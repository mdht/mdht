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
@Suite.SuiteClasses( { ActiveProblemsSectionOperationsTest.class,
	AdmissionMedicationHistorySectionOperationsTest.class,
	AdvanceDirectivesSectionOperationsTest.class,
	AllergiesReactionsSectionOperationsTest.class,
	ConcernEntryOperationsTest.class,
	AllergyIntoleranceConcernOperationsTest.class,
	AllergyIntoleranceOperationsTest.class,
	ProblemEntryOperationsTest.class,
	AssessmentAndPlanSectionOperationsTest.class,
	CarePlanSectionOperationsTest.class,
	ChiefComplaintSectionOperationsTest.class,
	CodedAdvanceDirectivesSectionOperationsTest.class,
	CodedResultsSectionOperationsTest.class,
	SurgeriesSectionOperationsTest.class,
	CodedSurgeriesSectionOperationsTest.class,
	VitalSignsSectionOperationsTest.class,
	CodedVitalSignsSectionOperationsTest.class,
	CombinationMedicationOperationsTest.class,
	ConditionalDoseOperationsTest.class,
	DischargeDiagnosisSectionOperationsTest.class,
	EncounterHistorySectionOperationsTest.class,
	FamilyMedicalHistorySectionOperationsTest.class,
	HistoryOfPastIllnessSectionOperationsTest.class,
	HistoryOfPresentIllnessOperationsTest.class,
	HospitalAdmissionDiagnosisSectionOperationsTest.class,
	HospitalCourseSectionOperationsTest.class,
	HospitalDischargeMedicationsSectionOperationsTest.class,
	ImmunizationsSectionOperationsTest.class,
	MedicalDevicesSectionOperationsTest.class,
	MedicalDocumentOperationsTest.class, MedicationOperationsTest.class,
	MedicationsAdministeredSectionOperationsTest.class,
	MedicationsSectionOperationsTest.class,
	NormalDoseOperationsTest.class, PayersSectionOperationsTest.class,
	PhysicalExamNarrativeSectionOperationsTest.class,
	PhysicalExamSectionOperationsTest.class,
	ProblemConcernEntryOperationsTest.class,
	ReasonForReferralSectionOperationsTest.class,
	ReviewOfSystemsSectionOperationsTest.class,
	SocialHistorySectionOperationsTest.class,
	SplitDoseOperationsTest.class, TaperedDoseOperationsTest.class,
	VitalSignObservationOperationsTest.class,
	VitalSignsOrganizerOperationsTest.class

})
public class AllIHEOperationsTests {
	// Nothing
} // AllIHEOperationsTests