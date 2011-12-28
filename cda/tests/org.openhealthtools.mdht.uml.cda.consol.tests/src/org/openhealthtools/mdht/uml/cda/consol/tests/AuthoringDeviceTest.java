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

import org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AuthoringDeviceOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authoring Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice#validateConsolAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthoringDevice#validateConsolAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Authoring Device Software Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AuthoringDeviceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAuthoringDeviceManufacturerModelName() {
		OperationsTestCase<AuthoringDevice> validateConsolAuthoringDeviceManufacturerModelNameTestCase = new OperationsTestCase<AuthoringDevice>(
			"validateConsolAuthoringDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthoringDevice target) {

			}

			@Override
			protected void updateToPass(AuthoringDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthoringDeviceOperations.validateConsolAuthoringDeviceManufacturerModelName(
					(AuthoringDevice) objectToTest, diagnostician, map);
			}

		};

		validateConsolAuthoringDeviceManufacturerModelNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolAuthoringDeviceSoftwareName() {
		OperationsTestCase<AuthoringDevice> validateConsolAuthoringDeviceSoftwareNameTestCase = new OperationsTestCase<AuthoringDevice>(
			"validateConsolAuthoringDeviceSoftwareName",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AuthoringDevice target) {

			}

			@Override
			protected void updateToPass(AuthoringDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AuthoringDeviceOperations.validateConsolAuthoringDeviceSoftwareName(
					(AuthoringDevice) objectToTest, diagnostician, map);
			}

		};

		validateConsolAuthoringDeviceSoftwareNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AuthoringDeviceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AuthoringDevice> {
		public AuthoringDevice create() {
			return ConsolFactory.eINSTANCE.createAuthoringDevice();
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
	private static class ConstructorTestClass extends AuthoringDeviceOperations {
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

} // AuthoringDeviceOperations
