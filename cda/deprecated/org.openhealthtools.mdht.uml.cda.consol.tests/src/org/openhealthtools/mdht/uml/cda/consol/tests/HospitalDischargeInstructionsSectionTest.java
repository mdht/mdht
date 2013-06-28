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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeInstructionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Instructions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection#validateHospitalDischargeInstructionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Instructions Section Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeInstructionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeInstructionsSectionTemplateId() {
		OperationsTestCase<HospitalDischargeInstructionsSection> validateHospitalDischargeInstructionsSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeInstructionsSection>(
			"validateHospitalDischargeInstructionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeInstructionsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeInstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeInstructionsSectionOperations.validateHospitalDischargeInstructionsSectionTemplateId(
					(HospitalDischargeInstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeInstructionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeInstructionsSectionCode() {
		OperationsTestCase<HospitalDischargeInstructionsSection> validateHospitalDischargeInstructionsSectionCodeTestCase = new OperationsTestCase<HospitalDischargeInstructionsSection>(
			"validateHospitalDischargeInstructionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeInstructionsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeInstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeInstructionsSectionOperations.validateHospitalDischargeInstructionsSectionCode(
					(HospitalDischargeInstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeInstructionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeInstructionsSectionCodeP() {
		OperationsTestCase<HospitalDischargeInstructionsSection> validateHospitalDischargeInstructionsSectionCodePTestCase = new OperationsTestCase<HospitalDischargeInstructionsSection>(
			"validateHospitalDischargeInstructionsSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeInstructionsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeInstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeInstructionsSectionOperations.validateHospitalDischargeInstructionsSectionCodeP(
					(HospitalDischargeInstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeInstructionsSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeInstructionsSectionText() {
		OperationsTestCase<HospitalDischargeInstructionsSection> validateHospitalDischargeInstructionsSectionTextTestCase = new OperationsTestCase<HospitalDischargeInstructionsSection>(
			"validateHospitalDischargeInstructionsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeInstructionsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeInstructionsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeInstructionsSectionOperations.validateHospitalDischargeInstructionsSectionText(
					(HospitalDischargeInstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeInstructionsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeInstructionsSectionTitle() {
		OperationsTestCase<HospitalDischargeInstructionsSection> validateHospitalDischargeInstructionsSectionTitleTestCase = new OperationsTestCase<HospitalDischargeInstructionsSection>(
			"validateHospitalDischargeInstructionsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeInstructionsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeInstructionsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeInstructionsSectionOperations.validateHospitalDischargeInstructionsSectionTitle(
					(HospitalDischargeInstructionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeInstructionsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeInstructionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeInstructionsSection> {
		public HospitalDischargeInstructionsSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection();
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
	private static class ConstructorTestClass extends HospitalDischargeInstructionsSectionOperations {
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

} // HospitalDischargeInstructionsSectionOperations
