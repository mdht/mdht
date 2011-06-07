
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
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationsAdministeredSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationsAdministeredSection#validateHITSPMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medications Administered Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicationsAdministeredSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationsAdministeredSectionTemplateId() {
			OperationsTestCase<MedicationsAdministeredSection> validateHITSPMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateHITSPMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationsAdministeredSectionOperations.validateHITSPMedicationsAdministeredSectionTemplateId(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicationsAdministeredSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection> {
		@Override
		public MedicationsAdministeredSection create() {		
			return HITSPFactory.eINSTANCE.createMedicationsAdministeredSection();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSectionOperations {}





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
	
} // MedicationsAdministeredSectionOperations