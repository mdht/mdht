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
import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.CommentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Comment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentEffectiveTimeWhenAuthorPresent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Effective Time When Author Present</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentHasAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Has Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentHasAuthorOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Has Author Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Comment#validateCommentAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Comment Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CommentTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCommentHasTextReference() {
		OperationsTestCase<Comment> validateCommentHasTextReferenceTestCase = new OperationsTestCase<Comment>(
			"validateCommentHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Comment target) {
				target.init();
			}

			@Override
			protected void updateToPass(Comment target) {
				target.setText(DatatypesFactory.eINSTANCE.createED());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CommentOperations.validateCommentHasTextReference((Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentEffectiveTimeWhenAuthorPresent() {
			OperationsTestCase<Comment> validateCommentEffectiveTimeWhenAuthorPresentTestCase = new OperationsTestCase<Comment>(
			"validateCommentEffectiveTimeWhenAuthorPresent",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_EFFECTIVE_TIME_WHEN_AUTHOR_PRESENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentEffectiveTimeWhenAuthorPresent(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentEffectiveTimeWhenAuthorPresentTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentHasAuthorId() {
			OperationsTestCase<Comment> validateCommentHasAuthorIdTestCase = new OperationsTestCase<Comment>(
			"validateCommentHasAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_HAS_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentHasAuthorId(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentHasAuthorIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentHasAuthorOrganization() {
			OperationsTestCase<Comment> validateCommentHasAuthorOrganizationTestCase = new OperationsTestCase<Comment>(
			"validateCommentHasAuthorOrganization",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_HAS_AUTHOR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentHasAuthorOrganization(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentHasAuthorOrganizationTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentTemplateId() {
			OperationsTestCase<Comment> validateCommentTemplateIdTestCase = new OperationsTestCase<Comment>(
			"validateCommentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentTemplateId(
					(Comment) objectToTest, diagnostician, map);
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
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentClassCode(
					(Comment) objectToTest, diagnostician, map);
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
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentMoodCode(
					(Comment) objectToTest, diagnostician, map);
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
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentCode(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentText() {
			OperationsTestCase<Comment> validateCommentTextTestCase = new OperationsTestCase<Comment>(
			"validateCommentText",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
		ED text = DatatypesFactory.eINSTANCE.createED();
		target.setText(text );	
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentText(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentStatusCode() {
			OperationsTestCase<Comment> validateCommentStatusCodeTestCase = new OperationsTestCase<Comment>(
			"validateCommentStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

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
			
			
			
				return CommentOperations.validateCommentStatusCode(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentStatusCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCommentAuthor() {
			OperationsTestCase<Comment> validateCommentAuthorTestCase = new OperationsTestCase<Comment>(
			"validateCommentAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COMMENT_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Comment target) {

			}

			@Override
			protected void updateToPass(Comment target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return CommentOperations.validateCommentAuthor(
					(Comment) objectToTest, diagnostician, map);
			}

		};

		validateCommentAuthorTestCase.doValidationTest();
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
			return ConsolFactory.eINSTANCE.createComment();
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
