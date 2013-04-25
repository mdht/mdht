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
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionFunctionalStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Functional Status Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCognitiveStatusProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Cognitive Status Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionPressureUlcerObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Pressure Ulcer Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionNumberOfPressureUlcersObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Number Of Pressure Ulcers Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#validateFunctionalStatusSectionHighestPressureUlcerStage(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Section Highest Pressure Ulcer Stage</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusResultOrganizers() <em>Get Functional Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusResultOrganizers() <em>Get Cognitive Status Result Organizers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusResultObservations() <em>Get Functional Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusResultObservations() <em>Get Cognitive Status Result Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getFunctionalStatusProblemObservations() <em>Get Functional Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCognitiveStatusProblemObservations() <em>Get Cognitive Status Problem Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getPressureUlcerObservations() <em>Get Pressure Ulcer Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getNumberOfPressureUlcersObservations() <em>Get Number Of Pressure Ulcers Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection#getHighestPressureUlcerStages() <em>Get Highest Pressure Ulcer Stages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTemplateId() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTemplateIdTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionCode() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCodeTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionTitle() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTitleTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFunctionalStatusSectionText() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionTextTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionText",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionFunctionalStatusResultOrganizer() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createFunctionalStatusResultOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultOrganizer(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionCognitiveStatusResultOrganizer() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusResultOrganizerTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusResultOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addOrganizer(ConsolFactory.eINSTANCE.createCognitiveStatusResultOrganizer().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultOrganizer(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusResultOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionFunctionalStatusResultObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusResultObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFunctionalStatusResultObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionCognitiveStatusResultObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusResultObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusResultObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCognitiveStatusResultObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusResultObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionFunctionalStatusProblemObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionFunctionalStatusProblemObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionFunctionalStatusProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createFunctionalStatusProblemObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusProblemObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionFunctionalStatusProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionCognitiveStatusProblemObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCognitiveStatusProblemObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCognitiveStatusProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_COGNITIVE_STATUS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCognitiveStatusProblemObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusProblemObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCognitiveStatusProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionCaregiverCharacteristics() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionCaregiverCharacteristicsTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCaregiverCharacteristics(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionAssessmentScaleObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionAssessmentScaleObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionAssessmentScaleObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionNonMedicinalSupplyActivity() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionNonMedicinalSupplyActivityTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNonMedicinalSupplyActivity(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionPressureUlcerObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionPressureUlcerObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionPressureUlcerObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_PRESSURE_ULCER_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createPressureUlcerObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionPressureUlcerObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionPressureUlcerObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionNumberOfPressureUlcersObservation() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionNumberOfPressureUlcersObservationTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionNumberOfPressureUlcersObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createNumberOfPressureUlcersObservation().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNumberOfPressureUlcersObservation(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionNumberOfPressureUlcersObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusSectionHighestPressureUlcerStage() {
		OperationsTestCase<FunctionalStatusSection> validateFunctionalStatusSectionHighestPressureUlcerStageTestCase = new OperationsTestCase<FunctionalStatusSection>(
			"validateFunctionalStatusSectionHighestPressureUlcerStage",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_SECTION_HIGHEST_PRESSURE_ULCER_STAGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusSection target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusSection target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createHighestPressureUlcerStage().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusSectionOperations.validateFunctionalStatusSectionHighestPressureUlcerStage(
					(FunctionalStatusSection) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusSectionHighestPressureUlcerStageTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusResultOrganizers() {

		FunctionalStatusSection target = objectFactory.create();
		target.getFunctionalStatusResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusResultOrganizers() {

		FunctionalStatusSection target = objectFactory.create();
		target.getCognitiveStatusResultOrganizers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusResultObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getFunctionalStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusResultObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getCognitiveStatusResultObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFunctionalStatusProblemObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getFunctionalStatusProblemObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCognitiveStatusProblemObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getCognitiveStatusProblemObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		FunctionalStatusSection target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {

		FunctionalStatusSection target = objectFactory.create();
		target.getNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPressureUlcerObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getPressureUlcerObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNumberOfPressureUlcersObservations() {

		FunctionalStatusSection target = objectFactory.create();
		target.getNumberOfPressureUlcersObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHighestPressureUlcerStages() {

		FunctionalStatusSection target = objectFactory.create();
		target.getHighestPressureUlcerStages();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusSection> {
		public FunctionalStatusSection create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusSection();
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
	private static class ConstructorTestClass extends FunctionalStatusSectionOperations {
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

} // FunctionalStatusSectionOperations
