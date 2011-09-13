/*******************************************************************************
 * Copyright (c) 2010, 2011 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.ActiveProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ActiveProblemsSectionOperationsTest extends ProblemSectionOperationsTest {

	public static class OperationsForOCL extends ActiveProblemsSectionOperations {
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

	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		ActiveProblemsSectionOperations obj = new ActiveProblemsSectionOperations();
		assertTrue(true);
	} // testConstructor

	public class ActiveProblemsSectionObjectFactory implements TestObjectFactory<ActiveProblemsSection> {
		public ActiveProblemsSection create() {
			return IHEFactory.eINSTANCE.createActiveProblemsSection();
		}
	}

	ActiveProblemsSectionObjectFactory activeProblemsSectionObjectFactory = new ActiveProblemsSectionObjectFactory();

	@Test
	public void testValidateActiveProblemsSectionTemplateId() {

		OperationsTestCase<ActiveProblemsSection> testValidateActiveProblemsSectionTemplateIdTestCase = new OperationsTestCase<ActiveProblemsSection>(
			"validateActiveProblemsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ACTIVE_PROBLEMS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			activeProblemsSectionObjectFactory) {

			@Override
			protected void updateToFail(ActiveProblemsSection target) {

			}

			@Override
			protected void updateToPass(ActiveProblemsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ActiveProblemsSectionOperations.validateActiveProblemsSectionTemplateId(
					(ActiveProblemsSection) objectToTest, diagnostician, map);
			}

		};

		testValidateActiveProblemsSectionTemplateIdTestCase.doValidationTest();
	}

	@Test
	public void testValidateActiveProblemsSectionProblemConcernEntry() {

		OperationsTestCase<ActiveProblemsSection> testValidateActiveProblemsSectionProblemConcernEntryTestCase = new OperationsTestCase<ActiveProblemsSection>(
			"validateActiveProblemsSectionProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_ACTIVE_PROBLEMS_SECTION_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			activeProblemsSectionObjectFactory) {

			@Override
			protected void updateToFail(ActiveProblemsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(ActiveProblemsSection target) {
				target.addAct(IHEFactory.eINSTANCE.createProblemConcernEntry().init());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ActiveProblemsSectionOperations.validateActiveProblemsSectionProblemConcernEntry(
					(ActiveProblemsSection) objectToTest, diagnostician, map);
			}

		};

		testValidateActiveProblemsSectionProblemConcernEntryTestCase.doValidationTest();
	}

	@Test
	public void testGetIHEVitalSignsOrganizers() {
		ActiveProblemsSection target = IHEFactory.eINSTANCE.createActiveProblemsSection().init();

		final long TESTCOUNT = 100;
		for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {
			ProblemConcernEntry object = IHEFactory.eINSTANCE.createProblemConcernEntry().init();
			target.addAct(object);
		}

		EList<ProblemConcernEntry> result = ActiveProblemsSectionOperations.getProblemConcernEntries(target);

		org.junit.Assert.assertEquals(result.size(), TESTCOUNT);

	}
} // ActiveProblemsSectionOperationsTest
