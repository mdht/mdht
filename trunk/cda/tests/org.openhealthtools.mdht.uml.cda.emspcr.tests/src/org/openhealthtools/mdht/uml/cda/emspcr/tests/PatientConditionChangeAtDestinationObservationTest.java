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
import org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientConditionChangeAtDestinationObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Condition Change At Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservation#validatePatientConditionChangeAtDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Condition Change At Destination Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientConditionChangeAtDestinationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationTemplateId() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationTemplateIdTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationTemplateId(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationMoodCode() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationMoodCodeTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationMoodCode(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationCodeP() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationCodePTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationCodeP(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationCode() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationCodeTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(PatientConditionChangeAtDestinationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.emspcr.PatientConditionChangeAtDestinationObservationCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationCode(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationValue() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationValueTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationValue(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientConditionChangeAtDestinationObservationValueP() {
		OperationsTestCase<PatientConditionChangeAtDestinationObservation> validatePatientConditionChangeAtDestinationObservationValuePTestCase = new OperationsTestCase<PatientConditionChangeAtDestinationObservation>(
			"validatePatientConditionChangeAtDestinationObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONDITION_CHANGE_AT_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientConditionChangeAtDestinationObservation target) {

			}

			@Override
			protected void updateToPass(PatientConditionChangeAtDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientConditionChangeAtDestinationObservationOperations.validatePatientConditionChangeAtDestinationObservationValueP(
					(PatientConditionChangeAtDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePatientConditionChangeAtDestinationObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientConditionChangeAtDestinationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientConditionChangeAtDestinationObservation> {
		public PatientConditionChangeAtDestinationObservation create() {
			return EmspcrFactory.eINSTANCE.createPatientConditionChangeAtDestinationObservation();
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
	private static class ConstructorTestClass extends PatientConditionChangeAtDestinationObservationOperations {
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

} // PatientConditionChangeAtDestinationObservationOperations
