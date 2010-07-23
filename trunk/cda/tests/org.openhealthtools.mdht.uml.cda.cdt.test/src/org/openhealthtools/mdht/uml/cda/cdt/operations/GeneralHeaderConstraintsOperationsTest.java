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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.CodeCCDValidationTest;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.EffectiveTimeCCDValidationTest;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperationsTest;

/**
 * This class
 */
@SuppressWarnings("nls")
public class GeneralHeaderConstraintsOperationsTest extends
		ClinicalDocumentOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.3";

	@SuppressWarnings("hiding")
	protected static final String CODE = "unspecified";
	@SuppressWarnings("hiding")
	protected static final String CODE_SYSTEM = "unspecified";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return GeneralHeaderConstraintsOperations
							.validateGeneralHeaderConstraintsTemplateId(
									(GeneralHeaderConstraints) objectToTest,
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
					return GeneralHeaderConstraintsOperations
							.validateGeneralHeaderConstraintsCode(
									(GeneralHeaderConstraints) objectToTest,
									diagnostician, map);
				}
			},

			// EffectiveTime
			// -------------------------------------------------------------
			new EffectiveTimeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return GeneralHeaderConstraintsOperations
							.validateGeneralHeaderConstraintsEffectiveTime(
									(GeneralHeaderConstraints) objectToTest,
									diagnostician, map);
				}
			} }; // TEST_CASE_ARRAY

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
		return CDTFactory.eINSTANCE.createGeneralHeaderConstraints();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsTypeIdExtension(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTypeIdExtension() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsSetIdAndVersionNumber(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndVersionNumber() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsSetIdAndIdAreUnique(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsSetIdAndIdAreUnique() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsCopyTimeNotPresent(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCopyTimeNotPresent() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsConfidentialityCode(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsConfidentialityCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsId(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsLanguageCode(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsLanguageCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsRealmCode(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRealmCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsTitle(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTitle() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations#validateGeneralHeaderConstraintsTypeId(org.openhealthtools.mdht.uml.cda.cdt.GeneralHeaderConstraints, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTypeId() {
		fail("Not yet implemented");
	}

} // GeneralHeaderConstraintsOperationsTest