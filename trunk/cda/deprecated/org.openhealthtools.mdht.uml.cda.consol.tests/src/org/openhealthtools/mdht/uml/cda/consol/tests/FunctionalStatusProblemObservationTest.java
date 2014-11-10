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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Functional Status Problem Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationValueNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Value Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Non Medicinal Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationCaregiverCharacteristics(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Caregiver Characteristics</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateFunctionalStatusProblemObservationAssessmentScaleObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Functional Status Problem Observation Assessment Scale Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getNonMedicinalSupplyActivities() <em>Get Non Medicinal Supply Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getCaregiverCharacteristicss() <em>Get Caregiver Characteristicss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#getAssessmentScaleObservations() <em>Get Assessment Scale Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation#validateProblemObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FunctionalStatusProblemObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationHasTextReference() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationHasTextReferenceTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				target.setText(txt);
			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasTextReference(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationTextReferenceValue() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationTextReferenceValueTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {
				target.init();
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(txt);
			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				ED txt = DatatypesFactory.eINSTANCE.createED();
				txt.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				target.setText(txt);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationTextReferenceValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationHasTextReferenceValue() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationHasTextReferenceValueTestCase = new NarrativeReferenceTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationHasTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {
				target.init();

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasTextReferenceValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationHasTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationHasOnsetDate() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationHasOnsetDateTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasOnsetDate(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationHasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationHasResolutionDate() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationHasResolutionDateTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationHasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("1", "2"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationHasResolutionDate(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationValueNullFlavor() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationValueNullFlavorTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationValueNullFlavor",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_VALUE_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {
				target.init();
				target.getValues().add(DatatypesFactory.eINSTANCE.createCD());
			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.getValues().get(0).setNullFlavor(NullFlavor.NA);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationValueNullFlavor(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationValueNullFlavorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationMethodCode() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationMethodCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				target.getMethodCodes().add(DatatypesFactory.eINSTANCE.createCE());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationMethodCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationNonMedicinalSupplyActivity() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_NON_MEDICINAL_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setSupply(ConsolFactory.eINSTANCE.createNonMedicinalSupplyActivity().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationNonMedicinalSupplyActivity(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationNonMedicinalSupplyActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationCaregiverCharacteristics() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationCaregiverCharacteristicsTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationCaregiverCharacteristics",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_CAREGIVER_CHARACTERISTICS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				er.setObservation(ConsolFactory.eINSTANCE.createCaregiverCharacteristics().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationCaregiverCharacteristics(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationCaregiverCharacteristicsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateFunctionalStatusProblemObservationAssessmentScaleObservation() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateFunctionalStatusProblemObservationAssessmentScaleObservationTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateFunctionalStatusProblemObservationAssessmentScaleObservation",
			operationsForOCL.getOCLValue("VALIDATE_FUNCTIONAL_STATUS_PROBLEM_OBSERVATION_ASSESSMENT_SCALE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setObservation(ConsolFactory.eINSTANCE.createAssessmentScaleObservation().init());
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateFunctionalStatusProblemObservationAssessmentScaleObservation(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateFunctionalStatusProblemObservationAssessmentScaleObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonMedicinalSupplyActivities() {

		FunctionalStatusProblemObservation target = objectFactory.create();
		target.getNonMedicinalSupplyActivities();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaregiverCharacteristicss() {

		FunctionalStatusProblemObservation target = objectFactory.create();
		target.getCaregiverCharacteristicss();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAssessmentScaleObservations() {

		FunctionalStatusProblemObservation target = objectFactory.create();
		target.getAssessmentScaleObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationTemplateId(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationClassCode() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationClassCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationClassCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationMoodCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationMoodCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationNegationIndTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();
				target.setNegationInd(true);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationNegationInd(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationIdTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationId(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationCodePTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationCodeP(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("248536006", "2.16.840.1.113883.6.96", "", "");
				target.setCode(cd);

			}

			@Override
			protected void setDependency(FunctionalStatusProblemObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationTextTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationText",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationText(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationStatusCode(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
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
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationEffectiveTimeTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationEffectiveTime(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationValueP() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationValuePTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationValueP(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateProblemObservationValue() {
		OperationsTestCase<FunctionalStatusProblemObservation> validateProblemObservationValueTestCase = new OperationsTestCase<FunctionalStatusProblemObservation>(
			"validateProblemObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FunctionalStatusProblemObservation target) {

			}

			@Override
			protected void updateToPass(FunctionalStatusProblemObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected void setDependency(FunctionalStatusProblemObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.ProblemObservationValueP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FunctionalStatusProblemObservationOperations.validateProblemObservationValue(
					(FunctionalStatusProblemObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FunctionalStatusProblemObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FunctionalStatusProblemObservation> {
		public FunctionalStatusProblemObservation create() {
			return ConsolFactory.eINSTANCE.createFunctionalStatusProblemObservation();
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
	private static class ConstructorTestClass extends FunctionalStatusProblemObservationOperations {
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

} // FunctionalStatusProblemObservationOperations
