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
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ProceduresSectionOperationsTest extends CCDValidationTest {

	protected static final String PROCEDURES_SECTION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.12";

	protected static final String CODE = "47519-4";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(PROCEDURES_SECTION_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProceduresSectionOperations
				.validateProceduresSectionTemplateId(
						(ProceduresSection) objectToTest,
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
				return ProceduresSectionOperations
				.validateProceduresSectionTitle(
						(ProceduresSection) objectToTest,
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
				return ProceduresSectionOperations
				.validateProceduresSectionCode(
						(ProceduresSection) objectToTest,
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
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createProceduresSection();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createProceduresSection().init();
	}

} // ProceduresSectionOperationsTest