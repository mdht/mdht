/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.operations.CommentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Comment</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Comment#validateCommentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Comment#validateCommentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Comment#validateCommentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.Comment#validateCommentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CommentTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCommentTemplateId() {
		OperationsTestCase<Comment> validateCommentTemplateIdTestCase = new OperationsTestCase<Comment>(
			"validateCommentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateCommentTemplateId((Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCommentClassCode() {
		OperationsTestCase<Comment> validateCommentClassCodeTestCase = new OperationsTestCase<Comment>(
			"validateCommentClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateCommentClassCode((Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCommentMoodCode() {
		OperationsTestCase<Comment> validateCommentMoodCodeTestCase = new OperationsTestCase<Comment>(
			"validateCommentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateCommentMoodCode((Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateCommentCode() {
		OperationsTestCase<Comment> validateCommentCodeTestCase = new OperationsTestCase<Comment>(
			"validateCommentCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateCommentCode((Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends CommentOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static class ObjectFactory implements TestObjectFactory<Comment> {
		public Comment create() {
			return CCDFactory.eINSTANCE.createComment();
		}
	}

	/**
	 * 
	 * @generated
	 */
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * 
	 * @generated
	 */
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends CommentOperations {
	}

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // CommentOperations
