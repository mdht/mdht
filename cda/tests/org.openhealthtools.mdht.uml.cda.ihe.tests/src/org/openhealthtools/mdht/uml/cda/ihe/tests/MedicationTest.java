/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.math.BigDecimal;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Criterion;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ManufacturedProduct;
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.Precondition;
import org.openhealthtools.mdht.uml.cda.Supply;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.ProductEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasDosing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Dosing</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationDosingRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dosing Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasDescriptionNoMedNotKnown(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Description No Med Not Known</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationReasonClassMood(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Reason Class Mood</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasProductEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Product Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasIntructionsInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Intructions Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationProductStrength(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Product Strength</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationPreconditionReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Precondition Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasSupplyEntryInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Supply Entry Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationRateQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Rate Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#validateMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#getInternalReferences() <em>Get Internal References</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#getPatientMedicalInstructionss() <em>Get Patient Medical Instructionss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.Medication#getSupplyEntry() <em>Get Supply Entry</em>}</li>
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
	public void testValidateMedicationHasDosing() {
		OperationsTestCase<Medication> validateMedicationHasDosingTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasDosing",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateMedicationHasDosing((Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasDosingTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDosingRelationship() {

		class CombinationMedicationObjectFactory implements TestObjectFactory<Medication> {
			public Medication create() {
				return IHEFactory.eINSTANCE.createCombinationMedication();
			}
		}
		OperationsTestCase<Medication> validateMedicationDosingRelationshipTestCase = new OperationsTestCase<Medication>(
			"validateMedicationDosingRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DOSING_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			new CombinationMedicationObjectFactory()) {

			@Override
			protected void updateToFail(Medication target) {
				target.init();
			}

			@Override
			protected void updateToPass(Medication medication) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				medication.getEntryRelationships().add(er);
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationDosingRelationship(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDosingRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationHasDescriptionNoMedNotKnown() {
		OperationsTestCase<Medication> validateMedicationHasDescriptionNoMedNotKnownTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasDescriptionNoMedNotKnown",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateMedicationHasDescriptionNoMedNotKnown(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasDescriptionNoMedNotKnownTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationReasonClassMood() {
		OperationsTestCase<Medication> validateMedicationReasonClassMoodTestCase = new OperationsTestCase<Medication>(
			"validateMedicationReasonClassMood",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateMedicationReasonClassMood(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationReasonClassMoodTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationHasProductEntry() {
		OperationsTestCase<Medication> validateMedicationHasProductEntryTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasProductEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_PRODUCT_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(Medication medication) {
				ProductEntry pe = IHEFactory.eINSTANCE.createProductEntry().init();
				medication.getConsumable().setManufacturedProduct(pe);
			}

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();
				Consumable c = CDAFactory.eINSTANCE.createConsumable();
				ProductEntry pe = IHEFactory.eINSTANCE.createProductEntry();
				c.setManufacturedProduct(pe);
				medication.setConsumable(c);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationHasProductEntry(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasProductEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationHasIntructionsInversion() {
		OperationsTestCase<Medication> validateMedicationHasIntructionsInversionTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasIntructionsInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_INTRUCTIONS_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(Medication medication) {

				for (EntryRelationship er : medication.getEntryRelationships()) {
					er.setInversionInd(true);
				}

			}

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();
				org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions pi = IHEFactory.eINSTANCE.createPatientMedicalInstructions().init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(pi);
				medication.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationHasIntructionsInversion(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasIntructionsInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationProductStrength() {
		OperationsTestCase<Medication> validateMedicationProductStrengthTestCase = new OperationsTestCase<Medication>(
			"validateMedicationProductStrength",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRODUCT_STRENGTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(Medication medication) {

				medication.getConsumable().getManufacturedProduct().getManufacturedMaterial().getCode().setOriginalText(
					DatatypesFactory.eINSTANCE.createED("Name of Material Here"));
			}

			@Override
			protected void updateToFail(Medication medication) {

				Consumable c = CDAFactory.eINSTANCE.createConsumable();

				ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();

				Material mm = CDAFactory.eINSTANCE.createMaterial();

				CE ce = DatatypesFactory.eINSTANCE.createCE("123456", "7890");
				mm.setCode(ce);

				mp.setManufacturedMaterial(mm);

				c.setManufacturedProduct(mp);

				medication.setConsumable(c);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationProductStrength(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationProductStrengthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationProductName() {
		OperationsTestCase<Medication> validateMedicationProductNameTestCase = new OperationsTestCase<Medication>(
			"validateMedicationProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(Medication medication) {
				medication.getConsumable().getManufacturedProduct().getManufacturedMaterial().setName(
					DatatypesFactory.eINSTANCE.createEN());
			}

			@Override
			protected void updateToFail(Medication medication) {

				Consumable c = CDAFactory.eINSTANCE.createConsumable();

				ManufacturedProduct mp = CDAFactory.eINSTANCE.createManufacturedProduct();

				Material mm = CDAFactory.eINSTANCE.createMaterial();

				mp.setManufacturedMaterial(mm);

				c.setManufacturedProduct(mp);

				medication.setConsumable(c);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationProductName((Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationProductNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationPreconditionReference() {
		OperationsTestCase<Medication> validateMedicationPreconditionReferenceTestCase = new OperationsTestCase<Medication>(
			"validateMedicationPreconditionReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_PRECONDITION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				for (Precondition pr : medication.getPreconditions()) {

					TEL value = DatatypesFactory.eINSTANCE.createTEL();
					pr.getCriterion().getText().setReference(value);
				}

			}

			@Override
			protected void updateToFail(Medication medication) {
				Precondition p = CDAFactory.eINSTANCE.createPrecondition();
				Criterion c = CDAFactory.eINSTANCE.createCriterion();
				ED ed = DatatypesFactory.eINSTANCE.createED("Reference String");
				c.setText(ed);

				p.setCriterion(c);
				medication.getPreconditions().add(p);

				// self.precondition.criterion.text

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationPreconditionReference(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationPreconditionReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationHasSupplyEntryInversion() {
		OperationsTestCase<Medication> validateMedicationHasSupplyEntryInversionTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasSupplyEntryInversion",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_SUPPLY_ENTRY_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToPass(Medication medication) {
				for (EntryRelationship er : medication.getEntryRelationships()) {
					er.setInversionInd(false);
				}
			}

			@Override
			protected void updateToFail(Medication medication) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				Supply supply = CDAFactory.eINSTANCE.createSupply();
				er.setSupply(supply);
				er.setInversionInd(true);
				medication.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationHasSupplyEntryInversion(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasSupplyEntryInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationHasFillNumber() {
		OperationsTestCase<Medication> validateMedicationHasFillNumberTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasFillNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				for (EntryRelationship er : medication.getEntryRelationships()) {
					INT i = DatatypesFactory.eINSTANCE.createINT();
					i.setValue(12345);
					er.setSequenceNumber(i);
				}
			}

			@Override
			protected void updateToFail(Medication medication) {
				Supply supply = CCDFactory.eINSTANCE.createSupplyActivity().init();
				medication.addSupply(supply);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationHasFillNumber(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationHasFillNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationTemplateId() {
		OperationsTestCase<Medication> validateMedicationTemplateIdTestCase = new OperationsTestCase<Medication>(
			"validateMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationOperations.validateMedicationTemplateId((Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationApproachSiteCode() {
		OperationsTestCase<Medication> validateMedicationApproachSiteCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
				CD e = DatatypesFactory.eINSTANCE.createCE();
				medication.getApproachSiteCodes().add(e);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationApproachSiteCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationDoseQuantity() {
		OperationsTestCase<Medication> validateMedicationDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication medication) {
				IVL_PQ value = DatatypesFactory.eINSTANCE.createIVL_PQ();
				value.setValue(new BigDecimal(1));
				medication.setDoseQuantity(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationDoseQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationDoseQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationRateQuantity() {
		OperationsTestCase<Medication> validateMedicationRateQuantityTestCase = new OperationsTestCase<Medication>(
			"validateMedicationRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {
				target.init();
			}

			@Override
			protected void updateToPass(Medication medication) {

				IVL_PQ value = DatatypesFactory.eINSTANCE.createIVL_PQ();
				medication.setRateQuantity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationRateQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationRateQuantityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationCode() {
		OperationsTestCase<Medication> validateMedicationCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationCode((Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationStatusCode() {
		OperationsTestCase<Medication> validateMedicationStatusCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationStatusCode((Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationEffectiveTime() {
		OperationsTestCase<Medication> validateMedicationEffectiveTimeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.getEffectiveTimes().add(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationOperations.validateMedicationEffectiveTime(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateMedicationEffectiveTimeTestCase.doValidationTest();
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
	* @generated NOT
	*/
	private static class ObjectFactory implements TestObjectFactory<Medication> {

		public Medication create() {
			return IHEFactory.eINSTANCE.createNormalDose();
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
	private static class ConstructorTestClass extends MedicationOperations {
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

} // MedicationOperations
