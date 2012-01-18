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
import org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication;

import org.openhealthtools.mdht.uml.cda.consol.operations.Patient_LanguageCommunicationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Language Communication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication#validateLanguageCommunicationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Communication Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication#validateLanguageCommunicationPreferenceInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Communication Preference Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication#validateLanguageCommunicationProficiencyLevelCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Communication Proficiency Level Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_LanguageCommunication#validateLanguageCommunicationModeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Language Communication Mode Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Patient_LanguageCommunicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLanguageCommunicationLanguageCode() {
		OperationsTestCase<Patient_LanguageCommunication> validateLanguageCommunicationLanguageCodeTestCase = new OperationsTestCase<Patient_LanguageCommunication>(
			"validateLanguageCommunicationLanguageCode",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_COMMUNICATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient_LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(Patient_LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_LanguageCommunicationOperations.validateLanguageCommunicationLanguageCode(
					(Patient_LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateLanguageCommunicationLanguageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLanguageCommunicationPreferenceInd() {
		OperationsTestCase<Patient_LanguageCommunication> validateLanguageCommunicationPreferenceIndTestCase = new OperationsTestCase<Patient_LanguageCommunication>(
			"validateLanguageCommunicationPreferenceInd",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_COMMUNICATION_PREFERENCE_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient_LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(Patient_LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_LanguageCommunicationOperations.validateLanguageCommunicationPreferenceInd(
					(Patient_LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateLanguageCommunicationPreferenceIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLanguageCommunicationProficiencyLevelCode() {
		OperationsTestCase<Patient_LanguageCommunication> validateLanguageCommunicationProficiencyLevelCodeTestCase = new OperationsTestCase<Patient_LanguageCommunication>(
			"validateLanguageCommunicationProficiencyLevelCode",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_COMMUNICATION_PROFICIENCY_LEVEL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient_LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(Patient_LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_LanguageCommunicationOperations.validateLanguageCommunicationProficiencyLevelCode(
					(Patient_LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateLanguageCommunicationProficiencyLevelCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLanguageCommunicationModeCode() {
		OperationsTestCase<Patient_LanguageCommunication> validateLanguageCommunicationModeCodeTestCase = new OperationsTestCase<Patient_LanguageCommunication>(
			"validateLanguageCommunicationModeCode",
			operationsForOCL.getOCLValue("VALIDATE_LANGUAGE_COMMUNICATION_MODE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient_LanguageCommunication target) {

			}

			@Override
			protected void updateToPass(Patient_LanguageCommunication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_LanguageCommunicationOperations.validateLanguageCommunicationModeCode(
					(Patient_LanguageCommunication) objectToTest, diagnostician, map);
			}

		};

		validateLanguageCommunicationModeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Patient_LanguageCommunicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Patient_LanguageCommunication> {
		public Patient_LanguageCommunication create() {
			return ConsolFactory.eINSTANCE.createPatient_LanguageCommunication();
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
	private static class ConstructorTestClass extends Patient_LanguageCommunicationOperations {
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

} // Patient_LanguageCommunicationOperations
