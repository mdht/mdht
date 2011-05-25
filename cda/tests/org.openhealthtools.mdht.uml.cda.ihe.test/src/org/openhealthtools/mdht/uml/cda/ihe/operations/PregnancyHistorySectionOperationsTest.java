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
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * @author eclipse
 *
 */
public class PregnancyHistorySectionOperationsTest extends CDAValidationTest {

	public static class OperationsForOCL extends PregnancyHistorySectionOperations {
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

	public class ObjectFactory implements TestObjectFactory<PregnancyHistorySection> {
		public PregnancyHistorySection create() {
			return IHEFactory.eINSTANCE.createPregnancyHistorySection();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	@Test
	public void testValidatePregnancyHistorySectionTemplateId() {
		OperationsTestCase<PregnancyHistorySection> testCase = new OperationsTestCase<PregnancyHistorySection>(
			"ValidatePregnancyHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionTemplateId(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PregnancyHistorySectionOperations#validatePregnancyHistorySectionCode(org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePregnancyHistorySectionCode() {
		OperationsTestCase<PregnancyHistorySection> testCase = new OperationsTestCase<PregnancyHistorySection>(
			"ValidatePregnancyHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionCode(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PregnancyHistorySectionOperations#validatePregnancyHistorySectionPregnancyObservation(org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidatePregnancyHistorySectionPregnancyObservation() {
		OperationsTestCase<PregnancyHistorySection> testCase = new OperationsTestCase<PregnancyHistorySection>(
			"ValidatePregnancyHistorySectionPregnancyObservation",
			operationsForOCL.getOCLValue("VALIDATE_PREGNANCY_HISTORY_SECTION_PREGNANCY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PregnancyHistorySection target) {

			}

			@Override
			protected void updateToPass(PregnancyHistorySection target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return PregnancyHistorySectionOperations.validatePregnancyHistorySectionPregnancyObservation(
					(PregnancyHistorySection) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.PregnancyHistorySectionOperations#getPregnancyObservations(org.openhealthtools.mdht.uml.cda.ihe.PregnancyHistorySection)}.
	 */
	@Test
	public void testGetPregnancyObservations() {

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
