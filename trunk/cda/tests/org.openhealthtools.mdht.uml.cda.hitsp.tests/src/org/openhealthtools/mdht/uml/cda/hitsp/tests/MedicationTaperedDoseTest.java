
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
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationTaperedDoseOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Tapered Dose</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationTaperedDose#validateTaperedDoseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tapered Dose Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicationTaperedDoseTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateTaperedDoseTemplateId() {
			OperationsTestCase<MedicationTaperedDose> validateTaperedDoseTemplateIdTestCase = new OperationsTestCase<MedicationTaperedDose>(
			"validateTaperedDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(MedicationTaperedDose target) {

			}

			@Override
			protected void updateToPass(MedicationTaperedDose target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationTaperedDoseOperations.validateTaperedDoseTemplateId(
					(MedicationTaperedDose) objectToTest, diagnostician, map);
			}

		};

		validateTaperedDoseTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicationTaperedDoseOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationTaperedDose> {
		public MedicationTaperedDose create() {		
			return HITSPFactory.eINSTANCE.createMedicationTaperedDose();
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
	
} // MedicationTaperedDoseOperations