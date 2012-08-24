/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AssessmentAndPlanSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Assessment And Plan Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivityProcedure() <em>Get Plan Of Care Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivitySubstanceAdministration() <em>Get Plan Of Care Activity Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getPlanOfCareActivitySupply() <em>Get Plan Of Care Activity Supply</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.AssessmentAndPlanSection#getProblemObservation() <em>Get Problem Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentAndPlanSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivityProcedure() {


AssessmentAndPlanSection target = objectFactory.create();
target.getPlanOfCareActivityProcedure();



}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivitySubstanceAdministration() {


AssessmentAndPlanSection target = objectFactory.create();
target.getPlanOfCareActivitySubstanceAdministration();



}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetPlanOfCareActivitySupply() {


AssessmentAndPlanSection target = objectFactory.create();
target.getPlanOfCareActivitySupply();



}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemObservation() {


AssessmentAndPlanSection target = objectFactory.create();
target.getProblemObservation();



}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			AssessmentAndPlanSectionOperations {
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
			TestObjectFactory<AssessmentAndPlanSection> {
		@Override
		public AssessmentAndPlanSection create() {
			return Mu2consolFactory.eINSTANCE.createAssessmentAndPlanSection();
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
			AssessmentAndPlanSectionOperations {
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

} // AssessmentAndPlanSectionOperations