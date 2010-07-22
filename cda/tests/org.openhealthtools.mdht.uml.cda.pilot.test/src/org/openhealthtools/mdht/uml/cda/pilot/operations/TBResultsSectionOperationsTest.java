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

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;

/**
 * This class
 */
@SuppressWarnings("nls")
public class TBResultsSectionOperationsTest extends
		ResultsSectionOperationsTest {

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
		return TBPNFactory.eINSTANCE.createTBResultsSection();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionText(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionText() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionTitle(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionTitle() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionTBResultOrganizer(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionTBResultOrganizer() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionTBResultObservation(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionTBResultObservation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateResultsSectionTemplateId(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultsSectionTemplateIdTBResultsSectionDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateResultsSectionCode(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultsSectionCodeTBResultsSectionDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

} // TBResultsSectionOperationsTest