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

import org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedAuthor_AuthoringDeviceOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Author Authoring Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice#validateAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedAuthor_AuthoringDevice#validateAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authoring Device Software Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedAuthor_AuthoringDeviceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthoringDeviceManufacturerModelName() {
		OperationsTestCase<AssignedAuthor_AuthoringDevice> validateAuthoringDeviceManufacturerModelNameTestCase = new OperationsTestCase<AssignedAuthor_AuthoringDevice>(
			"validateAuthoringDeviceManufacturerModelName",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor_AuthoringDevice target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor_AuthoringDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthor_AuthoringDeviceOperations.validateAuthoringDeviceManufacturerModelName(
					(AssignedAuthor_AuthoringDevice) objectToTest, diagnostician, map);
			}

		};

		validateAuthoringDeviceManufacturerModelNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthoringDeviceSoftwareName() {
		OperationsTestCase<AssignedAuthor_AuthoringDevice> validateAuthoringDeviceSoftwareNameTestCase = new OperationsTestCase<AssignedAuthor_AuthoringDevice>(
			"validateAuthoringDeviceSoftwareName",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedAuthor_AuthoringDevice target) {

			}

			@Override
			protected void updateToPass(AssignedAuthor_AuthoringDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedAuthor_AuthoringDeviceOperations.validateAuthoringDeviceSoftwareName(
					(AssignedAuthor_AuthoringDevice) objectToTest, diagnostician, map);
			}

		};

		validateAuthoringDeviceSoftwareNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedAuthor_AuthoringDeviceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedAuthor_AuthoringDevice> {
		public AssignedAuthor_AuthoringDevice create() {
			return ConsolFactory.eINSTANCE.createAssignedAuthor_AuthoringDevice();
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
	private static class ConstructorTestClass extends AssignedAuthor_AuthoringDeviceOperations {
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

} // AssignedAuthor_AuthoringDeviceOperations
