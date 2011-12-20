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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationCustodianRoleOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation Custodian Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole#validateAdvanceDirectiveObservationCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole#validateAdvanceDirectiveObservationCustodianRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole#validateAdvanceDirectiveObservationCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodianRole#validateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Role Advance Directive Observation Custodian Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationCustodianRoleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservationCustodianRole> validateAdvanceDirectiveObservationCustodianRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodianRole>(
			"validateAdvanceDirectiveObservationCustodianRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodianRole target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleAddr(
					(AdvanceDirectiveObservationCustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianRoleClassCode() {
		OperationsTestCase<AdvanceDirectiveObservationCustodianRole> validateAdvanceDirectiveObservationCustodianRoleClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodianRole>(
			"validateAdvanceDirectiveObservationCustodianRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodianRole target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleClassCode(
					(AdvanceDirectiveObservationCustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianRoleTelecom() {
		OperationsTestCase<AdvanceDirectiveObservationCustodianRole> validateAdvanceDirectiveObservationCustodianRoleTelecomTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodianRole>(
			"validateAdvanceDirectiveObservationCustodianRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodianRole target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleTelecom(
					(AdvanceDirectiveObservationCustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntity() {
		OperationsTestCase<AdvanceDirectiveObservationCustodianRole> validateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodianRole>(
			"validateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntity",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodianRole target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodianRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianRoleOperations.validateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntity(
					(AdvanceDirectiveObservationCustodianRole) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianRoleAdvanceDirectiveObservationCustodianEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservationCustodianRoleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservationCustodianRole> {
		public AdvanceDirectiveObservationCustodianRole create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservationCustodianRole();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationCustodianRoleOperations {
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

} // AdvanceDirectiveObservationCustodianRoleOperations
