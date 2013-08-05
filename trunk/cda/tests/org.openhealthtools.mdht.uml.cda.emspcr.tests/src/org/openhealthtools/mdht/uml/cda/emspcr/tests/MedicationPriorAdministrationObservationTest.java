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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationPriorAdministrationObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Prior Administration Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationPriorAdministrationObservation#validateMedicationPriorAdministrationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Prior Administration Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationPriorAdministrationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationPriorAdministrationObservationTemplateId() {
		OperationsTestCase<MedicationPriorAdministrationObservation> validateMedicationPriorAdministrationObservationTemplateIdTestCase = new OperationsTestCase<MedicationPriorAdministrationObservation>(
			"validateMedicationPriorAdministrationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationPriorAdministrationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationPriorAdministrationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationTemplateId(
					(MedicationPriorAdministrationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPriorAdministrationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationPriorAdministrationObservationCodeP() {
		OperationsTestCase<MedicationPriorAdministrationObservation> validateMedicationPriorAdministrationObservationCodePTestCase = new OperationsTestCase<MedicationPriorAdministrationObservation>(
			"validateMedicationPriorAdministrationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationPriorAdministrationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationPriorAdministrationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationCodeP(
					(MedicationPriorAdministrationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPriorAdministrationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationPriorAdministrationObservationCode() {
		OperationsTestCase<MedicationPriorAdministrationObservation> validateMedicationPriorAdministrationObservationCodeTestCase = new OperationsTestCase<MedicationPriorAdministrationObservation>(
			"validateMedicationPriorAdministrationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationPriorAdministrationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationPriorAdministrationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationCode(
					(MedicationPriorAdministrationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPriorAdministrationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationPriorAdministrationObservationValue() {
		OperationsTestCase<MedicationPriorAdministrationObservation> validateMedicationPriorAdministrationObservationValueTestCase = new OperationsTestCase<MedicationPriorAdministrationObservation>(
			"validateMedicationPriorAdministrationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationPriorAdministrationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationPriorAdministrationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationValue(
					(MedicationPriorAdministrationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPriorAdministrationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationPriorAdministrationObservationMoodCode() {
		OperationsTestCase<MedicationPriorAdministrationObservation> validateMedicationPriorAdministrationObservationMoodCodeTestCase = new OperationsTestCase<MedicationPriorAdministrationObservation>(
			"validateMedicationPriorAdministrationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRIOR_ADMINISTRATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationPriorAdministrationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationPriorAdministrationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationPriorAdministrationObservationOperations.validateMedicationPriorAdministrationObservationMoodCode(
					(MedicationPriorAdministrationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPriorAdministrationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationPriorAdministrationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationPriorAdministrationObservation> {
		public MedicationPriorAdministrationObservation create() {
			return EmspcrFactory.eINSTANCE.createMedicationPriorAdministrationObservation();
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
	private static class ConstructorTestClass extends MedicationPriorAdministrationObservationOperations {
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

} // MedicationPriorAdministrationObservationOperations
