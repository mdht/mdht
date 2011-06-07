
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

import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.HospitalDischargeMedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalDischargeMedicationsSection#validateHITSPHospitalDischargeMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Discharge Medications Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HospitalDischargeMedicationsSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPHospitalDischargeMedicationsSectionTemplateId() {
			OperationsTestCase<HospitalDischargeMedicationsSection> validateHITSPHospitalDischargeMedicationsSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHITSPHospitalDischargeMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalDischargeMedicationsSectionOperations.validateHITSPHospitalDischargeMedicationsSectionTemplateId(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPHospitalDischargeMedicationsSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends HospitalDischargeMedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeMedicationsSection> {
		@Override
		public HospitalDischargeMedicationsSection create() {		
			return HITSPFactory.eINSTANCE.createHospitalDischargeMedicationsSection();
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
	private static class ConstructorTestClass extends HospitalDischargeMedicationsSectionOperations {}





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
	
} // HospitalDischargeMedicationsSectionOperations