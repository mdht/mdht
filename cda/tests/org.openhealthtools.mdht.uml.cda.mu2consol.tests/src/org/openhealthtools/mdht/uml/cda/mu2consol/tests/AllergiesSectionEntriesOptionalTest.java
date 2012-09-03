/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.AllergyProblemAct;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.AllergiesSectionEntriesOptionalOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Allergies Section Entries Optional</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Allergies Section Entries Optional Allergy Problem Act
 * </em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#getmu2consolAllergyProblemAct()
 * <em>Getmu2consol Allergy Problem Act</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.AllergiesSectionEntriesOptional#validateAllergiesSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Allergies Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class AllergiesSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
				"validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_ALLERGIES_SECTION_ENTRIES_OPTIONAL_ALLERGY_PROBLEM_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();
				AllergyProblemAct  act =  ConsolFactory.eINSTANCE.createAllergyProblemAct().init();
				target.addAct(act);
			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations
						.validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemAct(
								(AllergiesSectionEntriesOptional) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolAllergiesSectionEntriesOptionalAllergyProblemActTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolAllergyProblemAct() {

		AllergiesSectionEntriesOptional target = objectFactory.create();
		target.getmu2consolAllergyProblemAct();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAllergiesSectionEntriesOptionalTemplateId() {
		OperationsTestCase<AllergiesSectionEntriesOptional> validateAllergiesSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<AllergiesSectionEntriesOptional>(
				"validateAllergiesSectionEntriesOptionalTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_ALLERGIES_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AllergiesSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(AllergiesSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergiesSectionEntriesOptionalOperations
						.validateAllergiesSectionEntriesOptionalTemplateId(
								(AllergiesSectionEntriesOptional) objectToTest,
								diagnostician, map);
			}

		};

		validateAllergiesSectionEntriesOptionalTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			AllergiesSectionEntriesOptionalOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<AllergiesSectionEntriesOptional> {

		public AllergiesSectionEntriesOptional create() {
			return Mu2consolFactory.eINSTANCE
					.createAllergiesSectionEntriesOptional();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			AllergiesSectionEntriesOptionalOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // AllergiesSectionEntriesOptionalOperations
