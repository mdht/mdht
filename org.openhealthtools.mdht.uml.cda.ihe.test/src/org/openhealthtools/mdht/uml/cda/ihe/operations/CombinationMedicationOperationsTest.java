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
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.CombinationMedication;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class CombinationMedicationOperationsTest extends MedicationOperationsTest {

	public static class OperationsForOCL extends CombinationMedicationOperations {
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

	public class ObjectFactory implements TestObjectFactory<CombinationMedication> {
		public CombinationMedication create() {
			return IHEFactory.eINSTANCE.createCombinationMedication();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateCombinationMedicationSubstanceAdministration() {
		OperationsTestCase<CombinationMedication> testCase = new OperationsTestCase<CombinationMedication>(
			"validateCombinationMedicationSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_COMBINATION_MEDICATION_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CombinationMedication target) {
				target.init();

			}

			@Override
			protected void updateToPass(CombinationMedication target) {
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init(); // CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(substanceAdministration);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CombinationMedicationOperations.validateCombinationMedicationSubstanceAdministration(
					(CombinationMedication) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateCombinationMedicationTemplateId() {
		OperationsTestCase<CombinationMedication> testCase = new OperationsTestCase<CombinationMedication>(
			"Validate CombinationMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_COMBINATION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(CombinationMedication target) {

			}

			@Override
			protected void updateToPass(CombinationMedication target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return CombinationMedicationOperations.validateCombinationMedicationTemplateId(
					(CombinationMedication) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	// @SuppressWarnings("hiding")
	// protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.11";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest, final BasicDiagnostic diagnostician, final Map<Object, Object> map) {
	// return CombinationMedicationOperations.validateCombinationMedicationTemplateId((CombinationMedication) objectToTest, diagnostician, map);
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
	// return IHEFactory.eINSTANCE.createCombinationMedication();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createCombinationMedication().init();
	// }
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public void testConstructor() {
	// CombinationMedicationOperations obj = new CombinationMedicationOperations();
	// assertTrue(true);
	// } // testConstructor

}
