
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
import org.openhealthtools.mdht.uml.cda.hitsp.VitalSign;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.VitalSignOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Sign</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSign#validateVitalSignTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Sign Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.VitalSign#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class VitalSignTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateVitalSignTemplateId() {
			OperationsTestCase<VitalSign> validateVitalSignTemplateIdTestCase = new OperationsTestCase<VitalSign>(
			"validateVitalSignTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSign target) {

			}

			@Override
			protected void updateToPass(VitalSign target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignOperations.validateVitalSignTemplateId(
					(VitalSign) objectToTest, diagnostician, map);
			}

		};

		validateVitalSignTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
@Test

 
									
public void testValidateResultObservationCode() {
			OperationsTestCase<VitalSign> validateResultObservationCodeTestCase = new OperationsTestCase<VitalSign>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(VitalSign target) {

			}

			@Override
			protected void updateToPass(VitalSign target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
			
				CD cd  = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);
				
				
				
				
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return VitalSignOperations.validateResultObservationCode(
					(VitalSign) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends VitalSignOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VitalSign> {
		@Override
		public VitalSign create() {		
			return HITSPFactory.eINSTANCE.createVitalSign();
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
	private static class ConstructorTestClass extends VitalSignOperations {}





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
	
} // VitalSignOperations