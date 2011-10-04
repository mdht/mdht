/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection;
import org.openhealthtools.mdht.uml.cda.ihe.BreastSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection;
import org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.ihe.EarsSection;
import org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.ihe.EyesSection;
import org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection;
import org.openhealthtools.mdht.uml.cda.ihe.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.ihe.HeadSection;
import org.openhealthtools.mdht.uml.cda.ihe.HeartSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection;
import org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.NeckSection;
import org.openhealthtools.mdht.uml.cda.ihe.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.NoseSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.RectumSection;
import org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.ihe.VesselsSection;
import org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PhysicalExamSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionGeneralAppearanceSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionIntegumentarySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionHeadSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEyesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEarsNoseMouthThroatSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEarsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNoseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionMouthThroatTeethSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNeckSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEndocrineSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionThoraxLungsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionChestWallSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionBreastSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionHeartSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionRespiratorySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionAbdomenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionLymphaticSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVesselsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionMusculoskeletalSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNeurologicSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionGenitaliaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionRectumSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionExtremitiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Extremities Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getGeneralAppearanceSection() <em>Get General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVisibleImplantedMedicalDevicesSection() <em>Get Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getIntegumentarySystemSection() <em>Get Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getHeadSection() <em>Get Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEyesSection() <em>Get Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEarsNoseMouthThroatSection() <em>Get Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEarsSection() <em>Get Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNoseSection() <em>Get Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getMouthThroatTeethSection() <em>Get Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNeckSection() <em>Get Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEndocrineSystemSection() <em>Get Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getThoraxLungsSection() <em>Get Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getChestWallSection() <em>Get Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getBreastSection() <em>Get Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getHeartSection() <em>Get Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getRespiratorySystemSection() <em>Get Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getAbdomenSection() <em>Get Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getLymphaticSection() <em>Get Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVesselsSection() <em>Get Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getMusculoskeletalSystemSection() <em>Get Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNeurologicSystemSection() <em>Get Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getGenitaliaSection() <em>Get Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getRectumSection() <em>Get Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getExtremitiesSection() <em>Get Extremities Section</em>}</li>
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

				IHEFactory.eINSTANCE.createVitalSignsSection().init();

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
	* @generated
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

				/* GeneralAppearanceSection */
				GeneralAppearanceSection section =

				IHEFactory.eINSTANCE.createGeneralAppearanceSection().init();

				target.addSection(section);

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

				IHEFactory.eINSTANCE.createVisibleImplantedMedicalDevicesSection().init();

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

				IHEFactory.eINSTANCE.createIntegumentarySystemSection().init();

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

				IHEFactory.eINSTANCE.createHeadSection().init();

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

				IHEFactory.eINSTANCE.createEyesSection().init();

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

				IHEFactory.eINSTANCE.createEarsNoseMouthThroatSection().init();

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

				IHEFactory.eINSTANCE.createEarsSection().init();

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

				IHEFactory.eINSTANCE.createNoseSection().init();

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

				IHEFactory.eINSTANCE.createMouthThroatTeethSection().init();

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

				IHEFactory.eINSTANCE.createNeckSection().init();

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

				IHEFactory.eINSTANCE.createEndocrineSystemSection().init();

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

				IHEFactory.eINSTANCE.createThoraxLungsSection().init();

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

				IHEFactory.eINSTANCE.createChestWallSection().init();

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

				IHEFactory.eINSTANCE.createBreastSection().init();

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

				IHEFactory.eINSTANCE.createHeartSection().init();

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

				IHEFactory.eINSTANCE.createRespiratorySystemSection().init();

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

				IHEFactory.eINSTANCE.createAbdomenSection().init();

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

				IHEFactory.eINSTANCE.createLymphaticSection().init();

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

				IHEFactory.eINSTANCE.createVesselsSection().init();

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

				IHEFactory.eINSTANCE.createMusculoskeletalSystemSection().init();

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

				IHEFactory.eINSTANCE.createNeurologicSystemSection().init();

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

				IHEFactory.eINSTANCE.createGenitaliaSection().init();

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

				IHEFactory.eINSTANCE.createRectumSection().init();

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

				IHEFactory.eINSTANCE.createExtremitiesSection().init();

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
			return IHEFactory.eINSTANCE.createPhysicalExamSection();
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
