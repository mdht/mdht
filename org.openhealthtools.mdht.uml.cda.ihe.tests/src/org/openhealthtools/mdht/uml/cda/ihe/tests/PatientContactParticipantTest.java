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
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactParticipantOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Contact Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactParticipant#validatePatientContactParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Participant Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientContactParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientContactParticipantTemplateId() {
		OperationsTestCase<PatientContactParticipant> validatePatientContactParticipantTemplateIdTestCase = new OperationsTestCase<PatientContactParticipant>(
			"validatePatientContactParticipantTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {

			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactParticipantOperations.validatePatientContactParticipantTemplateId(
					(PatientContactParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactParticipantTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientContactParticipantTime() {
		OperationsTestCase<PatientContactParticipant> validatePatientContactParticipantTimeTestCase = new OperationsTestCase<PatientContactParticipant>(
			"validatePatientContactParticipantTime",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				IVL_TS time = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setTime(time);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactParticipantOperations.validatePatientContactParticipantTime(
					(PatientContactParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactParticipantTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientContactParticipantTypeCode() {
		OperationsTestCase<PatientContactParticipant> validatePatientContactParticipantTypeCodeTestCase = new OperationsTestCase<PatientContactParticipant>(
			"validatePatientContactParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactParticipant target) {

			}

			@Override
			protected void updateToPass(PatientContactParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactParticipantOperations.validatePatientContactParticipantTypeCode(
					(PatientContactParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientContactParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientContactParticipant> {

		public PatientContactParticipant create() {
			return IHEFactory.eINSTANCE.createPatientContactParticipant();
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
	private static class ConstructorTestClass extends PatientContactParticipantOperations {
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

} // PatientContactParticipantOperations
