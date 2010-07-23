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
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ncr.EncountersSection;
import org.openhealthtools.mdht.uml.cda.ncr.NCRFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class EncountersSectionOperationsTest
		extends
		org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.17.2.2";

	
	private static final CDATestCase TEST_CASE_ARRAY[] = {	// Template ID
		new TemplateIDValidationTest(
				TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EncountersSectionOperations
				.validateEncountersSectionTemplateId(
						(EncountersSection) objectToTest,
						diagnostician, map);
			}

		}};

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
		return NCRFactory.eINSTANCE.createEncountersSection();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.EncountersSectionOperations#validateNCREncountersSectionText(org.openhealthtools.mdht.uml.cda.ncr.EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNCREncountersSectionText() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.EncountersSectionOperations#validateNCREncountersSectionTitle(org.openhealthtools.mdht.uml.cda.ncr.EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNCREncountersSectionTitle() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ncr.operations.EncountersSectionOperations#validateNCREncountersSectionNeonatalICUEncounterActivity(org.openhealthtools.mdht.uml.cda.ncr.EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateNCREncountersSectionNeonatalICUEncounterActivity() {
		fail("Not yet implemented");
	}

} // EncountersSectionOperationsTest