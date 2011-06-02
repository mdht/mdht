
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

import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Condition</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasTreatingProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Treating Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionHasProviderTreatmentTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Has Provider Treatment Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#validateConditionConditionEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Condition Condition Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#createConditionEntry() <em>Create Condition Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Condition#getConditionEntries() <em>Get Condition Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class ConditionTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionHasTreatingProvider() {
			OperationsTestCase<Condition> validateConditionHasTreatingProviderTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasTreatingProvider",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_TREATING_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionOperations.validateConditionHasTreatingProvider(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasTreatingProviderTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionHasProviderId() {
			OperationsTestCase<Condition> validateConditionHasProviderIdTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasProviderId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionOperations.validateConditionHasProviderId(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasProviderIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionHasProviderTreatmentTime() {
			OperationsTestCase<Condition> validateConditionHasProviderTreatmentTimeTestCase = new OperationsTestCase<Condition>(
			"validateConditionHasProviderTreatmentTime",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_HAS_PROVIDER_TREATMENT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionOperations.validateConditionHasProviderTreatmentTime(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionHasProviderTreatmentTimeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionTemplateId() {
			OperationsTestCase<Condition> validateConditionTemplateIdTestCase = new OperationsTestCase<Condition>(
			"validateConditionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionOperations.validateConditionTemplateId(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateConditionConditionEntry() {
			OperationsTestCase<Condition> validateConditionConditionEntryTestCase = new OperationsTestCase<Condition>(
			"validateConditionConditionEntry",
			operationsForOCL.getOCLValue("VALIDATE_CONDITION_CONDITION_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(Condition target) {

			}

			@Override
			protected void updateToPass(Condition target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return ConditionOperations.validateConditionConditionEntry(
					(Condition) objectToTest, diagnostician, map);
			}

		};

		validateConditionConditionEntryTestCase.doValidationTest();
}		







/**
*
* @generated
*/
	private static class OperationsForOCL extends ConditionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Condition> {
		public Condition create() {		
			return HITSPFactory.eINSTANCE.createCondition();
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
	
} // ConditionOperations