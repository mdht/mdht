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
import org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.CustodianOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.CustodianOrganization#validateConsolCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Custodian Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CustodianOrganizationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolCustodianOrganizationAddr() {
		OperationsTestCase<CustodianOrganization> validateConsolCustodianOrganizationAddrTestCase = new OperationsTestCase<CustodianOrganization>(
			"validateConsolCustodianOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CustodianOrganizationOperations.validateConsolCustodianOrganizationAddr(
					(CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateConsolCustodianOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolCustodianOrganizationId() {
		OperationsTestCase<CustodianOrganization> validateConsolCustodianOrganizationIdTestCase = new OperationsTestCase<CustodianOrganization>(
			"validateConsolCustodianOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CustodianOrganizationOperations.validateConsolCustodianOrganizationId(
					(CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateConsolCustodianOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolCustodianOrganizationName() {
		OperationsTestCase<CustodianOrganization> validateConsolCustodianOrganizationNameTestCase = new OperationsTestCase<CustodianOrganization>(
			"validateConsolCustodianOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CustodianOrganizationOperations.validateConsolCustodianOrganizationName(
					(CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateConsolCustodianOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolCustodianOrganizationTelecom() {
		OperationsTestCase<CustodianOrganization> validateConsolCustodianOrganizationTelecomTestCase = new OperationsTestCase<CustodianOrganization>(
			"validateConsolCustodianOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CustodianOrganization target) {

			}

			@Override
			protected void updateToPass(CustodianOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CustodianOrganizationOperations.validateConsolCustodianOrganizationTelecom(
					(CustodianOrganization) objectToTest, diagnostician, map);
			}

		};

		validateConsolCustodianOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CustodianOrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CustodianOrganization> {
		public CustodianOrganization create() {
			return ConsolFactory.eINSTANCE.createCustodianOrganization();
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
	private static class ConstructorTestClass extends CustodianOrganizationOperations {
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

} // CustodianOrganizationOperations
