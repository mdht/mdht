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
import org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ResponseOdometerReadingOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Odometer Reading Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Beginning Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response On Scene Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Destination Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Response Ending Odometer Reading Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ResponseOdometerReadingOrganizer#validateResponseOdometerReadingOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Odometer Reading Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResponseOdometerReadingOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship() {
		OperationsTestCase<ResponseOdometerReadingOrganizer> validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationshipTestCase = new OperationsTestCase<ResponseOdometerReadingOrganizer>(
			"validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_BEGINNING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOdometerReadingOrganizer target) {

			}

			@Override
			protected void updateToPass(ResponseOdometerReadingOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationship(
					(ResponseOdometerReadingOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResponseOdometerReadingOrganizerResponseBeginningOdometerReadingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship() {
		OperationsTestCase<ResponseOdometerReadingOrganizer> validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationshipTestCase = new OperationsTestCase<ResponseOdometerReadingOrganizer>(
			"validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ON_SCENE_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOdometerReadingOrganizer target) {

			}

			@Override
			protected void updateToPass(ResponseOdometerReadingOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationship(
					(ResponseOdometerReadingOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResponseOdometerReadingOrganizerResponseOnSceneOdometerReadingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship() {
		OperationsTestCase<ResponseOdometerReadingOrganizer> validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationshipTestCase = new OperationsTestCase<ResponseOdometerReadingOrganizer>(
			"validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_DESTINATION_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOdometerReadingOrganizer target) {

			}

			@Override
			protected void updateToPass(ResponseOdometerReadingOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationship(
					(ResponseOdometerReadingOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResponseOdometerReadingOrganizerResponseDestinationOdometerReadingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship() {
		OperationsTestCase<ResponseOdometerReadingOrganizer> validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationshipTestCase = new OperationsTestCase<ResponseOdometerReadingOrganizer>(
			"validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_RESPONSE_ENDING_ODOMETER_READING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOdometerReadingOrganizer target) {

			}

			@Override
			protected void updateToPass(ResponseOdometerReadingOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationship(
					(ResponseOdometerReadingOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResponseOdometerReadingOrganizerResponseEndingOdometerReadingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponseOdometerReadingOrganizerTemplateId() {
		OperationsTestCase<ResponseOdometerReadingOrganizer> validateResponseOdometerReadingOrganizerTemplateIdTestCase = new OperationsTestCase<ResponseOdometerReadingOrganizer>(
			"validateResponseOdometerReadingOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSE_ODOMETER_READING_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResponseOdometerReadingOrganizer target) {

			}

			@Override
			protected void updateToPass(ResponseOdometerReadingOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResponseOdometerReadingOrganizerOperations.validateResponseOdometerReadingOrganizerTemplateId(
					(ResponseOdometerReadingOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateResponseOdometerReadingOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResponseOdometerReadingOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResponseOdometerReadingOrganizer> {
		public ResponseOdometerReadingOrganizer create() {
			return EmspcrFactory.eINSTANCE.createResponseOdometerReadingOrganizer();
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
	private static class ConstructorTestClass extends ResponseOdometerReadingOrganizerOperations {
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

} // ResponseOdometerReadingOrganizerOperations
