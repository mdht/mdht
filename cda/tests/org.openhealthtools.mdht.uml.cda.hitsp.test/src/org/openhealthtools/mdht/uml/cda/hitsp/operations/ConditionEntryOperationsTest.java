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

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.ConditionEntry;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProblemEntryOperationsTest;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ConditionEntryOperationsTest extends ProblemEntryOperationsTest {

	@SuppressWarnings("hiding")
	protected static final String CODE = "whatever";
	@SuppressWarnings("hiding")
	protected static final String CODE_SYSTEM = "2.16.840.1.113883.3.88.12.3221.7.2";
	private static final String VALUE_CODE_SYSTEM = "2.16.840.1.113883.3.88.12.3221.7.4";

	private static final CDATestCase TEST_CASE_ARRAY[] = {

		// EffectiveTime
		// -------------------------------------------------------------
		new EffectiveTimeCCDValidationTest() {
			@Override
			protected boolean validate(final EObject eObjectToTest,
					final BasicDiagnostic diagnostician,
					final Map<Object, Object> map) {
				return ConditionEntryOperations
				.validateConditionEntryEffectiveTime(
						(ConditionEntry) eObjectToTest,
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
				return ProblemObservationOperations.
				validateProblemObservationInformationSource(
						(ProblemObservation) eObjectToTest,
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
		ConditionEntry conditionEntry = HITSPFactory.eINSTANCE.createConditionEntry();
		section.addObservation(conditionEntry);
		return conditionEntry;
//		return HITSPFactory.eINSTANCE.createConditionEntry();
	}

	@Override
	protected EObject getEObjectInitToValidate() {
		return HITSPFactory.eINSTANCE.createConditionEntry().init();
	}

} // ConditionEntryOperationsTest