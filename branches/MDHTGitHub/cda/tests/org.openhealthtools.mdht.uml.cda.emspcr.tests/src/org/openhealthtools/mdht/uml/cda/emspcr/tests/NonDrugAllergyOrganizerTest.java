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
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Existence Of Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerNonDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#validateNonDrugAllergyOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#getExistenceOfNonDrugAllergy() <em>Get Existence Of Non Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizer#getNonDrugAllergies() <em>Get Non Drug Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonDrugAllergyOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy() {
		OperationsTestCase<NonDrugAllergyOrganizer> validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergyTestCase = new OperationsTestCase<NonDrugAllergyOrganizer>(
			"validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergyOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergy(
					(NonDrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyOrganizerExistenceOfNonDrugAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyOrganizerNonDrugAllergy() {
		OperationsTestCase<NonDrugAllergyOrganizer> validateNonDrugAllergyOrganizerNonDrugAllergyTestCase = new OperationsTestCase<NonDrugAllergyOrganizer>(
			"validateNonDrugAllergyOrganizerNonDrugAllergy",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_NON_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergyOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerNonDrugAllergy(
					(NonDrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyOrganizerNonDrugAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyOrganizerTemplateId() {
		OperationsTestCase<NonDrugAllergyOrganizer> validateNonDrugAllergyOrganizerTemplateIdTestCase = new OperationsTestCase<NonDrugAllergyOrganizer>(
			"validateNonDrugAllergyOrganizerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergyOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOrganizerOperations.validateNonDrugAllergyOrganizerTemplateId(
					(NonDrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyOrganizerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfNonDrugAllergy() {

		NonDrugAllergyOrganizer target = objectFactory.create();
		target.getExistenceOfNonDrugAllergy();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNonDrugAllergies() {

		NonDrugAllergyOrganizer target = objectFactory.create();
		target.getNonDrugAllergies();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonDrugAllergyOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonDrugAllergyOrganizer> {
		public NonDrugAllergyOrganizer create() {
			return EmspcrFactory.eINSTANCE.createNonDrugAllergyOrganizer();
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
	private static class ConstructorTestClass extends NonDrugAllergyOrganizerOperations {
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

} // NonDrugAllergyOrganizerOperations
