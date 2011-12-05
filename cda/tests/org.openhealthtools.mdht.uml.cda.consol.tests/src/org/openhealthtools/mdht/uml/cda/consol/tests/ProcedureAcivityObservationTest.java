/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureAcivityObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Acivity Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#validateProcedureAcivityObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Acivity Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureAcivityObservation#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureAcivityObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationTemplateId() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationTemplateIdTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationTemplateId(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationClassCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationClassCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationClassCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationId() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationIdTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationId(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationStatusCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationStatusCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationStatusCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationValue() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationValueTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationValue(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationEffectiveTime() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationEffectiveTimeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationEffectiveTime(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationPriorityCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationPriorityCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationPriorityCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationMethodCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationMethodCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationMethodCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationTargetSiteCode() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationTargetSiteCodeTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationTargetSiteCode(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationProcedureEncounter() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationProcedureEncounterTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationProcedureEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationProcedureEncounter(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationProcedureEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationInstructions() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationInstructionsTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationInstructions(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationIndication() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationIndicationTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationIndication(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureAcivityObservationMedicationActivity() {
		OperationsTestCase<ProcedureAcivityObservation> validateProcedureAcivityObservationMedicationActivityTestCase = new OperationsTestCase<ProcedureAcivityObservation>(
			"validateProcedureAcivityObservationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACIVITY_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureAcivityObservation target) {

			}

			@Override
			protected void updateToPass(ProcedureAcivityObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureAcivityObservationOperations.validateProcedureAcivityObservationMedicationActivity(
					(ProcedureAcivityObservation) objectToTest, diagnostician, map);
			}

		};

		validateProcedureAcivityObservationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEncounters() {

		ProcedureAcivityObservation target = objectFactory.create();
		target.getProcedureEncounters();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ProcedureAcivityObservation target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureAcivityObservation target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity() {

		ProcedureAcivityObservation target = objectFactory.create();
		target.getMedicationActivity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureAcivityObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureAcivityObservation> {
		public ProcedureAcivityObservation create() {
			return ConsolFactory.eINSTANCE.createProcedureAcivityObservation();
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
	private static class ConstructorTestClass extends ProcedureAcivityObservationOperations {
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

} // ProcedureAcivityObservationOperations
