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

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.SceneSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionFirstUnitIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionFirstUnitOnScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionScenePatientCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionMassCasualtyIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionLocationTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Location Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getFirstUnitIndicator() <em>Get First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getFirstUnitOnScene() <em>Get First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getScenePatientCount() <em>Get Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getMassCasualtyIndicator() <em>Get Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getLocationTypeObservation() <em>Get Location Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SceneSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionTemplateId() {
		OperationsTestCase<SceneSection> validateSceneSectionTemplateIdTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionTemplateId(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionCode() {
		OperationsTestCase<SceneSection> validateSceneSectionCodeTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionCode((SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionTitle() {
		OperationsTestCase<SceneSection> validateSceneSectionTitleTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionTitle((SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionText() {
		OperationsTestCase<SceneSection> validateSceneSectionTextTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionText",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionText((SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionFirstUnitIndicator() {
		OperationsTestCase<SceneSection> validateSceneSectionFirstUnitIndicatorTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionFirstUnitIndicator",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionFirstUnitIndicator(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionFirstUnitIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionFirstUnitOnScene() {
		OperationsTestCase<SceneSection> validateSceneSectionFirstUnitOnSceneTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionFirstUnitOnScene",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionFirstUnitOnScene(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionFirstUnitOnSceneTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionScenePatientCount() {
		OperationsTestCase<SceneSection> validateSceneSectionScenePatientCountTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionScenePatientCount",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionScenePatientCount(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionScenePatientCountTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionMassCasualtyIndicator() {
		OperationsTestCase<SceneSection> validateSceneSectionMassCasualtyIndicatorTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionMassCasualtyIndicator",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionMassCasualtyIndicator(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionMassCasualtyIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSceneSectionLocationTypeObservation() {
		OperationsTestCase<SceneSection> validateSceneSectionLocationTypeObservationTestCase = new OperationsTestCase<SceneSection>(
			"validateSceneSectionLocationTypeObservation",
			operationsForOCL.getOCLValue("VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SceneSection target) {

			}

			@Override
			protected void updateToPass(SceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SceneSectionOperations.validateSceneSectionLocationTypeObservation(
					(SceneSection) objectToTest, diagnostician, map);
			}

		};

		validateSceneSectionLocationTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFirstUnitIndicator() {

		SceneSection target = objectFactory.create();
		target.getFirstUnitIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFirstUnitOnScene() {

		SceneSection target = objectFactory.create();
		target.getFirstUnitOnScene();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetScenePatientCount() {

		SceneSection target = objectFactory.create();
		target.getScenePatientCount();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMassCasualtyIndicator() {

		SceneSection target = objectFactory.create();
		target.getMassCasualtyIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLocationTypeObservation() {

		SceneSection target = objectFactory.create();
		target.getLocationTypeObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SceneSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SceneSection> {
		public SceneSection create() {
			return EmspcrFactory.eINSTANCE.createSceneSection();
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
	private static class ConstructorTestClass extends SceneSectionOperations {
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

} // SceneSectionOperations
