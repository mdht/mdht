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
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AdvanceDirectiveVerificationOperationsTest extends
		CCDValidationTest {

	protected static final String ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.58";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
	// -------------------------------------------------------------
	new TemplateIDCCDValidationTest(ADVANCE_DIRECTIVE_VERIFICATION_TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return AdvanceDirectiveVerificationOperations
					.validateAdvanceDirectiveVerificationTemplateId(
							(AdvanceDirectiveVerification) objectToTest,
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
		return CCDFactory.eINSTANCE.createAdvanceDirectiveVerification();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createAdvanceDirectiveVerification().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveVerificationOperations#validateAdvanceDirectiveVerificationTypeCode(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateAdvanceDirectiveVerificationTypeCode() {
		final AdvanceDirectiveVerification adv = (AdvanceDirectiveVerification) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(adv);
		assertTrue(!AdvanceDirectiveVerificationOperations
				.validateAdvanceDirectiveVerificationTypeCode(adv,
						diagnostician, map));

		adv.setTypeCode(ParticipationType.ADM);
		assertTrue(!AdvanceDirectiveVerificationOperations
				.validateAdvanceDirectiveVerificationTypeCode(adv,
						diagnostician, map));

		adv.setTypeCode(ParticipationType.VRF);
		assertTrue(AdvanceDirectiveVerificationOperations
				.validateAdvanceDirectiveVerificationTypeCode(adv,
						diagnostician, map));
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveVerificationOperations#validateAdvanceDirectiveVerificationTime(org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveVerification, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateAdvanceDirectiveVerificationTime() {
		final EObject objectToTest = getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(objectToTest);
		assertTrue(!AdvanceDirectiveVerificationOperations
				.validateAdvanceDirectiveVerificationTime(
						(AdvanceDirectiveVerification) objectToTest,
						diagnostician, map));

		((AdvanceDirectiveVerification) objectToTest)
				.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());

		assertTrue(AdvanceDirectiveVerificationOperations
				.validateAdvanceDirectiveVerificationTime(
						(AdvanceDirectiveVerification) objectToTest,
						diagnostician, map));
	}

} // AdvanceDirectiveVerificationOperationsTest