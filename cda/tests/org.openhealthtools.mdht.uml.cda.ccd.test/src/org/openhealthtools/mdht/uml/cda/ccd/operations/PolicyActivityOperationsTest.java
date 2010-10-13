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
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class PolicyActivityOperationsTest extends
		StructuralAttributeValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.26";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, x_ActClassDocumentEntryAct.ACT);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PolicyActivityOperations
							.validatePolicyActivityTemplateId(
									(PolicyActivity) objectToTest,
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
					return PolicyActivityOperations.validatePolicyActivityId(
							(PolicyActivity) objectToTest, diagnostician, map);
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
					return PolicyActivityOperations
							.validatePolicyActivityStatusCode(
									(PolicyActivity) objectToTest,
									diagnostician, map);
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
		return CCDFactory.eINSTANCE.createPolicyActivity();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPolicyActivity().init();
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
		return PolicyActivityOperations.validatePolicyActivityClassCode(
				(PolicyActivity) eObjectToValidate, diagnostician, map)
				&& PolicyActivityOperations.validatePolicyActivityMoodCode(
						(PolicyActivity) eObjectToValidate, diagnostician, map);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivitySubscriberTime() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivitySubscriberTime(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivitySubscriberIsAllowed() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivitySubscriberIsAllowed(ca, diagnostician,
						map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityPolicySubscriber() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityPolicySubscriber(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityPayerEntityIsRequired() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityPayerEntityIsRequired(ca, diagnostician,
						map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityPayerEntity() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityPayerEntity(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityEntryRelationshipTarget() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityEntryRelationshipTarget(ca,
						diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityEntryRelationshipREFR() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityEntryRelationshipREFR(ca, diagnostician,
						map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityCoveredPartyTime() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityCoveredPartyTime(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityCoveredPartyIsRequired() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityCoveredPartyIsRequired(ca,
						diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testValidatePolicyActivityCoveredParty() {
		// This is not fully implemented.
		final PolicyActivity ca = (PolicyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ca);

		boolean isValid = PolicyActivityOperations
				.validatePolicyActivityCoveredParty(ca, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}
} // PolicyActivityOperationsTest