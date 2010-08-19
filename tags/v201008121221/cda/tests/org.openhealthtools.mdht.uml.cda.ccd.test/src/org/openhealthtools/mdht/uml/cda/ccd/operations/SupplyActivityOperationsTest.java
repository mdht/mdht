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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SupplyActivityOperationsTest extends CCDValidationTest {

	protected static final String SUPPLY_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.34";

	protected static final String STATUS_CODE = "completed";
	// This CODE_SYSTEM is likely not correct. The OCL doesn't specify one.
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(SUPPLY_ACTIVITY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return SupplyActivityOperations
							.validateSupplyActivityTemplateId(
									(SupplyActivity) objectToTest,
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
					return SupplyActivityOperations.validateSupplyActivityId(
							(SupplyActivity) objectToTest, diagnostician, map);
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
					return SupplyActivityOperations
							.validateSupplyActivityStatusCode(
									(SupplyActivity) objectToTest,
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
					return SupplyActivityOperations
							.validateSupplyActivityFulfillmentInstruction(
									(SupplyActivity) objectToTest,
									diagnostician, map);

				}

				@Override
				protected Object getValueToSet() {
					final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();
					final EntryRelationship er = CDAFactory.eINSTANCE
							.createEntryRelationship();
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
					er.setAct(CCDFactory.eINSTANCE
							.createFulfillmentInstruction());
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
		return CCDFactory.eINSTANCE.createSupplyActivity();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createSupplyActivity().init();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.SupplyActivityOperations#validateSupplyActivityMedicationStatusObservation(org.openhealthtools.mdht.uml.cda.ccd.SupplyActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateSupplyActivityMedicationStatusObservation() {
		final SupplyActivity sa = (SupplyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(sa);
		boolean isValid = SupplyActivityOperations
				.validateSupplyActivityMedicationStatusObservation(sa,
						diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		final EntryRelationship rel = CDAFactory.eINSTANCE
				.createEntryRelationship();
		rel.setObservation(CCDFactory.eINSTANCE
				.createMedicationStatusObservation());
		sa.getEntryRelationships().add(rel);

		isValid = SupplyActivityOperations
				.validateSupplyActivityMedicationStatusObservation(sa,
						diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testSupplyActivityEffectiveTime() {
		// This is not fully implemented.
		final SupplyActivity sa = (SupplyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(sa);

		boolean isValid = SupplyActivityOperations
				.validateSupplyActivityEffectiveTime(sa, diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testSupplyActivityFullfillmentInstruction() {
		// This is not fully implemented.
		final SupplyActivity sa = (SupplyActivity) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
				.createDefaultDiagnostic(sa);

		boolean isValid = SupplyActivityOperations
				.validateSupplyActivityFulfillmentInstruction(sa,
						diagnostician, map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);
	}

} // SupplyActivityOperationsTest