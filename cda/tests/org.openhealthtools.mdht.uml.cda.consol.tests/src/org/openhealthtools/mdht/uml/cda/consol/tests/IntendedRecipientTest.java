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
import org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient;

import org.openhealthtools.mdht.uml.cda.consol.operations.IntendedRecipientOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intended Recipient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient#validateConsolIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient#validateConsolIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Intended Recipient Recieved Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IntendedRecipientTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolIntendedRecipientInformationRecipient() {
		OperationsTestCase<IntendedRecipient> validateConsolIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<IntendedRecipient>(
			"validateConsolIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IntendedRecipient target) {

			}

			@Override
			protected void updateToPass(IntendedRecipient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntendedRecipientOperations.validateConsolIntendedRecipientInformationRecipient(
					(IntendedRecipient) objectToTest, diagnostician, map);
			}

		};

		validateConsolIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolIntendedRecipientRecievedOrganization() {
		OperationsTestCase<IntendedRecipient> validateConsolIntendedRecipientRecievedOrganizationTestCase = new OperationsTestCase<IntendedRecipient>(
			"validateConsolIntendedRecipientRecievedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(IntendedRecipient target) {

			}

			@Override
			protected void updateToPass(IntendedRecipient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntendedRecipientOperations.validateConsolIntendedRecipientRecievedOrganization(
					(IntendedRecipient) objectToTest, diagnostician, map);
			}

		};

		validateConsolIntendedRecipientRecievedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IntendedRecipientOperations {
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
	private static class ObjectFactory implements TestObjectFactory<IntendedRecipient> {
		public IntendedRecipient create() {
			return ConsolFactory.eINSTANCE.createIntendedRecipient();
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
	private static class ConstructorTestClass extends IntendedRecipientOperations {
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

} // IntendedRecipientOperations
