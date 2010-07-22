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

import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ConsultationNoteOperationsTest extends
		GeneralHeaderConstraintsOperationsTest {

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
		return CDTFactory.eINSTANCE.createConsultationNote();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteReferralOrVisit(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteReferralOrVisit() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateGeneralHeaderConstraintsCode(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCodeConsultationNoteDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteHistoryOfPresentIllness(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteHistoryOfPresentIllness() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNotePhysicalExaminationSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNotePhysicalExaminationSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteProblemSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteProblemSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteProceduresSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteProceduresSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNotePastMedicalHistorySectionConsult(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNotePastMedicalHistorySectionConsult() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteImmunizationsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteImmunizationsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteMedicationsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteMedicationsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteAlertsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteAlertsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteSocialHistorySection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteSocialHistorySection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteFamilyHistorySection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteFamilyHistorySection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteReviewOfSystemsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteReviewOfSystemsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteVitalSignsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteVitalSignsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteGeneralStatusSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteGeneralStatusSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateConsultationNoteResultsSection(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateConsultationNoteResultsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations#validateGeneralHeaderConstraintsTemplateId(org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateIdConsultationNoteDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

} // ConsultationNoteOperationsTest