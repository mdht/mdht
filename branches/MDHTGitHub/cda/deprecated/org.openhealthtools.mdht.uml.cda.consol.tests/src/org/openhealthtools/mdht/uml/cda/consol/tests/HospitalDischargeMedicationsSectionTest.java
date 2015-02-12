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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#getConsolDischargeMedications() <em>Get Consol Discharge Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Discharge Medication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeMedicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolDischargeMedications() {

		HospitalDischargeMedicationsSection target = objectFactory.create();
		target.getConsolDischargeMedications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCodeP() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCodeP(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();

			}

			@Override
			protected void setDependency(HospitalDischargeMedicationsSection target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSectionEntriesOptionalCodeP",
					passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalText() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalTextTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalText(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTitle() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalTitleTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTitle(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createDischargeMedication().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedication(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalDischargeMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeMedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeMedicationsSection> {
		public HospitalDischargeMedicationsSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection();
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
	private static class ConstructorTestClass extends HospitalDischargeMedicationsSectionOperations {
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

} // HospitalDischargeMedicationsSectionOperations
