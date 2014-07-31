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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusResultObservationOperations;
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
 * A static utility class that provides operations related to '<em><b>Functional Status Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationValueDatatype(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Value Datatype</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range No Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateFunctionalStatusResultObservationReferenceRangeObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Result Observation Reference Range Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getNonMedicinalSupplyActivity() <em>Get Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getCaregiverCharacteristics() <em>Get Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#getAssessmentScaleObservation() <em>Get Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation#validateResultObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusResultObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationTextReference() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTextReferenceTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationTextReference",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReference(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationTextReferenceValue() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationTextReferenceValueTestCase = new NarrativeReferenceTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationTextReferenceValue(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationValueDatatype() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationValueDatatypeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationValueDatatype",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_VALUE_DATATYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getValues().clear();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationValueDatatype(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationValueDatatypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationCodeP() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationCodeP(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationAuthor() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAuthorTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAuthor(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationNonMedicinalSupplyActivity(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationCaregiverCharacteristics() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationCaregiverCharacteristics(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationAssessmentScaleObservation() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationAssessmentScaleObservationTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationAssessmentScaleObservation(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRange",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE_NO_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				ObservationRange or = CDAFactory.eINSTANCE.createObservationRange();
				or.setCode(DatatypesFactory.eINSTANCE.createCD());
				rr.setObservationRange(or);
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				rr.setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
				target.getReferenceRanges().add(rr);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeNoCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusResultObservationReferenceRangeObservationRange() {
		OperationsTestCase<FunctionalStatusResultObservation> validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateFunctionalStatusResultObservationReferenceRangeObservationRange",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_RESULT_OBSERVATION_REFERENCE_RANGE_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {
				target.init();
				target.getReferenceRanges().add(CDAFactory.eINSTANCE.createReferenceRange());
			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.getReferenceRanges().clear();
				ReferenceRange rr = CDAFactory.eINSTANCE.createReferenceRange();
				rr.setObservationRange(CDAFactory.eINSTANCE.createObservationRange());
				target.getReferenceRanges().add(rr);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateFunctionalStatusResultObservationReferenceRangeObservationRange(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusResultObservationReferenceRangeObservationRangeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivity() {

		FunctionalStatusResultObservation target = objectFactory.create();
		target.getNonMedicinalSupplyActivity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristics() {

		FunctionalStatusResultObservation target = objectFactory.create();
		target.getCaregiverCharacteristics();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservation() {

		FunctionalStatusResultObservation target = objectFactory.create();
		target.getAssessmentScaleObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTemplateId(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationClassCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationClassCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationMoodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationMoodCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationIdTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationId(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE("", "2.16.840.1.113883.6.1", "", "");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(FunctionalStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTextTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationText",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationText(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationStatusCodePTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationStatusCodeP(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(FunctionalStatusResultObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ResultObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationStatusCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationEffectiveTime(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationValueTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationValue(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getInterpretationCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationInterpretationCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationMethodCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationMethodCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusResultObservation> validateResultObservationTargetSiteCodeTestCase = new OperationsTestCase<FunctionalStatusResultObservation>(
			"validateResultObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusResultObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusResultObservation target) {
				target.init();
				target.getTargetSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusResultObservationOperations.validateResultObservationTargetSiteCode(
					(FunctionalStatusResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusResultObservation> {
		public FunctionalStatusResultObservation create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusResultObservation();
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
	private static class ConstructorTestClass extends FunctionalStatusResultObservationOperations {
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

} // FunctionalStatusResultObservationOperations
