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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EncountersActivity;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class EncountersActivityOperationsTest extends CCDValidationTest {

	protected static final String ENCOUNTERS_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.21";

	protected static final String CODE = "completed";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.1.11.13955";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(ENCOUNTERS_ACTIVITY_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EncountersActivityOperations
				.validateEncountersActivityTemplateId(
						(EncountersActivity) eObjectToTest,
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
				return EncountersActivityOperations
				.validateEncountersActivityId(
						(EncountersActivity) eObjectToTest,
						diagnostician, map);
			}
		},

		// EffectiveTime
		// -------------------------------------------------------------
		new EffectiveTimeCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EncountersActivityOperations
				.validateEncountersActivityEffectiveTime(
						(EncountersActivity) eObjectToTest,
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
		return CCDFactory.eINSTANCE.createEncountersActivity();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createEncountersActivity().init();
	}

} // EncountersActivityOperationsTest