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
import org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.Informant_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Informant Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity#validateAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Informant_AssignedEntity#validateAssignedEntityPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Informant_AssignedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityAddr() {
		OperationsTestCase<Informant_AssignedEntity> validateAssignedEntityAddrTestCase = new OperationsTestCase<Informant_AssignedEntity>(
			"validateAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Informant_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_AssignedEntityOperations.validateAssignedEntityAddr(
					(Informant_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<Informant_AssignedEntity> validateAssignedEntityCodeTestCase = new OperationsTestCase<Informant_AssignedEntity>(
			"validateAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Informant_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_AssignedEntityOperations.validateAssignedEntityCode(
					(Informant_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<Informant_AssignedEntity> validateAssignedEntityIdTestCase = new OperationsTestCase<Informant_AssignedEntity>(
			"validateAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Informant_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_AssignedEntityOperations.validateAssignedEntityId(
					(Informant_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityPerson() {
		OperationsTestCase<Informant_AssignedEntity> validateAssignedEntityPersonTestCase = new OperationsTestCase<Informant_AssignedEntity>(
			"validateAssignedEntityPerson",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Informant_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(Informant_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Informant_AssignedEntityOperations.validateAssignedEntityPerson(
					(Informant_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Informant_AssignedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Informant_AssignedEntity> {
		public Informant_AssignedEntity create() {
			return ConsolFactory.eINSTANCE.createInformant_AssignedEntity();
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
	private static class ConstructorTestClass extends Informant_AssignedEntityOperations {
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

} // Informant_AssignedEntityOperations
