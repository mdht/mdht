/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.PayersSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Payers Section</b></em>' model objects. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection#validateHITSPPayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate HITSP Payers Section Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class PayersSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPPayersSectionTemplateId() {
      OperationsTestCase<PayersSection> validateHITSPPayersSectionTemplateIdTestCase = new OperationsTestCase<PayersSection>(
      "validateHITSPPayersSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(PayersSection target) {

      }

      @Override
      protected void updateToPass(PayersSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return PayersSectionOperations.validateHITSPPayersSectionTemplateId(
          (PayersSection) objectToTest, diagnostician, map);
      }

    };

    validateHITSPPayersSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPPayersSectionInsuranceProvider() {
		OperationsTestCase<PayersSection> validateHITSPPayersSectionInsuranceProviderTestCase = new OperationsTestCase<PayersSection>(
			"validateHITSPPayersSectionInsuranceProvider",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PayersSection target) {

			}

			@Override
			protected void updateToPass(PayersSection target) {
				target.init();
				InsuranceProvider insuranceProvider = HITSPFactory.eINSTANCE.createInsuranceProvider().init();

				target.addAct(insuranceProvider);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PayersSectionOperations.validateHITSPPayersSectionInsuranceProvider(
					(PayersSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPPayersSectionInsuranceProviderTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInsuranceProviders() {


PayersSection target = objectFactory.create();
target.getInsuranceProviders();



}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PayersSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PayersSection> {

		public PayersSection create() {
			return HITSPFactory.eINSTANCE.createPayersSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends PayersSectionOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // PayersSectionOperations
