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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentEffectiveTimeWhenAuthorPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Effective Time When Author Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentHasAuthorOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Has Author Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateIHECommentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Comment Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Comment#validateCommentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}</li>
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
	public void testValidateIHECommentHasTextReference() {
		OperationsTestCase<Comment> validateIHECommentHasTextReferenceTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentHasTextReference((Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHECommentEffectiveTimeWhenAuthorPresent() {
		OperationsTestCase<Comment> validateIHECommentEffectiveTimeWhenAuthorPresentTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentEffectiveTimeWhenAuthorPresent",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(Comment target) {
				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS("time");
				target.setEffectiveTime(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentEffectiveTimeWhenAuthorPresent(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentEffectiveTimeWhenAuthorPresentTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHECommentHasAuthorId() {
		OperationsTestCase<Comment> validateIHECommentHasAuthorIdTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentHasAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(assignedAuthor);
				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(Comment target) {
				for (Author author : target.getAuthors()) {
					II ii = DatatypesFactory.eINSTANCE.createII("IDHERE");
					author.getAssignedAuthor().getIds().add(ii);
					AD ad = DatatypesFactory.eINSTANCE.createAD();
					author.getAssignedAuthor().getAddrs().add(ad);
					TEL tel = DatatypesFactory.eINSTANCE.createTEL("telephonehere");
					author.getAssignedAuthor().getTelecoms().add(tel);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentHasAuthorId((Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentHasAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHECommentHasAuthorOrganization() {
		OperationsTestCase<Comment> validateIHECommentHasAuthorOrganizationTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentHasAuthorOrganization",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(assignedAuthor);
				Organization organization = CDAFactory.eINSTANCE.createOrganization();
				author.getAssignedAuthor().setRepresentedOrganization(organization);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(Comment target) {
				for (Author author : target.getAuthors()) {
					ON name = DatatypesFactory.eINSTANCE.createON();
					name.addText("NAMEOFORANIZATION");
					author.getAssignedAuthor().getRepresentedOrganization().getNames().add(name);

				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentHasAuthorOrganization(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentHasAuthorOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHECommentStatusCode() {
		OperationsTestCase<Comment> validateIHECommentStatusCodeTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentStatusCode((Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHECommentText() {
		OperationsTestCase<Comment> validateIHECommentTextTestCase = new OperationsTestCase<Comment>(
			"validateIHECommentText",
			operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
			}

			@Override
			protected void updateToPass(Comment target) {
				ED text = DatatypesFactory.eINSTANCE.createED("Comment Text");
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateIHECommentText((Comment) objectToTest, diagnostician, map);
			}

		};

		validateIHECommentTextTestCase.doValidationTest();
	}

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
			return IHEFactory.eINSTANCE.createComment();
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
	};

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
