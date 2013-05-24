/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>mu2consol</b></em>'
 * package. <!-- end-user-doc -->
 * 		

 * @generated
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		GeneralHeaderConstraintsTest.class, SummaryOfCareRecordTest.class, SocialHistorySectionTest.class,
		SmokingStatusObservationTest.class, ResultsSectionTest.class, ResultOrganizerTest.class,
		ResultObservationTest.class, ProceduresSectionTest.class, ProcedureActivityProcedureTest.class,
		ClinicalOfficeVisitSummaryTest.class, MedicationsAdministeredSectionTest.class,
		TransitionOfCareAmbulatorySummaryTest.class, TransitionOfCareInpatientSummaryTest.class,
		ViewDownloadTransmitSummaryTest.class, VDTInpatientSummaryTest.class, VDTAmbulatorySummaryTest.class,
		CognitiveStatusResultObservationTest.class, CognitiveStatusResultOrganizerTest.class,
		FunctionalStatusResultObservationTest.class, FunctionalStatusResultOrganizerTest.class,
		FunctionalStatusSectionTest.class })
public class Mu2consolTests {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static junit.framework.Test suite() {
		return new JUnit4TestAdapter(Mu2consolTests.class);
	}

} // Mu2consolTests
