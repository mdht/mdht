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

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentEncounterMood;

/**
 * This class
 */
@SuppressWarnings("nls")
public class EncounterPlanOfCareOperationsTest extends
		EncounterEntryOperationsTest {
	
	
	public static class OperationsForOCL extends EncounterPlanOfCareOperations {
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
	
	public class ObjectFactory implements TestObjectFactory<EncounterPlanOfCare> {
		public EncounterPlanOfCare create() {
			return IHEFactory.eINSTANCE.createEncounterPlanOfCare();
		}
	}
	
	ObjectFactory objectFactory = new ObjectFactory();
	

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public final void testConstructor() {
		EncounterPlanOfCareOperations obj = new EncounterPlanOfCareOperations();
		assertTrue(true);
	} // testConstructor
	
	
	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterPlanOfCareOperations#validatePlanOfCareActivityEncounterTemplateId(org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidatePlanOfCareActivityEncounterTemplateId() {
		OperationsTestCase<EncounterPlanOfCare> testCase = new OperationsTestCase<EncounterPlanOfCare>(
				"validateEncounterPlanOfCareTemplateId", operationsForOCL.getOCLValue("VALIDATE_EncounterPlanOfCare_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(EncounterPlanOfCare target) {

			}

			@Override
			protected void updateToPass(EncounterPlanOfCare target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterPlanOfCareOperations.validatePlanOfCareActivityEncounterTemplateId((EncounterPlanOfCare) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for
	 * {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterPlanOfCareOperations#validateEncounterPlanOfCareMoodCodeValue(org.openhealthtools.mdht.uml.cda.ihe.EncounterPlanOfCare, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}
	 * .
	 */
	@Test
	public void testValidateEncounterPlanOfCareMoodCodeValue() {
		OperationsTestCase<EncounterPlanOfCare> testCase = new OperationsTestCase<EncounterPlanOfCare>(
				"validateEncounterPlanOfCareTemplateId", operationsForOCL.getOCLValue("VALIDATE_EncounterPlanOfCare_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),objectFactory) {

			@Override
			protected void updateToFail(EncounterPlanOfCare target) {
				target.init();
				target.setMoodCode(x_DocumentEncounterMood.EVN);

			}

			@Override
			protected void updateToPass(EncounterPlanOfCare target) {
				
				target.setMoodCode(x_DocumentEncounterMood.ARQ);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterPlanOfCareOperations.validateEncounterPlanOfCareMoodCodeValue((EncounterPlanOfCare) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // EncounterPlanOfCareOperationsTest