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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.ccd.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings( { "nls", "serial" })
public class AuthorizationActivityOperationsTest extends
		StructuralAttributeValidationTest {

	protected static final String AUTHORIZATION_ACTIVITY_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.19";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, x_ActClassDocumentEntryAct.ACT);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.EVN);
		}
	};

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDCCDValidationTest(AUTHORIZATION_ACTIVITY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject eObjectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return AuthorizationActivityOperations
							.validateAuthorizationActivityTemplateId(
									(AuthorizationActivity) eObjectToTest,
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
					return AuthorizationActivityOperations
							.validateAuthorizationActivityId(
									(AuthorizationActivity) eObjectToTest,
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
		return CCDFactory.eINSTANCE.createAuthorizationActivity();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createAuthorizationActivity().init();
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
		return AuthorizationActivityOperations
				.validateAuthorizationActivityClassCode(
						(AuthorizationActivity) eObjectToValidate,
						diagnostician, map)
				&& AuthorizationActivityOperations
						.validateAuthorizationActivityMoodCode(
								(AuthorizationActivity) eObjectToValidate,
								diagnostician, map);
	}

} // AuthorizationActivityOperationsTest