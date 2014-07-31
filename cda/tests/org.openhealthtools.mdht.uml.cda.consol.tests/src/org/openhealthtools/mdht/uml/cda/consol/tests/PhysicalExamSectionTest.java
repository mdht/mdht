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
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionPressureUlcerObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Pressure Ulcer Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionNumberOfPressureUlcersObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Number Of Pressure Ulcers Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getPressureUlcerObservations() <em>Get Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getNumberOfPressureUlcersObservations() <em>Get Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getHighestPressureUlcerStages() <em>Get Highest Pressure Ulcer Stages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalExamSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCode() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCode(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCodeP() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionCodePTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCodeP(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTitle() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTitleTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionTitle(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionText() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTextTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionText(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicalExamSectionPressureUlcerObservation() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionPressureUlcerObservationTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionPressureUlcerObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createPressureUlcerObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionPressureUlcerObservation(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionPressureUlcerObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicalExamSectionNumberOfPressureUlcersObservation() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionNumberOfPressureUlcersObservationTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionNumberOfPressureUlcersObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createNumberOfPressureUlcersObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionNumberOfPressureUlcersObservation(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNumberOfPressureUlcersObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicalExamSectionHighestPressureUlcerStage() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionHighestPressureUlcerStageTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionHighestPressureUlcerStage",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createHighestPressureUlcerStage().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionHighestPressureUlcerStage(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionHighestPressureUlcerStageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPressureUlcerObservations() {

		PhysicalExamSection target = objectFactory.create();
		target.getPressureUlcerObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberOfPressureUlcersObservations() {

		PhysicalExamSection target = objectFactory.create();
		target.getNumberOfPressureUlcersObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHighestPressureUlcerStages() {

		PhysicalExamSection target = objectFactory.create();
		target.getHighestPressureUlcerStages();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalExamSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection> {
		public PhysicalExamSection create() {
			return ConsolFactory.eINSTANCE.createPhysicalExamSection();
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
	private static class ConstructorTestClass extends PhysicalExamSectionOperations {
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

} // PhysicalExamSectionOperations
