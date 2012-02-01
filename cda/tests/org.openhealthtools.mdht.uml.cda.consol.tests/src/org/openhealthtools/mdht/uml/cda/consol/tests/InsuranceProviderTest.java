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
import org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.consol.operations.InsuranceProviderOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Insurance Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPaymentProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPayerEntryID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthInsuranceType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStopTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPatientInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMemberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMemberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriberCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPayerEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#getPayerEntries() <em>Get Payer Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InsuranceProviderTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderInformationSource() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInformationSourceTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInformationSource",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderInformationSource(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderInformationSourceTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderSequenceNumber() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSequenceNumberTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSequenceNumber",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderSequenceNumber(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderSequenceNumberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderPaymentProviders() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPaymentProvidersTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPaymentProviders",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderPaymentProviders(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderPaymentProvidersTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderPayerEntryID() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPayerEntryIDTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPayerEntryID",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderPayerEntryID(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderPayerEntryIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderHealthInsuranceType() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthInsuranceTypeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthInsuranceType",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderHealthInsuranceType(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderHealthInsuranceTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderInsuranceInformation(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderInsuranceInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInfoSourceID() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInfoSourceIDTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInfoSourceID",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceID(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderInsuranceInfoSourceIDTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInfoSourceAddr() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInfoSourceAddrTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInfoSourceAddr",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderInsuranceInfoSourceAddr(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderInsuranceInfoSourceAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderHealthPlanCoverageStartTime() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthPlanCoverageStartTimeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthPlanCoverageStartTime",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStartTime(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderHealthPlanCoverageStartTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderHealthPlanCoverageStopTime() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthPlanCoverageStopTimeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthPlanCoverageStopTime",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderHealthPlanCoverageStopTime(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderHealthPlanCoverageStopTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderPatientInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPatientInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPatientInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderPatientInformation(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderPatientInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderMemberId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderMemberIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderMemberId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderMemberId(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderMemberIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderMemberIdRoot() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderMemberIdRootTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderMemberIdRoot",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderMemberIdRoot(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderMemberIdRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderRelationshipToSubscriber() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderRelationshipToSubscriberTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderRelationshipToSubscriber",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriber(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderRelationshipToSubscriberTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderRelationshipToSubscriberCodeSystem() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderRelationshipToSubscriberCodeSystemTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderRelationshipToSubscriberCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderRelationshipToSubscriberCodeSystem(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderRelationshipToSubscriberCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderPatientName() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPatientNameTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPatientName",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderPatientName(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderPatientNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderSubscriberInformation(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderSubscriberInformationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderSubscriberId(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderSubscriberIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberIdRoot() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberIdRootTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberIdRoot",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderSubscriberIdRoot(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderSubscriberIdRootTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberAddress() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberAddressTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberAddress",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderSubscriberAddress(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderSubscriberAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyType() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyTypeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyType",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyType(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderFinancialResponsibilityPartyTypeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyTypeCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyTypeCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyTypeCode(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderFinancialResponsibilityPartyTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyAddress() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyAddressTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyAddress",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderFinancialResponsibilityPartyAddress(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderFinancialResponsibilityPartyAddressTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderClassCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderClassCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderClassCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderClassCode(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderMoodCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderMoodCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderMoodCode(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderId(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderCode(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderStatusCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderStatusCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderStatusCode(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInsuranceProviderPayerEntry() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPayerEntryTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPayerEntry",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {

			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InsuranceProviderOperations.validateInsuranceProviderPayerEntry(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderPayerEntryTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetPayerEntries() {

		InsuranceProvider target = objectFactory.create();
		target.getPayerEntries();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InsuranceProviderOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InsuranceProvider> {
		public InsuranceProvider create() {
			return ConsolFactory.eINSTANCE.createInsuranceProvider();
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
	private static class ConstructorTestClass extends InsuranceProviderOperations {
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

} // InsuranceProviderOperations
