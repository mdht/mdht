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
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;

public class PregnancyObservationOperationsTest extends SimpleObservationOperationsTest {

	public static class OperationsForOCL extends PregnancyObservationOperations {
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

	public class ObjectFactory implements TestObjectFactory<PregnancyObservation> {
		public PregnancyObservation create() {
			return IHEFactory.eINSTANCE.createPregnancyObservation();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidatePregnancyObservationCode() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationInterpretationCode() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getInterpretationCodes().add(ce);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationInterpretationCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationMethodCode() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CE ce = DatatypesFactory.eINSTANCE.createCE();
				target.getMethodCodes().add(ce);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationMethodCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationRepeatNumber() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				IVL_INT rn = DatatypesFactory.eINSTANCE.createIVL_INT();
				;
				target.setRepeatNumber(rn);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationRepeatNumber(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationTargetSiteCode() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.getTargetSiteCodes().add(cd);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationTargetSiteCode(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationValue() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected void updateToPass(PregnancyObservation target) {

				ANY e = DatatypesFactory.eINSTANCE.createCE();
				target.getValues().add(e);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validatePregnancyObservationValue(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidatePregnancyObservationTemplateId() {
		OperationsTestCase<PregnancyObservation> testCase = new OperationsTestCase<PregnancyObservation>(
			"ValidatePregnancyObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyObservation target) {

			}

			@Override
			protected void updateToPass(PregnancyObservation target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyObservationOperations.validateSimpleObservationTemplateId(
					(PregnancyObservation) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

}
