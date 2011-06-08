
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
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.HospitalCourseSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Course Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalCourseSection#validateHITSPHospitalCourseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Course Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HospitalCourseSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPHospitalCourseSectionTemplateId() {
			OperationsTestCase<HospitalCourseSection> validateHITSPHospitalCourseSectionTemplateIdTestCase = new OperationsTestCase<HospitalCourseSection>(
			"validateHITSPHospitalCourseSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_HOSPITAL_COURSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(HospitalCourseSection target) {

			}

			
			@Override
			protected void updateToPass(HospitalCourseSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalCourseSectionOperations.validateHITSPHospitalCourseSectionTemplateId(
					(HospitalCourseSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPHospitalCourseSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends HospitalCourseSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalCourseSection> {
		
		@Override
		public HospitalCourseSection create() {		
			return HITSPFactory.eINSTANCE.createHospitalCourseSection();
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
	private static class ConstructorTestClass extends HospitalCourseSectionOperations {}





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
	
} // HospitalCourseSectionOperations