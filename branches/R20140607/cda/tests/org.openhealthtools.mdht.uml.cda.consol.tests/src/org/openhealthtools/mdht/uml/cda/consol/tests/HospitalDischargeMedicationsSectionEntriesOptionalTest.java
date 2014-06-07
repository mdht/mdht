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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptional#getDischargeMedications() <em>Get Discharge Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeMedicationsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTitle() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalText() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalTextTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalText(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication() {
		OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional> validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase = new OperationsTestCase<HospitalDischargeMedicationsSectionEntriesOptional>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSectionEntriesOptional target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createDischargeMedication().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionEntriesOptionalOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
					(HospitalDischargeMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDischargeMedications() {

		HospitalDischargeMedicationsSectionEntriesOptional target = objectFactory.create();
		target.getDischargeMedications();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeMedicationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeMedicationsSectionEntriesOptional> {
		public HospitalDischargeMedicationsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends HospitalDischargeMedicationsSectionEntriesOptionalOperations {
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

} // HospitalDischargeMedicationsSectionEntriesOptionalOperations
