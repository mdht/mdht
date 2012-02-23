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
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Organization;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PolicyActivity;
import org.openhealthtools.mdht.uml.cda.consol.operations.PolicyActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ON;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityAuthorizationActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Authorization Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity Payer Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityPayerPayerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Payer Payer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#validatePolicyActivityGuarantorGuarantorAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Activity Guarantor Guarantor Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PolicyActivity#getAuthorizationActivity() <em>Get Authorization Activity</em>}</li>
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
	public void testValidatePolicyActivityTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
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
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityClassCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD("A", "2.16.840.1.113883.6.1", null, null);
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				II ii = DatatypesFactory.eINSTANCE.createII("12345678-0");
				target.getIds().add(ii);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

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
	public void testValidatePolicyActivityMoodCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityMoodCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

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
	public void testValidatePolicyActivityStatusCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityStatusCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityStatusCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated 
	*/
	@Test
	public void testValidatePolicyActivityAuthorizationActivity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityAuthorizationActivityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityAuthorizationActivity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_AUTHORIZATION_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityAuthorizationActivity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityAuthorizationActivityTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayer() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayer",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				// Once Sean's fix is in, this condition should passS
				// target.getPerformers().add(guarantor);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayer(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantor() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantor",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				Performer2 guarantor = createPerformer();
				target.getPerformers().add(guarantor);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantor(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				ON name = DatatypesFactory.eINSTANCE.createON();
				repOrg.getNames().add(name);

				payerEntity.getRepresentedOrganizations().add(repOrg);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationName(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getIds().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.setCode(null);
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getAddrs().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payerEntity.getTelecoms().clear();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntityPayerOrganization() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntityPayerOrganization",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY_PAYER_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				AssignedEntity payerEntity = createPayerAssignedEntity();
				payer.setAssignedEntity(payerEntity);

				Organization repOrg = CDAFactory.eINSTANCE.createOrganization();
				payerEntity.getRepresentedOrganizations().add(repOrg);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntityPayerOrganization(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityPayerOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityPayerTemplateId() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTemplateIdTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerTemplateId(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated  NOT
	*/
	@Test
	public void testValidatePolicyActivityPayerTypeCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerTypeCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.SPRF);

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();
				target.getPerformers().clear();
				Performer2 payer = createPerformer();
				target.getPerformers().add(payer);
				payer.setTypeCode(ParticipationPhysicalPerformer.PRF);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerTypeCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityPayerPayerAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityPayerPayerAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityPayerPayerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_PAYER_PAYER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityPayerPayerAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityPayerPayerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityCode() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityCode(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityAddr() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityAddr",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityAddr(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntityTelecom() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntityTelecom(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantorTime() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorTimeTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorTime",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorTime(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePolicyActivityGuarantorGuarantorAssignedEntity() {
		OperationsTestCase<PolicyActivity> validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase = new OperationsTestCase<PolicyActivity>(
			"validatePolicyActivityGuarantorGuarantorAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_POLICY_ACTIVITY_GUARANTOR_GUARANTOR_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PolicyActivity target) {

			}

			@Override
			protected void updateToPass(PolicyActivity target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicyActivityOperations.validatePolicyActivityGuarantorGuarantorAssignedEntity(
					(PolicyActivity) objectToTest, diagnostician, map);
			}

		};

		validatePolicyActivityGuarantorGuarantorAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetAuthorizationActivity() {

		PolicyActivity target = objectFactory.create();
		target.getAuthorizationActivity();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PolicyActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PolicyActivity> {
		public PolicyActivity create() {
			return ConsolFactory.eINSTANCE.createPolicyActivity();
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
	private static class ConstructorTestClass extends PolicyActivityOperations {
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

	/**
	 * Convenience Method for creating AssignedEntity for Payer
	 */
	private static AssignedEntity createPayerAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("EMP", "2.16.840.1.113883.5.110"));
		assignedEntity.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
		assignedEntity.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
		return assignedEntity;
	}

	private static AssignedEntity createGuarantorAssignedEntity() {
		AssignedEntity assignedEntity = CDAFactory.eINSTANCE.createAssignedEntity();
		assignedEntity.getIds().add(DatatypesFactory.eINSTANCE.createII("12345"));
		assignedEntity.setCode(DatatypesFactory.eINSTANCE.createCE("GUAR", "2.16.840.1.113883.5.111"));
		return assignedEntity;
	}

	private static Performer2 createPerformer() {
		Performer2 performer = CDAFactory.eINSTANCE.createPerformer2();
		return performer;
	}
} // PolicyActivityOperations
