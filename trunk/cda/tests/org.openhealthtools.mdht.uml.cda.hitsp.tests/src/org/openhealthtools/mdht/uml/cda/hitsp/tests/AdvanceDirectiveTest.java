/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.PlayingEntity;
import org.openhealthtools.mdht.uml.cda.ccd.operations.AdvanceDirectiveObservationOperations;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AdvanceDirectiveOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVXB_TS;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;
import org.openhealthtools.mdht.uml.hl7.vocab.RoleClassRoot;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective#validateAdvanceDirectiveEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Effective Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveHasStartingTime() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasStartingTimeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasStartingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_STARTING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(AdvanceDirective target) {

				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS low = DatatypesFactory.eINSTANCE.createIVXB_TS();
				low.setValue("high");
				ef.setLow(low);
				target.setEffectiveTime(ef);
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
	* @generated NOT
	*/
	@Test
	public void testValidateAdvanceDirectiveHasEndingTime() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveHasEndingTimeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveHasEndingTime",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_HAS_ENDING_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {
				target.init();
				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ef);
			}

			@Override
			protected void updateToPass(AdvanceDirective target) {

				IVL_TS ef = DatatypesFactory.eINSTANCE.createIVL_TS();
				IVXB_TS high = DatatypesFactory.eINSTANCE.createIVXB_TS();
				high.setValue("high");
				ef.setHigh(high);
				target.setEffectiveTime(ef);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.CST);
				target.getParticipants().add(par);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.setClassCode(RoleClassRoot.AGNT);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getAddrs().add(DatatypesFactory.eINSTANCE.createAD());
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				pr.getTelecoms().add(DatatypesFactory.eINSTANCE.createTEL());
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
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
	* @generated NOT
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
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();
				PlayingEntity pe = CDAFactory.eINSTANCE.createPlayingEntity();
				pe.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				pr.setPlayingEntity(pe);
				par.setParticipantRole(pr);
				target.getParticipants().add(par);
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
	* @generated not
	*/
	@Test
	public void testValidateAdvanceDirectiveCode() {
		OperationsTestCase<AdvanceDirective> validateAdvanceDirectiveCodeTestCase = new OperationsTestCase<AdvanceDirective>(
			"validateAdvanceDirectiveCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirective target) {

			}

			@Override
			protected void updateToPass(AdvanceDirective target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("281789004");
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveOperations.validateAdvanceDirectiveCode(
					(AdvanceDirective) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveCodeTestCase.doValidationTest();
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
	* @generated NOT
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
				cd.setCodeSystem("2.16.840.1.113883.6.96");
				cd.setCode("225204009");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationOperations.validateAdvanceDirectiveObservationCode(
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
