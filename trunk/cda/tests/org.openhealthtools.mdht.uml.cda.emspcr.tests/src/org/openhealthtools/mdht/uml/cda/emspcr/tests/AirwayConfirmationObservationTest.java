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

import org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AirwayConfirmationObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Airway Confirmation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AirwayConfirmationObservation#validateAirwayConfirmationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Airway Confirmation Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AirwayConfirmationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationTemplateId() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationTemplateIdTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationTemplateId(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationCodeP() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationCodePTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationCodeP(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationCode() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationCodeTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationCode(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationMethodCode() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationMethodCodeTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMethodCode(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationMethodCodeP() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationMethodCodePTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationMethodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMethodCodeP(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationMethodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationValue() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationValueTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationValue(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationEffectiveTime() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationEffectiveTimeTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationEffectiveTime(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAirwayConfirmationObservationMoodCode() {
		OperationsTestCase<AirwayConfirmationObservation> validateAirwayConfirmationObservationMoodCodeTestCase = new OperationsTestCase<AirwayConfirmationObservation>(
			"validateAirwayConfirmationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_AIRWAY_CONFIRMATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AirwayConfirmationObservation target) {

			}

			@Override
			protected void updateToPass(AirwayConfirmationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AirwayConfirmationObservationOperations.validateAirwayConfirmationObservationMoodCode(
					(AirwayConfirmationObservation) objectToTest, diagnostician, map);
			}

		};

		validateAirwayConfirmationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AirwayConfirmationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AirwayConfirmationObservation> {
		public AirwayConfirmationObservation create() {
			return EmspcrFactory.eINSTANCE.createAirwayConfirmationObservation();
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
	private static class ConstructorTestClass extends AirwayConfirmationObservationOperations {
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

} // AirwayConfirmationObservationOperations
