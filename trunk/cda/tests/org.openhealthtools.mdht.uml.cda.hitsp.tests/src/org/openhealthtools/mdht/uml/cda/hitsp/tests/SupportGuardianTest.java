
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
import org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.SupportGuardianOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Support Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.SupportGuardian#validateHITSPSupportGuardianTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Support Guardian Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class SupportGuardianTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPSupportGuardianTemplateId() {
			OperationsTestCase<SupportGuardian> validateHITSPSupportGuardianTemplateIdTestCase = new OperationsTestCase<SupportGuardian>(
			"validateHITSPSupportGuardianTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_SUPPORT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(SupportGuardian target) {

			}

			@Override
			protected void updateToPass(SupportGuardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return SupportGuardianOperations.validateHITSPSupportGuardianTemplateId(
					(SupportGuardian) objectToTest, diagnostician, map);
			}

		};

		validateHITSPSupportGuardianTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends SupportGuardianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SupportGuardian> {
		public SupportGuardian create() {		
			return HITSPFactory.eINSTANCE.createSupportGuardian();
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
	
} // SupportGuardianOperations