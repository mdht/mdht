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
import org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.CarbonMonoxideOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Carbon Monoxide</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxide#validateCarbonMonoxideValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Carbon Monoxide Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CarbonMonoxideTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideTemplateId() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideTemplateIdTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideTemplateId(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideMoodCode() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideMoodCodeTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideMoodCode(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideCodeP() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideCodePTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideCodeP",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideCodeP(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideCode() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideCodeTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideCode",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

			}

			@Override
			protected void setDependency(CarbonMonoxide target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.CarbonMonoxideCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideCode(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideEffectiveTime() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideEffectiveTimeTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideEffectiveTime(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCarbonMonoxideValue() {
		OperationsTestCase<CarbonMonoxide> validateCarbonMonoxideValueTestCase = new OperationsTestCase<CarbonMonoxide>(
			"validateCarbonMonoxideValue",
			operationsForOCL.getOCLValue("VALIDATE_CARBON_MONOXIDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CarbonMonoxide target) {

			}

			@Override
			protected void updateToPass(CarbonMonoxide target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CarbonMonoxideOperations.validateCarbonMonoxideValue(
					(CarbonMonoxide) objectToTest, diagnostician, map);
			}

		};

		validateCarbonMonoxideValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CarbonMonoxideOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CarbonMonoxide> {
		public CarbonMonoxide create() {
			return EmspcrFactory.eINSTANCE.createCarbonMonoxide();
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
	private static class ConstructorTestClass extends CarbonMonoxideOperations {
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

} // CarbonMonoxideOperations
