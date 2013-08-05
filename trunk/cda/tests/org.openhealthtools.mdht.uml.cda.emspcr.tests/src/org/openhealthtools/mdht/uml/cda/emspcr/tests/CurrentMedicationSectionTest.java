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

import org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.CurrentMedicationSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Current Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionCurrentlyOnMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionPatientOnAnticoagulants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateCurrentMedicationSectionCurrentMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Current Medication Section Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getCurrentlyOnMedication() <em>Get Currently On Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getPatientOnAnticoagulants() <em>Get Patient On Anticoagulants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#getCurrentMedication() <em>Get Current Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CurrentMedicationSection#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class CurrentMedicationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationSectionTitle() {
		OperationsTestCase<CurrentMedicationSection> validateCurrentMedicationSectionTitleTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateCurrentMedicationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateCurrentMedicationSectionTitle(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationSectionText() {
		OperationsTestCase<CurrentMedicationSection> validateCurrentMedicationSectionTextTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateCurrentMedicationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateCurrentMedicationSectionText(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationSectionCurrentlyOnMedication() {
		OperationsTestCase<CurrentMedicationSection> validateCurrentMedicationSectionCurrentlyOnMedicationTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateCurrentMedicationSectionCurrentlyOnMedication",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_SECTION_CURRENTLY_ON_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateCurrentMedicationSectionCurrentlyOnMedication(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationSectionCurrentlyOnMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationSectionPatientOnAnticoagulants() {
		OperationsTestCase<CurrentMedicationSection> validateCurrentMedicationSectionPatientOnAnticoagulantsTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateCurrentMedicationSectionPatientOnAnticoagulants",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_SECTION_PATIENT_ON_ANTICOAGULANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateCurrentMedicationSectionPatientOnAnticoagulants(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationSectionPatientOnAnticoagulantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCurrentMedicationSectionCurrentMedication() {
		OperationsTestCase<CurrentMedicationSection> validateCurrentMedicationSectionCurrentMedicationTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateCurrentMedicationSectionCurrentMedication",
			operationsForOCL.getOCLValue("VALIDATE_CURRENT_MEDICATION_SECTION_CURRENT_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateCurrentMedicationSectionCurrentMedication(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateCurrentMedicationSectionCurrentMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCurrentlyOnMedication() {

		CurrentMedicationSection target = objectFactory.create();
		target.getCurrentlyOnMedication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientOnAnticoagulants() {

		CurrentMedicationSection target = objectFactory.create();
		target.getPatientOnAnticoagulants();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCurrentMedication() {

		CurrentMedicationSection target = objectFactory.create();
		target.getCurrentMedication();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<CurrentMedicationSection> validateMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<CurrentMedicationSection>(
			"validateMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CurrentMedicationSection target) {

			}

			@Override
			protected void updateToPass(CurrentMedicationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return CurrentMedicationSectionOperations.validateMedicationsSectionEntriesOptionalTemplateId(
					(CurrentMedicationSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends CurrentMedicationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<CurrentMedicationSection> {
		public CurrentMedicationSection create() {
			return EmspcrFactory.eINSTANCE.createCurrentMedicationSection();
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
	private static class ConstructorTestClass extends CurrentMedicationSectionOperations {
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

} // CurrentMedicationSectionOperations
