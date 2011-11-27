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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryDeathObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Death Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#validateFamilyHistoryDeathObservationProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Death Observation Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryDeathObservation#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryDeathObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationHasSubjectPatientRelationship() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationHasSubjectPatientRelationshipTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationHasSubjectPatientRelationship",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasSubjectPatientRelationship(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationHasSubjectPatientRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationRelationshipValueCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationRelationshipValueCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationRelationshipValueCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelationshipValueCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationRelationshipValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationHasRelatedSubjectCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationHasRelatedSubjectCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationHasRelatedSubjectCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasRelatedSubjectCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationHasRelatedSubjectCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSetTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSet(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationRelatedSubjectCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationHasRelatedSubjectSubject() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationHasRelatedSubjectSubjectTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationHasRelatedSubjectSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasRelatedSubjectSubject(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationHasRelatedSubjectSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationHasGenderCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationHasGenderCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationHasGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationHasGenderCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationHasGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationRelatedSubjectBirthTime() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationRelatedSubjectBirthTimeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationRelatedSubjectBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationRelatedSubjectBirthTime(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationRelatedSubjectBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationTemplateId() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationTemplateId(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationMoodCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationMoodCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationMoodCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationId() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationIdTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationId(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationStatusCode() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationStatusCodeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationStatusCode(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationEffectiveTime() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationEffectiveTimeTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationEffectiveTime(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryDeathObservationProblemStatusObservation() {
		OperationsTestCase<FamilyHistoryDeathObservation> validateFamilyHistoryDeathObservationProblemStatusObservationTestCase = new OperationsTestCase<FamilyHistoryDeathObservation>(
			"validateFamilyHistoryDeathObservationProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_DEATH_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryDeathObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryDeathObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryDeathObservationOperations.validateFamilyHistoryDeathObservationProblemStatusObservation(
					(FamilyHistoryDeathObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryDeathObservationProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatusObservation() {

		FamilyHistoryDeathObservation target = objectFactory.create();
		target.getProblemStatusObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryDeathObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryDeathObservation> {
		public FamilyHistoryDeathObservation create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryDeathObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryDeathObservationOperations {
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

} // FamilyHistoryDeathObservationOperations
