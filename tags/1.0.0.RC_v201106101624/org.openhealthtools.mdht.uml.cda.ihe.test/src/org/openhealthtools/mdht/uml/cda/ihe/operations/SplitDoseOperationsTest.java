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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.SplitDose;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class SplitDoseOperationsTest extends MedicationOperationsTest {

	public static class OperationsForOCL extends SplitDoseOperations {
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

	public class ObjectFactory implements TestObjectFactory<SplitDose> {
		public SplitDose create() {
			return IHEFactory.eINSTANCE.createSplitDose();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateSplitDoseSplitDosingSubstanceAdministration() {
		OperationsTestCase<SplitDose> testCase = new OperationsTestCase<SplitDose>(
			"ValidateSplitDoseSplitDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_SPLIT_DOSE_SPLIT_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SplitDose target) {
				target.init();
			}

			@Override
			protected void updateToPass(SplitDose target) {

				SubstanceAdministration sa = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SplitDoseOperations.validateSplitDoseSplitDosingSubstanceAdministration(
					(SplitDose) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();

	}

	@Test
	public void testValidateSplitDoseTemplateId() {
		OperationsTestCase<SplitDose> testCase = new OperationsTestCase<SplitDose>(
			"ValidateSplitDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SPLIT_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SplitDose target) {

			}

			@Override
			protected void updateToPass(SplitDose target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SplitDoseOperations.validateSplitDoseTemplateId((SplitDose) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	//
	// @SuppressWarnings("hiding")
	// protected static final String TEMPLATE_ID =
	// "1.3.6.1.4.1.19376.1.5.3.1.4.9";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public final void testConstructor() {
	// SplitDoseOperations obj = new SplitDoseOperations();
	// assertTrue(true);
	// } // testConstructor
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return SplitDoseOperations.validateSplitDoseTemplateId(
	// (SplitDose) objectToTest, diagnostician, map);
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
	// return IHEFactory.eINSTANCE.createSplitDose();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createSplitDose().init();
	// }

} // SplitDoseOperationsTest
