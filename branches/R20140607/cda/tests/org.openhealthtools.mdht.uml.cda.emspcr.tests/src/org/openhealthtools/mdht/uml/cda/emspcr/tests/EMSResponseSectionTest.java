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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSResponseSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionDelayOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionDispatchLocationOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionResponseOdometerReadingOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionResponseModeToScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Response Mode To Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getDelayOrganizer() <em>Get Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getDispatchLocationOrganizer() <em>Get Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getResponseOdometerReadingOrganizer() <em>Get Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#getResponseModeToScene() <em>Get Response Mode To Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSResponseSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionTemplateId() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTemplateIdTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionTemplateId(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionCode() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionCodeTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionCode(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionCodeP() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionCodePTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionCodeP(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionTitle() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTitleTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionTitle(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionText() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTextTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionText(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionDelayOrganizer() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionDelayOrganizerTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionDelayOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionDelayOrganizer(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionDelayOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionDispatchLocationOrganizer() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionDispatchLocationOrganizerTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionDispatchLocationOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionDispatchLocationOrganizer(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionDispatchLocationOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionResponseOdometerReadingOrganizer() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionResponseOdometerReadingOrganizerTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionResponseOdometerReadingOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionResponseOdometerReadingOrganizer(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionResponseOdometerReadingOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionResponseModeToScene() {
		OperationsTestCase<EMSResponseSection> validateEMSResponseSectionResponseModeToSceneTestCase = new OperationsTestCase<EMSResponseSection>(
			"validateEMSResponseSectionResponseModeToScene",
			operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSResponseSection target) {

			}

			@Override
			protected void updateToPass(EMSResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSResponseSectionOperations.validateEMSResponseSectionResponseModeToScene(
					(EMSResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSResponseSectionResponseModeToSceneTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDelayOrganizer() {

		EMSResponseSection target = objectFactory.create();
		target.getDelayOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDispatchLocationOrganizer() {

		EMSResponseSection target = objectFactory.create();
		target.getDispatchLocationOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResponseOdometerReadingOrganizer() {

		EMSResponseSection target = objectFactory.create();
		target.getResponseOdometerReadingOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResponseModeToScene() {

		EMSResponseSection target = objectFactory.create();
		target.getResponseModeToScene();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSResponseSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSResponseSection> {
		public EMSResponseSection create() {
			return EmspcrFactory.eINSTANCE.createEMSResponseSection();
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
	private static class ConstructorTestClass extends EMSResponseSectionOperations {
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

} // EMSResponseSectionOperations
