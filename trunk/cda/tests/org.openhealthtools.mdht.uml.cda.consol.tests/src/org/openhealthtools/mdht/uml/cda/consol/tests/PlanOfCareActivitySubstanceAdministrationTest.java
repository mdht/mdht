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
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivitySubstanceAdministrationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Plan Of Care Activity Substance Administration</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivitySubstanceAdministration#validatePlanOfCareActivitySubstanceAdministrationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Substance Administration Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PlanOfCareActivitySubstanceAdministrationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationTemplateId() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationTemplateId(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePlanOfCareActivitySubstanceAdministrationId() {
		OperationsTestCase<PlanOfCareActivitySubstanceAdministration> validatePlanOfCareActivitySubstanceAdministrationIdTestCase = new OperationsTestCase<PlanOfCareActivitySubstanceAdministration>(
			"validatePlanOfCareActivitySubstanceAdministrationId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_SUBSTANCE_ADMINISTRATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PlanOfCareActivitySubstanceAdministration target) {

			}

			@Override
			protected void updateToPass(PlanOfCareActivitySubstanceAdministration target) {
				target.init();
				II id = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(id);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PlanOfCareActivitySubstanceAdministrationOperations.validatePlanOfCareActivitySubstanceAdministrationId(
					(PlanOfCareActivitySubstanceAdministration) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivitySubstanceAdministrationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PlanOfCareActivitySubstanceAdministrationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PlanOfCareActivitySubstanceAdministration> {
		public PlanOfCareActivitySubstanceAdministration create() {
			return ConsolFactory.eINSTANCE.createPlanOfCareActivitySubstanceAdministration();
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
	private static class ConstructorTestClass extends PlanOfCareActivitySubstanceAdministrationOperations {
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

} // PlanOfCareActivitySubstanceAdministrationOperations
