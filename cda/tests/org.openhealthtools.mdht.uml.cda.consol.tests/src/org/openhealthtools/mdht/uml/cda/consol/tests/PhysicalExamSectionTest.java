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
import org.openhealthtools.mdht.uml.cda.consol.AbdomenSection;
import org.openhealthtools.mdht.uml.cda.consol.BreastSection;
import org.openhealthtools.mdht.uml.cda.consol.ChestWallSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.consol.EarsSection;
import org.openhealthtools.mdht.uml.cda.consol.EndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.ExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.consol.EyesSection;
import org.openhealthtools.mdht.uml.cda.consol.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.consol.HeadSection;
import org.openhealthtools.mdht.uml.cda.consol.HeartSection;
import org.openhealthtools.mdht.uml.cda.consol.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.LymphaticSection;
import org.openhealthtools.mdht.uml.cda.consol.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.consol.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.NeckSection;
import org.openhealthtools.mdht.uml.cda.consol.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.consol.NoseSection;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.consol.RectumSection;
import org.openhealthtools.mdht.uml.cda.consol.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.consol.ThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.consol.VesselsSection;
import org.openhealthtools.mdht.uml.cda.consol.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionGeneralAppearanceSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionIntegumentarySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionHeadSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEyesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEarsNoseMouthThroatSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEarsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionNoseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionMouthThroatTeethSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionNeckSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionEndocrineSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionThoraxLungsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionChestWallSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionBreastSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionHeartSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionRespiratorySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionAbdomenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionLymphaticSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionVesselsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionMusculoskeletalSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionNeurologicSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionGenitaliaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionRectumSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#validatePhysicalExamSectionExtremitiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Extremities Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getConditions() <em>Get Conditions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getGeneralAppearanceSection() <em>Get General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getVisibleImplantedMedicalDevicesSection() <em>Get Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getIntegumentarySystemSection() <em>Get Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getHeadSection() <em>Get Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getEyesSection() <em>Get Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getEarsNoseMouthThroatSection() <em>Get Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getEarsSection() <em>Get Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getNoseSection() <em>Get Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getMouthThroatTeethSection() <em>Get Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getNeckSection() <em>Get Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getEndocrineSystemSection() <em>Get Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getThoraxLungsSection() <em>Get Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getChestWallSection() <em>Get Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getBreastSection() <em>Get Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getHeartSection() <em>Get Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getRespiratorySystemSection() <em>Get Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getAbdomenSection() <em>Get Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getLymphaticSection() <em>Get Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getVesselsSection() <em>Get Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getMusculoskeletalSystemSection() <em>Get Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getNeurologicSystemSection() <em>Get Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getGenitaliaSection() <em>Get Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getRectumSection() <em>Get Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicalExamSection#getExtremitiesSection() <em>Get Extremities Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicalExamSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionTemplateId() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionTemplateIdTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionTemplateId(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCode() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionCodeTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCode(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionCondition() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionConditionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionCondition(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionVitalSignsSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionVitalSignsSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				ConsolFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionVitalSignsSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicalExamSectionGeneralAppearanceSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionGeneralAppearanceSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionGeneralAppearanceSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionGeneralAppearanceSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionGeneralAppearanceSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionVisibleImplantedMedicalDevicesSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionVisibleImplantedMedicalDevicesSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* VisibleImplantedMedicalDevicesSection */
				VisibleImplantedMedicalDevicesSection section =

				ConsolFactory.eINSTANCE.createVisibleImplantedMedicalDevicesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionVisibleImplantedMedicalDevicesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionIntegumentarySystemSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionIntegumentarySystemSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionIntegumentarySystemSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* IntegumentarySystemSection */
				IntegumentarySystemSection section =

				ConsolFactory.eINSTANCE.createIntegumentarySystemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionIntegumentarySystemSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionIntegumentarySystemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionHeadSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionHeadSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionHeadSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* HeadSection */
				HeadSection section =

				ConsolFactory.eINSTANCE.createHeadSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionHeadSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionHeadSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionEyesSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEyesSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEyesSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* EyesSection */
				EyesSection section =

				ConsolFactory.eINSTANCE.createEyesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEyesSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEyesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionEarsNoseMouthThroatSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEarsNoseMouthThroatSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEarsNoseMouthThroatSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* EarsNoseMouthThroatSection */
				EarsNoseMouthThroatSection section =

				ConsolFactory.eINSTANCE.createEarsNoseMouthThroatSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEarsNoseMouthThroatSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEarsNoseMouthThroatSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionEarsSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEarsSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEarsSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* EarsSection */
				EarsSection section =

				ConsolFactory.eINSTANCE.createEarsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEarsSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEarsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionNoseSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionNoseSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionNoseSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* NoseSection */
				NoseSection section =

				ConsolFactory.eINSTANCE.createNoseSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionNoseSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNoseSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionMouthThroatTeethSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionMouthThroatTeethSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionMouthThroatTeethSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* MouthThroatTeethSection */
				MouthThroatTeethSection section =

				ConsolFactory.eINSTANCE.createMouthThroatTeethSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionMouthThroatTeethSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionMouthThroatTeethSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionNeckSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionNeckSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionNeckSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* NeckSection */
				NeckSection section =

				ConsolFactory.eINSTANCE.createNeckSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionNeckSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNeckSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionEndocrineSystemSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionEndocrineSystemSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionEndocrineSystemSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* EndocrineSystemSection */
				EndocrineSystemSection section =

				ConsolFactory.eINSTANCE.createEndocrineSystemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionEndocrineSystemSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionEndocrineSystemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionThoraxLungsSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionThoraxLungsSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionThoraxLungsSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* ThoraxLungsSection */
				ThoraxLungsSection section =

				ConsolFactory.eINSTANCE.createThoraxLungsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionThoraxLungsSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionThoraxLungsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionChestWallSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionChestWallSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionChestWallSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* ChestWallSection */
				ChestWallSection section =

				ConsolFactory.eINSTANCE.createChestWallSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionChestWallSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionChestWallSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionBreastSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionBreastSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionBreastSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* BreastSection */
				BreastSection section =

				ConsolFactory.eINSTANCE.createBreastSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionBreastSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionBreastSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionHeartSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionHeartSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionHeartSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* HeartSection */
				HeartSection section =

				ConsolFactory.eINSTANCE.createHeartSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionHeartSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionHeartSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionRespiratorySystemSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionRespiratorySystemSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionRespiratorySystemSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* RespiratorySystemSection */
				RespiratorySystemSection section =

				ConsolFactory.eINSTANCE.createRespiratorySystemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionRespiratorySystemSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionRespiratorySystemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionAbdomenSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionAbdomenSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionAbdomenSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* AbdomenSection */
				AbdomenSection section =

				ConsolFactory.eINSTANCE.createAbdomenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionAbdomenSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionAbdomenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionLymphaticSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionLymphaticSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionLymphaticSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* LymphaticSection */
				LymphaticSection section =

				ConsolFactory.eINSTANCE.createLymphaticSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionLymphaticSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionLymphaticSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionVesselsSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionVesselsSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionVesselsSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* VesselsSection */
				VesselsSection section =

				ConsolFactory.eINSTANCE.createVesselsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionVesselsSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionVesselsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionMusculoskeletalSystemSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionMusculoskeletalSystemSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionMusculoskeletalSystemSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* MusculoskeletalSystemSection */
				MusculoskeletalSystemSection section =

				ConsolFactory.eINSTANCE.createMusculoskeletalSystemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionMusculoskeletalSystemSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionMusculoskeletalSystemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionNeurologicSystemSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionNeurologicSystemSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionNeurologicSystemSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* NeurologicSystemSection */
				NeurologicSystemSection section =

				ConsolFactory.eINSTANCE.createNeurologicSystemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionNeurologicSystemSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionNeurologicSystemSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionGenitaliaSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionGenitaliaSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionGenitaliaSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* GenitaliaSection */
				GenitaliaSection section =

				ConsolFactory.eINSTANCE.createGenitaliaSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionGenitaliaSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionGenitaliaSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionRectumSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionRectumSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionRectumSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* RectumSection */
				RectumSection section =

				ConsolFactory.eINSTANCE.createRectumSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionRectumSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionRectumSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicalExamSectionExtremitiesSection() {
		OperationsTestCase<PhysicalExamSection> validatePhysicalExamSectionExtremitiesSectionTestCase = new OperationsTestCase<PhysicalExamSection>(
			"validatePhysicalExamSectionExtremitiesSection",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicalExamSection target) {

			}

			@Override
			protected void updateToPass(PhysicalExamSection target) {
				target.init();

				/* ExtremitiesSection */
				ExtremitiesSection section =

				ConsolFactory.eINSTANCE.createExtremitiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicalExamSectionOperations.validatePhysicalExamSectionExtremitiesSection(
					(PhysicalExamSection) objectToTest, diagnostician, map);
			}

		};

		validatePhysicalExamSectionExtremitiesSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetConditions() {

		PhysicalExamSection target = objectFactory.create();
		target.getConditions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralAppearanceSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getGeneralAppearanceSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVisibleImplantedMedicalDevicesSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getVisibleImplantedMedicalDevicesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIntegumentarySystemSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getIntegumentarySystemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHeadSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getHeadSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEyesSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getEyesSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEarsNoseMouthThroatSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getEarsNoseMouthThroatSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEarsSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getEarsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNoseSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getNoseSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMouthThroatTeethSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getMouthThroatTeethSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNeckSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getNeckSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetEndocrineSystemSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getEndocrineSystemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetThoraxLungsSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getThoraxLungsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetChestWallSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getChestWallSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetBreastSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getBreastSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHeartSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getHeartSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetRespiratorySystemSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getRespiratorySystemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAbdomenSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getAbdomenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetLymphaticSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getLymphaticSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVesselsSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getVesselsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMusculoskeletalSystemSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getMusculoskeletalSystemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetNeurologicSystemSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getNeurologicSystemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGenitaliaSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getGenitaliaSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetRectumSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getRectumSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetExtremitiesSection() {

		PhysicalExamSection target = objectFactory.create();
		target.getExtremitiesSection();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicalExamSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicalExamSection> {
		public PhysicalExamSection create() {
			return ConsolFactory.eINSTANCE.createPhysicalExamSection();
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
	private static class ConstructorTestClass extends PhysicalExamSectionOperations {
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

} // PhysicalExamSectionOperations
