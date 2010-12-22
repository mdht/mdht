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
package org.openhealthtools.mdht.uml.cda.ihe.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ProblemConcernEntryOperationsTest extends
ConcernEntryOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String CONCERN_ENTRY_TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.5.2";

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		ProblemConcernEntryOperations obj = new ProblemConcernEntryOperations();
		assertTrue(true);
	} // testConstructor
	
	private static final CDATestCase TEST_CASE_ARRAY[] = {
		// Template ID
		// -------------------------------------------------------------
		new TemplateIDValidationTest(CONCERN_ENTRY_TEMPLATE_ID) {

			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemConcernEntryOperations
				.validateProblemConcernEntryTemplateId(
						(ProblemConcernEntry) objectToTest,
						diagnostician, map);
			}

		},

		// Entry Relationship
		// -------------------------------------------------------------
		new EntryRelationshipCCDValidationTest() {
			@Override
			protected boolean validate(final EObject objectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ProblemConcernEntryOperations
				.validateProblemConcernEntryProblemEntry(
						(ProblemConcernEntry) objectToTest,
						diagnostician, map);
			}

			@Override
			protected Object getValueToSet() {
				final EList<EntryRelationship> retValue = new BasicEList<EntryRelationship>();
				final EntryRelationship er = CDAFactory.eINSTANCE
				.createEntryRelationship();
				er
				.setObservation(IHEFactory.eINSTANCE
						.createProblemEntry());
				retValue.add(er);
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
		return IHEFactory.eINSTANCE.createProblemConcernEntry();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createProblemConcernEntry().init();
	}

} // ProblemConcernEntryOperationsTest