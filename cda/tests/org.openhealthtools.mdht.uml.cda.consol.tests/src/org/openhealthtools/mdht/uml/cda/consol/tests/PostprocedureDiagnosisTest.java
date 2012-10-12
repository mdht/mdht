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
import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.consol.operations.PostprocedureDiagnosisOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Postprocedure Diagnosis</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#validatePostprocedureDiagnosisProblemObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Postprocedure Diagnosis Problem Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis#getProblemObservations() <em>Get Problem Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PostprocedureDiagnosisTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisTemplateId() {
		OperationsTestCase<PostprocedureDiagnosis> validatePostprocedureDiagnosisTemplateIdTestCase = new OperationsTestCase<PostprocedureDiagnosis>(
			"validatePostprocedureDiagnosisTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisOperations.validatePostprocedureDiagnosisTemplateId(
					(PostprocedureDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisClassCode() {
		OperationsTestCase<PostprocedureDiagnosis> validatePostprocedureDiagnosisClassCodeTestCase = new OperationsTestCase<PostprocedureDiagnosis>(
			"validatePostprocedureDiagnosisClassCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisOperations.validatePostprocedureDiagnosisClassCode(
					(PostprocedureDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePostprocedureDiagnosisCode() {
		OperationsTestCase<PostprocedureDiagnosis> validatePostprocedureDiagnosisCodeTestCase = new OperationsTestCase<PostprocedureDiagnosis>(
			"validatePostprocedureDiagnosisCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCE("59769-0", "2.16.840.1.113883.6.1"));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisOperations.validatePostprocedureDiagnosisCode(
					(PostprocedureDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePostprocedureDiagnosisMoodCode() {
		OperationsTestCase<PostprocedureDiagnosis> validatePostprocedureDiagnosisMoodCodeTestCase = new OperationsTestCase<PostprocedureDiagnosis>(
			"validatePostprocedureDiagnosisMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisOperations.validatePostprocedureDiagnosisMoodCode(
					(PostprocedureDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePostprocedureDiagnosisProblemObservation() {
		OperationsTestCase<PostprocedureDiagnosis> validatePostprocedureDiagnosisProblemObservationTestCase = new OperationsTestCase<PostprocedureDiagnosis>(
			"validatePostprocedureDiagnosisProblemObservation",
			operationsForOCL.getOCLValue("VALIDATE_POSTPROCEDURE_DIAGNOSIS_PROBLEM_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PostprocedureDiagnosis target) {

			}

			@Override
			protected void updateToPass(PostprocedureDiagnosis target) {
				target.init();
				target.addObservation(ConsolFactory.eINSTANCE.createProblemObservation().init());
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PostprocedureDiagnosisOperations.validatePostprocedureDiagnosisProblemObservation(
					(PostprocedureDiagnosis) objectToTest, diagnostician, map);
			}

		};

		validatePostprocedureDiagnosisProblemObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProblemObservations() {

		PostprocedureDiagnosis target = objectFactory.create();
		target.getProblemObservations();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PostprocedureDiagnosisOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PostprocedureDiagnosis> {
		public PostprocedureDiagnosis create() {
			return ConsolFactory.eINSTANCE.createPostprocedureDiagnosis();
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
	private static class ConstructorTestClass extends PostprocedureDiagnosisOperations {
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

} // PostprocedureDiagnosisOperations
