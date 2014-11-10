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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationManufacturerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufacturer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationManufacturedMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformation#validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Immunization Medication Information Manufactured Material Lot Number Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationMedicationInformationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationTemplateId() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationTemplateIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationTemplateId(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateImmunizationMedicationInformationClassCode() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationClassCodeTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationClassCode(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationId() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationIdTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.getIds().add(DatatypesFactory.eINSTANCE.createII());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationId(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturerOrganization() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationManufacturerOrganizationTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationManufacturerOrganization",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.setManufacturerOrganization(CDAFactory.eINSTANCE.createOrganization());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationManufacturerOrganization(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturerOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterial() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationManufacturedMaterialTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationManufacturedMaterial",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				target.setManufacturedMaterial(CDAFactory.eINSTANCE.createMaterial());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationManufacturedMaterial(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				mm.setCode(code);
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				mm.setCode(code);
				target.setManufacturedMaterial(mm);

			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(orig);
				mm.setCode(code);
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				orig.setReference(DatatypesFactory.eINSTANCE.createTEL("ref1"));
				code.setOriginalText(orig);
				mm.setCode(code);
				target.setManufacturedMaterial(mm);

			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValue(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
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
			protected void updateToPass(ImmunizationMedicationInformation target) {
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

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				mm.setCode(code);
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				mm.setCode(code);
				target.setManufacturedMaterial(mm);

			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCode(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();

				mm.setCode(DatatypesFactory.eINSTANCE.createCE("143", "2.16.840.1.113883.12.292"));
				target.setManufacturedMaterial(mm);
			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText() {
		OperationsTestCase<ImmunizationMedicationInformation> validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase = new OperationsTestCase<ImmunizationMedicationInformation>(
			"validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationOperations.validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberText(
					(ImmunizationMedicationInformation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(ImmunizationMedicationInformation target) {
				target.init();
				Material mm = CDAFactory.eINSTANCE.createMaterial();
				target.setManufacturedMaterial(mm);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformation target) {
				Material mm = CDAFactory.eINSTANCE.createMaterial();

				mm.setLotNumberText(DatatypesFactory.eINSTANCE.createST());
				target.setManufacturedMaterial(mm);

			}

		};

		validateImmunizationMedicationInformationImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationMedicationInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ImmunizationMedicationInformation> {
		public ImmunizationMedicationInformation create() {
			return ConsolFactory.eINSTANCE.createImmunizationMedicationInformation();
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
	private static class ConstructorTestClass extends ImmunizationMedicationInformationOperations {
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

} // ImmunizationMedicationInformationOperations
