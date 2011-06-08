/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medication</b></em>' model objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationStopped(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Stopped</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationFirstEffectiveTimeDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication First Effective Time Datatype</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseUnits(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Dose Units</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDeliveryMethodDescription(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Delivery Method Description</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasMedicationInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Medication Information</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasStatusOfMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Status Of Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Indication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndicationNarrativeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Indication Narrative Text</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasIndicationVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Indication Vocab</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasPatientInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Patient Instructions</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationHasMedicationVehicle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Has Medication Vehicle</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Type</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Class</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Name</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCodedName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Coded Name</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMedicationVehicleCodedNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Medication Vehicle Coded Name Vocab</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Effective Time</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Route Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Dose Quantity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Administration Unit Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Max Dose Quantity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Approach Site Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Medication Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationType()
 * <em>Get Medication Type</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationOrderInformations()
 * <em>Get Medication Order Informations</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getHITSPReactionObservation()
 * <em>Get HITSP Reaction Observation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class MedicationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationStopped() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationStoppedTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationStopped",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_STOPPED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationStopped(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationStoppedTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationHasMedicationInformation() {
		OperationsTestCase<Medication> validateHITSPMedicationHasMedicationInformationTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationHasMedicationInformation",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_HAS_MEDICATION_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationHasMedicationInformation(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationHasMedicationInformationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
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
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleType() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleTypeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleType",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationVehicleType(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleTypeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleClass() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleClassTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleClass",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationVehicleClass(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleClassTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCode() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationVehicleCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleName() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleNameTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleName",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationVehicleName(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCodedName() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodedNameTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCodedName",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateHITSPMedicationMedicationVehicleCodedName(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMedicationVehicleCodedNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPMedicationMedicationVehicleCodedNameVocab() {
		OperationsTestCase<Medication> validateHITSPMedicationMedicationVehicleCodedNameVocabTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMedicationVehicleCodedNameVocab",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MEDICATION_VEHICLE_CODED_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
	 * @generated
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

				DatatypesFactory.eINSTANCE.createIVL_TS();

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
	 * @generated
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
	 * @generated
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
	public void testValidateHITSPMedicationApproachSiteCode() {
		OperationsTestCase<Medication> validateHITSPMedicationApproachSiteCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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
