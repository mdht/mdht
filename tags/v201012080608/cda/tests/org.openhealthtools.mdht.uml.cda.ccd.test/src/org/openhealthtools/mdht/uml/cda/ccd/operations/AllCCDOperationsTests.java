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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of Junit 4 test cases for CDA document
 * processing.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AdvanceDirectiveObservationOperationsTest.class,
		AdvanceDirectivesSectionOperationsTest.class,
		AdvanceDirectiveStatusObservationOperationsTest.class,
		AdvanceDirectiveVerificationOperationsTest.class,
		AgeObservationOperationsTest.class,
		AlertObservationOperationsTest.class,
		AlertsSectionOperationsTest.class,
		AlertStatusObservationOperationsTest.class,
		AuthorizationActivityOperationsTest.class,
		CauseOfDeathObservationOperationsTest.class,
		CCDRegistryDelegateOperationsTest.class,
		ContinuityOfCareDocumentOperationsTest.class,
		CoverageActivityOperationsTest.class,
		CoveragePlanDescriptionOperationsTest.class,
		CoveredPartyOperationsTest.class,
		EncounterLocationOperationsTest.class,
		EncountersActivityOperationsTest.class,
		EncountersSectionOperationsTest.class,
		EpisodeObservationOperationsTest.class,
		FamilyHistoryObservationOperationsTest.class,
		FamilyHistoryOrganizerOperationsTest.class,
		FamilyHistorySectionOperationsTest.class,
		FulfillmentInstructionOperationsTest.class,
		FunctionalStatusObservationOperationsTest.class,
		FunctionalStatusSectionOperationsTest.class,
		ImmunizationsSectionOperationsTest.class,
		MedicalEquipmentSectionOperationsTest.class,
		MedicationActivityOperationsTest.class,
		MedicationSectionOperationsTest.class,
		MedicationSeriesNumberObservationOperationsTest.class,
		MedicationStatusObservationOperationsTest.class,
		PatientAwarenessOperationsTest.class,
		PatientInstructionOperationsTest.class,
		PayerEntityOperationsTest.class, PayersSectionOperationsTest.class,
		PlanOfCareActivityActOperationsTest.class,
		PlanOfCareActivityEncounterOperationsTest.class,
		PlanOfCareActivityObservationOperationsTest.class,
		PlanOfCareSectionOperationsTest.class,
		PlanOfCareActivityProcedureOperationsTest.class,
		PlanOfCareActivitySubstanceAdministrationOperationsTest.class,
		PlanOfCareActivitySupplyOperationsTest.class,
		PolicyActivityOperationsTest.class,
		PolicySubscriberOperationsTest.class, ProblemActOperationsTest.class,
		ProblemHealthStatusOperationsTest.class,
		ProblemObservationOperationsTest.class,
		ProblemSectionOperationsTest.class, ProblemStatusOperationsTest.class,
		ProcedureActivityActOperationsTest.class,
		ProcedureActivityObservationOperationsTest.class,
		ProcedureActivityProcedureOperationsTest.class,
		ProceduresSectionOperationsTest.class,
		ProductInstanceOperationsTest.class, ProductOperationsTest.class,
		PurposeActivityOperationsTest.class,
		PurposeSectionOperationsTest.class,
		ReactionObservationOperationsTest.class,
		ResultObservationOperationsTest.class,
		ResultOrganizerOperationsTest.class,
		ResultsSectionOperationsTest.class,
		SeverityObservationOperationsTest.class,
		SocialHistoryObservationOperationsTest.class,
		SocialHistorySectionOperationsTest.class,
		StatusObservationOperationsTest.class,
		SupplyActivityOperationsTest.class,
		VitalSignsOrganizerOperationsTest.class,
		VitalSignsSectionOperationsTest.class })
public class AllCCDOperationsTests {

	/**
	 * @return nothing
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(AllCCDOperationsTests.class);
	}
	// Nothing
} // AllCDATests