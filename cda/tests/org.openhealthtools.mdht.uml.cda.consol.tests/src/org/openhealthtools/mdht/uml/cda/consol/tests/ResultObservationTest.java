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
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationAuthorMultiplicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Author Multiplicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ResultObservation#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationTextReference() {
		OperationsTestCase<ResultObservation> validateResultObservationTextReferenceTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();

				target.setText(txt);
			}

			@Override
			protected void updateToPass(ResultObservation target) {

				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTextReference(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultObservationReferenceValue() {
		OperationsTestCase<ResultObservation> validateResultObservationReferenceValueTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(ResultObservation target) {

				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationReferenceValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultObservationTextReferenceValue() {
		OperationsTestCase<ResultObservation> validateResultObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<ResultObservation>(
			"validateResultObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular result observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected void updateToPass(ResultObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular result observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTextReferenceValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCodeValue() {
		OperationsTestCase<ResultObservation> validateResultObservationCodeValueTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				// setting invalid codeSystem to cause failure
				value.setCodeSystem("invalidCodeSystem");
				target.setCode(value);
			}

			@Override
			protected void updateToPass(ResultObservation target) {

				CD value = DatatypesFactory.eINSTANCE.createCD();
				// setting valid codeSystem
				value.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationCodeValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationNoObservationRangeCode() {
		OperationsTestCase<ResultObservation> validateResultObservationNoObservationRangeCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationNoObservationRangeCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();
				ReferenceRange refRange = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange obsRange = CDAFactory.eINSTANCE.createObservationRange();
				CD value = DatatypesFactory.eINSTANCE.createCD();

				value.setCode("Test");
				obsRange.setCode(value);
				refRange.setObservationRange(obsRange);
				target.getReferenceRanges().add(refRange);
			}

			@Override
			protected void updateToPass(ResultObservation target) {
				ReferenceRange refRange = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange obsRange = CDAFactory.eINSTANCE.createObservationRange();
				CD value = DatatypesFactory.eINSTANCE.createCD();

				target.getReferenceRanges().clear();
				obsRange.setCode(value);
				refRange.setObservationRange(obsRange);
				target.getReferenceRanges().add(refRange);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ResultObservationOperations.validateResultObservationNoObservationRangeCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationNoObservationRangeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationAuthorMultiplicity() {
		OperationsTestCase<ResultObservation> validateResultObservationAuthorMultiplicityTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationAuthorMultiplicity",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_AUTHOR_MULTIPLICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.init();
				Author author1 = CDAFactory.eINSTANCE.createAuthor();
				Author author2 = CDAFactory.eINSTANCE.createAuthor();

				// adding two authors
				target.getAuthors().add(author1);
				target.getAuthors().add(author2);

			}

			@Override
			protected void updateToPass(ResultObservation target) {

				target.getAuthors().clear();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationAuthorMultiplicity(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationAuthorMultiplicityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<ResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTemplateId(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationClassCode() {
		OperationsTestCase<ResultObservation> validateResultObservationClassCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationClassCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultObservationMoodCode() {
		OperationsTestCase<ResultObservation> validateResultObservationMoodCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipFailsTest();
			}

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationMoodCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationId() {
		OperationsTestCase<ResultObservation> validateResultObservationIdTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationId(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<ResultObservation> validateResultObservationCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {
				target.setCode(null);
			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				CE cd = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	* check
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationText() {
		OperationsTestCase<ResultObservation> validateResultObservationTextTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationText(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<ResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationStatusCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateResultObservationStatusCodeP() {
		OperationsTestCase<ResultObservation> validateResultObservationStatusCodePTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationStatusCodeP(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<ResultObservation> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationEffectiveTime(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationValue() {
		OperationsTestCase<ResultObservation> validateResultObservationValueTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationInterpretationCode() {
		OperationsTestCase<ResultObservation> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				CE interpCode = DatatypesFactory.eINSTANCE.createCE();
				target.getInterpretationCodes().add(interpCode);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationInterpretationCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationMethodCode() {
		OperationsTestCase<ResultObservation> validateResultObservationMethodCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();
				CE methodCode = DatatypesFactory.eINSTANCE.createCE();
				target.getMethodCodes().add(methodCode);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationMethodCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	* TODO:Check
	*/
	@Test
	public void testValidateResultObservationTargetSiteCode() {
		OperationsTestCase<ResultObservation> validateResultObservationTargetSiteCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

				target.init();
				CD tsCode2 = DatatypesFactory.eINSTANCE.createCD();
				target.getTargetSiteCodes().add(tsCode2);

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.getTargetSiteCodes().clear();
				CE tsCode1 = DatatypesFactory.eINSTANCE.createCE();
				target.getTargetSiteCodes().add(tsCode1);
				CE tsCode3 = DatatypesFactory.eINSTANCE.createCE();
				target.getTargetSiteCodes().add(tsCode3);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTargetSiteCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultObservation> {
		public ResultObservation create() {
			return ConsolFactory.eINSTANCE.createResultObservation();
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
	private static class ConstructorTestClass extends ResultObservationOperations {
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

} // ResultObservationOperations
