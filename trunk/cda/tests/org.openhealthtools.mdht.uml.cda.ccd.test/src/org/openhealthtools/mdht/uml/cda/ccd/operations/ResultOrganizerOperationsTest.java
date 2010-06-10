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

import java.util.ArrayList;
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
import org.openhealthtools.mdht.uml.cda.Component4;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.hl7.vocab.ActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings( { "nls", "serial" })
public class ResultOrganizerOperationsTest extends
StructuralAttributeValidationTest {

	protected static final String RESULT_ORGANIZER_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.32";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(MOOD_CODE_ATTRIBUTE_NAME, ActMood.EVN);
		}
	};

	private static final String CODE = "whatever";

	private static final String CODE_CODE_SYSTEM = "whatever";

	private static final String STATUS_CODE = "whatever";

	private static final String STATUS_CODE_CODE_SYSTEM = "whatever";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(RESULT_ORGANIZER_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultOrganizerOperations
				.validateResultOrganizerTemplateId(
						(ResultOrganizer) eObjectToTest,
						diagnostician, map);
			}

		},

		// ID
		// -------------------------------------------------------------
		new IDCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultOrganizerOperations
				.validateResultOrganizerId(
						(ResultOrganizer) eObjectToTest,
						diagnostician, map);
			}
		},

		// StatusCode
		// -------------------------------------------------------------
		new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultOrganizerOperations
				.validateResultOrganizerStatusCode(
						(ResultOrganizer) eObjectToTest,
						diagnostician, map);
			}
		},

		// Code
		// -------------------------------------------------------------
		new CodeCCDValidationTest(CODE, CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultOrganizerOperations
				.validateResultOrganizerCode(
						(ResultOrganizer) eObjectToTest,
						diagnostician, map);
			}
		},


		// Information Source
		// -------------------------------------------------------------
		new InformationSourceCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ResultOrganizerOperations
				.validateResultOrganizerInformationSource(
						(ResultOrganizer) eObjectToTest,
						diagnostician, map);
			}
		}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<CDATestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	@Override
	protected EObject getEObjectToValidate() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		ResultOrganizer resultOrganizer = CCDFactory.eINSTANCE.createResultOrganizer();
		section.addOrganizer(resultOrganizer);
		return resultOrganizer;
//		return CCDFactory.eINSTANCE.createResultOrganizer();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createResultOrganizer().init();
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
		return ResultOrganizerOperations.validateResultOrganizerMoodCode(
				(ResultOrganizer) eObjectToValidate, diagnostician, map);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ResultOrganizerOperations#validateResultOrganizerResultObservation(org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateResultOrganizerResultObservation() {
		final ResultOrganizer ro = (ResultOrganizer) getEObjectToValidate();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);
		boolean isValid = ResultOrganizerOperations
		.validateResultOrganizerResultObservation(ro, diagnostician,
				map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

		final Component4 component = CDAFactory.eINSTANCE.createComponent4();
		component
		.setObservation(CCDFactory.eINSTANCE.createResultObservation());
		ro.getComponents().add(component);

		isValid = ResultOrganizerOperations
		.validateResultOrganizerResultObservation(ro, diagnostician,
				map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);
	}

	/**
	 * 
	 */
	@Test
	public void testResultsOrganizerComponentElement() {
		final ResultOrganizer ro = (ResultOrganizer) getEObjectToValidate();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(ro);

		boolean isValid = ResultOrganizerOperations
		.validateResultOrganizerResultObservation(ro, diagnostician,
				map);
		assertTrue(createAssertionFailureMessage(diagnostician), !isValid);

		ResultObservation resultObservation = CCDFactory.eINSTANCE.createResultObservation().init();
		ro.addObservation(resultObservation);
//		ro.getComponents().add(CDAFactory.eINSTANCE.createComponent4());

		isValid = ResultOrganizerOperations
		.validateResultOrganizerResultObservation(ro, diagnostician,
				map);
		assertTrue(createAssertionFailureMessage(diagnostician), isValid);
	}

} // ResultOrganizerOperationsTest