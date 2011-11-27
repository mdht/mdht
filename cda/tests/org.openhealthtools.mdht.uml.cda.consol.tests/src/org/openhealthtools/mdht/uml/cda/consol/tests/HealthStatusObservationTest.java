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
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.HealthStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTargetOfEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Target Of Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation#validateHealthStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HealthStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationTargetOfEntryRelationship() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTargetOfEntryRelationshipTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationTargetOfEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TARGET_OF_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationTargetOfEntryRelationship(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTargetOfEntryRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationNoAdditionalParticipants() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationNoAdditionalParticipants(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationNoAdditionalRelationships() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationNoAdditionalRelationships(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationHasTextReference() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationHasTextReferenceTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationHasTextReference(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationTemplateId() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTemplateIdTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationTemplateId(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationClassCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationClassCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationClassCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationMoodCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationMoodCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationMoodCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationText() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationTextTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationText",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationText(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationStatusCode() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationStatusCodeTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationStatusCode(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthStatusObservationValue() {
		OperationsTestCase<HealthStatusObservation> validateHealthStatusObservationValueTestCase = new OperationsTestCase<HealthStatusObservation>(
			"validateHealthStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HealthStatusObservation target) {

			}

			@Override
			protected void updateToPass(HealthStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HealthStatusObservationOperations.validateHealthStatusObservationValue(
					(HealthStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateHealthStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HealthStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthStatusObservation> {
		public HealthStatusObservation create() {
			return ConsolFactory.eINSTANCE.createHealthStatusObservation();
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
	private static class ConstructorTestClass extends HealthStatusObservationOperations {
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

} // HealthStatusObservationOperations
