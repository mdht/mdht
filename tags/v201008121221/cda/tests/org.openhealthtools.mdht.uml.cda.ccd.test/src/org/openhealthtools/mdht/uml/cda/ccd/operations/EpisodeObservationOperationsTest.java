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

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.EpisodeObservation;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ActClassObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActMoodDocumentObservation;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class EpisodeObservationOperationsTest extends
StructuralAttributeValidationTest {

	protected static final String EPISODE_OBSERVATION_TEMPLATE_ID = "2.16.840.1.113883.10.20.1.41";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, ActClassObservation.OBS);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_ActMoodDocumentObservation.EVN);
		}
	};

	protected static final String STATUS_CODE = "completed";
	protected static final String STATUS_CODE_CODE_SYSTEM = "2.16.840.1.113883.5.14";

	protected static final String CODE = "ASSERTION";
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.5.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(EPISODE_OBSERVATION_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EpisodeObservationOperations
				.validateEpisodeObservationTemplateId(
						(EpisodeObservation) objectToTest,
						diagnostician, map);
			}

		},

		// Status Code
		// -------------------------------------------------------------
		new StatusCodeCCDValidationTest(STATUS_CODE,
				STATUS_CODE_CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EpisodeObservationOperations
				.validateEpisodeObservationStatusCode(
						(EpisodeObservation) objectToTest,
						diagnostician, map);
			}
		},

		// Code
		// -------------------------------------------------------------
		new CodeCCDValidationTest(CODE, CODE_SYSTEM) {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EpisodeObservationOperations
				.validateEpisodeObservationCode(
						(EpisodeObservation) objectToTest,
						diagnostician, map);
			}
		},

		// Entry Relationship
		// SAS
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EpisodeObservationOperations
				.validateEpisodeObservationExistsEntryRelationshipSAS(
						(EpisodeObservation) objectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

				// Problem Act
				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				er.setAct(CCDFactory.eINSTANCE.createProblemAct());
				retValue.add(er);

				// Social History
				final EntryRelationship entity = CDAFactory.eINSTANCE
				.createEntryRelationship();
				entity.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				entity.setObservation(CCDFactory.eINSTANCE
						.createSocialHistoryObservation());
				retValue.add(entity);
				return retValue;
			}
		},

		// Value
		// -------------------------------------------------------------
		new CCDValidationTestCase("value") {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return EpisodeObservationOperations
				.validateEpisodeObservationValue(
						(EpisodeObservation) objectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<CD> retValue = new BasicEList<CD>();

				final CD element = DatatypesFactory.eINSTANCE.createCD(
						"404684003", "2.16.840.1.113883.6.96", "whatever",
				"whatever2");

				retValue.add(element);
				return retValue;
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
	protected EObject getObjectToTest() {
		return CCDFactory.eINSTANCE.createEpisodeObservation();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return CCDFactory.eINSTANCE.createEpisodeObservation().init();
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
		return EpisodeObservationOperations
		.validateEpisodeObservationClassCode(
				(EpisodeObservation) eObjectToValidate, diagnostician,
				map)
				&& EpisodeObservationOperations
				.validateEpisodeObservationMoodCode(
						(EpisodeObservation) eObjectToValidate,
						diagnostician, map);
	}

	/**
	 * Test for validateEpisodeObservationOneEntryRelationshipSUBJ
	 */
	@Test
	public void testvalidateEpisodeObservationOneEntryRelationshipSUBJ() {
		final EpisodeObservation eo = (EpisodeObservation) getObjectToTest();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(eo);
		boolean isValid = EpisodeObservationOperations
		.validateEpisodeObservationOneEntryRelationshipSUBJ(eo,
				diagnostician, map);
		assertTrue("Validation passed when it was expected to fail", !isValid);

		// Create the entry relationship with the correct typeCode, but don't
		// set the "act" or the "observation"
		final EntryRelationship entry = CDAFactory.eINSTANCE
		.createEntryRelationship();
		entry.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
		eo.getEntryRelationships().add(entry);

		assertNull(entry.getAct());
		assertNull(entry.getObservation());

		// With both NOT set, it should NOT validate
		entry.setObservation(null);
		isValid = EpisodeObservationOperations
		.validateEpisodeObservationOneEntryRelationshipSUBJ(eo,
				diagnostician, map);
		assertTrue(
				"Validation passed when it was expected to fail.  Both act and observation were null, but still validated.",
				!isValid);

		// Set them both
		entry.setAct(CCDFactory.eINSTANCE.createProblemAct());
		entry.setObservation(CCDFactory.eINSTANCE
				.createSocialHistoryObservation());

		isValid = EpisodeObservationOperations
		.validateEpisodeObservationOneEntryRelationshipSUBJ(eo,
				diagnostician, map);
		assertTrue(CDAValidationTest
				.createAssertionFailureMessage(diagnostician), isValid);

		// If act is not set, but the other is, then it should validate.
		entry.setAct(null);
		isValid = EpisodeObservationOperations
		.validateEpisodeObservationOneEntryRelationshipSUBJ(eo,
				diagnostician, map);
		assertTrue(CDAValidationTest
				.createAssertionFailureMessage(diagnostician), isValid);

		// With both NOT set, it should NOT validate
		entry.setObservation(null);
		isValid = EpisodeObservationOperations
		.validateEpisodeObservationOneEntryRelationshipSUBJ(eo,
				diagnostician, map);
		assertTrue("Validation passed when it was expected to fail", !isValid);

	}
} // EpisodeObservationOperationsTest