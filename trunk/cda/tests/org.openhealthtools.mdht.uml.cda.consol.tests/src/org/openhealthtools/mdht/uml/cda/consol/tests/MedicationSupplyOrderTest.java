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
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrderOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#getInstructions() <em>Get Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationSupplyOrderTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderTemplateId() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderTemplateIdTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderTemplateId(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderClassCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderClassCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderClassCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderEffectiveTime() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderEffectiveTimeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				SXCM_TS e = DatatypesFactory.eINSTANCE.createSXCM_TS();
				target.getEffectiveTimes().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTime(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderMoodCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderMoodCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderMoodCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderQuantity() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderQuantityTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				PQ value = DatatypesFactory.eINSTANCE.createPQ();
				target.setQuantity(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderQuantity(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrderRepeatNumber() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderRepeatNumberTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderRepeatNumber(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderStatusCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderStatusCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderStatusCode(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderId() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderIdTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderId(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationSupplyOrderAuthor() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderAuthorTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderAuthor",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderAuthor(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderInstructions() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderInstructionsTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderInstructions",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.init();
				Instructions instructions = ConsolFactory.eINSTANCE.createInstructions().init();
				target.addAct(instructions);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructions(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		MedicationSupplyOrder target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationSupplyOrderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationSupplyOrder> {
		public MedicationSupplyOrder create() {
			return ConsolFactory.eINSTANCE.createMedicationSupplyOrder();
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
	private static class ConstructorTestClass extends MedicationSupplyOrderOperations {
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

} // MedicationSupplyOrderOperations
