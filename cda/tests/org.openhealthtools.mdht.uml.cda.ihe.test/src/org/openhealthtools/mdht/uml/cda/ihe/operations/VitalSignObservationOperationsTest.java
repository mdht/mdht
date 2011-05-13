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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

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
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignObservationOperationsTest extends ResultObservationOperationsTest {

	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.13.2";

	protected static final String CODE = "11535-2"; // Not in OCL
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final String TARGET_SITE_CODE = "whatever";

	private static final String TARGET_SITE_CODE_CODE_SYSTEM = "whatever";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignObservationOperations.validateVitalSignObservationTemplateId((VitalSignObservation) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignObservationOperations.validateResultObservationCode((VitalSignObservation) objectToTest, diagnostician, map);
				}
			},

			// value
			// -------------------------------------------------------------
			new ObservationValueCCDValidationTest(CODE) {

				@SuppressWarnings("synthetic-access")
				@Override
				public void doTest(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					try {
						validateExpectPass(objectToTest, diagnostician, map);
						doSet(objectToTest);
						validateExpectPass(objectToTest, diagnostician, map);
					} catch (final UnsupportedOperationException uoe) {
						fail(CDAValidationTest.createUnsupportedOperationFailureMessage(featureName, uoe));
					}
				}

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignObservationOperations.validateVitalSignObservationValue((VitalSignObservation) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<PQ> retValue = new BasicEList<PQ>();
					retValue.add(DatatypesFactory.eINSTANCE.createPQ());
					return retValue;
				}
			},

			// Information Source
			// -------------------------------------------------------------
			new InformationSourceCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return ResultObservationOperations.validateResultObservationInformationSource((ResultObservation) objectToTest, diagnostician, map);
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
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		VitalSignObservation vitalSignObservation = IHEFactory.eINSTANCE.createVitalSignObservation();
		section.addObservation(vitalSignObservation);
		return vitalSignObservation;
		// return IHEFactory.eINSTANCE.createVitalSignObservation();
	}

	/**
	 * JUnit test
	 */
	@Test
	public void testVitalSignsObservationTargetSiteCode() {
		final VitalSignObservation vso = (VitalSignObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE.createDefaultDiagnostic(vso);
		try {
			boolean isValid = VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(vso, diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

			final CD targetSiteCode = DatatypesFactory.eINSTANCE.createCE(TARGET_SITE_CODE, TARGET_SITE_CODE_CODE_SYSTEM);
			vso.getTargetSiteCodes().add(targetSiteCode);

			isValid = VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(vso, diagnostician, map);
			assertTrue(createAssertionFailureMessage(diagnostician), isValid);

		} catch (final UnsupportedOperationException uoe) {
			fail(createUnsupportedOperationFailureMessage("TargetSiteCode", uoe));
		}
	}

} // VitalSignObservationOperationsTest