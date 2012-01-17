
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consoltoc.tests;


import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consoltoc.ConsoltocFactory;
import org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions;

import org.openhealthtools.mdht.uml.cda.consoltoc.operations.DischargeInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAllergiesSectionEntriesOptional() <em>Get Allergies Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getProblemSectionEntriesOptional() <em>Get Problem Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getHospitalDischargeMedicationsSectionEntriesOptional() <em>Get Hospital Discharge Medications Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional() <em>Get Advance Directives Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getImmunizationsSectionEntriesOptional() <em>Get Immunizations Section Entries Optional</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getMedicalEquipmentSection() <em>Get Medical Equipment Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#getAdvanceDirectivesSectionEntriesOptional2() <em>Get Advance Directives Section Entries Optional2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consoltoc.DischargeInstructions#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class DischargeInstructionsTest extends  CDAValidationTest {





/**
*
* @generated
*/
@Test

 
									
public void testGetPlanOfCareSection() {


DischargeInstructions target = objectFactory.create();
target.getPlanOfCareSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAllergiesSectionEntriesOptional() {


DischargeInstructions target = objectFactory.create();
target.getAllergiesSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetProblemSectionEntriesOptional() {


DischargeInstructions target = objectFactory.create();
target.getProblemSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetHospitalDischargeMedicationsSectionEntriesOptional() {


DischargeInstructions target = objectFactory.create();
target.getHospitalDischargeMedicationsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAdvanceDirectivesSectionEntriesOptional() {


DischargeInstructions target = objectFactory.create();
target.getAdvanceDirectivesSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetImmunizationsSectionEntriesOptional() {


DischargeInstructions target = objectFactory.create();
target.getImmunizationsSectionEntriesOptional();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetMedicalEquipmentSection() {


DischargeInstructions target = objectFactory.create();
target.getMedicalEquipmentSection();



}






/**
*
* @generated
*/
@Test

 
									
public void testGetAdvanceDirectivesSectionEntriesOptional2() {


DischargeInstructions target = objectFactory.create();
target.getAdvanceDirectivesSectionEntriesOptional2();



}




/**
*
* @generated
*/
@Test

 
									
public void testValidateGeneralHeaderConstraintsTemplateId() {
			OperationsTestCase<DischargeInstructions> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<DischargeInstructions>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(DischargeInstructions target) {

			}

			@Override
			protected void updateToPass(DischargeInstructions target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return DischargeInstructionsOperations.validateGeneralHeaderConstraintsTemplateId(
					(DischargeInstructions) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
}		




/**
*
* @generated
*/
	private static class OperationsForOCL extends DischargeInstructionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeInstructions> {
		@Override
		public DischargeInstructions create() {		
			return ConsoltocFactory.eINSTANCE.createDischargeInstructions();
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
	private static class ConstructorTestClass extends DischargeInstructionsOperations {};
	
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
	
	

	
	
} // DischargeInstructionsOperations