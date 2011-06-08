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

import org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.AllergiesReactionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Allergies Reactions Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection#validateHITSPAllergiesReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Allergies Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection#validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Allergies Reactions Section Allergy Drug Sensitivity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergiesReactionsSection#getAllergyDrugSensitivities() <em>Get Allergy Drug Sensitivities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesReactionsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPAllergiesReactionsSectionTemplateId() {
		OperationsTestCase<AllergiesReactionsSection> validateHITSPAllergiesReactionsSectionTemplateIdTestCase = new OperationsTestCase<AllergiesReactionsSection>(
			"validateHITSPAllergiesReactionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesReactionsSectionOperations.validateHITSPAllergiesReactionsSectionTemplateId(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAllergiesReactionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPAllergiesReactionsSectionAllergyDrugSensitivity() {
		OperationsTestCase<AllergiesReactionsSection> validateHITSPAllergiesReactionsSectionAllergyDrugSensitivityTestCase = new OperationsTestCase<AllergiesReactionsSection>(
			"validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ALLERGIES_REACTIONS_SECTION_ALLERGY_DRUG_SENSITIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesReactionsSectionOperations.validateHITSPAllergiesReactionsSectionAllergyDrugSensitivity(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPAllergiesReactionsSectionAllergyDrugSensitivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyDrugSensitivities() {

		AllergiesReactionsSection target = objectFactory.create();
		target.getAllergyDrugSensitivities();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AllergiesReactionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesReactionsSection> {

		public AllergiesReactionsSection create() {
			return HITSPFactory.eINSTANCE.createAllergiesReactionsSection();
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
	private static class ConstructorTestClass extends AllergiesReactionsSectionOperations {
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

} // AllergiesReactionsSectionOperations
