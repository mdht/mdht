/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.SummaryOfCareRecordOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Summary Of Care Record</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordSocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#validateSummaryOfCareRecordFunctionalStatusSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Summary Of Care Record Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveFunctionalStatusSection() <em>Retrieve Functional Status Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrieveHospitalDischargeDiagnosisSection() <em>Retrieve Hospital Discharge Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostoperativeDiagnosisSection() <em>Retrieve Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#retrievePostprocedureDiagnosisSection() <em>Retrieve Postprocedure Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.SummaryOfCareRecord#getFunctionalStatusSection() <em>Get Functional Status Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SummaryOfCareRecordTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordCarePlanning() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordCarePlanningTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordCarePlanning",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SummaryOfCareRecord target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SummaryOfCareRecord target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordCarePlanning(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordCarePlanningTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSummaryOfCareRecordVitalSigns() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordVitalSignsTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordVitalSigns",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SummaryOfCareRecord target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(SummaryOfCareRecord target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordVitalSigns(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordVitalSignsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProblemSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProblemSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProblemSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordAllergiesSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordAllergiesSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordAllergiesSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordImmunizationsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordImmunizationsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordImmunizationsSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordSocialHistorySection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordSocialHistorySectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordSocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordSocialHistorySection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordSocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordResultsSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordResultsSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				Mu2consolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordResultsSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateSummaryOfCareRecordProceduresSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordProceduresSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				Mu2consolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordProceduresSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordProceduresSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateSummaryOfCareRecordFunctionalStatusSection() {
		OperationsTestCase<SummaryOfCareRecord> validateSummaryOfCareRecordFunctionalStatusSectionTestCase = new OperationsTestCase<SummaryOfCareRecord>(
			"validateSummaryOfCareRecordFunctionalStatusSection",
			operationsForOCL.getOCLValue("VALIDATE_SUMMARY_OF_CARE_RECORD_FUNCTIONAL_STATUS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SummaryOfCareRecord target) {

			}

			@Override
			protected void updateToPass(SummaryOfCareRecord target) {
				target.init();

				/* FunctionalStatusSection */
				FunctionalStatusSection section =

				ConsolFactory.eINSTANCE.createFunctionalStatusSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SummaryOfCareRecordOperations.validateSummaryOfCareRecordFunctionalStatusSection(
					(SummaryOfCareRecord) objectToTest, diagnostician, map);
			}

		};

		validateSummaryOfCareRecordFunctionalStatusSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetFunctionalStatusSection() {

		SummaryOfCareRecord target = objectFactory.create();
		target.getFunctionalStatusSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends SummaryOfCareRecordOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SummaryOfCareRecord> {

		public SummaryOfCareRecord create() {
			return Mu2consolFactory.eINSTANCE.createSummaryOfCareRecord();
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
	private static class ConstructorTestClass extends SummaryOfCareRecordOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
	 * @generated
	 */
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	 * 
	 * @generated
	 */

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // SummaryOfCareRecordOperations
