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
import org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProductInstance_ScopingEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Product Instance Scoping Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProductInstance_ScopingEntity#validateScopingEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scoping Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProductInstance_ScopingEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateScopingEntityId() {
		OperationsTestCase<ProductInstance_ScopingEntity> validateScopingEntityIdTestCase = new OperationsTestCase<ProductInstance_ScopingEntity>(
			"validateScopingEntityId",
			operationsForOCL.getOCLValue("VALIDATE_SCOPING_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProductInstance_ScopingEntity target) {

			}

			@Override
			protected void updateToPass(ProductInstance_ScopingEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProductInstance_ScopingEntityOperations.validateScopingEntityId(
					(ProductInstance_ScopingEntity) objectToTest, diagnostician, map);
			}

		};

		validateScopingEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProductInstance_ScopingEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProductInstance_ScopingEntity> {
		public ProductInstance_ScopingEntity create() {
			return ConsolFactory.eINSTANCE.createProductInstance_ScopingEntity();
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
	private static class ConstructorTestClass extends ProductInstance_ScopingEntityOperations {
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

} // ProductInstance_ScopingEntityOperations
