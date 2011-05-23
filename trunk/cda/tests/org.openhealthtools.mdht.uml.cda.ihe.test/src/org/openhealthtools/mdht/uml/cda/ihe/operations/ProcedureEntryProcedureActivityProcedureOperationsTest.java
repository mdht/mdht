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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityProcedureOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntryProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ProcedureEntryProcedureActivityProcedureOperationsTest extends ProcedureActivityProcedureOperationsTest {

	// @SuppressWarnings("hiding")
	// protected static final String TEMPLATE_ID =
	// "1.3.6.1.4.1.19376.1.5.3.1.4.19";
	//
	// /**
	// * Not a real test, needed for EMMA to report 100% method coverage.
	// */
	// @SuppressWarnings("unused")
	// @Test
	// public final void testConstructor() {
	// ProcedureEntryProcedureActivityProcedureOperations obj = new
	// ProcedureEntryProcedureActivityProcedureOperations();
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
	// return ProcedureEntryProcedureActivityProcedureOperations
	// .validateProcedureEntryProcedureActivityProcedureTemplateId(
	// (ProcedureEntryProcedureActivityProcedure) objectToTest,
	// diagnostician, map);
	// }
	//
	// } }; // TEST_CASE_ARRAY
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
	// return IHEFactory.eINSTANCE
	// .createProcedureEntryProcedureActivityProcedure();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE
	// .createProcedureEntryProcedureActivityProcedure().init();
	// }

	public static class OperationsForOCL extends ProcedureEntryProcedureActivityProcedureOperations {
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

	public class ObjectFactory implements TestObjectFactory<ProcedureEntryProcedureActivityProcedure> {
		public ProcedureEntryProcedureActivityProcedure create() {
			return IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	public void testValidateProcedureEntryProcedureActivityProcedureInternalReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> testCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"ValidateProcedureEntryProcedureActivityProcedureInternalReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureInternalReferenceReason() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> testCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"ValidateProcedureEntryProcedureActivityProcedureInternalReferenceReason",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {

				for (EntryRelationship er : target.getEntryRelationships()) {
					Act act = IHEFactory.eINSTANCE.createInternalReference().init();
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
					er.setAct(act);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureInternalReferenceReason(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureHasTextReference() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> testCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"ValidateProcedureEntryProcedureActivityProcedureHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				TEL ref = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(ref);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureHasTextReference(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> testCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"validateProcedureEntryProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureTemplateId(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProcedureEntryProcedureActivityProcedureText() {
		OperationsTestCase<ProcedureEntryProcedureActivityProcedure> testCase = new OperationsTestCase<ProcedureEntryProcedureActivityProcedure>(
			"ValidateProcedureEntryProcedureActivityProcedureText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PROCEDURE_ACTIVITY_PROCEDURE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntryProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProcedureEntryProcedureActivityProcedure target) {
				ED value = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProcedureEntryProcedureActivityProcedureOperations.validateProcedureEntryProcedureActivityProcedureText(
					(ProcedureEntryProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // ProcedureEntryProcedureActivityProcedureOperationsTest
