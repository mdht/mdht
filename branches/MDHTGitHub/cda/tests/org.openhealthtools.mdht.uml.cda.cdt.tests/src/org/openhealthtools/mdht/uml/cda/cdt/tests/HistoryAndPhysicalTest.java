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
import org.openhealthtools.mdht.uml.cda.cdt.DiagnosticFindings;
import org.openhealthtools.mdht.uml.cda.cdt.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical;
import org.openhealthtools.mdht.uml.cda.cdt.HistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.cdt.PastMedicalHistorySection;
import org.openhealthtools.mdht.uml.cda.cdt.PhysicalExaminationSection;
import org.openhealthtools.mdht.uml.cda.cdt.ReviewOfSystemsSectionIHE;
import org.openhealthtools.mdht.uml.cda.cdt.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.cdt.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.cdt.operations.HistoryAndPhysicalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>History And Physical</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalBothAssessmentAndPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Assessment And Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Both Reason For Visit And Chief Complaint</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalHistoryOfPresentIllness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalPastMedicalHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalAlertsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalFamilyHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalReviewOfSystemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalPhysicalExaminationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalGeneralStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalDiagnosticFindings(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateHistoryAndPhysicalImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History And Physical Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getPastMedicalHistorySection() <em>Get Past Medical History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getAlertsSection() <em>Get Alerts Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getFamilyHistorySection() <em>Get Family History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getReviewOfSystemsSection() <em>Get Review Of Systems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getPhysicalExaminationSection() <em>Get Physical Examination Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getGeneralStatusSection() <em>Get General Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getDiagnosticFindings() <em>Get Diagnostic Findings</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HistoryAndPhysical#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryAndPhysicalTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalAssessmentAndPlan() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalAssessmentAndPlanTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalAssessmentAndPlan",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();
				target.addSection(CDTFactory.eINSTANCE.createAssessmentAndPlanSection().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAssessmentAndPlan(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalAssessmentAndPlanTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalBothAssessmentAndPlan() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalBothAssessmentAndPlanTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalBothAssessmentAndPlan",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_BOTH_ASSESSMENT_AND_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {
				target.init();
				target.addSection(CDTFactory.eINSTANCE.createAssessmentSection().init());

				// target.addSection(CDTFactory.eINSTANCE.createAssessmentAndPlanSection().init());
				// target.addSection(CDTFactory.eINSTANCE.createAssessmentSection().init());

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.addSection(CDTFactory.eINSTANCE.createPlanSection().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothAssessmentAndPlan(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalBothAssessmentAndPlanTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated not
	 */
	@Test
	public void testValidateHistoryAndPhysicalReasonForVisitAndChiefComplaint() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalReasonForVisitAndChiefComplaintTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalReasonForVisitAndChiefComplaint",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			// cdt::ReasonForVisitAndChiefComplaintSection)) xor (self.getSections()->exists(section : cda::Section | not section.oclIsUndefined() and
			// section.oclIsKindOf(cdt::ReasonForVisitSection)) and self.getSections()->exists(section : cda::Section | not section.oclIsUndefined()
			// and section.oclIsKindOf(cdt::ChiefComplaintSection)))

			@Override
			public void addFailTests() {

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(HistoryAndPhysical target) {

					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(HistoryAndPhysical target) {

						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitAndChiefComplaintSection().init());
						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitSection().init());
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(HistoryAndPhysical target) {

						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitAndChiefComplaintSection().init());
						target.addSection(CDTFactory.eINSTANCE.createChiefComplaintSection().init());
					}
				});

				this.addFailTest(new FailTest() {

					@Override
					public void updateToFail(HistoryAndPhysical target) {

						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitAndChiefComplaintSection().init());
						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitSection().init());
						target.addSection(CDTFactory.eINSTANCE.createChiefComplaintSection().init());
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(HistoryAndPhysical target) {
						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitAndChiefComplaintSection().init());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(HistoryAndPhysical target) {

						target.addSection(CDTFactory.eINSTANCE.createReasonForVisitSection().init());
						target.addSection(CDTFactory.eINSTANCE.createChiefComplaintSection().init());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReasonForVisitAndChiefComplaint(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalReasonForVisitAndChiefComplaintTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaintTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_BOTH_REASON_FOR_VISIT_AND_CHIEF_COMPLAINT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

				target.init();
				target.addSection(CDTFactory.eINSTANCE.createChiefComplaintSection().init());

				//
				// ReasonForVisitSection rfvs = CDTFactory.eINSTANCE.createReasonForVisitSection().init();

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {

				// ChiefComplaintSection ccs = CDTFactory.eINSTANCE.createChiefComplaintSection().init();
				//
				target.addSection(CDTFactory.eINSTANCE.createReasonForVisitSection().init());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaint(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalBothReasonForVisitAndChiefComplaintTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateHistoryAndPhysicalCode() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalCodeTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalCode",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {
				target.init();
			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE("aaaa", "2.16.840.1.113883.6.1");
				target.setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalCode(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalHistoryOfPresentIllness() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalHistoryOfPresentIllnessTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalHistoryOfPresentIllness",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_HISTORY_OF_PRESENT_ILLNESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				HistoryOfPresentIllness hopi = CDTFactory.eINSTANCE.createHistoryOfPresentIllness().init();
				target.addSection(hopi);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalHistoryOfPresentIllness(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalHistoryOfPresentIllnessTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHistoryAndPhysicalPastMedicalHistorySection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalPastMedicalHistorySectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalPastMedicalHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_PAST_MEDICAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* PastMedicalHistorySection */
				PastMedicalHistorySection section =

				CDTFactory.eINSTANCE.createPastMedicalHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPastMedicalHistorySection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalPastMedicalHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalMedicationsSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalMedicationsSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				CCDFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalMedicationsSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalMedicationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalAlertsSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalAlertsSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalAlertsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_ALERTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* AlertsSection */
				AlertsSection section =

				CCDFactory.eINSTANCE.createAlertsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalAlertsSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalAlertsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalSocialHistorySection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalSocialHistorySectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				CCDFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalSocialHistorySection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalFamilyHistorySection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalFamilyHistorySectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalFamilyHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_FAMILY_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* FamilyHistorySection */
				FamilyHistorySection section =

				CCDFactory.eINSTANCE.createFamilyHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalFamilyHistorySection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalFamilyHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalReviewOfSystemsSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalReviewOfSystemsSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalReviewOfSystemsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_REVIEW_OF_SYSTEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* ReviewOfSystemsSection */
				ReviewOfSystemsSectionIHE section =

				CDTFactory.eINSTANCE.createReviewOfSystemsSectionIHE().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalReviewOfSystemsSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalReviewOfSystemsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHistoryAndPhysicalPhysicalExaminationSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalPhysicalExaminationSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalPhysicalExaminationSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_PHYSICAL_EXAMINATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* PhysicalExaminationSection */
				PhysicalExaminationSection section =

				CDTFactory.eINSTANCE.createPhysicalExaminationSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalPhysicalExaminationSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalPhysicalExaminationSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHistoryAndPhysicalVitalSignsSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalVitalSignsSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalVitalSignsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* VitalSignsSection */
				VitalSignsSection section =

				CDTFactory.eINSTANCE.createVitalSignsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalVitalSignsSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalVitalSignsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHistoryAndPhysicalGeneralStatusSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalGeneralStatusSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalGeneralStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_GENERAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* GeneralStatusSection */
				GeneralStatusSection section =

				CDTFactory.eINSTANCE.createGeneralStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalGeneralStatusSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalGeneralStatusSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalDiagnosticFindings() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalDiagnosticFindingsTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalDiagnosticFindings",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_DIAGNOSTIC_FINDINGS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();
				DiagnosticFindings df = CDTFactory.eINSTANCE.createDiagnosticFindings().init();
				target.addSection(df);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalDiagnosticFindings(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalDiagnosticFindingsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalProblemSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalProblemSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				CCDFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProblemSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalProceduresSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalProceduresSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				CCDFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalProceduresSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateHistoryAndPhysicalImmunizationsSection() {
		OperationsTestCase<HistoryAndPhysical> validateHistoryAndPhysicalImmunizationsSectionTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateHistoryAndPhysicalImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_HISTORY_AND_PHYSICAL_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				CCDFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateHistoryAndPhysicalImmunizationsSection(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateHistoryAndPhysicalImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetHistoryOfPresentIllness() {

		HistoryAndPhysical target = objectFactory.create();
		target.getHistoryOfPresentIllness();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPastMedicalHistorySection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getPastMedicalHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAlertsSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getAlertsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSocialHistorySection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetFamilyHistorySection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getFamilyHistorySection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReviewOfSystemsSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getReviewOfSystemsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPhysicalExaminationSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getPhysicalExaminationSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetVitalSignsSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getVitalSignsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetGeneralStatusSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getGeneralStatusSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetDiagnosticFindings() {

		HistoryAndPhysical target = objectFactory.create();
		target.getDiagnosticFindings();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProceduresSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetImmunizationsSection() {

		HistoryAndPhysical target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateGeneralHeaderConstraintsTemplateId() {
		OperationsTestCase<HistoryAndPhysical> validateGeneralHeaderConstraintsTemplateIdTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateGeneralHeaderConstraintsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalOperations.validateGeneralHeaderConstraintsTemplateId(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
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
		OperationsTestCase<HistoryAndPhysical> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<HistoryAndPhysical>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysical target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysical target) {
				target.init();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				ce.setCodeSystem("2.16.840.1.113883.6.1");
				ce.setCode("111");
				target.setCode(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(HistoryAndPhysical) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends HistoryAndPhysicalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysical> {

		public HistoryAndPhysical create() {
			return CDTFactory.eINSTANCE.createHistoryAndPhysical();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalOperations {
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

} // HistoryAndPhysicalOperations
