
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
import org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.SurgeriesSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection#validateHITSPSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Surgeries Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection#validateHITSPSurgeriesSectionProcedureActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Surgeries Section Procedure Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SurgeriesSection#getProcedureActivities() <em>Get Procedure Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SurgeriesSectionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPSurgeriesSectionTemplateId() {
			OperationsTestCase<SurgeriesSection> validateHITSPSurgeriesSectionTemplateIdTestCase = new OperationsTestCase<SurgeriesSection>(
			"validateHITSPSurgeriesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SurgeriesSection target) {

			}

			@Override
			protected void updateToPass(SurgeriesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SurgeriesSectionOperations.validateHITSPSurgeriesSectionTemplateId(
					(SurgeriesSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPSurgeriesSectionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPSurgeriesSectionProcedureActivity() {
			OperationsTestCase<SurgeriesSection> validateHITSPSurgeriesSectionProcedureActivityTestCase = new OperationsTestCase<SurgeriesSection>(
			"validateHITSPSurgeriesSectionProcedureActivity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_SURGERIES_SECTION_PROCEDURE_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SurgeriesSection target) {

			}

			@Override
			protected void updateToPass(SurgeriesSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SurgeriesSectionOperations.validateHITSPSurgeriesSectionProcedureActivity(
					(SurgeriesSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPSurgeriesSectionProcedureActivityTestCase.doValidationTest();
}		





/**
*
* @generated
*/
	private static class OperationsForOCL extends SurgeriesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SurgeriesSection> {
		public SurgeriesSection create() {		
			return HITSPFactory.eINSTANCE.createSurgeriesSection();
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
*
* @generated
*/
	@Override
	protected EObject getObjectToTest() {		
		return null;
	}
	
} // SurgeriesSectionOperations