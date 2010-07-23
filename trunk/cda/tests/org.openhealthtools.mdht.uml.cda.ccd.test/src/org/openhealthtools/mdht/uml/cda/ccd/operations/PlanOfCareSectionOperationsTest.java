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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PlanOfCareSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class PlanOfCareSectionOperationsTest extends CCDValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.10";

	protected static final String CODE = "18776-5";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PlanOfCareSectionOperations
				.validatePlanOfCareSectionTemplateId(
						(PlanOfCareSection) objectToTest,
						diagnostician, map);
			}

		},

		// Title
		// -------------------------------------------------------------
		new TitleCCDValidationTest() {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PlanOfCareSectionOperations
				.validatePlanOfCareSectionTitle(
						(PlanOfCareSection) objectToTest,
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
				return PlanOfCareSectionOperations
				.validatePlanOfCareSectionCode(
						(PlanOfCareSection) objectToTest,
						diagnostician, map);
			}
		},

		// Text
		// -------------------------------------------------------------
		new TextCCDValidationTest() {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PlanOfCareSectionOperations
				.validatePlanOfCareSectionText(
						(PlanOfCareSection) objectToTest,
						diagnostician, map);
			}

		},

		// Entry Act
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return PlanOfCareSectionOperations
				.validatePlanOfCareSectionPlanOfCareActivityAct(
						(PlanOfCareSection) objectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setAct(CCDFactory.eINSTANCE
						.createPlanOfCareActivityAct());
				retValue.add(entry);

				return retValue;
			}
		},

		// Entry Encounter
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return
				PlanOfCareSectionOperations
				.validatePlanOfCareSectionPlanOfCareActivityEncounter(
						(PlanOfCareSection) objectToTest,
						diagnostician, map)
						;
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setEncounter(CCDFactory.eINSTANCE.createPlanOfCareActivityEncounter());
				retValue.add(entry);
				return retValue;
			}
		},

		// Entry Observation
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return
				PlanOfCareSectionOperations
				.validatePlanOfCareSectionPlanOfCareActivityObservation(
						(PlanOfCareSection) objectToTest,
						diagnostician, map)
						;
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setObservation(CCDFactory.eINSTANCE.createPlanOfCareActivityObservation());
				retValue.add(entry);
				return retValue;
			}
		},

		// Entry SubstanceAdministration
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return
				PlanOfCareSectionOperations
				.validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(
						(PlanOfCareSection) objectToTest,
						diagnostician, map)
						;
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setSubstanceAdministration(CCDFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration());
				retValue.add(entry);
				return retValue;
			}
		},

		// Entry Supply
		// -------------------------------------------------------------
		new EntryCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return
				PlanOfCareSectionOperations
				.validatePlanOfCareSectionPlanOfCareActivitySupply(
						(PlanOfCareSection) objectToTest,
						diagnostician, map)
						;
			}

			@Override
			protected Object getValueToSet() {
				final EList<Entry> retValue = new BasicEList<Entry>();
				final Entry entry = CDAFactory.eINSTANCE.createEntry();
				entry.setSupply(CCDFactory.eINSTANCE.createPlanOfCareActivitySupply());
				retValue.add(entry);
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
		return CCDFactory.eINSTANCE.createPlanOfCareSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createPlanOfCareSection().init();
	}

} // PlanOfCareSectionOperationsTest