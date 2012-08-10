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
import org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>General Header Constraints</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient Language Communication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.GeneralHeaderConstraints#validateGeneralHeaderConstraintsRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Record Target Patient Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GeneralHeaderConstraintsTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
			OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsTemplateId(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTarget() {
			OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTarget",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTarget(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication() {
			OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT_LANGUAGE_COMMUNICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRolePatient() {
			OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRolePatientTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsRecordTargetPatientRole() {
			OperationsTestCase<GeneralHeaderConstraints> validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase = new OperationsTestCase<GeneralHeaderConstraints>(
			"validateGeneralHeaderConstraintsRecordTargetPatientRole",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(GeneralHeaderConstraints target) {

			}

			@Override
			protected void updateToPass(GeneralHeaderConstraints target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsRecordTargetPatientRole(
					(GeneralHeaderConstraints) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsRecordTargetPatientRoleTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			GeneralHeaderConstraintsOperations {
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
			TestObjectFactory<GeneralHeaderConstraints> {
		@Override
		public GeneralHeaderConstraints create() {
			return Mu2consolFactory.eINSTANCE.createGeneralHeaderConstraints();
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
			GeneralHeaderConstraintsOperations {
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

	/**
	 * 
	 * @generated
	 */
	// @Override
	// protected EObject getObjectToTest() {
	// return null;
	// }

} // GeneralHeaderConstraintsOperations