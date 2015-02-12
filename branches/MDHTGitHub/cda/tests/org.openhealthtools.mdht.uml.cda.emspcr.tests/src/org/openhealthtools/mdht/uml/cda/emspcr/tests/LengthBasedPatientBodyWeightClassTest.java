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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LengthBasedPatientBodyWeightClassOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Length Based Patient Body Weight Class</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass#validateLengthBasedPatientBodyWeightClassValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Length Based Patient Body Weight Class Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LengthBasedPatientBodyWeightClassTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassTemplateId() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassTemplateIdTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassTemplateId(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassMoodCode() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassMoodCodeTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassMoodCode(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassCodeP() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassCodePTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassCodeP(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassCode() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassCodeTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassCode",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

			}

			@Override
			protected void setDependency(LengthBasedPatientBodyWeightClass target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClassCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassCode(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassEffectiveTime() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassEffectiveTimeTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassEffectiveTime(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLengthBasedPatientBodyWeightClassValue() {
		OperationsTestCase<LengthBasedPatientBodyWeightClass> validateLengthBasedPatientBodyWeightClassValueTestCase = new OperationsTestCase<LengthBasedPatientBodyWeightClass>(
			"validateLengthBasedPatientBodyWeightClassValue",
			operationsForOCL.getOCLValue("VALIDATE_LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LengthBasedPatientBodyWeightClass target) {

			}

			@Override
			protected void updateToPass(LengthBasedPatientBodyWeightClass target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassValue(
					(LengthBasedPatientBodyWeightClass) objectToTest, diagnostician, map);
			}

		};

		validateLengthBasedPatientBodyWeightClassValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LengthBasedPatientBodyWeightClassOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LengthBasedPatientBodyWeightClass> {
		public LengthBasedPatientBodyWeightClass create() {
			return EmspcrFactory.eINSTANCE.createLengthBasedPatientBodyWeightClass();
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
	private static class ConstructorTestClass extends LengthBasedPatientBodyWeightClassOperations {
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

} // LengthBasedPatientBodyWeightClassOperations
