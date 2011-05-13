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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemConcernEntryOperationsTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ConditionOperationsTest extends ProblemConcernEntryOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String TEMPLATE_ID = "2.16.840.1.113883.3.88.11.83.7";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ConditionOperations.validateConditionTemplateId(
						(Condition) objectToTest, diagnostician, map);
			}

		},

		// Entry
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ConditionOperations.validateConditionConditionEntry(
						(Condition) objectToTest, diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();
				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				er.setObservation(HITSPFactory.eINSTANCE
						.createConditionEntry());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				retValue.add(er);
				return retValue;
			}
		} }; // TEST_CASE_ARRAY

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
		return HITSPFactory.eINSTANCE.createCondition();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return HITSPFactory.eINSTANCE.createCondition().init();
	}

//	/**
//	 * Not a real test, needed for EMMA to report 100% method coverage.
//	 */
//	@Override
//	@SuppressWarnings("unused")
//	@Test
//	public final void testConstructor() {
//		ConditionOperations obj = new ConditionOperations();
//		assertTrue(true);
//	} // testConstructor
//	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.hitsp.operations.ConditionOperations#createConditionEntry(org.openhealthtools.mdht.uml.cda.hitsp.Condition)}
	 * .
	 */
	@Test
	public final void testCreateConditionEntry() {
		final Condition condition = HITSPFactory.eINSTANCE.createCondition();
		ConditionOperations.createConditionEntry(condition);
		final EntryRelationship er = condition.getEntryRelationships().get(0);
		assertTrue(er.getObservation() instanceof ConditionEntry);
	}
} // ConditionOperationsTest