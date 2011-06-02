
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
import org.openhealthtools.mdht.uml.cda.hitsp.Result;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.ResultOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultValuePresence(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value Presence</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Result#validateResultValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ResultTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultValuePresence() {
			OperationsTestCase<Result> validateResultValuePresenceTestCase = new OperationsTestCase<Result>(
			"validateResultValuePresence",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_VALUE_PRESENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Result target) {

			}

			@Override
			protected void updateToPass(Result target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOperations.validateResultValuePresence(
					(Result) objectToTest, diagnostician, map);
			}

		};

		validateResultValuePresenceTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultTemplateId() {
			OperationsTestCase<Result> validateResultTemplateIdTestCase = new OperationsTestCase<Result>(
			"validateResultTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Result target) {

			}

			@Override
			protected void updateToPass(Result target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOperations.validateResultTemplateId(
					(Result) objectToTest, diagnostician, map);
			}

		};

		validateResultTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultCode() {
			OperationsTestCase<Result> validateResultCodeTestCase = new OperationsTestCase<Result>(
			"validateResultCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Result target) {

			}

			@Override
			protected void updateToPass(Result target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOperations.validateResultCode(
					(Result) objectToTest, diagnostician, map);
			}

		};

		validateResultCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultEffectiveTime() {
			OperationsTestCase<Result> validateResultEffectiveTimeTestCase = new OperationsTestCase<Result>(
			"validateResultEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Result target) {

			}

			@Override
			protected void updateToPass(Result target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOperations.validateResultEffectiveTime(
					(Result) objectToTest, diagnostician, map);
			}

		};

		validateResultEffectiveTimeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultValue() {
			OperationsTestCase<Result> validateResultValueTestCase = new OperationsTestCase<Result>(
			"validateResultValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Result target) {

			}

			@Override
			protected void updateToPass(Result target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ResultOperations.validateResultValue(
					(Result) objectToTest, diagnostician, map);
			}

		};

		validateResultValueTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends ResultOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Result> {
		public Result create() {		
			return HITSPFactory.eINSTANCE.createResult();
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
	
} // ResultOperations