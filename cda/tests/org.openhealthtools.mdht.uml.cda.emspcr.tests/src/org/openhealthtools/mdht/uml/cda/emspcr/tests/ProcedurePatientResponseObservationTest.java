/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedurePatientResponseObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Patient Response Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservation#validateProcedurePatientResponseObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Patient Response Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedurePatientResponseObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationTemplateId() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationTemplateIdTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationTemplateId(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationMoodCode() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationMoodCodeTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationMoodCode(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationCodeP() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationCodePTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationCodeP(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationCode() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationCodeTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ProcedurePatientResponseObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ProcedurePatientResponseObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationCode(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationValue() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationValueTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationValue(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedurePatientResponseObservationValueP() {
		OperationsTestCase<ProcedurePatientResponseObservation> validateProcedurePatientResponseObservationValuePTestCase = new OperationsTestCase<ProcedurePatientResponseObservation>(
			"validateProcedurePatientResponseObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_PATIENT_RESPONSE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedurePatientResponseObservation target) {

			}

			@Override
			protected void updateToPass(ProcedurePatientResponseObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedurePatientResponseObservationOperations.validateProcedurePatientResponseObservationValueP(
					(ProcedurePatientResponseObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedurePatientResponseObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedurePatientResponseObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedurePatientResponseObservation> {
		public ProcedurePatientResponseObservation create() {
			return EmspcrFactory.eINSTANCE.createProcedurePatientResponseObservation();
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
	private static class ConstructorTestClass extends ProcedurePatientResponseObservationOperations {
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

} // ProcedurePatientResponseObservationOperations
