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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPhysicalAssessmentSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Entry6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPhysicalAssessmentSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionTemplateId() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTemplateIdTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTemplateId(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionCode() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionCodeTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCode(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionCodeP() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionCodePTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCodeP(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionTitle() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTitleTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTitle(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionText() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTextTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionText(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry1() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry1TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry1(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry2() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry2TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry2(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry3() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry3TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry3(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry4() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry4TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry4",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry4(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry5() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry5TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry5",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry5(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry5TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionEntry6() {
      OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionEntry6TestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
      "validateEMSPhysicalAssessmentSectionEntry6",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSPhysicalAssessmentSection target) {

      }

      @Override
      protected void updateToPass(EMSPhysicalAssessmentSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionEntry6(
          (EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSPhysicalAssessmentSectionEntry6TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPhysicalAssessmentSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPhysicalAssessmentSection> {
		public EMSPhysicalAssessmentSection create() {
			return EmspcrFactory.eINSTANCE.createEMSPhysicalAssessmentSection();
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
	private static class ConstructorTestClass extends EMSPhysicalAssessmentSectionOperations {
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

} // EMSPhysicalAssessmentSectionOperations
