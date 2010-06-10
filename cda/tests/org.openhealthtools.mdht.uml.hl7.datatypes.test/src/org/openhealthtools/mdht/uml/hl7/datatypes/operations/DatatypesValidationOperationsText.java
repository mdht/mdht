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
package org.openhealthtools.mdht.uml.hl7.datatypes.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public abstract class DatatypesValidationOperationsText extends
		DatatypesOperationsTest {

	/**
	 * This class is a JUnit4 test case.
	 */
	protected static abstract class DatatypeTestCase {

		public static final String TEST_TEXT = "some test text";
		protected EStructuralFeature feature;

		protected DatatypeTestCase(final EStructuralFeature feature) {
			this.feature = feature;
		}

		public abstract boolean validate(EObject eObjectToTest,
				BasicDiagnostic diagnostician, Map<Object, Object> map);

		public abstract void createAndAddPartType(EObject eObjectToTest);

		public abstract void createAndAddBadPartType(EObject eObjectToTest);

		public abstract void add(EObject eObjectToTest, String adxpText);

	} // DatatypeTestCase

	protected abstract List<DatatypeTestCase> getTestCases();

	/**
	 * This single method serves to perform all of the validation tests by
	 * iterating through the tests specified in AD_TEST_CASES.
	 */
	@Test
	public final void testAllValidations() {

		try {
			for (final DatatypeTestCase testCase : getTestCases()) {
				final EObject eObjectToTest = getEObjectToTest();
				final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
						.createDefaultDiagnostic(eObjectToTest);

				boolean isValid = testCase.validate(eObjectToTest,
						diagnostician, map);
				assertTrue(createAssertionFailureMessage(diagnostician),
						isValid);

				testCase.createAndAddPartType(eObjectToTest);

				isValid = testCase.validate(eObjectToTest, diagnostician, map);
				assertTrue(createAssertionFailureMessage(diagnostician),
						isValid);

				testCase.createAndAddBadPartType(eObjectToTest);

				isValid = testCase.validate(eObjectToTest, diagnostician, map);
				assertTrue("Validation of \"" + testCase.feature.getName()
						+ "\" passed when it should have failed.", !isValid);

			}

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(uoe));
		}
	} // testAllValidations

	/**
	 * This single method serves to perform all of the validation tests by
	 * iterating through the tests.
	 */
	@Test
	public final void testAllAdds() {
		final Map<Object, Object> map = new HashMap<Object, Object>();

		try {
			for (final DatatypeTestCase testCase : getTestCases()) {
				final EObject eObjectToTest = getEObjectToTest();
				final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
						.createDefaultDiagnostic(eObjectToTest);

				boolean isValid = testCase.validate(eObjectToTest,
						diagnostician, map);
				assertTrue(createAssertionFailureMessage(diagnostician),
						isValid);

				testCase.add(eObjectToTest, DatatypeTestCase.TEST_TEXT);

				assertTrue("Adding to \"" + testCase.feature.getName()
						+ "\" failed!", !((EList<?>) (eObjectToTest
						.eGet(testCase.feature))).isEmpty());

				isValid = testCase.validate(eObjectToTest, diagnostician, map);
				assertTrue(createAssertionFailureMessage(diagnostician),
						isValid);
			}
		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(uoe));
		}
	} // testAllAdds

} // DatatypesValidationOperationsText