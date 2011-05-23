/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.operations.LanguageCommunicationOperationsTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class LanguageSpokenOperationsTest extends LanguageCommunicationOperationsTest {

	// protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.83.11";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return CommentOperations.validateHITSPCommentTemplateId(
	// (Comment) objectToTest, diagnostician, map);
	// }
	// } }; // TEST_CASE_ARRAY
	//
	// @Override
	// protected List<CDATestCase> getTestCases() {
	// // Return a new List because the one returned by Arrays.asList is
	// // unmodifiable so a sub-class can't append their test cases.
	// final List<CDATestCase> retValue = super.getTestCases();
	// retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
	// return retValue;
	// }
	//
	// @Override
	// protected EObject getObjectToTest() {
	// return HITSPFactory.eINSTANCE.createLanguageSpoken();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return HITSPFactory.eINSTANCE.createLanguageSpoken().init();
	// }

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.hitsp.operations.LanguageSpokenOperations#validateLanguageSpokenTemplateId(org.openhealthtools.mdht.uml.cda.hitsp.LanguageSpoken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateLanguageSpokenTemplateId() {
		fail("Not yet implemented");
	}

} // LanguageSpokenOperationsTest
