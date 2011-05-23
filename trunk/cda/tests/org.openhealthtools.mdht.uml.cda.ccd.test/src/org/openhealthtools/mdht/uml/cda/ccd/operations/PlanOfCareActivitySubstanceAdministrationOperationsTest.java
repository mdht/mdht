/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * This class
 */
@SuppressWarnings({ "nls" })
public class PlanOfCareActivitySubstanceAdministrationOperationsTest extends CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.25";

	// This Code may be incorrect, it is not specified in the OCL
	protected static final String CODE = "ASSERTION";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.5.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
						(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
				}

			},

			// ID
			// -------------------------------------------------------------
			new IDCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationId(
						(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
				}
			},

			// Mood Code
			// -------------------------------------------------------------
			new MoodCodeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCode(
						(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
				}
			},

			// Mood Code Value
			// -------------------------------------------------------------
			new MoodCodeValueCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationMoodCodeValue(
						(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
				}

				@Override
				List<Object> getModeCodeValues() {
					final List<Object> retValue = new ArrayList<Object>();
					retValue.add(x_DocumentSubstanceMood.INT);
					retValue.add(x_DocumentSubstanceMood.RQO);
					retValue.add(x_DocumentSubstanceMood.PRMS);
					retValue.add(x_DocumentSubstanceMood.PRP);
					return retValue;
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
		return CCDFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration().init();
	}

} // PlanOfCareActivitySubstanceAdministrationOperationsTest
