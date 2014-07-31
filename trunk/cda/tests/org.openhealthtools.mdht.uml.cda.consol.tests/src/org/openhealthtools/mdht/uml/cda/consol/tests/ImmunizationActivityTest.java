/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/

package org.openhealthtools.mdht.uml.cda.consol.tests;

import static org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood.EVN;
import static org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood.INT;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationDispense;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClass;
import org.openhealthtools.mdht.uml.hl7.vocab.ActRelationshipType;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentSubstanceMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDoseQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Dose Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructionInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instruction Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicleTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPreconditionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityAdministrationUnitCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityDrugVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationDispense(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPrecondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Precondition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityImmunizationRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityConsumable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityMedicationSupplyOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Medication Supply Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#validateImmunizationActivityConsumableImmunizationMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Activity Consumable Immunization Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getDrugVehicle() <em>Get Drug Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getIndication() <em>Get Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationDispense() <em>Get Medication Dispense</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getReactionObservation() <em>Get Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getImmunizationRefusalReason() <em>Get Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity#getMedicationSupplyOrder() <em>Get Medication Supply Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityTextReference() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextReferenceTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTextReference(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityReferenceValue() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityReferenceValueTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityReferenceValue(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityTextReferenceValue() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextReferenceValueTestCase = new NarrativeReferenceTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"Not a particularly severe reaction.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "Not a particularly severe reaction.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTextReferenceValue(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityDoseQuantityUnit() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDoseQuantityUnitTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDoseQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				IVL_PQ dq = DatatypesFactory.eINSTANCE.createIVL_PQ();
				dq.setUnit(null);
				target.setDoseQuantity(dq);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {

				IVL_PQ dq = DatatypesFactory.eINSTANCE.createIVL_PQ();
				dq.setUnit("test");
				target.setDoseQuantity(dq);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantityUnit(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDoseQuantityUnitTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityInstructionInversion() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInstructionInversionTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInstructionInversion",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createInstructions().init());
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ImmunizationActivity target) {
						// Test case with entry Relationship , but no Instruction Act
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(ConsolFactory.eINSTANCE.createInstructions());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInstructionInversion(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicleTypeCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDrugVehicleTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDrugVehicleTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle());
				target.getParticipants().add(p);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.getParticipants().clear();
				Participant2 p = CDAFactory.eINSTANCE.createParticipant2();
				p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle());
				p.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(p);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicleTypeCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityPreconditionTypeCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPreconditionTypeCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPreconditionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.CAUS);
				target.getPreconditions().add(pc);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.getPreconditions().clear();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.PRCN);
				target.getPreconditions().add(pc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPreconditionTypeCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityTemplateId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTemplateIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityTemplateId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* 
	*/
	@Test
	public void testValidateImmunizationActivityClassCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityClassCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.setClassCode(ActClass.ACCM);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityClassCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityMoodCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMoodCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				// the EMF-generated default happens to satisfy the constraint
				target.setMoodCode(x_DocumentSubstanceMood.RQO);
			}

			@Override
			public void addPassTests() {
				for (final x_DocumentSubstanceMood mood : Arrays.asList(EVN, INT)) {
					addPassTest(new PassTest() {
						@Override
						public void updateToPass(ImmunizationActivity target) {
							target.init();
							target.setMoodCode(mood);
						}
					});
				}
				;
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMoodCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityId() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIdTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityId(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setCode(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityStatusCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityStatusCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityStatusCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityEffectiveTime() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityEffectiveTimeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityEffectiveTime(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityRouteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRouteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setRouteCode(DatatypesFactory.eINSTANCE.createCE("C38192", "2.16.840.1.113883.3.26.1.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRouteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityRouteCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRouteCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();

				target.setRouteCode(null);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setRouteCode(DatatypesFactory.eINSTANCE.createCE("code", "codeSystem"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRouteCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRouteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityApproachSiteCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityApproachSiteCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

				target.getApproachSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				target.getApproachSiteCodes().clear();
				target.getApproachSiteCodes().add(
					DatatypesFactory.eINSTANCE.createCD(
						"code", "2.16.840.1.113883.6.96", "codeSystemName", "displayName"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityApproachSiteCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityApproachSiteCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.getApproachSiteCodes().clear();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {

				target.getApproachSiteCodes().clear();
				target.getApproachSiteCodes().add(
					DatatypesFactory.eINSTANCE.createCD(
						"code", "2.16.840.1.113883.6.96", "codeSystemName", "displayName"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityApproachSiteCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityDoseQuantity() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDoseQuantityTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setDoseQuantity(DatatypesFactory.eINSTANCE.createIVL_PQ());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDoseQuantity(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateImmunizationActivityNegationInd() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityNegationIndTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				// Either false or true is acceptable; there is no required default value.
				// However, since there SHALL be 1..1 @negationInd,
				// there must be a boolean value associated with @negationInd of some kind.
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityNegationInd(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationActivityText() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityTextTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityText(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityRepeatNumber() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityRepeatNumberTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {

				target.setRepeatNumber(DatatypesFactory.eINSTANCE.createIVL_INT());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityRepeatNumber(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCode() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityAdministrationUnitCodeTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE(
					"C42887", "2.16.840.1.113883.3.26.1.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCode(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityAdministrationUnitCodeP() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityAdministrationUnitCodePTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityAdministrationUnitCodeP",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_ADMINISTRATION_UNIT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.setAdministrationUnitCode(null);
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.setAdministrationUnitCode(DatatypesFactory.eINSTANCE.createCE(
					"code", "2.16.840.1.113883.3.26.1.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityAdministrationUnitCodeP(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityAdministrationUnitCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityDrugVehicle() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityDrugVehicleTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityDrugVehicle",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_DRUG_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.getParticipants().add(org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {

				for (Participant2 p : target.getParticipants()) {
					p.setParticipantRole(ConsolFactory.eINSTANCE.createDrugVehicle().init());
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityDrugVehicle(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityDrugVehicleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityIndication() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityIndicationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityIndication",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				Indication indication = ConsolFactory.eINSTANCE.createIndication().init();
				target.addObservation(indication);
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityIndication(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityInstructions() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityInstructionsTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityInstructions",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				Instructions instruction = ConsolFactory.eINSTANCE.createInstructions().init();
				target.addAct(instruction);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityInstructions(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityMedicationDispense() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationDispenseTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationDispense",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_DISPENSE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				MedicationDispense md = ConsolFactory.eINSTANCE.createMedicationDispense().init();
				target.addSupply(md);

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationDispense(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationDispenseTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityReactionObservation() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityReactionObservationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				target.addObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.CAUS);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityReactionObservation(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityPrecondition() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPreconditionTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPrecondition",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PRECONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				PreconditionForSubstanceAdministration pc = ConsolFactory.eINSTANCE.createPreconditionForSubstanceAdministration();
				pc.setTypeCode(ActRelationshipType.PRCN);
				target.getPreconditions().add(pc);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPrecondition(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPreconditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityImmunizationRefusalReason() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityImmunizationRefusalReasonTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityImmunizationRefusalReason",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();

				target.addObservation(ConsolFactory.eINSTANCE.createImmunizationRefusalReason().init());

				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityImmunizationRefusalReason(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityImmunizationRefusalReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityConsumable() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityConsumableTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityConsumable",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityConsumable(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityPerformer() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityPerformerTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityPerformer",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				target.getPerformers().add(CDAFactory.eINSTANCE.createPerformer2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityPerformer(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityMedicationSupplyOrder() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityMedicationSupplyOrderTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityMedicationSupplyOrder",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_MEDICATION_SUPPLY_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {

			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createMedicationSupplyOrder().init());
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityMedicationSupplyOrder(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityMedicationSupplyOrderTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationActivityConsumableImmunizationMedicationInformation() {
		OperationsTestCase<ImmunizationActivity> validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase = new OperationsTestCase<ImmunizationActivity>(
			"validateImmunizationActivityConsumableImmunizationMedicationInformation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_ACTIVITY_CONSUMABLE_IMMUNIZATION_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationActivity target) {
				target.init();
				target.setConsumable(CDAFactory.eINSTANCE.createConsumable());
			}

			@Override
			protected void updateToPass(ImmunizationActivity target) {
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				con.setManufacturedProduct(ConsolFactory.eINSTANCE.createImmunizationMedicationInformation());
				target.setConsumable(con);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationActivityOperations.validateImmunizationActivityConsumableImmunizationMedicationInformation(
					(ImmunizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationActivityConsumableImmunizationMedicationInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugVehicle() {

		ImmunizationActivity target = objectFactory.create();
		target.getDrugVehicle();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndication() {

		ImmunizationActivity target = objectFactory.create();
		target.getIndication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ImmunizationActivity target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationDispense() {

		ImmunizationActivity target = objectFactory.create();
		target.getMedicationDispense();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservation() {

		ImmunizationActivity target = objectFactory.create();
		target.getReactionObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationRefusalReason() {

		ImmunizationActivity target = objectFactory.create();
		target.getImmunizationRefusalReason();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationSupplyOrder() {

		ImmunizationActivity target = objectFactory.create();
		target.getMedicationSupplyOrder();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationActivity> {
		public ImmunizationActivity create() {
			return ConsolFactory.eINSTANCE.createImmunizationActivity();
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
	private static class ConstructorTestClass extends ImmunizationActivityOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ImmunizationActivityOperations
