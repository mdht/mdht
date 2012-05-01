/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>cdt</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		GeneralHeaderConstraintsTest.class, HistoryAndPhysicalTest.class, HistoryOfPresentIllnessTest.class,
		PastMedicalHistorySectionTest.class, ReviewOfSystemsSectionIHETest.class, PhysicalExaminationSectionTest.class,
		VitalSignsSectionTest.class, GeneralStatusSectionTest.class, DiagnosticFindingsTest.class,
		ConsultationNoteTest.class, PastMedicalHistorySectionConsultTest.class, ReviewOfSystemsSectionTest.class,
		ReasonForReferralSectionTest.class, ReasonForVisitSectionConsultTest.class, LevelOneConformanceTest.class,
		LevelTwoConformanceTest.class, LevelThreeConformanceTest.class, AssessmentSectionTest.class,
		PlanSectionTest.class, AssessmentAndPlanSectionTest.class, ReasonForVisitSectionTest.class,
		ChiefComplaintSectionTest.class, ReasonForVisitAndChiefComplaintSectionTest.class, ProgressNoteTest.class,
		AssessmentAndPlanSectionProcNoteTest.class, AssessmentSectionProcNoteTest.class,
		ChiefComplaintSectionProcNoteTest.class, ObjectiveSectionTest.class, SubjectiveSectionTest.class,
		CDTRegistryDelegateTest.class })
public class CDTTests {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(CDTTests.class);
	}

} // CDTTests
