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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProtocolSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Protocol Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection#validateEMSProtocolSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Protocol Section Entry3</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSProtocolSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionTemplateId() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTemplateIdTestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionTemplateId(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionCode() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionCodeTestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionCode(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionTitle() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTitleTestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionTitle(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionText() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionTextTestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionText(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionEntry1() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionEntry1TestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionEntry1(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionEntry2() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionEntry2TestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionEntry2(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSProtocolSectionEntry3() {
      OperationsTestCase<EMSProtocolSection> validateEMSProtocolSectionEntry3TestCase = new OperationsTestCase<EMSProtocolSection>(
      "validateEMSProtocolSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_PROTOCOL_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSProtocolSection target) {

      }

      @Override
      protected void updateToPass(EMSProtocolSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSProtocolSectionOperations.validateEMSProtocolSectionEntry3(
          (EMSProtocolSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSProtocolSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSProtocolSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSProtocolSection> {
		public EMSProtocolSection create() {
			return EmspcrFactory.eINSTANCE.createEMSProtocolSection();
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
	private static class ConstructorTestClass extends EMSProtocolSectionOperations {
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

} // EMSProtocolSectionOperations
