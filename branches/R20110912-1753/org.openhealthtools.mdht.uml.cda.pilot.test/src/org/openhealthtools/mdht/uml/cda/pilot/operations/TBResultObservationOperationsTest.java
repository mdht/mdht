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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.ResultOperationsTest;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class TBResultObservationOperationsTest extends ResultOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.15.3.13";

	// Status code
	private static final String STATUS_CODE = "completed";

	private static final String STATUS_CODE_CODE_SYSTEM = "notspecified";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		TBResultObservationOperations obj = new TBResultObservationOperations();
		assertTrue(true);
	} // testConstructor

	private static final CDATestCase TEST_CASE_ARRAY[] = {

			// Template ID
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultObservationOperations.validateResultObservationTemplateId(
						(TBResultObservation) objectToTest, diagnostician, map);
				}
			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultObservationOperations.validateResultObservationStatusCode(
						(TBResultObservation) objectToTest, diagnostician, map);
				}
			} };

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	/**
	 * @see org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		return TBPNFactory.eINSTANCE.createTBResultObservation();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultObservationOperations#validateTBResultObservationClassCode(org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultObservationClassCode() {
		TBResultObservation objectToTest = (TBResultObservation) getObjectToTest();
		TBResultObservationOperations.validateTBResultObservationClassCode(
			objectToTest, Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultObservationOperations#validateResultObservationCode(org.openhealthtools.mdht.uml.cda.pilot.TBResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultObservationCode() {
		TBResultObservation objectToTest = (TBResultObservation) getObjectToTest();
		TBResultObservationOperations.validateResultObservationCode(
			objectToTest, Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

	/**
	 */
	@Test
	public void testValidateResultObservationTemplateId() {
		TBResultObservation objectToTest = (TBResultObservation) getObjectToTest();
		TBResultObservationOperations.validateResultObservationTemplateId(
			objectToTest, Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

	/**
	 */
	@Test
	public void testValidateResultObservationStatusCode() {
		TBResultObservation objectToTest = (TBResultObservation) getObjectToTest();
		TBResultObservationOperations.validateResultObservationStatusCode(
			objectToTest, Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

} // TBResultObservationOperationsTest
