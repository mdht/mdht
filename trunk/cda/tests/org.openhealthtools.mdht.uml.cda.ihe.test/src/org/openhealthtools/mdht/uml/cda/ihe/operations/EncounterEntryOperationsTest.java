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

import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.operations.EncounterOperationsTest;

/**
 * This class is a JUnit test case.
 */
@SuppressWarnings("nls")
public class EncounterEntryOperationsTest extends EncounterOperationsTest {

	public static class OperationsForOCL extends EncounterEntryOperations {
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

	public class ObjectFactory implements TestObjectFactory<EncounterEntry> {
		public EncounterEntry create() {
			return IHEFactory.eINSTANCE.createEncounterActivity().init();
		}
	}

	ObjectFactory objectFactory = new ObjectFactory();

	/**
	 * Not a real test, needed for EMMA to report 100% method coverage.
	 */
	@Override
	@SuppressWarnings("unused")
	@Test
	public void testConstructor() {
		EncounterEntryOperations obj = new EncounterEntryOperations();
		assertTrue(true);
	} // testConstructor

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations#validateEncounterEntryTemplateId(org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateEncounterEntryTemplateId() {
		OperationsTestCase<EncounterEntry> testCase = new OperationsTestCase<EncounterEntry>(
			"ValidateEncounterEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {

			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterEntryOperations.validateEncounterEntryTemplateId(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations#validateEncounterEntryClassCode(org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateEncounterEntryClassCode() {
		OperationsTestCase<EncounterEntry> testCase = new OperationsTestCase<EncounterEntry>(
			"ValidateEncounterEntryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {

			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterEntryOperations.validateEncounterEntryClassCode(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations#validateEncounterEntryCode(org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateEncounterEntryCode() {
		OperationsTestCase<EncounterEntry> testCase = new OperationsTestCase<EncounterEntry>(
			"ValidateEncounterEntryCode",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {

			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterEntryOperations.validateEncounterEntryCode(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations#validateEncounterEntryId(org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateEncounterEntryId() {
		OperationsTestCase<EncounterEntry> testCase = new OperationsTestCase<EncounterEntry>(
			"ValidateEncounterEntryId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {

			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterEntryOperations.validateEncounterEntryId(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

	/**
	 * Test method for {@link org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations#validateEncounterEntryText(org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)}.
	 */
	@Test
	public void testValidateEncounterEntryText() {
		OperationsTestCase<EncounterEntry> testCase = new OperationsTestCase<EncounterEntry>(
			"ValidateEncounterEntryText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {

			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
				return EncounterEntryOperations.validateEncounterEntryText(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		testCase.doValidationTest();
	}

} // EncounterEntryOperationsTest
