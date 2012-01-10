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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter2Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2#validateEncompassingEncounter2EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter2 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2#validateEncompassingEncounter2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter2 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2#validateEncompassingEncounter2ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter2 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter2#validateEncompassingEncounter2EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter2 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounter2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter2EffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter2> validateEncompassingEncounter2EffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter2>(
			"validateEncompassingEncounter2EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER2_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter2 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter2 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2EffectiveTime(
					(ComponentOf_EncompassingEncounter2) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter2EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter2Id() {
		OperationsTestCase<ComponentOf_EncompassingEncounter2> validateEncompassingEncounter2IdTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter2>(
			"validateEncompassingEncounter2Id",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter2 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2Id(
					(ComponentOf_EncompassingEncounter2) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter2ResponsibleParty() {
		OperationsTestCase<ComponentOf_EncompassingEncounter2> validateEncompassingEncounter2ResponsiblePartyTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter2>(
			"validateEncompassingEncounter2ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER2_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter2 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2ResponsibleParty(
					(ComponentOf_EncompassingEncounter2) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter2ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter2EncounterParticipant() {
		OperationsTestCase<ComponentOf_EncompassingEncounter2> validateEncompassingEncounter2EncounterParticipantTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter2>(
			"validateEncompassingEncounter2EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER2_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter2 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter2Operations.validateEncompassingEncounter2EncounterParticipant(
					(ComponentOf_EncompassingEncounter2) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter2EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounter2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter2> {
		public ComponentOf_EncompassingEncounter2 create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter2();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounter2Operations {
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

} // ComponentOf_EncompassingEncounter2Operations
