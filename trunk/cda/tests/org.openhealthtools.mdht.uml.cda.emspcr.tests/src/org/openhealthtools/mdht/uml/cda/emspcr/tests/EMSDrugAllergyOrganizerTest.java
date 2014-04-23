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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDrugAllergyOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Drug Allergy Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#validateEMSDrugAllergyOrganizerEMSDrugAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer EMS Drug Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Organizer Existence Of Drug Allergy Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#getEMSDrugAllergies() <em>Get EMS Drug Allergies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergyOrganizer#getExistenceOfDrugAllergyObservation() <em>Get Existence Of Drug Allergy Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSDrugAllergyOrganizerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDrugAllergyOrganizerEMSDrugAllergy() {
		OperationsTestCase<EMSDrugAllergyOrganizer> validateEMSDrugAllergyOrganizerEMSDrugAllergyTestCase = new OperationsTestCase<EMSDrugAllergyOrganizer>(
			"validateEMSDrugAllergyOrganizerEMSDrugAllergy",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EMS_DRUG_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(EMSDrugAllergyOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDrugAllergyOrganizerOperations.validateEMSDrugAllergyOrganizerEMSDrugAllergy(
					(EMSDrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSDrugAllergyOrganizerEMSDrugAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation() {
		OperationsTestCase<EMSDrugAllergyOrganizer> validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservationTestCase = new OperationsTestCase<EMSDrugAllergyOrganizer>(
			"validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DRUG_ALLERGY_ORGANIZER_EXISTENCE_OF_DRUG_ALLERGY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDrugAllergyOrganizer target) {

			}

			@Override
			protected void updateToPass(EMSDrugAllergyOrganizer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDrugAllergyOrganizerOperations.validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservation(
					(EMSDrugAllergyOrganizer) objectToTest, diagnostician, map);
			}

		};

		validateEMSDrugAllergyOrganizerExistenceOfDrugAllergyObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEMSDrugAllergies() {

		EMSDrugAllergyOrganizer target = objectFactory.create();
		target.getEMSDrugAllergies();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfDrugAllergyObservation() {

		EMSDrugAllergyOrganizer target = objectFactory.create();
		target.getExistenceOfDrugAllergyObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSDrugAllergyOrganizerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSDrugAllergyOrganizer> {
		public EMSDrugAllergyOrganizer create() {
			return EmspcrFactory.eINSTANCE.createEMSDrugAllergyOrganizer();
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
	private static class ConstructorTestClass extends EMSDrugAllergyOrganizerOperations {
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

} // EMSDrugAllergyOrganizerOperations
