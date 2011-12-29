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
import org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.Custodian_CustodianRoleOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Custodian Custodian Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole#validateCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole#validateCustodianRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole#validateCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Custodian_CustodianRole#validateCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Role Playing Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Custodian_CustodianRoleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianRoleAddr() {
		OperationsTestCase<Custodian_CustodianRole> validateCustodianRoleAddrTestCase = new OperationsTestCase<Custodian_CustodianRole>(
			"validateCustodianRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Custodian_CustodianRole target) {

			}

			@Override
			protected void updateToPass(Custodian_CustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Custodian_CustodianRoleOperations.validateCustodianRoleAddr(
					(Custodian_CustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateCustodianRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianRoleClassCode() {
		OperationsTestCase<Custodian_CustodianRole> validateCustodianRoleClassCodeTestCase = new OperationsTestCase<Custodian_CustodianRole>(
			"validateCustodianRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Custodian_CustodianRole target) {

			}

			@Override
			protected void updateToPass(Custodian_CustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Custodian_CustodianRoleOperations.validateCustodianRoleClassCode(
					(Custodian_CustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateCustodianRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianRoleTelecom() {
		OperationsTestCase<Custodian_CustodianRole> validateCustodianRoleTelecomTestCase = new OperationsTestCase<Custodian_CustodianRole>(
			"validateCustodianRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Custodian_CustodianRole target) {

			}

			@Override
			protected void updateToPass(Custodian_CustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Custodian_CustodianRoleOperations.validateCustodianRoleTelecom(
					(Custodian_CustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateCustodianRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianRolePlayingEntity() {
		OperationsTestCase<Custodian_CustodianRole> validateCustodianRolePlayingEntityTestCase = new OperationsTestCase<Custodian_CustodianRole>(
			"validateCustodianRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Custodian_CustodianRole target) {

			}

			@Override
			protected void updateToPass(Custodian_CustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Custodian_CustodianRoleOperations.validateCustodianRolePlayingEntity(
					(Custodian_CustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateCustodianRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Custodian_CustodianRoleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Custodian_CustodianRole> {
		public Custodian_CustodianRole create() {
			return ConsolFactory.eINSTANCE.createCustodian_CustodianRole();
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
	private static class ConstructorTestClass extends Custodian_CustodianRoleOperations {
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

} // Custodian_CustodianRoleOperations
