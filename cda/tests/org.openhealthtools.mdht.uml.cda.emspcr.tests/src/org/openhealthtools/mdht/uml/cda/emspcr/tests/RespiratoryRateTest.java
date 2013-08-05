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
import org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.RespiratoryRateOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Respiratory Rate</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateRespiratoryRateMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Respiratory Rate Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.RespiratoryRate#validateVitalSignObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RespiratoryRateTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateCode() {
		OperationsTestCase<RespiratoryRate> validateRespiratoryRateCodeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratoryRateOperations.validateRespiratoryRateCode(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateValue() {
		OperationsTestCase<RespiratoryRate> validateRespiratoryRateValueTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratoryRateOperations.validateRespiratoryRateValue(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateEffectiveTime() {
		OperationsTestCase<RespiratoryRate> validateRespiratoryRateEffectiveTimeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratoryRateOperations.validateRespiratoryRateEffectiveTime(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRespiratoryRateMoodCode() {
		OperationsTestCase<RespiratoryRate> validateRespiratoryRateMoodCodeTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateRespiratoryRateMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPIRATORY_RATE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratoryRateOperations.validateRespiratoryRateMoodCode(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateRespiratoryRateMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<RespiratoryRate> validateVitalSignObservationTemplateIdTestCase = new OperationsTestCase<RespiratoryRate>(
			"validateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RespiratoryRate target) {

			}

			@Override
			protected void updateToPass(RespiratoryRate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RespiratoryRateOperations.validateVitalSignObservationTemplateId(
					(RespiratoryRate) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RespiratoryRateOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RespiratoryRate> {
		public RespiratoryRate create() {
			return EmspcrFactory.eINSTANCE.createRespiratoryRate();
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
	private static class ConstructorTestClass extends RespiratoryRateOperations {
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

} // RespiratoryRateOperations
