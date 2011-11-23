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
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationTargetOfEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Target Of Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation#validateAllergyStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergyStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationTargetOfEntryRelationship() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationTargetOfEntryRelationshipTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationTargetOfEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_TARGET_OF_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationTargetOfEntryRelationship(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationTargetOfEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationNoAdditionalParticipants() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationNoAdditionalParticipants(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationNoAdditionalRelationships() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationNoAdditionalRelationships(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationHasTextReference() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationHasTextReferenceTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationHasTextReference(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationTemplateId() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationTemplateIdTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationTemplateId(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationClassCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationClassCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationClassCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationMoodCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationMoodCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationMoodCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationText() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationTextTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationText(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationStatusCode() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationStatusCodeTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationStatusCode(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyStatusObservationValue() {
		OperationsTestCase<AllergyStatusObservation> validateAllergyStatusObservationValueTestCase = new OperationsTestCase<AllergyStatusObservation>(
			"validateAllergyStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyStatusObservation target) {

			}

			@Override
			protected void updateToPass(AllergyStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyStatusObservationOperations.validateAllergyStatusObservationValue(
					(AllergyStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyStatusObservation> {

		public AllergyStatusObservation create() {
			return ConsolFactory.eINSTANCE.createAllergyStatusObservation();
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
	private static class ConstructorTestClass extends AllergyStatusObservationOperations {
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

} // AllergyStatusObservationOperations
