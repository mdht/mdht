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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationNotAdministeredReasonObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Not Administered Reason Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationNotAdministeredReasonObservation#validateMedicationNotAdministeredReasonObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Not Administered Reason Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationNotAdministeredReasonObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationNotAdministeredReasonObservationTemplateId() {
		OperationsTestCase<MedicationNotAdministeredReasonObservation> validateMedicationNotAdministeredReasonObservationTemplateIdTestCase = new OperationsTestCase<MedicationNotAdministeredReasonObservation>(
			"validateMedicationNotAdministeredReasonObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationNotAdministeredReasonObservation target) {

			}

			@Override
			protected void updateToPass(MedicationNotAdministeredReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationTemplateId(
					(MedicationNotAdministeredReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationNotAdministeredReasonObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationNotAdministeredReasonObservationMoodCode() {
		OperationsTestCase<MedicationNotAdministeredReasonObservation> validateMedicationNotAdministeredReasonObservationMoodCodeTestCase = new OperationsTestCase<MedicationNotAdministeredReasonObservation>(
			"validateMedicationNotAdministeredReasonObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationNotAdministeredReasonObservation target) {

			}

			@Override
			protected void updateToPass(MedicationNotAdministeredReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationMoodCode(
					(MedicationNotAdministeredReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationNotAdministeredReasonObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationNotAdministeredReasonObservationCode() {
		OperationsTestCase<MedicationNotAdministeredReasonObservation> validateMedicationNotAdministeredReasonObservationCodeTestCase = new OperationsTestCase<MedicationNotAdministeredReasonObservation>(
			"validateMedicationNotAdministeredReasonObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationNotAdministeredReasonObservation target) {

			}

			@Override
			protected void updateToPass(MedicationNotAdministeredReasonObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationCode(
					(MedicationNotAdministeredReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationNotAdministeredReasonObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationNotAdministeredReasonObservationValue() {
		OperationsTestCase<MedicationNotAdministeredReasonObservation> validateMedicationNotAdministeredReasonObservationValueTestCase = new OperationsTestCase<MedicationNotAdministeredReasonObservation>(
			"validateMedicationNotAdministeredReasonObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationNotAdministeredReasonObservation target) {

			}

			@Override
			protected void updateToPass(MedicationNotAdministeredReasonObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationValue(
					(MedicationNotAdministeredReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationNotAdministeredReasonObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationNotAdministeredReasonObservationValueP() {
		OperationsTestCase<MedicationNotAdministeredReasonObservation> validateMedicationNotAdministeredReasonObservationValuePTestCase = new OperationsTestCase<MedicationNotAdministeredReasonObservation>(
			"validateMedicationNotAdministeredReasonObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_NOT_ADMINISTERED_REASON_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationNotAdministeredReasonObservation target) {

			}

			@Override
			protected void updateToPass(MedicationNotAdministeredReasonObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationNotAdministeredReasonObservationOperations.validateMedicationNotAdministeredReasonObservationValueP(
					(MedicationNotAdministeredReasonObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationNotAdministeredReasonObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationNotAdministeredReasonObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationNotAdministeredReasonObservation> {
		public MedicationNotAdministeredReasonObservation create() {
			return EmspcrFactory.eINSTANCE.createMedicationNotAdministeredReasonObservation();
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
	private static class ConstructorTestClass extends MedicationNotAdministeredReasonObservationOperations {
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

} // MedicationNotAdministeredReasonObservationOperations
