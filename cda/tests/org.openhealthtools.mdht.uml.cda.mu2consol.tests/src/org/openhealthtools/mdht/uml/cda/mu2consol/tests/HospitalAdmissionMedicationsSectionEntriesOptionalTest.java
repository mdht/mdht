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

import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalAdmissionMedicationsSectionEntriesOptionalOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '
 * <em><b>Hospital Admission Medications Section Entries Optional</b></em>'
 * model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Admission Medications Section Entries Optional Admission Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionMedicationsSectionEntriesOptional#getmu2consolAdmissionMedications() <em>Getmu2consol Admission Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionMedicationsSectionEntriesOptionalTest extends
		CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication() {
			OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_ADMISSION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedication(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolHospitalAdmissionMedicationsSectionEntriesOptionalAdmissionMedicationTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolAdmissionMedications() {


HospitalAdmissionMedicationsSectionEntriesOptional target = objectFactory.create();
target.getmu2consolAdmissionMedications();



}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory
			implements
			TestObjectFactory<HospitalAdmissionMedicationsSectionEntriesOptional> {
		@Override
		public HospitalAdmissionMedicationsSectionEntriesOptional create() {
			return Mu2consolFactory.eINSTANCE
					.createHospitalAdmissionMedicationsSectionEntriesOptional();
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
			HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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

} // HospitalAdmissionMedicationsSectionEntriesOptionalOperations