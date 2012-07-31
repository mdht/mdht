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

import org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSInjuryIncidentDescriptionSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Injury Incident Description Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry3(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry3</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry4(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry4</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry5(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry5</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry6(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry6</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry7(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry7</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry8(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry8</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry9(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry9</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry10(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry10</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry11(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry11</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSInjuryIncidentDescriptionSection#validateEMSInjuryIncidentDescriptionSectionEntry12(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Injury Incident Description Section Entry12</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSInjuryIncidentDescriptionSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionTemplateId() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTemplateIdTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTemplateId(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionCode() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionCodeTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionCode(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionTitle() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTitleTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionTitle(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionText() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionTextTestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionText(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry3() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry3TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry3",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY3__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry3(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry3TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry4() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry4TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry4",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY4__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry4(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry4TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry5() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry5TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry5",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY5__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry5(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry5TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry6() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry6TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry6",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY6__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry6(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry6TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry7() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry7TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry7",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY7__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry7(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry7TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry8() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry8TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry8",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY8__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry8(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry8TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry9() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry9TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry9",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY9__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry9(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry9TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry10() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry10TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry10",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY10__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry10(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry10TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry11() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry11TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry11",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY11__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry11(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry11TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSInjuryIncidentDescriptionSectionEntry12() {
			OperationsTestCase<EMSInjuryIncidentDescriptionSection> validateEMSInjuryIncidentDescriptionSectionEntry12TestCase = new OperationsTestCase<EMSInjuryIncidentDescriptionSection>(
			"validateEMSInjuryIncidentDescriptionSectionEntry12",
			operationsForOCL.getOCLValue("VALIDATE_EMS_INJURY_INCIDENT_DESCRIPTION_SECTION_ENTRY12__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(EMSInjuryIncidentDescriptionSection target) {

			}

			@Override
			protected void updateToPass(EMSInjuryIncidentDescriptionSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return EMSInjuryIncidentDescriptionSectionOperations.validateEMSInjuryIncidentDescriptionSectionEntry12(
					(EMSInjuryIncidentDescriptionSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSInjuryIncidentDescriptionSectionEntry12TestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSInjuryIncidentDescriptionSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSInjuryIncidentDescriptionSection> {
		public EMSInjuryIncidentDescriptionSection create() {
			return EmspcrFactory.eINSTANCE.createEMSInjuryIncidentDescriptionSection();
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
	private static class ConstructorTestClass extends EMSInjuryIncidentDescriptionSectionOperations {
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

} // EMSInjuryIncidentDescriptionSectionOperations
