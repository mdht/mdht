/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Supply Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#validateSupplyEntryRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Supply Entry Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry#getMedicationFullfillmentInstructions() <em>Get Medication Fullfillment Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SupplyEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSupplyEntryTemplateId() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryTemplateIdTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryTemplateId(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryQuantity() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryQuantityTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryQuantity",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				target.setQuantity(pq);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryQuantity((SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSupplyEntryRepeatNumber() {
		OperationsTestCase<SupplyEntry> validateSupplyEntryRepeatNumberTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SupplyEntryOperations.validateSupplyEntryRepeatNumber(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		validateSupplyEntryRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationFullfillmentInstructions() {

		SupplyEntry target = objectFactory.create();
		target.getMedicationFullfillmentInstructions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SupplyEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SupplyEntry> {

		public SupplyEntry create() {
			return IHEFactory.eINSTANCE.createSupplyEntry();
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
	private static class ConstructorTestClass extends SupplyEntryOperations {
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

} // SupplyEntryOperations
