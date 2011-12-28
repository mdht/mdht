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
import org.openhealthtools.mdht.uml.cda.consol.Patient;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient#validateConsolPatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Religious Affiliation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientBirthTime() {
		OperationsTestCase<Patient> validateConsolPatientBirthTimeTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientBirthTime((Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientEthnicGroupCode() {
		OperationsTestCase<Patient> validateConsolPatientEthnicGroupCodeTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientEthnicGroupCode(
					(Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientName() {
		OperationsTestCase<Patient> validateConsolPatientNameTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientName",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientName((Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientReligiousAffiliationCode() {
		OperationsTestCase<Patient> validateConsolPatientReligiousAffiliationCodeTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientReligiousAffiliationCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientReligiousAffiliationCode(
					(Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientReligiousAffiliationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientGuardian() {
		OperationsTestCase<Patient> validateConsolPatientGuardianTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientGuardian",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientGuardian((Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientBirthplace() {
		OperationsTestCase<Patient> validateConsolPatientBirthplaceTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientBirthplace",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientBirthplace((Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientBirthplaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientLanguageCommunication() {
		OperationsTestCase<Patient> validateConsolPatientLanguageCommunicationTestCase = new OperationsTestCase<Patient>(
			"validateConsolPatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient target) {

			}

			@Override
			protected void updateToPass(Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOperations.validateConsolPatientLanguageCommunication(
					(Patient) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Patient> {
		public Patient create() {
			return ConsolFactory.eINSTANCE.createPatient();
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
	private static class ConstructorTestClass extends PatientOperations {
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

} // PatientOperations
