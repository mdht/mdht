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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter2_EncounterParticipantOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter2 Encounter Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant#validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Assigned Entity Has Person Organization Or Both</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter2_EncounterParticipant#validateEncounterParticipantAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncompassingEncounter2_EncounterParticipantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth() {
		OperationsTestCase<EncompassingEncounter2_EncounterParticipant> validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase = new OperationsTestCase<EncompassingEncounter2_EncounterParticipant>(
			"validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY_HAS_PERSON_ORGANIZATION_OR_BOTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter2_EncounterParticipant target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter2_EncounterParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter2_EncounterParticipantOperations.validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBoth(
					(EncompassingEncounter2_EncounterParticipant) objectToTest, diagnostician, map);
			}

		};

		validateEncounterParticipantAssignedEntityHasPersonOrganizationOrBothTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncounterParticipantAssignedEntity() {
		OperationsTestCase<EncompassingEncounter2_EncounterParticipant> validateEncounterParticipantAssignedEntityTestCase = new OperationsTestCase<EncompassingEncounter2_EncounterParticipant>(
			"validateEncounterParticipantAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_ENCOUNTER_PARTICIPANT_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter2_EncounterParticipant target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter2_EncounterParticipant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter2_EncounterParticipantOperations.validateEncounterParticipantAssignedEntity(
					(EncompassingEncounter2_EncounterParticipant) objectToTest, diagnostician, map);
			}

		};

		validateEncounterParticipantAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncompassingEncounter2_EncounterParticipantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncompassingEncounter2_EncounterParticipant> {
		public EncompassingEncounter2_EncounterParticipant create() {
			return ConsolFactory.eINSTANCE.createEncompassingEncounter2_EncounterParticipant();
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
	private static class ConstructorTestClass extends EncompassingEncounter2_EncounterParticipantOperations {
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

} // EncompassingEncounter2_EncounterParticipantOperations
