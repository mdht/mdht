/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.CoverageActivity;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class CoverageActivityOperationsTest extends StructuralAttributeValidationTest {

	protected static final String COVERAGE_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.20";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, x_ActClassDocumentEntryAct.ACT);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.DEF);
		}
	};

	protected static final String STATUS_CODE = "completed";

	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(COVERAGE_ACTIVITY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return CoverageActivityOperations.validateCoverageActivityTemplateId(
						(CoverageActivity) objectToTest, diagnostician, map);
				}

			},

			// ID
			// -------------------------------------------------------------
			new IDCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return CoverageActivityOperations.validateCoverageActivityId(
						(CoverageActivity) objectToTest, diagnostician, map);
				}
			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return CoverageActivityOperations.validateCoverageActivityStatusCode(
						(CoverageActivity) objectToTest, diagnostician, map);
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
		return CCDFactory.eINSTANCE.createCoverageActivity();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createCoverageActivity().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return CoverageActivityOperations.validateCoverageActivityClassCode(
			(CoverageActivity) eObjectToValidate, diagnostician, map) &&
				CoverageActivityOperations.validateCoverageActivityMoodCode(
					(CoverageActivity) eObjectToValidate, diagnostician, map);
	}

	/**
	 * 
	 */
	@Test
	public void testValidateCoverageActivitySequenceNumber() {
		// This is not fully implemented.
		final CoverageActivity ca = (CoverageActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ca);

		boolean isValid = CoverageActivityOperations.validateCoverageActivitySequenceNumber(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidateCoverageActivityPolicyActivity() {
		// This is not fully implemented.
		final CoverageActivity ca = (CoverageActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ca);

		boolean isValid = CoverageActivityOperations.validateCoverageActivityPolicyActivity(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidateCoverageActivityInformationSource() {
		// This is not fully implemented.
		final CoverageActivity ca = (CoverageActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ca);

		boolean isValid = CoverageActivityOperations.validateCoverageActivityInformationSource(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidateCoverageActivityCode() {
		// This is not fully implemented.
		final CoverageActivity ca = (CoverageActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(ca);

		boolean isValid = CoverageActivityOperations.validateCoverageActivityCode(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

} // CoverageActivityOperationsTest
