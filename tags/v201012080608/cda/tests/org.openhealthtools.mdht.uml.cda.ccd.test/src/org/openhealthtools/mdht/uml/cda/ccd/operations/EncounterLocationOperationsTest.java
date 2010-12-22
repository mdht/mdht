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
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncounterLocation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class EncounterLocationOperationsTest extends CCDValidationTest {

	protected static final String ENCOUNTER_LOCATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.45";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		EncounterLocationOperations obj = new EncounterLocationOperations();
		assertTrue(true);
	} // testConstructor
	
	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDValidationTest(ENCOUNTER_LOCATION_TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return EncounterLocationOperations
					.validateEncounterLocationTemplateId(
							(EncounterLocation) objectToTest, diagnostician,
							map);
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

	/**
	 * 
	 */
	@Test
	public void testValidateEncounterLocationTypeCode() {
		// This is not fully implemented.
		final EncounterLocation el = (EncounterLocation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(el);

		boolean isValid = EncounterLocationOperations
				.validateEncounterLocationTypeCode(el, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}
	
	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createEncounterLocation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createEncounterLocation().init();
	}

} // EncounterLocationOperationsTest