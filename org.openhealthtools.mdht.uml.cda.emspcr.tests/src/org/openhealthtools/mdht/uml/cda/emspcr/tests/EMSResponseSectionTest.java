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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSResponseSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Response Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSResponseSection#validateEMSResponseSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Response Section Entry4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSResponseSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionTemplateId() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTemplateIdTestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionTemplateId(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionCode() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionCodeTestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionCode(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionCodeP() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionCodePTestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionCodeP(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionTitle() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTitleTestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionTitle(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionText() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionTextTestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionText(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionEntry1() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionEntry1TestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionEntry1(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionEntry2() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionEntry2TestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionEntry2(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionEntry3() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionEntry3TestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionEntry3(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSResponseSectionEntry4() {
      OperationsTestCase<EMSResponseSection> validateEMSResponseSectionEntry4TestCase = new OperationsTestCase<EMSResponseSection>(
      "validateEMSResponseSectionEntry4",
      operationsForOCL.getOCLValue("VALIDATE_EMS_RESPONSE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSResponseSection target) {

      }

      @Override
      protected void updateToPass(EMSResponseSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSResponseSectionOperations.validateEMSResponseSectionEntry4(
          (EMSResponseSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSResponseSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSResponseSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSResponseSection> {
		public EMSResponseSection create() {
			return EmspcrFactory.eINSTANCE.createEMSResponseSection();
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
	private static class ConstructorTestClass extends EMSResponseSectionOperations {
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

} // EMSResponseSectionOperations
