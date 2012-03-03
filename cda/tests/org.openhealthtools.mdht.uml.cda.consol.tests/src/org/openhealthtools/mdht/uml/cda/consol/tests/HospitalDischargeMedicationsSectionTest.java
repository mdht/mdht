/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeMedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Discharge Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#getConsolDischargeMedications() <em>Get Consol Discharge Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeMedicationsSection#validateHospitalDischargeMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeMedicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionText() {
			OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionTextTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionText",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text );
			
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionText(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionTextTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionTitle() {
			OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionTitleTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				
				
				
				
				

				
				

	
		
				ST  title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title );
				

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionTitle(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionTitleTestCase.doValidationTest();
}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionDischargeMedication() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionDischargeMedicationTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionDischargeMedication",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				target.addAct(ConsolFactory.eINSTANCE.createDischargeMedication());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionDischargeMedication(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionDischargeMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConsolDischargeMedications() {


HospitalDischargeMedicationsSection target = objectFactory.create();
target.getConsolDischargeMedications();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId() {
			OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateId(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeMedicationsSectionEntriesOptionalCode() {
			OperationsTestCase<HospitalDischargeMedicationsSection> validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
			"validateHospitalDischargeMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeMedicationsSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalDischargeMedicationsSectionOperations.validateHospitalDischargeMedicationsSectionEntriesOptionalCode(
					(HospitalDischargeMedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeMedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeMedicationsSection> {
		public HospitalDischargeMedicationsSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection();
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
	private static class ConstructorTestClass extends HospitalDischargeMedicationsSectionOperations {
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

} // HospitalDischargeMedicationsSectionOperations
