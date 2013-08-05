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

import org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CarbonDioxideOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Carbon Dioxide</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonDioxide#validateCarbonDioxideMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Dioxide Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CarbonDioxideTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideTemplateId() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideTemplateIdTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideTemplateId(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideCodeP() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideCodePTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideCodeP(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideCode() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideCodeTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideCode",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideCode(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideValue() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideValueTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideValue",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideValue(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideEffectiveTime() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideEffectiveTimeTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideEffectiveTime(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonDioxideMoodCode() {
		OperationsTestCase<CarbonDioxide> validateCarbonDioxideMoodCodeTestCase = new OperationsTestCase<CarbonDioxide>(
			"validateCarbonDioxideMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_DIOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonDioxide target) {

			}

			@Override
			protected void updateToPass(CarbonDioxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonDioxideOperations.validateCarbonDioxideMoodCode(
					(CarbonDioxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonDioxideMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CarbonDioxideOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CarbonDioxide> {
		public CarbonDioxide create() {
			return EmspcrFactory.eINSTANCE.createCarbonDioxide();
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
	private static class ConstructorTestClass extends CarbonDioxideOperations {
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

} // CarbonDioxideOperations
