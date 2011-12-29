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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation_VerifierOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation Verifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Verifier#validateVerifierParticipantRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Verifier Participant Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservation_VerifierTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVerifierTemplateId() {
		OperationsTestCase<AdvanceDirectiveObservation_Verifier> validateVerifierTemplateIdTestCase = new OperationsTestCase<AdvanceDirectiveObservation_Verifier>(
			"validateVerifierTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VERIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation_Verifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation_Verifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation_VerifierOperations.validateVerifierTemplateId(
					(AdvanceDirectiveObservation_Verifier) objectToTest, diagnostician, map);
			}

		};

		validateVerifierTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVerifierTime() {
		OperationsTestCase<AdvanceDirectiveObservation_Verifier> validateVerifierTimeTestCase = new OperationsTestCase<AdvanceDirectiveObservation_Verifier>(
			"validateVerifierTime",
			operationsForOCL.getOCLValue("VALIDATE_VERIFIER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation_Verifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation_Verifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation_VerifierOperations.validateVerifierTime(
					(AdvanceDirectiveObservation_Verifier) objectToTest, diagnostician, map);
			}

		};

		validateVerifierTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVerifierTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservation_Verifier> validateVerifierTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservation_Verifier>(
			"validateVerifierTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_VERIFIER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation_Verifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation_Verifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation_VerifierOperations.validateVerifierTypeCode(
					(AdvanceDirectiveObservation_Verifier) objectToTest, diagnostician, map);
			}

		};

		validateVerifierTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVerifierParticipantRole() {
		OperationsTestCase<AdvanceDirectiveObservation_Verifier> validateVerifierParticipantRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservation_Verifier>(
			"validateVerifierParticipantRole",
			operationsForOCL.getOCLValue("VALIDATE_VERIFIER_PARTICIPANT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservation_Verifier target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservation_Verifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservation_VerifierOperations.validateVerifierParticipantRole(
					(AdvanceDirectiveObservation_Verifier) objectToTest, diagnostician, map);
			}

		};

		validateVerifierParticipantRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservation_VerifierOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservation_Verifier> {
		public AdvanceDirectiveObservation_Verifier create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservation_Verifier();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservation_VerifierOperations {
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

} // AdvanceDirectiveObservation_VerifierOperations
