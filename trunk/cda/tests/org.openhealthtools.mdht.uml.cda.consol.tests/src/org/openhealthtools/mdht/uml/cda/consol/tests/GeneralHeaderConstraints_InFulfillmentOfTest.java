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
import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraints_InFulfillmentOfOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>General Header Constraints In Fulfillment Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints_InFulfillmentOf#validateInFulfillmentOfOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate In Fulfillment Of Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraints_InFulfillmentOfTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInFulfillmentOfOrder() {
		OperationsTestCase<GeneralHeaderConstraints_InFulfillmentOf> validateInFulfillmentOfOrderTestCase = new OperationsTestCase<GeneralHeaderConstraints_InFulfillmentOf>(
			"validateInFulfillmentOfOrder",
			operationsForOCL.getOCLValue("VALIDATE_IN_FULFILLMENT_OF_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints_InFulfillmentOf target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints_InFulfillmentOf target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraints_InFulfillmentOfOperations.validateInFulfillmentOfOrder(
					(GeneralHeaderConstraints_InFulfillmentOf) objectToTest, diagnostician, map);
			}

		};

		validateInFulfillmentOfOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GeneralHeaderConstraints_InFulfillmentOfOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GeneralHeaderConstraints_InFulfillmentOf> {
		public GeneralHeaderConstraints_InFulfillmentOf create() {
			return ConsolFactory.eINSTANCE.createGeneralHeaderConstraints_InFulfillmentOf();
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
	private static class ConstructorTestClass extends GeneralHeaderConstraints_InFulfillmentOfOperations {
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

} // GeneralHeaderConstraints_InFulfillmentOfOperations
