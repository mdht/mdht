
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
import org.openhealthtools.mdht.uml.cda.hitsp.Medication;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationRouteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Route Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationAdministrationUnitCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Administration Unit Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationMaxDoseQuantity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Max Dose Quantity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#validateHITSPMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationType() <em>Get Medication Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getMedicationOrderInformations() <em>Get Medication Order Informations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Medication#getHITSPReactionObservation() <em>Get HITSP Reaction Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationTemplateId() {
			OperationsTestCase<Medication> validateHITSPMedicationTemplateIdTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationTemplateId(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationEffectiveTime() {
			OperationsTestCase<Medication> validateHITSPMedicationEffectiveTimeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationEffectiveTime(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationEffectiveTimeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationRouteCode() {
			OperationsTestCase<Medication> validateHITSPMedicationRouteCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationRouteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_ROUTE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationRouteCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationRouteCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationDoseQuantity() {
			OperationsTestCase<Medication> validateHITSPMedicationDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationDoseQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationDoseQuantityTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationAdministrationUnitCode() {
			OperationsTestCase<Medication> validateHITSPMedicationAdministrationUnitCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationAdministrationUnitCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_ADMINISTRATION_UNIT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationAdministrationUnitCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationAdministrationUnitCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationMaxDoseQuantity() {
			OperationsTestCase<Medication> validateHITSPMedicationMaxDoseQuantityTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationMaxDoseQuantity",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_MAX_DOSE_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationMaxDoseQuantity(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationMaxDoseQuantityTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationApproachSiteCode() {
			OperationsTestCase<Medication> validateHITSPMedicationApproachSiteCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationApproachSiteCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationApproachSiteCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateHITSPMedicationCode() {
			OperationsTestCase<Medication> validateHITSPMedicationCodeTestCase = new OperationsTestCase<Medication>(
			"validateHITSPMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Medication target) {

			}

			@Override
			protected void updateToPass(Medication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOperations.validateHITSPMedicationCode(
					(Medication) objectToTest, diagnostician, map);
			}

		};

		validateHITSPMedicationCodeTestCase.doValidationTest();
}		









/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Medication> {
		public Medication create() {		
			return HITSPFactory.eINSTANCE.createMedication();
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
	
} // MedicationOperations