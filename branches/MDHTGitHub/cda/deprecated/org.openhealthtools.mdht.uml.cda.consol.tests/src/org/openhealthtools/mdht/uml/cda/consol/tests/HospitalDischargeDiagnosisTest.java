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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#validateHospitalDischargeDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#validateHospitalDischargeDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#validateHospitalDischargeDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#validateHospitalDischargeDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#validateHospitalDischargeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosisTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisProblemObservation() {
		OperationsTestCase<HospitalDischargeDiagnosis> validateHospitalDischargeDiagnosisProblemObservationTestCase = new OperationsTestCase<HospitalDischargeDiagnosis>(
			"validateHospitalDischargeDiagnosisProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				er.setObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
				target.getEntryRelationships().add(er);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisOperations.validateHospitalDischargeDiagnosisProblemObservation(
					(HospitalDischargeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisTemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosis> validateHospitalDischargeDiagnosisTemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosis>(
			"validateHospitalDischargeDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisOperations.validateHospitalDischargeDiagnosisTemplateId(
					(HospitalDischargeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisClassCode() {
		OperationsTestCase<HospitalDischargeDiagnosis> validateHospitalDischargeDiagnosisClassCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosis>(
			"validateHospitalDischargeDiagnosisClassCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisOperations.validateHospitalDischargeDiagnosisClassCode(
					(HospitalDischargeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisMoodCode() {
		OperationsTestCase<HospitalDischargeDiagnosis> validateHospitalDischargeDiagnosisMoodCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosis>(
			"validateHospitalDischargeDiagnosisMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisOperations.validateHospitalDischargeDiagnosisMoodCode(
					(HospitalDischargeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisCode() {
		OperationsTestCase<HospitalDischargeDiagnosis> validateHospitalDischargeDiagnosisCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosis>(
			"validateHospitalDischargeDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosis target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisOperations.validateHospitalDischargeDiagnosisCode(
					(HospitalDischargeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		HospitalDischargeDiagnosis target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosis> {
		public HospitalDischargeDiagnosis create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosis();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosisOperations {
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

} // HospitalDischargeDiagnosisOperations
