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

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsOrganizer;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignsOrganizerOperationsTest extends org.openhealthtools.mdht.uml.cda.ccd.operations.VitalSignsOrganizerOperationsTest {

	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.13.1";

	// Status code
	private static final String STATUS_CODE = "completed";
	private static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "46680005"; // Not in OCL
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.96";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerTemplateId((VitalSignsOrganizer) objectToTest, diagnostician, map);
				}

			},

			// Code
			// -------------------------------------------------------------
			new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignsOrganizerOperations.validateResultOrganizerCode((VitalSignsOrganizer) objectToTest, diagnostician, map);
				}
			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignsOrganizerOperations.validateResultOrganizerStatusCode((VitalSignsOrganizer) objectToTest, diagnostician, map);
				}
			},

			// EffectiveTime
			// -------------------------------------------------------------
			new EffectiveTimeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerEffectiveTime((VitalSignsOrganizer) objectToTest, diagnostician, map);
				}
			},

			// component
			// -------------------------------------------------------------
			new CCDValidationTestCase("component") {

				@Override
				protected Object getValueToSet() {
					final EList<Component4> retValue = new BasicEList<Component4>();

					final Component4 component = CDAFactory.eINSTANCE.createComponent4();

					final VitalSignObservation vsOb = IHEFactory.eINSTANCE.createVitalSignObservation();
					// The OCL says this....
					// component.setTypeCode(org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship.COMP);
					// ...but this is what compiles.
					component.setTypeCode(org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipHasComponent.COMP);

					component.setObservation(vsOb);

					final VitalSignsOrganizer vso = IHEFactory.eINSTANCE.createVitalSignsOrganizer();
					vso.getComponents().add(component);

					retValue.add(component);
					return retValue;
				}

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return VitalSignsOrganizerOperations.validateIHEVitalSignsOrganizerVitalSignObservation((VitalSignsOrganizer) objectToTest, diagnostician, map);
				}
			},

			// Information Source
			// -------------------------------------------------------------
			new InformationSourceCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
					return org.openhealthtools.mdht.uml.cda.ccd.operations.VitalSignsOrganizerOperations.validateVitalSignsOrganizerInformationSource(
							(org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer) objectToTest, diagnostician, map);
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
		VitalSignsOrganizer vitalSignsOrganizer = IHEFactory.eINSTANCE.createVitalSignsOrganizer();
		section.addOrganizer(vitalSignsOrganizer);
		return vitalSignsOrganizer;
		// return IHEFactory.eINSTANCE.createVitalSignsOrganizer();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createVitalSignsOrganizer().init();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		VitalSignObservationOperations obj = new VitalSignObservationOperations();
		assertTrue(true);
	} // testConstructor

} // VitalSignsOrganizerOperationsTest