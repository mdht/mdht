/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.EncounterActivitiesOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounter Activities</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities#validateMu2consolEncounterActivitiesCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Encounter Activities Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.EncounterActivities#validateEncounterActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Activities Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterActivitiesTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NoT
	 */
	@Test
	public void testValidateMu2consolEncounterActivitiesCodeValue() {
		OperationsTestCase<EncounterActivities> validateMu2consolEncounterActivitiesCodeValueTestCase = new OperationsTestCase<EncounterActivities>(
				"validateMu2consolEncounterActivitiesCodeValue",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_ENCOUNTER_ACTIVITIES_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(EncounterActivities target) {

			}

			@Override
			protected void updateToPass(EncounterActivities target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(value);

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterActivitiesOperations
						.validateMu2consolEncounterActivitiesCodeValue(
								(EncounterActivities) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolEncounterActivitiesCodeValueTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateEncounterActivitiesTemplateId() {
      OperationsTestCase<EncounterActivities> validateEncounterActivitiesTemplateIdTestCase = new OperationsTestCase<EncounterActivities>(
      "validateEncounterActivitiesTemplateId",
      operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
      ,objectFactory) {

      @Override
      protected void updateToFail(EncounterActivities target) {

      }

      @Override
      protected void updateToPass(EncounterActivities target) {
        target.init();
        
        
        
        
        

        
        

  
      

  
    
    
      
        
    
      
        
      
        
        
        
        
        
        
        
      
      
          
      
        
      }

      @Override
      protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
      
      
      
        return EncounterActivitiesOperations.validateEncounterActivitiesTemplateId(
          (EncounterActivities) objectToTest, diagnostician, map);
      }

    };

    validateEncounterActivitiesTemplateIdTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncounterActivitiesOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<EncounterActivities> {
		@Override
		public EncounterActivities create() {
			return Mu2consolFactory.eINSTANCE.createEncounterActivities();
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
	private static class ConstructorTestClass extends
			EncounterActivitiesOperations {
	};

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

} // EncounterActivitiesOperations