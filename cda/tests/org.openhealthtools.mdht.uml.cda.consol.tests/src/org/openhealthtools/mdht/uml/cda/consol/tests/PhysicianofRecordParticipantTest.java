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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipantOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianofRecordParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantTemplateId() {
			OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantTemplateIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTemplateId(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantTypeCode() {
			OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantTypeCodeTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTypeCode(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantTypeCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntity() {
			OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntity(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianofRecordParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianofRecordParticipant> {
		public PhysicianofRecordParticipant create() {
			return ConsolFactory.eINSTANCE.createPhysicianofRecordParticipant();
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
	private static class ConstructorTestClass extends PhysicianofRecordParticipantOperations {
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

} // PhysicianofRecordParticipantOperations
