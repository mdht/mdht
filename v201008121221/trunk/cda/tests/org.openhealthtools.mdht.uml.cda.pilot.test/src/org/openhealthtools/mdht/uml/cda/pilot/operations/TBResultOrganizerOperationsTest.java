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
package org.openhealthtools.mdht.uml.cda.pilot.operations;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperationsTest;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer;

/**
 * This class
 */
@SuppressWarnings("nls")
public class TBResultOrganizerOperationsTest extends
		ResultOrganizerOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.15.3.21";

	protected static final String CODE = "notundefined";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {

			// Template ID
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultOrganizerOperations
							.validateResultOrganizerTemplateId(
									(TBResultOrganizer) objectToTest,
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
					return TBResultOrganizerOperations
							.validateResultOrganizerCode(
									(TBResultOrganizer) objectToTest,
									diagnostician, map);
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
		return TBPNFactory.eINSTANCE.createTBResultOrganizer();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultOrganizerOperations#validateTBResultOrganizerTBResultObservation(org.openhealthtools.mdht.uml.cda.pilot.TBResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultOrganizerTBResultObservation() {
		TBResultOrganizer objectToTest = (TBResultOrganizer) getObjectToTest();
		TBResultOrganizerOperations.validateTBResultOrganizerTBResultObservation(
				objectToTest, Diagnostician.INSTANCE
						.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

} // TBResultOrganizerOperationsTest