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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProblemObservationOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.Severity;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class ProblemEntryOperationsTest extends ProblemObservationOperationsTest {

	public static class OperationsForOCL extends ProblemEntryOperations {
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

	public class ObjectFactory implements TestObjectFactory<ProblemEntry> {
		public ProblemEntry create() {
			return IHEFactory.eINSTANCE.createProblemEntry();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateProblemEntryHasTextReference() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryHasTextReference",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();

				ED value = DatatypesFactory.eINSTANCE.createED("sample text");
				target.setText(value);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {

				TEL value = DatatypesFactory.eINSTANCE.createTEL("reference");
				target.getText().setReference(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryHasTextReference((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryCommentInversionInd() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryCommentInversionInd",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
				Act comment = IHEFactory.eINSTANCE.createComment().init();
				target.addAct(comment);
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setInversionInd(true);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryCommentInversionInd((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryTemplateId() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {

			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryTemplateId((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryCode() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryCode",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				target.getCode().setCode("55607006");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryCode((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryEffectiveTime() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryEffectiveTime",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {

				IVL_TS value = DatatypesFactory.eINSTANCE.createIVL_TS("time");
				target.setEffectiveTime(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryEffectiveTime((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryId() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryId",
				operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				II ii = DatatypesFactory.eINSTANCE.createII("ii");
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryId((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryText() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryText",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {

				ED text = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryText((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntryValue() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntryValue",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				ANY value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntryValue((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateProblemEntrySeverity() {
		OperationsTestCase<ProblemEntry> testCase = new OperationsTestCase<ProblemEntry>("ValidateProblemEntrySeverity",
				operationsForOCL.getOCLValue("VALIDATE_PROBLEM_ENTRY_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProblemEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProblemEntry target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				Severity severity = IHEFactory.eINSTANCE.createSeverity();
				er.setObservation(severity);
				target.getEntryRelationships().add(er);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ProblemEntryOperations.validateProblemEntrySeverity((ProblemEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	// protected static final String PROBLEM_ENTRY_TEMPLATE_ID =
	// "1.3.6.1.4.1.19376.1.5.3.1.4.5";
	//
	// private static final String VALUE_CODE_SYSTEM = "notspecified";
	//
	// private static final CDATestCase TEST_CASE_ARRAY[] = {
	// // Template ID
	// // -------------------------------------------------------------
	// new TemplateIDValidationTest(PROBLEM_ENTRY_TEMPLATE_ID) {
	//
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ProblemEntryOperations
	// .validateProblemEntryTemplateId(
	// (ProblemEntry) objectToTest,
	// diagnostician, map);
	// }
	// },
	//
	// // Value
	// // -------------------------------------------------------------
	// new ObservationValueCCDValidationTest(VALUE_CODE_SYSTEM) {
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ProblemEntryOperations.validateProblemEntryValue(
	// (ProblemEntry) objectToTest, diagnostician, map);
	// }
	//
	// @Override
	// protected Object getValueToSet() {
	// final EList<CD> retValue = new BasicEList<CD>();
	// final CD cd = DatatypesFactory.eINSTANCE.createCD();
	// cd.setCodeSystem(observationValueCodeSystem);
	// retValue.add(cd);
	// return retValue;
	// }
	// },
	//
	// // Text
	// // -------------------------------------------------------------
	// new TextCCDValidationTest() {
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ProblemEntryOperations.validateProblemEntryText(
	// (ProblemEntry) objectToTest, diagnostician, map);
	// }
	//
	// @Override
	// protected Object getValueToSet() {
	// return DatatypesFactory.eINSTANCE.createED();
	// }
	//
	// },
	//
	// // Information Source
	// // -------------------------------------------------------------
	// new InformationSourceCCDValidationTest() {
	// @Override
	// protected boolean validate(final EObject objectToTest,
	// final BasicDiagnostic diagnostician,
	// final Map<Object, Object> map) {
	// return ProblemObservationOperations.
	// validateProblemObservationInformationSource(
	// (ProblemObservation) objectToTest,
	// diagnostician, map);
	// }
	// }
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
	// ClinicalDocument clinicalDocument =
	// CDAFactory.eINSTANCE.createClinicalDocument();
	// Section section = CDAFactory.eINSTANCE.createSection();
	// clinicalDocument.addSection(section);
	// ProblemEntry problemEntry = IHEFactory.eINSTANCE.createProblemEntry();
	// section.addObservation(problemEntry);
	// return problemEntry;
	// // return IHEFactory.eINSTANCE.createProblemEntry();
	// }
	//
	// @Override
	// protected EObject getObjectInitToTest() {
	// return IHEFactory.eINSTANCE.createProblemEntry().init();
	// }

} // ProblemEntryOperationsTest