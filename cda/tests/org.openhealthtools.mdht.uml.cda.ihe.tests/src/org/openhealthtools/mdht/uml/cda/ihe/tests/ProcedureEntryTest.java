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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.InternalReference;
import org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry;
import org.openhealthtools.mdht.uml.cda.ihe.operations.ProcedureEntryOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;
import org.openhealthtools.mdht.uml.hl7.vocab.x_DocumentProcedureMood;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Entry</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryHasInversionIndForEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Has Inversion Ind For Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryInternalReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#validateProcedureEntryInternalReferenceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Entry Internal Reference Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#getInternalReference() <em>Get Internal Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.ProcedureEntry#getInternalReferenceReasons() <em>Get Internal Reference Reasons</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureEntryTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryMoodCode() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryMoodCodeTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryMoodCode(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryHasTextReference() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryHasTextReferenceTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.init();
				ED ed = DatatypesFactory.eINSTANCE.createED();
				ed.setReference(DatatypesFactory.eINSTANCE.createTEL());
				target.setText(ed);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryHasTextReference(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureEntryPriorityCode() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryPriorityCodeTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {
				target.init();
				target.setMoodCode(x_DocumentProcedureMood.INT);
				target.setEffectiveTime(DatatypesFactory.eINSTANCE.createIVL_TS("12345"));
				// target.setPriorityCode(DatatypesFactory.eINSTANCE.createCE("CODE", "SYSTEM"));

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryPriorityCode(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureEntryHasInversionIndForEncounter() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryHasInversionIndForEncounterTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryHasInversionIndForEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_HAS_INVERSION_IND_FOR_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setInversionInd(false);

				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(ProcedureEntry target) {

				target.getEntryRelationships().clear();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);
				er.setInversionInd(true);

				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryHasInversionIndForEncounter(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryHasInversionIndForEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryTemplateId() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryTemplateIdTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryTemplateId(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryClassCode() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryClassCodeTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryClassCode(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryText() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryTextTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryText",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryText(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureEntryApproachSiteCode() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryApproachSiteCodeTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				target.getApproachSiteCodes().add(DatatypesFactory.eINSTANCE.createCD());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryApproachSiteCode(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureEntryInternalReference() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryInternalReferenceTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryInternalReference",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {
				target.init();
			}

			@Override
			protected void updateToPass(ProcedureEntry target) {
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				InternalReference ir = IHEFactory.eINSTANCE.createInternalReference().init();
				er.setAct(ir);
				er.setTypeCode(x_ActRelationshipEntryRelationship.COMP);

				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryInternalReference(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryInternalReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateProcedureEntryInternalReferenceReason() {
		OperationsTestCase<ProcedureEntry> validateProcedureEntryInternalReferenceReasonTestCase = new OperationsTestCase<ProcedureEntry>(
			"validateProcedureEntryInternalReferenceReason",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ENTRY_INTERNAL_REFERENCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureEntry target) {
				target.init();

			}

			@Override
			protected void updateToPass(ProcedureEntry target) {

				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				InternalReference ir = IHEFactory.eINSTANCE.createInternalReference().init();
				er.setAct(ir);

				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureEntryOperations.validateProcedureEntryInternalReferenceReason(
					(ProcedureEntry) objectToTest, diagnostician, map);
			}

		};

		validateProcedureEntryInternalReferenceReasonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReference() {

		ProcedureEntry target = objectFactory.create();
		target.getInternalReference();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInternalReferenceReasons() {

		ProcedureEntry target = objectFactory.create();
		target.getInternalReferenceReasons();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureEntryOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureEntry> {
		public ProcedureEntry create() {
			return IHEFactory.eINSTANCE.createProcedureEntryProcedureActivityProcedure();
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
	private static class ConstructorTestClass extends ProcedureEntryOperations {
	}

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

} // ProcedureEntryOperations
