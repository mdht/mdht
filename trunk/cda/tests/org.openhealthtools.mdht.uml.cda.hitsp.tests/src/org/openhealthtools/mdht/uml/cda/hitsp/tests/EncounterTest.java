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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ParticipantRole;
import org.openhealthtools.mdht.uml.cda.hitsp.Encounter;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPFactory;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.EncounterOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.ParticipationType;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Encounter</b></em>' model objects. <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterAdmissionSourceValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Admission Source Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Encounter#validateHITSPEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Encounter Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncounterTest extends CDAValidationTest {

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPEncounterAdmissionSourceValueSet() {
		OperationsTestCase<Encounter> validateHITSPEncounterAdmissionSourceValueSetTestCase = new OperationsTestCase<Encounter>(
			"validateHITSPEncounterAdmissionSourceValueSet",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

				target.init();
				Participant2 par = CDAFactory.eINSTANCE.createParticipant2();
				par.setTypeCode(ParticipationType.ORG);
				ParticipantRole pr = CDAFactory.eINSTANCE.createParticipantRole();

				par.setParticipantRole(pr);
				target.getParticipants().add(par);

			}

			@Override
			protected void updateToPass(Encounter target) {

				for (Participant2 par : target.getParticipants())

				{

					CE code = DatatypesFactory.eINSTANCE.createCE();
					code.setCodeSystem("2.16.840.1.113883.3.88.12.80.33");

					par.getParticipantRole().setCode(code);

				}

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateHITSPEncounterAdmissionSourceValueSet(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateHITSPEncounterAdmissionSourceValueSetTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateHITSPEncounterTemplateId() {
		OperationsTestCase<Encounter> validateHITSPEncounterTemplateIdTestCase = new OperationsTestCase<Encounter>(
			"validateHITSPEncounterTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ENCOUNTER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateHITSPEncounterTemplateId(
					(Encounter) objectToTest, diagnostician, map);
			}

		};

		validateHITSPEncounterTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateHITSPEncounterCode() {
		OperationsTestCase<Encounter> validateHITSPEncounterCodeTestCase = new OperationsTestCase<Encounter>(
			"validateHITSPEncounterCode",
			operationsForOCL.getOCLValue("VALIDATE_HITSP_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Encounter target) {
				target.init();

			}

			@Override
			protected void updateToPass(Encounter target) {
				target.getCode().setCode("111");

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncounterOperations.validateHITSPEncounterCode((Encounter) objectToTest, diagnostician, map);
			}

		};

		validateHITSPEncounterCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends EncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Encounter> {

		public Encounter create() {
			return HITSPFactory.eINSTANCE.createEncounter();
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
	private static class ConstructorTestClass extends EncounterOperations {
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

} // EncounterOperations
