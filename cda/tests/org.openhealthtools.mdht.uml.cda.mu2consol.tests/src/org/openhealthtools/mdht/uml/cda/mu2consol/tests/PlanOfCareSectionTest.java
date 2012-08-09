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

import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PlanOfCareSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Plan Of Care Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Plan Of Care Section Care Planning For Plan Of Care
 * Section</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Plan Of Care Section Mu2consol Plan Of Care Section
 * Plan Of Care Activity Act</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Plan Of Care Section Mu2consol Plan Of Care Section
 * Plan Of Care Activity Encounter</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Plan Of Care Section Mu2consol Plan Of Care Section
 * Plan Of Care Activity Observation</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityAct()
 * <em>Getmu2consol Plan Of Care Activity Act</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityEncounter()
 * <em>Getmu2consol Plan Of Care Activity Encounter</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.PlanOfCareSection#getmu2consolPlanOfCareActivityObservation()
 * <em>Getmu2consol Plan Of Care Activity Observation</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class PlanOfCareSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSectionTestCase = new OperationsTestCase<PlanOfCareSection>(
				"validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_CARE_PLANNING_FOR_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations
						.validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSection(
								(PlanOfCareSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionCarePlanningForPlanOfCareSectionTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityActTestCase = new OperationsTestCase<PlanOfCareSection>(
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations
						.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityAct(
								(PlanOfCareSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityActTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounterTestCase = new OperationsTestCase<PlanOfCareSection>(
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations
						.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounter(
								(PlanOfCareSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityEncounterTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation() {
		OperationsTestCase<PlanOfCareSection> validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase = new OperationsTestCase<PlanOfCareSection>(
				"validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_PLAN_OF_CARE_SECTION_MU2CONSOL_PLAN_OF_CARE_SECTION_PLAN_OF_CARE_ACTIVITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareSection target) {

			}

			@Override
			protected void updateToPass(PlanOfCareSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareSectionOperations
						.validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservation(
								(PlanOfCareSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolPlanOfCareSectionMu2consolPlanOfCareSectionPlanOfCareActivityObservationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolPlanOfCareActivityAct() {

		PlanOfCareSection target = objectFactory.create();
		target.getmu2consolPlanOfCareActivityAct();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolPlanOfCareActivityEncounter() {

		PlanOfCareSection target = objectFactory.create();
		target.getmu2consolPlanOfCareActivityEncounter();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolPlanOfCareActivityObservation() {

		PlanOfCareSection target = objectFactory.create();
		target.getmu2consolPlanOfCareActivityObservation();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PlanOfCareSectionOperations {
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
			TestObjectFactory<PlanOfCareSection> {
		@Override
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
	private static class ConstructorTestClass extends
			PlanOfCareSectionOperations {
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

} // PlanOfCareSectionOperations