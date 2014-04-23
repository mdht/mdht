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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDrugAllergyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy#validateEMSDrugAllergyParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDrugAllergy#validateEMSDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Drug Allergy Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSDrugAllergyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDrugAllergyParticipant1() {
		OperationsTestCase<EMSDrugAllergy> validateEMSDrugAllergyParticipant1TestCase = new OperationsTestCase<EMSDrugAllergy>(
			"validateEMSDrugAllergyParticipant1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DRUG_ALLERGY_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDrugAllergy target) {

			}

			@Override
			protected void updateToPass(EMSDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDrugAllergyOperations.validateEMSDrugAllergyParticipant1(
					(EMSDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEMSDrugAllergyParticipant1TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDrugAllergyTemplateId() {
		OperationsTestCase<EMSDrugAllergy> validateEMSDrugAllergyTemplateIdTestCase = new OperationsTestCase<EMSDrugAllergy>(
			"validateEMSDrugAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSDrugAllergy target) {

			}

			@Override
			protected void updateToPass(EMSDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSDrugAllergyOperations.validateEMSDrugAllergyTemplateId(
					(EMSDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEMSDrugAllergyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSDrugAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSDrugAllergy> {
		public EMSDrugAllergy create() {
			return EmspcrFactory.eINSTANCE.createEMSDrugAllergy();
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
	private static class ConstructorTestClass extends EMSDrugAllergyOperations {
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

} // EMSDrugAllergyOperations
