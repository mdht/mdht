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
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersActivityOperationsTest;
import org.openhealthtools.mdht.uml.cda.ncr.NCRFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class NeonatalICUEncounterActivityOperationsTest extends
		EncountersActivityOperationsTest {

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
	 * @see org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getEObjectToValidate()
	 */
	@Override
	protected EObject getEObjectToValidate() {
		return NCRFactory.eINSTANCE.createNeonatalICUEncounterActivity();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateNeonatalICUEncounterActivityLocation(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNeonatalICUEncounterActivityLocation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateNeonatalICUEncounterActivityClassCode(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNeonatalICUEncounterActivityClassCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateNeonatalICUEncounterActivityMoodCode(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNeonatalICUEncounterActivityMoodCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateEncountersActivityCode(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateEncountersActivityCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateNeonatalICUEncounterActivityEffectiveTime(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNeonatalICUEncounterActivityEffectiveTime() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateNeonatalICUEncounterActivityId(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNeonatalICUEncounterActivityId() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.NeonatalICUEncounterActivityOperations#validateEncountersActivityTemplateId(org.openhealthtools.mdht.uml.cda.ncr.NeonatalICUEncounterActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateEncountersActivityTemplateIdNeonatalICUEncounterActivityDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

}
// NeonatalICUEncounterActivityOperationsTest