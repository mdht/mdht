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

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.NormalDose;

/**
 * This class is a JUnit4 test case.
 */
@SuppressWarnings("nls")
public class NormalDoseOperationsTest extends MedicationOperationsTest {
	
	public static class OperationsForOCL extends NormalDoseOperations {
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

	public class NormalDoseObjectFactory implements TestObjectFactory<NormalDose> {
		public NormalDose create() {
			return IHEFactory.eINSTANCE.createNormalDose();
		}
	}

	NormalDoseObjectFactory objectFactory = new NormalDoseObjectFactory();
	
	@Test
	public void testValidateNormalDoseNoSubordinateSubstanceAdministration() {
		OperationsTestCase<NormalDose> validateNormalDoseTemplateIdTestCase = new OperationsTestCase<NormalDose>("ValidateNormalDoseNoSubordinateSubstanceAdministration",
				operationsForOCL.getOCLValue("VALIDATE_NORMAL_DOSE_NO_SUBORDINATE_SUBSTANCE_ADMINISTRATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			@Override
			protected void updateToPass(NormalDose target) {
//				target.getSubstanceAdministrations().clear();
				target.getEntryRelationships().clear();
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return NormalDoseOperations.validateNormalDoseNoSubordinateSubstanceAdministration((NormalDose) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(NormalDose target) {
				target.init();
				SubstanceAdministration substanceAdministration = CDAFactory.eINSTANCE.createSubstanceAdministration();
				target.addSubstanceAdministration(substanceAdministration );
				
			}
		};

		validateNormalDoseTemplateIdTestCase.doValidationTest();

	}

	@Test
	public void testValidateNormalDoseTemplateId() {
		OperationsTestCase<NormalDose> validateNormalDoseTemplateIdTestCase = new OperationsTestCase<NormalDose>("ValidateNormalDoseTemplateId",
				operationsForOCL.getOCLValue("VALIDATE_NORMAL_DOSE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {
			@Override
			protected void updateToPass(NormalDose target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return NormalDoseOperations.validateNormalDoseTemplateId((NormalDose) objectToTest, diagnostician, map);
			}

			@Override
			protected void updateToFail(NormalDose target) {

			}
		};

		validateNormalDoseTemplateIdTestCase.doValidationTest();
	}
	

//	@SuppressWarnings("hiding")
//	protected static final String TEMPLATE_ID = "1.3.6.1.4.1.19376.1.5.3.1.4.7.1";
//
//	/**
//	 * Not a real test, needed for EMMA to report 100% method coverage.
//	 */
//	@SuppressWarnings("unused")
//	@Test
//	public void testConstructor() {
//		NormalDoseOperations obj = new NormalDoseOperations();
//		assertTrue(true);
//	} // testConstructor
//	
//	private static final CDATestCase TEST_CASE_ARRAY[] = {
//		// Template ID
//		// -------------------------------------------------------------
//		new TemplateIDValidationTest(TEMPLATE_ID) {
//
//			@Override
//			protected boolean validate(final EObject objectToTest,
//					final BasicDiagnostic diagnostician,
//					final Map<Object, Object> map) {
//				return NormalDoseOperations.validateNormalDoseTemplateId(
//						(NormalDose) objectToTest, diagnostician, map);
//			}
//
//		}
//
//	}; // TEST_CASE_ARRAY
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
//		return IHEFactory.eINSTANCE.createNormalDose();
//	}
//
//	@Override
//	protected EObject getObjectInitToTest() {
//		return IHEFactory.eINSTANCE.createNormalDose().init();
//	}

} // NormalDoseOperationsTest