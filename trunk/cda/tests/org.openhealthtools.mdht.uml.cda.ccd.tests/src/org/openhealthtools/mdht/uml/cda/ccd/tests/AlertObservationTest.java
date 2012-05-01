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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Informant12;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.AlertStatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Alert Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAgentRepresentation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAgentRepresentationVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Agent Representation Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationPlayingEntityCodeVocab(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Playing Entity Code Vocab</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationAlertStatusObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Alert Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#validateAlertObservationReactionObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Alert Observation Reaction Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#getAlertStatusObservation() <em>Get Alert Status Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AlertObservation#getReactionObservations() <em>Get Reaction Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AlertObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationInformationSource() {
		OperationsTestCase<AlertObservation> validateAlertObservationInformationSourceTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();

				Informant12 inf = CDAFactory.eINSTANCE.createInformant12();
				target.getInformants().add(inf);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationInformationSource(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationInformationSourceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationAgentRepresentation() {
		OperationsTestCase<AlertObservation> validateAlertObservationAgentRepresentationTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationAgentRepresentation",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {

				target.init();
				Participant2 e = CDAFactory.eINSTANCE.createParticipant2();
				ParticipationType value = ParticipationType.CSM;
				e.setTypeCode(value);
				target.getParticipants().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationAgentRepresentation(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationAgentRepresentationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationPlayingEntityRequired() {
		OperationsTestCase<AlertObservation> validateAlertObservationPlayingEntityRequiredTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationPlayingEntityRequired",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole value = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				value.setPlayingEntity(pe);
				p2.setParticipantRole(value);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationPlayingEntityRequired(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationPlayingEntityRequiredTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationAgentRepresentationVocab() {
		OperationsTestCase<AlertObservation> validateAlertObservationAgentRepresentationVocabTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationAgentRepresentationVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_AGENT_REPRESENTATION_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 e = CDAFactory.eINSTANCE.createParticipant2();
				ParticipationType value = ParticipationType.CSM;
				e.setTypeCode(value);
				target.getParticipants().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationAgentRepresentationVocab(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationAgentRepresentationVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationParticipantRoleClassCode() {
		OperationsTestCase<AlertObservation> validateAlertObservationParticipantRoleClassCodeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.MANU);
				p2.setParticipantRole(pr);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationParticipantRoleClassCode(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationPlayingEntityClassCode() {
		OperationsTestCase<AlertObservation> validateAlertObservationPlayingEntityClassCodeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationPlayingEntityClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.setClassCode(EntityClassRoot.MMAT);
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCode("test");
				pe.setCode(code);
				p2.setParticipantRole(pr);
				pr.setPlayingEntity(pe);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationPlayingEntityClassCode(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationPlayingEntityClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationPlayingEntityCode() {
		OperationsTestCase<AlertObservation> validateAlertObservationPlayingEntityCodeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationPlayingEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCode("test");
				pe.setCode(code);
				p2.setParticipantRole(pr);
				pr.setPlayingEntity(pe);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationPlayingEntityCode(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationPlayingEntityCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationPlayingEntityCodeVocab() {
		OperationsTestCase<AlertObservation> validateAlertObservationPlayingEntityCodeVocabTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationPlayingEntityCodeVocab",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_PLAYING_ENTITY_CODE_VOCAB__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCode("test");
				code.setCodeSystem("2.16.840.1.113883.6.88");
				pe.setCode(code);
				p2.setParticipantRole(pr);
				pr.setPlayingEntity(pe);
				target.getParticipants().add(p2);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationPlayingEntityCodeVocab(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationPlayingEntityCodeVocabTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAlertObservationTemplateId() {
		OperationsTestCase<AlertObservation> validateAlertObservationTemplateIdTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationTemplateId(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAlertObservationMoodCode() {
		OperationsTestCase<AlertObservation> validateAlertObservationMoodCodeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationMoodCode(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateAlertObservationStatusCode() {
		OperationsTestCase<AlertObservation> validateAlertObservationStatusCodeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationStatusCode(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated 
	 */
	@Test
	public void testValidateAlertObservationEffectiveTime() {
		OperationsTestCase<AlertObservation> validateAlertObservationEffectiveTimeTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationEffectiveTime(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationAlertStatusObservation() {
		OperationsTestCase<AlertObservation> validateAlertObservationAlertStatusObservationTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationAlertStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_ALERT_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				AlertStatusObservation so = CCDFactory.eINSTANCE.createAlertStatusObservation();
				er.setObservation(so);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationAlertStatusObservation(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationAlertStatusObservationTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateAlertObservationReactionObservation() {
		OperationsTestCase<AlertObservation> validateAlertObservationReactionObservationTestCase = new OperationsTestCase<AlertObservation>(
			"validateAlertObservationReactionObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALERT_OBSERVATION_REACTION_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AlertObservation target) {

			}

			@Override
			protected void updateToPass(AlertObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				ReactionObservation ro = CCDFactory.eINSTANCE.createReactionObservation();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(ro);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AlertObservationOperations.validateAlertObservationReactionObservation(
					(AlertObservation) objectToTest, diagnostician, map);
			}

		};

		validateAlertObservationReactionObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAlertStatusObservation() {

		AlertObservation target = objectFactory.create();
		target.getAlertStatusObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetReactionObservations() {

		AlertObservation target = objectFactory.create();
		target.getReactionObservations();

	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends AlertObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AlertObservation> {
		public AlertObservation create() {
			return CCDFactory.eINSTANCE.createAlertObservation();
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
	private static class ConstructorTestClass extends AlertObservationOperations {
	}

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

} // AlertObservationOperations
