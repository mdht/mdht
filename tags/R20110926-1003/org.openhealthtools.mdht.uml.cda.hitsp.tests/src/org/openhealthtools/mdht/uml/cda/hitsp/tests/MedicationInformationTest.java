/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
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
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.EN;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Medication Information</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedProductVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedDrugClassVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Drug Class Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedIngredientVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationCodedBrandNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationFreeTextProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationFreeTextBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationInformation#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationInformationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedProductName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedProductNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.17");
				ce.setCode("111");
				mm.setCode(ce);
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				ce.getTranslations().add(cd);
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedProductName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedProductNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedProductVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedProductVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedProductVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.17");
				mm.setCode(ce);
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				ce.getTranslations().add(cd);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedProductVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedProductVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedDrugClassVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedDrugClassVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedDrugClassVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_DRUG_CLASS_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.18");
				mm.setCode(ce);
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				ce.getTranslations().add(cd);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedDrugClassVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedDrugClassVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedIngredientVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedIngredientVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedIngredientVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.20");
				mm.setCode(ce);
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				ce.getTranslations().add(cd);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedIngredientVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedIngredientVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedBrandName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedBrandNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedBrandName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.16");
				mm.setCode(ce);
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				ce.getTranslations().add(cd);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedBrandName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedBrandNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationCodedBrandNameVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedBrandNameVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedBrandNameVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.3.88.12.80.16");
				mm.setCode(ce);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedBrandNameVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedBrandNameVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationFreeTextProductName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationFreeTextProductNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationFreeTextProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ce.setOriginalText(ot);
				mm.setCode(ce);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationFreeTextProductName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationFreeTextProductNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMedicationInformationFreeTextBrandName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationFreeTextBrandNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationFreeTextBrandName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

				Material mm = CDAFactory.eINSTANCE.createMaterial();
				EN name = DatatypesFactory.eINSTANCE.createEN();

				mm.setName(name);
				target.setManufacturedMaterial(mm);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationFreeTextBrandName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationFreeTextBrandNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMedicationInformationTemplateId() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationTemplateIdTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationTemplateId(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends MedicationInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationInformation> {

		public MedicationInformation create() {
			return HITSPFactory.eINSTANCE.createMedicationInformation();
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
	private static class ConstructorTestClass extends MedicationInformationOperations {
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

} // MedicationInformationOperations
