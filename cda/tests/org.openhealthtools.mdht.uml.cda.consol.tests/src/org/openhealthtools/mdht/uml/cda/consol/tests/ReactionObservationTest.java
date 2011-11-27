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
import org.openhealthtools.mdht.uml.cda.consol.operations.ReactionObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reaction Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationHasReactionIntervention(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Has Reaction Intervention</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationReactionInterventionTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reaction Intervention Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationReactionInterventionType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Reaction Intervention Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationContainsPatientAwareness(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Contains Patient Awareness</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationHasTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Has Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationCommentInversionInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Comment Inversion Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#validateReactionObservationSeverity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reaction Observation Severity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ReactionObservation#getSeverity() <em>Get Severity</em>}</li>
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
	public void testValidateReactionObservationHasReactionIntervention() {
		OperationsTestCase<ReactionObservation> validateReactionObservationHasReactionInterventionTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationHasReactionIntervention",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_HAS_REACTION_INTERVENTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationHasReactionIntervention(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationHasReactionInterventionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationReactionInterventionTypeCode() {
		OperationsTestCase<ReactionObservation> validateReactionObservationReactionInterventionTypeCodeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationReactionInterventionTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationReactionInterventionTypeCode(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReactionInterventionTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationReactionInterventionType() {
		OperationsTestCase<ReactionObservation> validateReactionObservationReactionInterventionTypeTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationReactionInterventionType",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_REACTION_INTERVENTION_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationReactionInterventionType(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationReactionInterventionTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationInformationSource() {
		OperationsTestCase<ReactionObservation> validateReactionObservationInformationSourceTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationInformationSource(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationContainsPatientAwareness() {
		OperationsTestCase<ReactionObservation> validateReactionObservationContainsPatientAwarenessTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationContainsPatientAwareness",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_CONTAINS_PATIENT_AWARENESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationContainsPatientAwareness(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationContainsPatientAwarenessTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationHasTextReference() {
		OperationsTestCase<ReactionObservation> validateReactionObservationHasTextReferenceTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationHasTextReference",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_HAS_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationHasTextReference(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationHasTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReactionObservationCommentInversionInd() {
		OperationsTestCase<ReactionObservation> validateReactionObservationCommentInversionIndTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationCommentInversionInd",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_COMMENT_INVERSION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationCommentInversionInd(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationCommentInversionIndTestCase.doValidationTest();
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
	* @generated
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
	* @generated
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

				CD value = DatatypesFactory.eINSTANCE.createCD();
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
	* @generated
	*/
	@Test
	public void testValidateReactionObservationSeverity() {
		OperationsTestCase<ReactionObservation> validateReactionObservationSeverityTestCase = new OperationsTestCase<ReactionObservation>(
			"validateReactionObservationSeverity",
			operationsForOCL.getOCLValue("VALIDATE_REACTION_OBSERVATION_SEVERITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return ReactionObservationOperations.validateReactionObservationSeverity(
					(ReactionObservation) objectToTest, diagnostician, map);
			}

		};

		validateReactionObservationSeverityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetSeverity() {

		ReactionObservation target = objectFactory.create();
		target.getSeverity();

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
