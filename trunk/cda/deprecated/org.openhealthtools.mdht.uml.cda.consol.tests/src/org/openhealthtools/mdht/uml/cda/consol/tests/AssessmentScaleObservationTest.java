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
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationInterpretationCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Interpretation Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationDerivationExpr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Derivation Expr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationAssessmentScaleSupportingObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Assessment Scale Supporting Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRangeObservationRangeTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range Observation Range Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range Observation Range Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range Observation Range Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRangeObservationRangeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range Observation Range Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#validateAssessmentScaleObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation#getAssessmentScaleSupportingObservations() <em>Get Assessment Scale Supporting Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentScaleObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationCodeCodeSystem() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationCodeCodeSystemTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.1", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationCodeCodeSystem(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationInterpretationCodeTranslation() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationInterpretationCodeTranslationTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationInterpretationCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_INTERPRETATION_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.getInterpretationCodes().clear();
				CE ic = DatatypesFactory.eINSTANCE.createCE();
				ic.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.getInterpretationCodes().add(ic);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationInterpretationCodeTranslation(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationInterpretationCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationTemplateId() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationTemplateIdTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationTemplateId(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationClassCode() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationClassCodeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationClassCode(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationMoodCode() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationMoodCodeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationMoodCode(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationCode() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationCodeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationCode(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationDerivationExpr() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationDerivationExprTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationDerivationExpr",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_DERIVATION_EXPR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				target.setDerivationExpr(DatatypesFactory.eINSTANCE.createST());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationDerivationExpr(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationDerivationExprTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationEffectiveTime() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationEffectiveTimeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationEffectiveTime(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationId() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationIdTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationId(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationInterpretationCode() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationInterpretationCodeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationInterpretationCode(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationStatusCode() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationStatusCodeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationStatusCode(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationStatusCodeP() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationStatusCodePTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationStatusCodeP(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleObservationValue() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationValueTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationValue(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationAuthor() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationAuthorTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationAuthor(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRange() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRange(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationAssessmentScaleSupportingObservation() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationAssessmentScaleSupportingObservationTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationAssessmentScaleSupportingObservation",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleSupportingObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationAssessmentScaleSupportingObservation(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationAssessmentScaleSupportingObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRangeObservationRangeTextReference() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRangeObservationRangeTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(DatatypesFactory.eINSTANCE.createED());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.getReferenceRanges().clear();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(txt);
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeTextReference(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValueTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				or.setText(txt);
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.getReferenceRanges().clear();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(txt);
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValue(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeObservationRangeTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValueTestCase = new NarrativeReferenceTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				ED txt = createEDWithReference("Some sample text", "#1.2.3.4");
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(txt);
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValue(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeObservationRangeReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRangeObservationRangeText() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeObservationRangeTextTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRangeObservationRangeText",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setText(DatatypesFactory.eINSTANCE.createED());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRangeText(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeObservationRangeTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleObservationReferenceRangeObservationRange() {
		OperationsTestCase<AssessmentScaleObservation> validateAssessmentScaleObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<AssessmentScaleObservation>(
			"validateAssessmentScaleObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected void updateToPass(AssessmentScaleObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				rr.setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleObservationOperations.validateAssessmentScaleObservationReferenceRangeObservationRange(
					(AssessmentScaleObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleSupportingObservations() {

		AssessmentScaleObservation target = objectFactory.create();
		target.getAssessmentScaleSupportingObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentScaleObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentScaleObservation> {
		public AssessmentScaleObservation create() {
			return ConsolFactory.eINSTANCE.createAssessmentScaleObservation();
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
	private static class ConstructorTestClass extends AssessmentScaleObservationOperations {
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

} // AssessmentScaleObservationOperations
