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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ihe.Comment;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.ActOperationsTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.datatypes.PN;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class CommentOperationsTest extends ActOperationsTest {
	//
	// protected static final String TEMPLATE_ID =
	// "1.3.6.1.4.1.19376.1.5.3.1.4.2";
	//
	// // Status code
	// // private static final String STATUS_CODE = "completed";
	// // private static final String STATUS_CODE_CODE_SYSTEM = "notspecified";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	//
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return CommentOperations.validateCommentTemplateId(
	// (Comment) objectToTest, diagnostician, map);
	// }
	// }
	// // ,
	// //
	// // // Status Code
	// // // -------------------------------------------------------------
	// // new StatusCodeCCDValidationTest(STATUS_CODE,
	// // STATUS_CODE_CODE_SYSTEM) {
	// // @Override
	// // protected boolean validate(final EObject objectToTest,
	// // final BasicDiagnostic diagnostician,
	// // final Map<Object, Object> map) {
	// // return CommentOperations.validateCommentStatusCode(
	// // (Comment) objectToTest, diagnostician, map);
	// // }
	// // },
	// //
	// // // Text
	// // // -------------------------------------------------------------
	// // new TextCCDValidationTest() {
	// //
	// // @Override
	// // protected boolean validate(final EObject objectToTest,
	// // final BasicDiagnostic diagnostician,
	// // final Map<Object, Object> map) {
	// // return CommentOperations.validateCommentText(
	// // (Comment) objectToTest, diagnostician, map);
	// // }
	// //
	// // }
	//
	// }; // TEST_CASE_ARRAY
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
	// return IHEFactory.eINSTANCE.createComment();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createComment().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @Override
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// CommentOperations obj = new CommentOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// /**
	// * Test method for
	// * {@link
	// org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentClassCode(org.openhealthtools.mdht.uml.cda.ihe.Comment,
	// org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	// * .
	// */
	// @Test
	// public void testValidateCommentClassCode() {
	// fail("Not yet implemented");
	// }
	//
	// /**
	// * Test method for
	// * {@link
	// org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentCode(org.openhealthtools.mdht.uml.cda.ihe.Comment,
	// org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	// * .
	// */
	// @Test
	// public void testValidateCommentCode() {
	// fail("Not yet implemented");
	// }
	//
	// /**
	// * Test method for
	// * {@link
	// org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentStatusCode(org.openhealthtools.mdht.uml.cda.ihe.Comment,
	// org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	// * .
	// */
	// @Test
	// public void testValidateCommentStatusCode() {
	// fail("Not yet implemented");
	// }
	//
	// /**
	// * Test method for
	// * {@link
	// org.openhealthtools.mdht.uml.cda.ihe.operations.CommentOperations#validateCommentText(org.openhealthtools.mdht.uml.cda.ihe.Comment,
	// org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	// * .
	// */
	// @Test
	// public void testValidateCommentText() {
	// fail("Not yet implemented");
	// }

	public static class OperationsForOCL extends CommentOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class ObjectFactory implements TestObjectFactory<Comment> {
		public Comment create() {
			return IHEFactory.eINSTANCE.createComment();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateCommentTemplateId() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateCommentTemplateId",
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

		testCase.doValidationTest();

	}

	@Test
	public void testValidateIHECommentHasTextReference() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentHasTextReference",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
				ED ed = DatatypesFactory.eINSTANCE.createED("Comment Text Here");
				target.setText(ed);

			}

			@Override
			protected void updateToPass(Comment target) {
				TEL tel = DatatypesFactory.eINSTANCE.createTEL("Reference Text Here");
				target.getText().setReference(tel);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CommentOperations.validateIHECommentHasTextReference((Comment) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateIHECommentEffectiveTimeWhenAuthorPresent() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentEffectiveTimeWhenAuthorPresent",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

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
				return CommentOperations.validateIHECommentEffectiveTimeWhenAuthorPresent((Comment) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateIHECommentHasAuthorId() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentHasAuthorId",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

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

		testCase.doValidationTest();
	}

	@Test
	public void testValidateIHECommentHasAuthorOrganization() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentHasAuthorOrganization",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

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
				return CommentOperations.validateIHECommentHasAuthorOrganization((Comment) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateIHECommentHasAuthorPerson() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentHasAuthorPerson",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				AssignedAuthor assignedAuthor = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(assignedAuthor);
				Person person = CDAFactory.eINSTANCE.createPerson();
				author.getAssignedAuthor().setAssignedPerson(person);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(Comment target) {
				for (Author author : target.getAuthors()) {
					PN name = DatatypesFactory.eINSTANCE.createPN();
					author.getAssignedAuthor().getAssignedPerson().getNames().add(name);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CommentOperations.validateIHECommentHasAuthorOrganization((Comment) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateIHECommentStatusCode() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentStatusCode",
				operationsForOCL.getOCLValue("VALIDATE_IHE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CommentOperations.validateIHECommentStatusCode((Comment) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateIHECommentText() {

		OperationsTestCase<Comment> testCase = new OperationsTestCase<Comment>("validateIHECommentText",
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

		testCase.doValidationTest();

	}

} // CommentOperationsTest