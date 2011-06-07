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
import org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterPlanOfCareOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Plan Of Care</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare#validatePlanOfCareActivityEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare#validateEncounterPlanOfCareMoodCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Plan Of Care Mood Code Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterPlanOfCareTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<EncounterPlanOfCare> validatePlanOfCareActivityEncounterTemplateIdTestCase = new OperationsTestCase<EncounterPlanOfCare>(
			"validatePlanOfCareActivityEncounterTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PLAN_OF_CARE_ACTIVITY_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterPlanOfCare target) {

			}

			@Override
			protected void updateToPass(EncounterPlanOfCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterPlanOfCareOperations.validatePlanOfCareActivityEncounterTemplateId(
					(EncounterPlanOfCare) objectToTest, diagnostician, map);
			}

		};

		validatePlanOfCareActivityEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterPlanOfCareMoodCodeValue() {
		OperationsTestCase<EncounterPlanOfCare> validateEncounterPlanOfCareMoodCodeValueTestCase = new OperationsTestCase<EncounterPlanOfCare>(
			"validateEncounterPlanOfCareMoodCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PLAN_OF_CARE_MOOD_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterPlanOfCare target) {

			}

			@Override
			protected void updateToPass(EncounterPlanOfCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterPlanOfCareOperations.validateEncounterPlanOfCareMoodCodeValue(
					(EncounterPlanOfCare) objectToTest, diagnostician, map);
			}

		};

		validateEncounterPlanOfCareMoodCodeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterPlanOfCareOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncounterPlanOfCare> {

		public EncounterPlanOfCare create() {
			return IHEFactory.eINSTANCE.createEncounterPlanOfCare();
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
	private static class ConstructorTestClass extends EncounterPlanOfCareOperations {
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

} // EncounterPlanOfCareOperations
