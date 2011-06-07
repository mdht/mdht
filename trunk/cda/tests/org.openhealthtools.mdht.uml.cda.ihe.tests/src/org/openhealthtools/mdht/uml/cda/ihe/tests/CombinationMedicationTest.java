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
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CombinationMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Combination Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication#validateCombinationMedicationSubstanceAdministration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Substance Administration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication#validateCombinationMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Combination Medication Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CombinationMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateCombinationMedicationSubstanceAdministration() {
		OperationsTestCase<CombinationMedication> validateCombinationMedicationSubstanceAdministrationTestCase = new OperationsTestCase<CombinationMedication>(
			"validateCombinationMedicationSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CombinationMedication target) {
				target.init();

			}

			@Override
			protected void updateToPass(CombinationMedication target) {
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init(); // CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(substanceAdministration);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CombinationMedicationOperations.validateCombinationMedicationSubstanceAdministration(
					(CombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateCombinationMedicationSubstanceAdministrationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCombinationMedicationTemplateId() {
		OperationsTestCase<CombinationMedication> validateCombinationMedicationTemplateIdTestCase = new OperationsTestCase<CombinationMedication>(
			"validateCombinationMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CombinationMedication target) {

			}

			@Override
			protected void updateToPass(CombinationMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CombinationMedicationOperations.validateCombinationMedicationTemplateId(
					(CombinationMedication) objectToTest, diagnostician, map);
			}

		};

		validateCombinationMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CombinationMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CombinationMedication> {

		public CombinationMedication create() {
			return IHEFactory.eINSTANCE.createCombinationMedication();
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
	private static class ConstructorTestClass extends CombinationMedicationOperations {
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

} // CombinationMedicationOperations
