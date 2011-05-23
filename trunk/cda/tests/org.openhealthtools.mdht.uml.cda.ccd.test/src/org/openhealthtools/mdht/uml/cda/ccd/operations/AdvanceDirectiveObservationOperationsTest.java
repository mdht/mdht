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
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class AdvanceDirectiveObservationOperationsTest extends StructuralAttributeValidationTest {

	protected static final String ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.17";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, ActClassObservation.OBS);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	// Status code
	private static final String STATUS_CODE = "completed";

	private static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	// This Code may be incorrect, it is not specified in the OCL
	protected static final String CODE = "ASSERTION";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.5.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationTemplateId(
						(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
				}

			},

			// ID
			// -------------------------------------------------------------
			new IDCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationId(
						(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
				}
			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationStatusCode(
						(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
				}
			},

			// EffectiveTime
			// -------------------------------------------------------------
			new EffectiveTimeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationEffectiveTime(
						(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
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
		return CCDFactory.eINSTANCE.createAdvanceDirectiveObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createAdvanceDirectiveObservation().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationClassCode(
			(AdvanceDirectiveObservation) eObjectToValidate, diagnostician, map) &&
				AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationMoodCode(
					(AdvanceDirectiveObservation) eObjectToValidate, diagnostician, map);
	}

} // AdvanceDirectiveObservationOperationsTest
