/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReasonProcedureNotAttemptedObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason Procedure Not Attempted Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonProcedureNotAttemptedObservation#validateReasonProcedureNotAttemptedObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason Procedure Not Attempted Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonProcedureNotAttemptedObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonProcedureNotAttemptedObservationTemplateId() {
		OperationsTestCase<ReasonProcedureNotAttemptedObservation> validateReasonProcedureNotAttemptedObservationTemplateIdTestCase = new OperationsTestCase<ReasonProcedureNotAttemptedObservation>(
			"validateReasonProcedureNotAttemptedObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonProcedureNotAttemptedObservation target) {

			}

			@Override
			protected void updateToPass(ReasonProcedureNotAttemptedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationTemplateId(
					(ReasonProcedureNotAttemptedObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonProcedureNotAttemptedObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonProcedureNotAttemptedObservationMoodCode() {
		OperationsTestCase<ReasonProcedureNotAttemptedObservation> validateReasonProcedureNotAttemptedObservationMoodCodeTestCase = new OperationsTestCase<ReasonProcedureNotAttemptedObservation>(
			"validateReasonProcedureNotAttemptedObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonProcedureNotAttemptedObservation target) {

			}

			@Override
			protected void updateToPass(ReasonProcedureNotAttemptedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationMoodCode(
					(ReasonProcedureNotAttemptedObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonProcedureNotAttemptedObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonProcedureNotAttemptedObservationCode() {
		OperationsTestCase<ReasonProcedureNotAttemptedObservation> validateReasonProcedureNotAttemptedObservationCodeTestCase = new OperationsTestCase<ReasonProcedureNotAttemptedObservation>(
			"validateReasonProcedureNotAttemptedObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonProcedureNotAttemptedObservation target) {

			}

			@Override
			protected void updateToPass(ReasonProcedureNotAttemptedObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationCode(
					(ReasonProcedureNotAttemptedObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonProcedureNotAttemptedObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonProcedureNotAttemptedObservationValue() {
		OperationsTestCase<ReasonProcedureNotAttemptedObservation> validateReasonProcedureNotAttemptedObservationValueTestCase = new OperationsTestCase<ReasonProcedureNotAttemptedObservation>(
			"validateReasonProcedureNotAttemptedObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonProcedureNotAttemptedObservation target) {

			}

			@Override
			protected void updateToPass(ReasonProcedureNotAttemptedObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationValue(
					(ReasonProcedureNotAttemptedObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonProcedureNotAttemptedObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonProcedureNotAttemptedObservationValueP() {
		OperationsTestCase<ReasonProcedureNotAttemptedObservation> validateReasonProcedureNotAttemptedObservationValuePTestCase = new OperationsTestCase<ReasonProcedureNotAttemptedObservation>(
			"validateReasonProcedureNotAttemptedObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_PROCEDURE_NOT_ATTEMPTED_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonProcedureNotAttemptedObservation target) {

			}

			@Override
			protected void updateToPass(ReasonProcedureNotAttemptedObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonProcedureNotAttemptedObservationOperations.validateReasonProcedureNotAttemptedObservationValueP(
					(ReasonProcedureNotAttemptedObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonProcedureNotAttemptedObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonProcedureNotAttemptedObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonProcedureNotAttemptedObservation> {
		public ReasonProcedureNotAttemptedObservation create() {
			return EmspcrFactory.eINSTANCE.createReasonProcedureNotAttemptedObservation();
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
	private static class ConstructorTestClass extends ReasonProcedureNotAttemptedObservationOperations {
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

} // ReasonProcedureNotAttemptedObservationOperations
