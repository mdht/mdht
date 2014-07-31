/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ObservationRange;
import org.openhealthtools.mdht.uml.cda.ReferenceRange;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.CognitiveStatusResultObservationOperations;
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
 * A static utility class that provides operations related to '<em><b>Cognitive Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateCognitiveStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cognitive Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CognitiveStatusResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationTextReference() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTextReferenceTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReference(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationTextReferenceValue() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationTextReferenceValue(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationValueDatatype() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationValueDatatype(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCodeP() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationCodePTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationCodeP(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationAuthor() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationAuthorTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAuthor(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationNonMedicinalSupplyActivity(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationCaregiverCharacteristics() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationCaregiverCharacteristics(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationAssessmentScaleObservation() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationAssessmentScaleObservation(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRange() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRange(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setCode(DatatypesFactory.eINSTANCE.createCD());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.getReferenceRanges().clear();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateCognitiveStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<CognitiveStatusResultObservation> validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateCognitiveStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue("VALIDATE_COGNITIVE_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.getReferenceRanges().clear();

				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateCognitiveStatusResultObservationReferenceRangeObservationRange(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateCognitiveStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {

		CognitiveStatusResultObservation target = objectFactory.create();
		target.getNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		CognitiveStatusResultObservation target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		CognitiveStatusResultObservation target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationTemplateId(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationClassCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationClassCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationMoodCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationMoodCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationMoodCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationId() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationIdTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationId(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE("373930000", "2.16.840.1.113883.6.96");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(CognitiveStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationText() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationTextTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationText(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCodeP() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationStatusCodePTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationStatusCodeP(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(CognitiveStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationStatusCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationEffectiveTime(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationValue() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationValueTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationValue(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationInterpretationCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationMethodCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationMethodCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateResultObservationTargetSiteCode() {
		OperationsTestCase<CognitiveStatusResultObservation> validateResultObservationTargetSiteCodeTestCase = new OperationsTestCase<CognitiveStatusResultObservation>(
			"validateResultObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CognitiveStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(CognitiveStatusResultObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CognitiveStatusResultObservationOperations.validateResultObservationTargetSiteCode(
					(CognitiveStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CognitiveStatusResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CognitiveStatusResultObservation> {
		public CognitiveStatusResultObservation create() {
			return ConsolFactory.eINSTANCE.createCognitiveStatusResultObservation();
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
	private static class ConstructorTestClass extends CognitiveStatusResultObservationOperations {
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

} // CognitiveStatusResultObservationOperations
