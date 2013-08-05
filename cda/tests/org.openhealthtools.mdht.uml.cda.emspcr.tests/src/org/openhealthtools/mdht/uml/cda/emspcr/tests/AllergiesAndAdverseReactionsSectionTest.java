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

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AllergiesAndAdverseReactionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergies And Adverse Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergies And Adverse Reactions Section Environmental Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getObservation() <em>Get Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getDrugAllergyProblemAct() <em>Get Drug Allergy Problem Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AllergiesAndAdverseReactionsSection#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AllergiesAndAdverseReactionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionTemplateId() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionTemplateIdTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionTemplateId(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionCode() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionCodeTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionCode(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionTitle() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionTitleTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionTitle(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionText() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionTextTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionText(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionObservation() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionObservationTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionObservation(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemActTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_DRUG_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemAct(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionDrugAllergyProblemActTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies() {
		OperationsTestCase<AllergiesAndAdverseReactionsSection> validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergiesTestCase = new OperationsTestCase<AllergiesAndAdverseReactionsSection>(
			"validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesAndAdverseReactionsSectionOperations.validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(
					(AllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateAllergiesAndAdverseReactionsSectionEnvironmentalAllergiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetObservation() {

		AllergiesAndAdverseReactionsSection target = objectFactory.create();
		target.getObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDrugAllergyProblemAct() {

		AllergiesAndAdverseReactionsSection target = objectFactory.create();
		target.getDrugAllergyProblemAct();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEnvironmentalAllergies() {

		AllergiesAndAdverseReactionsSection target = objectFactory.create();
		target.getEnvironmentalAllergies();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergiesAndAdverseReactionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergiesAndAdverseReactionsSection> {
		public AllergiesAndAdverseReactionsSection create() {
			return EmspcrFactory.eINSTANCE.createAllergiesAndAdverseReactionsSection();
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
	private static class ConstructorTestClass extends AllergiesAndAdverseReactionsSectionOperations {
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

} // AllergiesAndAdverseReactionsSectionOperations
