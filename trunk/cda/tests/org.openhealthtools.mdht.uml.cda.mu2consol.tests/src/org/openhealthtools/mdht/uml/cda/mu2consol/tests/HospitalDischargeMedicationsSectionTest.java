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

import org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.HospitalDischargeMedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Hospital Discharge Medications Section</b></em>' model
 * objects. <!-- end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Hospital Discharge Medications Section Discharge
 * Medication</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Hospital Discharge Medications Section Medication
 * Activity</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#getmu2consolDischargeMedications()
 * <em>Getmu2consol Discharge Medications</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.HospitalDischargeMedicationsSection#getMedicationActivity()
 * <em>Get Medication Activity</em>}</li>
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
	public void testValidateMu2consolHospitalDischargeMedicationsSectionDischargeMedication() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateMu2consolHospitalDischargeMedicationsSectionDischargeMedicationTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
				"validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_DISCHARGE_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(
					HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(
					HospitalDischargeMedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations
						.validateMu2consolHospitalDischargeMedicationsSectionDischargeMedication(
								(HospitalDischargeMedicationsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolHospitalDischargeMedicationsSectionDischargeMedicationTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolHospitalDischargeMedicationsSectionMedicationActivity() {
		OperationsTestCase<HospitalDischargeMedicationsSection> validateMu2consolHospitalDischargeMedicationsSectionMedicationActivityTestCase = new OperationsTestCase<HospitalDischargeMedicationsSection>(
				"validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_HOSPITAL_DISCHARGE_MEDICATIONS_SECTION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(
					HospitalDischargeMedicationsSection target) {

			}

			@Override
			protected void updateToPass(
					HospitalDischargeMedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeMedicationsSectionOperations
						.validateMu2consolHospitalDischargeMedicationsSectionMedicationActivity(
								(HospitalDischargeMedicationsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolHospitalDischargeMedicationsSectionMedicationActivityTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetmu2consolDischargeMedications() {

		HospitalDischargeMedicationsSection target = objectFactory.create();
		target.getmu2consolDischargeMedications();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationActivity() {

		HospitalDischargeMedicationsSection target = objectFactory.create();
		target.getMedicationActivity();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			HospitalDischargeMedicationsSectionOperations {
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
			TestObjectFactory<HospitalDischargeMedicationsSection> {
		@Override
		public HospitalDischargeMedicationsSection create() {
			return Mu2consolFactory.eINSTANCE
					.createHospitalDischargeMedicationsSection();
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
			HospitalDischargeMedicationsSectionOperations {
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

} // HospitalDischargeMedicationsSectionOperations