/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.pilot.operations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * This class represents a suite of JUnit 4 test cases.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
		TBResultObservationOperationsTest.class, TBResultOrganizerOperationsTest.class,
		TBResultsSectionOperationsTest.class, TuberculosisFollowUpProgressNoteOperationsTest.class })
public class AllPilotOperationsTests {
	// Nothing
} // AllPilotOperationsTests
