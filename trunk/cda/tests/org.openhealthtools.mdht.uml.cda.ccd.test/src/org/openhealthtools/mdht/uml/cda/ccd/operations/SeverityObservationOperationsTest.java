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
import org.openhealthtools.mdht.uml.cda.ccd.SeverityObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SeverityObservationOperationsTest extends CCDValidationTest {

	protected static final String SEVERITY_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.55";

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "SEV";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.5.4";

	// Likely incorrect value, not specified in OCL.
	private static final String OBSERVATION_VALUE_CODE_SYSTEM = "2.16.840.1.113883.1.11.20.3";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		SeverityObservationOperations obj = new SeverityObservationOperations();
		assertTrue(true);
	} // testConstructor
	
	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(SEVERITY_OBSERVATION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationTemplateId(
									(SeverityObservation) objectToTest,
									diagnostician, map);
				}

			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE,
					STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationStatusCode(
									(SeverityObservation) objectToTest,
									diagnostician, map);
				}
			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationCode(
									(SeverityObservation) objectToTest,
									diagnostician, map);
				}
			},

			// ObservationValue
			// -------------------------------------------------------------
			new ObservationValueCCDValidationTest(OBSERVATION_VALUE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SeverityObservationOperations
							.validateSeverityObservationValue(
									(SeverityObservation) objectToTest,
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

	/**
	 * 
	 */
	@Test
	public void testValidateSeverityObservationClassCode() {
		// This is not fully implemented.
		final SeverityObservation so = (SeverityObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(so);

		boolean isValid = SeverityObservationOperations
				.validateSeverityObservationClassCode(so, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidateSeverityObservationMoodCode() {
		// This is not fully implemented.
		final SeverityObservation so = (SeverityObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(so);

		boolean isValid = SeverityObservationOperations
				.validateSeverityObservationMoodCode(so, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	@Override
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createSeverityObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createSeverityObservation().init();
	}

} // SeverityObservationOperationsTest