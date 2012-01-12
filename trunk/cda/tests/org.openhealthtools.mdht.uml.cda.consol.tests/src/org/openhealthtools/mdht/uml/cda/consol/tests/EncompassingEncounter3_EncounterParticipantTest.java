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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter3_EncounterParticipantOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter3 Encounter Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant#validateEncounterParticipantAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_EncounterParticipant#validateEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncompassingEncounter3_EncounterParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterParticipantAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<EncompassingEncounter3_EncounterParticipant> validateEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<EncompassingEncounter3_EncounterParticipant>(
			"validateEncounterParticipantAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter3_EncounterParticipant target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter3_EncounterParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter3_EncounterParticipantOperations.validateEncounterParticipantAssignedEntityHasPersonOrOrganization(
					(EncompassingEncounter3_EncounterParticipant) objectToTest, diagnostician, map);
			}

		};

		validateEncounterParticipantAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterParticipantAssignedEntity() {
		OperationsTestCase<EncompassingEncounter3_EncounterParticipant> validateEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<EncompassingEncounter3_EncounterParticipant>(
			"validateEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter3_EncounterParticipant target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter3_EncounterParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter3_EncounterParticipantOperations.validateEncounterParticipantAssignedEntity(
					(EncompassingEncounter3_EncounterParticipant) objectToTest, diagnostician, map);
			}

		};

		validateEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncompassingEncounter3_EncounterParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncompassingEncounter3_EncounterParticipant> {
		public EncompassingEncounter3_EncounterParticipant create() {
			return ConsolFactory.eINSTANCE.createEncompassingEncounter3_EncounterParticipant();
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
	private static class ConstructorTestClass extends EncompassingEncounter3_EncounterParticipantOperations {
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

} // EncompassingEncounter3_EncounterParticipantOperations
