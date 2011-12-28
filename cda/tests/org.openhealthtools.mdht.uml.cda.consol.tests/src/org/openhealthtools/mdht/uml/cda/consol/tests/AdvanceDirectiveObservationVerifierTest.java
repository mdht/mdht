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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationVerifierOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation Verifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Participant Role</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationVerifier#validateAdvanceDirectiveObservationVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Verifier Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationVerifierTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservationVerifier> validateAdvanceDirectiveObservationVerifierTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservationVerifier>(
			"validateAdvanceDirectiveObservationVerifierTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationVerifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationVerifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationVerifierOperations.validateAdvanceDirectiveObservationVerifierTemplateId(
					(AdvanceDirectiveObservationVerifier) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTime() {
		OperationsTestCase<AdvanceDirectiveObservationVerifier> validateAdvanceDirectiveObservationVerifierTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservationVerifier>(
			"validateAdvanceDirectiveObservationVerifierTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationVerifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationVerifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationVerifierOperations.validateAdvanceDirectiveObservationVerifierTime(
					(AdvanceDirectiveObservationVerifier) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservationVerifier> validateAdvanceDirectiveObservationVerifierTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservationVerifier>(
			"validateAdvanceDirectiveObservationVerifierTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationVerifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationVerifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationVerifierOperations.validateAdvanceDirectiveObservationVerifierTypeCode(
					(AdvanceDirectiveObservationVerifier) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationVerifierParticipantRole() {
		OperationsTestCase<AdvanceDirectiveObservationVerifier> validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservationVerifier>(
			"validateAdvanceDirectiveObservationVerifierParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationVerifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationVerifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationVerifierOperations.validateAdvanceDirectiveObservationVerifierParticipantRole(
					(AdvanceDirectiveObservationVerifier) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationVerifierParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservationVerifierOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservationVerifier> {
		public AdvanceDirectiveObservationVerifier create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservationVerifier();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationVerifierOperations {
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

} // AdvanceDirectiveObservationVerifierOperations
