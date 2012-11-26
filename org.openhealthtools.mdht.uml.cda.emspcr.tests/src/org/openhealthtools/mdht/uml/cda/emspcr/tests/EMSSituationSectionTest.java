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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSituationSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Situation Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSituationSection#validateEMSSituationSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Situation Section Entry8</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSSituationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionTemplateId() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTemplateIdTestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionTemplateId(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionCode() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionCodeTestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionCode(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionCodeP() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionCodePTestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionCodeP",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionCodeP(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionTitle() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTitleTestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionTitle(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionText() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionTextTestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionText(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry1() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry1TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry1(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry2() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry2TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry2(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry3() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry3TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry3(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry4() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry4TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry4",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry4(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry5() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry5TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry5",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry5(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry5TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry6() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry6TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry6",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry6(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry6TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry7() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry7TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry7",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry7(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry7TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSituationSectionEntry8() {
      OperationsTestCase<EMSSituationSection> validateEMSSituationSectionEntry8TestCase = new OperationsTestCase<EMSSituationSection>(
      "validateEMSSituationSectionEntry8",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SITUATION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSituationSection target) {

      }

      @Override
      protected void updateToPass(EMSSituationSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSituationSectionOperations.validateEMSSituationSectionEntry8(
          (EMSSituationSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSituationSectionEntry8TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSSituationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSSituationSection> {
		public EMSSituationSection create() {
			return EmspcrFactory.eINSTANCE.createEMSSituationSection();
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
	private static class ConstructorTestClass extends EMSSituationSectionOperations {
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

} // EMSSituationSectionOperations
