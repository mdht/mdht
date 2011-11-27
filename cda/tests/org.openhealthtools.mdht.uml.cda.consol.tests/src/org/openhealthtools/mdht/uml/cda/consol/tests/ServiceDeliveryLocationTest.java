/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceDeliveryLocationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Delivery Location</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasParticipantRoleLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Participant Role Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasParticipantRoleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Participant Role Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasParticipantRoleCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Participant Role Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityPlace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Place</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ServiceDeliveryLocationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasParticipantRole() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasParticipantRoleTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRole(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasParticipantRoleLocation() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasParticipantRoleLocationTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasParticipantRoleLocation",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PARTICIPANT_ROLE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleLocation(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasParticipantRoleLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasParticipantRoleCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasParticipantRoleCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasParticipantRoleCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PARTICIPANT_ROLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasParticipantRoleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasParticipantRoleCodeVocab() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasParticipantRoleCodeVocabTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasParticipantRoleCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PARTICIPANT_ROLE_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasParticipantRoleCodeVocab(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasParticipantRoleCodeVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntity() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntity(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntityPlace() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityPlaceTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntityPlace",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_PLACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityPlace(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityPlaceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationTemplateId() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationTemplateIdTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTemplateId(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationTypeCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationTypeCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceDeliveryLocation target) {

			}

			@Override
			protected void updateToPass(ServiceDeliveryLocation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTypeCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ServiceDeliveryLocationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ServiceDeliveryLocation> {
		public ServiceDeliveryLocation create() {
			return ConsolFactory.eINSTANCE.createServiceDeliveryLocation();
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
	private static class ConstructorTestClass extends ServiceDeliveryLocationOperations {
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

} // ServiceDeliveryLocationOperations
