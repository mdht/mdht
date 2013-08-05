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
import org.openhealthtools.mdht.uml.cda.emspcr.Procedure;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProcedureOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureAbandonedProcedureRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Abandoned Procedure Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePriorRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Prior Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Number Of Attempts Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureSuccessfulRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Successful Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedureComplicationsRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Complications Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePatientResponseRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Patient Response Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureProcedurePerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Procedure Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureAirwayConfirmationRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Airway Confirmation Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureApproachSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureApproachSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Approach Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateEMSPCRProcedureNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Procedure Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.Procedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureAbandonedProcedureRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureAbandonedProcedureRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureAbandonedProcedureRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_ABANDONED_PROCEDURE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureAbandonedProcedureRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureAbandonedProcedureRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedurePriorRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedurePriorRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedurePriorRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PRIOR_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedurePriorRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedurePriorRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedureNumberOfAttemptsRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedureNumberOfAttemptsRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_NUMBER_OF_ATTEMPTS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedureNumberOfAttemptsRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedureNumberOfAttemptsRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedureSuccessfulRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedureSuccessfulRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedureSuccessfulRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_SUCCESSFUL_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedureSuccessfulRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedureSuccessfulRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedureComplicationsRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedureComplicationsRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedureComplicationsRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_COMPLICATIONS_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedureComplicationsRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedureComplicationsRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedurePatientResponseRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedurePatientResponseRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedurePatientResponseRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PATIENT_RESPONSE_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedurePatientResponseRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedurePatientResponseRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureProcedurePerformer() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureProcedurePerformerTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureProcedurePerformer",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_PROCEDURE_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureProcedurePerformer(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureProcedurePerformerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureAirwayConfirmationRelationship() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureAirwayConfirmationRelationshipTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureAirwayConfirmationRelationship",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_AIRWAY_CONFIRMATION_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureAirwayConfirmationRelationship(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureAirwayConfirmationRelationshipTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureCode() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureCodeTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureCode((Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureEffectiveTime() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureEffectiveTimeTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureEffectiveTime(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureStatusCodeP() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureStatusCodePTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureStatusCodeP(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureStatusCode() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureStatusCodeTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureStatusCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureApproachSiteCodeP() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureApproachSiteCodePTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureApproachSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureApproachSiteCodeP(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureApproachSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureApproachSiteCode() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureApproachSiteCodeTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureApproachSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_APPROACH_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureApproachSiteCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureApproachSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRProcedureNegationInd() {
		OperationsTestCase<Procedure> validateEMSPCRProcedureNegationIndTestCase = new OperationsTestCase<Procedure>(
			"validateEMSPCRProcedureNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_PROCEDURE_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateEMSPCRProcedureNegationInd(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRProcedureNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<Procedure> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<Procedure>(
			"validateProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateProcedureActivityProcedureTemplateId(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Procedure> {
		public Procedure create() {
			return EmspcrFactory.eINSTANCE.createProcedure();
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
	private static class ConstructorTestClass extends ProcedureOperations {
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

} // ProcedureOperations
