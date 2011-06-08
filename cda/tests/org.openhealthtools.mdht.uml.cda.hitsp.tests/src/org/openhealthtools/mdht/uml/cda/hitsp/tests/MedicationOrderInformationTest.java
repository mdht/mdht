
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
import org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.MedicationOrderInformationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Order Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationOrderNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationOrderExpiration(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Order Expiration</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityOrdered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Ordered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityUnit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Unit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationPrescriptionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Prescription Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationAssigningAuthority(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Assigning Authority</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationDispenseDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispense Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationDispensingPharmacyLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Dispensing Pharmacy Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationQuantityDispensed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Quantity Dispensed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationHasFillNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Has Fill Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.MedicationOrderInformation#validateMedicationOrderInformationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Order Information Status Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class MedicationOrderInformationTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationOrderNumber() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationOrderNumberTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationOrderNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderNumber(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationOrderNumberTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationOrderExpiration() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationOrderExpirationTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationOrderExpiration",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_ORDER_EXPIRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationOrderExpiration(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationOrderExpirationTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationQuantityOrdered() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationQuantityOrderedTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationQuantityOrdered",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_ORDERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityOrdered(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationQuantityOrderedTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationQuantityUnit() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationQuantityUnitTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationQuantityUnit",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_UNIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityUnit(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationQuantityUnitTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationPrescriptionNumber() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationPrescriptionNumberTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationPrescriptionNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_PRESCRIPTION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationPrescriptionNumber(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationPrescriptionNumberTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationAssigningAuthority() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationAssigningAuthorityTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationAssigningAuthority",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_ASSIGNING_AUTHORITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationAssigningAuthority(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationAssigningAuthorityTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationDispenseDate() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationDispenseDateTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationDispenseDate",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationDispenseDate(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationDispenseDateTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationDispensingPharmacyLocation() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationDispensingPharmacyLocationTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationDispensingPharmacyLocation",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_DISPENSING_PHARMACY_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationDispensingPharmacyLocation(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationDispensingPharmacyLocationTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationQuantityDispensed() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationQuantityDispensedTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationQuantityDispensed",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_QUANTITY_DISPENSED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationQuantityDispensed(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationQuantityDispensedTestCase.doValidationTest();
}



	/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationHasFillNumber() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationHasFillNumberTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationHasFillNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_HAS_FILL_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationHasFillNumber(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationHasFillNumberTestCase.doValidationTest();
}



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationTemplateId() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationTemplateIdTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationTemplateId(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationRepeatNumber() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationRepeatNumberTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationRepeatNumber(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationRepeatNumberTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateMedicationOrderInformationStatusCode() {
			OperationsTestCase<MedicationOrderInformation> validateMedicationOrderInformationStatusCodeTestCase = new OperationsTestCase<MedicationOrderInformation>(
			"validateMedicationOrderInformationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_ORDER_INFORMATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(MedicationOrderInformation target) {

			}

			
			@Override
			protected void updateToPass(MedicationOrderInformation target) {
				target.init();
				
				
				
				
			
				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return MedicationOrderInformationOperations.validateMedicationOrderInformationStatusCode(
					(MedicationOrderInformation) objectToTest, diagnostician, map);
			}

		};

		validateMedicationOrderInformationStatusCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends MedicationOrderInformationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationOrderInformation> {
		
		@Override
		public MedicationOrderInformation create() {		
			return HITSPFactory.eINSTANCE.createMedicationOrderInformation();
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
	private static class ConstructorTestClass extends MedicationOrderInformationOperations {}





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
	
} // MedicationOrderInformationOperations