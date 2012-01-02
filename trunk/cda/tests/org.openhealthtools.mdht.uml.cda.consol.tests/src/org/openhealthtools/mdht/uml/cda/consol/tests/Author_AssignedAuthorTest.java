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

import org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.Author_AssignedAuthorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor#validateAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor#validateAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor#validateAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor#validateAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Author_AssignedAuthorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthorAddr() {
		OperationsTestCase<Author_AssignedAuthor> validateAssignedAuthorAddrTestCase = new OperationsTestCase<Author_AssignedAuthor>(
			"validateAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthorOperations.validateAssignedAuthorAddr(
					(Author_AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthorCode() {
		OperationsTestCase<Author_AssignedAuthor> validateAssignedAuthorCodeTestCase = new OperationsTestCase<Author_AssignedAuthor>(
			"validateAssignedAuthorCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthorOperations.validateAssignedAuthorCode(
					(Author_AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthorId() {
		OperationsTestCase<Author_AssignedAuthor> validateAssignedAuthorIdTestCase = new OperationsTestCase<Author_AssignedAuthor>(
			"validateAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthorOperations.validateAssignedAuthorId(
					(Author_AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthorTelecom() {
		OperationsTestCase<Author_AssignedAuthor> validateAssignedAuthorTelecomTestCase = new OperationsTestCase<Author_AssignedAuthor>(
			"validateAssignedAuthorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthorOperations.validateAssignedAuthorTelecom(
					(Author_AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Author_AssignedAuthorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Author_AssignedAuthor> {
		public Author_AssignedAuthor create() {
			return ConsolFactory.eINSTANCE.createAuthor_AssignedAuthor();
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
	private static class ConstructorTestClass extends Author_AssignedAuthorOperations {
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

} // Author_AssignedAuthorOperations
