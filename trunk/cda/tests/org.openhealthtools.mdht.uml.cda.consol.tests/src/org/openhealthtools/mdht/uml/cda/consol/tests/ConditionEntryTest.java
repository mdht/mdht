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
import org.openhealthtools.mdht.uml.cda.consol.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.ConditionEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHasUnknownResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryCauseOfDeathObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntrySeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryHealthStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#validateConditionEntryComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getCauseOfDeathObservation() <em>Get Cause Of Death Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getHealthStatusObservation() <em>Get Health Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ConditionEntry#getComments() <em>Get Comments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ConditionEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryInformationSource() {
		OperationsTestCase<ConditionEntry> validateConditionEntryInformationSourceTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryInformationSource(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryContainsPatientAwareness() {
		OperationsTestCase<ConditionEntry> validateConditionEntryContainsPatientAwarenessTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryContainsPatientAwareness(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryHasTextReference() {
		OperationsTestCase<ConditionEntry> validateConditionEntryHasTextReferenceTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryHasTextReference(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryCommentInversionInd() {
		OperationsTestCase<ConditionEntry> validateConditionEntryCommentInversionIndTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryCommentInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryCommentInversionInd(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryCommentInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryHasOnsetDate() {
		OperationsTestCase<ConditionEntry> validateConditionEntryHasOnsetDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryHasOnsetDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasOnsetDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryHasResolutionDate() {
		OperationsTestCase<ConditionEntry> validateConditionEntryHasResolutionDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryHasResolutionDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryHasUnknownResolutionDate() {
		OperationsTestCase<ConditionEntry> validateConditionEntryHasUnknownResolutionDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasUnknownResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasUnknownResolutionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryTemplateId() {
		OperationsTestCase<ConditionEntry> validateConditionEntryTemplateIdTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryTemplateId(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryMoodCode() {
		OperationsTestCase<ConditionEntry> validateConditionEntryMoodCodeTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryMoodCode(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryId() {
		OperationsTestCase<ConditionEntry> validateConditionEntryIdTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryId(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryCode() {
		OperationsTestCase<ConditionEntry> validateConditionEntryCodeTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryCode(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryText() {
		OperationsTestCase<ConditionEntry> validateConditionEntryTextTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryText",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryText(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryStatusCode() {
		OperationsTestCase<ConditionEntry> validateConditionEntryStatusCodeTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryStatusCode(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryEffectiveTime() {
		OperationsTestCase<ConditionEntry> validateConditionEntryEffectiveTimeTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryEffectiveTime(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryValue() {
		OperationsTestCase<ConditionEntry> validateConditionEntryValueTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryValue",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryValue(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryAgeObservation() {
		OperationsTestCase<ConditionEntry> validateConditionEntryAgeObservationTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryAgeObservation(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryCauseOfDeathObservation() {
		OperationsTestCase<ConditionEntry> validateConditionEntryCauseOfDeathObservationTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryCauseOfDeathObservation",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_CAUSE_OF_DEATH_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryCauseOfDeathObservation(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryCauseOfDeathObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryProblemStatusObservation() {
		OperationsTestCase<ConditionEntry> validateConditionEntryProblemStatusObservationTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryProblemStatusObservation(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntrySeverity() {
		OperationsTestCase<ConditionEntry> validateConditionEntrySeverityTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntrySeverity",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntrySeverity(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntrySeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryHealthStatusObservation() {
		OperationsTestCase<ConditionEntry> validateConditionEntryHealthStatusObservationTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHealthStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HEALTH_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryHealthStatusObservation(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHealthStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConditionEntryComment() {
		OperationsTestCase<ConditionEntry> validateConditionEntryCommentTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryComment",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConditionEntryOperations.validateConditionEntryComment(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryCommentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		ConditionEntry target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCauseOfDeathObservation() {

		ConditionEntry target = objectFactory.create();
		target.getCauseOfDeathObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatusObservation() {

		ConditionEntry target = objectFactory.create();
		target.getProblemStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverity() {

		ConditionEntry target = objectFactory.create();
		target.getSeverity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHealthStatusObservation() {

		ConditionEntry target = objectFactory.create();
		target.getHealthStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComments() {

		ConditionEntry target = objectFactory.create();
		target.getComments();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ConditionEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConditionEntry> {

		public ConditionEntry create() {
			return ConsolFactory.eINSTANCE.createConditionEntry();
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
	private static class ConstructorTestClass extends ConditionEntryOperations {
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

} // ConditionEntryOperations
