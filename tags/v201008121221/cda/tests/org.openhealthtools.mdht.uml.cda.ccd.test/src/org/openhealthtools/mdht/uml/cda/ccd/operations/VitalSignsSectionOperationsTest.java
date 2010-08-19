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
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignsSectionOperationsTest extends CCDValidationTest {

	protected static final String VITAL_SIGNS_SECTION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.16";

	protected static final String CODE = "8716-3";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(VITAL_SIGNS_SECTION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return VitalSignsSectionOperations
							.validateVitalSignsSectionTemplateId(
									(VitalSignsSection) objectToTest,
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
					return VitalSignsSectionOperations
							.validateVitalSignsSectionTitle(
									(VitalSignsSection) objectToTest,
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
					return VitalSignsSectionOperations
							.validateVitalSignsSectionText(
									(VitalSignsSection) objectToTest,
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
					return VitalSignsSectionOperations
							.validateVitalSignsSectionCode(
									(VitalSignsSection) objectToTest,
									diagnostician, map);
				}
			},

			// Entry
			// -------------------------------------------------------------
			new EntryCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return VitalSignsSectionOperations
							.validateVitalSignsSectionVitalSignsOrganizer(
									(VitalSignsSection) objectToTest,
									diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<Entry> retValue = new BasicEList<Entry>();
					final Entry entry = CDAFactory.eINSTANCE.createEntry();
					entry.setOrganizer(CCDFactory.eINSTANCE
							.createVitalSignsOrganizer());
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
		return CCDFactory.eINSTANCE.createVitalSignsSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createVitalSignsSection().init();
	}

} // VitalSignsSectionOperationsTest