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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdmissionMedicationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#validateAdmissionMedicationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdmissionMedication#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionMedicationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationTemplateId() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationTemplateIdTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationTemplateId(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationClassCode() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationClassCodeTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationClassCode(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationCodeP() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationCodePTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationCodeP(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationCode() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationCodeTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.init();

			}

			@Override
			protected void setDependency(AdmissionMedication target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.AdmissionMedicationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationCode(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationMoodCode() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationMoodCodeTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {

			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationMoodCode(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated  not
	*/
	@Test
	public void testValidateAdmissionMedicationMedicationActivity() {
		OperationsTestCase<AdmissionMedication> validateAdmissionMedicationMedicationActivityTestCase = new OperationsTestCase<AdmissionMedication>(
			"validateAdmissionMedicationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedication target) {
				target.init();
			}

			@Override
			protected void updateToPass(AdmissionMedication target) {
				target.addSubstanceAdministration(ConsolFactory.eINSTANCE.createMedicationActivity().init());
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationOperations.validateAdmissionMedicationMedicationActivity(
					(AdmissionMedication) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		AdmissionMedication target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionMedicationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionMedication> {
		public AdmissionMedication create() {
			return ConsolFactory.eINSTANCE.createAdmissionMedication();
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
	private static class ConstructorTestClass extends AdmissionMedicationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AdmissionMedicationOperations
