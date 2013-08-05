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
import org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EnvironmentalAllergiesOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Environmental Allergies</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Existence Of Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesEnvironmentalAllergy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#validateEnvironmentalAllergiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Environmental Allergies Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#getExistenceOfEnvironmentalAllergy() <em>Get Existence Of Environmental Allergy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EnvironmentalAllergies#getEnvironmentalAllergies() <em>Get Environmental Allergies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EnvironmentalAllergiesTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy() {
		OperationsTestCase<EnvironmentalAllergies> validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergyTestCase = new OperationsTestCase<EnvironmentalAllergies>(
			"validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGIES_EXISTENCE_OF_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergies target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergies target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergy(
					(EnvironmentalAllergies) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergiesExistenceOfEnvironmentalAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergiesEnvironmentalAllergy() {
		OperationsTestCase<EnvironmentalAllergies> validateEnvironmentalAllergiesEnvironmentalAllergyTestCase = new OperationsTestCase<EnvironmentalAllergies>(
			"validateEnvironmentalAllergiesEnvironmentalAllergy",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGIES_ENVIRONMENTAL_ALLERGY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergies target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergies target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesEnvironmentalAllergy(
					(EnvironmentalAllergies) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergiesEnvironmentalAllergyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEnvironmentalAllergiesTemplateId() {
		OperationsTestCase<EnvironmentalAllergies> validateEnvironmentalAllergiesTemplateIdTestCase = new OperationsTestCase<EnvironmentalAllergies>(
			"validateEnvironmentalAllergiesTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENVIRONMENTAL_ALLERGIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EnvironmentalAllergies target) {

			}

			@Override
			protected void updateToPass(EnvironmentalAllergies target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EnvironmentalAllergiesOperations.validateEnvironmentalAllergiesTemplateId(
					(EnvironmentalAllergies) objectToTest, diagnostician, map);
			}

		};

		validateEnvironmentalAllergiesTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExistenceOfEnvironmentalAllergy() {

		EnvironmentalAllergies target = objectFactory.create();
		target.getExistenceOfEnvironmentalAllergy();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEnvironmentalAllergies() {

		EnvironmentalAllergies target = objectFactory.create();
		target.getEnvironmentalAllergies();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EnvironmentalAllergiesOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EnvironmentalAllergies> {
		public EnvironmentalAllergies create() {
			return EmspcrFactory.eINSTANCE.createEnvironmentalAllergies();
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
	private static class ConstructorTestClass extends EnvironmentalAllergiesOperations {
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

} // EnvironmentalAllergiesOperations
