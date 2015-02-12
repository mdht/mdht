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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfNonDrugAllergyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Non Drug Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy#validateExistenceOfNonDrugAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Non Drug Allergy Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfNonDrugAllergyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfNonDrugAllergyTemplateId() {
		OperationsTestCase<ExistenceOfNonDrugAllergy> validateExistenceOfNonDrugAllergyTemplateIdTestCase = new OperationsTestCase<ExistenceOfNonDrugAllergy>(
			"validateExistenceOfNonDrugAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfNonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyTemplateId(
					(ExistenceOfNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfNonDrugAllergyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfNonDrugAllergyMoodCode() {
		OperationsTestCase<ExistenceOfNonDrugAllergy> validateExistenceOfNonDrugAllergyMoodCodeTestCase = new OperationsTestCase<ExistenceOfNonDrugAllergy>(
			"validateExistenceOfNonDrugAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfNonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyMoodCode(
					(ExistenceOfNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfNonDrugAllergyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfNonDrugAllergyCode() {
		OperationsTestCase<ExistenceOfNonDrugAllergy> validateExistenceOfNonDrugAllergyCodeTestCase = new OperationsTestCase<ExistenceOfNonDrugAllergy>(
			"validateExistenceOfNonDrugAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfNonDrugAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyCode(
					(ExistenceOfNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfNonDrugAllergyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfNonDrugAllergyValue() {
		OperationsTestCase<ExistenceOfNonDrugAllergy> validateExistenceOfNonDrugAllergyValueTestCase = new OperationsTestCase<ExistenceOfNonDrugAllergy>(
			"validateExistenceOfNonDrugAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_NON_DRUG_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfNonDrugAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfNonDrugAllergy target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyValue(
					(ExistenceOfNonDrugAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfNonDrugAllergyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfNonDrugAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfNonDrugAllergy> {
		public ExistenceOfNonDrugAllergy create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfNonDrugAllergy();
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
	private static class ConstructorTestClass extends ExistenceOfNonDrugAllergyOperations {
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

} // ExistenceOfNonDrugAllergyOperations
