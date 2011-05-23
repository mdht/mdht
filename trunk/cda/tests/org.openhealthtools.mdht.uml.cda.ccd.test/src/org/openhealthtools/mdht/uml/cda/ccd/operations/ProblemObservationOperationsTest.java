/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
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
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class ProblemObservationOperationsTest extends StructuralAttributeValidationTest {

	protected static final String PROBLEM_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.28";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";

	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	// These could be incorrect. The OCL doesn't specify.
	protected static final String CODE = "10157-6";

	protected static final String CODE_SYSTEM = "2.16.840.1.113883.6.1";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
			// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(PROBLEM_OBSERVATION_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationTemplateId(
						(ProblemObservation) objectToTest, diagnostician, map);
				}

			},

			// Status Code
			// -------------------------------------------------------------
			new StatusCodeCCDValidationTest(STATUS_CODE, STATUS_CODE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationStatusCode(
						(ProblemObservation) objectToTest, diagnostician, map);
				}
			},

			// EffectiveTime
			// -------------------------------------------------------------
			new EffectiveTimeCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationEffectiveTime(
						(ProblemObservation) objectToTest, diagnostician, map);
				}
			},

			// Information Source
			// -------------------------------------------------------------
			new InformationSourceCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationInformationSource(
						(ProblemObservation) objectToTest, diagnostician, map);
				}
			},

			// Entry Relationship
			// Age Observation
			// -------------------------------------------------------------
			new EntryRelationshipCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationAgeObservation(
						(ProblemObservation) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

					final EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
					er.setObservation(CCDFactory.eINSTANCE.createAgeObservation());
					retValue.add(er);

					return retValue;
				}
			},

			// Entry Relationship
			// Problem Health Status
			// -------------------------------------------------------------
			new EntryRelationshipCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationProblemHealthStatus(
						(ProblemObservation) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

					final EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
					er.setObservation(CCDFactory.eINSTANCE.createProblemHealthStatusObservation());
					retValue.add(er);

					return retValue;
				}
			},

			// Entry Relationship
			// Problem Status
			// -------------------------------------------------------------
			new EntryRelationshipCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationProblemStatus(
						(ProblemObservation) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

					final EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
					er.setObservation(CCDFactory.eINSTANCE.createProblemStatusObservation());
					retValue.add(er);

					return retValue;
				}
			},

			// Patient Awareness
			// -------------------------------------------------------------
			new CCDValidationTestCase("participant") {
				@Override
				protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.validateProblemObservationContainsPatientAwareness(
						(ProblemObservation) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<Participant2> retValue = new BasicEList<Participant2>();

					// Agent Representation
					final Participant2 participant = CCDFactory.eINSTANCE.createPatientAwareness();
					retValue.add(participant);

					return retValue;
				}
			},

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
	protected EObject getObjectToTest() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		ProblemObservation problemObservation = CCDFactory.eINSTANCE.createProblemObservation();
		section.addObservation(problemObservation);
		return problemObservation;
		// return CCDFactory.eINSTANCE.createProblemObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createProblemObservation().init();
	}

	@Override
	protected Enumerator doGetValidStructuralAttributeValue(final String structuralAttributeName) {
		return VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP.get(structuralAttributeName);
	}

	@Override
	protected boolean doValidateStructuralAttributeValues(final EObject eObjectToValidate,
			final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
		return ProblemObservationOperations.validateProblemObservationMoodCode(
			(ProblemObservation) eObjectToValidate, diagnostician, map);
	}

} // ProblemObservationOperationsTest
