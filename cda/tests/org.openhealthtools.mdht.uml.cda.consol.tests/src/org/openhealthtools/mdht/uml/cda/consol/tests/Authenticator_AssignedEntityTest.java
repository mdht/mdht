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

import org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.Authenticator_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authenticator Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity#validateAssignedEntityHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity#validateAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Authenticator_AssignedEntity#validateAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Authenticator_AssignedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityHasNationalProviderIdentifier() {
		OperationsTestCase<Authenticator_AssignedEntity> validateAssignedEntityHasNationalProviderIdentifierTestCase = new OperationsTestCase<Authenticator_AssignedEntity>(
			"validateAssignedEntityHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Authenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Authenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Authenticator_AssignedEntityOperations.validateAssignedEntityHasNationalProviderIdentifier(
					(Authenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityAddr() {
		OperationsTestCase<Authenticator_AssignedEntity> validateAssignedEntityAddrTestCase = new OperationsTestCase<Authenticator_AssignedEntity>(
			"validateAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Authenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Authenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Authenticator_AssignedEntityOperations.validateAssignedEntityAddr(
					(Authenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityCode() {
		OperationsTestCase<Authenticator_AssignedEntity> validateAssignedEntityCodeTestCase = new OperationsTestCase<Authenticator_AssignedEntity>(
			"validateAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Authenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Authenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Authenticator_AssignedEntityOperations.validateAssignedEntityCode(
					(Authenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityId() {
		OperationsTestCase<Authenticator_AssignedEntity> validateAssignedEntityIdTestCase = new OperationsTestCase<Authenticator_AssignedEntity>(
			"validateAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Authenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Authenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Authenticator_AssignedEntityOperations.validateAssignedEntityId(
					(Authenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityTelecom() {
		OperationsTestCase<Authenticator_AssignedEntity> validateAssignedEntityTelecomTestCase = new OperationsTestCase<Authenticator_AssignedEntity>(
			"validateAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Authenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Authenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Authenticator_AssignedEntityOperations.validateAssignedEntityTelecom(
					(Authenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Authenticator_AssignedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Authenticator_AssignedEntity> {
		public Authenticator_AssignedEntity create() {
			return ConsolFactory.eINSTANCE.createAuthenticator_AssignedEntity();
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
	private static class ConstructorTestClass extends Authenticator_AssignedEntityOperations {
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

} // Authenticator_AssignedEntityOperations
