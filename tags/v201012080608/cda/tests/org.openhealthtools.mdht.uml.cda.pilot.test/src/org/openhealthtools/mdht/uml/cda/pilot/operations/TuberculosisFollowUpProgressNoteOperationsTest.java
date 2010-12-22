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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperationsTest;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class TuberculosisFollowUpProgressNoteOperationsTest extends
		ClinicalDocumentOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.15.2.6.1.1.1.1.1.2.3";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		TuberculosisFollowUpProgressNoteOperations obj = new TuberculosisFollowUpProgressNoteOperations();
		assertTrue(true);
	} // testConstructor
	
	private static final CDATestCase TEST_CASE_ARRAY[] = {

	// Template ID
	new TemplateIDValidationTest(TEMPLATE_ID) {

		@Override
		protected boolean validate(final EObject objectToTest,
				final BasicDiagnostic diagnostician,
				final Map<Object, Object> map) {
			return TuberculosisFollowUpProgressNoteOperations
					.validateTuberculosisFollowUpProgressNoteTemplateId(
							(TuberculosisFollowUpProgressNote) objectToTest,
							diagnostician, map);
		}
	} };

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
		return TBPNFactory.eINSTANCE.createTuberculosisFollowUpProgressNote();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TuberculosisFollowUpProgressNoteOperations#validateTuberculosisFollowUpProgressNotePatientNames(org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTuberculosisFollowUpProgressNotePatientNames() {
		TuberculosisFollowUpProgressNote objectToTest = (TuberculosisFollowUpProgressNote) getObjectToTest();
		TuberculosisFollowUpProgressNoteOperations
				.validateTuberculosisFollowUpProgressNotePatientNames(
						objectToTest, Diagnostician.INSTANCE
								.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TuberculosisFollowUpProgressNoteOperations#validateTuberculosisFollowUpProgressNoteTBResultsSection(org.openhealthtools.mdht.uml.cda.pilot.TuberculosisFollowUpProgressNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTuberculosisFollowUpProgressNoteTBResultsSection() {
		TuberculosisFollowUpProgressNote objectToTest = (TuberculosisFollowUpProgressNote) getObjectToTest();
		TuberculosisFollowUpProgressNoteOperations
				.validateTuberculosisFollowUpProgressNoteTBResultsSection(
						objectToTest, Diagnostician.INSTANCE
								.createDefaultDiagnostic(objectToTest), map);
		fail("Not yet implemented");
	}

	/**
	 * test
	 */
	@Test
	public void testGetTbResultsSection() {
		assertNotNull(TuberculosisFollowUpProgressNoteOperations.getTbResultsSection(null));
		fail("Not implemented.");
	} // testGetTbResultsSection
	
} // TuberculosisFollowUpProgressNoteOperationsTest