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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseModeToSceneOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Mode To Scene</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToScene#validateResponseModeToSceneValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Mode To Scene Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseModeToSceneTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneTemplateId() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneTemplateIdTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneTemplateId(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneMoodCode() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneMoodCodeTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneMoodCode(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneCodeP() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneCodePTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneCodeP(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneCode() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneCodeTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

			}

			@Override
			protected void setDependency(ResponseModeToScene target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ResponseModeToSceneCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneCode(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneValue() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneValueTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneValue",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneValue(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseModeToSceneValueP() {
		OperationsTestCase<ResponseModeToScene> validateResponseModeToSceneValuePTestCase = new OperationsTestCase<ResponseModeToScene>(
			"validateResponseModeToSceneValueP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_MODE_TO_SCENE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseModeToScene target) {

			}

			@Override
			protected void updateToPass(ResponseModeToScene target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseModeToSceneOperations.validateResponseModeToSceneValueP(
					(ResponseModeToScene) objectToTest, diagnostician, map);
			}

		};

		validateResponseModeToSceneValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseModeToSceneOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseModeToScene> {
		public ResponseModeToScene create() {
			return EmspcrFactory.eINSTANCE.createResponseModeToScene();
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
	private static class ConstructorTestClass extends ResponseModeToSceneOperations {
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

} // ResponseModeToSceneOperations
