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

import org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssociatedEntity_PersonOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Associated Entity Person</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssociatedEntity_Person#validatePersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Person Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssociatedEntity_PersonTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePersonName() {
		OperationsTestCase<AssociatedEntity_Person> validatePersonNameTestCase = new OperationsTestCase<AssociatedEntity_Person>(
			"validatePersonName", operationsForOCL.getOCLValue("VALIDATE_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssociatedEntity_Person target) {

			}

			@Override
			protected void updateToPass(AssociatedEntity_Person target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssociatedEntity_PersonOperations.validatePersonName(
					(AssociatedEntity_Person) objectToTest, diagnostician, map);
			}

		};

		validatePersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssociatedEntity_PersonOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssociatedEntity_Person> {
		public AssociatedEntity_Person create() {
			return ConsolFactory.eINSTANCE.createAssociatedEntity_Person();
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
	private static class ConstructorTestClass extends AssociatedEntity_PersonOperations {
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

} // AssociatedEntity_PersonOperations
