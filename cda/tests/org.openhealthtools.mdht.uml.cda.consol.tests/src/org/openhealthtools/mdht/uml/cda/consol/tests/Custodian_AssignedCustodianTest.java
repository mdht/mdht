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
import org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian;

import org.openhealthtools.mdht.uml.cda.consol.operations.Custodian_AssignedCustodianOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Assigned Custodian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_AssignedCustodian#validateAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Custodian Represented Custodian Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Custodian_AssignedCustodianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedCustodianRepresentedCustodianOrganization() {
		OperationsTestCase<Custodian_AssignedCustodian> validateAssignedCustodianRepresentedCustodianOrganizationTestCase = new OperationsTestCase<Custodian_AssignedCustodian>(
			"validateAssignedCustodianRepresentedCustodianOrganization",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Custodian_AssignedCustodian target) {

			}

			@Override
			protected void updateToPass(Custodian_AssignedCustodian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Custodian_AssignedCustodianOperations.validateAssignedCustodianRepresentedCustodianOrganization(
					(Custodian_AssignedCustodian) objectToTest, diagnostician, map);
			}

		};

		validateAssignedCustodianRepresentedCustodianOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Custodian_AssignedCustodianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Custodian_AssignedCustodian> {
		public Custodian_AssignedCustodian create() {
			return ConsolFactory.eINSTANCE.createCustodian_AssignedCustodian();
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
	private static class ConstructorTestClass extends Custodian_AssignedCustodianOperations {
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

} // Custodian_AssignedCustodianOperations
