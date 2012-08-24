/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.SignsAndSymptomsObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Signs And Symptoms Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation#validateSignsAndSymptomsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Signs And Symptoms Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SignsAndSymptomsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationTemplateId() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationTemplateIdTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationTemplateId(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationClassCode() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationClassCodeTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationClassCode(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationMoodCode() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationMoodCodeTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationMoodCode(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationNegationInd() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationNegationIndTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationNegationInd(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationCodeP() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationCodePTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationCodeP(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationCode() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationCodeTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationCode(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationStatusCode() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationStatusCodeTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationStatusCode(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationStatusCodeP() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationStatusCodePTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationStatusCodeP(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationEffectiveTime() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationEffectiveTimeTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationEffectiveTime(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSignsAndSymptomsObservationValue() {
		OperationsTestCase<SignsAndSymptomsObservation> validateSignsAndSymptomsObservationValueTestCase = new OperationsTestCase<SignsAndSymptomsObservation>(
			"validateSignsAndSymptomsObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SIGNS_AND_SYMPTOMS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SignsAndSymptomsObservation target) {

			}

			@Override
			protected void updateToPass(SignsAndSymptomsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SignsAndSymptomsObservationOperations.validateSignsAndSymptomsObservationValue(
					(SignsAndSymptomsObservation) objectToTest, diagnostician, map);
			}

		};

		validateSignsAndSymptomsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SignsAndSymptomsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SignsAndSymptomsObservation> {
		public SignsAndSymptomsObservation create() {
			return PhcrFactory.eINSTANCE.createSignsAndSymptomsObservation();
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
	private static class ConstructorTestClass extends SignsAndSymptomsObservationOperations {
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

} // SignsAndSymptomsObservationOperations
