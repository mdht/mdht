/*******************************************************************************
 * Copyright (c) 2011 Sean Muir, JKM Software, LLC
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sean Muir, JKM Software, LLC - initial API and implementation
 *     
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.operations.SupplyActivityOperationsTest;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_INT;
import org.openhealthtools.mdht.uml.hl7.datatypes.PQ;

/**
 * @author eclipse
 *
 */
public class SupplyEntryOperationsTest extends SupplyActivityOperationsTest {

	public static class OperationsForOCL extends SupplyEntryOperations {
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

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		SupplyEntryOperations obj = new SupplyEntryOperations();
		assertTrue(true);
	} // testConstructor

	public class SupplyEntryObjectFactory implements TestObjectFactory<SupplyEntry> {
		public SupplyEntry create() {
			return IHEFactory.eINSTANCE.createSupplyEntry();
		}
	}

	SupplyEntryObjectFactory SupplyEntryObjectFactory = new SupplyEntryObjectFactory();

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations#validateSupplyEntryTemplateId(org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateSupplyEntryTemplateId() {
		OperationsTestCase<SupplyEntry> testValidateSupplyEntryTemplateIdTestCase = new OperationsTestCase<SupplyEntry>(
			"validateSupplyEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			SupplyEntryObjectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {

			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SupplyEntryOperations.validateSupplyEntryTemplateId(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		testValidateSupplyEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations#validateSupplyEntryQuantity(org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateSupplyEntryQuantity() {
		OperationsTestCase<SupplyEntry> testValidateSupplyEntryTemplateIdTestCase = new OperationsTestCase<SupplyEntry>(
			"ValidateSupplyEntryQuantity",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_QUANTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			SupplyEntryObjectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {
				PQ pq = DatatypesFactory.eINSTANCE.createPQ();
				target.setQuantity(pq);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SupplyEntryOperations.validateSupplyEntryQuantity((SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		testValidateSupplyEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations#validateSupplyEntryRepeatNumber(org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateSupplyEntryRepeatNumber() {
		OperationsTestCase<SupplyEntry> testValidateSupplyEntryTemplateIdTestCase = new OperationsTestCase<SupplyEntry>(
			"ValidateSupplyEntryRepeatNumber",
			operationsForOCL.getOCLValue("VALIDATE_SUPPLY_ENTRY_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			SupplyEntryObjectFactory) {

			@Override
			protected void updateToFail(SupplyEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(SupplyEntry target) {

				IVL_INT value = DatatypesFactory.eINSTANCE.createIVL_INT();
				target.setRepeatNumber(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return SupplyEntryOperations.validateSupplyEntryRepeatNumber(
					(SupplyEntry) objectToTest, diagnostician, map);
			}

		};

		testValidateSupplyEntryTemplateIdTestCase.doValidationTest();

	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.SupplyEntryOperations#getMedicationFullfillmentInstructions(org.openhealthtools.mdht.uml.cda.ihe.SupplyEntry)}.
	 */
	@Test
	public void testGetMedicationFullfillmentInstructions() {
		SupplyEntry target = IHEFactory.eINSTANCE.createSupplyEntry().init();

		MedicationFullfillmentInstructions mfi = IHEFactory.eINSTANCE.createMedicationFullfillmentInstructions().init();

		target.addAct(mfi);

		MedicationFullfillmentInstructions result = SupplyEntryOperations.getMedicationFullfillmentInstructions(target);

		org.junit.Assert.assertNotNull(result);

	}

}
