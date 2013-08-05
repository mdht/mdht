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
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NumberOfPatientsObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Patients Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsObservation#validateNumberOfPatientsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberOfPatientsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsObservationTemplateId() {
		OperationsTestCase<NumberOfPatientsObservation> validateNumberOfPatientsObservationTemplateIdTestCase = new OperationsTestCase<NumberOfPatientsObservation>(
			"validateNumberOfPatientsObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationTemplateId(
					(NumberOfPatientsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsObservationCodeP() {
		OperationsTestCase<NumberOfPatientsObservation> validateNumberOfPatientsObservationCodePTestCase = new OperationsTestCase<NumberOfPatientsObservation>(
			"validateNumberOfPatientsObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationCodeP(
					(NumberOfPatientsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsObservationCode() {
		OperationsTestCase<NumberOfPatientsObservation> validateNumberOfPatientsObservationCodeTestCase = new OperationsTestCase<NumberOfPatientsObservation>(
			"validateNumberOfPatientsObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationCode(
					(NumberOfPatientsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsObservationValue() {
		OperationsTestCase<NumberOfPatientsObservation> validateNumberOfPatientsObservationValueTestCase = new OperationsTestCase<NumberOfPatientsObservation>(
			"validateNumberOfPatientsObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationValue(
					(NumberOfPatientsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsObservationMoodCode() {
		OperationsTestCase<NumberOfPatientsObservation> validateNumberOfPatientsObservationMoodCodeTestCase = new OperationsTestCase<NumberOfPatientsObservation>(
			"validateNumberOfPatientsObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsObservationOperations.validateNumberOfPatientsObservationMoodCode(
					(NumberOfPatientsObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberOfPatientsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberOfPatientsObservation> {
		public NumberOfPatientsObservation create() {
			return EmspcrFactory.eINSTANCE.createNumberOfPatientsObservation();
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
	private static class ConstructorTestClass extends NumberOfPatientsObservationOperations {
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

} // NumberOfPatientsObservationOperations
