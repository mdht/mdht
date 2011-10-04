/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ihe.operations.SocialHistoryObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationNoTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation No Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.SocialHistoryObservation#validateIHESocialHistoryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Social History Observation Value</em>}</li>
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
	public void testValidateIHESocialHistoryObservationNoRepeatNumber() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationNoRepeatNumberTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationNoRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoRepeatNumber(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationNoRepeatNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHESocialHistoryObservationNoInterpretationCode() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationNoInterpretationCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationNoInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoInterpretationCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationNoInterpretationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHESocialHistoryObservationNoMethodCode() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationNoMethodCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationNoMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoMethodCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationNoMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHESocialHistoryObservationNoTargetSiteCode() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationNoTargetSiteCodeTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationNoTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_NO_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationNoTargetSiteCode(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationNoTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHESocialHistoryObservationTemplateId() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationTemplateIdTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationTemplateId(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHESocialHistoryObservationValue() {
		OperationsTestCase<SocialHistoryObservation> validateIHESocialHistoryObservationValueTestCase = new OperationsTestCase<SocialHistoryObservation>(
			"validateIHESocialHistoryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_IHE_SOCIAL_HISTORY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return SocialHistoryObservationOperations.validateIHESocialHistoryObservationValue(
					(SocialHistoryObservation) objectToTest, diagnostician, map);
			}

		};

		validateIHESocialHistoryObservationValueTestCase.doValidationTest();
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
			return IHEFactory.eINSTANCE.createSocialHistoryObservation();
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
