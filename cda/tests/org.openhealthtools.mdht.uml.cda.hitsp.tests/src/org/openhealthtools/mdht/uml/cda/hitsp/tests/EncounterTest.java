
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.EncounterOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class EncounterTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPEncounterTemplateId() {
			OperationsTestCase<Encounter> validateHITSPEncounterTemplateIdTestCase = new OperationsTestCase<Encounter>(
			"validateHITSPEncounterTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(Encounter target) {

			}

			
			@Override
			protected void updateToPass(Encounter target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncounterOperations.validateHITSPEncounterTemplateId(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateHITSPEncounterTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPEncounterCode() {
			OperationsTestCase<Encounter> validateHITSPEncounterCodeTestCase = new OperationsTestCase<Encounter>(
			"validateHITSPEncounterCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(Encounter target) {

			}

			
			@Override
			protected void updateToPass(Encounter target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EncounterOperations.validateHITSPEncounterCode(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateHITSPEncounterCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends EncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Encounter> {
		
		@Override
		public Encounter create() {		
			return HITSPFactory.eINSTANCE.createEncounter();
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
	private static class ConstructorTestClass extends EncounterOperations {}





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
	
} // EncounterOperations