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

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CauseOfDeathObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class CauseOfDeathObservationOperationsTest extends CCDValidationTest {

	protected static final String CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.42";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		CauseOfDeathObservationOperations obj = new CauseOfDeathObservationOperations();
		assertTrue(true);
	} // testConstructor
	
	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDValidationTest(CAUSE_OF_DEATH_OBSERVATION_TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return CauseOfDeathObservationOperations
					.validateFamilyHistoryObservationTemplateId(
							(CauseOfDeathObservation) objectToTest,
							diagnostician, map);
		}

	}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}
	
	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createCauseOfDeathObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createCauseOfDeathObservation().init();
	}

} // CauseOfDeathObservationOperationsTest