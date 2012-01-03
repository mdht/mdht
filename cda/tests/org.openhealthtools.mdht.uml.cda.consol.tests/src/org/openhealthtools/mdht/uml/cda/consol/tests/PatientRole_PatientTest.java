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
import org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient;
import org.openhealthtools.mdht.uml.cda.consol.operations.PatientRole_PatientOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Role Patient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientBirthTimePreciseToYear(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Birth Time Precise To Year</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientBirthTimePreciseToDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Birth Time Precise To Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientEthnicGroupCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Ethnic Group Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientMaritalStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Marital Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientRaceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Race Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientReligiousAffiliationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Religious Affiliation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientGuardian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Guardian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientBirthplace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Birthplace</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_Patient#validatePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Language Communication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientRole_PatientTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBirthTimePreciseToYear() {
		OperationsTestCase<PatientRole_Patient> validatePatientBirthTimePreciseToYearTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientBirthTimePreciseToYear",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BIRTH_TIME_PRECISE_TO_YEAR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientBirthTimePreciseToYear(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientBirthTimePreciseToYearTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBirthTimePreciseToDay() {
		OperationsTestCase<PatientRole_Patient> validatePatientBirthTimePreciseToDayTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientBirthTimePreciseToDay",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BIRTH_TIME_PRECISE_TO_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientBirthTimePreciseToDay(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientBirthTimePreciseToDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBirthTime() {
		OperationsTestCase<PatientRole_Patient> validatePatientBirthTimeTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientBirthTime(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientEthnicGroupCode() {
		OperationsTestCase<PatientRole_Patient> validatePatientEthnicGroupCodeTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientEthnicGroupCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ETHNIC_GROUP_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientEthnicGroupCode(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientEthnicGroupCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePatientMaritalStatusCode() {
		OperationsTestCase<PatientRole_Patient> validatePatientMaritalStatusCodeTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientMaritalStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MARITAL_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

				DatatypesFactory.eINSTANCE.createCS("completed");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientMaritalStatusCode(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientMaritalStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientName() {
		OperationsTestCase<PatientRole_Patient> validatePatientNameTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientName",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientName(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRaceCode() {
		OperationsTestCase<PatientRole_Patient> validatePatientRaceCodeTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientRaceCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_RACE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientRaceCode(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientRaceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientReligiousAffiliationCode() {
		OperationsTestCase<PatientRole_Patient> validatePatientReligiousAffiliationCodeTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientReligiousAffiliationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_RELIGIOUS_AFFILIATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientReligiousAffiliationCode(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientReligiousAffiliationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientGuardian() {
		OperationsTestCase<PatientRole_Patient> validatePatientGuardianTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientGuardian",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_GUARDIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientGuardian(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientGuardianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientBirthplace() {
		OperationsTestCase<PatientRole_Patient> validatePatientBirthplaceTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientBirthplace",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_BIRTHPLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientBirthplace(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientBirthplaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientLanguageCommunication() {
		OperationsTestCase<PatientRole_Patient> validatePatientLanguageCommunicationTestCase = new OperationsTestCase<PatientRole_Patient>(
			"validatePatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_Patient target) {

			}

			@Override
			protected void updateToPass(PatientRole_Patient target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_PatientOperations.validatePatientLanguageCommunication(
					(PatientRole_Patient) objectToTest, diagnostician, map);
			}

		};

		validatePatientLanguageCommunicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientRole_PatientOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientRole_Patient> {
		public PatientRole_Patient create() {
			return ConsolFactory.eINSTANCE.createPatientRole_Patient();
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
	private static class ConstructorTestClass extends PatientRole_PatientOperations {
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

} // PatientRole_PatientOperations
