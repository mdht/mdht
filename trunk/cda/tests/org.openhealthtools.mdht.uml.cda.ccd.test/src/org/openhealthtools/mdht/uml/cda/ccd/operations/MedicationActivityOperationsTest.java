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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings( { "nls", "serial" })
public class MedicationActivityOperationsTest extends
		StructuralAttributeValidationTest {

	protected static final String MEDICATION_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.24";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentSubstanceMood.EVN);
			// put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentSubstanceMood.INT); //
			// also allowed
		}
	};

	protected static final String STATUS_CODE = "completed";
	// This status code is likely not correct. The OCL doesn't specify one.
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDCCDValidationTest(MEDICATION_ACTIVITY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return MedicationActivityOperations
							.validateMedicationActivityTemplateId(
									(MedicationActivity) objectToTest,
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
					return MedicationActivityOperations
							.validateMedicationActivityId(
									(MedicationActivity) objectToTest,
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
					return MedicationActivityOperations
							.validateMedicationActivityStatusCode(
									(MedicationActivity) objectToTest,
									diagnostician, map);
				}
			},

			// Entry Relationship
			// -------------------------------------------------------------
			new EntryRelationshipCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return MedicationActivityOperations
							.validateMedicationActivityPatientInstruction(
									(MedicationActivity) objectToTest,
									diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

					final EntryRelationship er = CDAFactory.eINSTANCE
							.createEntryRelationship();
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
					er.setAct(CCDFactory.eINSTANCE.createPatientInstruction());
					retValue.add(er);

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
		return CCDFactory.eINSTANCE.createMedicationActivity();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createMedicationActivity().init();
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
		return MedicationActivityOperations.validateMedicationActivityMoodCode(
				(MedicationActivity) eObjectToValidate, diagnostician, map);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperations#validateMedicationActivityMedicationSeriesNumberObservation(org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateMedicationActivityMedicationSeriesNumberObservation() {
		final MedicationActivity ma = (MedicationActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ma);
		boolean isValid = MedicationActivityOperations
				.validateMedicationActivityMedicationSeriesNumberObservation(
						ma, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		ma.addObservation(CCDFactory.eINSTANCE
				.createMedicationSeriesNumberObservation());

		isValid = MedicationActivityOperations
				.validateMedicationActivityMedicationSeriesNumberObservation(
						ma, diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperations#validateMedicationActivityMedicationStatusObservation(org.openhealthtools.mdht.uml.cda.ccd.MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateMedicationActivityMedicationStatusObservation() {
		final MedicationActivity ma = (MedicationActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(ma);

		boolean isValid = MedicationActivityOperations
				.validateMedicationActivityMedicationStatusObservation(ma,
						diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		ma.addObservation(CCDFactory.eINSTANCE
				.createMedicationStatusObservation());

		isValid = MedicationActivityOperations
				.validateMedicationActivityMedicationStatusObservation(ma,
						diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

} // MedicationActivityOperationsTest