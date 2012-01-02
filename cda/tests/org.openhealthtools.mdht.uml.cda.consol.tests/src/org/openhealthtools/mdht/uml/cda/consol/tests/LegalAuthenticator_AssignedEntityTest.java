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
import org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.LegalAuthenticator_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Legal Authenticator Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity#validateAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity#validateAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.LegalAuthenticator_AssignedEntity#validateAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LegalAuthenticator_AssignedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityAddr() {
		OperationsTestCase<LegalAuthenticator_AssignedEntity> validateAssignedEntityAddrTestCase = new OperationsTestCase<LegalAuthenticator_AssignedEntity>(
			"validateAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LegalAuthenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(LegalAuthenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LegalAuthenticator_AssignedEntityOperations.validateAssignedEntityAddr(
					(LegalAuthenticator_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<LegalAuthenticator_AssignedEntity> validateAssignedEntityCodeTestCase = new OperationsTestCase<LegalAuthenticator_AssignedEntity>(
			"validateAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LegalAuthenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(LegalAuthenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LegalAuthenticator_AssignedEntityOperations.validateAssignedEntityCode(
					(LegalAuthenticator_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<LegalAuthenticator_AssignedEntity> validateAssignedEntityIdTestCase = new OperationsTestCase<LegalAuthenticator_AssignedEntity>(
			"validateAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(LegalAuthenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(LegalAuthenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LegalAuthenticator_AssignedEntityOperations.validateAssignedEntityId(
					(LegalAuthenticator_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<LegalAuthenticator_AssignedEntity> validateAssignedEntityTelecomTestCase = new OperationsTestCase<LegalAuthenticator_AssignedEntity>(
			"validateAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LegalAuthenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(LegalAuthenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LegalAuthenticator_AssignedEntityOperations.validateAssignedEntityTelecom(
					(LegalAuthenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityAssignedPerson() {
		OperationsTestCase<LegalAuthenticator_AssignedEntity> validateAssignedEntityAssignedPersonTestCase = new OperationsTestCase<LegalAuthenticator_AssignedEntity>(
			"validateAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LegalAuthenticator_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(LegalAuthenticator_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LegalAuthenticator_AssignedEntityOperations.validateAssignedEntityAssignedPerson(
					(LegalAuthenticator_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LegalAuthenticator_AssignedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LegalAuthenticator_AssignedEntity> {
		public LegalAuthenticator_AssignedEntity create() {
			return ConsolFactory.eINSTANCE.createLegalAuthenticator_AssignedEntity();
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
	private static class ConstructorTestClass extends LegalAuthenticator_AssignedEntityOperations {
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

} // LegalAuthenticator_AssignedEntityOperations
