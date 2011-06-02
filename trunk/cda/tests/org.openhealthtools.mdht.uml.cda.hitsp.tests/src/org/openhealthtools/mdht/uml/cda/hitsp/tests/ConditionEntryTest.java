
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

import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionEntryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasOnsetDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Onset Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryHasUnknownResolutionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Has Unknown Resolution Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateConditionEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry#validateProblemEntryValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Entry Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConditionEntryTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionEntryHasOnsetDate() {
			OperationsTestCase<ConditionEntry> validateConditionEntryHasOnsetDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasOnsetDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_ONSET_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionEntryOperations.validateConditionEntryHasOnsetDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasOnsetDateTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionEntryHasResolutionDate() {
			OperationsTestCase<ConditionEntry> validateConditionEntryHasResolutionDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionEntryOperations.validateConditionEntryHasResolutionDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasResolutionDateTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionEntryHasUnknownResolutionDate() {
			OperationsTestCase<ConditionEntry> validateConditionEntryHasUnknownResolutionDateTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryHasUnknownResolutionDate",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_HAS_UNKNOWN_RESOLUTION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionEntryOperations.validateConditionEntryHasUnknownResolutionDate(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryHasUnknownResolutionDateTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionEntryCode() {
			OperationsTestCase<ConditionEntry> validateConditionEntryCodeTestCase = new OperationsTestCase<ConditionEntry>(
			"validateConditionEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionEntryOperations.validateConditionEntryCode(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateConditionEntryCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateProblemEntryValue() {
			OperationsTestCase<ConditionEntry> validateProblemEntryValueTestCase = new OperationsTestCase<ConditionEntry>(
			"validateProblemEntryValue",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(ConditionEntry target) {

			}

			@Override
			protected void updateToPass(ConditionEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionEntryOperations.validateProblemEntryValue(
					(ConditionEntry) objectToTest, diagnostician, map);
			}

		};

		validateProblemEntryValueTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends ConditionEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConditionEntry> {
		public ConditionEntry create() {		
			return HITSPFactory.eINSTANCE.createConditionEntry();
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
	
} // ConditionEntryOperations