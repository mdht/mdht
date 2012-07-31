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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCardiacArrestEventSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Cardiac Arrest Event Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection#validateEMSCardiacArrestEventSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Cardiac Arrest Event Section Entry1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSCardiacArrestEventSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCardiacArrestEventSectionTemplateId() {
			OperationsTestCase<EMSCardiacArrestEventSection> validateEMSCardiacArrestEventSectionTemplateIdTestCase = new OperationsTestCase<EMSCardiacArrestEventSection>(
			"validateEMSCardiacArrestEventSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(EMSCardiacArrestEventSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTemplateId(
					(EMSCardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCardiacArrestEventSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCardiacArrestEventSectionCode() {
			OperationsTestCase<EMSCardiacArrestEventSection> validateEMSCardiacArrestEventSectionCodeTestCase = new OperationsTestCase<EMSCardiacArrestEventSection>(
			"validateEMSCardiacArrestEventSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(EMSCardiacArrestEventSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionCode(
					(EMSCardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCardiacArrestEventSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCardiacArrestEventSectionTitle() {
			OperationsTestCase<EMSCardiacArrestEventSection> validateEMSCardiacArrestEventSectionTitleTestCase = new OperationsTestCase<EMSCardiacArrestEventSection>(
			"validateEMSCardiacArrestEventSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(EMSCardiacArrestEventSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTitle(
					(EMSCardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCardiacArrestEventSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCardiacArrestEventSectionText() {
			OperationsTestCase<EMSCardiacArrestEventSection> validateEMSCardiacArrestEventSectionTextTestCase = new OperationsTestCase<EMSCardiacArrestEventSection>(
			"validateEMSCardiacArrestEventSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(EMSCardiacArrestEventSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionText(
					(EMSCardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCardiacArrestEventSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSCardiacArrestEventSectionEntry1() {
			OperationsTestCase<EMSCardiacArrestEventSection> validateEMSCardiacArrestEventSectionEntry1TestCase = new OperationsTestCase<EMSCardiacArrestEventSection>(
			"validateEMSCardiacArrestEventSectionEntry1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_CARDIAC_ARREST_EVENT_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSCardiacArrestEventSection target) {

			}

			@Override
			protected void updateToPass(EMSCardiacArrestEventSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionEntry1(
					(EMSCardiacArrestEventSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSCardiacArrestEventSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSCardiacArrestEventSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSCardiacArrestEventSection> {
		public EMSCardiacArrestEventSection create() {
			return EmspcrFactory.eINSTANCE.createEMSCardiacArrestEventSection();
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
	private static class ConstructorTestClass extends EMSCardiacArrestEventSectionOperations {
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

} // EMSCardiacArrestEventSectionOperations
