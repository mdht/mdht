/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;

import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.AdvanceDirectiveObservation#validateAdvanceDirectiveObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationTemplateId(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationTemplateIdTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationClassCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationClassCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationClassCode(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationClassCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationMoodCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationMoodCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationMoodCode(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationId() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationId",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationId(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationStatusCode() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationStatusCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationStatusCode(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationStatusCodeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateAdvanceDirectiveObservationEffectiveTime() {
		OperationsTestCase<AdvanceDirectiveObservation> validateAdvanceDirectiveObservationEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation>(
				"validateAdvanceDirectiveObservationEffectiveTime",
				operationsForOCL
						.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations
						.validateAdvanceDirectiveObservationEffectiveTime(
								(AdvanceDirectiveObservation) objectToTest,
								diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationEffectiveTimeTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			AdvanceDirectiveObservationOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<AdvanceDirectiveObservation> {
		public AdvanceDirectiveObservation create() {
			return CCDFactory.eINSTANCE.createAdvanceDirectiveObservation();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AdvanceDirectiveObservationOperations