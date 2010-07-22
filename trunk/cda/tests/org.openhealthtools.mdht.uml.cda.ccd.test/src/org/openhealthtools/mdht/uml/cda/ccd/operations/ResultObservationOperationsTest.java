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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class ResultObservationOperationsTest extends
StructuralAttributeValidationTest {

	protected static final String RESULT_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.31";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	// Likely incorrect value, not specified in the OCL.
	private static final String OBSERVATION_VALUE_CODE_SYSTEM = "2.16.840.1.113883.1.11.20.3";

	private static final String CODE = "whatever";

	private static final String CODE_CODE_SYSTEM = "whatever";

	private static final String STATUS_CODE = "whatever";

	private static final String STATUS_CODE_CODE_SYSTEM = "whatever";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(RESULT_OBSERVATION_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationTemplateId(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}

		},

		// ID
		// -------------------------------------------------------------
		new IDCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationId(
						(ResultObservation) objectToTest,
						diagnostician, map);
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
				return ResultObservationOperations
				.validateResultObservationStatusCode(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}
		},

		// Code
		// -------------------------------------------------------------
		new CodeCCDValidationTest(CODE, CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationCode(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}
		},
		// EffectiveTime
		// -------------------------------------------------------------
		new EffectiveTimeCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationEffectiveTime(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}
		},

		// ObservationValue
		// -------------------------------------------------------------
		new ObservationValueCCDValidationTest(OBSERVATION_VALUE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationValue(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}
		},

		// Information Source
		// -------------------------------------------------------------
		new InformationSourceCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultObservationOperations
				.validateResultObservationInformationSource(
						(ResultObservation) objectToTest,
						diagnostician, map);
			}
		}

	}; // TEST_CASE_ARRAY

	private static final String INTERPRETATION_CODE = "whatever";

	private static final String INTERPRETATION_CODE_CODE_SYSTEM = "whatever";

	private static final String METHOD_CODE = "whatever";

	private static final String METHOD_CODE_CODE_SYSTEM = "whatever";

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
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation();
		section.addObservation(resultObservation);
		return resultObservation;	
//		return CCDFactory.eINSTANCE.createResultObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createResultObservation().init();
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
		return ResultObservationOperations.validateResultObservationMoodCode(
				(ResultObservation) eObjectToValidate, diagnostician, map);
	}

	/**
	 * 
	 */
	@Test
	public void testResultsObservationNoObservationRangeCode() {
		final ResultObservation ro = (ResultObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);
		try {
			boolean isValid = doValidateNoObservationRangeCode(ro,
					diagnostician);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

			final ReferenceRange range = CDAFactory.eINSTANCE
			.createReferenceRange();

			final ObservationRange or = CDAFactory.eINSTANCE
			.createObservationRange();
			range.setObservationRange(or);
			ro.getReferenceRanges().add(range);

			isValid = doValidateNoObservationRangeCode(ro, diagnostician);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

			// Define a code
			final CD cd = DatatypesFactory.eINSTANCE.createCD();
			cd.setCode("somecode");
			or.setCode(cd);

			isValid = doValidateNoObservationRangeCode(ro, diagnostician);
			assertTrue("Validation passed when it was expected to fail",
					!isValid);

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(
					"NoObservationRangecode", uoe));
		}
	}

	private boolean doValidateNoObservationRangeCode(
			final EObject eObjectToValidate, final BasicDiagnostic diagnostician) {
		return ResultObservationOperations
		.validateResultObservationNoObservationRangeCode(
				(ResultObservation) eObjectToValidate, diagnostician,
				map);
	}

	/**
	 * JUnit test
	 */
	@Test
	public void testResultsObservationReferenceRangeRequired() {
		final ResultObservation ro = (ResultObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);
		try {
			boolean isValid = doValidateReferenceRangeRequired(ro,
					diagnostician);
			assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

			final ReferenceRange rr = CDAFactory.eINSTANCE
			.createReferenceRange();
			final ObservationRange or = CDAFactory.eINSTANCE
			.createObservationRange();
			rr.setObservationRange(or);
			ro.getReferenceRanges().add(rr);

			isValid = doValidateReferenceRangeRequired(ro, diagnostician);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(
					"ReferenceRangeRequired", uoe));
		}

	}

	protected boolean doValidateReferenceRangeRequired(
			final EObject eObjectToValidate, final BasicDiagnostic diagnostician) {
		return ResultObservationOperations
		.validateResultObservationReferenceRangeRequired(
				(ResultObservation) eObjectToValidate, diagnostician,
				map);
	}

	/**
	 * JUnit test
	 */
	@Test
	public void testResultsObservationInterpretationCode() {
		final ResultObservation ro = (ResultObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);
		try {
			boolean isValid = ResultObservationOperations
			.validateResultObservationInterpretationCode(ro,
					diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

			final CE interpretationCode = DatatypesFactory.eINSTANCE.createCE(
					INTERPRETATION_CODE, INTERPRETATION_CODE_CODE_SYSTEM);
			ro.getInterpretationCodes().add(interpretationCode);

			isValid = ResultObservationOperations
			.validateResultObservationInterpretationCode(ro,
					diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(
					"InterpretationCode", uoe));
		}
	}

	/**
	 * JUnit test
	 */
	@Test
	public void testResultsObservationMethodCode() {
		final ResultObservation ro = (ResultObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);
		try {
			boolean isValid = ResultObservationOperations
			.validateResultObservationMethodCode(ro,
					diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

			final CE methodCode = DatatypesFactory.eINSTANCE.createCE(
					METHOD_CODE, METHOD_CODE_CODE_SYSTEM);
			ro.getMethodCodes().add(methodCode);

			isValid = ResultObservationOperations
			.validateResultObservationMethodCode(ro,
					diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage(
					"MethodCode", uoe));
		}
	}
} // ResultObservationOperationsTest