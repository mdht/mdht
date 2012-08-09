/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanForConditionOrConcernOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan For Condition Or Concern</b></em>'
 * model objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanForConditionOrConcern#getProblemObservation()
 * <em>Get Problem Observation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class AssessmentAndPlanForConditionOrConcernTest extends
		CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemObservation() {

		AssessmentAndPlanForConditionOrConcern target = objectFactory.create();
		target.getProblemObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			AssessmentAndPlanForConditionOrConcernOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<AssessmentAndPlanForConditionOrConcern> {
		@Override
		public AssessmentAndPlanForConditionOrConcern create() {
			return Mu2consolFactory.eINSTANCE
					.createAssessmentAndPlanForConditionOrConcern();
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
	private static class ConstructorTestClass extends
			AssessmentAndPlanForConditionOrConcernOperations {
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

} // AssessmentAndPlanForConditionOrConcernOperations