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
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistory;
import org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.FamilyHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Family History Section</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#validateHITSPFamilyHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#validateHITSPFamilyHistorySectionFamilyHistory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Family History Section Family History</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.FamilyHistorySection#getFamilyHistories() <em>Get Family Histories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FamilyHistorySectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPFamilyHistorySectionTemplateId() {
      OperationsTestCase<FamilyHistorySection> validateHITSPFamilyHistorySectionTemplateIdTestCase = new OperationsTestCase<FamilyHistorySection>(
      "validateHITSPFamilyHistorySectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HITSP_FAMILY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(FamilyHistorySection target) {

      }

      @Override
      protected void updateToPass(FamilyHistorySection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return FamilyHistorySectionOperations.validateHITSPFamilyHistorySectionTemplateId(
          (FamilyHistorySection) objectToTest, diagnostician, map);
      }

    };

    validateHITSPFamilyHistorySectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPFamilyHistorySectionFamilyHistory() {
		OperationsTestCase<FamilyHistorySection> validateHITSPFamilyHistorySectionFamilyHistoryTestCase = new OperationsTestCase<FamilyHistorySection>(
			"validateHITSPFamilyHistorySectionFamilyHistory",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_FAMILY_HISTORY_SECTION_FAMILY_HISTORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FamilyHistorySection target) {

			}

			@Override
			protected void updateToPass(FamilyHistorySection target) {
				target.init();

				FamilyHistory familyHistory = HITSPFactory.eINSTANCE.createFamilyHistory().init();
				target.addOrganizer(familyHistory);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FamilyHistorySectionOperations.validateHITSPFamilyHistorySectionFamilyHistory(
					(FamilyHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPFamilyHistorySectionFamilyHistoryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistories() {


FamilyHistorySection target = objectFactory.create();
target.getFamilyHistories();



}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends FamilyHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FamilyHistorySection> {

		public FamilyHistorySection create() {
			return HITSPFactory.eINSTANCE.createFamilyHistorySection();
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
	private static class ConstructorTestClass extends FamilyHistorySectionOperations {
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

} // FamilyHistorySectionOperations
