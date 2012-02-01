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
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryStatusObservation#validateSocialHistoryStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationNoAdditionalParticipants() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationNoAdditionalParticipants(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationNoAdditionalRelationships() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationNoAdditionalRelationships(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationTemplateId() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationTemplateIdTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationTemplateId(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationClassCode() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationClassCodeTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationClassCode(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationMoodCode() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationMoodCodeTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationMoodCode(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationCode() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationCodeTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationCode(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationStatusCode() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationStatusCodeTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationStatusCode(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryStatusObservationValue() {
		OperationsTestCase<SocialHistoryStatusObservation> validateSocialHistoryStatusObservationValueTestCase = new OperationsTestCase<SocialHistoryStatusObservation>(
			"validateSocialHistoryStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryStatusObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryStatusObservationOperations.validateSocialHistoryStatusObservationValue(
					(SocialHistoryStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistoryStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistoryStatusObservation> {
		public SocialHistoryStatusObservation create() {
			return ConsolFactory.eINSTANCE.createSocialHistoryStatusObservation();
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
	private static class ConstructorTestClass extends SocialHistoryStatusObservationOperations {
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

} // SocialHistoryStatusObservationOperations
