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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Component1;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.Location;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.VDTInpatientSummaryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Inpatient Summary</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryAdmissionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryDischargeDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Discharge Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryAdmissionDischargeLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Discharge Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryReasonforHospitalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Reasonfor Hospitalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VDTInpatientSummaryTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTInpatientSummaryAdmissionDate() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryAdmissionDateTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryAdmissionDate",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
						ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						ee.setEffectiveTime(ef);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
						ef.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
						se.setEffectiveTime(ef);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryAdmissionDate(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryAdmissionDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTInpatientSummaryDischargeDate() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryDischargeDateTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryDischargeDate",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						Component1 comp = CDAFactory.eINSTANCE.createComponent1();
						EncompassingEncounter ee = CDAFactory.eINSTANCE.createEncompassingEncounter();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
						ef.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						ee.setEffectiveTime(ef);
						comp.setEncompassingEncounter(ee);
						target.setComponentOf(comp);
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						DocumentationOf doc = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
						ef.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
						se.setEffectiveTime(ef);
						doc.setServiceEvent(se);
						target.getDocumentationOfs().add(doc);
					}

				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryDischargeDate(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryDischargeDateTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTInpatientSummaryAdmissionDischargeLocation() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryAdmissionDischargeLocationTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryAdmissionDischargeLocation",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
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

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryAdmissionDischargeLocation(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryAdmissionDischargeLocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTInpatientSummaryMedications() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryMedicationsTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createMedicationsSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createHospitalDischargeMedicationsSection().init());
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryMedications(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryMedicationsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateVDTInpatientSummaryReasonforHospitalization() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryReasonforHospitalizationTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryReasonforHospitalization",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createReasonForVisitSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createChiefComplaintAndReasonForVisitSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createEncountersSectionEntriesOptional().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createHospitalAdmissionDiagnosisSection().init());
					}

				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(VDTInpatientSummary target) {
						target.init();
						target.addSection(ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection().init());
					}

				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryReasonforHospitalization(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryReasonforHospitalizationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateVDTInpatientSummaryHospitalDischargeInstructionsSection() {
		OperationsTestCase<VDTInpatientSummary> validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase = new OperationsTestCase<VDTInpatientSummary>(
			"validateVDTInpatientSummaryHospitalDischargeInstructionsSection",
			operationsForOCL.getOCLValue("VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VDTInpatientSummary target) {

			}

			@Override
			protected void updateToPass(VDTInpatientSummary target) {
				target.init();

				/* HospitalDischargeInstructionsSection */
				HospitalDischargeInstructionsSection section =

				ConsolFactory.eINSTANCE.createHospitalDischargeInstructionsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VDTInpatientSummaryOperations.validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
					(VDTInpatientSummary) objectToTest, diagnostician, map);
			}

		};

		validateVDTInpatientSummaryHospitalDischargeInstructionsSectionTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetHospitalDischargeInstructionsSection() {

		VDTInpatientSummary target = objectFactory.create();
		target.getHospitalDischargeInstructionsSection();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends VDTInpatientSummaryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VDTInpatientSummary> {

		public VDTInpatientSummary create() {
			return Mu2consolFactory.eINSTANCE.createVDTInpatientSummary();
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
	private static class ConstructorTestClass extends VDTInpatientSummaryOperations {
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

} // VDTInpatientSummaryOperations
