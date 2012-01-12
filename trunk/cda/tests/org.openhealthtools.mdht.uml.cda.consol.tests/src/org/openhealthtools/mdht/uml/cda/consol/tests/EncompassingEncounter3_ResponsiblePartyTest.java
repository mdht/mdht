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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty;
import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter3_ResponsiblePartyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter3 Responsible Party</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty#validateResponsiblePartyAssignedEntityHasPersonOrOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity Has Person Or Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter3_ResponsibleParty#validateResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncompassingEncounter3_ResponsiblePartyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponsiblePartyAssignedEntityHasPersonOrOrganization() {
		OperationsTestCase<EncompassingEncounter3_ResponsibleParty> validateResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase = new OperationsTestCase<EncompassingEncounter3_ResponsibleParty>(
			"validateResponsiblePartyAssignedEntityHasPersonOrOrganization",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY_HAS_PERSON_OR_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter3_ResponsibleParty target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter3_ResponsibleParty target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter3_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntityHasPersonOrOrganization(
					(EncompassingEncounter3_ResponsibleParty) objectToTest, diagnostician, map);
			}

		};

		validateResponsiblePartyAssignedEntityHasPersonOrOrganizationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponsiblePartyAssignedEntity() {
		OperationsTestCase<EncompassingEncounter3_ResponsibleParty> validateResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<EncompassingEncounter3_ResponsibleParty>(
			"validateResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter3_ResponsibleParty target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter3_ResponsibleParty target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter3_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntity(
					(EncompassingEncounter3_ResponsibleParty) objectToTest, diagnostician, map);
			}

		};

		validateResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncompassingEncounter3_ResponsiblePartyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncompassingEncounter3_ResponsibleParty> {
		public EncompassingEncounter3_ResponsibleParty create() {
			return ConsolFactory.eINSTANCE.createEncompassingEncounter3_ResponsibleParty();
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
	private static class ConstructorTestClass extends EncompassingEncounter3_ResponsiblePartyOperations {
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

} // EncompassingEncounter3_ResponsiblePartyOperations
