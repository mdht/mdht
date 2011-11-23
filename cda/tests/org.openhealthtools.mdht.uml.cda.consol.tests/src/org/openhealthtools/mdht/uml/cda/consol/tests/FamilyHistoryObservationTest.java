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
import org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FamilyHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasSubjectPatientRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Subject Patient Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelationshipValueCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Relationship Value Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasRelatedSubjectCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasRelatedSubjectSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Related Subject Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationRelatedSubjectBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Related Subject Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#validateFamilyHistoryObservationAgeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Observation Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getAgeObservation() <em>Get Age Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FamilyHistoryObservation#getFamilyHistoryDeathObservation() <em>Get Family History Death Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationHasSubjectPatientRelationship() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationHasSubjectPatientRelationshipTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationHasSubjectPatientRelationship",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_SUBJECT_PATIENT_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasSubjectPatientRelationship(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationHasSubjectPatientRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationRelationshipValueCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationRelationshipValueCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationRelationshipValueCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATIONSHIP_VALUE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelationshipValueCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationRelationshipValueCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationHasRelatedSubjectCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationHasRelatedSubjectCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationHasRelatedSubjectCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasRelatedSubjectCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationHasRelatedSubjectCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationRelatedSubjectCodeValueSet() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationRelatedSubjectCodeValueSetTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationRelatedSubjectCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelatedSubjectCodeValueSet(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationRelatedSubjectCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationHasRelatedSubjectSubject() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationHasRelatedSubjectSubjectTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationHasRelatedSubjectSubject",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_RELATED_SUBJECT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasRelatedSubjectSubject(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationHasRelatedSubjectSubjectTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationHasGenderCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationHasGenderCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationHasGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationHasGenderCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationHasGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationRelatedSubjectBirthTime() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationRelatedSubjectBirthTimeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationRelatedSubjectBirthTime",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_RELATED_SUBJECT_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationRelatedSubjectBirthTime(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationRelatedSubjectBirthTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationTemplateId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationTemplateIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationTemplateId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationId() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationIdTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationId(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationStatusCode() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationStatusCodeTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationStatusCode(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationValue() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationValueTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationValue(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryObservationAgeObservation() {
		OperationsTestCase<FamilyHistoryObservation> validateFamilyHistoryObservationAgeObservationTestCase = new OperationsTestCase<FamilyHistoryObservation>(
			"validateFamilyHistoryObservationAgeObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_OBSERVATION_AGE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistoryObservation target) {

			}

			@Override
			protected void updateToPass(FamilyHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryObservationOperations.validateFamilyHistoryObservationAgeObservation(
					(FamilyHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryObservationAgeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAgeObservation() {

		FamilyHistoryObservation target = objectFactory.create();
		target.getAgeObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistoryDeathObservation() {

		FamilyHistoryObservation target = objectFactory.create();
		target.getFamilyHistoryDeathObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistoryObservation> {

		public FamilyHistoryObservation create() {
			return ConsolFactory.eINSTANCE.createFamilyHistoryObservation();
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
	private static class ConstructorTestClass extends FamilyHistoryObservationOperations {
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

} // FamilyHistoryObservationOperations
