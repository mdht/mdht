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
import org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BodyTemperatureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Body Temperature</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateBodyTemperatureValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Body Temperature Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BodyTemperature#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BodyTemperatureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBodyTemperatureMoodCode() {
		OperationsTestCase<BodyTemperature> validateBodyTemperatureMoodCodeTestCase = new OperationsTestCase<BodyTemperature>(
			"validateBodyTemperatureMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BODY_TEMPERATURE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BodyTemperature target) {

			}

			@Override
			protected void updateToPass(BodyTemperature target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BodyTemperatureOperations.validateBodyTemperatureMoodCode(
					(BodyTemperature) objectToTest, diagnostician, map);
			}

		};

		validateBodyTemperatureMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBodyTemperatureCode() {
		OperationsTestCase<BodyTemperature> validateBodyTemperatureCodeTestCase = new OperationsTestCase<BodyTemperature>(
			"validateBodyTemperatureCode",
			operationsForOCL.getOCLValue("VALIDATE_BODY_TEMPERATURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BodyTemperature target) {

			}

			@Override
			protected void updateToPass(BodyTemperature target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BodyTemperatureOperations.validateBodyTemperatureCode(
					(BodyTemperature) objectToTest, diagnostician, map);
			}

		};

		validateBodyTemperatureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBodyTemperatureEffectiveTime() {
		OperationsTestCase<BodyTemperature> validateBodyTemperatureEffectiveTimeTestCase = new OperationsTestCase<BodyTemperature>(
			"validateBodyTemperatureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_BODY_TEMPERATURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BodyTemperature target) {

			}

			@Override
			protected void updateToPass(BodyTemperature target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BodyTemperatureOperations.validateBodyTemperatureEffectiveTime(
					(BodyTemperature) objectToTest, diagnostician, map);
			}

		};

		validateBodyTemperatureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBodyTemperatureValue() {
		OperationsTestCase<BodyTemperature> validateBodyTemperatureValueTestCase = new OperationsTestCase<BodyTemperature>(
			"validateBodyTemperatureValue",
			operationsForOCL.getOCLValue("VALIDATE_BODY_TEMPERATURE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BodyTemperature target) {

			}

			@Override
			protected void updateToPass(BodyTemperature target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BodyTemperatureOperations.validateBodyTemperatureValue(
					(BodyTemperature) objectToTest, diagnostician, map);
			}

		};

		validateBodyTemperatureValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<BodyTemperature> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<BodyTemperature>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BodyTemperature target) {

			}

			@Override
			protected void updateToPass(BodyTemperature target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BodyTemperatureOperations.validateVitalSignObservationTemplateId(
					(BodyTemperature) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BodyTemperatureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BodyTemperature> {
		public BodyTemperature create() {
			return EmspcrFactory.eINSTANCE.createBodyTemperature();
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
	private static class ConstructorTestClass extends BodyTemperatureOperations {
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

} // BodyTemperatureOperations
