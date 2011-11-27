/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformation;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationHasMaterialName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Has Material Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationMayHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information May Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationShouldHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Should Have Material Manufacturer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedProductVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Product Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedIngredientVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Ingredient Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationCodedBrandNameVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Coded Brand Name Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationFreeTextProductName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Product Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationFreeTextBrandName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Free Text Brand Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformation#validateMedicationInformationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationInformationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationHasMaterial() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationHasMaterialTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationHasMaterial",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationHasMaterial(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationHasMaterialTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationHasMaterialCode() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationHasMaterialCodeTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationHasMaterialCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationHasMaterialCode(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationHasMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationHasMaterialCodeVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationHasMaterialCodeVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationHasMaterialCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationHasMaterialCodeVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationHasMaterialCodeVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationHasMaterialCodeOriginalText() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationHasMaterialCodeOriginalTextTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationHasMaterialCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationHasMaterialCodeOriginalText(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationHasMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationHasMaterialName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationHasMaterialNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationHasMaterialName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationHasMaterialName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationHasMaterialNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationMayHaveMaterialManufacturer() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationMayHaveMaterialManufacturerTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationMayHaveMaterialManufacturer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationMayHaveMaterialManufacturer(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationMayHaveMaterialManufacturerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationShouldHaveMaterialManufacturer() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationShouldHaveMaterialManufacturerTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationShouldHaveMaterialManufacturer",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationShouldHaveMaterialManufacturer(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationShouldHaveMaterialManufacturerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationCodedProductName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedProductNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedProductName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedProductNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationCodedProductVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedProductVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedProductVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_PRODUCT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedProductVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedProductVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationCodedIngredientVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedIngredientVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedIngredientVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_INGREDIENT_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedIngredientVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedIngredientVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationCodedBrandName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedBrandNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedBrandName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedBrandName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedBrandNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationCodedBrandNameVocab() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationCodedBrandNameVocabTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationCodedBrandNameVocab",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_CODED_BRAND_NAME_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationCodedBrandNameVocab(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationCodedBrandNameVocabTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationFreeTextProductName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationFreeTextProductNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationFreeTextProductName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_PRODUCT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationFreeTextProductName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationFreeTextProductNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationFreeTextBrandName() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationFreeTextBrandNameTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationFreeTextBrandName",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_FREE_TEXT_BRAND_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationFreeTextBrandName(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationFreeTextBrandNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationTemplateId() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationTemplateIdTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationTemplateId(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationId() {
		OperationsTestCase<MedicationInformation> validateMedicationInformationIdTestCase = new OperationsTestCase<MedicationInformation>(
			"validateMedicationInformationId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformation target) {

			}

			@Override
			protected void updateToPass(MedicationInformation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationOperations.validateMedicationInformationId(
					(MedicationInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationInformation> {
		public MedicationInformation create() {
			return ConsolFactory.eINSTANCE.createMedicationInformation();
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
	private static class ConstructorTestClass extends MedicationInformationOperations {
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

} // MedicationInformationOperations
