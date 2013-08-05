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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationResponseObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Response Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation#validateMedicationResponseObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Response Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation#validateMedicationResponseObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Response Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation#validateMedicationResponseObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Response Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation#validateMedicationResponseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Response Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationResponseObservation#validateMedicationResponseObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Response Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationResponseObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationResponseObservationTemplateId() {
		OperationsTestCase<MedicationResponseObservation> validateMedicationResponseObservationTemplateIdTestCase = new OperationsTestCase<MedicationResponseObservation>(
			"validateMedicationResponseObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RESPONSE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationResponseObservation target) {

			}

			@Override
			protected void updateToPass(MedicationResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationResponseObservationOperations.validateMedicationResponseObservationTemplateId(
					(MedicationResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationResponseObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationResponseObservationCodeP() {
		OperationsTestCase<MedicationResponseObservation> validateMedicationResponseObservationCodePTestCase = new OperationsTestCase<MedicationResponseObservation>(
			"validateMedicationResponseObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RESPONSE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationResponseObservation target) {

			}

			@Override
			protected void updateToPass(MedicationResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationResponseObservationOperations.validateMedicationResponseObservationCodeP(
					(MedicationResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationResponseObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationResponseObservationCode() {
		OperationsTestCase<MedicationResponseObservation> validateMedicationResponseObservationCodeTestCase = new OperationsTestCase<MedicationResponseObservation>(
			"validateMedicationResponseObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RESPONSE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationResponseObservation target) {

			}

			@Override
			protected void updateToPass(MedicationResponseObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationResponseObservationOperations.validateMedicationResponseObservationCode(
					(MedicationResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationResponseObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationResponseObservationValue() {
		OperationsTestCase<MedicationResponseObservation> validateMedicationResponseObservationValueTestCase = new OperationsTestCase<MedicationResponseObservation>(
			"validateMedicationResponseObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RESPONSE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationResponseObservation target) {

			}

			@Override
			protected void updateToPass(MedicationResponseObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationResponseObservationOperations.validateMedicationResponseObservationValue(
					(MedicationResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationResponseObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationResponseObservationMoodCode() {
		OperationsTestCase<MedicationResponseObservation> validateMedicationResponseObservationMoodCodeTestCase = new OperationsTestCase<MedicationResponseObservation>(
			"validateMedicationResponseObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RESPONSE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationResponseObservation target) {

			}

			@Override
			protected void updateToPass(MedicationResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationResponseObservationOperations.validateMedicationResponseObservationMoodCode(
					(MedicationResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationResponseObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationResponseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationResponseObservation> {
		public MedicationResponseObservation create() {
			return EmspcrFactory.eINSTANCE.createMedicationResponseObservation();
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
	private static class ConstructorTestClass extends MedicationResponseObservationOperations {
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

} // MedicationResponseObservationOperations
