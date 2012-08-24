/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanForCarePlanningOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan For Care Planning</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment And Plan For Care Planning One Of Plan Of Care Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForCarePlanning#getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentAndPlanForCarePlanningTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry() {
		OperationsTestCase<AssessmentAndPlanForCarePlanning> validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntryTestCase = new OperationsTestCase<AssessmentAndPlanForCarePlanning>(
			"validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_AND_PLAN_FOR_CARE_PLANNING_ONE_OF_PLAN_OF_CARE_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentAndPlanForCarePlanning target) {

			}

			@Override
			protected void updateToPass(AssessmentAndPlanForCarePlanning target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentAndPlanForCarePlanningOperations.validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntry(
					(AssessmentAndPlanForCarePlanning) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentAndPlanForCarePlanningOneOfPlanOfCareEntryTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivityProcedure() {

		AssessmentAndPlanForCarePlanning target = objectFactory.create();
		target.getPlanOfCareActivityProcedure();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivitySubstanceAdministration() {

		AssessmentAndPlanForCarePlanning target = objectFactory.create();
		target.getPlanOfCareActivitySubstanceAdministration();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivitySupply() {

		AssessmentAndPlanForCarePlanning target = objectFactory.create();
		target.getPlanOfCareActivitySupply();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AssessmentAndPlanForCarePlanningOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentAndPlanForCarePlanning> {

		public AssessmentAndPlanForCarePlanning create() {
			return Mu2consolFactory.eINSTANCE.createAssessmentAndPlanForCarePlanning();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends AssessmentAndPlanForCarePlanningOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // AssessmentAndPlanForCarePlanningOperations
