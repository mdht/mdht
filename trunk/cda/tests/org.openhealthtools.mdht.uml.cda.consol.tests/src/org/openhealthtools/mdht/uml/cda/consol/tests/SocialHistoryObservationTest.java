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
import org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SocialHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SocialHistoryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationOriginalText() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationOriginalTextTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationOriginalText(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationReference() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationReferenceTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationReference(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationTemplateId() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationTemplateId(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationClassCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationClassCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationClassCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationMoodCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationMoodCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationMoodCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationId() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationIdTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationId",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationId(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationStatusCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationStatusCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationStatusCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationValue() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationValueTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationValue(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SocialHistoryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SocialHistoryObservation> {
		public SocialHistoryObservation create() {
			return ConsolFactory.eINSTANCE.createSocialHistoryObservation();
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
	private static class ConstructorTestClass extends SocialHistoryObservationOperations {
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

} // SocialHistoryObservationOperations
