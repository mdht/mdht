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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Disposition Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection#validateEMSDispositionSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Disposition Section Entry4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSDispositionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTemplateId() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTemplateIdTestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionCode() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionCodeTestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionCodeP() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionCodePTestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionTitle() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTitleTestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionText() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionTextTestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionText(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry1() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry1TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry1(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry2() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry2TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry2(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry3() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry3TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry3(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry5() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry5TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry5",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry5(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry5TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry7() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry7TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry7",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry7(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry7TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry6() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry6TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry6",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry6(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry6TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispositionSectionEntry4() {
      OperationsTestCase<EMSDispositionSection> validateEMSDispositionSectionEntry4TestCase = new OperationsTestCase<EMSDispositionSection>(
      "validateEMSDispositionSectionEntry4",
      operationsForOCL.getOCLValue("VALIDATE_EMS_DISPOSITION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSDispositionSection target) {

      }

      @Override
      protected void updateToPass(EMSDispositionSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry4(
          (EMSDispositionSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSDispositionSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSDispositionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSDispositionSection> {
		public EMSDispositionSection create() {
			return EmspcrFactory.eINSTANCE.createEMSDispositionSection();
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
	private static class ConstructorTestClass extends EMSDispositionSectionOperations {
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

} // EMSDispositionSectionOperations
