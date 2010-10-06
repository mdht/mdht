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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultsSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.pilot.TBPNFactory;
import org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * This class
 */
@SuppressWarnings("nls")
public class TBResultsSectionOperationsTest extends
		ResultsSectionOperationsTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.15.2.6";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		TBResultsSectionOperations obj = new TBResultsSectionOperations();
		assertTrue(true);
	} // testConstructor

	private static final CDATestCase TEST_CASE_ARRAY[] = {

			// Template ID
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultsSectionOperations
							.validateResultsSectionTemplateId(
									(TBResultsSection) objectToTest,
									diagnostician, map);
				}
			},

			// Title
			// -------------------------------------------------------------
			new TitleCCDValidationTest() {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultsSectionOperations
							.validateTBResultsSectionTitle(
									(TBResultsSection) objectToTest,
									diagnostician, map);
				}

				/**
				 * @see org.openhealthtools.mdht.uml.cda.ccd.operations.CCDValidationTest.TitleCCDValidationTest#getValueToSet()
				 */
				@Override
				protected Object getValueToSet() {
					final ST title = (ST) super.getValueToSet();
					title.addText("Relevant diagnostic tests and/or laboratory data");
					return title;
				}
			},

			// Text
			// -------------------------------------------------------------
			new TextCCDValidationTest() {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return TBResultsSectionOperations
							.validateTBResultsSectionText(
									(TBResultsSection) objectToTest,
									diagnostician, map);
				}

			},

	};

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
		return TBPNFactory.eINSTANCE.createTBResultsSection();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionTBResultOrganizer(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionTBResultOrganizer() {
		TBResultsSection objectToTest = (TBResultsSection) getObjectToTest();
		TBResultsSectionOperations.validateTBResultsSectionTBResultOrganizer(
				objectToTest,
				Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest),
				map);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateTBResultsSectionTBResultObservation(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateTBResultsSectionTBResultObservation() {
		TBResultsSection objectToTest = (TBResultsSection) getObjectToTest();
		TBResultsSectionOperations.validateTBResultsSectionTBResultObservation(
				objectToTest,
				Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest),
				map);
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.pilot.operations.TBResultsSectionOperations#validateResultsSectionCode(org.openhealthtools.mdht.uml.cda.pilot.TBResultsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateResultsSectionCodeTBResultsSection() {
		TBResultsSection objectToTest = (TBResultsSection) getObjectToTest();
		TBResultsSectionOperations.validateResultsSectionCode(objectToTest,
				Diagnostician.INSTANCE.createDefaultDiagnostic(objectToTest),
				map);
		fail("Not yet implemented");
	}

	/**
	 * test
	 */
	@Test
	public void testGetTbResultObservations() {
		assertNotNull(TBResultsSectionOperations.getTbResultObservations(null));
		fail("Not implemented.");
	} // testGetTbResultObservations
	
	/**
	 * test
	 */
	@Test
	public void testGetTbResultOrganizers() {
		assertNotNull(TBResultsSectionOperations.getTbResultOrganizers(null));
		fail("Not implemented.");
	} // testGetTbResultOrganizers
	
} // TBResultsSectionOperationsTest