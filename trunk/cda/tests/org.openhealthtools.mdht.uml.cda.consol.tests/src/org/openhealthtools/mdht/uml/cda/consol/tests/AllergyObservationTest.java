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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.consol.AllergyObservation;
import org.openhealthtools.mdht.uml.cda.consol.AllergyStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.GeneralStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.AllergyObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Allergy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValueOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationReactionInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Reaction Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverityInversionIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity Inversion Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyPlayingEntityCodeSystems(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Playing Entity Code Systems</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationProblemEntryReactionObservationContainer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Problem Entry Reaction Observation Container</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Original Text Reference Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Allergy Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Allergy Observation Participant Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#validateAllergyObservationAllergyObservationParticipantParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Allergy Observation Allergy Observation Participant Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getProblemEntryReactionObservationContainers() <em>Get Problem Entry Reaction Observation Containers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getSeverity() <em>Get Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AllergyObservation#getAllergyStatusObservation() <em>Get Allergy Status Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated not
 */

public class AllergyObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationValueOriginalText() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationValueOriginalTextTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationValueOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationValueOriginalText(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationOriginalTextReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				orig.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				value.setOriginalText(orig);

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationOriginalTextReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationOriginalTextReferenceValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.getValues().add(value);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				ED orig = DatatypesFactory.eINSTANCE.createED();
				orig.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				value.setOriginalText(orig);

				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationOriginalTextReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not NOT
	*/
	@Test
	public void testValidateAllergyObservationReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationReferenceValueTestCase = new NarrativeReferenceTestCase<AllergyObservation>(
			"validateAllergyObservationReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				target.setCode(createCDWithOriginalTextReference("Some sample text", "#1.2.3.4"));

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyStatusInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyStatusInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyStatusInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createAllergyStatusObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyStatusInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyStatusInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not NOT
	*/
	@Test
	public void testValidateAllergyObservationReactionInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationReactionInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationReactionInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_REACTION_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createReactionObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationReactionInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationReactionInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not NOT
	*/
	@Test
	public void testValidateAllergyObservationSeverityInversionIndicator() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationSeverityInversionIndicatorTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationSeverityInversionIndicator",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_SEVERITY_INVERSION_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				skipNullTest();
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(AllergyObservation target) {
						// Test case with only entry Relationship
						// Should pass
						target.getEntryRelationships().clear();
						target.init();
						EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
						target.getEntryRelationships().add(er);
					}

				});
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setObservation(ConsolFactory.eINSTANCE.createSeverityObservation().init());
				er.setInversionInd(true);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationSeverityInversionIndicator(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationSeverityInversionIndicatorTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAllergyObservationAllergyPlayingEntityCodeSystems() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyPlayingEntityCodeSystemsTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyPlayingEntityCodeSystems",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_PLAYING_ENTITY_CODE_SYSTEMS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("419511003", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE();
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("123456", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE();
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("12345", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.88");
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addFailTest(new FailTest() {
					@Override
					public void updateToFail(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("419511003", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.4.9");
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

			}

			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("419511003", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.6.88");
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.init();
						target.getValues().add(DatatypesFactory.eINSTANCE.createCD("419511003", "1.2.3.4", "", ""));

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.3.26.1.5");
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});

				addPassTest(new PassTest() {
					@Override
					public void updateToPass(AllergyObservation target) {
						target.init();
						CD val = DatatypesFactory.eINSTANCE.createCD();
						val.setNullFlavor(NullFlavor.NA);
						target.getValues().add(val);

						Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
						ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
						PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

						CE code = DatatypesFactory.eINSTANCE.createCE("test", "2.16.840.1.113883.4.9");
						pe.setCode(code);
						pr.setPlayingEntity(pe);
						par.setParticipantRole(pr);
						target.getParticipants().add(par);
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyPlayingEntityCodeSystems(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyPlayingEntityCodeSystemsTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationTemplateId() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationTemplateIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationTemplateId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationMoodCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationMoodCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationMoodCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationId() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationIdTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationId(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAllergyObservationCodeP() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodePTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCodeP(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("ASSERTION");
				cd.setCodeSystem("2.16.840.1.113883.5.4");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationStatusCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationStatusCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationStatusCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationEffectiveTime() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationEffectiveTimeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationEffectiveTime(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.6.96");
				value.setCode("420134006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationProblemEntryReactionObservationContainer() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationProblemEntryReactionObservationContainerTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationProblemEntryReactionObservationContainer",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				ReactionObservation observation = ConsolFactory.eINSTANCE.createReactionObservation().init();
				target.addObservation(observation);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationProblemEntryReactionObservationContainerTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated NOT
	// */
	// @Test
	// public void testValidateAllergyObservationProblemEntryReactionObservationContainer() {
	// OperationsTestCase<AllergyObservation> validateAllergyObservationProblemEntryReactionObservationContainerTestCase = new
	// OperationsTestCase<AllergyObservation>(
	// "validateAllergyObservationProblemEntryReactionObservationContainer",
	// operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AllergyObservation target) {
	//
	// }
	//
	// @Override
	// protected void updateToPass(AllergyObservation target) {
	// target.init();
	// ReactionObservation observation = ConsolFactory.eINSTANCE.createReactionObservation().init();
	// target.addObservation(observation);
	// for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
	// er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
	// }
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AllergyObservationOperations.validateAllergyObservationProblemEntryReactionObservationContainer(
	// (AllergyObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAllergyObservationProblemEntryReactionObservationContainerTestCase.doValidationTest();
	// }

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationSeverity() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationSeverityTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationSeverity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();
				SeverityObservation observation = ConsolFactory.eINSTANCE.createSeverityObservation().init();
				target.addObservation(observation);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationSeverity(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationSeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAllergyObservationAllergyStatusObservation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyStatusObservationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.init();

				AllergyStatusObservation observation = ConsolFactory.eINSTANCE.createAllergyStatusObservation().init();
				target.addObservation(observation);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyStatusObservation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyStatusObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationParticipant() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationParticipantTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().add(CDAFactory.eINSTANCE.createParticipant2());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationParticipant(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalTextTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalText(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL());
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReference(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValueTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL());
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				ot.setReference(DatatypesFactory.eINSTANCE.createTEL("test"));
				code.setOriginalText(ot);
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValueTestCase = new NarrativeReferenceTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_ORIGINAL_TEXT_REFERENCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				pe.setCode(createCEWithOriginalTextReference("Some sample text", "#1.2.3.4"));
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class), "",
					"No particular health status observed.");
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				// add the observation to a section, as required by the constraint, that has text that we can reference
				addText(
					createSectionForClinicalStatement(target, ConsolPackage.eINSTANCE, GeneralStatusSection.class),
					"1.2.3.4", "No particular health status observed.");

				// add a reference to the section text
				target.setText(createEDWithReference("Some sample text", "#1.2.3.4"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValue(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityOriginalTextReferenceValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslationTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());

				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslation(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				CE code = DatatypesFactory.eINSTANCE.createCE();
				pe.setCode(code);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pe.setClassCode(EntityClassRoot.MMAT);
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_ALLERGY_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pe.setCode(DatatypesFactory.eINSTANCE.createCE());
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleAllergyObservationPlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);

				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntityTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_ALLERGY_OBSERVATION_PARTICIPANT_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();

				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntity(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

		};

		validateAllergyObservationAllergyObservationParticipantAllergyObservationParticipantRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantTypeCode() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantTypeCodeTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantTypeCode(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();

				target.getParticipants().add(par);
			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CSM);
				target.getParticipants().add(par);

			}

		};

		validateAllergyObservationAllergyObservationParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAllergyObservationAllergyObservationParticipantParticipantRole() {
		OperationsTestCase<AllergyObservation> validateAllergyObservationAllergyObservationParticipantParticipantRoleTestCase = new OperationsTestCase<AllergyObservation>(
			"validateAllergyObservationAllergyObservationParticipantParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_OBSERVATION_ALLERGY_OBSERVATION_PARTICIPANT_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AllergyObservationOperations.validateAllergyObservationAllergyObservationParticipantParticipantRole(
					(AllergyObservation) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(AllergyObservation target) {
				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();

				target.getParticipants().add(par);

			}

			@Override
			protected void updateToPass(AllergyObservation target) {
				target.getParticipants().clear();

				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);
			}

		};

		validateAllergyObservationAllergyObservationParticipantParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemEntryReactionObservationContainers() {

		AllergyObservation target = objectFactory.create();
		target.getProblemEntryReactionObservationContainers();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverity() {

		AllergyObservation target = objectFactory.create();
		target.getSeverity();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAllergyStatusObservation() {

		AllergyObservation target = objectFactory.create();
		target.getAllergyStatusObservation();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AllergyObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AllergyObservation> {
		public AllergyObservation create() {
			return ConsolFactory.eINSTANCE.createAllergyObservation();
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
	private static class ConstructorTestClass extends AllergyObservationOperations {
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

} // AllergyObservationOperations
