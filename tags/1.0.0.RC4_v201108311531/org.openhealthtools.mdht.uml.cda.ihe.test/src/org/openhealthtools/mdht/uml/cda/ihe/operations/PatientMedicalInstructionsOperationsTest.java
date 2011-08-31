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
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * @author eclipse
 *
 */
public class PatientMedicalInstructionsOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends PatientMedicalInstructionsOperations {
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

	public class ObjectFactory implements TestObjectFactory<PatientMedicalInstructions> {
		public PatientMedicalInstructions create() {
			return IHEFactory.eINSTANCE.createPatientMedicalInstructions();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations#validatePatientMedicalInstructionsTemplateId(org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientMedicalInstructionsTemplateId() {
		OperationsTestCase<PatientMedicalInstructions> testCase = new OperationsTestCase<PatientMedicalInstructions>(
			"ValidatePatientMedicalInstructionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsTemplateId(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations#validatePatientMedicalInstructionsClassCode(org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientMedicalInstructionsClassCode() {
		OperationsTestCase<PatientMedicalInstructions> testCase = new OperationsTestCase<PatientMedicalInstructions>(
			"ValidatePatientMedicalInstructionsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsClassCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations#validatePatientMedicalInstructionsCode(org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientMedicalInstructionsCode() {
		OperationsTestCase<PatientMedicalInstructions> testCase = new OperationsTestCase<PatientMedicalInstructions>(
			"ValidatePatientMedicalInstructionsCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations#validatePatientMedicalInstructionsStatusCode(org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientMedicalInstructionsStatusCode() {
		OperationsTestCase<PatientMedicalInstructions> testCase = new OperationsTestCase<PatientMedicalInstructions>(
			"ValidatePatientMedicalInstructionsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				CS status = DatatypesFactory.eINSTANCE.createCS();
				target.setStatusCode(status);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsStatusCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations#validatePatientMedicalInstructionsText(org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientMedicalInstructionsText() {
		OperationsTestCase<PatientMedicalInstructions> testCase = new OperationsTestCase<PatientMedicalInstructions>(
			"ValidatePatientMedicalInstructionsText",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				ED text = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsText(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
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
