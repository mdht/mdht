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
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionMedicationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Medications Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#getAdmissionMedications() <em>Get Admission Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionMedicationsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeP(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalText() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalTextTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalText(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTitle() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTitle(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();
			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.addAct(ConsolFactory.eINSTANCE.createAdmissionMedication().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAdmissionMedications() {

		HospitalAdmissionMedicationsSectionEntriesOptional target = objectFactory.create();
		target.getAdmissionMedications();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionMedicationsSectionEntriesOptional> {
		public HospitalAdmissionMedicationsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionMedicationsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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

} // HospitalAdmissionMedicationsSectionEntriesOptionalOperations
