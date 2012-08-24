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
import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.CaseObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Case Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationAuthorAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Author Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateProblemObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateCaseObservationSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Case Observation Signs And Symptoms Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#getProblemStatusObservation() <em>Get Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#getSignsAndSymptomsObservations() <em>Get Signs And Symptoms Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation#validateProblemObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CaseObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationEffectiveTimeLow() {
		OperationsTestCase<CaseObservation> validateCaseObservationEffectiveTimeLowTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationEffectiveTimeLow(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationAuthor() {
		OperationsTestCase<CaseObservation> validateCaseObservationAuthorTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationAuthor(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationAuthorAssignedAuthor() {
		OperationsTestCase<CaseObservation> validateCaseObservationAuthorAssignedAuthorTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationAuthorAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_AUTHOR_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationAuthorAssignedAuthor(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationAuthorAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationClassCode() {
		OperationsTestCase<CaseObservation> validateCaseObservationClassCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationClassCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationMoodCode() {
		OperationsTestCase<CaseObservation> validateCaseObservationMoodCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationMoodCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationId() {
		OperationsTestCase<CaseObservation> validateCaseObservationIdTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationId",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationId(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationCode() {
		OperationsTestCase<CaseObservation> validateCaseObservationCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationCode() {
		OperationsTestCase<CaseObservation> validateProblemObservationCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateProblemObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateProblemObservationCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationStatusCode() {
		OperationsTestCase<CaseObservation> validateCaseObservationStatusCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationStatusCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationEffectiveTime() {
		OperationsTestCase<CaseObservation> validateCaseObservationEffectiveTimeTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationEffectiveTime(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationValue() {
		OperationsTestCase<CaseObservation> validateCaseObservationValueTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationValue(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationProblemStatusObservation() {
		OperationsTestCase<CaseObservation> validateCaseObservationProblemStatusObservationTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationProblemStatusObservation(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCaseObservationSignsAndSymptomsObservation() {
		OperationsTestCase<CaseObservation> validateCaseObservationSignsAndSymptomsObservationTestCase = new OperationsTestCase<CaseObservation>(
			"validateCaseObservationSignsAndSymptomsObservation",
			operationsForOCL.getOCLValue("VALIDATE_CASE_OBSERVATION_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateCaseObservationSignsAndSymptomsObservation(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateCaseObservationSignsAndSymptomsObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatusObservation() {

		CaseObservation target = objectFactory.create();
		target.getProblemStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSignsAndSymptomsObservations() {

		CaseObservation target = objectFactory.create();
		target.getSignsAndSymptomsObservations();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationTemplateId() {
		OperationsTestCase<CaseObservation> validateProblemObservationTemplateIdTestCase = new OperationsTestCase<CaseObservation>(
			"validateProblemObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateProblemObservationTemplateId(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProblemObservationStatusCode() {
		OperationsTestCase<CaseObservation> validateProblemObservationStatusCodeTestCase = new OperationsTestCase<CaseObservation>(
			"validateProblemObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CaseObservation target) {

			}

			@Override
			protected void updateToPass(CaseObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CaseObservationOperations.validateProblemObservationStatusCode(
					(CaseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProblemObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CaseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CaseObservation> {
		public CaseObservation create() {
			return PhcrFactory.eINSTANCE.createCaseObservation();
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
	private static class ConstructorTestClass extends CaseObservationOperations {
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

} // CaseObservationOperations
