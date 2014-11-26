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
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTAmbulatorySummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Ambulatory Summary</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#validateVDTAmbulatorySummaryProviderNameAndContactInfo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Summary Provider Name And Contact Info</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#validateVDTAmbulatorySummaryMedicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Ambulatory Summary Medications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTAmbulatorySummary#getMedicationsSection() <em>Get Medications Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VDTAmbulatorySummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTAmbulatorySummaryProviderNameAndContactInfo() {
		OperationsTestCase<VDTAmbulatorySummary> validateVDTAmbulatorySummaryProviderNameAndContactInfoTestCase = new OperationsTestCase<VDTAmbulatorySummary>(
			"validateVDTAmbulatorySummaryProviderNameAndContactInfo",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_SUMMARY_PROVIDER_NAME_AND_CONTACT_INFO__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				// empty test
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(VDTAmbulatorySummary target) {

					}
				});

				// test failing snippet (does not include an assignedPerson)
				addFailTest(new FailTest() {
					@Override
					public void updateToFail(VDTAmbulatorySummary target) {
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
					public void updateToPass(VDTAmbulatorySummary target) {
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
					public void updateToPass(VDTAmbulatorySummary target) {
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
					public void updateToPass(VDTAmbulatorySummary target) {
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
					public void updateToPass(VDTAmbulatorySummary target) {
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

				return VDTAmbulatorySummaryOperations.validateVDTAmbulatorySummaryProviderNameAndContactInfo(
					(VDTAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatorySummaryProviderNameAndContactInfoTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTAmbulatorySummaryMedicationsSection() {
		OperationsTestCase<VDTAmbulatorySummary> validateVDTAmbulatorySummaryMedicationsSectionTestCase = new OperationsTestCase<VDTAmbulatorySummary>(
			"validateVDTAmbulatorySummaryMedicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_AMBULATORY_SUMMARY_MEDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTAmbulatorySummary target) {

			}

			@Override
			protected void updateToPass(VDTAmbulatorySummary target) {
				target.init();

				/* MedicationsSection */
				MedicationsSection section =

				ConsolFactory.eINSTANCE.createMedicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTAmbulatorySummaryOperations.validateVDTAmbulatorySummaryMedicationsSection(
					(VDTAmbulatorySummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTAmbulatorySummaryMedicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationsSection() {

		VDTAmbulatorySummary target = objectFactory.create();
		target.getMedicationsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VDTAmbulatorySummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VDTAmbulatorySummary> {

		public VDTAmbulatorySummary create() {
			return Mu2consolFactory.eINSTANCE.createVDTAmbulatorySummary();
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
	private static class ConstructorTestClass extends VDTAmbulatorySummaryOperations {
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

} // VDTAmbulatorySummaryOperations
