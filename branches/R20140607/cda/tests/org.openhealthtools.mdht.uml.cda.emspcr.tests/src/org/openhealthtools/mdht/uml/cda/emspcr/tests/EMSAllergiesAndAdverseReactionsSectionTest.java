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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSAllergiesAndAdverseReactionsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Allergies And Adverse Reactions Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section Environmental Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Allergies And Adverse Reactions Section EMS Drug Allergy Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSAllergiesAndAdverseReactionsSection#getEMSDrugAllergyOrganizer() <em>Get EMS Drug Allergy Organizer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSAllergiesAndAdverseReactionsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionTemplateId() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionTemplateIdTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionTemplateId(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionCode() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionCodeTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionCode(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionTitle() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionTitleTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionTitle(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionText() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionTextTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionText(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergiesTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_ENVIRONMENTAL_ALLERGIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergies(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionEnvironmentalAllergiesTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer() {
		OperationsTestCase<EMSAllergiesAndAdverseReactionsSection> validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizerTestCase = new OperationsTestCase<EMSAllergiesAndAdverseReactionsSection>(
			"validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_ALLERGIES_AND_ADVERSE_REACTIONS_SECTION_EMS_DRUG_ALLERGY_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSAllergiesAndAdverseReactionsSection target) {

			}

			@Override
			protected void updateToPass(EMSAllergiesAndAdverseReactionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSAllergiesAndAdverseReactionsSectionOperations.validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizer(
					(EMSAllergiesAndAdverseReactionsSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSAllergiesAndAdverseReactionsSectionEMSDrugAllergyOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEnvironmentalAllergies() {

		EMSAllergiesAndAdverseReactionsSection target = objectFactory.create();
		target.getEnvironmentalAllergies();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSDrugAllergyOrganizer() {

		EMSAllergiesAndAdverseReactionsSection target = objectFactory.create();
		target.getEMSDrugAllergyOrganizer();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSAllergiesAndAdverseReactionsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSAllergiesAndAdverseReactionsSection> {
		public EMSAllergiesAndAdverseReactionsSection create() {
			return EmspcrFactory.eINSTANCE.createEMSAllergiesAndAdverseReactionsSection();
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
	private static class ConstructorTestClass extends EMSAllergiesAndAdverseReactionsSectionOperations {
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

} // EMSAllergiesAndAdverseReactionsSectionOperations
