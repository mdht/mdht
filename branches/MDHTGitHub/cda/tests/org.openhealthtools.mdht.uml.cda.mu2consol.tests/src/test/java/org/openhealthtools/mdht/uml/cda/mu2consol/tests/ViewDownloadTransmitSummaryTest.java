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
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ViewDownloadTransmitSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>View Download Transmit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#retrievePreoperativeDiagnosisSection() <em>Retrieve Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ViewDownloadTransmitSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateViewDownloadTransmitSummaryCarePlanning() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryCarePlanningTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryCarePlanning",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ViewDownloadTransmitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ViewDownloadTransmitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryCarePlanning(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryCarePlanningTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateViewDownloadTransmitSummaryVitalSigns() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryVitalSignsTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryVitalSigns",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ViewDownloadTransmitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ViewDownloadTransmitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryVitalSigns(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryVitalSignsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryAllergiesSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryAllergiesSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryAllergiesSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryProblemSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryProblemSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProblemSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryProceduresSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryProceduresSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				Mu2consolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryProceduresSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummaryResultsSection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummaryResultsSectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummaryResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				Mu2consolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummaryResultsSection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummaryResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateViewDownloadTransmitSummarySocialHistorySection() {
		OperationsTestCase<ViewDownloadTransmitSummary> validateViewDownloadTransmitSummarySocialHistorySectionTestCase = new OperationsTestCase<ViewDownloadTransmitSummary>(
			"validateViewDownloadTransmitSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ViewDownloadTransmitSummary target) {

			}

			@Override
			protected void updateToPass(ViewDownloadTransmitSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ViewDownloadTransmitSummaryOperations.validateViewDownloadTransmitSummarySocialHistorySection(
					(ViewDownloadTransmitSummary) objectToTest, diagnostician, map);
			}

		};

		validateViewDownloadTransmitSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		ViewDownloadTransmitSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ViewDownloadTransmitSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ViewDownloadTransmitSummary> {

		public ViewDownloadTransmitSummary create() {
			return Mu2consolFactory.eINSTANCE.createViewDownloadTransmitSummary();
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
	private static class ConstructorTestClass extends ViewDownloadTransmitSummaryOperations {
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

} // ViewDownloadTransmitSummaryOperations
