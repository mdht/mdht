/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.operations.HighestPressureUlcerStageOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Highest Pressure Ulcer Stage</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage#validateHighestPressureUlcerStageValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Highest Pressure Ulcer Stage Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HighestPressureUlcerStageTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageTemplateId() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageTemplateIdTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageTemplateId(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageClassCode() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageClassCodeTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageClassCode(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageMoodCode() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageMoodCodeTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageMoodCode(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHighestPressureUlcerStageId() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageIdTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageId",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageId(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageCodeP() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageCodePTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageCodeP(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageCode() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageCodeTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageCode",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

			}

			@Override
			protected void setDependency(HighestPressureUlcerStage target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStageCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageCode(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHighestPressureUlcerStageValue() {
		OperationsTestCase<HighestPressureUlcerStage> validateHighestPressureUlcerStageValueTestCase = new OperationsTestCase<HighestPressureUlcerStage>(
			"validateHighestPressureUlcerStageValue",
			operationsForOCL.getOCLValue("VALIDATE_HIGHEST_PRESSURE_ULCER_STAGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HighestPressureUlcerStage target) {

			}

			@Override
			protected void updateToPass(HighestPressureUlcerStage target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HighestPressureUlcerStageOperations.validateHighestPressureUlcerStageValue(
					(HighestPressureUlcerStage) objectToTest, diagnostician, map);
			}

		};

		validateHighestPressureUlcerStageValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HighestPressureUlcerStageOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HighestPressureUlcerStage> {
		public HighestPressureUlcerStage create() {
			return ConsolFactory.eINSTANCE.createHighestPressureUlcerStage();
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
	private static class ConstructorTestClass extends HighestPressureUlcerStageOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // HighestPressureUlcerStageOperations
