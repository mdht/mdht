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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ResultObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Result Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationReferenceRangeRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Reference Range Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationNoObservationRangeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation No Observation Range Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation#validateResultObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ResultObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationCodeValue() {
		OperationsTestCase<ResultObservation> validateResultObservationCodeValueTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationCodeValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationReferenceRangeRequired() {
		OperationsTestCase<ResultObservation> validateResultObservationReferenceRangeRequiredTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationReferenceRangeRequired",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_REFERENCE_RANGE_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationReferenceRangeRequired(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationReferenceRangeRequiredTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationNoObservationRangeCode() {
		OperationsTestCase<ResultObservation> validateResultObservationNoObservationRangeCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationNoObservationRangeCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_NO_OBSERVATION_RANGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationNoObservationRangeCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationNoObservationRangeCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationInformationSource() {
		OperationsTestCase<ResultObservation> validateResultObservationInformationSourceTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationInformationSource(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInformationSourceTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationTemplateId() {
		OperationsTestCase<ResultObservation> validateResultObservationTemplateIdTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationTemplateId(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationMoodCode() {
		OperationsTestCase<ResultObservation> validateResultObservationMoodCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationMoodCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationId() {
		OperationsTestCase<ResultObservation> validateResultObservationIdTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationId",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationId(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationEffectiveTime() {
		OperationsTestCase<ResultObservation> validateResultObservationEffectiveTimeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationEffectiveTime(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationStatusCode() {
		OperationsTestCase<ResultObservation> validateResultObservationStatusCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationStatusCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationCode() {
		OperationsTestCase<ResultObservation> validateResultObservationCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationMethodCode() {
		OperationsTestCase<ResultObservation> validateResultObservationMethodCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationMethodCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationInterpretationCode() {
		OperationsTestCase<ResultObservation> validateResultObservationInterpretationCodeTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationInterpretationCode",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationInterpretationCode(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationInterpretationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateResultObservationValue() {
		OperationsTestCase<ResultObservation> validateResultObservationValueTestCase = new OperationsTestCase<ResultObservation>(
			"validateResultObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RESULT_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ResultObservation target) {

			}

			@Override
			protected void updateToPass(ResultObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ResultObservationOperations.validateResultObservationValue(
					(ResultObservation) objectToTest, diagnostician, map);
			}

		};

		validateResultObservationValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ResultObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ResultObservation> {
		public ResultObservation create() {
			return CCDFactory.eINSTANCE.createResultObservation();
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
	private static class ConstructorTestClass extends ResultObservationOperations {
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

} // ResultObservationOperations
