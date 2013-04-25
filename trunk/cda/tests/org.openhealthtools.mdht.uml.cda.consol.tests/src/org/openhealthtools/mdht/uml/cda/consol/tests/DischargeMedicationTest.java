/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.DischargeMedication;
import org.openhealthtools.mdht.uml.cda.consol.operations.DischargeMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#validateDischargeMedicationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#validateDischargeMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#validateDischargeMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#validateDischargeMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#validateDischargeMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DischargeMedication#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateDischargeMedicationMedicationActivity() {
		OperationsTestCase<DischargeMedication> validateDischargeMedicationMedicationActivityTestCase = new OperationsTestCase<DischargeMedication>(
			"validateDischargeMedicationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication target) {

			}

			@Override
			protected void updateToPass(DischargeMedication target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationOperations.validateDischargeMedicationMedicationActivity(
					(DischargeMedication) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationTemplateId() {
		OperationsTestCase<DischargeMedication> validateDischargeMedicationTemplateIdTestCase = new OperationsTestCase<DischargeMedication>(
			"validateDischargeMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication target) {

			}

			@Override
			protected void updateToPass(DischargeMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationOperations.validateDischargeMedicationTemplateId(
					(DischargeMedication) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationClassCode() {
		OperationsTestCase<DischargeMedication> validateDischargeMedicationClassCodeTestCase = new OperationsTestCase<DischargeMedication>(
			"validateDischargeMedicationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication target) {

			}

			@Override
			protected void updateToPass(DischargeMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationOperations.validateDischargeMedicationClassCode(
					(DischargeMedication) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationMoodCode() {
		OperationsTestCase<DischargeMedication> validateDischargeMedicationMoodCodeTestCase = new OperationsTestCase<DischargeMedication>(
			"validateDischargeMedicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication target) {

			}

			@Override
			protected void updateToPass(DischargeMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationOperations.validateDischargeMedicationMoodCode(
					(DischargeMedication) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeMedicationCode() {
		OperationsTestCase<DischargeMedication> validateDischargeMedicationCodeTestCase = new OperationsTestCase<DischargeMedication>(
			"validateDischargeMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeMedication target) {

			}

			@Override
			protected void updateToPass(DischargeMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeMedicationOperations.validateDischargeMedicationCode(
					(DischargeMedication) objectToTest, diagnostician, map);
			}

		};

		validateDischargeMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		DischargeMedication target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeMedicationOperations {
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
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<DischargeMedication> {
		public DischargeMedication create() {
			return ConsolFactory.eINSTANCE.createDischargeMedication();
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
	private static class ConstructorTestClass extends DischargeMedicationOperations {
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

} // DischargeMedicationOperations
