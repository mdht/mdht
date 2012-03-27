/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CommentActivity#validateCommentActivityAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Activity Author Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CommentActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityTemplateId() {
		OperationsTestCase<CommentActivity> validateCommentActivityTemplateIdTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityTemplateId(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityClassCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityClassCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityClassCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityMoodCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityMoodCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityMoodCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityCode() {
		OperationsTestCase<CommentActivity> validateCommentActivityCodeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityCode(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentActivityText() {
		OperationsTestCase<CommentActivity> validateCommentActivityTextTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityText",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityText(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthor() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(CommentActivity target) {

				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthor(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorAddr() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorAddrTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorAddr(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthorId() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorIdTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				aa.getIds().add(DatatypesFactory.eINSTANCE.createII());
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthorId(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorTime() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorTimeTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorTime",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				target.getAuthors().add(author);
			}

			@Override
			protected void updateToPass(CommentActivity target) {

				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorTime(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentActivityAuthorAssignedAuthor() {
		OperationsTestCase<CommentActivity> validateCommentActivityAuthorAssignedAuthorTestCase = new OperationsTestCase<CommentActivity>(
			"validateCommentActivityAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_ACTIVITY_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CommentActivity target) {
				target.init();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				target.getAuthors().add(author);

			}

			@Override
			protected void updateToPass(CommentActivity target) {
				target.getAuthors().clear();
				Author author = CDAFactory.eINSTANCE.createAuthor();
				author.setTime(DatatypesFactory.eINSTANCE.createTS());
				AssignedAuthor aa = CDAFactory.eINSTANCE.createAssignedAuthor();
				author.setAssignedAuthor(aa);
				target.getAuthors().add(author);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentActivityOperations.validateCommentActivityAuthorAssignedAuthor(
					(CommentActivity) objectToTest, diagnostician, map);
			}

		};

		validateCommentActivityAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CommentActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CommentActivity> {
		public CommentActivity create() {
			return ConsolFactory.eINSTANCE.createCommentActivity();
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
	private static class ConstructorTestClass extends CommentActivityOperations {
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

} // CommentActivityOperations
