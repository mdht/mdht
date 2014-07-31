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
import org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicalEquipmentSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medical Equipment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#validateMedicalEquipmentSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medical Equipment Section Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicalEquipmentSection#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicalEquipmentSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionTemplateId() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionTemplateIdTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionTemplateId(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionCode() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionCodeTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionCode(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionCodeP() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionCodePTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionCodeP(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionTitle() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionTitleTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionTitle(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicalEquipmentSectionText() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionTextTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionText(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateMedicalEquipmentSectionNonMedicinalSupplyActivity() {
		OperationsTestCase<MedicalEquipmentSection> validateMedicalEquipmentSectionNonMedicinalSupplyActivityTestCase = new OperationsTestCase<MedicalEquipmentSection>(
			"validateMedicalEquipmentSectionNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_EQUIPMENT_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalEquipmentSection target) {

			}

			@Override
			protected void updateToPass(MedicalEquipmentSection target) {
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicalEquipmentSectionOperations.validateMedicalEquipmentSectionNonMedicinalSupplyActivity(
					(MedicalEquipmentSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicalEquipmentSectionNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {

		MedicalEquipmentSection target = objectFactory.create();
		target.getNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicalEquipmentSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicalEquipmentSection> {
		public MedicalEquipmentSection create() {
			return ConsolFactory.eINSTANCE.createMedicalEquipmentSection();
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
	private static class ConstructorTestClass extends MedicalEquipmentSectionOperations {
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

} // MedicalEquipmentSectionOperations
