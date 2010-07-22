/**
 * Copyright (c) 2010 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.AlertObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.EntityClassRoot;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AlertObservationOperationsTest extends StructuralAttributeValidationTest {

	protected static final String ALERT_OBSERVATION_VERIFICATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.18";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		private static final long serialVersionUID = 1L;
		{
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(
				ALERT_OBSERVATION_VERIFICATION_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationTemplateId(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}

		},

		// Status Code
		// -------------------------------------------------------------
		new StatusCodeCCDValidationTest(STATUS_CODE,
				STATUS_CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationStatusCode(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}
		},

		// Information Source
		// -------------------------------------------------------------
		new InformationSourceCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationInformationSource(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}
		},

		// Agent Representation
		// -------------------------------------------------------------
		new CCDValidationTestCase("participant") {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationAgentRepresentation(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<Participant2> retValue = new BasicEList<Participant2>();

				// Agent Representation
				final Participant2 participant = CDAFactory.eINSTANCE
				.createParticipant2();
				participant.setTypeCode(ParticipationType.CSM);
				retValue.add(participant);

				return retValue;
			}
		},

		// Playing Entity Required
		// -------------------------------------------------------------
		new CCDValidationTestCase("participant") {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationPlayingEntityRequired(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<Participant2> retValue = new BasicEList<Participant2>();

				// Playing Entity Required
				final Participant2 participant = CDAFactory.eINSTANCE
				.createParticipant2();
				participant.setTypeCode(ParticipationType.CSM);

				final ParticipantRole participantRole = CDAFactory.eINSTANCE
				.createParticipantRole();

				final PlayingEntity entity = CDAFactory.eINSTANCE
				.createPlayingEntity();
				entity.setClassCode(EntityClassRoot.MMAT);
				entity.setCode(DatatypesFactory.eINSTANCE.createCE());

				participantRole.setPlayingEntity(entity);
				participant.setParticipantRole(participantRole);
				retValue.add(participant);

				return retValue;
			}
		},

		// Entry Relationship
		// Alert Status Observation
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationAlertStatusObservation(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				er.setObservation(CCDFactory.eINSTANCE
						.createAlertStatusObservation());
				retValue.add(er);

				return retValue;
			}
		},

		// Entry Relationship
		// Observation Reaction Observation
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationReactionObservation(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.MFST);
				er.setObservation(CCDFactory.eINSTANCE
						.createReactionObservation());
				retValue.add(er);

				return retValue;
			}
		},

		// EffectiveTime
		// -------------------------------------------------------------
		new EffectiveTimeCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return AlertObservationOperations
				.validateAlertObservationEffectiveTime(
						(AlertObservation) eObjectToTest,
						diagnostician, map);
			}
		}
	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		final List<CDATestCase> retValue = super.getTestCases();
		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
		return retValue;
	}

	@Override
	protected EObject getEObjectToValidate() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		AlertObservation alertObservation = CCDFactory.eINSTANCE.createAlertObservation();
		section.addObservation(alertObservation);
		return alertObservation;
//		return CCDFactory.eINSTANCE.createAlertObservation();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createAlertObservation().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(
			final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP
		.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(
			final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return AlertObservationOperations.validateAlertObservationMoodCode(
				(AlertObservation) eObjectToValidate, diagnostician, map);
	}

} // AlertObservationOperationsTest