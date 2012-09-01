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

import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalAdmissionDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Admission Diagnosis Section</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection#validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Hospital Admission Diagnosis Section Hospital Admission Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection#getmu2consolHospitalAdmissionDiagnosis() <em>Getmu2consol Hospital Admission Diagnosis</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalAdmissionDiagnosisSection#validateHospitalAdmissionDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Diagnosis Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionDiagnosisSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis() {
			OperationsTestCase<HospitalAdmissionDiagnosisSection> validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_HOSPITAL_ADMISSION_DIAGNOSIS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalAdmissionDiagnosisSectionOperations.validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosis(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolHospitalAdmissionDiagnosisSectionHospitalAdmissionDiagnosisTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolHospitalAdmissionDiagnosis() {


HospitalAdmissionDiagnosisSection target = objectFactory.create();
target.getmu2consolHospitalAdmissionDiagnosis();



}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionDiagnosisSectionTemplateId() {
			OperationsTestCase<HospitalAdmissionDiagnosisSection> validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionDiagnosisSection>(
			"validateHospitalAdmissionDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionDiagnosisSection target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return HospitalAdmissionDiagnosisSectionOperations.validateHospitalAdmissionDiagnosisSectionTemplateId(
					(HospitalAdmissionDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionDiagnosisSectionTemplateIdTestCase.doValidationTest();
}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends HospitalAdmissionDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionDiagnosisSection> {

		public HospitalAdmissionDiagnosisSection create() {
			return Mu2consolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection();
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
	private static class ConstructorTestClass extends HospitalAdmissionDiagnosisSectionOperations {
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

} // HospitalAdmissionDiagnosisSectionOperations
