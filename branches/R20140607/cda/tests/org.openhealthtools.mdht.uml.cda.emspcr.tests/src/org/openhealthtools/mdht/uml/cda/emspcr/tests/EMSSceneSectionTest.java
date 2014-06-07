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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSceneSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Scene Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionFirstUnitIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionFirstUnitOnScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionScenePatientCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionMassCasualtyIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionLocationTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Location Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getFirstUnitIndicator() <em>Get First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getFirstUnitOnScene() <em>Get First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getScenePatientCount() <em>Get Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getMassCasualtyIndicator() <em>Get Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#getLocationTypeObservation() <em>Get Location Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSSceneSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionTemplateId() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTemplateIdTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionTemplateId(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionCode() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionCodeTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionCode(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionTitle() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTitleTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionTitle(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionText() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTextTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionText(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionFirstUnitIndicator() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionFirstUnitIndicatorTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionFirstUnitIndicator",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionFirstUnitIndicator(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionFirstUnitIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionFirstUnitOnScene() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionFirstUnitOnSceneTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionFirstUnitOnScene",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionFirstUnitOnScene(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionFirstUnitOnSceneTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionScenePatientCount() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionScenePatientCountTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionScenePatientCount",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionScenePatientCount(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionScenePatientCountTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionMassCasualtyIndicator() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionMassCasualtyIndicatorTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionMassCasualtyIndicator",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionMassCasualtyIndicator(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionMassCasualtyIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionLocationTypeObservation() {
		OperationsTestCase<EMSSceneSection> validateEMSSceneSectionLocationTypeObservationTestCase = new OperationsTestCase<EMSSceneSection>(
			"validateEMSSceneSectionLocationTypeObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSSceneSection target) {

			}

			@Override
			protected void updateToPass(EMSSceneSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSSceneSectionOperations.validateEMSSceneSectionLocationTypeObservation(
					(EMSSceneSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSSceneSectionLocationTypeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFirstUnitIndicator() {

		EMSSceneSection target = objectFactory.create();
		target.getFirstUnitIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFirstUnitOnScene() {

		EMSSceneSection target = objectFactory.create();
		target.getFirstUnitOnScene();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetScenePatientCount() {

		EMSSceneSection target = objectFactory.create();
		target.getScenePatientCount();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMassCasualtyIndicator() {

		EMSSceneSection target = objectFactory.create();
		target.getMassCasualtyIndicator();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLocationTypeObservation() {

		EMSSceneSection target = objectFactory.create();
		target.getLocationTypeObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSSceneSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSSceneSection> {
		public EMSSceneSection create() {
			return EmspcrFactory.eINSTANCE.createEMSSceneSection();
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
	private static class ConstructorTestClass extends EMSSceneSectionOperations {
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

} // EMSSceneSectionOperations
