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

import static org.junit.Assert.fail;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class AllergyIntoleranceOperationsTest extends ProblemEntryOperationsTest {

	// protected static final String ALLERGY_INTOLERANCE_TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.6";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// AllergyIntoleranceOperations obj = new AllergyIntoleranceOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(ALLERGY_INTOLERANCE_TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return AllergyIntoleranceOperations.validateAllergyIntoleranceTemplateId(
	// (AllergyIntolerance) objectToTest, diagnostician, map);
	// }
	//
	// },
	//
	// // Information Source
	// // -------------------------------------------------------------
	// new InformationSourceCCDValidationTest() {
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ProblemObservationOperations.validateProblemObservationInformationSource(
	// (ProblemObservation) objectToTest, diagnostician, map);
	// }
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
	// ClinicalDocument clinicalDocument = CDAFactory.eINSTANCE.createClinicalDocument();
	// Section section = CDAFactory.eINSTANCE.createSection();
	// clinicalDocument.addSection(section);
	// AllergyIntolerance allergyIntolerance = IHEFactory.eINSTANCE.createAllergyIntolerance();
	// section.addObservation(allergyIntolerance);
	// return allergyIntolerance;
	// // return IHEFactory.eINSTANCE.createAllergyIntolerance();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createAllergyIntolerance().init();
	// }

	public static class OperationsForOCL extends AllergyIntoleranceOperations {
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

	public class ObjectFactory implements TestObjectFactory<AllergyIntolerance> {
		public AllergyIntolerance create() {
			return IHEFactory.eINSTANCE.createAllergyIntolerance();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceTemplateId(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceTemplateId() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceTemplateId(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceValue(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceValue() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceValue",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceValue(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceProblemEntryReactionObservationContainer(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceProblemEntryReactionObservationContainer() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceProblemEntryReactionObservationContainer",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_ENTRY_REACTION_OBSERVATION_CONTAINER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemEntryReactionObservationContainer(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceSeverity(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceSeverity() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceSeverity",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceSeverity(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceProblemStatusObservation(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceProblemStatusObservation() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceProblemStatusObservation",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_PROBLEM_STATUS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceProblemStatusObservation(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#validateAllergyIntoleranceComment(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateAllergyIntoleranceComment() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateAllergyIntoleranceComment",
			operationsForOCL.getOCLValue("VALIDATE_ALLERGY_INTOLERANCE_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateAllergyIntoleranceComment(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Override
	@Test
	public void testValidateProblemEntryCode() {
		OperationsTestCase<AllergyIntolerance> testCase = new OperationsTestCase<AllergyIntolerance>(
			"ValidateProblemEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(AllergyIntolerance target) {

			}

			@Override
			protected void updateToPass(AllergyIntolerance target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return AllergyIntoleranceOperations.validateProblemEntryCode(
					(AllergyIntolerance) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#getProblemEntryReactionObservationContainers(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance)}.
	 */
	@Test
	public void testGetProblemEntryReactionObservationContainers() {
		fail("Not yet implemented");

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#getIHESeverity(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance)}.
	 */
	@Test
	public void testGetIHESeverity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#getIHEProblemStatusObservation(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance)}.
	 */
	@Test
	public void testGetIHEProblemStatusObservation() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.AllergyIntoleranceOperations#getIHEComments(org.openhealthtools.mdht.uml.cda.ihe.AllergyIntolerance)}.
	 */
	@Test
	public void testGetIHEComments() {
		fail("Not yet implemented");
	}

} // AllergyIntoleranceOperationsTest
