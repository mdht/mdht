/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationSupplyOrderOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Supply Order</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderInstructionInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Instruction Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder#validateMedicationSupplyOrderContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Supply Order Contains Medication Or Immunization</em>}</li>
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
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderInstructionInversionInd() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderInstructionInversionIndTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderInstructionInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_INSTRUCTION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();

				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(MedicationSupplyOrder target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				er.setAct(ConsolFactory.eINSTANCE.createInstructions().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderInstructionInversionInd(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderInstructionInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderEffectiveTimeHigh() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderEffectiveTimeHighTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {
				target.init();
				IVL_TS e = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(e);
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				target.getEffectiveTimes().clear();

				IVL_TS e = DatatypesFactory.eINSTANCE.createIVL_TS();
				e.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.getEffectiveTimes().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderEffectiveTimeHigh(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationSupplyOrderContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {
				target.init();
				Product prod = CDAFactory.eINSTANCE.createProduct();
				target.setProduct(prod);

			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {
				Product prod = CDAFactory.eINSTANCE.createProduct();
				prod.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation().init());
				target.setProduct(prod);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationSupplyOrderOperations.validateMedicationSupplyOrderContainsMedicationOrImmunization(
					(MedicationSupplyOrder) objectToTest, diagnostician, map);
			}

		};

		validateMedicationSupplyOrderContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

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
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationSupplyOrderClassCode() {
		OperationsTestCase<MedicationSupplyOrder> validateMedicationSupplyOrderClassCodeTestCase = new OperationsTestCase<MedicationSupplyOrder>(
			"validateMedicationSupplyOrderClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_SUPPLY_ORDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationSupplyOrder target) {
				target.setClassCode(ActClassSupply.DIET);
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
				target.init();
				target.getEffectiveTimes().clear();
			}

			@Override
			protected void updateToPass(MedicationSupplyOrder target) {

				IVL_TS e = DatatypesFactory.eINSTANCE.createIVL_TS();
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
	* @generated not
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
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
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
