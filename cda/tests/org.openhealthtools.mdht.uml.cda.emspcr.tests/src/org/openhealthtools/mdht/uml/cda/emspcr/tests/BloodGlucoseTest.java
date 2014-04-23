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
import org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BloodGlucoseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Blood Glucose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucose#validateBloodGlucoseValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Blood Glucose Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BloodGlucoseTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseTemplateId() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseTemplateIdTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseTemplateId(
					(BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseMoodCode() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseMoodCodeTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseMoodCode(
					(BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseCodeP() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseCodePTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseCodeP((BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseCode() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseCodeTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseCode",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

			}

			@Override
			protected void setDependency(BloodGlucose target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.BloodGlucoseCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseCode((BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseEffectiveTime() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseEffectiveTimeTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseEffectiveTime(
					(BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBloodGlucoseValue() {
		OperationsTestCase<BloodGlucose> validateBloodGlucoseValueTestCase = new OperationsTestCase<BloodGlucose>(
			"validateBloodGlucoseValue",
			operationsForOCL.getOCLValue("VALIDATE_BLOOD_GLUCOSE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(BloodGlucose target) {

			}

			@Override
			protected void updateToPass(BloodGlucose target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BloodGlucoseOperations.validateBloodGlucoseValue((BloodGlucose) objectToTest, diagnostician, map);
			}

		};

		validateBloodGlucoseValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BloodGlucoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BloodGlucose> {
		public BloodGlucose create() {
			return EmspcrFactory.eINSTANCE.createBloodGlucose();
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
	private static class ConstructorTestClass extends BloodGlucoseOperations {
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

} // BloodGlucoseOperations
