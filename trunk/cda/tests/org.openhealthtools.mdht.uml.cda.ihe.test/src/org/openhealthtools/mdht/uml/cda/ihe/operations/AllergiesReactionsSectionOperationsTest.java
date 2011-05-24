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
import org.openhealthtools.mdht.uml.cda.ccd.operations.AlertsSectionOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.AllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntoleranceConcern;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AllergiesReactionsSectionOperationsTest extends AlertsSectionOperationsTest {

	// protected static final String ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.3.13";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// AllergiesReactionsSectionOperations obj = new AllergiesReactionsSectionOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionTemplateId(
	// (AllergiesReactionsSection) objectToTest, diagnostician, map);
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
	// return IHEFactory.eINSTANCE.createAllergiesReactionsSection();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createAllergiesReactionsSection().init();
	// }

	public static class OperationsForOCL extends AllergiesReactionsSectionOperations {
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

	public class ObjectFactory implements TestObjectFactory<AllergiesReactionsSection> {
		public AllergiesReactionsSection create() {
			return IHEFactory.eINSTANCE.createAllergiesReactionsSection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateAllergiesReactionsSectionAllergyIntoleranceConcern() {
		OperationsTestCase<AllergiesReactionsSection> testCase = new OperationsTestCase<AllergiesReactionsSection>(
			"validateIHE AllergiesReactionsSectionImmunization",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_REACTIONS_SECTION_ALLERGY_INTOLERANCE_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {
				target.init();

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				AllergyIntoleranceConcern aic = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern().init();
				target.addAct(aic);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionAllergyIntoleranceConcern(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateAllergiesReactionsSectionTemplateId() {
		OperationsTestCase<AllergiesReactionsSection> testCase = new OperationsTestCase<AllergiesReactionsSection>(
			"Validate AllergiesReactionsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGIES_REACTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergiesReactionsSection target) {

			}

			@Override
			protected void updateToPass(AllergiesReactionsSection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergiesReactionsSectionOperations.validateAllergiesReactionsSectionTemplateId(
					(AllergiesReactionsSection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testGetAllergyIntoleranceConcerns() {

		AllergiesReactionsSection allergiesReactionsSection = objectFactory.create();

		allergiesReactionsSection.init();

		final long TESTCOUNT = 100;
		for (int vsoctr = 0; vsoctr < TESTCOUNT; vsoctr++) {

			AllergyIntoleranceConcern aic = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern().init();

			String vso = String.valueOf(vsoctr);
			CD cd = DatatypesFactory.eINSTANCE.createCD(vso, vso, vso, vso);

			aic.setCode(cd);

			allergiesReactionsSection.addAct(aic);
		}

		EList<AllergyIntoleranceConcern> result = AllergiesReactionsSectionOperations.getAllergyIntoleranceConcerns(allergiesReactionsSection);
		;

		org.junit.Assert.assertEquals(result.size(), TESTCOUNT);

	}

} // AllergiesReactionsSectionOperationsTest
