/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AdvanceDirectiveOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasStartingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Starting Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasEndingTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Ending Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveParticipantRoleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Participant Role Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveHasNameOfAgent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Has Name Of Agent</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasStartingTime() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasStartingTimeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasStartingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasStartingTime(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasStartingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasEndingTime() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasEndingTimeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasEndingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasEndingTime(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasEndingTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasCustodian() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasCustodianTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasCustodian",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasCustodian(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasCustodianTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveParticipantTypeCode() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveParticipantTypeCodeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantTypeCode(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveParticipantRoleClassCode() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveParticipantRoleClassCodeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveParticipantRoleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_PARTICIPANT_ROLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantRoleClassCode(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveParticipantRoleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasAddress() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasAddressTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasAddress",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasAddress(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasTelecom() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasTelecomTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasTelecom(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveHasNameOfAgent() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasNameOfAgentTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasNameOfAgent",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_NAME_OF_AGENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveHasNameOfAgent(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveHasNameOfAgentTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveTemplateId() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveTemplateIdTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveTemplateId(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveEffectiveTime() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveEffectiveTimeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveEffectiveTime(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCode() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveObservationCodeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveObservationCode(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirective> {
		public AdvanceDirective create() {
			return HITSPFactory.eINSTANCE.createAdvanceDirective();
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
	private static class ConstructorTestClass extends AdvanceDirectiveOperations {
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

} // AdvanceDirectiveOperations
