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
import org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient;

import org.openhealthtools.mdht.uml.cda.consol.operations.InformationRecipient_IntendedRecipientOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Information Recipient Intended Recipient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient#validateIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient#validateIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Recieved Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InformationRecipient_IntendedRecipientTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIntendedRecipientInformationRecipient() {
		OperationsTestCase<InformationRecipient_IntendedRecipient> validateIntendedRecipientInformationRecipientTestCase = new OperationsTestCase<InformationRecipient_IntendedRecipient>(
			"validateIntendedRecipientInformationRecipient",
			operationsForOCL.getOCLValue("VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InformationRecipient_IntendedRecipient target) {

			}

			@Override
			protected void updateToPass(InformationRecipient_IntendedRecipient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InformationRecipient_IntendedRecipientOperations.validateIntendedRecipientInformationRecipient(
					(InformationRecipient_IntendedRecipient) objectToTest, diagnostician, map);
			}

		};

		validateIntendedRecipientInformationRecipientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIntendedRecipientRecievedOrganization() {
		OperationsTestCase<InformationRecipient_IntendedRecipient> validateIntendedRecipientRecievedOrganizationTestCase = new OperationsTestCase<InformationRecipient_IntendedRecipient>(
			"validateIntendedRecipientRecievedOrganization",
			operationsForOCL.getOCLValue("VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InformationRecipient_IntendedRecipient target) {

			}

			@Override
			protected void updateToPass(InformationRecipient_IntendedRecipient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InformationRecipient_IntendedRecipientOperations.validateIntendedRecipientRecievedOrganization(
					(InformationRecipient_IntendedRecipient) objectToTest, diagnostician, map);
			}

		};

		validateIntendedRecipientRecievedOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InformationRecipient_IntendedRecipientOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InformationRecipient_IntendedRecipient> {
		public InformationRecipient_IntendedRecipient create() {
			return ConsolFactory.eINSTANCE.createInformationRecipient_IntendedRecipient();
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
	private static class ConstructorTestClass extends InformationRecipient_IntendedRecipientOperations {
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

} // InformationRecipient_IntendedRecipientOperations
