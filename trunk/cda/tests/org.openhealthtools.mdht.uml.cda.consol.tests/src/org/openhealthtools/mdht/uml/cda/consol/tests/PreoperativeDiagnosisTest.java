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
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.operations.PreoperativeDiagnosisOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Preoperative Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#validatePreoperativeDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#validatePreoperativeDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#validatePreoperativeDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#validatePreoperativeDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#validatePreoperativeDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Preoperative Diagnosis Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PreoperativeDiagnosisTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisTemplateId() {
		OperationsTestCase<PreoperativeDiagnosis> validatePreoperativeDiagnosisTemplateIdTestCase = new OperationsTestCase<PreoperativeDiagnosis>(
			"validatePreoperativeDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisOperations.validatePreoperativeDiagnosisTemplateId(
					(PreoperativeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisClassCode() {
		OperationsTestCase<PreoperativeDiagnosis> validatePreoperativeDiagnosisClassCodeTestCase = new OperationsTestCase<PreoperativeDiagnosis>(
			"validatePreoperativeDiagnosisClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisOperations.validatePreoperativeDiagnosisClassCode(
					(PreoperativeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreoperativeDiagnosisCode() {
		OperationsTestCase<PreoperativeDiagnosis> validatePreoperativeDiagnosisCodeTestCase = new OperationsTestCase<PreoperativeDiagnosis>(
			"validatePreoperativeDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("10219-4", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisOperations.validatePreoperativeDiagnosisCode(
					(PreoperativeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePreoperativeDiagnosisMoodCode() {
		OperationsTestCase<PreoperativeDiagnosis> validatePreoperativeDiagnosisMoodCodeTestCase = new OperationsTestCase<PreoperativeDiagnosis>(
			"validatePreoperativeDiagnosisMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis target) {

			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisOperations.validatePreoperativeDiagnosisMoodCode(
					(PreoperativeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePreoperativeDiagnosisProblemObservation() {
		OperationsTestCase<PreoperativeDiagnosis> validatePreoperativeDiagnosisProblemObservationTestCase = new OperationsTestCase<PreoperativeDiagnosis>(
			"validatePreoperativeDiagnosisProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_PREOPERATIVE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PreoperativeDiagnosis target) {
				target.init();
			}

			@Override
			protected void updateToPass(PreoperativeDiagnosis target) {
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PreoperativeDiagnosisOperations.validatePreoperativeDiagnosisProblemObservation(
					(PreoperativeDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePreoperativeDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		PreoperativeDiagnosis target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PreoperativeDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PreoperativeDiagnosis> {
		public PreoperativeDiagnosis create() {
			return ConsolFactory.eINSTANCE.createPreoperativeDiagnosis();
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
	private static class ConstructorTestClass extends PreoperativeDiagnosisOperations {
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

} // PreoperativeDiagnosisOperations
