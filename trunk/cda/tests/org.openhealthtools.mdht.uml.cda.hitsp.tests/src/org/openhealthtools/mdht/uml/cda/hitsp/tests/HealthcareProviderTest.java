
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
import org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider;

import org.openhealthtools.mdht.uml.cda.hitsp.operations.HealthcareProviderOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;


/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Healthcare Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HealthcareProvider#validateHealthcareProviderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Healthcare Provider Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 
public class HealthcareProviderTest extends  CDAValidationTest {



/**
*
* @generated
*/
@Test

 
									
public void testValidateHealthcareProviderTemplateId() {
			OperationsTestCase<HealthcareProvider> validateHealthcareProviderTemplateIdTestCase = new OperationsTestCase<HealthcareProvider>(
			"validateHealthcareProviderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEALTHCARE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			
			@Override
			protected void updateToFail(HealthcareProvider target) {

			}

			
			@Override
			protected void updateToPass(HealthcareProvider target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				
		
				
				
				
				
				
				
				
				
			}

			
			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HealthcareProviderOperations.validateHealthcareProviderTemplateId(
					(HealthcareProvider) objectToTest, diagnostician, map);
			}

		};

		validateHealthcareProviderTemplateIdTestCase.doValidationTest();
}		



/**
*
* @generated
*/
	private static class OperationsForOCL extends HealthcareProviderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HealthcareProvider> {
		
		@Override
		public HealthcareProvider create() {		
			return HITSPFactory.eINSTANCE.createHealthcareProvider();
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
	private static class ConstructorTestClass extends HealthcareProviderOperations {}





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
	
} // HealthcareProviderOperations