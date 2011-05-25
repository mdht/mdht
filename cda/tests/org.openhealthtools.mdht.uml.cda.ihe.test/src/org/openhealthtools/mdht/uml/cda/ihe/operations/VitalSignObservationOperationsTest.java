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
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class VitalSignObservationOperationsTest extends ResultObservationOperationsTest {

	public static class OperationsForOCL extends VitalSignObservationOperations {
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

	public class ObjectFactory implements TestObjectFactory<VitalSignObservation> {
		public VitalSignObservation create() {
			return IHEFactory.eINSTANCE.createVitalSignObservation();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations#validateVitalSignObservationTemplateId(org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateVitalSignObservationTemplateId() {
		OperationsTestCase<VitalSignObservation> testCase = new OperationsTestCase<VitalSignObservation>(
			"ValidateVitalSignObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignObservationOperations.validateVitalSignObservationTemplateId(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations#validateVitalSignObservationValue(org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateVitalSignObservationValue() {
		OperationsTestCase<VitalSignObservation> testCase = new OperationsTestCase<VitalSignObservation>(
			"ValidateVitalSignObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignObservationOperations.validateVitalSignObservationValue(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations#validateVitalSignObservationInterpretationCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateVitalSignObservationInterpretationCode() {
		OperationsTestCase<VitalSignObservation> testCase = new OperationsTestCase<VitalSignObservation>(
			"ValidateVitalSignObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignObservationOperations.validateVitalSignObservationInterpretationCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations#validateVitalSignObservationMethodCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateVitalSignObservationMethodCode() {
		OperationsTestCase<VitalSignObservation> testCase = new OperationsTestCase<VitalSignObservation>(
			"ValidateVitalSignObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignObservationOperations.validateVitalSignObservationMethodCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.VitalSignObservationOperations#validateVitalSignObservationTargetSiteCode(org.openhealthtools.mdht.uml.cda.ihe.VitalSignObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateVitalSignObservationTargetSiteCode() {
		OperationsTestCase<VitalSignObservation> testCase = new OperationsTestCase<VitalSignObservation>(
			"ValidateVitalSignObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_VITAL_SIGN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VitalSignObservation target) {

			}

			@Override
			protected void updateToPass(VitalSignObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return VitalSignObservationOperations.validateVitalSignObservationTargetSiteCode(
					(VitalSignObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // VitalSignObservationOperationsTest
