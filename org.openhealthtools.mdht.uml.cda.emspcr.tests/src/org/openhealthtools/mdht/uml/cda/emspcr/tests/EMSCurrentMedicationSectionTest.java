/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCurrentMedicationSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Current Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCurrentMedicationSection#validateEMSCurrentMedicationSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Current Medication Section Entry3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSCurrentMedicationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionTemplateId() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTemplateIdTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTemplateId(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionCode() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionCodeTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionCode(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionTitle() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTitleTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionTitle(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionText() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionTextTestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionText(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionEntry1() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionEntry1TestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionEntry1(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionEntry2() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionEntry2TestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionEntry2(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCurrentMedicationSectionEntry3() {
      OperationsTestCase<EMSCurrentMedicationSection> validateEMSCurrentMedicationSectionEntry3TestCase = new OperationsTestCase<EMSCurrentMedicationSection>(
      "validateEMSCurrentMedicationSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_CURRENT_MEDICATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSCurrentMedicationSection target) {

      }

      @Override
      protected void updateToPass(EMSCurrentMedicationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSCurrentMedicationSectionOperations.validateEMSCurrentMedicationSectionEntry3(
          (EMSCurrentMedicationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSCurrentMedicationSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSCurrentMedicationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSCurrentMedicationSection> {
		public EMSCurrentMedicationSection create() {
			return EmspcrFactory.eINSTANCE.createEMSCurrentMedicationSection();
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
	private static class ConstructorTestClass extends EMSCurrentMedicationSectionOperations {
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

} // EMSCurrentMedicationSectionOperations
