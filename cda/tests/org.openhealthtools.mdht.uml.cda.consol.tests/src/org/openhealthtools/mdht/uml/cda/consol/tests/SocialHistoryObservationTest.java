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
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationNoRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation No Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationNoInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation No Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationNoMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation No Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationNoTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation No Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationSocialHistoryStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#validateSocialHistoryObservationEpisodeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Observation Episode Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#getSocialHistoryStatusObservation() <em>Get Social History Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SocialHistoryObservation#getEpisodeObservation() <em>Get Episode Observation</em>}</li>
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
	public void testValidateSocialHistoryObservationCodeValueSet() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationCodeValueSetTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationCodeValueSet(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationNoRepeatNumber() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationNoRepeatNumberTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationNoRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationNoRepeatNumber(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationNoRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationNoInterpretationCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationNoInterpretationCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationNoInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationNoInterpretationCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationNoInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationNoMethodCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationNoMethodCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationNoMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationNoMethodCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationNoMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationNoTargetSiteCode() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationNoTargetSiteCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationNoTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationNoTargetSiteCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationNoTargetSiteCodeTestCase.doValidationTest();
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
	public void testValidateSocialHistoryObservationText() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationTextTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationText",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationText(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationTextTestCase.doValidationTest();
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
	public void testValidateSocialHistoryObservationEffectiveTime() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationEffectiveTimeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SocialHistoryObservation target) {

			}

			@Override
			protected void updateToPass(SocialHistoryObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SocialHistoryObservationOperations.validateSocialHistoryObservationEffectiveTime(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationEffectiveTimeTestCase.doValidationTest();
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
	@Test
	public void testValidateSocialHistoryObservationSocialHistoryStatusObservation() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationSocialHistoryStatusObservationTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationSocialHistoryStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_SOCIAL_HISTORY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationSocialHistoryStatusObservation(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationSocialHistoryStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSocialHistoryObservationEpisodeObservation() {
		OperationsTestCase<SocialHistoryObservation> validateSocialHistoryObservationEpisodeObservationTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateSocialHistoryObservationEpisodeObservation",
			operationsForOCL.getOCLValue("VALIDATE_SOCIAL_HISTORY_OBSERVATION_EPISODE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateSocialHistoryObservationEpisodeObservation(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateSocialHistoryObservationEpisodeObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistoryStatusObservation() {

		SocialHistoryObservation target = objectFactory.create();
		target.getSocialHistoryStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEpisodeObservation() {

		SocialHistoryObservation target = objectFactory.create();
		target.getEpisodeObservation();

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
