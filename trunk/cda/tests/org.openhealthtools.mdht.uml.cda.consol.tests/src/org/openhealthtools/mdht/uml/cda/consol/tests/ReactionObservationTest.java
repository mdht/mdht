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
import org.openhealthtools.mdht.uml.cda.consol.ReactionObservation;
import org.openhealthtools.mdht.uml.cda.consol.SeverityObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservationInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedureInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivityInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverityObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationProcedureActivityProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Procedure Activity Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMedicationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Medication Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getSeverityObservation() <em>Get Severity Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getProcedureActivityProcedures() <em>Get Procedure Activity Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getMedicationActivities() <em>Get Medication Activities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReactionObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationSeverityObservationInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityObservationInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverityObservationInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationSeverityObservationInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedureInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationProcedureActivityProcedureInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationProcedureActivityProcedureInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedureInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationMedicationActivityInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMedicationActivityInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMedicationActivityInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMedicationActivityInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityInversionIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationTemplateId() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTemplateIdTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationTemplateId(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationClassCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationClassCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationClassCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationMoodCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMoodCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMoodCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationId() {
		OperationsTestCase<ReactionObservation> validateReactionObservationIdTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationId",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationId(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationText() {
		OperationsTestCase<ReactionObservation> validateReactionObservationTextTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationText",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();
				target.setText(DatatypesFactory.eINSTANCE.createED());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationText(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationStatusCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationStatusCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationStatusCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationEffectiveTime() {
		OperationsTestCase<ReactionObservation> validateReactionObservationEffectiveTimeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationEffectiveTime(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationValue() {
		OperationsTestCase<ReactionObservation> validateReactionObservationValueTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();
				target.getValues().clear();
				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCodeSystem("2.16.840.1.113883.3.88.12.3221.7.4");
				value.setCode("234422006");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationValue(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationSeverityObservation() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityObservationTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverityObservation",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				SeverityObservation observation = ConsolFactory.eINSTANCE.createSeverityObservation().init();
				target.addObservation(observation);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.SUBJ);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationSeverityObservation(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityObservationTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateReactionObservationProcedureActivityProcedure() {
		OperationsTestCase<ReactionObservation> validateReactionObservationProcedureActivityProcedureTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationProcedureActivityProcedure",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_PROCEDURE_ACTIVITY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

				SeverityObservation observation = ConsolFactory.eINSTANCE.createSeverityObservation().init();
				target.addObservation(observation);
				for (org.openhealthtools.mdht.uml.cda.EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.RSON);
				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationProcedureActivityProcedure(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationProcedureActivityProcedureTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationMedicationActivity() {
		OperationsTestCase<ReactionObservation> validateReactionObservationMedicationActivityTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationMedicationActivity",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_MEDICATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReactionObservation target) {

			}

			@Override
			protected void updateToPass(ReactionObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReactionObservationOperations.validateReactionObservationMedicationActivity(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationMedicationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverityObservation() {

		ReactionObservation target = objectFactory.create();
		target.getSeverityObservation();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetProcedureActivityProcedures() {

		ReactionObservation target = objectFactory.create();
		target.getProcedureActivityProcedures();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationActivities() {

		ReactionObservation target = objectFactory.create();
		target.getMedicationActivities();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReactionObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReactionObservation> {
		public ReactionObservation create() {
			return ConsolFactory.eINSTANCE.createReactionObservation();
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
	private static class ConstructorTestClass extends ReactionObservationOperations {
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

} // ReactionObservationOperations
