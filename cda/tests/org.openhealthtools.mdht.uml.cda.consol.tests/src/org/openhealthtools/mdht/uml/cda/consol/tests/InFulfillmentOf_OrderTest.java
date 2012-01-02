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
import org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order;

import org.openhealthtools.mdht.uml.cda.consol.operations.InFulfillmentOf_OrderOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>In Fulfillment Of Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InFulfillmentOf_Order#validateOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Order Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InFulfillmentOf_OrderTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOrderId() {
		OperationsTestCase<InFulfillmentOf_Order> validateOrderIdTestCase = new OperationsTestCase<InFulfillmentOf_Order>(
			"validateOrderId", operationsForOCL.getOCLValue("VALIDATE_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InFulfillmentOf_Order target) {

			}

			@Override
			protected void updateToPass(InFulfillmentOf_Order target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InFulfillmentOf_OrderOperations.validateOrderId(
					(InFulfillmentOf_Order) objectToTest, diagnostician, map);
			}

		};

		validateOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InFulfillmentOf_OrderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InFulfillmentOf_Order> {
		public InFulfillmentOf_Order create() {
			return ConsolFactory.eINSTANCE.createInFulfillmentOf_Order();
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
	private static class ConstructorTestClass extends InFulfillmentOf_OrderOperations {
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

} // InFulfillmentOf_OrderOperations
