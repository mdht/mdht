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
import org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.SceneDelayOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneDelay#validateSceneDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Delay Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SceneDelayTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayTemplateId() {
		OperationsTestCase<SceneDelay> validateSceneDelayTemplateIdTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayTemplateId((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayMoodCode() {
		OperationsTestCase<SceneDelay> validateSceneDelayMoodCodeTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayMoodCode((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayCodeP() {
		OperationsTestCase<SceneDelay> validateSceneDelayCodePTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayCodeP((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayCode() {
		OperationsTestCase<SceneDelay> validateSceneDelayCodeTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayCode",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

			}

			@Override
			protected void setDependency(SceneDelay target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.SceneDelayCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayCode((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayValue() {
		OperationsTestCase<SceneDelay> validateSceneDelayValueTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayValue",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayValue((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneDelayValueP() {
		OperationsTestCase<SceneDelay> validateSceneDelayValuePTestCase = new OperationsTestCase<SceneDelay>(
			"validateSceneDelayValueP",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneDelay target) {

			}

			@Override
			protected void updateToPass(SceneDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneDelayOperations.validateSceneDelayValueP((SceneDelay) objectToTest, diagnostician, map);
			}

		};

		validateSceneDelayValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SceneDelayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SceneDelay> {
		public SceneDelay create() {
			return EmspcrFactory.eINSTANCE.createSceneDelay();
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
	private static class ConstructorTestClass extends SceneDelayOperations {
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

} // SceneDelayOperations
