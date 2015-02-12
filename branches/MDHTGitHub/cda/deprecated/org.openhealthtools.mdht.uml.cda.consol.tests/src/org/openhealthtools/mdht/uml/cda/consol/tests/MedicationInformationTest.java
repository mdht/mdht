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
import org.openhealthtools.mdht.uml.cda.Material;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationManufacturerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufacturer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMedicationInformationManufacturedMaterialReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Medication Information Manufactured Material Code</em>}</li>
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
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationId() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationIdTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationInformation target) {

				target.getIds().add(DatatypesFactory.eINSTANCE.createII());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationId(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationInformationClassCode() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationClassCodeTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return MedicationInformationOperations.validateMedicationInformationClassCode(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationManufacturedMaterial() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationManufacturedMaterialTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationManufacturedMaterial",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.setManufacturedMaterial(CDAFactory.eINSTANCE.createMaterial());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationManufacturedMaterial(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationManufacturedMaterialTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalText(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				// DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				material.setCode(ce);
				target.setManufacturedMaterial(material);

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

				Material material = CDAFactory.eINSTANCE.createMaterial();
				ED text = DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setOriginalText(text);
				material.setCode(ce);
				target.setManufacturedMaterial(material);

			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialReference() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMedicationInformationManufacturedMaterialReferenceTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialReference",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialReference(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				ED text = DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setOriginalText(text);
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				ED text = DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setOriginalText(text);
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.setValue("aaaaaaaaaaaaaaaaaaaaa");
				text.setReference(tel);
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValue(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				ED text = DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setOriginalText(text);
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				text.setReference(tel);
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				ED text = DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setOriginalText(text);
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				tel.setValue("aaaaaaaaaaaaaaaaaaaaa");
				text.setReference(tel);
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslation(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				// DatatypesFactory.eINSTANCE.createED();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				material.setCode(ce);
				ce.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.setManufacturedMaterial(material);

			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMedicationInformationManufacturedMaterialCode(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				material.setCode(ce);
				target.setManufacturedMaterial(material);
			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				// target.init();
				Material material = CDAFactory.eINSTANCE.createMaterial();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				material.setCode(ce);
				ce.setCodeSystem("2.16.840.1.113883.6.88");
				ce.setCode("16552");
				target.setManufacturedMaterial(material);
			}

		};

		validateMedicationInformationMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicationInformationManufacturerOrganization() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationManufacturerOrganizationTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationManufacturerOrganization",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationInformation target) {

				target.setManufacturerOrganization(CDAFactory.eINSTANCE.createOrganization());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationManufacturerOrganization(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationManufacturerOrganizationTestCase.doValidationTest();
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
			return ConsolFactory.eINSTANCE.createMedicationInformation();
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
	private static class ConstructorTestClass extends MedicationInformationOperations {
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

} // MedicationInformationOperations
