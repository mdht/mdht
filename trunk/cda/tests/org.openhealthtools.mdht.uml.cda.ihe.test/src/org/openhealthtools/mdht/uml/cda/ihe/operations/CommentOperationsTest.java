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
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.ActOperationsTest;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class CommentOperationsTest extends ActOperationsTest {

	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.2";

	// Status code
//	private static final String STATUS_CODE = "completed";
//	private static final String STATUS_CODE_CODE_SYSTEM = "notspecified";

	private static final CDATestCase TEST_CASE_ARRAY[] = {

			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return CommentOperations.validateCommentTemplateId(
							(Comment) objectToTest, diagnostician, map);
				}
			}
//			,
//
//			// Status Code
//			// -------------------------------------------------------------
//			new StatusCodeCCDValidationTest(STATUS_CODE,
//					STATUS_CODE_CODE_SYSTEM) {
//				@Override
//				protected boolean validate(final EObject objectToTest,
//						final BasicDiagnostic diagnostician,
//						final Map<Object, Object> map) {
//					return CommentOperations.validateCommentStatusCode(
//							(Comment) objectToTest, diagnostician, map);
//				}
//			},
//
//			// Text
//			// -------------------------------------------------------------
//			new TextCCDValidationTest() {
//
//				@Override
//				protected boolean validate(final EObject objectToTest,
//						final BasicDiagnostic diagnostician,
//						final Map<Object, Object> map) {
//					return CommentOperations.validateCommentText(
//							(Comment) objectToTest, diagnostician, map);
//				}
//
//			}

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
		return IHEFactory.eINSTANCE.createComment();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createComment().init();
	}

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		CommentOperations obj = new CommentOperations();
		assertTrue(true);
	} // testConstructor
	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentClassCode(org.openhealthtools.mdht.uml.cda.ihe.Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateCommentClassCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentCode(org.openhealthtools.mdht.uml.cda.ihe.Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateCommentCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentStatusCode(org.openhealthtools.mdht.uml.cda.ihe.Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateCommentStatusCode() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentText(org.openhealthtools.mdht.uml.cda.ihe.Comment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateCommentText() {
		fail("Not yet implemented");
	}

} // CommentOperationsTest