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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of JUnit 4 test cases.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ AssessmentAndPlanSectionOperationsTest.class,
	AssessmentSectionOperationsTest.class,
	CDTRegistryDelegateOperationsTest.class,
	ChiefComplaintSectionOperationsTest.class,
	ConsultationNoteOperationsTest.class,
	DiagnosticFindingsOperationsTest.class,
	GeneralHeaderConstraintsOperationsTest.class,
	GeneralStatusSectionOperationsTest.class,
	HistoryAndPhysicalOperationsTest.class,
	HistoryOfPresentIllnessOperationsTest.class,
	LevelOneConformanceOperationsTest.class,
	LevelTwoConformanceOperationsTest.class,
	LevelThreeConformanceOperationsTest.class,
	PastMedicalHistorySectionConsultOperationsTest.class,
	PastMedicalHistorySectionOperationsTest.class,
	PhysicalExaminationSectionOperationsTest.class,
	PlanSectionOperationsTest.class,
	ReasonForReferralSectionOperationsTest.class,
	ReasonForVisitAndChiefComplaintSectionOperationsTest.class,
	ReasonForVisitSectionConsultOperationsTest.class,
	ReasonForVisitSectionOperationsTest.class,
	ReviewOfSystemsSectionIHEOperationsTest.class,
	ReviewOfSystemsSectionOperationsTest.class,
	VitalSignsSectionOperationsTest.class })
	public class AllCDTOperationsTests {
	// Nothing
} // AllCDTOperationsTests