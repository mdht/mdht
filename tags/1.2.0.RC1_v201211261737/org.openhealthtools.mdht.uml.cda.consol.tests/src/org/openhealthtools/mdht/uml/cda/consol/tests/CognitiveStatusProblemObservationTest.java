/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cognitive Status Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateCognitiveStatusProblemObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Problem Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusProblemObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationHasTextReference() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationHasTextReferenceTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasTextReference(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationHasTextReferenceValue() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationHasTextReferenceValueTestCase = new NarrativeReferenceTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasTextReferenceValue(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationHasOnsetDate() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationHasOnsetDateTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasOnsetDate(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationHasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationHasResolutionDate() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationHasResolutionDateTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationHasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationHasResolutionDate(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationClassCode() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationClassCodeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationClassCode(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationMoodCode() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationMoodCodeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationMoodCode(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationNegationInd() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationNegationIndTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationNegationInd(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationId() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationIdTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationId",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationId(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationCodeP() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationCodePTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCodeP(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationCode() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationCodeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("373930000", "2.16.840.1.113883.6.1", "", "");
				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCode(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationText() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationTextTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationText(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationStatusCode() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationStatusCodeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationStatusCode(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationEffectiveTime() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationEffectiveTimeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationEffectiveTime(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationMethodCode() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationMethodCodeTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationMethodCode(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationValueP() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationValuePTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationValueP(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationValue() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationValueTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationValue(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationNonMedicinalSupplyActivity(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationCaregiverCharacteristics() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationCaregiverCharacteristics(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusProblemObservationAssessmentScaleObservation() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateCognitiveStatusProblemObservationAssessmentScaleObservationTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateCognitiveStatusProblemObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateCognitiveStatusProblemObservationAssessmentScaleObservation(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusProblemObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {

		CognitiveStatusProblemObservation target = objectFactory.create();
		target.getNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		CognitiveStatusProblemObservation target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		CognitiveStatusProblemObservation target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<CognitiveStatusProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<CognitiveStatusProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusProblemObservationOperations.validateProblemObservationTemplateId(
					(CognitiveStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusProblemObservation> {
		public CognitiveStatusProblemObservation create() {
			return ConsolFactory.eINSTANCE.createCognitiveStatusProblemObservation();
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
	private static class ConstructorTestClass extends CognitiveStatusProblemObservationOperations {
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

} // CognitiveStatusProblemObservationOperations
