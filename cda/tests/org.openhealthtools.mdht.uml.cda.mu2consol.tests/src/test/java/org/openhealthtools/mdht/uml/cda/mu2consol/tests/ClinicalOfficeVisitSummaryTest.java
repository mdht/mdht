/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *    Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.MedicationsAdministeredSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ClinicalOfficeVisitSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Clinical Office Visit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryReasonforVisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Reasonfor Visit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryDateOfvisit(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Date Ofvisit</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVisitLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Visit Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Provider Name And Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Medications Administered Section Or Medications Section ER</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryImmunizationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummaryInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#validateClinicalOfficeVisitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Clinical Office Visit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveInstructionsSection() <em>Retrieve Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#retrieveMedicationsAdministeredSection() <em>Retrieve Medications Administered Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getImmunizationsSection() <em>Get Immunizations Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getInstructionsSection() <em>Get Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ClinicalOfficeVisitSummary#getMedicationsAdministeredSection() <em>Get Medications Administered Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ClinicalOfficeVisitSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryReasonforVisit() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryReasonforVisitTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryReasonforVisit",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_REASONFOR_VISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryReasonforVisit(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryReasonforVisitTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryCarePlanning() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryCarePlanningTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryCarePlanning",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryCarePlanning(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryCarePlanningTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryDateOfvisit() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryDateOfvisitTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryDateOfvisit",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_DATE_OFVISIT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

						ee.setEffectiveTime(ef);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

						se.setEffectiveTime(ef);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryDateOfvisit(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryDateOfvisitTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryVisitLocation() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryVisitLocationTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryVisitLocation",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VISIT_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						Location loc = CDAFactory.eINSTANCE.createLocation();

						ee.setLocation(loc);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVisitLocation(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryVisitLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryProviderNameAndContactInfo() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryProviderNameAndContactInfoTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryProviderNameAndContactInfo",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// empty test
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ClinicalOfficeVisitSummary target) {

					}
				});

				// test failing snippet (does not include an assignedPerson)
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(ClinicalOfficeVisitSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}
				});
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						perf.setAssignedEntity(ae);
						se.getPerformers().add(perf);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						ResponsibleParty rp = CDAFactory.eINSTANCE.createResponsibleParty();

						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						rp.setAssignedEntity(ae);
						ee.setResponsibleParty(rp);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						EncounterParticipant ep = CDAFactory.eINSTANCE.createEncounterParticipant();

						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();

						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						ep.setAssignedEntity(ae);
						ee.getEncounterParticipants().add(ep);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				// test "at least" scenario for clause one with a snippet with multiple performers
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

						Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
						Person ap = CDAFactory.eINSTANCE.createPerson();
						ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae.setAssignedPerson(ap);
						perf.setAssignedEntity(ae);

						Performer1 perf2 = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae2 = CDAFactory.eINSTANCE.createAssignedEntity();
						Person ap2 = CDAFactory.eINSTANCE.createPerson();
						ap2.getNames().add(DatatypesFactory.eINSTANCE.createPN());
						ae2.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae2.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						ae2.setAssignedPerson(ap2);
						perf2.setAssignedEntity(ae2);

						// 3rd performer has no assignedPerson element, only one performer needs to have it
						Performer1 perf3 = CDAFactory.eINSTANCE.createPerformer1();
						AssignedEntity ae3 = CDAFactory.eINSTANCE.createAssignedEntity();
						ae3.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
						ae3.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
						perf3.setAssignedEntity(ae3);

						se.getPerformers().add(perf);
						se.getPerformers().add(perf2);
						se.getPerformers().add(perf3);

						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProviderNameAndContactInfo(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryProviderNameAndContactInfoTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryVitalSigns() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryVitalSignsTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryVitalSigns",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createVitalSignsSectionEntriesOptional().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryVitalSigns(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryVitalSignsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionERTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_MEDICATIONS_ADMINISTERED_SECTION_OR_MEDICATIONS_SECTION_ER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// empty test
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ClinicalOfficeVisitSummary target) {
					}
				});

				// Contains neither a Medications Section with entries required (TemplateID = 2.16.840.1.113883.10.20.22.2.1.1)
				// nor a Medications Administered Section (Template ID = 2.16.840.1.113883.10.20.22.2.38)
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(ClinicalOfficeVisitSummary target) {
						target.init();
					}
				});
			}

			@Override
			public void addPassTests() {

				// Contains both a Medications Section with entries required (TemplateID = 2.16.840.1.113883.10.20.22.2.1.1)
				// and a Medications Administered Section (Template ID = 2.16.840.1.113883.10.20.22.2.38)
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						MedicationsSection medSecER = ConsolFactory.eINSTANCE.createMedicationsSection().init();
						MedicationsAdministeredSection medAdminSection = Mu2consolFactory.eINSTANCE.createMedicationsAdministeredSection().init();
						target.addSection(medSecER);
						target.addSection(medAdminSection);
					}
				});

				// Medications Section with entries required only
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						MedicationsSection medSecER = ConsolFactory.eINSTANCE.createMedicationsSection().init();
						target.addSection(medSecER);
					}
				});

				// Medications Administered Section Only
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(ClinicalOfficeVisitSummary target) {
						target.init();
						MedicationsAdministeredSection medAdminSection = Mu2consolFactory.eINSTANCE.createMedicationsAdministeredSection().init();
						target.addSection(medAdminSection);
					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionER(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryMedicationsAdministeredSectionOrMedicationsSectionERTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummarySocialHistorySection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummarySocialHistorySectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummarySocialHistorySection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* SocialHistorySection */
				SocialHistorySection section =

				Mu2consolFactory.eINSTANCE.createSocialHistorySection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummarySocialHistorySection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummarySocialHistorySectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryProblemSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryProblemSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryProblemSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ProblemSection */
				ProblemSection section =

				ConsolFactory.eINSTANCE.createProblemSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProblemSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryProblemSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryAllergiesSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryAllergiesSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryAllergiesSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* AllergiesSection */
				AllergiesSection section =

				ConsolFactory.eINSTANCE.createAllergiesSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryAllergiesSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryAllergiesSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryResultsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryResultsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryResultsSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ResultsSection */
				ResultsSection section =

				Mu2consolFactory.eINSTANCE.createResultsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryResultsSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryResultsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryProceduresSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryProceduresSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryProceduresSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ProceduresSection */
				ProceduresSection section =

				Mu2consolFactory.eINSTANCE.createProceduresSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryProceduresSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryProceduresSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryImmunizationsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryImmunizationsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryImmunizationsSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_IMMUNIZATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* ImmunizationsSection */
				ImmunizationsSection section =

				ConsolFactory.eINSTANCE.createImmunizationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryImmunizationsSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryImmunizationsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateClinicalOfficeVisitSummaryInstructionsSection() {
		OperationsTestCase<ClinicalOfficeVisitSummary> validateClinicalOfficeVisitSummaryInstructionsSectionTestCase = new OperationsTestCase<ClinicalOfficeVisitSummary>(
			"validateClinicalOfficeVisitSummaryInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_CLINICAL_OFFICE_VISIT_SUMMARY_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ClinicalOfficeVisitSummary target) {

			}

			@Override
			protected void updateToPass(ClinicalOfficeVisitSummary target) {
				target.init();

				/* InstructionsSection */
				InstructionsSection section =

				ConsolFactory.eINSTANCE.createInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ClinicalOfficeVisitSummaryOperations.validateClinicalOfficeVisitSummaryInstructionsSection(
					(ClinicalOfficeVisitSummary) objectToTest, diagnostician, map);
			}

		};

		validateClinicalOfficeVisitSummaryInstructionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetSocialHistorySection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getSocialHistorySection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProblemSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getProblemSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetAllergiesSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getAllergiesSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetResultsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getResultsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetProceduresSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getProceduresSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetImmunizationsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getImmunizationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMedicationsAdministeredSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getMedicationsAdministeredSection();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetInstructionsSection() {

		ClinicalOfficeVisitSummary target = objectFactory.create();
		target.getInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ClinicalOfficeVisitSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ClinicalOfficeVisitSummary> {

		public ClinicalOfficeVisitSummary create() {
			return Mu2consolFactory.eINSTANCE.createClinicalOfficeVisitSummary();
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
	private static class ConstructorTestClass extends ClinicalOfficeVisitSummaryOperations {
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

} // ClinicalOfficeVisitSummaryOperations
