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
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.NumberOfPressureUlcersObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Number Of Pressure Ulcers Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation#validateNumberOfPressureUlcersObservationEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Number Of Pressure Ulcers Observation Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NumberOfPressureUlcersObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationTemplateId() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationTemplateIdTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationTemplateId(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationClassCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationClassCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationClassCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationMoodCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationMoodCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationMoodCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationId() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationIdTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationId",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationId(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationCodeP() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationCodePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationCodeP(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("2264892003", "2.16.840.1.113883.6.96", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationStatusCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationStatusCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationStatusCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationStatusCodeP() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationStatusCodePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationStatusCodeP(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEffectiveTime() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEffectiveTimeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEffectiveTime(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationValue() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationValueTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();

				INT value = DatatypesFactory.eINSTANCE.createINT();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationValue(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationAuthor() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationAuthorTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();
				target.getAuthors().add(CDAFactory.eINSTANCE.createAuthor());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationAuthor(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationship() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CDAFactory.eINSTANCE.createObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationship(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CDAFactory.eINSTANCE.createObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setClassCode(ActClassObservation.OBS);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CDAFactory.eINSTANCE.createObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.setMoodCode(x_ActMoodDocumentObservation.EVN);
				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationValue() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.getValues().add(DatatypesFactory.eINSTANCE.createCD());

				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.getValues().add(DatatypesFactory.eINSTANCE.createCD("421076008", "2.16.840.1.113883.6.96", "", ""));

				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValue(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipObservationValuePTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				er.setObservation(obs);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.getEntryRelationships().clear();

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				Observation obs = CDAFactory.eINSTANCE.createObservation();
				obs.getValues().add(DatatypesFactory.eINSTANCE.createCD("421076008", "2.16.840.1.113883.6.96", "", ""));

				er.setObservation(obs);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservationValueP(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipTypeCode() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipTypeCodeTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {

			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CDAFactory.eINSTANCE.createObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipTypeCode(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateNumberOfPressureUlcersObservationEntryRelationshipObservation() {
		OperationsTestCase<NumberOfPressureUlcersObservation> validateNumberOfPressureUlcersObservationEntryRelationshipObservationTestCase = new OperationsTestCase<NumberOfPressureUlcersObservation>(
			"validateNumberOfPressureUlcersObservationEntryRelationshipObservation",
			operationsForOCL.getOCLValue("VALIDATE_NUMBER_OF_PRESSURE_ULCERS_OBSERVATION_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NumberOfPressureUlcersObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(NumberOfPressureUlcersObservation target) {
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CDAFactory.eINSTANCE.createObservation());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NumberOfPressureUlcersObservationOperations.validateNumberOfPressureUlcersObservationEntryRelationshipObservation(
					(NumberOfPressureUlcersObservation) objectToTest, diagnostician, map);
			}

		};

		validateNumberOfPressureUlcersObservationEntryRelationshipObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NumberOfPressureUlcersObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NumberOfPressureUlcersObservation> {
		public NumberOfPressureUlcersObservation create() {
			return ConsolFactory.eINSTANCE.createNumberOfPressureUlcersObservation();
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
	private static class ConstructorTestClass extends NumberOfPressureUlcersObservationOperations {
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

} // NumberOfPressureUlcersObservationOperations
