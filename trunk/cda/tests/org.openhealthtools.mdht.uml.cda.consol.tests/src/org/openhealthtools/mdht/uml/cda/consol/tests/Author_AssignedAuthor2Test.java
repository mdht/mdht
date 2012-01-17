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

import org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.Author_AssignedAuthor2Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Author Assigned Author2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2#validateAssignedAuthor2Addr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Author_AssignedAuthor2#validateAssignedAuthor2Telecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Author2 Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Author_AssignedAuthor2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthor2Addr() {
		OperationsTestCase<Author_AssignedAuthor2> validateAssignedAuthor2AddrTestCase = new OperationsTestCase<Author_AssignedAuthor2>(
			"validateAssignedAuthor2Addr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR2_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor2 target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthor2Operations.validateAssignedAuthor2Addr(
					(Author_AssignedAuthor2) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthor2AddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthor2Telecom() {
		OperationsTestCase<Author_AssignedAuthor2> validateAssignedAuthor2TelecomTestCase = new OperationsTestCase<Author_AssignedAuthor2>(
			"validateAssignedAuthor2Telecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHOR2_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Author_AssignedAuthor2 target) {

			}

			@Override
			protected void updateToPass(Author_AssignedAuthor2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Author_AssignedAuthor2Operations.validateAssignedAuthor2Telecom(
					(Author_AssignedAuthor2) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthor2TelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Author_AssignedAuthor2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<Author_AssignedAuthor2> {
		public Author_AssignedAuthor2 create() {
			return ConsolFactory.eINSTANCE.createAuthor_AssignedAuthor2();
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
	private static class ConstructorTestClass extends Author_AssignedAuthor2Operations {
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

} // Author_AssignedAuthor2Operations
