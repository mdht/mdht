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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationSectionOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class MedicationsSectionOperationsTest extends MedicationSectionOperationsTest {

	// @SuppressWarnings("hiding")
	// protected static final String TEMPLATE_ID =
	// "2.16.840.1.113883.10.20.1.8";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// MedicationsSectionOperations obj = new MedicationsSectionOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @SuppressWarnings("static-access")
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return MedicationsSectionOperations
	// .validateMedicationsSectionTemplateId(
	// (MedicationsSection) objectToTest, diagnostician,
	// map);
	// }
	//
	// }
	//
	// }; // TEST_CASE_ARRAY
	//
	// @Override
	// protected List<CDATestCase> getTestCases() {
	// // Return a new List because the one returned by Arrays.asList is
	// // unmodifiable so a sub-class can't append their test cases.
	// final List<CDATestCase> retValue = super.getTestCases();
	// retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
	// return retValue;
	// }
	//
	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createMedicationsSection();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createMedicationsSection().init();
	// }

	@Test
	public void testValidateIHEMedicationsSectionTemplateId() {
		fail("Not yet implemented");
	}

	@Test
	public void testValidateIHEMedicationsSectionMedication() {
		fail("Not yet implemented");
	}
}// MedicationsSectionOperationsTest