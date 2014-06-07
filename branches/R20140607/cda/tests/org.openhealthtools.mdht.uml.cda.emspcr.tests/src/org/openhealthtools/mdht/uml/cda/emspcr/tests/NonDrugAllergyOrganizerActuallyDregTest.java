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
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOrganizerActuallyDregOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy Organizer Actually Dreg</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg EMS Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Organizer Actually Dreg Existence Of Drug Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#getEMSDrugAllergies() <em>Get EMS Drug Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergyOrganizerActuallyDreg#getExistenceOfDrugAllergyObservation() <em>Get Existence Of Drug Allergy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonDrugAllergyOrganizerActuallyDregTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy() {
		OperationsTestCase<NonDrugAllergyOrganizerActuallyDreg> validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergyTestCase = new OperationsTestCase<NonDrugAllergyOrganizerActuallyDreg>(
			"validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergyOrganizerActuallyDreg target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergyOrganizerActuallyDreg target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOrganizerActuallyDregOperations.validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergy(
					(NonDrugAllergyOrganizerActuallyDreg) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyOrganizerActuallyDregEMSDrugAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation() {
		OperationsTestCase<NonDrugAllergyOrganizerActuallyDreg> validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservationTestCase = new OperationsTestCase<NonDrugAllergyOrganizerActuallyDreg>(
			"validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_ORGANIZER_ACTUALLY_DREG_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergyOrganizerActuallyDreg target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergyOrganizerActuallyDreg target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOrganizerActuallyDregOperations.validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservation(
					(NonDrugAllergyOrganizerActuallyDreg) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyOrganizerActuallyDregExistenceOfDrugAllergyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSDrugAllergies() {

		NonDrugAllergyOrganizerActuallyDreg target = objectFactory.create();
		target.getEMSDrugAllergies();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfDrugAllergyObservation() {

		NonDrugAllergyOrganizerActuallyDreg target = objectFactory.create();
		target.getExistenceOfDrugAllergyObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonDrugAllergyOrganizerActuallyDregOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonDrugAllergyOrganizerActuallyDreg> {
		public NonDrugAllergyOrganizerActuallyDreg create() {
			return EmspcrFactory.eINSTANCE.createNonDrugAllergyOrganizerActuallyDreg();
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
	private static class ConstructorTestClass extends NonDrugAllergyOrganizerActuallyDregOperations {
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

} // NonDrugAllergyOrganizerActuallyDregOperations
