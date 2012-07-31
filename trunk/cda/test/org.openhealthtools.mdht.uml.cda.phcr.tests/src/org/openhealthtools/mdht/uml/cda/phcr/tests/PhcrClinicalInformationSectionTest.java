/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionPatientConditionConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Patient Condition Constraint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionPatientConditionAliveObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Patient Condition Alive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Patient Condition Deceased Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Phcr Relevant Medical Condition History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#getCaseObservation() <em>Get Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#getPatientConditionAliveObservation() <em>Get Patient Condition Alive Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#getPatientConditionDeceasedObservation() <em>Get Patient Condition Deceased Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection#getPhcrRelevantMedicalConditionHistoryObservations() <em>Get Phcr Relevant Medical Condition History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhcrClinicalInformationSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionPatientConditionConstraint() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionPatientConditionConstraintTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionPatientConditionConstraint",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_CONSTRAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionConstraint(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionPatientConditionConstraintTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionTemplateId() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionTemplateIdTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTemplateId(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionCode() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionCodeTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCode(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionCodeP() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionCodePTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCodeP(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionTitle() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionTitleTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionTitle(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionText() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionTextTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionText(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionCaseObservation() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionCaseObservationTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionCaseObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionCaseObservation(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionCaseObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionPatientConditionAliveObservation() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionPatientConditionAliveObservationTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionPatientConditionAliveObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_ALIVE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionAliveObservation(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionPatientConditionAliveObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionPatientConditionDeceasedObservation() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionPatientConditionDeceasedObservationTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_PATIENT_CONDITION_DECEASED_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPatientConditionDeceasedObservation(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionPatientConditionDeceasedObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation() {
		OperationsTestCase<PhcrClinicalInformationSection> validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservationTestCase = new OperationsTestCase<PhcrClinicalInformationSection>(
			"validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation",
			operationsForOCL.getOCLValue("VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_PHCR_RELEVANT_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhcrClinicalInformationSection target) {

			}

			@Override
			protected void updateToPass(PhcrClinicalInformationSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhcrClinicalInformationSectionOperations.validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservation(
					(PhcrClinicalInformationSection) objectToTest, diagnostician, map);
			}

		};

		validatePhcrClinicalInformationSectionPhcrRelevantMedicalConditionHistoryObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCaseObservation() {

		PhcrClinicalInformationSection target = objectFactory.create();
		target.getCaseObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientConditionAliveObservation() {

		PhcrClinicalInformationSection target = objectFactory.create();
		target.getPatientConditionAliveObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientConditionDeceasedObservation() {

		PhcrClinicalInformationSection target = objectFactory.create();
		target.getPatientConditionDeceasedObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhcrRelevantMedicalConditionHistoryObservations() {

		PhcrClinicalInformationSection target = objectFactory.create();
		target.getPhcrRelevantMedicalConditionHistoryObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhcrClinicalInformationSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhcrClinicalInformationSection> {
		public PhcrClinicalInformationSection create() {
			return PhcrFactory.eINSTANCE.createPhcrClinicalInformationSection();
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
	private static class ConstructorTestClass extends PhcrClinicalInformationSectionOperations {
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

} // PhcrClinicalInformationSectionOperations
