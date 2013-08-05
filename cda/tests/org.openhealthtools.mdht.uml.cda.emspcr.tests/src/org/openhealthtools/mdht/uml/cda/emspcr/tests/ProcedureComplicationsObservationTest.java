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
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureComplicationsObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Complications Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedureComplicationsObservation#validateProcedureComplicationsObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Complications Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureComplicationsObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureComplicationsObservationTemplateId() {
		OperationsTestCase<ProcedureComplicationsObservation> validateProcedureComplicationsObservationTemplateIdTestCase = new OperationsTestCase<ProcedureComplicationsObservation>(
			"validateProcedureComplicationsObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureComplicationsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureComplicationsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationTemplateId(
					(ProcedureComplicationsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureComplicationsObservationCodeP() {
		OperationsTestCase<ProcedureComplicationsObservation> validateProcedureComplicationsObservationCodePTestCase = new OperationsTestCase<ProcedureComplicationsObservation>(
			"validateProcedureComplicationsObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureComplicationsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureComplicationsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationCodeP(
					(ProcedureComplicationsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureComplicationsObservationCode() {
		OperationsTestCase<ProcedureComplicationsObservation> validateProcedureComplicationsObservationCodeTestCase = new OperationsTestCase<ProcedureComplicationsObservation>(
			"validateProcedureComplicationsObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureComplicationsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureComplicationsObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationCode(
					(ProcedureComplicationsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureComplicationsObservationValue() {
		OperationsTestCase<ProcedureComplicationsObservation> validateProcedureComplicationsObservationValueTestCase = new OperationsTestCase<ProcedureComplicationsObservation>(
			"validateProcedureComplicationsObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureComplicationsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureComplicationsObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationValue(
					(ProcedureComplicationsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureComplicationsObservationMoodCode() {
		OperationsTestCase<ProcedureComplicationsObservation> validateProcedureComplicationsObservationMoodCodeTestCase = new OperationsTestCase<ProcedureComplicationsObservation>(
			"validateProcedureComplicationsObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_COMPLICATIONS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureComplicationsObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureComplicationsObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureComplicationsObservationOperations.validateProcedureComplicationsObservationMoodCode(
					(ProcedureComplicationsObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureComplicationsObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureComplicationsObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureComplicationsObservation> {
		public ProcedureComplicationsObservation create() {
			return EmspcrFactory.eINSTANCE.createProcedureComplicationsObservation();
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
	private static class ConstructorTestClass extends ProcedureComplicationsObservationOperations {
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

} // ProcedureComplicationsObservationOperations
