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
import org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NonDrugAllergyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NonDrugAllergy#validateNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Non Drug Allergy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NonDrugAllergyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyTemplateId() {
		OperationsTestCase<NonDrugAllergy> validateNonDrugAllergyTemplateIdTestCase = new OperationsTestCase<NonDrugAllergy>(
			"validateNonDrugAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOperations.validateNonDrugAllergyTemplateId(
					(NonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyMoodCode() {
		OperationsTestCase<NonDrugAllergy> validateNonDrugAllergyMoodCodeTestCase = new OperationsTestCase<NonDrugAllergy>(
			"validateNonDrugAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOperations.validateNonDrugAllergyMoodCode(
					(NonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyCode() {
		OperationsTestCase<NonDrugAllergy> validateNonDrugAllergyCodeTestCase = new OperationsTestCase<NonDrugAllergy>(
			"validateNonDrugAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOperations.validateNonDrugAllergyCode(
					(NonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNonDrugAllergyValue() {
		OperationsTestCase<NonDrugAllergy> validateNonDrugAllergyValueTestCase = new OperationsTestCase<NonDrugAllergy>(
			"validateNonDrugAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(NonDrugAllergy target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NonDrugAllergyOperations.validateNonDrugAllergyValue(
					(NonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateNonDrugAllergyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NonDrugAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NonDrugAllergy> {
		public NonDrugAllergy create() {
			return EmspcrFactory.eINSTANCE.createNonDrugAllergy();
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
	private static class ConstructorTestClass extends NonDrugAllergyOperations {
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

} // NonDrugAllergyOperations
