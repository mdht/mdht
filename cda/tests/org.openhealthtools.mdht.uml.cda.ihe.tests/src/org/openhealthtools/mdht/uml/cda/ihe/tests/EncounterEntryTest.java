/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.EncounterEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry#validateEncounterEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry#validateEncounterEntryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Entry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry#validateEncounterEntryCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Entry Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry#validateEncounterEntryId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Entry Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.EncounterEntry#validateEncounterEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Entry Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterEntryTemplateId() {
		OperationsTestCase<EncounterEntry> validateEncounterEntryTemplateIdTestCase = new OperationsTestCase<EncounterEntry>(
			"validateEncounterEntryTemplateId",
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

		validateEncounterEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterEntryClassCode() {
		OperationsTestCase<EncounterEntry> validateEncounterEntryClassCodeTestCase = new OperationsTestCase<EncounterEntry>(
			"validateEncounterEntryClassCode",
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

		validateEncounterEntryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterEntryCode() {
		OperationsTestCase<EncounterEntry> validateEncounterEntryCodeTestCase = new OperationsTestCase<EncounterEntry>(
			"validateEncounterEntryCode",
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

		validateEncounterEntryCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterEntryId() {
		OperationsTestCase<EncounterEntry> validateEncounterEntryIdTestCase = new OperationsTestCase<EncounterEntry>(
			"validateEncounterEntryId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(EncounterEntry target) {
				II ii = DatatypesFactory.eINSTANCE.createII("root");
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterEntryOperations.validateEncounterEntryId(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		validateEncounterEntryIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateEncounterEntryText() {
		OperationsTestCase<EncounterEntry> validateEncounterEntryTextTestCase = new OperationsTestCase<EncounterEntry>(
			"validateEncounterEntryText",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncounterEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(EncounterEntry target) {

				ED ed = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(ed);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterEntryOperations.validateEncounterEntryText(
					(EncounterEntry) objectToTest, diagnostician, map);
			}

		};

		validateEncounterEntryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncounterEntryOperations {
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

	/**
	*
	* @generated NOT
	*/
	private static class ObjectFactory implements TestObjectFactory<EncounterEntry> {

		public EncounterEntry create() {
			return IHEFactory.eINSTANCE.createEncounterPlanOfCare();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends EncounterEntryOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // EncounterEntryOperations
