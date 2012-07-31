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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSTimesSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Times Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSTimesSection#validateEMSTimesSectionEntry9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Times Section Entry9</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSTimesSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionTemplateId() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTemplateIdTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionTemplateId(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionCode() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionCodeTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionCode(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionTitle() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTitleTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionTitle(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionText() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionTextTestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionText(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry1() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry1TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry1",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry1(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry1TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry2() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry2TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry2",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry2(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry2TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry3() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry3TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry3",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry3(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry4() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry4TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry4",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry4(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry5() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry5TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry5",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry5(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry5TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry6() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry6TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry6",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry6(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry6TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry7() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry7TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry7",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry7(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry7TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry8() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry8TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry8",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry8(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry8TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSTimesSectionEntry9() {
			OperationsTestCase<EMSTimesSection> validateEMSTimesSectionEntry9TestCase = new OperationsTestCase<EMSTimesSection>(
			"validateEMSTimesSectionEntry9",
			operationsForOCL.getOCLValue("VALIDATE_EMS_TIMES_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSTimesSection target) {

			}

			@Override
			protected void updateToPass(EMSTimesSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSTimesSectionOperations.validateEMSTimesSectionEntry9(
					(EMSTimesSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSTimesSectionEntry9TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSTimesSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSTimesSection> {
		public EMSTimesSection create() {
			return EmspcrFactory.eINSTANCE.createEMSTimesSection();
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
	private static class ConstructorTestClass extends EMSTimesSectionOperations {
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

} // EMSTimesSectionOperations
