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
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.FirstUnitOnSceneOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>First Unit On Scene</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene#validateFirstUnitOnSceneMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit On Scene Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FirstUnitOnSceneTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitOnSceneTemplateId() {
		OperationsTestCase<FirstUnitOnScene> validateFirstUnitOnSceneTemplateIdTestCase = new OperationsTestCase<FirstUnitOnScene>(
			"validateFirstUnitOnSceneTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_ON_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitOnScene target) {

			}

			@Override
			protected void updateToPass(FirstUnitOnScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitOnSceneOperations.validateFirstUnitOnSceneTemplateId(
					(FirstUnitOnScene) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitOnSceneTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitOnSceneCodeP() {
		OperationsTestCase<FirstUnitOnScene> validateFirstUnitOnSceneCodePTestCase = new OperationsTestCase<FirstUnitOnScene>(
			"validateFirstUnitOnSceneCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_ON_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitOnScene target) {

			}

			@Override
			protected void updateToPass(FirstUnitOnScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitOnSceneOperations.validateFirstUnitOnSceneCodeP(
					(FirstUnitOnScene) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitOnSceneCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitOnSceneCode() {
		OperationsTestCase<FirstUnitOnScene> validateFirstUnitOnSceneCodeTestCase = new OperationsTestCase<FirstUnitOnScene>(
			"validateFirstUnitOnSceneCode",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_ON_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitOnScene target) {

			}

			@Override
			protected void updateToPass(FirstUnitOnScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitOnSceneOperations.validateFirstUnitOnSceneCode(
					(FirstUnitOnScene) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitOnSceneCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitOnSceneValue() {
		OperationsTestCase<FirstUnitOnScene> validateFirstUnitOnSceneValueTestCase = new OperationsTestCase<FirstUnitOnScene>(
			"validateFirstUnitOnSceneValue",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_ON_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitOnScene target) {

			}

			@Override
			protected void updateToPass(FirstUnitOnScene target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitOnSceneOperations.validateFirstUnitOnSceneValue(
					(FirstUnitOnScene) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitOnSceneValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitOnSceneMoodCode() {
		OperationsTestCase<FirstUnitOnScene> validateFirstUnitOnSceneMoodCodeTestCase = new OperationsTestCase<FirstUnitOnScene>(
			"validateFirstUnitOnSceneMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_ON_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitOnScene target) {

			}

			@Override
			protected void updateToPass(FirstUnitOnScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitOnSceneOperations.validateFirstUnitOnSceneMoodCode(
					(FirstUnitOnScene) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitOnSceneMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FirstUnitOnSceneOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FirstUnitOnScene> {
		public FirstUnitOnScene create() {
			return EmspcrFactory.eINSTANCE.createFirstUnitOnScene();
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
	private static class ConstructorTestClass extends FirstUnitOnSceneOperations {
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

} // FirstUnitOnSceneOperations
