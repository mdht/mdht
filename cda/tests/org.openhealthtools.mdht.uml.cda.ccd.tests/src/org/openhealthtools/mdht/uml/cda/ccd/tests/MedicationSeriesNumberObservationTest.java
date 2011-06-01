/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation;

import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationSeriesNumberObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Series Number Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.MedicationSeriesNumberObservation#validateMedicationSeriesNumberObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Series Number Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationSeriesNumberObservationTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationTemplateId() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationTemplateIdTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationTemplateId(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationClassCode() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationClassCodeTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationClassCode(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationClassCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationMoodCode() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationMoodCodeTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationMoodCode(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationMoodCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationStatusCode() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationStatusCodeTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationStatusCode(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationStatusCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationCode() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationCodeTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationCode",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationCode(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateMedicationSeriesNumberObservationValue() {
		OperationsTestCase<MedicationSeriesNumberObservation> validateMedicationSeriesNumberObservationValueTestCase = new OperationsTestCase<MedicationSeriesNumberObservation>(
				"validateMedicationSeriesNumberObservationValue",
				operationsForOCL
						.getOCLValue("VALIDATE_MEDICATION_SERIES_NUMBER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(MedicationSeriesNumberObservation target) {

			}

			@Override
			protected void updateToPass(MedicationSeriesNumberObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSeriesNumberObservationOperations
						.validateMedicationSeriesNumberObservationValue(
								(MedicationSeriesNumberObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateMedicationSeriesNumberObservationValueTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			MedicationSeriesNumberObservationOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<MedicationSeriesNumberObservation> {
		public MedicationSeriesNumberObservation create() {
			return CCDFactory.eINSTANCE
					.createMedicationSeriesNumberObservation();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // MedicationSeriesNumberObservationOperations