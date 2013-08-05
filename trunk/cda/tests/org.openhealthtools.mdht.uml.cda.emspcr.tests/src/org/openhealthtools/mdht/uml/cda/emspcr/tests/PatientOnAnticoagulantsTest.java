/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientOnAnticoagulantsOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient On Anticoagulants</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientOnAnticoagulants#validatePatientOnAnticoagulantsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient On Anticoagulants Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientOnAnticoagulantsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientOnAnticoagulantsTemplateId() {
		OperationsTestCase<PatientOnAnticoagulants> validatePatientOnAnticoagulantsTemplateIdTestCase = new OperationsTestCase<PatientOnAnticoagulants>(
			"validatePatientOnAnticoagulantsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ON_ANTICOAGULANTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientOnAnticoagulants target) {

			}

			@Override
			protected void updateToPass(PatientOnAnticoagulants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsTemplateId(
					(PatientOnAnticoagulants) objectToTest, diagnostician, map);
			}

		};

		validatePatientOnAnticoagulantsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientOnAnticoagulantsCode() {
		OperationsTestCase<PatientOnAnticoagulants> validatePatientOnAnticoagulantsCodeTestCase = new OperationsTestCase<PatientOnAnticoagulants>(
			"validatePatientOnAnticoagulantsCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ON_ANTICOAGULANTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientOnAnticoagulants target) {

			}

			@Override
			protected void updateToPass(PatientOnAnticoagulants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsCode(
					(PatientOnAnticoagulants) objectToTest, diagnostician, map);
			}

		};

		validatePatientOnAnticoagulantsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientOnAnticoagulantsValue() {
		OperationsTestCase<PatientOnAnticoagulants> validatePatientOnAnticoagulantsValueTestCase = new OperationsTestCase<PatientOnAnticoagulants>(
			"validatePatientOnAnticoagulantsValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ON_ANTICOAGULANTS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientOnAnticoagulants target) {

			}

			@Override
			protected void updateToPass(PatientOnAnticoagulants target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsValue(
					(PatientOnAnticoagulants) objectToTest, diagnostician, map);
			}

		};

		validatePatientOnAnticoagulantsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientOnAnticoagulantsMoodCode() {
		OperationsTestCase<PatientOnAnticoagulants> validatePatientOnAnticoagulantsMoodCodeTestCase = new OperationsTestCase<PatientOnAnticoagulants>(
			"validatePatientOnAnticoagulantsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ON_ANTICOAGULANTS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientOnAnticoagulants target) {

			}

			@Override
			protected void updateToPass(PatientOnAnticoagulants target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientOnAnticoagulantsOperations.validatePatientOnAnticoagulantsMoodCode(
					(PatientOnAnticoagulants) objectToTest, diagnostician, map);
			}

		};

		validatePatientOnAnticoagulantsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientOnAnticoagulantsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientOnAnticoagulants> {
		public PatientOnAnticoagulants create() {
			return EmspcrFactory.eINSTANCE.createPatientOnAnticoagulants();
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
	private static class ConstructorTestClass extends PatientOnAnticoagulantsOperations {
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

} // PatientOnAnticoagulantsOperations
