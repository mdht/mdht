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
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medication</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationFirstEffectiveTimeDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication First Effective Time Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseUnits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Units</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDeliveryMethodDescription(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Delivery Method Description</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Medication Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasStatusOfMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Status Of Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndicationNarrativeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Indication Narrative Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndicationVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Indication Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasPatientInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Patient Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasMedicationVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Has Medication Vehicle</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCodedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Coded Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCodedNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Medication Vehicle Coded Name Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationRouteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationType() <em>Get Medication Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationOrderInformations() <em>Get Medication Order Informations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getHITSPReactionObservation() <em>Get HITSP Reaction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationFirstEffectiveTimeDatatype() {
		OperationsTestCase<Medication> validateHITSPMedicationFirstEffectiveTimeDatatypeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationFirstEffectiveTimeDatatype",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_FIRST_EFFECTIVE_TIME_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				target.getEffectiveTimes().add(DatatypesFactory.eINSTANCE.createSXCM_TS());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationFirstEffectiveTimeDatatype(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationFirstEffectiveTimeDatatypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationDoseUnits() {
		OperationsTestCase<Medication> validateHITSPMedicationDoseUnitsTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationDoseUnits",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_DOSE_UNITS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				IVL_PQ dq = DatatypesFactory.eINSTANCE.createIVL_PQ();
				dq.setUnit("2.16.840.1.113883.3.88.12.80.29");
				target.setDoseQuantity(dq);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationDoseUnits(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationDoseUnitsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationDeliveryMethodDescription() {
		OperationsTestCase<Medication> validateHITSPMedicationDeliveryMethodDescriptionTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationDeliveryMethodDescription",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_DELIVERY_METHOD_DESCRIPTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationDeliveryMethodDescription(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationDeliveryMethodDescriptionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasMedicationInformation() {
		OperationsTestCase<Medication> validateHITSPMedicationHasMedicationInformationTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasMedicationInformation",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {
				target.init();
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				target.setConsumable(con);
			}

			@Override
			protected void updateToPass(Medication target) {
				Consumable con = CDAFactory.eINSTANCE.createConsumable();
				MedicationInformation mi = HITSPFactory.eINSTANCE.createMedicationInformation();
				con.setManufacturedProduct(mi);
				target.setConsumable(con);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasMedicationInformation(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasMedicationInformationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasStatusOfMedication() {
		OperationsTestCase<Medication> validateHITSPMedicationHasStatusOfMedicationTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasStatusOfMedication",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_STATUS_OF_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				MedicationStatusObservation mso = CCDFactory.eINSTANCE.createMedicationStatusObservation();
				target.addObservation(mso);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasStatusOfMedication(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasStatusOfMedicationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasIndication() {
		OperationsTestCase<Medication> validateHITSPMedicationHasIndicationTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasIndication",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				target.addObservation(po);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasIndication(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasIndicationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasIndicationNarrativeText() {
		OperationsTestCase<Medication> validateHITSPMedicationHasIndicationNarrativeTextTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasIndicationNarrativeText",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_INDICATION_NARRATIVE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				po.setText(txt);
				target.addObservation(po);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasIndicationNarrativeText(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasIndicationNarrativeTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasIndicationVocab() {
		OperationsTestCase<Medication> validateHITSPMedicationHasIndicationVocabTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasIndicationVocab",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_INDICATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				ProblemObservation po = CCDFactory.eINSTANCE.createProblemObservation();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCodeSystem("2.16.840.1.113883.6.96");
				po.setCode(code);
				target.addObservation(po);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasIndicationVocab(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasIndicationVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasPatientInstructions() {
		OperationsTestCase<Medication> validateHITSPMedicationHasPatientInstructionsTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasPatientInstructions",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_PATIENT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				PatientMedicalInstructions pmi = IHEFactory.eINSTANCE.createPatientMedicalInstructions();
				target.addAct(pmi);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasPatientInstructions(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasPatientInstructionsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationHasMedicationVehicle() {
		OperationsTestCase<Medication> validateHITSPMedicationHasMedicationVehicleTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasMedicationVehicle",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_MEDICATION_VEHICLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationHasMedicationVehicle(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasMedicationVehicleTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleType() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleTypeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleType",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				// p2.setTypeCode(ParticipationType.CSM);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {
						p2.setTypeCode(ParticipationType.CSM);
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleType(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleTypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT 
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleClass() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleClassTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleClass",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				// p2.setTypeCode(ParticipationType.CSM);
				// pr.setClassCode(RoleClassRoot.MANU);
				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);

			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {
						p2.setTypeCode(ParticipationType.CSM);
						p2.getParticipantRole().setClassCode(RoleClassRoot.MANU);
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleClass(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleClassTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCode() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {

						p2.setTypeCode(ParticipationType.CSM);
						p2.getParticipantRole().setClassCode(RoleClassRoot.MANU);
						CE code = DatatypesFactory.eINSTANCE.createCE();
						code.setCode("412307009");
						code.setCodeSystem("2.16.840.1.113883.6.96");
						p2.getParticipantRole().setCode(code);
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleName() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleNameTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleName",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				p2.setTypeCode(ParticipationType.CSM);
				pr.setClassCode(RoleClassRoot.MANU);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCode("412307009");
				code.setCodeSystem("2.16.840.1.113883.6.96");
				pr.setCode(code);
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {

						p2.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleName(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCodedName() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodedNameTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCodedName",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();
				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				p2.setTypeCode(ParticipationType.CSM);
				pr.setClassCode(RoleClassRoot.MANU);

				pr.setPlayingEntity(pe);
				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);

			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {

						CE ce = DatatypesFactory.eINSTANCE.createCE("412307009", "2.16.840.1.113883.6.96");
						CE ce2 = DatatypesFactory.eINSTANCE.createCE("12345", "2.16.840.1.113883.3.88.12.80.21");
						p2.getParticipantRole().setCode(ce);
						p2.getParticipantRole().getPlayingEntity().setCode(ce2);

						p2.getParticipantRole().getPlayingEntity().getNames().add(DatatypesFactory.eINSTANCE.createPN());

					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleCodedName(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleCodedNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCodedNameVocab() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodedNameVocabTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCodedNameVocab",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

				target.init();

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				p2.setTypeCode(ParticipationType.CSM);
				pr.setClassCode(RoleClassRoot.MANU);

				pr.setPlayingEntity(pe);
				p2.setParticipantRole(pr);
				sa.getParticipants().add(p2);
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected void updateToPass(Medication target) {

				for (SubstanceAdministration sa : target.getSubstanceAdministrations()) {
					for (Participant2 p2 : sa.getParticipants()) {

						CE ce = DatatypesFactory.eINSTANCE.createCE("412307009", "2.16.840.1.113883.6.96");
						CE ce2 = DatatypesFactory.eINSTANCE.createCE("12345", "2.16.840.1.113883.6.96");
						p2.getParticipantRole().setCode(ce);
						p2.getParticipantRole().getPlayingEntity().setCode(ce2);
					}

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMedicationVehicleCodedNameVocab(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleCodedNameVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationTemplateId() {
		OperationsTestCase<Medication> validateHITSPMedicationTemplateIdTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationTemplateId(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationEffectiveTime() {
		OperationsTestCase<Medication> validateHITSPMedicationEffectiveTimeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

				IVL_TS s = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(s);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationEffectiveTime(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPMedicationRouteCode() {
		OperationsTestCase<Medication> validateHITSPMedicationRouteCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationRouteCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationRouteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPMedicationRouteCodeP() {
		OperationsTestCase<Medication> validateHITSPMedicationRouteCodePTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationRouteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_ROUTE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationRouteCodeP(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationRouteCodePTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationDoseQuantity() {
		OperationsTestCase<Medication> validateHITSPMedicationDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

				IVL_PQ q = DatatypesFactory.eINSTANCE.createIVL_PQ();
				target.setDoseQuantity(q);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationDoseQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPMedicationAdministrationUnitCode() {
		OperationsTestCase<Medication> validateHITSPMedicationAdministrationUnitCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE("code", "codeSystem");

				target.setAdministrationUnitCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationAdministrationUnitCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationAdministrationUnitCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHITSPMedicationMaxDoseQuantity() {
		OperationsTestCase<Medication> validateHITSPMedicationMaxDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

				RTO_PQ_PQ q = DatatypesFactory.eINSTANCE.createRTO_PQ_PQ();
				target.setMaxDoseQuantity(q);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationMaxDoseQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMaxDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHITSPMedicationApproachSiteCodeP() {
		OperationsTestCase<Medication> validateHITSPMedicationApproachSiteCodePTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationApproachSiteCodeP(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPMedicationApproachSiteCode() {
		OperationsTestCase<Medication> validateHITSPMedicationApproachSiteCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {
				// target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getApproachSiteCodes().add(cd);

			}

			@Override
			protected void updateToPass(Medication target) {

				for (CD cd : target.getApproachSiteCodes()) {
					cd.setCode("aaa");
					cd.setCodeSystem("2.16.840.1.113883.6.96");
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationApproachSiteCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationCode() {
		OperationsTestCase<Medication> validateHITSPMedicationCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateHITSPMedicationCode((Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationType() {

		Medication target = objectFactory.create();
		target.getMedicationType();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationOrderInformations() {

		Medication target = objectFactory.create();
		target.getMedicationOrderInformations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHITSPReactionObservation() {

		Medication target = objectFactory.create();
		target.getHITSPReactionObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Medication> {

		public Medication create() {
			return HITSPFactory.eINSTANCE.createMedication();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends MedicationOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // MedicationOperations
