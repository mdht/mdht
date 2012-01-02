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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_LegalAuthenticatorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints Legal Authenticator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator#validateLegalAuthenticatorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_LegalAuthenticator#validateLegalAuthenticatorSignatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Legal Authenticator Signature Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_LegalAuthenticatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLegalAuthenticatorTime() {
		OperationsTestCase<GeneralHeaderConstraints_LegalAuthenticator> validateLegalAuthenticatorTimeTestCase = new OperationsTestCase<GeneralHeaderConstraints_LegalAuthenticator>(
			"validateLegalAuthenticatorTime",
			operationsForOCL.getOCLValue("VALIDATE_LEGAL_AUTHENTICATOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_LegalAuthenticator target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_LegalAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_LegalAuthenticatorOperations.validateLegalAuthenticatorTime(
					(GeneralHeaderConstraints_LegalAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateLegalAuthenticatorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLegalAuthenticatorSignatureCode() {
		OperationsTestCase<GeneralHeaderConstraints_LegalAuthenticator> validateLegalAuthenticatorSignatureCodeTestCase = new OperationsTestCase<GeneralHeaderConstraints_LegalAuthenticator>(
			"validateLegalAuthenticatorSignatureCode",
			operationsForOCL.getOCLValue("VALIDATE_LEGAL_AUTHENTICATOR_SIGNATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_LegalAuthenticator target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_LegalAuthenticator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_LegalAuthenticatorOperations.validateLegalAuthenticatorSignatureCode(
					(GeneralHeaderConstraints_LegalAuthenticator) objectToTest, diagnostician, map);
			}

		};

		validateLegalAuthenticatorSignatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_LegalAuthenticatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_LegalAuthenticator> {
		public GeneralHeaderConstraints_LegalAuthenticator create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_LegalAuthenticator();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_LegalAuthenticatorOperations {
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

} // GeneralHeaderConstraints_LegalAuthenticatorOperations
