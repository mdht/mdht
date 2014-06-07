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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSPhysicalAssessmentSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>EMS Physical Assessment Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPatientPregnancy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionLastOralIntake(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionPatientAge(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionThrombolyticContraindications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#validateEMSPhysicalAssessmentSectionBarriersToPatientCare(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMS Physical Assessment Section Barriers To Patient Care</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPhysicalAssessmentOrganizer() <em>Get Physical Assessment Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPatientPregnancy() <em>Get Patient Pregnancy</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getLastOralIntake() <em>Get Last Oral Intake</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getPatientAge() <em>Get Patient Age</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getThrombolyticContraindications() <em>Get Thrombolytic Contraindications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EMSPhysicalAssessmentSection#getBarriersToPatientCare() <em>Get Barriers To Patient Care</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EMSPhysicalAssessmentSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionTemplateId() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTemplateIdTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTemplateId(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionCode() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionCodeTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCode(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionCodeP() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionCodePTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionCodeP(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionTitle() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTitleTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionTitle(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionText() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionTextTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionText(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizerTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PHYSICAL_ASSESSMENT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizer(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionPhysicalAssessmentOrganizerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionPatientPregnancy() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionPatientPregnancyTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionPatientPregnancy",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_PREGNANCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPatientPregnancy(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionPatientPregnancyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionLastOralIntake() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionLastOralIntakeTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionLastOralIntake",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_LAST_ORAL_INTAKE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionLastOralIntake(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionLastOralIntakeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionPatientAge() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionPatientAgeTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionPatientAge",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_PATIENT_AGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionPatientAge(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionPatientAgeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionThrombolyticContraindications() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionThrombolyticContraindicationsTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionThrombolyticContraindications",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_THROMBOLYTIC_CONTRAINDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionThrombolyticContraindications(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionThrombolyticContraindicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPhysicalAssessmentSectionBarriersToPatientCare() {
		OperationsTestCase<EMSPhysicalAssessmentSection> validateEMSPhysicalAssessmentSectionBarriersToPatientCareTestCase = new OperationsTestCase<EMSPhysicalAssessmentSection>(
			"validateEMSPhysicalAssessmentSectionBarriersToPatientCare",
			operationsForOCL.getOCLValue("VALIDATE_EMS_PHYSICAL_ASSESSMENT_SECTION_BARRIERS_TO_PATIENT_CARE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EMSPhysicalAssessmentSection target) {

			}

			@Override
			protected void updateToPass(EMSPhysicalAssessmentSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EMSPhysicalAssessmentSectionOperations.validateEMSPhysicalAssessmentSectionBarriersToPatientCare(
					(EMSPhysicalAssessmentSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPhysicalAssessmentSectionBarriersToPatientCareTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalAssessmentOrganizer() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getPhysicalAssessmentOrganizer();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientPregnancy() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getPatientPregnancy();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLastOralIntake() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getLastOralIntake();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPatientAge() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getPatientAge();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetThrombolyticContraindications() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getThrombolyticContraindications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBarriersToPatientCare() {

		EMSPhysicalAssessmentSection target = objectFactory.create();
		target.getBarriersToPatientCare();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EMSPhysicalAssessmentSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EMSPhysicalAssessmentSection> {
		public EMSPhysicalAssessmentSection create() {
			return EmspcrFactory.eINSTANCE.createEMSPhysicalAssessmentSection();
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
	private static class ConstructorTestClass extends EMSPhysicalAssessmentSectionOperations {
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

} // EMSPhysicalAssessmentSectionOperations
