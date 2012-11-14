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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.EncountersSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class EncounterHistorySectionOperationsTest extends EncountersSectionOperationsTest {

	// protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.1.5.3.3";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return EncounterHistorySectionOperations.validateEncounterHistorySectionTemplateId(
	// (EncounterHistorySection) objectToTest, diagnostician, map);
	// }
	//
	// }
	//
	// }; // TEST_CASE_ARRAY
	//
	// @Override
	// protected List<CDATestCase> getTestCases() {
	// // Return a new List because the one returned by Arrays.asList is
	// // unmodifiable so a sub-class can't append their test cases.
	// final List<CDATestCase> retValue = super.getTestCases();
	// retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
	// return retValue;
	// }
	//
	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createEncounterHistorySection();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createEncounterHistorySection().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @Override
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// EncounterHistorySectionOperations obj = new EncounterHistorySectionOperations();
	// assertTrue(true);
	// } // testConstructor

	public static class OperationsForOCL extends EncounterHistorySectionOperations {
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

	public class ObjectFactory implements TestObjectFactory<EncounterHistorySection> {
		public EncounterHistorySection create() {
			return IHEFactory.eINSTANCE.createEncounterHistorySection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateEncounterHistorySectionEncounterEntry() {
		OperationsTestCase<EncounterHistorySection> testCase = new OperationsTestCase<EncounterHistorySection>(
			"validateIHE EncounterHistorySectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_HISTORY_SECTION_ENCOUNTER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterHistorySection target) {
				target.init();

			}

			@Override
			protected void updateToPass(EncounterHistorySection target) {
				EncounterEntry ee = IHEFactory.eINSTANCE.createEncounterActivity().init();

				target.addEncounter(ee);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterHistorySectionOperations.validateEncounterHistorySectionEncounterEntry(
					(EncounterHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateEncounterHistorySectionTemplateId() {
		OperationsTestCase<EncounterHistorySection> testCase = new OperationsTestCase<EncounterHistorySection>(
			"Validate EncounterHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterHistorySection target) {

			}

			@Override
			protected void updateToPass(EncounterHistorySection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterHistorySectionOperations.validateEncounterHistorySectionTemplateId(
					(EncounterHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testGetEncounterEntries() {

		EncounterHistorySection encounterHistorySection = objectFactory.create();

		encounterHistorySection.init();

		final long TESTCOUNT = 100;
		for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {

			EncounterEntry ee = IHEFactory.eINSTANCE.createEncounterActivity().init();

			String vso = String.valueOf(vsoctr);
			CD cd = DatatypesFactory.eINSTANCE.createCD(vso, vso, vso, vso);

			ee.setCode(cd);

			encounterHistorySection.addEncounter(ee);
		}

		EList<EncounterEntry> result = EncounterHistorySectionOperations.getEncounterEntries(encounterHistorySection);
		;

		org.junit.Assert.assertEquals(result.size(), TESTCOUNT);

	}
} // EncounterHistorySectionOperationsTest
