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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HospitalDischargeMedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargeMedicationsSection#getMedication() <em>Get Medication</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeMedicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionTemplateId() {
      OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
      "validateHospitalDischargeMedicationsSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HospitalDischargeMedicationsSection target) {

      }

      @Override
      protected void updateToPass(HospitalDischargeMedicationsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionTemplateId(
          (HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
      }

    };

    validateHospitalDischargeMedicationsSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionCode() {
      OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionCodeTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
      "validateHospitalDischargeMedicationsSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(HospitalDischargeMedicationsSection target) {

      }

      @Override
      protected void updateToPass(HospitalDischargeMedicationsSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionCode(
          (HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
      }

    };

    validateHospitalDischargeMedicationsSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionMedication() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionMedicationTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				target.addSubstanceAdministration(IHEFactory.eINSTANCE.createNormalDose());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionMedication(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedication() {


HospitalDischargeMedicationsSection target = objectFactory.create();
target.getMedication();



}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeMedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeMedicationsSection> {

		public HospitalDischargeMedicationsSection create() {
			return IHEFactory.eINSTANCE.createHospitalDischargeMedicationsSection();
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
	private static class ConstructorTestClass extends HospitalDischargeMedicationsSectionOperations {
	};

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

} // HospitalDischargeMedicationsSectionOperations
