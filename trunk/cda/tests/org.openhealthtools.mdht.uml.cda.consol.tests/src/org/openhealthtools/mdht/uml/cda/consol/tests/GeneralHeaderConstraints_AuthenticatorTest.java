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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_AuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Authenticator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator#validateAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator#validateAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authenticator Signature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_Authenticator#validateAuthenticatorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authenticator Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_AuthenticatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints_Authenticator> validateAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints_Authenticator>(
			"validateAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_Authenticator target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_Authenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorTime(
					(GeneralHeaderConstraints_Authenticator) objectToTest, diagnostician, map);
			}

		};

		validateAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthenticatorSignatureCode() {
		OperationsTestCase<GeneralHeaderConstraints_Authenticator> validateAuthenticatorSignatureCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints_Authenticator>(
			"validateAuthenticatorSignatureCode",
			operationsForOCL.getOCLValue("VALIDATE_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_Authenticator target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_Authenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorSignatureCode(
					(GeneralHeaderConstraints_Authenticator) objectToTest, diagnostician, map);
			}

		};

		validateAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthenticatorAssignedEntity() {
		OperationsTestCase<GeneralHeaderConstraints_Authenticator> validateAuthenticatorAssignedEntityTestCase = new OperationsTestCase<GeneralHeaderConstraints_Authenticator>(
			"validateAuthenticatorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_AUTHENTICATOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_Authenticator target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_Authenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_AuthenticatorOperations.validateAuthenticatorAssignedEntity(
					(GeneralHeaderConstraints_Authenticator) objectToTest, diagnostician, map);
			}

		};

		validateAuthenticatorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_AuthenticatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_Authenticator> {
		public GeneralHeaderConstraints_Authenticator create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_Authenticator();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_AuthenticatorOperations {
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

} // GeneralHeaderConstraints_AuthenticatorOperations
