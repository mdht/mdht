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

import static org.junit.Assert.fail;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.MedicationActivityOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Immunization;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * This class is a JUnit 4 test case.
 */
@SuppressWarnings("nls")
public class ImmunizationOperationsTest extends
		MedicationActivityOperationsTest {

//	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.12";
//
//	/**
//	 * Not a real test, needed for EMMA to report 100% method coverage.
//	 */
//	@SuppressWarnings("unused")
//	@Test
//	public void testConstructor() {
//		ImmunizationOperations obj = new ImmunizationOperations();
//		assertTrue(true);
//	} // testConstructor
//	
//	private static final CDATestCase TEST_CASE_ARRAY[] = {
//	// Template ID
//	// -------------------------------------------------------------
//	new TemplateIDValidationTest(TEMPLATE_ID) {
//
//		@Override
//		protected boolean validate(final EObject objectToTest,
//				final BasicDiagnostic diagnostician,
//				final Map<Object, Object> map) {
//			return ImmunizationOperations.validateImmunizationTemplateId(
//					(Immunization) objectToTest, diagnostician, map);
//		}
//	} }; // TEST_CASE_ARRAY
//
//	@Override
//	protected List<CDATestCase> getTestCases() {
//		// Return a new List because the one returned by Arrays.asList is
//		// unmodifiable so a sub-class can't append their test cases.
//		final List<CDATestCase> retValue = super.getTestCases();
//		retValue.addAll(Arrays.asList(TEST_CASE_ARRAY));
//		return retValue;
//	}
//
//	@Override
//	protected EObject getObjectToTest() {
//		return IHEFactory.eINSTANCE.createImmunization();
//	}
//
//	@Override
//	protected EObject getObjectInitToTest() {
//		return IHEFactory.eINSTANCE.createImmunization().init();
//	}
	
	
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
				"ValidateImmunizationTemplateId", operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();				

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationTemplateId((Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationCode() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
				"ValidateImmunizationCode", operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

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
				"ValidateImmunizationStatusCode", operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

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
				return ImmunizationOperations.validateImmunizationStatusCode((Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	@Test
	public void testValidateImmunizationMoodCode() {
		OperationsTestCase<Immunization> testCase = new OperationsTestCase<Immunization>(
				"ValidateImmunizationMoodCode", operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(Immunization target) {

			}

			@Override
			protected void updateToPass(Immunization target) {
				target.init();				

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return ImmunizationOperations.validateImmunizationMoodCode((Immunization) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // ImmunizationOperationsTest