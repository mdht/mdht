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
import org.openhealthtools.mdht.uml.cda.consol.Provider_AssociatedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Provider_AssociatedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Associated Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Provider_AssociatedEntity#validateAssociatedEntityAssociatedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Associated Entity Associated Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Provider_AssociatedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssociatedEntityAssociatedPerson() {
		OperationsTestCase<Provider_AssociatedEntity> validateAssociatedEntityAssociatedPersonTestCase = new OperationsTestCase<Provider_AssociatedEntity>(
			"validateAssociatedEntityAssociatedPerson",
			operationsForOCL.getOCLValue("VALIDATE_ASSOCIATED_ENTITY_ASSOCIATED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Provider_AssociatedEntity target) {

			}

			@Override
			protected void updateToPass(Provider_AssociatedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Provider_AssociatedEntityOperations.validateAssociatedEntityAssociatedPerson(
					(Provider_AssociatedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssociatedEntityAssociatedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Provider_AssociatedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Provider_AssociatedEntity> {
		public Provider_AssociatedEntity create() {
			return ConsolFactory.eINSTANCE.createProvider_AssociatedEntity();
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
	private static class ConstructorTestClass extends Provider_AssociatedEntityOperations {
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

} // Provider_AssociatedEntityOperations
