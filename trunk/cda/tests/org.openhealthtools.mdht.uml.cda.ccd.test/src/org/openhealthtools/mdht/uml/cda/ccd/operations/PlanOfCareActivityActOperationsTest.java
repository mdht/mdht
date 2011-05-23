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
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class
 */
@SuppressWarnings({ "nls" })
public class PlanOfCareActivityActOperationsTest extends CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.25";

	// protected static final HashMap<String, Enumerator>
	// VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String,
	// Enumerator>() {
	// {
	// // These are all the valid mode codes. Test needs to be specialized
	// // below.
	// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.INT);
	// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.ARQ);
	// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.PRMS);
	// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.PRP);
	// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.RQO);
	// }
	// };

	// Status code

	// protected static final String CODE = "397659008";
	// protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.96";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivityActOperations.validatePlanOfCareActivityActTemplateId(
						(PlanOfCareActivityAct) objectToTest, diagnostician, map);
				}
			},

			// ID
			// -------------------------------------------------------------
			new IDCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivityActOperations.validatePlanOfCareActivityActId(
						(PlanOfCareActivityAct) objectToTest, diagnostician, map);
				}
			},

			// Mood Code
			// -------------------------------------------------------------
			new MoodCodeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivityActOperations.validatePlanOfCareActivityActMoodCode(
						(PlanOfCareActivityAct) objectToTest, diagnostician, map);
				}
			},

			// Mood Code Value
			// -------------------------------------------------------------
			new MoodCodeValueCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PlanOfCareActivityActOperations.validatePlanOfCareActivityActMoodCodeValue(
						(PlanOfCareActivityAct) objectToTest, diagnostician, map);
				}

				@Override
				List<Object> getModeCodeValues() {
					final List<Object> retValue = new ArrayList<Object>();
					retValue.add(x_DocumentActMood.INT);
					retValue.add(x_DocumentActMood.ARQ);
					retValue.add(x_DocumentActMood.PRMS);
					retValue.add(x_DocumentActMood.PRP);
					retValue.add(x_DocumentActMood.RQO);
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
		return CCDFactory.eINSTANCE.createPlanOfCareActivityAct();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPlanOfCareActivityAct().init();
	}

} // PlanOfCareActivityActOperationsTest
