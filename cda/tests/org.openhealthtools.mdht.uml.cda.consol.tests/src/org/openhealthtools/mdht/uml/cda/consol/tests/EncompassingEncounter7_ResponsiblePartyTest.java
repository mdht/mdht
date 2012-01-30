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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter7_ResponsibleParty;

import org.openhealthtools.mdht.uml.cda.consol.operations.EncompassingEncounter7_ResponsiblePartyOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter7 Responsible Party</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter7_ResponsibleParty#validateResponsiblePartyAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Responsible Party Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EncompassingEncounter7_ResponsiblePartyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateResponsiblePartyAssignedEntity() {
		OperationsTestCase<EncompassingEncounter7_ResponsibleParty> validateResponsiblePartyAssignedEntityTestCase = new OperationsTestCase<EncompassingEncounter7_ResponsibleParty>(
			"validateResponsiblePartyAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_RESPONSIBLE_PARTY_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EncompassingEncounter7_ResponsibleParty target) {

			}

			@Override
			protected void updateToPass(EncompassingEncounter7_ResponsibleParty target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EncompassingEncounter7_ResponsiblePartyOperations.validateResponsiblePartyAssignedEntity(
					(EncompassingEncounter7_ResponsibleParty) objectToTest, diagnostician, map);
			}

		};

		validateResponsiblePartyAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EncompassingEncounter7_ResponsiblePartyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EncompassingEncounter7_ResponsibleParty> {
		public EncompassingEncounter7_ResponsibleParty create() {
			return ConsolFactory.eINSTANCE.createEncompassingEncounter7_ResponsibleParty();
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
	private static class ConstructorTestClass extends EncompassingEncounter7_ResponsiblePartyOperations {
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

} // EncompassingEncounter7_ResponsiblePartyOperations
