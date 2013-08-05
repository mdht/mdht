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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionDelayOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionDispatchLocationOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionResponseOdometerReadingOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#validateResponseSectionResponseModeToScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Section Response Mode To Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getDelayOrganizer() <em>Get Delay Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getDispatchLocationOrganizer() <em>Get Dispatch Location Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getResponseOdometerReadingOrganizer() <em>Get Response Odometer Reading Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseSection#getResponseModeToScene() <em>Get Response Mode To Scene</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionTemplateId() {
		OperationsTestCase<ResponseSection> validateResponseSectionTemplateIdTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionTemplateId(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionCode() {
		OperationsTestCase<ResponseSection> validateResponseSectionCodeTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionCode(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionCodeP() {
		OperationsTestCase<ResponseSection> validateResponseSectionCodePTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionCodeP(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionTitle() {
		OperationsTestCase<ResponseSection> validateResponseSectionTitleTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionTitle(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionText() {
		OperationsTestCase<ResponseSection> validateResponseSectionTextTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionText",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionText(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionDelayOrganizer() {
		OperationsTestCase<ResponseSection> validateResponseSectionDelayOrganizerTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionDelayOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_DELAY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionDelayOrganizer(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionDelayOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionDispatchLocationOrganizer() {
		OperationsTestCase<ResponseSection> validateResponseSectionDispatchLocationOrganizerTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionDispatchLocationOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_DISPATCH_LOCATION_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionDispatchLocationOrganizer(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionDispatchLocationOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionResponseOdometerReadingOrganizer() {
		OperationsTestCase<ResponseSection> validateResponseSectionResponseOdometerReadingOrganizerTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionResponseOdometerReadingOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_RESPONSE_ODOMETER_READING_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionResponseOdometerReadingOrganizer(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionResponseOdometerReadingOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseSectionResponseModeToScene() {
		OperationsTestCase<ResponseSection> validateResponseSectionResponseModeToSceneTestCase = new OperationsTestCase<ResponseSection>(
			"validateResponseSectionResponseModeToScene",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_SECTION_RESPONSE_MODE_TO_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseSection target) {

			}

			@Override
			protected void updateToPass(ResponseSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseSectionOperations.validateResponseSectionResponseModeToScene(
					(ResponseSection) objectToTest, diagnostician, map);
			}

		};

		validateResponseSectionResponseModeToSceneTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDelayOrganizer() {

		ResponseSection target = objectFactory.create();
		target.getDelayOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDispatchLocationOrganizer() {

		ResponseSection target = objectFactory.create();
		target.getDispatchLocationOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResponseOdometerReadingOrganizer() {

		ResponseSection target = objectFactory.create();
		target.getResponseOdometerReadingOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetResponseModeToScene() {

		ResponseSection target = objectFactory.create();
		target.getResponseModeToScene();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseSection> {
		public ResponseSection create() {
			return EmspcrFactory.eINSTANCE.createResponseSection();
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
	private static class ConstructorTestClass extends ResponseSectionOperations {
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

} // ResponseSectionOperations
