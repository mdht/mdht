/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.FamilyHistoryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Family History</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryRelatedSubjectCodeValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Related Subject Code Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryHasFamilyName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Family Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryHasGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Has Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryFamilyMemberCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Family Member Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#validateFamilyHistoryProblemStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Family History Problem Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory#getProblemStatusObservations() <em>Get Problem Status Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistoryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryRelatedSubjectCodeValueSet() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryRelatedSubjectCodeValueSetTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryRelatedSubjectCodeValueSet",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_RELATED_SUBJECT_CODE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryRelatedSubjectCodeValueSet(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryRelatedSubjectCodeValueSetTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryHasFamilyName() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryHasFamilyNameTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryHasFamilyName",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_HAS_FAMILY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryHasFamilyName(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryHasFamilyNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryHasGenderCode() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryHasGenderCodeTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryHasGenderCode",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_HAS_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryHasGenderCode(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryHasGenderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryFamilyMemberCondition() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryFamilyMemberConditionTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryFamilyMemberCondition",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_FAMILY_MEMBER_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryFamilyMemberCondition(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryFamilyMemberConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryTemplateId() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryTemplateIdTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryTemplateId(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFamilyHistoryProblemStatusObservation() {
		OperationsTestCase<FamilyHistory> validateFamilyHistoryProblemStatusObservationTestCase = new OperationsTestCase<FamilyHistory>(
			"validateFamilyHistoryProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_FAMILY_HISTORY_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistory target) {

			}

			@Override
			protected void updateToPass(FamilyHistory target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistoryOperations.validateFamilyHistoryProblemStatusObservation(
					(FamilyHistory) objectToTest, diagnostician, map);
			}

		};

		validateFamilyHistoryProblemStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemStatusObservations() {

		FamilyHistory target = objectFactory.create();
		target.getProblemStatusObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FamilyHistoryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistory> {
		public FamilyHistory create() {
			return HITSPFactory.eINSTANCE.createFamilyHistory();
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
	private static class ConstructorTestClass extends FamilyHistoryOperations {
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

} // FamilyHistoryOperations
