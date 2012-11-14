/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.cdt.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.FamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.cda.ccd.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.CDTFactory;
import org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote;
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReasonForVisitSectionConsult;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.ConsultationNoteOperations;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Consultation Note</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteReferralOrVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Referral Or Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNotePhysicalExamination(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNotePastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateConsultationNoteDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consultation Note Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getPhysicalExamination() <em>Get Physical Examination</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.ConsultationNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated NOT
 */

public class ConsultationNoteTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationNoteReferralOrVisit() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteReferralOrVisitTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteReferralOrVisit",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_REFERRAL_OR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();
				ReasonForVisitSectionConsult rfvsc = CDTFactory.eINSTANCE.createReasonForVisitSectionConsult().init();
				target.addSection(rfvsc);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteReferralOrVisit(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteReferralOrVisitTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteHistoryOfPresentIllness() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteHistoryOfPresentIllnessTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteHistoryOfPresentIllness",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				HistoryOfPresentIllness hopi = CDTFactory.eINSTANCE.createHistoryOfPresentIllness().init();
				target.addSection(hopi);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteHistoryOfPresentIllness(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteHistoryOfPresentIllnessTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationNotePhysicalExamination() {
		OperationsTestCase<ConsultationNote> validateConsultationNotePhysicalExaminationTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNotePhysicalExamination",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PHYSICAL_EXAMINATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				PhysicalExaminationSection pes = CDTFactory.eINSTANCE.createPhysicalExaminationSection().init();

				target.addSection(pes);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNotePhysicalExamination(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNotePhysicalExaminationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteProblemSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteProblemSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				CCDFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteProblemSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteProceduresSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteProceduresSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				CCDFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteProceduresSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationNotePastMedicalHistorySection() {
		OperationsTestCase<ConsultationNote> validateConsultationNotePastMedicalHistorySectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNotePastMedicalHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* PastMedicalHistorySection */
				PastMedicalHistorySectionConsult section =

				CDTFactory.eINSTANCE.createPastMedicalHistorySectionConsult().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNotePastMedicalHistorySection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNotePastMedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteImmunizationsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteImmunizationsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				CCDFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteImmunizationsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteMedicationsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteMedicationsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				CCDFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteMedicationsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteAlertsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteAlertsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteAlertsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* AlertsSection */
				AlertsSection section =

				CCDFactory.eINSTANCE.createAlertsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteAlertsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteAlertsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteSocialHistorySection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteSocialHistorySectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				CCDFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteSocialHistorySection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteFamilyHistorySection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteFamilyHistorySectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				CCDFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteFamilyHistorySection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteReviewOfSystemsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteReviewOfSystemsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSection section =

				CDTFactory.eINSTANCE.createReviewOfSystemsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteReviewOfSystemsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteVitalSignsSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteVitalSignsSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* VitalSignsSection */
				org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection section =

				CCDFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteVitalSignsSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateConsultationNoteGeneralStatusSection() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteGeneralStatusSectionTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				CDTFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteGeneralStatusSection(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateConsultationNoteDiagnosticFindings() {
		OperationsTestCase<ConsultationNote> validateConsultationNoteDiagnosticFindingsTestCase = new OperationsTestCase<ConsultationNote>(
			"validateConsultationNoteDiagnosticFindings",
			operationsForOCL.getOCLValue("VALIDATE_CONSULTATION_NOTE_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();
				DiagnosticFindings df = CDTFactory.eINSTANCE.createDiagnosticFindings().init();
				target.addSection(df);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateConsultationNoteDiagnosticFindings(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateConsultationNoteDiagnosticFindingsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllness() {

		ConsultationNote target = objectFactory.create();
		target.getHistoryOfPresentIllness();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExamination() {

		ConsultationNote target = objectFactory.create();
		target.getPhysicalExamination();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {

		ConsultationNote target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection() {

		ConsultationNote target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPastMedicalHistorySection() {

		ConsultationNote target = objectFactory.create();
		target.getPastMedicalHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		ConsultationNote target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		ConsultationNote target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAlertsSection() {

		ConsultationNote target = objectFactory.create();
		target.getAlertsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		ConsultationNote target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		ConsultationNote target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		ConsultationNote target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		ConsultationNote target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		ConsultationNote target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDiagnosticFindings() {

		ConsultationNote target = objectFactory.create();
		target.getDiagnosticFindings();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ConsultationNoteOperations.validateGeneralHeaderConstraintsTemplateId(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<ConsultationNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<ConsultationNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ConsultationNote target) {

			}

			@Override
			protected void updateToPass(ConsultationNote target) {
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.1");
				ce.setCode("111");
				target.setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(ConsultationNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ConsultationNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ConsultationNote> {

		public ConsultationNote create() {
			return CDTFactory.eINSTANCE.createConsultationNote();
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
	private static class ConstructorTestClass extends ConsultationNoteOperations {
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

} // ConsultationNoteOperations
