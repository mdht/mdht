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
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationComplicationObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Complication Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationComplicationObservation#validateMedicationComplicationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Complication Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationComplicationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationTemplateId() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationTemplateIdTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationTemplateId(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationCodeP() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationCodePTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationCodeP(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationCode() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationCodeTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationCode(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationValue() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationValueTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationValue(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationValueP() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationValuePTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationValueP(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationComplicationObservationMoodCode() {
		OperationsTestCase<MedicationComplicationObservation> validateMedicationComplicationObservationMoodCodeTestCase = new OperationsTestCase<MedicationComplicationObservation>(
			"validateMedicationComplicationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_COMPLICATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationComplicationObservation target) {

			}

			@Override
			protected void updateToPass(MedicationComplicationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationComplicationObservationOperations.validateMedicationComplicationObservationMoodCode(
					(MedicationComplicationObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationComplicationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationComplicationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationComplicationObservation> {
		public MedicationComplicationObservation create() {
			return EmspcrFactory.eINSTANCE.createMedicationComplicationObservation();
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
	private static class ConstructorTestClass extends MedicationComplicationObservationOperations {
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

} // MedicationComplicationObservationOperations
