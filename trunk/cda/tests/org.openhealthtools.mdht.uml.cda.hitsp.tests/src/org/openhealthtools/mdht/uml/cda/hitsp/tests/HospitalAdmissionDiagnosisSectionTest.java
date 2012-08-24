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
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.HospitalAdmissionDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#validateHITSPHospitalAdmissionDiagnosisSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Hospital Admission Diagnosis Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.HospitalAdmissionDiagnosisSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosisSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPHospitalAdmissionDiagnosisSectionTemplateId() {
      OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHITSPHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
      "validateHITSPHospitalAdmissionDiagnosisSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

      }

      @Override
      protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HospitalAdmissionDiagnosisSectionOperations.validateHITSPHospitalAdmissionDiagnosisSectionTemplateId(
          (HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
      }

    };

    validateHITSPHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPHospitalAdmissionDiagnosisSectionCondition() {
		OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHITSPHospitalAdmissionDiagnosisSectionConditionTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHITSPHospitalAdmissionDiagnosisSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();
				Condition condition = HITSPFactory.eINSTANCE.createCondition().init();
				target.addAct(condition);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionDiagnosisSectionOperations.validateHITSPHospitalAdmissionDiagnosisSectionCondition(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHITSPHospitalAdmissionDiagnosisSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCondition() {


HospitalAdmissionDiagnosisSection target = objectFactory.create();
target.getCondition();



}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends HospitalAdmissionDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosisSection> {

		public HospitalAdmissionDiagnosisSection create() {
			return HITSPFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosisSectionOperations {
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

} // HospitalAdmissionDiagnosisSectionOperations
