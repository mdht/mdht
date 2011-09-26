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
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicalSummary;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemConcernEntry;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class MedicalSummaryOperationsTest extends MedicalDocumentOperationsTest {

	// @SuppressWarnings("hiding")
	// protected static final String TEMPLATE_ID =
	// "1.3.6.1.4.1.19376.1.5.3.1.1.2";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	//
	// // Template ID
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return MedicalSummaryOperations.validateMedicalSummaryTemplateId(
	// (MedicalSummary) objectToTest, diagnostician, map);
	// }
	// } };
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
	// /**
	// * @see
	// org.openhealthtools.mdht.uml.cda.operations.MutualExclusionValidationTest#getObjectToTest()
	// */
	// @Override
	// protected EObject getObjectToTest() {
	// return IHEFactory.eINSTANCE.createMedicalSummary();
	// }
	//
	// /**
	// * @see
	// org.openhealthtools.mdht.uml.cda.ihe.operations.MedicalDocumentOperationsTest#getObjectInitToTest()
	// */
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createMedicalSummary().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @Override
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// MedicalSummaryOperations obj = new MedicalSummaryOperations();
	// assertTrue(true);
	// } // testConstructor

	public static class OperationsForOCL extends MedicalSummaryOperations {
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

	public class ObjectFactory implements TestObjectFactory<MedicalSummary> {
		public MedicalSummary create() {
			return IHEFactory.eINSTANCE.createMedicalSummary();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateMedicalSummaryProblemConcernEntry() {
		OperationsTestCase<MedicalSummary> testCase = new OperationsTestCase<MedicalSummary>(
			"ValidateMedicalSummaryProblemConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_PROBLEM_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();

			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				ProblemConcernEntry pce = IHEFactory.eINSTANCE.createProblemConcernEntry().init();
				Section section = CDAFactory.eINSTANCE.createSection();
				section.addAct(pce);
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicalSummaryOperations.validateMedicalSummaryProblemConcernEntry(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateMedicalSummaryAllergyConcernEntry() {
		OperationsTestCase<MedicalSummary> testCase = new OperationsTestCase<MedicalSummary>(
			"ValidateMedicalSummaryAllergyConcernEntry",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_ALLERGY_CONCERN_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalSummary target) {

				Section section = CDAFactory.eINSTANCE.createSection();
				Act ac = IHEFactory.eINSTANCE.createAllergyIntoleranceConcern();
				section.addAct(ac);
				target.addSection(section);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicalSummaryOperations.validateMedicalSummaryAllergyConcernEntry(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateMedicalSummaryMedications() {
		OperationsTestCase<MedicalSummary> testCase = new OperationsTestCase<MedicalSummary>(
			"ValidateMedicalSummaryMedications",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				Section section = CDAFactory.eINSTANCE.createSection();
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init();
				section.addSubstanceAdministration(substanceAdministration);
				target.addSection(section);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicalSummaryOperations.validateMedicalSummaryMedications(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateMedicalSummaryTemplateId() {
		OperationsTestCase<MedicalSummary> testCase = new OperationsTestCase<MedicalSummary>(
			"ValidateMedicalSummaryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICAL_SUMMARY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {

			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicalSummaryOperations.validateMedicalSummaryTemplateId(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateGeneralHeaderConstraintsCodeMedicalSummaryDiagnosticChainMapOfObjectObject() {
		OperationsTestCase<MedicalSummary> testCase = new OperationsTestCase<MedicalSummary>(
			"ValidateGeneralHeaderConstraintsCodeMedicalSummaryDiagnosticChainMapOfObjectObject",
			operationsForOCL.getOCLValue("VALIDATE_GENERAL_HEADER_CONSTRAINTS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicalSummary target) {

			}

			@Override
			protected void updateToPass(MedicalSummary target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicalSummaryOperations.validateGeneralHeaderConstraintsCode(
					(MedicalSummary) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // MedicalSummaryOperationsTest
