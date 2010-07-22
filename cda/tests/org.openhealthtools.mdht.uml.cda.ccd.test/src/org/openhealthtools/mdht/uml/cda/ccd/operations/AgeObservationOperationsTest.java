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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.ccd.AgeObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * This class
 */
@SuppressWarnings({ "nls", "serial" })
public class AgeObservationOperationsTest extends
StructuralAttributeValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.38";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, ActClassObservation.OBS);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	// Status code
	private static final String STATUS_CODE = "completed";
	private static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "397659008";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.96";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AgeObservationOperations
				.validateAgeObservationTemplateId(
						(AgeObservation) objectToTest,
						diagnostician, map);
			}

		},

		// Code
		// -------------------------------------------------------------
		new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AgeObservationOperations.validateAgeObservationCode(
						(AgeObservation) objectToTest, diagnostician, map);
			}
		},

		// Status Code
		// -------------------------------------------------------------
		new StatusCodeCCDValidationTest(STATUS_CODE,
				STATUS_CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AgeObservationOperations
				.validateAgeObservationStatusCode(
						(AgeObservation) objectToTest,
						diagnostician, map);
			}
		},

		// Value
		// -------------------------------------------------------------
		new CCDValidationTestCase("value") {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AgeObservationOperations
				.validateAgeObservationValue(
						(AgeObservation) objectToTest,
						diagnostician, map);
			}

			@SuppressWarnings("unchecked")
			@Override
			protected void doSet(final EObject objectToTest,
					final String featureName) {
				//				final EObjectContainmentEList<ANY> theList = (EObjectContainmentEList<ANY>) objectToTest.eGet(objectToTest.eClass().getEStructuralFeature(
				//						featureName));

				final EList<ANY> theList = (EList<ANY>) objectToTest.eGet(objectToTest.eClass().getEStructuralFeature(
						featureName));

				theList.add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected Object getValueToSet() {
				final EList<Observation> retValue = new BasicEList<Observation>();
				// For some reason, an ArrayStoreException is thrown.
				//fail("Implementation problem.  See comments in source code.");
				final Observation observation = CCDFactory.eINSTANCE
				.createAgeObservation();
				retValue.add(observation);
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
		return CCDFactory.eINSTANCE.createAgeObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createAgeObservation().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(
			final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP
		.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(
			final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return AgeObservationOperations.validateAgeObservationClassCode(
				(AgeObservation) eObjectToValidate, diagnostician, map)
				&& AgeObservationOperations.validateAgeObservationMoodCode(
						(AgeObservation) eObjectToValidate, diagnostician, map);
	}

} // AgeObservationOperationsTest
