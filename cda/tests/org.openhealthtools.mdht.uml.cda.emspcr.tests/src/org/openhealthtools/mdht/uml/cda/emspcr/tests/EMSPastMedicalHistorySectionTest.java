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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPastMedicalHistorySectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Past Medical History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPastMedicalHistorySection#validateEMSPastMedicalHistorySectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Past Medical History Section Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPastMedicalHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionTemplateId() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTemplateIdTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTemplateId(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionCode() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionCodeTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCode(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionCodeP() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionCodePTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionCodeP(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionCodePTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionTitle() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTitleTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionTitle(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionText() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionTextTestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionText(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionEntry1() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionEntry1TestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionEntry1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionEntry1(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPastMedicalHistorySectionEntry2() {
			OperationsTestCase<EMSPastMedicalHistorySection> validateEMSPastMedicalHistorySectionEntry2TestCase = new OperationsTestCase<EMSPastMedicalHistorySection>(
			"validateEMSPastMedicalHistorySectionEntry2",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PAST_MEDICAL_HISTORY_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSPastMedicalHistorySection target) {

			}

			@Override
			protected void updateToPass(EMSPastMedicalHistorySection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSPastMedicalHistorySectionOperations.validateEMSPastMedicalHistorySectionEntry2(
					(EMSPastMedicalHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPastMedicalHistorySectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPastMedicalHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPastMedicalHistorySection> {
		public EMSPastMedicalHistorySection create() {
			return EmspcrFactory.eINSTANCE.createEMSPastMedicalHistorySection();
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
	private static class ConstructorTestClass extends EMSPastMedicalHistorySectionOperations {
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

} // EMSPastMedicalHistorySectionOperations
