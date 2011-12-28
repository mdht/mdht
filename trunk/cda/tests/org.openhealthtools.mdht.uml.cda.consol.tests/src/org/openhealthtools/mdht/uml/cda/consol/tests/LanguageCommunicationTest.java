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
import org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication;

import org.openhealthtools.mdht.uml.cda.consol.operations.LanguageCommunicationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Language Communication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication#validateConsolLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LanguageCommunication#validateConsolLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Language Communication Mode Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LanguageCommunicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolLanguageCommunicationPreferenceInd() {
		OperationsTestCase<LanguageCommunication> validateConsolLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<LanguageCommunication>(
			"validateConsolLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LanguageCommunicationOperations.validateConsolLanguageCommunicationPreferenceInd(
					(LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateConsolLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolLanguageCommunicationModeCode() {
		OperationsTestCase<LanguageCommunication> validateConsolLanguageCommunicationModeCodeTestCase = new OperationsTestCase<LanguageCommunication>(
			"validateConsolLanguageCommunicationModeCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LanguageCommunicationOperations.validateConsolLanguageCommunicationModeCode(
					(LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateConsolLanguageCommunicationModeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LanguageCommunicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LanguageCommunication> {
		public LanguageCommunication create() {
			return ConsolFactory.eINSTANCE.createLanguageCommunication();
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
	private static class ConstructorTestClass extends LanguageCommunicationOperations {
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

} // LanguageCommunicationOperations
