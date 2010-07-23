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

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperations;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ProblemEntryOperationsTest extends
		ProblemObservationOperationsTest {

	protected static final String PROBLEM_ENTRY_TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.5";

	private static final String VALUE_CODE_SYSTEM = "notspecified";

	private static final CDATestCase TEST_CASE_ARRAY[] = {
	// Template ID
			// -------------------------------------------------------------
			new TemplateIDValidationTest(PROBLEM_ENTRY_TEMPLATE_ID) {

				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemEntryOperations
							.validateProblemEntryTemplateId(
									(ProblemEntry) objectToTest,
									diagnostician, map);
				}
			},

			// Value
			// -------------------------------------------------------------
			new ObservationValueCCDValidationTest(VALUE_CODE_SYSTEM) {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemEntryOperations.validateProblemEntryValue(
							(ProblemEntry) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					final EList<CD> retValue = new BasicEList<CD>();
					final CD cd = DatatypesFactory.eINSTANCE.createCD();
					cd.setCodeSystem(observationValueCodeSystem);
					retValue.add(cd);
					return retValue;
				}
			},

			// Text
			// -------------------------------------------------------------
			new TextCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemEntryOperations.validateProblemEntryText(
							(ProblemEntry) objectToTest, diagnostician, map);
				}

				@Override
				protected Object getValueToSet() {
					return DatatypesFactory.eINSTANCE.createED();
				}

			},
			
			// Information Source
			// -------------------------------------------------------------
			new InformationSourceCCDValidationTest() {
				@Override
				protected boolean validate(final EObject objectToTest,
						final BasicDiagnostic diagnostician,
						final Map<Object, Object> map) {
					return ProblemObservationOperations.
					validateProblemObservationInformationSource(
							(ProblemObservation) objectToTest,
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
	protected EObject getObjectToTest() {
		ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
		Section section = CDAFactory.eINSTANCE.createSection();
		clinicalDocument.addSection(section);
		ProblemEntry problemEntry = IHEFactory.eINSTANCE.createProblemEntry();
		section.addObservation(problemEntry);
		return problemEntry;
//		return IHEFactory.eINSTANCE.createProblemEntry();
	}

	@Override
	protected EObject getObjectInitToTest() {
		return IHEFactory.eINSTANCE.createProblemEntry().init();
	}

} // ProblemEntryOperationsTest