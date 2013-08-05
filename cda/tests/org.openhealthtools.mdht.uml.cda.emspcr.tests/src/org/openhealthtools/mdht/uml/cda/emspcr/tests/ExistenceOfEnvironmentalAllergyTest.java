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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfEnvironmentalAllergyOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of Environmental Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfEnvironmentalAllergy#validateExistenceOfEnvironmentalAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of Environmental Allergy Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfEnvironmentalAllergyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfEnvironmentalAllergyTemplateId() {
		OperationsTestCase<ExistenceOfEnvironmentalAllergy> validateExistenceOfEnvironmentalAllergyTemplateIdTestCase = new OperationsTestCase<ExistenceOfEnvironmentalAllergy>(
			"validateExistenceOfEnvironmentalAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfEnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfEnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyTemplateId(
					(ExistenceOfEnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfEnvironmentalAllergyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfEnvironmentalAllergyCode() {
		OperationsTestCase<ExistenceOfEnvironmentalAllergy> validateExistenceOfEnvironmentalAllergyCodeTestCase = new OperationsTestCase<ExistenceOfEnvironmentalAllergy>(
			"validateExistenceOfEnvironmentalAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfEnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfEnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyCode(
					(ExistenceOfEnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfEnvironmentalAllergyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfEnvironmentalAllergyValue() {
		OperationsTestCase<ExistenceOfEnvironmentalAllergy> validateExistenceOfEnvironmentalAllergyValueTestCase = new OperationsTestCase<ExistenceOfEnvironmentalAllergy>(
			"validateExistenceOfEnvironmentalAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfEnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfEnvironmentalAllergy target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyValue(
					(ExistenceOfEnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfEnvironmentalAllergyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfEnvironmentalAllergyMoodCode() {
		OperationsTestCase<ExistenceOfEnvironmentalAllergy> validateExistenceOfEnvironmentalAllergyMoodCodeTestCase = new OperationsTestCase<ExistenceOfEnvironmentalAllergy>(
			"validateExistenceOfEnvironmentalAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfEnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(ExistenceOfEnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfEnvironmentalAllergyOperations.validateExistenceOfEnvironmentalAllergyMoodCode(
					(ExistenceOfEnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfEnvironmentalAllergyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfEnvironmentalAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfEnvironmentalAllergy> {
		public ExistenceOfEnvironmentalAllergy create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfEnvironmentalAllergy();
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
	private static class ConstructorTestClass extends ExistenceOfEnvironmentalAllergyOperations {
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

} // ExistenceOfEnvironmentalAllergyOperations
