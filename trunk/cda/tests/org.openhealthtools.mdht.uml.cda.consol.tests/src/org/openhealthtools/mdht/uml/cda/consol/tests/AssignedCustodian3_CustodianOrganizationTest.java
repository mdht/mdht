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

import org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedCustodian3_CustodianOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Custodian3 Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization#validateCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization#validateCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization#validateCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedCustodian3_CustodianOrganization#validateCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedCustodian3_CustodianOrganizationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianOrganizationAddr() {
		OperationsTestCase<AssignedCustodian3_CustodianOrganization> validateCustodianOrganizationAddrTestCase = new OperationsTestCase<AssignedCustodian3_CustodianOrganization>(
			"validateCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedCustodian3_CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(AssignedCustodian3_CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationAddr(
					(AssignedCustodian3_CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianOrganizationId() {
		OperationsTestCase<AssignedCustodian3_CustodianOrganization> validateCustodianOrganizationIdTestCase = new OperationsTestCase<AssignedCustodian3_CustodianOrganization>(
			"validateCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedCustodian3_CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(AssignedCustodian3_CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationId(
					(AssignedCustodian3_CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianOrganizationName() {
		OperationsTestCase<AssignedCustodian3_CustodianOrganization> validateCustodianOrganizationNameTestCase = new OperationsTestCase<AssignedCustodian3_CustodianOrganization>(
			"validateCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedCustodian3_CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(AssignedCustodian3_CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationName(
					(AssignedCustodian3_CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianOrganizationTelecom() {
		OperationsTestCase<AssignedCustodian3_CustodianOrganization> validateCustodianOrganizationTelecomTestCase = new OperationsTestCase<AssignedCustodian3_CustodianOrganization>(
			"validateCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedCustodian3_CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(AssignedCustodian3_CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedCustodian3_CustodianOrganizationOperations.validateCustodianOrganizationTelecom(
					(AssignedCustodian3_CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateCustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedCustodian3_CustodianOrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedCustodian3_CustodianOrganization> {
		public AssignedCustodian3_CustodianOrganization create() {
			return ConsolFactory.eINSTANCE.createAssignedCustodian3_CustodianOrganization();
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
	private static class ConstructorTestClass extends AssignedCustodian3_CustodianOrganizationOperations {
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

} // AssignedCustodian3_CustodianOrganizationOperations
