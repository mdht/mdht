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
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class MedicationSeriesNumberObservationOperationsTest extends
		CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.46";

	protected static final String STATUS_CODE = "completed";
	// This CODE_SYSTEM is likely incorrect. The OCL doesn't specify one.
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "30973-2";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	// Incorrect value, not specified in OCL
	private static final String OBSERVATION_VALUE_CODE_SYSTEM = "2.16.840.1.113883.1.11.20.3";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDCCDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return MedicationSeriesNumberObservationOperations
							.validateMedicationSeriesNumberObservationTemplateId(
									(MedicationSeriesNumberObservation) objectToTest,
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
					return MedicationSeriesNumberObservationOperations
							.validateMedicationSeriesNumberObservationStatusCode(
									(MedicationSeriesNumberObservation) objectToTest,
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
					return MedicationSeriesNumberObservationOperations
							.validateMedicationSeriesNumberObservationCode(
									(MedicationSeriesNumberObservation) objectToTest,
									diagnostician, map);
				}
			},

			// Value
			// -------------------------------------------------------------
			new ObservationValueCCDValidationTest(OBSERVATION_VALUE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return MedicationSeriesNumberObservationOperations
							.validateMedicationSeriesNumberObservationValue(
									(MedicationSeriesNumberObservation) objectToTest,
									diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<INT> retValue = new BasicEList<INT>();
					retValue.add(DatatypesFactory.eINSTANCE.createINT());
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
		return CCDFactory.eINSTANCE.createMedicationSeriesNumberObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createMedicationSeriesNumberObservation()
				.init();
	}

} // MedicationSeriesNumberObservationOperationsTest