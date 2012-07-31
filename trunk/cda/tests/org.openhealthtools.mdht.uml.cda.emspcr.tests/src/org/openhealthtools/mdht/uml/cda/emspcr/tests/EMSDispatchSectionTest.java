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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispatchSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Dispatch Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection#validateEMSDispatchSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Dispatch Section Entry2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSDispatchSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionTemplateId() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionTemplateIdTestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionTemplateId(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionCode() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionCodeTestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionCode(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionTitle() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionTitleTestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionTitle(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionText() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionTextTestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionText(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionEntry1() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionEntry1TestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionEntry1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionEntry1(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSDispatchSectionEntry2() {
			OperationsTestCase<EMSDispatchSection> validateEMSDispatchSectionEntry2TestCase = new OperationsTestCase<EMSDispatchSection>(
			"validateEMSDispatchSectionEntry2",
			operationsForOCL.getOCLValue("VALIDATE_EMS_DISPATCH_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSDispatchSection target) {

			}

			@Override
			protected void updateToPass(EMSDispatchSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSDispatchSectionOperations.validateEMSDispatchSectionEntry2(
					(EMSDispatchSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSDispatchSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSDispatchSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSDispatchSection> {
		public EMSDispatchSection create() {
			return EmspcrFactory.eINSTANCE.createEMSDispatchSection();
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
	private static class ConstructorTestClass extends EMSDispatchSectionOperations {
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

} // EMSDispatchSectionOperations
