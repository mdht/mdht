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
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.TaperedDose;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class TaperedDoseOperationsTest extends MedicationOperationsTest {

	public static class OperationsForOCL extends TaperedDoseOperations {
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

	public class ObjectFactory implements TestObjectFactory<TaperedDose> {
		public TaperedDose create() {
			return IHEFactory.eINSTANCE.createTaperedDose();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidateTaperedDoseTaperedDosingSubstanceAdministration() {
		OperationsTestCase<TaperedDose> testCase = new OperationsTestCase<TaperedDose>(
			"validateTaperedDoseTaperedDosingSubstanceAdministration",
			operationsForOCL.getOCLValue("VALIDATE_TAPERED_DOSE_TAPERED_DOSING_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TaperedDose target) {
				target.init();

			}

			@Override
			protected void updateToPass(TaperedDose target) {
				SubstanceAdministration substanceAdministration = IHEFactory.eINSTANCE.createNormalDose().init(); // CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(substanceAdministration);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return TaperedDoseOperations.validateTaperedDoseTaperedDosingSubstanceAdministration(
					(TaperedDose) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateTaperedDoseTemplateId() {
		OperationsTestCase<TaperedDose> testCase = new OperationsTestCase<TaperedDose>(
			"ValidateTaperedDoseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TAPERED_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TaperedDose target) {

			}

			@Override
			protected void updateToPass(TaperedDose target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return TaperedDoseOperations.validateTaperedDoseTemplateId(
					(TaperedDose) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

}
