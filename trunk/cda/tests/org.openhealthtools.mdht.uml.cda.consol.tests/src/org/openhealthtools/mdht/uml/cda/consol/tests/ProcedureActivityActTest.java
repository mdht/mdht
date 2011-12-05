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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureActivityActOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Activity Act</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActPriorityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Priority Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActProcedureEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Procedure Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#validateProcedureActivityActMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Act Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getProcedureEncounters() <em>Get Procedure Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getInstructions() <em>Get Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getIndications() <em>Get Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureActivityAct#getMedicationActivity() <em>Get Medication Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityActTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActTemplateId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActTemplateIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActTemplateId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActClassCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActClassCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActClassCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActId() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIdTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActId(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActStatusCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActStatusCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActStatusCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActEffectiveTime() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActEffectiveTimeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActEffectiveTime(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActPriorityCode() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActPriorityCodeTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActPriorityCode",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PRIORITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActPriorityCode(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActPriorityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActProcedureEncounter() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActProcedureEncounterTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActProcedureEncounter",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_PROCEDURE_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActProcedureEncounter(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActProcedureEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActInstructions() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActInstructionsTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActInstructions",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActInstructions(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActInstructionsTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActIndication() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActIndicationTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActIndication",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActIndication(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActIndicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityActMedicationActivity() {
		OperationsTestCase<ProcedureActivityAct> validateProcedureActivityActMedicationActivityTestCase = new OperationsTestCase<ProcedureActivityAct>(
			"validateProcedureActivityActMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_ACT_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityAct target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityAct target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityActOperations.validateProcedureActivityActMedicationActivity(
					(ProcedureActivityAct) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityActMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureEncounters() {

		ProcedureActivityAct target = objectFactory.create();
		target.getProcedureEncounters();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetInstructions() {

		ProcedureActivityAct target = objectFactory.create();
		target.getInstructions();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetIndications() {

		ProcedureActivityAct target = objectFactory.create();
		target.getIndications();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivity() {

		ProcedureActivityAct target = objectFactory.create();
		target.getMedicationActivity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureActivityActOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityAct> {
		public ProcedureActivityAct create() {
			return ConsolFactory.eINSTANCE.createProcedureActivityAct();
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
	private static class ConstructorTestClass extends ProcedureActivityActOperations {
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

} // ProcedureActivityActOperations
