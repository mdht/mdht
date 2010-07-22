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
 * This class
 */
@SuppressWarnings("nls")
public class HistoryAndPhysicalOperationsTest extends
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
		return CDTFactory.eINSTANCE.createHistoryAndPhysical();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalAssessmentAndPlan(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalAssessmentAndPlan() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalBothAssessmentAndPlan(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalBothAssessmentAndPlan() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalReasonForVisitAndChiefComplaint() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateGeneralHeaderConstraintsCode(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCodeHistoryAndPhysicalDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalHistoryOfPresentIllness(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalHistoryOfPresentIllness() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalPastMedicalHistorySection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalPastMedicalHistorySection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalMedicationsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalMedicationsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalAlertsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalAlertsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalSocialHistorySection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalSocialHistorySection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalFamilyHistorySection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalFamilyHistorySection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalReviewOfSystemsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalReviewOfSystemsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalPhysicalExaminationSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalPhysicalExaminationSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalVitalSignsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalVitalSignsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalGeneralStatusSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalGeneralStatusSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalResultsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalResultsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalProblemSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalProblemSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalProceduresSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalProceduresSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateHistoryAndPhysicalImmunizationsSection(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateHistoryAndPhysicalImmunizationsSection() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations#validateGeneralHeaderConstraintsTemplateId(org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateIdHistoryAndPhysicalDiagnosticChainMapOfObjectObject() {
		fail("Not yet implemented");
	}

} // HistoryAndPhysicalOperationsTest