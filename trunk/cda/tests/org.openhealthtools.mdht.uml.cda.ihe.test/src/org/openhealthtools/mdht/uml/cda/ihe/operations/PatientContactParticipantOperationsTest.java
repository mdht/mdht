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
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * @author eclipse
 *
 */
public class PatientContactParticipantOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends PatientContactParticipantOperations {
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

	public class ObjectFactory implements TestObjectFactory<PatientContactParticipant> {
		public PatientContactParticipant create() {
			return IHEFactory.eINSTANCE.createPatientContactParticipant();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactParticipantOperations#validatePatientContactParticipantTemplateId(org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactParticipantTemplateId() {
		OperationsTestCase<PatientContactParticipant> testCase = new OperationsTestCase<PatientContactParticipant>(
			"ValidatePatientContactParticipantTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {

			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactParticipantOperations.validatePatientContactParticipantTemplateId(
					(PatientContactParticipant) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactParticipantOperations#validatePatientContactParticipantTime(org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactParticipantTime() {
		OperationsTestCase<PatientContactParticipant> testCase = new OperationsTestCase<PatientContactParticipant>(
			"ValidatePatientContactParticipantTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {

			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactParticipantOperations.validatePatientContactParticipantTime(
					(PatientContactParticipant) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactParticipantOperations#validatePatientContactParticipantTypeCode(org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePatientContactParticipantTypeCode() {
		OperationsTestCase<PatientContactParticipant> testCase = new OperationsTestCase<PatientContactParticipant>(
			"ValidatePatientContactParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {

			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PatientContactParticipantOperations.validatePatientContactParticipantTypeCode(
					(PatientContactParticipant) objectToTest, diagnostician, map);
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
