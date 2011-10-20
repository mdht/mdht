/*******************************************************************************
 * Copyright (c) 2011 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.InsuranceProviderOperations;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PayerEntry;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationPhysicalPerformer;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Insurance Provider</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPaymentProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPayerEntryID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthInsuranceType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStopTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPatientInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderMemberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderMemberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriberCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InsuranceProviderTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
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
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderPayerEntryID() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPayerEntryIDTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPayerEntryID",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("root");
				pe.getIds().add(id);
				target.addAct(pe);
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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderHealthInsuranceType() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthInsuranceTypeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthInsuranceType",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				CD code = DatatypesFactory.eINSTANCE.createCD();
				code.setCode("13");
				code.setCodeSystem("2.16.840.1.113883.6.255.1336");
				pe.setCode(code);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 perm = CDAFactory.eINSTANCE.createPerformer2();
				perm.setTypeCode(ParticipationPhysicalPerformer.PRF);
				perm.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());
				pe.getPerformers().add(perm);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInfoSourceID() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInfoSourceIDTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInfoSourceID",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 perm = CDAFactory.eINSTANCE.createPerformer2();
				perm.setTypeCode(ParticipationPhysicalPerformer.PRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				perm.setAssignedEntity(ae);
				pe.getPerformers().add(perm);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderInsuranceInfoSourceAddr() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderInsuranceInfoSourceAddrTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderInsuranceInfoSourceAddr",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 perm = CDAFactory.eINSTANCE.createPerformer2();
				perm.setTypeCode(ParticipationPhysicalPerformer.PRF);
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				perm.setAssignedEntity(ae);
				pe.getPerformers().add(perm);
				target.addAct(pe);
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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderHealthPlanCoverageStartTime() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthPlanCoverageStartTimeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthPlanCoverageStartTime",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);

				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS lw = DatatypesFactory.eINSTANCE.createIVXB_TS();
				time.setLow(lw);
				par.setTime(time);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderHealthPlanCoverageStopTime() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderHealthPlanCoverageStopTimeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderHealthPlanCoverageStopTime",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);

				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				time.setHigh(high);
				par.setTime(time);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderPatientInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPatientInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPatientInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderMemberId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderMemberIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderMemberId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getIds().add(DatatypesFactory.eINSTANCE.createII());
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderMemberIdRoot() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderMemberIdRootTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderMemberIdRoot",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("root");
				pr.getIds().add(id);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderRelationshipToSubscriber() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderRelationshipToSubscriberTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderRelationshipToSubscriber",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				pr.setCode(code);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderRelationshipToSubscriberCodeSystem() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderRelationshipToSubscriberCodeSystemTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderRelationshipToSubscriberCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.5.111");
				code.setCode("FAMDEP");
				pr.setCode(code);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderPatientName() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderPatientNameTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderPatientName",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.COV);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pl = CDAFactory.eINSTANCE.createPlayingEntity();
				pl.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				pr.setPlayingEntity(pl);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberInformation() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberInformationTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberInformation",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.HLD);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("root");
				pr.getIds().add(id);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberIdRoot() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberIdRootTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberIdRoot",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("root");
				pr.getIds().add(id);
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderSubscriberAddress() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderSubscriberAddressTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderSubscriberAddress",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.HLD);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				pr.setClassCode(RoleClassRoot.PAT);
				par.setParticipantRole(pr);
				pe.getParticipants().add(par);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyType() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyTypeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyType",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ae.setCode(code);
				per.setAssignedEntity(ae);
				per.setTypeCode(ParticipationPhysicalPerformer.PRF);
				pe.getPerformers().add(per);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyTypeCode() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyTypeCodeTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setCodeSystem("2.16.840.1.113883.5.110");
				ae.setCode(code);
				per.setAssignedEntity(ae);
				per.setTypeCode(ParticipationPhysicalPerformer.PRF);
				pe.getPerformers().add(per);
				target.addAct(pe);

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
	* @generated NOT
	*/
	@Test
	public void testValidateInsuranceProviderFinancialResponsibilityPartyAddress() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderFinancialResponsibilityPartyAddressTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderFinancialResponsibilityPartyAddress",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InsuranceProvider target) {
				target.init();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				target.addAct(pe);
			}

			@Override
			protected void updateToPass(InsuranceProvider target) {
				target.getEntryRelationships().clear();
				PayerEntry pe = IHEFactory.eINSTANCE.createPayerEntry();
				Performer2 per = CDAFactory.eINSTANCE.createPerformer2();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				per.setAssignedEntity(ae);
				per.setTypeCode(ParticipationPhysicalPerformer.PRF);
				pe.getPerformers().add(per);
				target.addAct(pe);

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
	public void testValidateInsuranceProviderTemplateId() {
		OperationsTestCase<InsuranceProvider> validateInsuranceProviderTemplateIdTestCase = new OperationsTestCase<InsuranceProvider>(
			"validateInsuranceProviderTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
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

				return InsuranceProviderOperations.validateInsuranceProviderTemplateId(
					(InsuranceProvider) objectToTest, diagnostician, map);
			}

		};

		validateInsuranceProviderTemplateIdTestCase.doValidationTest();
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
			return HITSPFactory.eINSTANCE.createInsuranceProvider();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends InsuranceProviderOperations {
	}

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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
