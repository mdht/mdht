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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSSceneSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Scene Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSSceneSection#validateEMSSceneSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Scene Section Entry4</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSSceneSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionTemplateId() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTemplateIdTestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionTemplateId(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionCode() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionCodeTestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionCode",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionCode(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionTitle() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTitleTestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionTitle",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
    
        ST  title = DatatypesFactory.eINSTANCE.createST("title");
        target.setTitle(title );
        

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionTitle(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionText() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionTextTestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionText",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
        StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
        target.setText(text );
      
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionText(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionEntry1() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionEntry1TestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionEntry1",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionEntry1(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionEntry2() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionEntry2TestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionEntry2",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionEntry2(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionEntry3() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionEntry3TestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionEntry3",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionEntry3(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSSceneSectionEntry4() {
      OperationsTestCase<EMSSceneSection> validateEMSSceneSectionEntry4TestCase = new OperationsTestCase<EMSSceneSection>(
      "validateEMSSceneSectionEntry4",
      operationsForOCL.getOCLValue("VALIDATE_EMS_SCENE_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EMSSceneSection target) {

      }

      @Override
      protected void updateToPass(EMSSceneSection target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EMSSceneSectionOperations.validateEMSSceneSectionEntry4(
          (EMSSceneSection) objectToTest, diagnostician, map);
      }

    };

    validateEMSSceneSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSSceneSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSSceneSection> {
		public EMSSceneSection create() {
			return EmspcrFactory.eINSTANCE.createEMSSceneSection();
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
	private static class ConstructorTestClass extends EMSSceneSectionOperations {
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

} // EMSSceneSectionOperations
