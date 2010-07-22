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
package org.openhealthtools.mdht.uml.cda.ncr.operations;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperationsTest;
import org.openhealthtools.mdht.uml.cda.ncr.NCRFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class BirthWeightOperationsTest extends ResultObservationOperationsTest {

	private static final CDATestCase TEST_CASE_ARRAY[] = {};

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
		return NCRFactory.eINSTANCE.createBirthWeight();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateBirthWeightClassCode(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateBirthWeightClassCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateBirthWeightMoodCode(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateBirthWeightMoodCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateBirthWeightValue(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateBirthWeightValue() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateResultObservationTemplateId(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultObservationTemplateIdBirthWeightDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateResultObservationCode(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultObservationCodeBirthWeightDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.BirthWeightOperations#validateResultObservationStatusCode(org.openhealthtools.mdht.uml.cda.ncr.BirthWeight, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultObservationStatusCodeBirthWeightDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

} // BirthWeightOperationsTest