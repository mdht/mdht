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
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.EntryRelationship;
import org.openhealthtools.mdht.uml.cda.Participant2;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.StatusObservation;
import org.openhealthtools.mdht.uml.cda.ccd.operations.StatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.vocab.x_ActRelationshipEntryRelationship;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Status Observation</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationTargetOfEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Target Of Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationNoAdditionalParticipants(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Participants</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationNoAdditionalRelationships(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation No Additional Relationships</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.StatusObservation#validateStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Status Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class StatusObservationTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateStatusObservationTargetOfEntryRelationship() {
		OperationsTestCase<StatusObservation> validateStatusObservationTargetOfEntryRelationshipTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationTargetOfEntryRelationship",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_TARGET_OF_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {
				target.init();
				EntryRelationship er = CDAFactory.eINSTANCE.createEntryRelationship();
				er.setTypeCode(x_ActRelationshipEntryRelationship.SAS);
				target.getEntryRelationships().add(er);
			}

			@Override
			protected void updateToPass(StatusObservation target) {
				for (EntryRelationship er : target.getEntryRelationships()) {
					er.setTypeCode(x_ActRelationshipEntryRelationship.REFR);
				}
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationTargetOfEntryRelationship(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationTargetOfEntryRelationshipTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateStatusObservationNoAdditionalParticipants() {
		OperationsTestCase<StatusObservation> validateStatusObservationNoAdditionalParticipantsTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationNoAdditionalParticipants",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_PARTICIPANTS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {
				Participant2 p2 = CDAFactory.eINSTANCE.createParticipant2();
				target.getParticipants().add(p2);
			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();
				target.getParticipants().clear();
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationNoAdditionalParticipants(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationNoAdditionalParticipantsTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateStatusObservationNoAdditionalRelationships() {
		OperationsTestCase<StatusObservation> validateStatusObservationNoAdditionalRelationshipsTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationNoAdditionalRelationships",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_NO_ADDITIONAL_RELATIONSHIPS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {
				target.init();
				target.addObservation(CDAFactory.eINSTANCE.createObservation());
			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.getEntryRelationships().clear();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationNoAdditionalRelationships(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationNoAdditionalRelationshipsTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationTemplateId() {
		OperationsTestCase<StatusObservation> validateStatusObservationTemplateIdTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationTemplateId(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationClassCode() {
		OperationsTestCase<StatusObservation> validateStatusObservationClassCodeTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationClassCode(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationMoodCode() {
		OperationsTestCase<StatusObservation> validateStatusObservationMoodCodeTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationMoodCode(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateStatusObservationCode() {
		OperationsTestCase<StatusObservation> validateStatusObservationCodeTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				cd.setCode("33999-4");
				cd.setCodeSystem("2.16.840.1.113883.6.1");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationCode(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateStatusObservationStatusCode() {
		OperationsTestCase<StatusObservation> validateStatusObservationStatusCodeTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationStatusCode(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateStatusObservationValue() {
		OperationsTestCase<StatusObservation> validateStatusObservationValueTestCase = new OperationsTestCase<StatusObservation>(
			"validateStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StatusObservation target) {

			}

			@Override
			protected void updateToPass(StatusObservation target) {
				target.init();

				CE value = DatatypesFactory.eINSTANCE.createCE();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StatusObservationOperations.validateStatusObservationValue(
					(StatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateStatusObservationValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends StatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StatusObservation> {
		public StatusObservation create() {
			return CCDFactory.eINSTANCE.createStatusObservation();
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
	private static class ConstructorTestClass extends StatusObservationOperations {
	}

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

} // StatusObservationOperations
