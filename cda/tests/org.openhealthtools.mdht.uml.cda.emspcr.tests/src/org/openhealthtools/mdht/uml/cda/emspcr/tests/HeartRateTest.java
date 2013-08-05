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
import org.openhealthtools.mdht.uml.cda.emspcr.HeartRate;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeartRateOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Heart Rate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateHeartRateCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Rate Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateHeartRateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Rate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateHeartRateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Rate Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateHeartRateEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Rate Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateHeartRateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Rate Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartRate#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeartRateTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartRateCodeP() {
		OperationsTestCase<HeartRate> validateHeartRateCodePTestCase = new OperationsTestCase<HeartRate>(
			"validateHeartRateCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEART_RATE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateHeartRateCodeP((HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateHeartRateCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartRateCode() {
		OperationsTestCase<HeartRate> validateHeartRateCodeTestCase = new OperationsTestCase<HeartRate>(
			"validateHeartRateCode",
			operationsForOCL.getOCLValue("VALIDATE_HEART_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateHeartRateCode((HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateHeartRateCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartRateValue() {
		OperationsTestCase<HeartRate> validateHeartRateValueTestCase = new OperationsTestCase<HeartRate>(
			"validateHeartRateValue",
			operationsForOCL.getOCLValue("VALIDATE_HEART_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateHeartRateValue((HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateHeartRateValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartRateEffectiveTime() {
		OperationsTestCase<HeartRate> validateHeartRateEffectiveTimeTestCase = new OperationsTestCase<HeartRate>(
			"validateHeartRateEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HEART_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateHeartRateEffectiveTime((HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateHeartRateEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartRateMoodCode() {
		OperationsTestCase<HeartRate> validateHeartRateMoodCodeTestCase = new OperationsTestCase<HeartRate>(
			"validateHeartRateMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEART_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateHeartRateMoodCode((HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateHeartRateMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<HeartRate> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<HeartRate>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartRate target) {

			}

			@Override
			protected void updateToPass(HeartRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartRateOperations.validateVitalSignObservationTemplateId(
					(HeartRate) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeartRateOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeartRate> {
		public HeartRate create() {
			return EmspcrFactory.eINSTANCE.createHeartRate();
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
	private static class ConstructorTestClass extends HeartRateOperations {
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

} // HeartRateOperations
