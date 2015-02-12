/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *     Dan Brown (Audacious Inquiry) - additional testing code
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.DocumentationOf;
import org.openhealthtools.mdht.uml.cda.Performer1;
import org.openhealthtools.mdht.uml.cda.ServiceEvent;
import org.openhealthtools.mdht.uml.cda.consol.AnesthesiaSection;
import org.openhealthtools.mdht.uml.cda.consol.ComplicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNote;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteFluidSection;
import org.openhealthtools.mdht.uml.cda.consol.OperativeNoteSurgicalProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.consol.PlannedProcedureSection;
import org.openhealthtools.mdht.uml.cda.consol.PostoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDescriptionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureDispositionSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureEstimatedBloodLossSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureFindingsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureImplantsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureIndicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureSpecimensTakenSection;
import org.openhealthtools.mdht.uml.cda.consol.SurgicalDrainsSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.OperativeNoteOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ServiceEventPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Operative Note</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOf(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteAnesthesiaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteComplicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePostoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePreoperativeDiagnosisSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureEstimatedBloodLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureFindingsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureSpecimensTakenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureDescriptionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureImplantsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteFluidSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteSurgicalProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNotePlannedProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureDispositionSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteProcedureIndicationsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteSurgicalDrainsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventProcedureCodes(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Procedure Codes</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time Has High When No Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time No High If Width</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Minute</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Precise To The Second</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event If More Precise Than Day Include Time Zone Offset</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event Primary Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateOperativeNoteDocumentationOfServiceEvent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Operative Note Documentation Of Service Event</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getAnesthesiaSection() <em>Get Anesthesia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getComplicationsSection() <em>Get Complications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPostoperativeDiagnosisSection() <em>Get Postoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPreoperativeDiagnosisSection() <em>Get Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureEstimatedBloodLossSection() <em>Get Procedure Estimated Blood Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureFindingsSection() <em>Get Procedure Findings Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureSpecimensTakenSection() <em>Get Procedure Specimens Taken Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureDescriptionSection() <em>Get Procedure Description Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureImplantsSection() <em>Get Procedure Implants Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getOperativeNoteFluidSection() <em>Get Operative Note Fluid Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getOperativeNoteSurgicalProcedureSection() <em>Get Operative Note Surgical Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPlanOfCareSection() <em>Get Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getPlannedProcedureSection() <em>Get Planned Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureDispositionSection() <em>Get Procedure Disposition Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getProcedureIndicationsSection() <em>Get Procedure Indications Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#getSurgicalDrainsSection() <em>Get Surgical Drains Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.OperativeNote#validateGeneralHeaderConstraintsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OperativeNoteTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOperativeNoteTemplateId() {
		OperationsTestCase<OperativeNote> validateOperativeNoteTemplateIdTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteTemplateId(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCodeP() {
		OperationsTestCase<OperativeNote> validateGeneralHeaderConstraintsCodePTestCase = new OperationsTestCase<OperativeNote>(
			"validateGeneralHeaderConstraintsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateGeneralHeaderConstraintsCodeP(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOf() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOf",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
			}

			@Override
			protected void updateToPass(OperativeNote target) {

				target.getDocumentationOfs().add(CDAFactory.eINSTANCE.createDocumentationOf());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOf(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteAnesthesiaSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteAnesthesiaSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteAnesthesiaSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_ANESTHESIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* AnesthesiaSection */
				AnesthesiaSection section =

				ConsolFactory.eINSTANCE.createAnesthesiaSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteAnesthesiaSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteAnesthesiaSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteComplicationsSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteComplicationsSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteComplicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_COMPLICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ComplicationsSection */
				ComplicationsSection section =

				ConsolFactory.eINSTANCE.createComplicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteComplicationsSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteComplicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNotePostoperativeDiagnosisSection() {
		OperationsTestCase<OperativeNote> validateOperativeNotePostoperativeDiagnosisSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNotePostoperativeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_POSTOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* PostoperativeDiagnosisSection */
				PostoperativeDiagnosisSection section =

				ConsolFactory.eINSTANCE.createPostoperativeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNotePostoperativeDiagnosisSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNotePostoperativeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNotePreoperativeDiagnosisSection() {
		OperationsTestCase<OperativeNote> validateOperativeNotePreoperativeDiagnosisSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNotePreoperativeDiagnosisSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PREOPERATIVE_DIAGNOSIS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* PreoperativeDiagnosisSection */
				PreoperativeDiagnosisSection section =

				ConsolFactory.eINSTANCE.createPreoperativeDiagnosisSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNotePreoperativeDiagnosisSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNotePreoperativeDiagnosisSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureEstimatedBloodLossSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureEstimatedBloodLossSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureEstimatedBloodLossSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_ESTIMATED_BLOOD_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureEstimatedBloodLossSection */
				ProcedureEstimatedBloodLossSection section =

				ConsolFactory.eINSTANCE.createProcedureEstimatedBloodLossSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureEstimatedBloodLossSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureEstimatedBloodLossSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureFindingsSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureFindingsSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureFindingsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_FINDINGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureFindingsSection */
				ProcedureFindingsSection section =

				ConsolFactory.eINSTANCE.createProcedureFindingsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureFindingsSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureFindingsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureSpecimensTakenSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureSpecimensTakenSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureSpecimensTakenSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_SPECIMENS_TAKEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureSpecimensTakenSection */
				ProcedureSpecimensTakenSection section =

				ConsolFactory.eINSTANCE.createProcedureSpecimensTakenSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureSpecimensTakenSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureSpecimensTakenSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureDescriptionSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureDescriptionSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureDescriptionSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_DESCRIPTION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureDescriptionSection */
				ProcedureDescriptionSection section =

				ConsolFactory.eINSTANCE.createProcedureDescriptionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureDescriptionSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureDescriptionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureImplantsSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureImplantsSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureImplantsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_IMPLANTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureImplantsSection */
				ProcedureImplantsSection section =

				ConsolFactory.eINSTANCE.createProcedureImplantsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureImplantsSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureImplantsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteFluidSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteFluidSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteFluidSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_FLUID_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();
				//
				// /* FluidSection */
				OperativeNoteFluidSection section =

				ConsolFactory.eINSTANCE.createOperativeNoteFluidSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteFluidSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteFluidSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteSurgicalProcedureSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteSurgicalProcedureSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteSurgicalProcedureSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* SurgicalProcedureSection */
				OperativeNoteSurgicalProcedureSection section =

				ConsolFactory.eINSTANCE.createOperativeNoteSurgicalProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteSurgicalProcedureSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalProcedureSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNotePlanOfCareSection() {
		OperationsTestCase<OperativeNote> validateOperativeNotePlanOfCareSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNotePlanOfCareSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* PlanOfCareSection */
				PlanOfCareSection section =

				ConsolFactory.eINSTANCE.createPlanOfCareSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNotePlanOfCareSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNotePlanOfCareSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNotePlannedProcedureSection() {
		OperationsTestCase<OperativeNote> validateOperativeNotePlannedProcedureSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNotePlannedProcedureSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PLANNED_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* PlannedProcedureSection */
				PlannedProcedureSection section =

				ConsolFactory.eINSTANCE.createPlannedProcedureSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNotePlannedProcedureSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNotePlannedProcedureSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureDispositionSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureDispositionSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureDispositionSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_DISPOSITION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureDispositionSection */
				ProcedureDispositionSection section =

				ConsolFactory.eINSTANCE.createProcedureDispositionSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureDispositionSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureDispositionSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteProcedureIndicationsSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteProcedureIndicationsSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteProcedureIndicationsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_PROCEDURE_INDICATIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* ProcedureIndicationsSection */
				ProcedureIndicationsSection section =

				ConsolFactory.eINSTANCE.createProcedureIndicationsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteProcedureIndicationsSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteProcedureIndicationsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteSurgicalDrainsSection() {
		OperationsTestCase<OperativeNote> validateOperativeNoteSurgicalDrainsSectionTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteSurgicalDrainsSection",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_SURGICAL_DRAINS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();

				/* SurgicalDrainsSection */
				SurgicalDrainsSection section =

				ConsolFactory.eINSTANCE.createSurgicalDrainsSection().init();

				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteSurgicalDrainsSection(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteSurgicalDrainsSectionTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodePTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.101"));
				perf.setAssignedEntity(ae);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodeP(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();

				perf.setTypeCode(x_ServiceEventPerformer.SPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				perf.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntity(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventProcedureCodes() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventProcedureCodesTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventProcedureCodes",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PROCEDURE_CODES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			// 2.16.840.1.113883.6.104' or code.codeSystem = '2.16.840.1.113883.6.12' or code.codeSystem = '2.16.840.1.113883.6.96'

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "NOT2.16.840.1.113883.6.104"));
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.104"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.12"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(OperativeNote target) {
						target.getDocumentationOfs().clear();
						DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
						ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
						se.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.96"));
						dof.setServiceEvent(se);
						target.getDocumentationOfs().add(dof);

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventProcedureCodes(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventProcedureCodesTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLowTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();

				low.setValue("12345");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLow(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_HAS_HIGH_WHEN_NO_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidth(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeHasHighWhenNoWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME_NO_HIGH_IF_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setHigh(DatatypesFactory.eINSTANCE.createIVXB_TS());
				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

				ts.setWidth(DatatypesFactory.eINSTANCE.createPQ());
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidth(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeNoHighIfWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheDay() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheDayTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS("200912", "2013");
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_DAY);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheDay(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheDayTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinuteTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_MINUTE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				low.setValue("2009121217");
				ts.setLow(low);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MINUTE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinute(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheMinuteTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecondTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRECISE_TO_THE_SECOND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				high.setValue(PRECISE_TO_MINUTE);
				ts.setHigh(high);
				se.setEffectiveTime(ts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_SECOND);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecond(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPreciseToTheSecondTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_IF_MORE_PRECISE_THAN_DAY_INCLUDE_TIME_ZONE_OFFSET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				IVL_TS ivlts = DatatypesFactory.eINSTANCE.createIVL_TS(PRECISE_TO_MINUTE, PRECISE_TO_SECOND);
				se.setEffectiveTime(ivlts);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getLow().setValue(
					PRECISE_TO_MS_WITH_TIMEZONE);
				target.getDocumentationOfs().get(0).getServiceEvent().getEffectiveTime().getHigh().setValue(
					PRECISE_TO_MINUTE_WITH_TIMEZONE);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffset(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventIfMorePreciseThanDayIncludeTimeZoneOffsetTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventCode() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventCode",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				se.setCode(ce);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventEffectiveTime() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventEffectiveTimeTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);
				se.setEffectiveTime(ts);

				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventEffectiveTime(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEventPrimaryPerformer() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT_PRIMARY_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				Performer1 perf = CDAFactory.eINSTANCE.createPerformer1();
				perf.setTypeCode(x_ServiceEventPerformer.PPRF);
				se.getPerformers().add(perf);
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEventPrimaryPerformer(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventPrimaryPerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateOperativeNoteDocumentationOfServiceEvent() {
		OperationsTestCase<OperativeNote> validateOperativeNoteDocumentationOfServiceEventTestCase = new OperationsTestCase<OperativeNote>(
			"validateOperativeNoteDocumentationOfServiceEvent",
			operationsForOCL.getOCLValue("VALIDATE_OPERATIVE_NOTE_DOCUMENTATION_OF_SERVICE_EVENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {
				target.init();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();

				target.getDocumentationOfs().add(dof);

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.getDocumentationOfs().clear();
				DocumentationOf dof = CDAFactory.eINSTANCE.createDocumentationOf();
				ServiceEvent se = CDAFactory.eINSTANCE.createServiceEvent();
				dof.setServiceEvent(se);
				target.getDocumentationOfs().add(dof);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OperativeNoteOperations.validateOperativeNoteDocumentationOfServiceEvent(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateOperativeNoteDocumentationOfServiceEventTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAnesthesiaSection() {

		OperativeNote target = objectFactory.create();
		target.getAnesthesiaSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetComplicationsSection() {

		OperativeNote target = objectFactory.create();
		target.getComplicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPostoperativeDiagnosisSection() {

		OperativeNote target = objectFactory.create();
		target.getPostoperativeDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPreoperativeDiagnosisSection() {

		OperativeNote target = objectFactory.create();
		target.getPreoperativeDiagnosisSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEstimatedBloodLossSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureEstimatedBloodLossSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureFindingsSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureFindingsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureSpecimensTakenSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureSpecimensTakenSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDescriptionSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureDescriptionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureImplantsSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureImplantsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOperativeNoteFluidSection() {

		OperativeNote target = objectFactory.create();
		target.getOperativeNoteFluidSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetOperativeNoteSurgicalProcedureSection() {

		OperativeNote target = objectFactory.create();
		target.getOperativeNoteSurgicalProcedureSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlanOfCareSection() {

		OperativeNote target = objectFactory.create();
		target.getPlanOfCareSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPlannedProcedureSection() {

		OperativeNote target = objectFactory.create();
		target.getPlannedProcedureSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureDispositionSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureDispositionSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureIndicationsSection() {

		OperativeNote target = objectFactory.create();
		target.getProcedureIndicationsSection();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSurgicalDrainsSection() {

		OperativeNote target = objectFactory.create();
		target.getSurgicalDrainsSection();

	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateGeneralHeaderConstraintsCode() {
		OperationsTestCase<OperativeNote> validateGeneralHeaderConstraintsCodeTestCase = new OperationsTestCase<OperativeNote>(
			"validateGeneralHeaderConstraintsCode",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OperativeNote target) {

			}

			@Override
			protected void updateToPass(OperativeNote target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("code", "2.16.840.1.113883.6.1"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GeneralHeaderConstraintsOperations.validateGeneralHeaderConstraintsCode(
					(OperativeNote) objectToTest, diagnostician, map);
			}

		};

		validateGeneralHeaderConstraintsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OperativeNoteOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OperativeNote> {
		public OperativeNote create() {
			return ConsolFactory.eINSTANCE.createOperativeNote();
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
	private static class ConstructorTestClass extends OperativeNoteOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
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

} // OperativeNoteOperations
