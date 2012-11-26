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

import org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DerivedEntryOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Derived Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry#validateDerivedEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DerivedEntry#validateDerivedEntryTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Derived Entry Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DerivedEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDerivedEntryTemplateId() {
      OperationsTestCase<DerivedEntry> validateDerivedEntryTemplateIdTestCase = new OperationsTestCase<DerivedEntry>(
      "validateDerivedEntryTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_DERIVED_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DerivedEntry target) {

      }

      @Override
      protected void updateToPass(DerivedEntry target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DerivedEntryOperations.validateDerivedEntryTemplateId(
          (DerivedEntry) objectToTest, diagnostician, map);
      }

    };

    validateDerivedEntryTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDerivedEntryTypeCode() {
      OperationsTestCase<DerivedEntry> validateDerivedEntryTypeCodeTestCase = new OperationsTestCase<DerivedEntry>(
      "validateDerivedEntryTypeCode",
      operationsForOCL.getOCLValue("VALIDATE_DERIVED_ENTRY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(DerivedEntry target) {

      }

      @Override
      protected void updateToPass(DerivedEntry target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return DerivedEntryOperations.validateDerivedEntryTypeCode(
          (DerivedEntry) objectToTest, diagnostician, map);
      }

    };

    validateDerivedEntryTypeCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DerivedEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DerivedEntry> {
		public DerivedEntry create() {
			return EmspcrFactory.eINSTANCE.createDerivedEntry();
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
	private static class ConstructorTestClass extends DerivedEntryOperations {
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

} // DerivedEntryOperations
