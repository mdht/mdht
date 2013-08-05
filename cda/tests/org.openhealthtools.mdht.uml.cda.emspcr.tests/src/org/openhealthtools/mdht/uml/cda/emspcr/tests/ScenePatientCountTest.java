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
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ScenePatientCountOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Patient Count</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount#validateScenePatientCountMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Patient Count Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ScenePatientCountTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScenePatientCountTemplateId() {
		OperationsTestCase<ScenePatientCount> validateScenePatientCountTemplateIdTestCase = new OperationsTestCase<ScenePatientCount>(
			"validateScenePatientCountTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_PATIENT_COUNT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScenePatientCount target) {

			}

			@Override
			protected void updateToPass(ScenePatientCount target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScenePatientCountOperations.validateScenePatientCountTemplateId(
					(ScenePatientCount) objectToTest, diagnostician, map);
			}

		};

		validateScenePatientCountTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScenePatientCountCodeP() {
		OperationsTestCase<ScenePatientCount> validateScenePatientCountCodePTestCase = new OperationsTestCase<ScenePatientCount>(
			"validateScenePatientCountCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_PATIENT_COUNT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScenePatientCount target) {

			}

			@Override
			protected void updateToPass(ScenePatientCount target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScenePatientCountOperations.validateScenePatientCountCodeP(
					(ScenePatientCount) objectToTest, diagnostician, map);
			}

		};

		validateScenePatientCountCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScenePatientCountCode() {
		OperationsTestCase<ScenePatientCount> validateScenePatientCountCodeTestCase = new OperationsTestCase<ScenePatientCount>(
			"validateScenePatientCountCode",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_PATIENT_COUNT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScenePatientCount target) {

			}

			@Override
			protected void updateToPass(ScenePatientCount target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScenePatientCountOperations.validateScenePatientCountCode(
					(ScenePatientCount) objectToTest, diagnostician, map);
			}

		};

		validateScenePatientCountCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScenePatientCountValue() {
		OperationsTestCase<ScenePatientCount> validateScenePatientCountValueTestCase = new OperationsTestCase<ScenePatientCount>(
			"validateScenePatientCountValue",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_PATIENT_COUNT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScenePatientCount target) {

			}

			@Override
			protected void updateToPass(ScenePatientCount target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScenePatientCountOperations.validateScenePatientCountValue(
					(ScenePatientCount) objectToTest, diagnostician, map);
			}

		};

		validateScenePatientCountValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScenePatientCountMoodCode() {
		OperationsTestCase<ScenePatientCount> validateScenePatientCountMoodCodeTestCase = new OperationsTestCase<ScenePatientCount>(
			"validateScenePatientCountMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_PATIENT_COUNT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ScenePatientCount target) {

			}

			@Override
			protected void updateToPass(ScenePatientCount target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ScenePatientCountOperations.validateScenePatientCountMoodCode(
					(ScenePatientCount) objectToTest, diagnostician, map);
			}

		};

		validateScenePatientCountMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ScenePatientCountOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ScenePatientCount> {
		public ScenePatientCount create() {
			return EmspcrFactory.eINSTANCE.createScenePatientCount();
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
	private static class ConstructorTestClass extends ScenePatientCountOperations {
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

} // ScenePatientCountOperations
