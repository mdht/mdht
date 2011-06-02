
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

import org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.AllergyDrugSensitivityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Drug Sensitivity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AllergyDrugSensitivity#validateAllergyDrugSensitivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Drug Sensitivity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class AllergyDrugSensitivityTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateAllergyDrugSensitivityTemplateId() {
			OperationsTestCase<AllergyDrugSensitivity> validateAllergyDrugSensitivityTemplateIdTestCase = new OperationsTestCase<AllergyDrugSensitivity>(
			"validateAllergyDrugSensitivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_DRUG_SENSITIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AllergyDrugSensitivity target) {

			}

			@Override
			protected void updateToPass(AllergyDrugSensitivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AllergyDrugSensitivityOperations.validateAllergyDrugSensitivityTemplateId(
					(AllergyDrugSensitivity) objectToTest, diagnostician, map);
			}

		};

		validateAllergyDrugSensitivityTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends AllergyDrugSensitivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyDrugSensitivity> {
		public AllergyDrugSensitivity create() {		
			return HITSPFactory.eINSTANCE.createAllergyDrugSensitivity();
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
	
} // AllergyDrugSensitivityOperations