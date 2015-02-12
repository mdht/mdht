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
import org.openhealthtools.mdht.uml.cda.ExternalDocument;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Reference;
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipExternalReference;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationVerifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Custodian Entity Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Custodian Role Playing Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text Media Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceExternalDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceExternalDocumentText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationReferenceExternalDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Reference External Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationHasStartingTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationHasStartingTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationHasStartingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationHasStartingTime(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationHasStartingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationHasEndingTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationHasEndingTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationHasEndingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("low", "high"));

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationHasEndingTime(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationHasEndingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationTemplateId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationClassCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationClassCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationMoodCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationMoodCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationMoodCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCodeP() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCodePTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCodeP(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("304251008", "2.16.840.1.113883.6.96", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationStatusCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationStatusCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationStatusCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationEffectiveTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationEffectiveTime(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifier() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationVerifierTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationVerifier",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifier(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodian() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodian",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodian(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReference() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReference(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationVerifierTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationVerifierTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTime(DatatypesFactory.eINSTANCE.createIVL_TS());

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierTime(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationVerifierTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationVerifierTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				// target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				// p2.setTypeCode(ParticipationType.ADM);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierTypeCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierParticipantRole() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationVerifierParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.VRF);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationVerifierParticipantRole(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CUSTODIAN_ENTITY_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				pr.setClassCode(RoleClassRoot.ROL);

				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				pr.setPlayingEntity(pe);

				pr.setClassCode(RoleClassRoot.ROL);

				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityName(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleCustodianEntityNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleAddr() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				pr.setClassCode(RoleClassRoot.ROL);

				// pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				pr.setClassCode(RoleClassRoot.ROL);

				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleAddr(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleClassCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianCustodianRoleClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				// pr.setClassCode(RoleClassRoot.ROL);

				// pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();

				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				pr.setClassCode(RoleClassRoot.AGNT);

				// pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleClassCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRoleTelecom() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				pr.setClassCode(RoleClassRoot.ROL);

				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				p2.setParticipantRole(pr);

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRoleTelecom(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_CUSTODIAN_ROLE_PLAYING_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setPlayingEntity(CDAFactory.eINSTANCE.createPlayingEntity());

				p2.setParticipantRole(pr);
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntity(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianCustodianRolePlayingEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			{
				this.skipFailsTest();
			}

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				// p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianTypeCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianRole() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationCustodianRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getParticipants().clear();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();

				p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
				p2.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianRole(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType(null);
				ed.setText(text);

				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().clear();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setMediaType("JPEG");
				ed.setText(text);
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase.doValidationTest();
	}

	// /**
	// *
	// * @generated not
	// */
	// @Test
	// public void testValidateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole() {
	// OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase =
	// new OperationsTestCase<AdvanceDirectiveObservation>(
	// "validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole",
	// operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AdvanceDirectiveObservation target) {
	// target.init();
	// Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
	//
	// p2.setTypeCode(ParticipationType.CST);
	// target.getParticipants().add(p2);
	//
	// }
	//
	// @Override
	// protected void updateToPass(AdvanceDirectiveObservation target) {
	// target.getParticipants().clear();
	// Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
	//
	// p2.setParticipantRole(CDAFactory.eINSTANCE.createParticipantRole());
	// p2.setTypeCode(ParticipationType.CST);
	// target.getParticipants().add(p2);
	//
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
	// (AdvanceDirectiveObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase.doValidationTest();
	// }

	// /**
	// *
	// * @generated not
	// */
	// @Test
	// public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType() {
	// OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase = new
	// OperationsTestCase<AdvanceDirectiveObservation>(
	// "validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType",
	// operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_MEDIA_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
	// objectFactory) {
	//
	// @Override
	// protected void updateToFail(AdvanceDirectiveObservation target) {
	// target.init();
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ED text = DatatypesFactory.eINSTANCE.createED();
	// text.setMediaType(null);
	// ed.setText(text);
	//
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected void updateToPass(AdvanceDirectiveObservation target) {
	// target.getReferences().clear();
	//
	// Reference ref = CDAFactory.eINSTANCE.createReference();
	// ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
	// ED text = DatatypesFactory.eINSTANCE.createED();
	// text.setMediaType("JPEG");
	// ed.setText(text);
	// ref.setExternalDocument(ed);
	// target.getReferences().add(ref);
	// }
	//
	// @Override
	// protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
	//
	// return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaType(
	// (AdvanceDirectiveObservation) objectToTest, diagnostician, map);
	// }
	//
	// };
	//
	// validateAdvanceDirectiveObservationReferenceExternalDocumentTextMediaTypeTestCase.doValidationTest();
	// }

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentTextReference() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.setText(DatatypesFactory.eINSTANCE.createED());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().clear();

				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ED text = DatatypesFactory.eINSTANCE.createED();
				text.setReference(DatatypesFactory.eINSTANCE.createTEL());
				ed.setText(text);
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentTextReference(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {

				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.getIds().add(DatatypesFactory.eINSTANCE.createII());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentId(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not 
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocumentText() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceExternalDocumentText",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ed.setText(DatatypesFactory.eINSTANCE.createED());
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocumentText(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				ref.setTypeCode(x_ActRelationshipExternalReference.REFR);
				target.getReferences().add(ref);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceTypeCode(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationReferenceExternalDocument() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationReferenceExternalDocumentTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
			"validateAdvanceDirectiveObservationReferenceExternalDocument",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_REFERENCE_EXTERNAL_DOCUMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {
				target.init();
				Reference ref = CDAFactory.eINSTANCE.createReference();

				target.getReferences().add(ref);
			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.getReferences().clear();
				Reference ref = CDAFactory.eINSTANCE.createReference();
				ExternalDocument ed = CDAFactory.eINSTANCE.createExternalDocument();
				ref.setExternalDocument(ed);
				target.getReferences().add(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationReferenceExternalDocument(
					(AdvanceDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationReferenceExternalDocumentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation> {
		public AdvanceDirectiveObservation create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationOperations {
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

} // AdvanceDirectiveObservationOperations
