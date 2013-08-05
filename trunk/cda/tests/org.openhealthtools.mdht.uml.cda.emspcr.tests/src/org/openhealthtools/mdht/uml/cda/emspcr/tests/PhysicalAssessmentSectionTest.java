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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PhysicalAssessmentSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPatientPregnancy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionLastOralIntake(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionPatientAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionThrombolyticContraindications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalAssessmentSectionBarriersToPatientCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Assessment Section Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPhysicalAssessmentOrganizer() <em>Get Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPatientPregnancy() <em>Get Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getLastOralIntake() <em>Get Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getPatientAge() <em>Get Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getThrombolyticContraindications() <em>Get Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#getBarriersToPatientCare() <em>Get Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PhysicalAssessmentSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalAssessmentSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionCodeP() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionCodePTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionCodeP(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionCode() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionCodeTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionCode(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionTitle() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionTitleTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionTitle(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionText() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionTextTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionText",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionText(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionPhysicalAssessmentOrganizer() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionPhysicalAssessmentOrganizerTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPhysicalAssessmentOrganizer(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionPhysicalAssessmentOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionPatientPregnancy() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionPatientPregnancyTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionPatientPregnancy",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPatientPregnancy(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionPatientPregnancyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionLastOralIntake() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionLastOralIntakeTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionLastOralIntake",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionLastOralIntake(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionLastOralIntakeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionPatientAge() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionPatientAgeTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionPatientAge",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionPatientAge(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionPatientAgeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionThrombolyticContraindications() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionThrombolyticContraindicationsTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionThrombolyticContraindications",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionThrombolyticContraindications(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionThrombolyticContraindicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalAssessmentSectionBarriersToPatientCare() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalAssessmentSectionBarriersToPatientCareTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalAssessmentSectionBarriersToPatientCare",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalAssessmentSectionBarriersToPatientCare(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalAssessmentSectionBarriersToPatientCareTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalAssessmentOrganizer() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getPhysicalAssessmentOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPregnancy() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getPatientPregnancy();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLastOralIntake() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getLastOralIntake();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientAge() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getPatientAge();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetThrombolyticContraindications() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getThrombolyticContraindications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBarriersToPatientCare() {

		PhysicalAssessmentSection target = objectFactory.create();
		target.getBarriersToPatientCare();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalAssessmentSection> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalAssessmentSection>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(PhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalAssessmentSectionOperations.validatePhysicalExamSectionTemplateId(
					(PhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalAssessmentSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalAssessmentSection> {
		public PhysicalAssessmentSection create() {
			return EmspcrFactory.eINSTANCE.createPhysicalAssessmentSection();
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
	private static class ConstructorTestClass extends PhysicalAssessmentSectionOperations {
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

} // PhysicalAssessmentSectionOperations
