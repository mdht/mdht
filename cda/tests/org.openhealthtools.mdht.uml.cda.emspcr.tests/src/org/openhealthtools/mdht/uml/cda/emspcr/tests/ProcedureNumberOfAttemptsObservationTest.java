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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureNumberOfAttemptsObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Number Of Attempts Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureNumberOfAttemptsObservation#validateProcedureNumberOfAttemptsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Number Of Attempts Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNumberOfAttemptsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNumberOfAttemptsObservationTemplateId() {
		OperationsTestCase<ProcedureNumberOfAttemptsObservation> validateProcedureNumberOfAttemptsObservationTemplateIdTestCase = new OperationsTestCase<ProcedureNumberOfAttemptsObservation>(
			"validateProcedureNumberOfAttemptsObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNumberOfAttemptsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureNumberOfAttemptsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationTemplateId(
					(ProcedureNumberOfAttemptsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNumberOfAttemptsObservationCodeP() {
		OperationsTestCase<ProcedureNumberOfAttemptsObservation> validateProcedureNumberOfAttemptsObservationCodePTestCase = new OperationsTestCase<ProcedureNumberOfAttemptsObservation>(
			"validateProcedureNumberOfAttemptsObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNumberOfAttemptsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureNumberOfAttemptsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationCodeP(
					(ProcedureNumberOfAttemptsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNumberOfAttemptsObservationCode() {
		OperationsTestCase<ProcedureNumberOfAttemptsObservation> validateProcedureNumberOfAttemptsObservationCodeTestCase = new OperationsTestCase<ProcedureNumberOfAttemptsObservation>(
			"validateProcedureNumberOfAttemptsObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNumberOfAttemptsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureNumberOfAttemptsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationCode(
					(ProcedureNumberOfAttemptsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNumberOfAttemptsObservationValue() {
		OperationsTestCase<ProcedureNumberOfAttemptsObservation> validateProcedureNumberOfAttemptsObservationValueTestCase = new OperationsTestCase<ProcedureNumberOfAttemptsObservation>(
			"validateProcedureNumberOfAttemptsObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNumberOfAttemptsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureNumberOfAttemptsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationValue(
					(ProcedureNumberOfAttemptsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureNumberOfAttemptsObservationMoodCode() {
		OperationsTestCase<ProcedureNumberOfAttemptsObservation> validateProcedureNumberOfAttemptsObservationMoodCodeTestCase = new OperationsTestCase<ProcedureNumberOfAttemptsObservation>(
			"validateProcedureNumberOfAttemptsObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_NUMBER_OF_ATTEMPTS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureNumberOfAttemptsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureNumberOfAttemptsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNumberOfAttemptsObservationOperations.validateProcedureNumberOfAttemptsObservationMoodCode(
					(ProcedureNumberOfAttemptsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureNumberOfAttemptsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNumberOfAttemptsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNumberOfAttemptsObservation> {
		public ProcedureNumberOfAttemptsObservation create() {
			return EmspcrFactory.eINSTANCE.createProcedureNumberOfAttemptsObservation();
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
	private static class ConstructorTestClass extends ProcedureNumberOfAttemptsObservationOperations {
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

} // ProcedureNumberOfAttemptsObservationOperations
