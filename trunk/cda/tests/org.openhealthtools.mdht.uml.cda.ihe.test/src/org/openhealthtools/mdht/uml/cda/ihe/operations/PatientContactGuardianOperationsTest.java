/*******************************************************************************
 * Copyright (c) 2011 eclipse.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     eclipse - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * @author eclipse
 *
 */
public class PatientContactGuardianOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends PatientContactGuardianOperations {
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

	public class ObjectFactory implements TestObjectFactory<PatientContactGuardian> {
		public PatientContactGuardian create() {
			return IHEFactory.eINSTANCE.createPatientContactGuardian();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations#validatePatientContactGuardianTemplateId(org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactGuardianTemplateId() {
		OperationsTestCase<PatientContactGuardian> testCase = new OperationsTestCase<PatientContactGuardian>(
			"ValidatePatientContactGuardianTemplateId", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactGuardianOperations.validatePatientContactGuardianTemplateId(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations#validatePatientContactGuardianAddr(org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactGuardianAddr() {
		OperationsTestCase<PatientContactGuardian> testCase = new OperationsTestCase<PatientContactGuardian>(
			"ValidatePatientContactGuardianAddr", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactGuardianOperations.validatePatientContactGuardianAddr(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations#validatePatientContactGuardianClassCode(org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactGuardianClassCode() {
		OperationsTestCase<PatientContactGuardian> testCase = new OperationsTestCase<PatientContactGuardian>(
			"ValidatePatientContactGuardianClassCode", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactGuardianOperations.validatePatientContactGuardianClassCode(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations#validatePatientContactGuardianCode(org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactGuardianCode() {
		OperationsTestCase<PatientContactGuardian> testCase = new OperationsTestCase<PatientContactGuardian>(
			"ValidatePatientContactGuardianCode", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactGuardianOperations.validatePatientContactGuardianCode(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations#validatePatientContactGuardianTelecom(org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactGuardianTelecom() {
		OperationsTestCase<PatientContactGuardian> testCase = new OperationsTestCase<PatientContactGuardian>(
			"ValidatePatientContactGuardianTelecom", operationsForOCL.getOCLValue("xxx"), objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactGuardianOperations.validatePatientContactGuardianTelecom(
					(PatientContactGuardian) objectToTest, diagnostician, map);
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
