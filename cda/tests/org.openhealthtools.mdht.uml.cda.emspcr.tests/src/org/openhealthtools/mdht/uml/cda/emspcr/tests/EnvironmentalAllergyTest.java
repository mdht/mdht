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
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EnvironmentalAllergyOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Environmental Allergy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergy#validateEnvironmentalAllergyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergy Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EnvironmentalAllergyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergyTemplateId() {
		OperationsTestCase<EnvironmentalAllergy> validateEnvironmentalAllergyTemplateIdTestCase = new OperationsTestCase<EnvironmentalAllergy>(
			"validateEnvironmentalAllergyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergyOperations.validateEnvironmentalAllergyTemplateId(
					(EnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergyCode() {
		OperationsTestCase<EnvironmentalAllergy> validateEnvironmentalAllergyCodeTestCase = new OperationsTestCase<EnvironmentalAllergy>(
			"validateEnvironmentalAllergyCode",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergyOperations.validateEnvironmentalAllergyCode(
					(EnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergyValue() {
		OperationsTestCase<EnvironmentalAllergy> validateEnvironmentalAllergyValueTestCase = new OperationsTestCase<EnvironmentalAllergy>(
			"validateEnvironmentalAllergyValue",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergy target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergyOperations.validateEnvironmentalAllergyValue(
					(EnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergyMoodCode() {
		OperationsTestCase<EnvironmentalAllergy> validateEnvironmentalAllergyMoodCodeTestCase = new OperationsTestCase<EnvironmentalAllergy>(
			"validateEnvironmentalAllergyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergy target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergyOperations.validateEnvironmentalAllergyMoodCode(
					(EnvironmentalAllergy) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EnvironmentalAllergyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EnvironmentalAllergy> {
		public EnvironmentalAllergy create() {
			return EmspcrFactory.eINSTANCE.createEnvironmentalAllergy();
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
	private static class ConstructorTestClass extends EnvironmentalAllergyOperations {
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

} // EnvironmentalAllergyOperations
