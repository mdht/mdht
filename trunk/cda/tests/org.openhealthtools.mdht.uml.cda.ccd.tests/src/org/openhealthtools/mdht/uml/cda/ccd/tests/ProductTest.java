/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.Product;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProductOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Product</b></em>' model objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterial(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Has Material</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Has Material Code</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Has Material Code Vocab</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Has Material Code Original Text</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductHasMaterialName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Has Material Name</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductMayHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product May Have Material Manufacturer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductShouldHaveMaterialManufacturer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Should Have Material Manufacturer</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Template Id</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.Product#validateProductId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Product Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ProductTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductHasMaterial() {
		OperationsTestCase<Product> validateProductHasMaterialTestCase = new OperationsTestCase<Product>(
				"validateProductHasMaterial",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_HAS_MATERIAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductHasMaterial(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductHasMaterialTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductHasMaterialCode() {
		OperationsTestCase<Product> validateProductHasMaterialCodeTestCase = new OperationsTestCase<Product>(
				"validateProductHasMaterialCode",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_HAS_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductHasMaterialCode(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductHasMaterialCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductHasMaterialCodeVocab() {
		OperationsTestCase<Product> validateProductHasMaterialCodeVocabTestCase = new OperationsTestCase<Product>(
				"validateProductHasMaterialCodeVocab",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_HAS_MATERIAL_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductHasMaterialCodeVocab(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductHasMaterialCodeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductHasMaterialCodeOriginalText() {
		OperationsTestCase<Product> validateProductHasMaterialCodeOriginalTextTestCase = new OperationsTestCase<Product>(
				"validateProductHasMaterialCodeOriginalText",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_HAS_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations
						.validateProductHasMaterialCodeOriginalText(
								(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductHasMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductHasMaterialName() {
		OperationsTestCase<Product> validateProductHasMaterialNameTestCase = new OperationsTestCase<Product>(
				"validateProductHasMaterialName",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_HAS_MATERIAL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductHasMaterialName(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductHasMaterialNameTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductMayHaveMaterialManufacturer() {
		OperationsTestCase<Product> validateProductMayHaveMaterialManufacturerTestCase = new OperationsTestCase<Product>(
				"validateProductMayHaveMaterialManufacturer",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_MAY_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations
						.validateProductMayHaveMaterialManufacturer(
								(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductMayHaveMaterialManufacturerTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductShouldHaveMaterialManufacturer() {
		OperationsTestCase<Product> validateProductShouldHaveMaterialManufacturerTestCase = new OperationsTestCase<Product>(
				"validateProductShouldHaveMaterialManufacturer",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_SHOULD_HAVE_MATERIAL_MANUFACTURER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations
						.validateProductShouldHaveMaterialManufacturer(
								(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductShouldHaveMaterialManufacturerTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductTemplateId() {
		OperationsTestCase<Product> validateProductTemplateIdTestCase = new OperationsTestCase<Product>(
				"validateProductTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductTemplateId(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProductId() {
		OperationsTestCase<Product> validateProductIdTestCase = new OperationsTestCase<Product>(
				"validateProductId",
				operationsForOCL
						.getOCLValue("VALIDATE_PRODUCT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(Product target) {

			}

			@Override
			protected void updateToPass(Product target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductOperations.validateProductId(
						(Product) objectToTest, diagnostician, map);
			}

		};

		validateProductIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProductOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Product> {
		public Product create() {
			return CCDFactory.eINSTANCE.createProduct();
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
	 * 
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // ProductOperations