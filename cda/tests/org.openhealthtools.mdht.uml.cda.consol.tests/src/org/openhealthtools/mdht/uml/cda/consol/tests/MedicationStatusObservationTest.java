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
import org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationTargetOfEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Target Of Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationStatusObservation#validateMedicationStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Status Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationTargetOfEntryRelationship() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationTargetOfEntryRelationshipTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationTargetOfEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_TARGET_OF_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationTargetOfEntryRelationship(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationTargetOfEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationNoAdditionalParticipants() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationNoAdditionalParticipants(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationNoAdditionalRelationships() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationNoAdditionalRelationships(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationTemplateId() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationTemplateIdTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationTemplateId(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationClassCode() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationClassCodeTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationClassCode(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationMoodCode() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationMoodCodeTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationMoodCode(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationCode() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationCodeTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationCode(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationStatusObservationStatusCode() {
		OperationsTestCase<MedicationStatusObservation> validateMedicationStatusObservationStatusCodeTestCase = new OperationsTestCase<MedicationStatusObservation>(
			"validateMedicationStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationStatusObservation target) {

			}

			@Override
			protected void updateToPass(MedicationStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationStatusObservationOperations.validateMedicationStatusObservationStatusCode(
					(MedicationStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationStatusObservation> {
		public MedicationStatusObservation create() {
			return ConsolFactory.eINSTANCE.createMedicationStatusObservation();
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
	private static class ConstructorTestClass extends MedicationStatusObservationOperations {
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

} // MedicationStatusObservationOperations
