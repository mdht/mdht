/*******************************************************************************
 * Copyright (c) 2011 Sean Muir, JKM Software, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir, JKM Software, LLC - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * @author eclipse
 *
 */
public class MedicationFullfillmentInstructionsOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends MedicationFullfillmentInstructionsOperations {
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

	public class ObjectFactory implements TestObjectFactory<MedicationFullfillmentInstructions> {
		public MedicationFullfillmentInstructions create() {
			return IHEFactory.eINSTANCE.createMedicationFullfillmentInstructions();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations#validateMedicationFullfillmentInstructionsTemplateId(org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateMedicationFullfillmentInstructionsTemplateId() {
		OperationsTestCase<MedicationFullfillmentInstructions> testCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"ValidateMedicationFullfillmentInstructionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {

			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsTemplateId(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations#validateMedicationFullfillmentInstructionsCode(org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateMedicationFullfillmentInstructionsCode() {
		OperationsTestCase<MedicationFullfillmentInstructions> testCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"ValidateMedicationFullfillmentInstructionsCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {

			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD(
					"FINSTRUCT", "1.3.6.1.4.1.19376.1.5.3.2", "1.3.6.1.4.1.19376.1.5.3.2", "FINSTRUCT");

				target.setCode(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsCode(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations#validateMedicationFullfillmentInstructionsStatusCode(org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateMedicationFullfillmentInstructionsStatusCode() {
		OperationsTestCase<MedicationFullfillmentInstructions> testCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"ValidateMedicationFullfillmentInstructionsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				CS cs = DatatypesFactory.eINSTANCE.createCS("COMPLETE");
				target.setStatusCode(cs);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsStatusCode(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations#validateMedicationFullfillmentInstructionsText(org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateMedicationFullfillmentInstructionsText() {
		OperationsTestCase<MedicationFullfillmentInstructions> testCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"ValidateMedicationFullfillmentInstructionsText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {

				ED instruction = DatatypesFactory.eINSTANCE.createED("instruction");
				target.setText(instruction);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsText(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.openhealthtools.mdht.uml.hl7.rim.operations.RIMOperationTest#getObjectToTest()
	 */
	@Override
	protected EObject getObjectToTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
