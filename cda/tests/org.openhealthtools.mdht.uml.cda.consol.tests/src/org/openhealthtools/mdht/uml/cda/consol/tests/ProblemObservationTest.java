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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationAgeObservationInversion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Age Observation Inversion</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
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

				return ProblemObservationOperations.validateProblemObservationHasTextReference(
					(ProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationHasTextReferenceValue() {
		OperationsTestCase<ProblemObservation> validateProblemObservationHasTextReferenceValueTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {

			}

			@Override
			protected void updateToPass(ProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

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
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationAgeObservationInversion() {
		OperationsTestCase<ProblemObservation> validateProblemObservationAgeObservationInversionTestCase = new OperationsTestCase<ProblemObservation>(
			"validateProblemObservationAgeObservationInversion",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_AGE_OBSERVATION_INVERSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation());
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
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation());
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
				er.setObservation(ConsolFactory.eINSTANCE.createAgeObservation());
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
				er.setObservation(ConsolFactory.eINSTANCE.createHealthStatusObservation());
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
				er.setObservation(ConsolFactory.eINSTANCE.createProblemStatus());
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

} // ProblemObservationOperations
