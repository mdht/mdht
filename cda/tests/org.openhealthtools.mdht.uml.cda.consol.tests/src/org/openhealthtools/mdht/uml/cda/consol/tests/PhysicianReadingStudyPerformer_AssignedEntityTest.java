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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformer_AssignedEntityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer Assigned Entity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity#validateAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer_AssignedEntity#validateAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Entity Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianReadingStudyPerformer_AssignedEntityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedEntityCode() {
		OperationsTestCase<PhysicianReadingStudyPerformer_AssignedEntity> validateAssignedEntityCodeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer_AssignedEntity>(
			"validateAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformer_AssignedEntityOperations.validateAssignedEntityCode(
					(PhysicianReadingStudyPerformer_AssignedEntity) objectToTest, diagnostician, map);
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
		OperationsTestCase<PhysicianReadingStudyPerformer_AssignedEntity> validateAssignedEntityIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer_AssignedEntity>(
			"validateAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer_AssignedEntity target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer_AssignedEntity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianReadingStudyPerformer_AssignedEntityOperations.validateAssignedEntityId(
					(PhysicianReadingStudyPerformer_AssignedEntity) objectToTest, diagnostician, map);
			}

		};

		validateAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianReadingStudyPerformer_AssignedEntityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianReadingStudyPerformer_AssignedEntity> {
		public PhysicianReadingStudyPerformer_AssignedEntity create() {
			return ConsolFactory.eINSTANCE.createPhysicianReadingStudyPerformer_AssignedEntity();
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
	private static class ConstructorTestClass extends PhysicianReadingStudyPerformer_AssignedEntityOperations {
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

} // PhysicianReadingStudyPerformer_AssignedEntityOperations
