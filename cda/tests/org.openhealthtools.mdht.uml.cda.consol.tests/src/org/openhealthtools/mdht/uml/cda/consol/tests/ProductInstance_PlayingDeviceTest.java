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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance_PlayingDevice;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstance_PlayingDeviceOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance Playing Device</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance_PlayingDevice#validatePlayingDeviceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Playing Device Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProductInstance_PlayingDeviceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlayingDeviceCode() {
		OperationsTestCase<ProductInstance_PlayingDevice> validatePlayingDeviceCodeTestCase = new OperationsTestCase<ProductInstance_PlayingDevice>(
			"validatePlayingDeviceCode",
			operationsForOCL.getOCLValue("VALIDATE_PLAYING_DEVICE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProductInstance_PlayingDevice target) {

			}

			@Override
			protected void updateToPass(ProductInstance_PlayingDevice target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstance_PlayingDeviceOperations.validatePlayingDeviceCode(
					(ProductInstance_PlayingDevice) objectToTest, diagnostician, map);
			}

		};

		validatePlayingDeviceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProductInstance_PlayingDeviceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProductInstance_PlayingDevice> {
		public ProductInstance_PlayingDevice create() {
			return ConsolFactory.eINSTANCE.createProductInstance_PlayingDevice();
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
	private static class ConstructorTestClass extends ProductInstance_PlayingDeviceOperations {
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

} // ProductInstance_PlayingDeviceOperations
