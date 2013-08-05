/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DrugAllergyProblemActOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Allergy Problem Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct#validateDrugAllergyProblemActParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Allergy Problem Act Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DrugAllergyProblemAct#validateAllergyProblemActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Problem Act Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugAllergyProblemActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugAllergyProblemActParticipant1() {
		OperationsTestCase<DrugAllergyProblemAct> validateDrugAllergyProblemActParticipant1TestCase = new OperationsTestCase<DrugAllergyProblemAct>(
			"validateDrugAllergyProblemActParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_ALLERGY_PROBLEM_ACT_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugAllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(DrugAllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugAllergyProblemActOperations.validateDrugAllergyProblemActParticipant1(
					(DrugAllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateDrugAllergyProblemActParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyProblemActTemplateId() {
		OperationsTestCase<DrugAllergyProblemAct> validateAllergyProblemActTemplateIdTestCase = new OperationsTestCase<DrugAllergyProblemAct>(
			"validateAllergyProblemActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_PROBLEM_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugAllergyProblemAct target) {

			}

			@Override
			protected void updateToPass(DrugAllergyProblemAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugAllergyProblemActOperations.validateAllergyProblemActTemplateId(
					(DrugAllergyProblemAct) objectToTest, diagnostician, map);
			}

		};

		validateAllergyProblemActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DrugAllergyProblemActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugAllergyProblemAct> {
		public DrugAllergyProblemAct create() {
			return EmspcrFactory.eINSTANCE.createDrugAllergyProblemAct();
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
	private static class ConstructorTestClass extends DrugAllergyProblemActOperations {
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

} // DrugAllergyProblemActOperations
