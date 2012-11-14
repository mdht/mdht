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
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PlanOfCareSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

public class PlanOfCareSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated not
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.addObservation(ConsolFactory.eINSTANCE.createPlanOfCareActivityObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCare(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated not
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {

				target.addObservation(ConsolFactory.eINSTANCE.createPlanOfCareActivityObservation().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validateMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolPlanOfCareActivityActs() {

		PlanOfCareSection target = objectFactory.create();
		target.getMu2consolPlanOfCareActivityActs();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolPlanOfCareActivityEncounters() {

		PlanOfCareSection target = objectFactory.create();
		target.getMu2consolPlanOfCareActivityEncounters();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolPlanOfCareActivityObservations() {

		PlanOfCareSection target = objectFactory.create();
		target.getMu2consolPlanOfCareActivityObservations();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePlanOfCareSectionTemplateId() {
		OperationsTestCase<PlanOfCareSection> validatePlanOfCareSectionTemplateIdTestCase = new OperationsTestCase<PlanOfCareSection>(
			"validatePlanOfCareSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations.validatePlanOfCareSectionTemplateId(
					(PlanOfCareSection) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PlanOfCareSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareSection> {

		public PlanOfCareSection create() {
			return Mu2consolFactory.eINSTANCE.createPlanOfCareSection();
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
	private static class ConstructorTestClass extends PlanOfCareSectionOperations {
	}

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

} // PlanOfCareSectionOperations
