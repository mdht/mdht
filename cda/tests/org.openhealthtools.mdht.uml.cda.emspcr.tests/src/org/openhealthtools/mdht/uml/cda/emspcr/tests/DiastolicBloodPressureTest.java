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

import org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DiastolicBloodPressureOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diastolic Blood Pressure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateDiastolicBloodPressureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Diastolic Blood Pressure Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DiastolicBloodPressure#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DiastolicBloodPressureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiastolicBloodPressureCode() {
		OperationsTestCase<DiastolicBloodPressure> validateDiastolicBloodPressureCodeTestCase = new OperationsTestCase<DiastolicBloodPressure>(
			"validateDiastolicBloodPressureCode",
			operationsForOCL.getOCLValue("VALIDATE_DIASTOLIC_BLOOD_PRESSURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiastolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(DiastolicBloodPressure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiastolicBloodPressureOperations.validateDiastolicBloodPressureCode(
					(DiastolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateDiastolicBloodPressureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiastolicBloodPressureValue() {
		OperationsTestCase<DiastolicBloodPressure> validateDiastolicBloodPressureValueTestCase = new OperationsTestCase<DiastolicBloodPressure>(
			"validateDiastolicBloodPressureValue",
			operationsForOCL.getOCLValue("VALIDATE_DIASTOLIC_BLOOD_PRESSURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiastolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(DiastolicBloodPressure target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiastolicBloodPressureOperations.validateDiastolicBloodPressureValue(
					(DiastolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateDiastolicBloodPressureValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiastolicBloodPressureEffectiveTime() {
		OperationsTestCase<DiastolicBloodPressure> validateDiastolicBloodPressureEffectiveTimeTestCase = new OperationsTestCase<DiastolicBloodPressure>(
			"validateDiastolicBloodPressureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_DIASTOLIC_BLOOD_PRESSURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiastolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(DiastolicBloodPressure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiastolicBloodPressureOperations.validateDiastolicBloodPressureEffectiveTime(
					(DiastolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateDiastolicBloodPressureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDiastolicBloodPressureMoodCode() {
		OperationsTestCase<DiastolicBloodPressure> validateDiastolicBloodPressureMoodCodeTestCase = new OperationsTestCase<DiastolicBloodPressure>(
			"validateDiastolicBloodPressureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DIASTOLIC_BLOOD_PRESSURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiastolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(DiastolicBloodPressure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiastolicBloodPressureOperations.validateDiastolicBloodPressureMoodCode(
					(DiastolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateDiastolicBloodPressureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<DiastolicBloodPressure> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<DiastolicBloodPressure>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DiastolicBloodPressure target) {

			}

			@Override
			protected void updateToPass(DiastolicBloodPressure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DiastolicBloodPressureOperations.validateVitalSignObservationTemplateId(
					(DiastolicBloodPressure) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DiastolicBloodPressureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DiastolicBloodPressure> {
		public DiastolicBloodPressure create() {
			return EmspcrFactory.eINSTANCE.createDiastolicBloodPressure();
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
	private static class ConstructorTestClass extends DiastolicBloodPressureOperations {
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

} // DiastolicBloodPressureOperations
