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
import org.openhealthtools.mdht.uml.cda.ncr.NCRFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class PatientDataSectionNCROperationsTest extends
		PatientDataSectionOperationsTest {

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
		return NCRFactory.eINSTANCE.createPatientDataSectionNCR();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.PatientDataSectionNCROperations#validatePatientDataSectionNCREncountersSection(org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePatientDataSectionNCREncountersSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.PatientDataSectionNCROperations#validatePatientDataSectionNCRAcuityDataSection(org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePatientDataSectionNCRAcuityDataSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.PatientDataSectionNCROperations#validatePatientDataSectionNCRBirthWeight(org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePatientDataSectionNCRBirthWeight() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.PatientDataSectionNCROperations#validatePatientDataSectionTemplateId(org.openhealthtools.mdht.uml.cda.ncr.PatientDataSectionNCR, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePatientDataSectionTemplateIdPatientDataSectionNCRDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

}
// PatientDataSectionNCROperationsTest