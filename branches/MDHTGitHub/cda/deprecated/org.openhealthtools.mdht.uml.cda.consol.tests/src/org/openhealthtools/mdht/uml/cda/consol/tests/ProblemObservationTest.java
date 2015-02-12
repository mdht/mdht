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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationAgeObservationInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueTranslationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value Translation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationProblemStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Problem Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#getProblemStatus() <em>Get Problem Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProblemObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationHasTextReference() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasTextReferenceTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasTextReference(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationTextReferenceValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationTextReferenceValue(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationHasTextReferenceValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasTextReferenceValueTestCase = new NarrativeReferenceTestCase<ProblemObservation>(
			"validateProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular problem observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ProblemObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular problem observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasTextReferenceValue(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationHasOnsetDate() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasOnsetDateTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasOnsetDate(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationHasResolutionDate() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasResolutionDateTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(ProblemObservation target) {

				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				ef.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ef);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHasResolutionDate(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationValueNullFlavor() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueNullFlavorTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.getValues().clear();

				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.setNullFlavor(NullFlavor.UNK);
				target.getValues().add(val);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueNullFlavor(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationAgeObservationInversion() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationInversionTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservationInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ProblemObservation target) {
						// Test case with multiple entryRelationships.. Should check for inversion Indicator only if AgeObservation is present
						target.getEntryRelationships().clear();
						target.getEntryRelationships().add(CDAFactory.eINSTANCE.createEntryRelationship());
						target.getEntryRelationships().add(CDAFactory.eINSTANCE.createEntryRelationship());
					}

				});
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationAgeObservationInversion(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationAgeObservationInversionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationValueTranslation() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTranslationTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueTranslation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.getTranslations().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.3", "", ""));
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueTranslation(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationValueTranslationCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTranslationCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueTranslationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_TRANSLATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.getValues().add(val);
			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.getValues().clear();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.getTranslations().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.3", "", ""));
				target.getValues().add(val);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueTranslationCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTranslationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationTemplateId(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationClassCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationClassCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				target.setClassCode(ActClassObservation.OBS);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationClassCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationMoodCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationMoodCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationMoodCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationNegationInd() {
		OperationsTestCase<ProblemObservation> validateProblemObservationNegationIndTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationNegationInd(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationId() {
		OperationsTestCase<ProblemObservation> validateProblemObservationIdTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationId(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationCodeP() {
		OperationsTestCase<ProblemObservation> validateProblemObservationCodePTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationCodeP(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				cd.setCode("404684003");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationText() {
		OperationsTestCase<ProblemObservation> validateProblemObservationTextTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationText(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<ProblemObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationStatusCode(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationEffectiveTime() {
		OperationsTestCase<ProblemObservation> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationEffectiveTime(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("234422006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValue(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProblemObservationValueP() {
		OperationsTestCase<ProblemObservation> validateProblemObservationValuePTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("234422006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationValueP(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationAgeObservation() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationAgeObservation(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationHealthStatusObservation() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHealthStatusObservationTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHealthStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createHealthStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationHealthStatusObservation(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHealthStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationProblemStatus() {
		OperationsTestCase<ProblemObservation> validateProblemObservationProblemStatusTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationProblemStatus",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_PROBLEM_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemStatus().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProblemObservationOperations.validateProblemObservationProblemStatus(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationProblemStatusTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ProblemObservation target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusObservation() {

		ProblemObservation target = objectFactory.create();
		target.getHealthStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatus() {

		ProblemObservation target = objectFactory.create();
		target.getProblemStatus();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProblemObservation> {
		public ProblemObservation create() {
			return ConsolFactory.eINSTANCE.createProblemObservation();
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
	private static class ConstructorTestClass extends ProblemObservationOperations {
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

} // ProblemObservationOperations
