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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationHasPlayingEntityClassCodeName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Has Playing Entity Class Code Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceDeliveryLocation#validateServiceDeliveryLocationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Service Delivery Location Telecom</em>}</li>
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
	public void testValidateServiceDeliveryLocationHasPlayingEntityClassCode() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityClassCodeTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityClassCode(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationHasPlayingEntityClassCodeName() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationHasPlayingEntityClassCodeNameTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationHasPlayingEntityClassCodeName",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_HAS_PLAYING_ENTITY_CLASS_CODE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationHasPlayingEntityClassCodeName(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationHasPlayingEntityClassCodeNameTestCase.doValidationTest();
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
	public void testValidateServiceDeliveryLocationAddr() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationAddrTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationAddr",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationAddr(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateServiceDeliveryLocationTelecom() {
		OperationsTestCase<ServiceDeliveryLocation> validateServiceDeliveryLocationTelecomTestCase = new OperationsTestCase<ServiceDeliveryLocation>(
			"validateServiceDeliveryLocationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_SERVICE_DELIVERY_LOCATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ServiceDeliveryLocationOperations.validateServiceDeliveryLocationTelecom(
					(ServiceDeliveryLocation) objectToTest, diagnostician, map);
			}

		};

		validateServiceDeliveryLocationTelecomTestCase.doValidationTest();
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
