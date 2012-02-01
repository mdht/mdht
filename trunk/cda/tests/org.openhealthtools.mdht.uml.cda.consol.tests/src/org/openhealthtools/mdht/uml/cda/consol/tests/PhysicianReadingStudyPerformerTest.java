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
import org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer;

import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianReadingStudyPerformerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physician Reading Study Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianReadingStudyPerformer#validatePhysicianReadingStudyPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physician Reading Study Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianReadingStudyPerformerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTemplateId() {
			OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTemplateIdTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTemplateId(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTime() {
			OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTimeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTime",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTime(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTimeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerTypeCode() {
			OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerTypeCodeTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerTypeCode(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerTypeCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianReadingStudyPerformerAssignedEntity() {
			OperationsTestCase<PhysicianReadingStudyPerformer> validatePhysicianReadingStudyPerformerAssignedEntityTestCase = new OperationsTestCase<PhysicianReadingStudyPerformer>(
			"validatePhysicianReadingStudyPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIAN_READING_STUDY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(PhysicianReadingStudyPerformer target) {

			}

			@Override
			protected void updateToPass(PhysicianReadingStudyPerformer target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicianReadingStudyPerformerOperations.validatePhysicianReadingStudyPerformerAssignedEntity(
					(PhysicianReadingStudyPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianReadingStudyPerformerAssignedEntityTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianReadingStudyPerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianReadingStudyPerformer> {
		public PhysicianReadingStudyPerformer create() {
			return ConsolFactory.eINSTANCE.createPhysicianReadingStudyPerformer();
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
	private static class ConstructorTestClass extends PhysicianReadingStudyPerformerOperations {
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

} // PhysicianReadingStudyPerformerOperations
