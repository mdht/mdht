
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
import org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.PhysicalExamSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PhysicalExamSection#validateHITSPPhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Physical Exam Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class PhysicalExamSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPPhysicalExamSectionTemplateId() {
			OperationsTestCase<PhysicalExamSection> validateHITSPPhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validateHITSPPhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			
			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return PhysicalExamSectionOperations.validateHITSPPhysicalExamSectionTemplateId(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPhysicalExamSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends PhysicalExamSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection> {
		
		@Override
		public PhysicalExamSection create() {		
			return HITSPFactory.eINSTANCE.createPhysicalExamSection();
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
	private static class ConstructorTestClass extends PhysicalExamSectionOperations {}





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
	
} // PhysicalExamSectionOperations