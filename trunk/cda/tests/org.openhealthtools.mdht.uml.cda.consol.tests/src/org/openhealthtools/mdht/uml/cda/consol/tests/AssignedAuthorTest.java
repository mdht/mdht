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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedAuthorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Author</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor#validateConsolAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor#validateConsolAssignedAuthorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Author Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor#validateConsolAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor#validateConsolAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Assigned Author Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedAuthorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAssignedAuthorAddr() {
		OperationsTestCase<AssignedAuthor> validateConsolAssignedAuthorAddrTestCase = new OperationsTestCase<AssignedAuthor>(
			"validateConsolAssignedAuthorAddr",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthorOperations.validateConsolAssignedAuthorAddr(
					(AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateConsolAssignedAuthorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAssignedAuthorCode() {
		OperationsTestCase<AssignedAuthor> validateConsolAssignedAuthorCodeTestCase = new OperationsTestCase<AssignedAuthor>(
			"validateConsolAssignedAuthorCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ASSIGNED_AUTHOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthorOperations.validateConsolAssignedAuthorCode(
					(AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateConsolAssignedAuthorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAssignedAuthorId() {
		OperationsTestCase<AssignedAuthor> validateConsolAssignedAuthorIdTestCase = new OperationsTestCase<AssignedAuthor>(
			"validateConsolAssignedAuthorId",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthorOperations.validateConsolAssignedAuthorId(
					(AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateConsolAssignedAuthorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAssignedAuthorTelecom() {
		OperationsTestCase<AssignedAuthor> validateConsolAssignedAuthorTelecomTestCase = new OperationsTestCase<AssignedAuthor>(
			"validateConsolAssignedAuthorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthorOperations.validateConsolAssignedAuthorTelecom(
					(AssignedAuthor) objectToTest, diagnostician, map);
			}

		};

		validateConsolAssignedAuthorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedAuthorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedAuthor> {
		public AssignedAuthor create() {
			return ConsolFactory.eINSTANCE.createAssignedAuthor();
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
	private static class ConstructorTestClass extends AssignedAuthorOperations {
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

} // AssignedAuthorOperations
