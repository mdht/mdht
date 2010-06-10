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

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
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
import org.openhealthtools.mdht.uml.cda.Entry;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ccd.AlertsSection;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemAct;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemSection;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.NullFlavor;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActClassDocumentEntryAct;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentActMood;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings({ "nls", "serial" })
public class ProblemActOperationsTest extends StructuralAttributeValidationTest {

	protected static final String TEMPLATE_ID = "2.16.840.1.113883.10.20.1.27";

	protected static final HashMap<String, Enumerator> VALID_STRUCTURAL_ATTRIBUTE_NAME_VALUE_MAP = new HashMap<String, Enumerator>() {
		{
			put(CLASS_CODE_ATTRIBUTE_NAME, x_ActClassDocumentEntryAct.ACT);
			put(MOOD_CODE_ATTRIBUTE_NAME, x_DocumentActMood.EVN);
		}
	};

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDCCDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemActOperations.validateProblemActTemplateId(
						(ProblemAct) eObjectToTest, diagnostician, map);
			}

		},

		// ID
		// -------------------------------------------------------------
		new IDCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemActOperations.validateProblemActId(
						(ProblemAct) eObjectToTest, diagnostician, map);
			}
		},

		// EffectiveTime
		// -------------------------------------------------------------
		new EffectiveTimeCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemActOperations
				.validateProblemActEffectiveTime(
						(ProblemAct) eObjectToTest, diagnostician,
						map);
			}
		},

		// Entry Relationship
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemActOperations
				.validateProblemActEpisodeObservation(
						(ProblemAct) eObjectToTest, diagnostician,
						map)
						&& ProblemActOperations
						.validateProblemActSubjectOfTarget(
								(ProblemAct) eObjectToTest,
								diagnostician, map)
								&& ProblemActOperations
								.validateProblemActEntryRelationshipRequired(
										(ProblemAct) eObjectToTest,
										diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();

				EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				// er.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				er.setObservation(CCDFactory.eINSTANCE
						.createEpisodeObservation());
				retValue.add(er);

				er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CCDFactory.eINSTANCE
						.createProblemObservation());
				retValue.add(er);

				er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(CCDFactory.eINSTANCE
						.createAlertObservation());
				retValue.add(er);

				return retValue;
			}
		},

		// Patient Awareness
		// -------------------------------------------------------------
		new CCDValidationTestCase("participant") {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemActOperations
				.validateProblemActContainsPatientAwareness(
						(ProblemAct) eObjectToTest, diagnostician,
						map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<Participant2> retValue = new BasicEList<Participant2>();

				final Participant2 participant = CCDFactory.eINSTANCE
				.createPatientAwareness();
				retValue.add(participant);
				return retValue;
			}
		}

	}; // TEST_CASE_ARRAY

	@Override
	protected List<CDATestCase> getTestCases() {
		// Return a new List because the one returned by Arrays.asList is
		// unmodifiable so a sub-class can't append their test cases.
		return new ArrayList<CDATestCase>(Arrays.asList(TEST_CASE_ARRAY));
	}

	@Override
	protected EObject getEObjectToValidate() {
		return CCDFactory.eINSTANCE.createProblemAct();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return CCDFactory.eINSTANCE.createProblemAct().init();
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
		return ProblemActOperations.validateProblemActClassCode(
				(ProblemAct) eObjectToValidate, diagnostician, map)
				&& ProblemActOperations.validateProblemActMoodCode(
						(ProblemAct) eObjectToValidate, diagnostician, map);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations#validateProblemActCodeNullFlavor(org.openhealthtools.mdht.uml.cda.ccd.ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public final void testValidateProblemActCodeNullFlavor() {
		final ProblemAct pa = (ProblemAct) getEObjectToValidate();
		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(pa);

		boolean isValid = ProblemActOperations
		.validateProblemActCodeNullFlavor(pa, diagnostician, map);
		assertTrue(diagnostician.getMessage(), !isValid);

		final CD cd = DatatypesFactory.eINSTANCE.createCD();
		cd.setNullFlavor(NullFlavor.NA);
		pa.setCode(cd);

		isValid = ProblemActOperations.validateProblemActCodeNullFlavor(pa,
				diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations#validateProblemActContainsProblemObservation(org.openhealthtools.mdht.uml.cda.ccd.ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateProblemActContainsProblemObservation() {
		final ProblemSection problemSection = CCDFactory.eINSTANCE
		.createProblemSection();
		final ProblemAct problemAct = (ProblemAct) getEObjectToValidate();
		final Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setAct(problemAct);
		problemSection.getEntries().add(entry);

		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(problemAct);

		boolean isValid = ProblemActOperations
		.validateProblemActContainsProblemObservation(problemAct,
				diagnostician, map);
		assertTrue("Validation passed when it was expected to fail.", !isValid);

		problemAct.addObservation(CCDFactory.eINSTANCE
				.createProblemObservation());

		isValid = ProblemActOperations
		.validateProblemActContainsProblemObservation(problemAct,
				diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemActOperations#validateProblemActContainsAlertObservation(org.openhealthtools.mdht.uml.cda.ccd.ProblemAct, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateProblemActContainsAlertObservation() {
		final AlertsSection problemSection = CCDFactory.eINSTANCE
		.createAlertsSection();
		final ProblemAct problemAct = (ProblemAct) getEObjectToValidate();
		final Entry entry = CDAFactory.eINSTANCE.createEntry();
		entry.setAct(problemAct);
		problemSection.getEntries().add(entry);

		final BasicDiagnostic diagnostician = Diagnostician.INSTANCE
		.createDefaultDiagnostic(problemAct);

		boolean isValid = ProblemActOperations
		.validateProblemActContainsAlertObservation(problemAct,
				diagnostician, map);
		assertTrue("Validation passed when it was expected to fail.", !isValid);

		problemAct
		.addObservation(CCDFactory.eINSTANCE.createAlertObservation());

		isValid = ProblemActOperations
		.validateProblemActContainsAlertObservation(problemAct,
				diagnostician, map);
		assertTrue(diagnostician.getMessage(), isValid);
	}

} // ProblemActOperationsTest