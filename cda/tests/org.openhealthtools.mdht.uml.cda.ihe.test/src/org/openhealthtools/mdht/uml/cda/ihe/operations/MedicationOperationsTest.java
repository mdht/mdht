/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.fail;

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
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.ProductEntry;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class MedicationOperationsTest extends MedicationActivityOperationsTest {

	public static class OperationsForOCL extends MedicationOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	public class MedicationObjectFactory implements TestObjectFactory<Medication> {
		public Medication create() {
			return IHEFactory.eINSTANCE.createNormalDose();
		}
	}

	MedicationObjectFactory objectFactory = new MedicationObjectFactory();

	@Test
	public final void testValidateMedicationHasDosing() {
		OperationsTestCase<Medication> validateMedicationHasDosingTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasDosing",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_DOSING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasDosing((Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationHasDosingTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationDosingRelationship() {

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

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();

			}
		};

		validateMedicationDosingRelationshipTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationHasDescriptionNoMedNotKnown() {
		OperationsTestCase<Medication> validateMedicationHasDescriptionNoMedNotKnownTestCase = new OperationsTestCase<Medication>(
			"validateMedicationHasDescriptionNoMedNotKnown",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_HAS_DESCRIPTION_NO_MED_NOT_KNOWN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasDescriptionNoMedNotKnown(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationHasDescriptionNoMedNotKnownTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationHasProductEntry() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasProductEntry(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();
				Consumable c = CDAFactory.eINSTANCE.createConsumable();
				ProductEntry pe = IHEFactory.eINSTANCE.createProductEntry();
				c.setManufacturedProduct(pe);
				medication.setConsumable(c);

			}
		};

		validateMedicationHasProductEntryTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationHasIntructionsInversion() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasIntructionsInversion(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();
				org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions pi = IHEFactory.eINSTANCE.createPatientMedicalInstructions().init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setAct(pi);
				medication.getEntryRelationships().add(er);

			}
		};

		validateMedicationHasIntructionsInversionTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationProductStrength() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationProductStrength(
					(Medication) objectToTest, diagnostician, map);
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
		};

		validateMedicationProductStrengthTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationProductName() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationProductName((Medication) objectToTest, diagnostician, map);
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
		};

		validateMedicationProductNameTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationPreconditionReference() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationPreconditionReference(
					(Medication) objectToTest, diagnostician, map);
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
		};

		validateMedicationPreconditionReferenceTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationHasSupplyEntryInversion() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasSupplyEntryInversion(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				Supply supply = CDAFactory.eINSTANCE.createSupply();
				er.setSupply(supply);
				er.setInversionInd(true);
				medication.getEntryRelationships().add(er);
			}
		};

		validateMedicationHasSupplyEntryInversionTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationHasFillNumber() {
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
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationHasFillNumber(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {
				Supply supply = CCDFactory.eINSTANCE.createSupplyActivity().init();
				medication.addSupply(supply);

			}
		};

		validateMedicationHasFillNumberTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationTemplateId() {
		OperationsTestCase<Medication> validateMedicationTemplateIdTestCase = new OperationsTestCase<Medication>(
			"validateMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationTemplateId((Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationTemplateIdTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationApproachSiteCode() {
		OperationsTestCase<Medication> validateMedicationApproachSiteCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
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

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationApproachSiteCodeTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationDoseQuantity() {
		OperationsTestCase<Medication> validateMedicationDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
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

			@Override
			protected void updateToFail(Medication medication) {
				medication.init();
			}
		};

		validateMedicationDoseQuantityTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationRateQuantity() {
		OperationsTestCase<Medication> validateMedicationRateQuantityTestCase = new OperationsTestCase<Medication>(
			"validateMedicationRateQuantity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_RATE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
				IVL_PQ value = DatatypesFactory.eINSTANCE.createIVL_PQ();
				medication.setRateQuantity(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationRateQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationRateQuantityTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationCode() {
		OperationsTestCase<Medication> validateMedicationCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationCode((Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationCodeTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationStatusCode() {
		OperationsTestCase<Medication> validateMedicationStatusCodeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();
				CS value = DatatypesFactory.eINSTANCE.createCS();
				medication.setStatusCode(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationStatusCode((Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationStatusCodeTestCase.doValidationTest();
	}

	@Test
	public final void testValidateMedicationEffectiveTime() {
		OperationsTestCase<Medication> validateMedicationEffectiveTimeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();

				SXCM_TS arg0 = DatatypesFactory.eINSTANCE.createSXCM_TS();
				medication.getEffectiveTimes().add(arg0);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationEffectiveTime(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationEffectiveTimeTestCase.doValidationTest();

	}

	@Test
	public final void testValidateMedicationReasonClassMood() {
		OperationsTestCase<Medication> validateMedicationEffectiveTimeTestCase = new OperationsTestCase<Medication>(
			"validateMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_REASON_CLASS_MOOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			@Override
			protected void updateToPass(Medication medication) {
				medication.init();

				SXCM_TS arg0 = DatatypesFactory.eINSTANCE.createSXCM_TS();
				medication.getEffectiveTimes().add(arg0);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationOperations.validateMedicationReasonClassMood(
					(Medication) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(Medication medication) {

			}
		};

		validateMedicationEffectiveTimeTestCase.doValidationTest();

	}

	/*
	 * CodedVitalSignsSection cvss = IHEFactory.eINSTANCE.createCodedVitalSignsSection().init();
	 * 
	 * final long TESTCOUNT = 100;
	 * for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {
	 * VitalSignsOrganizer vitalSignsOrganizer = IHEFactory.eINSTANCE.createVitalSignsOrganizer();
	 * String vso = String.valueOf(vsoctr);
	 * CD cd = DatatypesFactory.eINSTANCE.createCD(vso, vso, vso, vso);
	 * vitalSignsOrganizer.setCode(cd);
	 * cvss.addOrganizer(vitalSignsOrganizer);
	 * }
	 * 
	 * EList<VitalSignsOrganizer> result = CodedVitalSignsSectionOperations.getIHEVitalSignsOrganizers(cvss);
	 * 
	 * org.junit.Assert.assertEquals(result.size(), TESTCOUNT);
	 */

	@Test
	public final void testGetInternalReferences() {

		fail("Yet to implement");

	}

	@Test
	public final void testGetPatientMedicalInstructionss() {

		fail("Yet to implement");
	}

	@Test
	public final void testGetSupplyEntry() {

		fail("Yet to implement");
	}

} // MedicationOperationsTest
