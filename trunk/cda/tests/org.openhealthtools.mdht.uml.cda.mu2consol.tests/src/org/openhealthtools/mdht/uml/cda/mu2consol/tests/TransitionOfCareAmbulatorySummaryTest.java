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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.TransitionOfCareAmbulatorySummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Transition Of Care Ambulatory Summary</b></em>' model
 * objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Provider Name And Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryReasonForReferral(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Reason For Referral</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#validateTransitionOfCareAmbulatorySummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transition Of Care Ambulatory Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.TransitionOfCareAmbulatorySummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransitionOfCareAmbulatorySummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfoTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
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

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfo(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryProviderNameAndContactInfoTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryReasonForReferral() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryReasonForReferralTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryReasonForReferral",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_REASON_FOR_REFERRAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPlanOfCareSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForReferralSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(TransitionOfCareAmbulatorySummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createAssessmentAndPlanSection().init());
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryReasonForReferral(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryReasonForReferralTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTransitionOfCareAmbulatorySummaryMedicationsSection() {
		OperationsTestCase<TransitionOfCareAmbulatorySummary> validateTransitionOfCareAmbulatorySummaryMedicationsSectionTestCase = new OperationsTestCase<TransitionOfCareAmbulatorySummary>(
			"validateTransitionOfCareAmbulatorySummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_TRANSITION_OF_CARE_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransitionOfCareAmbulatorySummary target) {

			}

			@Override
			protected void updateToPass(TransitionOfCareAmbulatorySummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransitionOfCareAmbulatorySummaryOperations.validateTransitionOfCareAmbulatorySummaryMedicationsSection(
					(TransitionOfCareAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateTransitionOfCareAmbulatorySummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		TransitionOfCareAmbulatorySummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends TransitionOfCareAmbulatorySummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransitionOfCareAmbulatorySummary> {

		public TransitionOfCareAmbulatorySummary create() {
			return Mu2consolFactory.eINSTANCE.createTransitionOfCareAmbulatorySummary();
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
	private static class ConstructorTestClass extends TransitionOfCareAmbulatorySummaryOperations {
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

} // TransitionOfCareAmbulatorySummaryOperations
