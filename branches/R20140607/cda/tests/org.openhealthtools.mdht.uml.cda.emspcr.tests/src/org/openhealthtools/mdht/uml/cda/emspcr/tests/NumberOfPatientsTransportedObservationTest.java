/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NumberOfPatientsTransportedObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Patients Transported Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservation#validateNumberOfPatientsTransportedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Patients Transported Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberOfPatientsTransportedObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsTransportedObservationTemplateId() {
		OperationsTestCase<NumberOfPatientsTransportedObservation> validateNumberOfPatientsTransportedObservationTemplateIdTestCase = new OperationsTestCase<NumberOfPatientsTransportedObservation>(
			"validateNumberOfPatientsTransportedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsTransportedObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsTransportedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationTemplateId(
					(NumberOfPatientsTransportedObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsTransportedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsTransportedObservationMoodCode() {
		OperationsTestCase<NumberOfPatientsTransportedObservation> validateNumberOfPatientsTransportedObservationMoodCodeTestCase = new OperationsTestCase<NumberOfPatientsTransportedObservation>(
			"validateNumberOfPatientsTransportedObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsTransportedObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsTransportedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationMoodCode(
					(NumberOfPatientsTransportedObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsTransportedObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsTransportedObservationCodeP() {
		OperationsTestCase<NumberOfPatientsTransportedObservation> validateNumberOfPatientsTransportedObservationCodePTestCase = new OperationsTestCase<NumberOfPatientsTransportedObservation>(
			"validateNumberOfPatientsTransportedObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsTransportedObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsTransportedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationCodeP(
					(NumberOfPatientsTransportedObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsTransportedObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsTransportedObservationCode() {
		OperationsTestCase<NumberOfPatientsTransportedObservation> validateNumberOfPatientsTransportedObservationCodeTestCase = new OperationsTestCase<NumberOfPatientsTransportedObservation>(
			"validateNumberOfPatientsTransportedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsTransportedObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsTransportedObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(NumberOfPatientsTransportedObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.emspcr.NumberOfPatientsTransportedObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationCode(
					(NumberOfPatientsTransportedObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsTransportedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPatientsTransportedObservationValue() {
		OperationsTestCase<NumberOfPatientsTransportedObservation> validateNumberOfPatientsTransportedObservationValueTestCase = new OperationsTestCase<NumberOfPatientsTransportedObservation>(
			"validateNumberOfPatientsTransportedObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PATIENTS_TRANSPORTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPatientsTransportedObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPatientsTransportedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPatientsTransportedObservationOperations.validateNumberOfPatientsTransportedObservationValue(
					(NumberOfPatientsTransportedObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPatientsTransportedObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberOfPatientsTransportedObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberOfPatientsTransportedObservation> {
		public NumberOfPatientsTransportedObservation create() {
			return EmspcrFactory.eINSTANCE.createNumberOfPatientsTransportedObservation();
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
	private static class ConstructorTestClass extends NumberOfPatientsTransportedObservationOperations {
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

} // NumberOfPatientsTransportedObservationOperations
