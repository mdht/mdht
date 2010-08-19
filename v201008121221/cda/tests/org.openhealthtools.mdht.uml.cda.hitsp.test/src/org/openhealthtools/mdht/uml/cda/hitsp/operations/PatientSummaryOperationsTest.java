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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary;
import org.openhealthtools.mdht.uml.cda.hitsp.ProblemListSection;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalDocumentOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class PatientSummaryOperationsTest extends
ClinicalDocumentOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.32.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryTemplateId(
						(PatientSummary) objectToTest, diagnostician, map);
			}
		},

		// AdvanceDirectiveSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("AdvanceDirectiveSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryAdvanceDirectivesSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// AllergiesReactionsSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("AllergiesReactionsSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryAllergiesReactionsSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// ProblemListSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("ProblemListSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryProblemListSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// EncountersSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("EncountersSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryEncountersSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// ImmunizationsSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("ImmunizationsSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryImmunizationsSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// PayersSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("PayersSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryPayersSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

			}
		},

		// MedicationsSection
		// -------------------------------------------------------------
		new CDAValidationTestCase("MedicationsSection") {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PatientSummaryOperations.validatePatientSummaryMedicationsSection(
						(PatientSummary) objectToTest, diagnostician, map);
			}

			@Override
			protected void doTest(final EObject objectToTest,
					final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
				fail("Not Implemented");

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
		return HITSPFactory.eINSTANCE.createPatientSummary();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return HITSPFactory.eINSTANCE.createPatientSummary().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.hitsp.operations.PatientSummaryOperations#createProblemListSection(org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary)}
	 * .
	 */
	@Test
	public final void testCreateProblemListSection() {
		final PatientSummary ps = HITSPFactory.eINSTANCE.createPatientSummary();
		PatientSummaryOperations.createProblemListSection(ps);
		assertTrue(ps.getSections().size()==1);
		final Section section = ps.getSections().get(0);
		assertTrue(section instanceof ProblemListSection);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.hitsp.operations.PatientSummaryOperations#createMedicationsSection(org.openhealthtools.mdht.uml.cda.hitsp.PatientSummary)}
	 * .
	 */
	@Test
	public final void testCreateMedicationsSection() {
		final PatientSummary ps = HITSPFactory.eINSTANCE.createPatientSummary();
		PatientSummaryOperations.createMedicationsSection(ps);
		assertTrue(ps.getSections().size()==1);
		final Section section = ps.getSections().get(0);
		assertTrue(section instanceof MedicationsSection);
	}

} // PatientSummaryOperationsTest