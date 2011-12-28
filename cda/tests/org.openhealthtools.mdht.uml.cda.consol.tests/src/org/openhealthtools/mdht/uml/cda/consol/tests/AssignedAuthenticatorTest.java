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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedAuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Authenticator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthenticator#validateAssignedAuthenticatorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Authenticator Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedAuthenticatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthenticatorAddr() {
		OperationsTestCase<AssignedAuthenticator> validateAssignedAuthenticatorAddrTestCase = new OperationsTestCase<AssignedAuthenticator>(
			"validateAssignedAuthenticatorAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHENTICATOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthenticator target) {

			}

			@Override
			protected void updateToPass(AssignedAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthenticatorOperations.validateAssignedAuthenticatorAddr(
					(AssignedAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthenticatorAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthenticatorCode() {
		OperationsTestCase<AssignedAuthenticator> validateAssignedAuthenticatorCodeTestCase = new OperationsTestCase<AssignedAuthenticator>(
			"validateAssignedAuthenticatorCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHENTICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthenticator target) {

			}

			@Override
			protected void updateToPass(AssignedAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthenticatorOperations.validateAssignedAuthenticatorCode(
					(AssignedAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthenticatorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthenticatorId() {
		OperationsTestCase<AssignedAuthenticator> validateAssignedAuthenticatorIdTestCase = new OperationsTestCase<AssignedAuthenticator>(
			"validateAssignedAuthenticatorId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHENTICATOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthenticator target) {

			}

			@Override
			protected void updateToPass(AssignedAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthenticatorOperations.validateAssignedAuthenticatorId(
					(AssignedAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthenticatorIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedAuthenticatorTelecom() {
		OperationsTestCase<AssignedAuthenticator> validateAssignedAuthenticatorTelecomTestCase = new OperationsTestCase<AssignedAuthenticator>(
			"validateAssignedAuthenticatorTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_AUTHENTICATOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthenticator target) {

			}

			@Override
			protected void updateToPass(AssignedAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthenticatorOperations.validateAssignedAuthenticatorTelecom(
					(AssignedAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateAssignedAuthenticatorTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedAuthenticatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedAuthenticator> {
		public AssignedAuthenticator create() {
			return ConsolFactory.eINSTANCE.createAssignedAuthenticator();
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
	private static class ConstructorTestClass extends AssignedAuthenticatorOperations {
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

} // AssignedAuthenticatorOperations
