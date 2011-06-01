/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PolicyActivityOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityPayerEntityIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredPartyIsRequired(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Is Required</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredPartyTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivitySubscriberIsAllowed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Is Allowed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivitySubscriberTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityEntryRelationshipREFR(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship REFR</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityEntryRelationshipTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Entry Relationship Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityPayerEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivityCoveredParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#validatePolicyActivitySubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getPayerEntity() <em>Get Payer Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getCoveredParty() <em>Get Covered Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicyActivity#getSubscriber() <em>Get Subscriber</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicyActivityTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityPayerEntityIsRequired() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerEntityIsRequiredTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityPayerEntityIsRequired",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityPayerEntityIsRequired(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityPayerEntityIsRequiredTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityCoveredPartyIsRequired() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoveredPartyIsRequiredTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityCoveredPartyIsRequired",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_IS_REQUIRED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityCoveredPartyIsRequired(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityCoveredPartyIsRequiredTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityCoveredPartyTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoveredPartyTimeTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityCoveredPartyTime",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERED_PARTY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityCoveredPartyTime(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityCoveredPartyTimeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivitySubscriberIsAllowed() {
		OperationsTestCase<PolicyActivity> validatePolicyActivitySubscriberIsAllowedTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivitySubscriberIsAllowed",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_IS_ALLOWED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivitySubscriberIsAllowed(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivitySubscriberIsAllowedTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivitySubscriberTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivitySubscriberTimeTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivitySubscriberTime",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_SUBSCRIBER_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivitySubscriberTime(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivitySubscriberTimeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityEntryRelationshipREFR() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipREFRTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityEntryRelationshipREFR",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_REFR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityEntryRelationshipREFR(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityEntryRelationshipREFRTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityEntryRelationshipTarget() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityEntryRelationshipTargetTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityEntryRelationshipTarget",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_ENTRY_RELATIONSHIP_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityEntryRelationshipTarget(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityEntryRelationshipTargetTestCase
				.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityTemplateId(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityClassCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityClassCodeTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityClassCode",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityClassCode(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityClassCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityMoodCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityMoodCodeTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityMoodCode(
						(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityIdTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityId",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityId(
						(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityStatusCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityStatusCodeTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityStatusCode",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityStatusCode(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityPayerEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerEntityTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityPayerEntity",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityPayerEntity(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityPayerEntityTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivityCoveredParty() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCoveredPartyTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivityCoveredParty",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_COVERED_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivityCoveredParty(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivityCoveredPartyTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicyActivitySubscriber() {
		OperationsTestCase<PolicyActivity> validatePolicyActivitySubscriberTestCase = new OperationsTestCase<PolicyActivity>(
				"validatePolicyActivitySubscriber",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_ACTIVITY_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations
						.validatePolicyActivitySubscriber(
								(PolicyActivity) objectToTest, diagnostician,
								map);
			}

		};

		validatePolicyActivitySubscriberTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends PolicyActivityOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<PolicyActivity> {
		public PolicyActivity create() {
			return CCDFactory.eINSTANCE.createPolicyActivity();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PolicyActivityOperations