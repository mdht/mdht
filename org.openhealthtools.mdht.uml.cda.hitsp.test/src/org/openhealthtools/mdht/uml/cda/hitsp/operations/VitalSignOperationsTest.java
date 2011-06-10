/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignOperationsTest extends VitalSignObservationOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.83.14";

	protected static final String CODE1 = "9279-1";

	protected static final String CODE2 = "8867-4";

	protected static final String CODE3 = "2710-2";

	protected static final String CODE4 = "8480-6";

	protected static final String CODE5 = "8462-4";

	protected static final String CODE6 = "8310-5";

	protected static final String CODE7 = "8302-2";

	protected static final String CODE8 = "8306-3";

	protected static final String CODE9 = "8287-5";

	protected static final String CODE10 = "3141-9";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return VitalSignOperations.validateVitalSignTemplateId((VitalSign) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CCDValidationTestCase("code") {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return VitalSignOperations.validateResultObservationCode(
						(VitalSign) objectToTest, diagnostician, map);
				}

				@Override
				public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					final VitalSign vs = (VitalSign) objectToTest;
					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE1, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE2, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE3, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE4, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE5, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE6, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE7, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE8, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE9, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

					vs.setCode(DatatypesFactory.eINSTANCE.createCE(CODE10, CODE_SYSTEM, "foo", "bar"));
					validate(vs, diagnostician, map);

				}

				@Override
				protected Object getValueToSet() {
					// TODO Auto-generated method stub
					return null;
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
		return HITSPFactory.eINSTANCE.createVitalSign();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return HITSPFactory.eINSTANCE.createVitalSign().init();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		VitalSignOperations obj = new VitalSignOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for
	 */
	@Test
	public final void testValidateVitalSignCode() {
		fail("Not yet implemented"); // TODO
	}

} // VitalSignOperationsTest
