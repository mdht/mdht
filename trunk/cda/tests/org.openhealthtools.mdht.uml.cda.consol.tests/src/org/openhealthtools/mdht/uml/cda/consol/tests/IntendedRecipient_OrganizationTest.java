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
import org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient_Organization;

import org.openhealthtools.mdht.uml.cda.consol.operations.IntendedRecipient_OrganizationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Intended Recipient Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.IntendedRecipient_Organization#validateOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organization Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IntendedRecipient_OrganizationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOrganizationName() {
		OperationsTestCase<IntendedRecipient_Organization> validateOrganizationNameTestCase = new OperationsTestCase<IntendedRecipient_Organization>(
			"validateOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(IntendedRecipient_Organization target) {

			}

			@Override
			protected void updateToPass(IntendedRecipient_Organization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IntendedRecipient_OrganizationOperations.validateOrganizationName(
					(IntendedRecipient_Organization) objectToTest, diagnostician, map);
			}

		};

		validateOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IntendedRecipient_OrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<IntendedRecipient_Organization> {
		public IntendedRecipient_Organization create() {
			return ConsolFactory.eINSTANCE.createIntendedRecipient_Organization();
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
	private static class ConstructorTestClass extends IntendedRecipient_OrganizationOperations {
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

} // IntendedRecipient_OrganizationOperations
