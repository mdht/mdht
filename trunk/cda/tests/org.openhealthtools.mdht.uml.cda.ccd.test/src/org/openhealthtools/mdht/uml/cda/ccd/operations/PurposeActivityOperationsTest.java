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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings( { "nls", "serial" })
public class PurposeActivityOperationsTest extends
		StructuralAttributeValidationTest {

	protected static final String PURPOSE_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.30";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, x_ActClassDocumentEntryAct.ACT);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "23745001";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.96";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDCCDValidationTest(PURPOSE_ACTIVITY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PurposeActivityOperations
							.validatePurposeActivityTemplateId(
									(PurposeActivity) eObjectToTest,
									diagnostician, map);
				}

			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE,
					STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PurposeActivityOperations
							.validatePurposeActivityStatusCode(
									(PurposeActivity) eObjectToTest,
									diagnostician, map);
				}
			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return PurposeActivityOperations
							.validatePurposeActivityCode(
									(PurposeActivity) eObjectToTest,
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
	protected EObject getEObjectToValidate() {
		return CCDFactory.eINSTANCE.createPurposeActivity();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createPurposeActivity().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.PurposeActivityOperations#validatePurposeActivityHasReason(org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidatePurposeActivityHasReason() {
		final PurposeActivity pa = (PurposeActivity) getEObjectToValidate();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(pa);
		boolean isValid = PurposeActivityOperations
				.validatePurposeActivityReasonType(pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		final EntryRelationship rel = CDAFactory.eINSTANCE
				.createEntryRelationship();
		rel.setTypeCode(x_ActRelationshipEntryRelationship.RSON);

		pa.getEntryRelationships().add(rel);

		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.PurposeActivityOperations#validatePurposeActivityReasonType(org.openhealthtools.mdht.uml.cda.ccd.PurposeActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidatePurposeActivityReasonType() {
		final PurposeActivity pa = (PurposeActivity) getEObjectToValidate();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(pa);

		boolean isValid = PurposeActivityOperations
				.validatePurposeActivityReasonType(pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		final EntryRelationship rel = CDAFactory.eINSTANCE
				.createEntryRelationship();
		rel.setTypeCode(x_ActRelationshipEntryRelationship.RSON);

		rel.setAct(CCDFactory.eINSTANCE.createProblemAct());
		rel.setEncounter(CDAFactory.eINSTANCE.createEncounter());
		rel.setObservation(CCDFactory.eINSTANCE.createProblemObservation());
		rel.setProcedure(CDAFactory.eINSTANCE.createProcedure());
		rel.setSubstanceAdministration(CDAFactory.eINSTANCE
				.createSubstanceAdministration());
		rel.setSupply(CCDFactory.eINSTANCE.createSupplyActivity());
		rel.setObservation(CCDFactory.eINSTANCE.createProblemObservation());
		pa.getEntryRelationships().add(rel);

		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		rel.setAct(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		rel.setEncounter(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		rel.setObservation(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		rel.setProcedure(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		rel.setSubstanceAdministration(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);

		// This undefines the last one, which should make validation fail
		rel.setSupply(null);
		isValid = PurposeActivityOperations.validatePurposeActivityReasonType(
				pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

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
		return PurposeActivityOperations.validatePurposeActivityClassCode(
				(PurposeActivity) eObjectToValidate, diagnostician, map)
				&& PurposeActivityOperations
						.validatePurposeActivityMoodCode(
								(PurposeActivity) eObjectToValidate,
								diagnostician, map);
	}

} // PurposeActivityOperationsTest