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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.Product;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.MedicationSupplyOrder;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationDispenseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassSupply;
import org.openhealthtools.mdht.uml.hl7.vocab.PostalAddressUse;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Dispense</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseContainsMedicationOrImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Contains Medication Or Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispenseMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address US Realm Address Street</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address City</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Country</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Postal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address State</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Street Address Line</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity General Header Constraints US Realm Address Use</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#validateMedicationDispensePerformerMedicationDispenseAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dispense Performer Medication Dispense Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationDispense#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationDispenseTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseContainsMedicationOrImmunization() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseContainsMedicationOrImmunizationTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseContainsMedicationOrImmunization",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_CONTAINS_MEDICATION_OR_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Product prod = CDAFactory.eINSTANCE.createProduct();
				target.setProduct(prod);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				Product prod = CDAFactory.eINSTANCE.createProduct();
				prod.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation().init());
				target.setProduct(prod);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseContainsMedicationOrImmunization(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseContainsMedicationOrImmunizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationDispenseTemplateId() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseTemplateIdTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseTemplateId(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseClassCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseClassCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.setClassCode(ActClassSupply.DIET);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseClassCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseEffectiveTime() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseEffectiveTimeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				SXCM_TS e = DatatypesFactory.eINSTANCE.createSXCM_TS();
				target.getEffectiveTimes().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseEffectiveTime(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseId() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseIdTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseId(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDispenseMoodCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseMoodCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.setMoodCode(x_DocumentSubstanceMood.INT);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseMoodCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseRepeatNumber() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseRepeatNumberTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseRepeatNumber(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseStatusCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseStatusCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseStatusCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseQuantity() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseQuantityTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();
				target.setQuantity(DatatypesFactory.eINSTANCE.createPQ());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseQuantity(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformer() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformer(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispensePerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_US_REALM_ADDRESS_STREET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreet(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(MedicationDispense target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");
						ad.addStreetAddressLine("123");

						ae.getAddrs().add(ad);
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(MedicationDispense target) {
						target.init();
						Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						AD ad = DatatypesFactory.eINSTANCE.createAD();

						ae.getAddrs().add(ad);
						per.setAssignedEntity(ae);
						target.getPerformers().add(per);
					}
				});

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);

			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUSRealmAddressStreetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_CITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCity(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_COUNTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountry(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressCountryTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_POSTAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCode(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressPostalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressState(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_STREET_ADDRESS_LINE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLine(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressStreetAddressLineTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseP(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUsePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_GENERAL_HEADER_CONSTRAINTS_US_REALM_ADDRESS_USE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUse(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				ad.getUses().add(null);

				ae.getAddrs().add(ad);
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(createUSRealmAddress());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityGeneralHeaderConstraintsUSRealmAddressUseTestCase.doValidationTest();
	}

	/**
	*
	* @generated note
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddrTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				per.setAssignedEntity(ae);
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddr(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispensePerformerMedicationDispenseAssignedEntity() {
		OperationsTestCase<MedicationDispense> validateMedicationDispensePerformerMedicationDispenseAssignedEntityTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispensePerformerMedicationDispenseAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_PERFORMER_MEDICATION_DISPENSE_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.getPerformers().clear();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				per.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				target.getPerformers().add(per);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispensePerformerMedicationDispenseAssignedEntity(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispensePerformerMedicationDispenseAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationDispenseMedicationSupplyOrder() {
		OperationsTestCase<MedicationDispense> validateMedicationDispenseMedicationSupplyOrderTestCase = new OperationsTestCase<MedicationDispense>(
			"validateMedicationDispenseMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DISPENSE_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationDispense target) {

			}

			@Override
			protected void updateToPass(MedicationDispense target) {
				target.init();
				MedicationSupplyOrder supply = ConsolFactory.eINSTANCE.createMedicationSupplyOrder().init();

				target.addSupply(supply);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationDispenseOperations.validateMedicationDispenseMedicationSupplyOrder(
					(MedicationDispense) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDispenseMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSupplyOrder() {

		MedicationDispense target = objectFactory.create();
		target.getMedicationSupplyOrder();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationDispenseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationDispense> {
		public MedicationDispense create() {
			return ConsolFactory.eINSTANCE.createMedicationDispense();
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
	private static class ConstructorTestClass extends MedicationDispenseOperations {
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

	private AD createUSRealmAddress() {
		AD addr = DatatypesFactory.eINSTANCE.createAD();
		addr.getUses().add(PostalAddressUse.HP);
		addr.addStreetAddressLine("123 Main Street");
		addr.addCity("Boston");
		addr.addState("MA");
		addr.addCountry("US");
		addr.addPostalCode("01001");

		return addr;

	}

} // MedicationDispenseOperations
