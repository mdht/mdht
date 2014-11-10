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
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.AssignedEntity;
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.Person;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicianofRecordParticipantOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physicianof Record Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has DICOM Or NUCC Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Has National Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PhysicianofRecordParticipant#validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physicianof Record Participant Assigned Entity Assigned Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PhysicianofRecordParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantTemplateId() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantTemplateIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTemplateId(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantTypeCode() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantTypeCodeTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {

			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantTypeCode(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntity() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				target.setAssignedEntity(CDAFactory.eINSTANCE.createAssignedEntity());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntity(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityAssignedPersonName() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ae.setAssignedPerson(ap);
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				Person ap = CDAFactory.eINSTANCE.createPerson();
				ap.getNames().add(DatatypesFactory.eINSTANCE.createPN());
				ae.setAssignedPerson(ap);
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityAssignedPersonName(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityAssignedPersonNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCodeTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_DICOM_OR_NUCC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE());
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "1.2.840.10008.2.16.4"));
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCode(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityHasDICOMOrNUCCCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_HAS_NATIONAL_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				II id = DatatypesFactory.eINSTANCE.createII();
				id.setRoot("2.16.840.1.113883.4.6");
				ae.getIds().add(id);
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderId(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityHasNationalProviderIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityCode() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityCodeTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityCode",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setCode(DatatypesFactory.eINSTANCE.createCE("test", "1.2.840.10008.2.16.4"));
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityCode(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityId() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityIdTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityId",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.getIds().add(DatatypesFactory.eINSTANCE.createII());
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityId(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidatePhysicianofRecordParticipantAssignedEntityAssignedPerson() {
		OperationsTestCase<PhysicianofRecordParticipant> validatePhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase = new OperationsTestCase<PhysicianofRecordParticipant>(
			"validatePhysicianofRecordParticipantAssignedEntityAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_PHYSICIANOF_RECORD_PARTICIPANT_ASSIGNED_ENTITY_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PhysicianofRecordParticipant target) {
				target.init();
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				target.setAssignedEntity(ae);
			}

			@Override
			protected void updateToPass(PhysicianofRecordParticipant target) {
				AssignedEntity ae = CDAFactory.eINSTANCE.createAssignedEntity();
				ae.setAssignedPerson(CDAFactory.eINSTANCE.createPerson());
				target.setAssignedEntity(ae);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PhysicianofRecordParticipantOperations.validatePhysicianofRecordParticipantAssignedEntityAssignedPerson(
					(PhysicianofRecordParticipant) objectToTest, diagnostician, map);
			}

		};

		validatePhysicianofRecordParticipantAssignedEntityAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PhysicianofRecordParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PhysicianofRecordParticipant> {
		public PhysicianofRecordParticipant create() {
			return ConsolFactory.eINSTANCE.createPhysicianofRecordParticipant();
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
	private static class ConstructorTestClass extends PhysicianofRecordParticipantOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PhysicianofRecordParticipantOperations
