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
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.Comment;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Immunization;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ImmunizationOperationsTest extends MedicationActivityOperationsTest {

	public static class OperationsForOCL extends ImmunizationOperations {
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

	public class ObjectFactory implements TestObjectFactory<Immunization> {
		public Immunization create() {
			return IHEFactory.eINSTANCE.createImmunization();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateImmunizationTemplateId() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationTemplateId(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationCode() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationCode((Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationStatusCode() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();
				target.setStatusCode(DatatypesFactory.eINSTANCE.createCS("completed"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationStatusCode(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationMoodCode() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationMoodCode(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationEffectiveTime() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {
				target.init();
			}

			@Override
			protected void updateToPass(Immunization target) {
				SXCM_TS et = DatatypesFactory.eINSTANCE.createSXCM_TS();
				target.getEffectiveTimes().add(et);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationEffectiveTime(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationComments() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
			"ValidateImmunizationComments",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_COMMENTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {
				target.init();
				target.setNegationInd(true);

			}

			@Override
			protected void updateToPass(Immunization target) {
				Comment comment = CCDFactory.eINSTANCE.createComment().init();
				target.addAct(comment);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationComments(
					(Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // ImmunizationOperationsTest
