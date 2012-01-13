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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter4Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter4#validateEncompassingEncounter4EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter4 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounter4Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter4EffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter4> validateEncompassingEncounter4EffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter4>(
			"validateEncompassingEncounter4EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER4_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter4 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter4 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4EffectiveTime(
					(ComponentOf_EncompassingEncounter4) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter4EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter4Id() {
		OperationsTestCase<ComponentOf_EncompassingEncounter4> validateEncompassingEncounter4IdTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter4>(
			"validateEncompassingEncounter4Id",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER4_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter4 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4Id(
					(ComponentOf_EncompassingEncounter4) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter4IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter4Location() {
		OperationsTestCase<ComponentOf_EncompassingEncounter4> validateEncompassingEncounter4LocationTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter4>(
			"validateEncompassingEncounter4Location",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER4_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter4 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4Location(
					(ComponentOf_EncompassingEncounter4) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter4LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter4ResponsibleParty() {
		OperationsTestCase<ComponentOf_EncompassingEncounter4> validateEncompassingEncounter4ResponsiblePartyTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter4>(
			"validateEncompassingEncounter4ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER4_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter4 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4ResponsibleParty(
					(ComponentOf_EncompassingEncounter4) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter4ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter4EncounterParticipant() {
		OperationsTestCase<ComponentOf_EncompassingEncounter4> validateEncompassingEncounter4EncounterParticipantTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter4>(
			"validateEncompassingEncounter4EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER4_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter4 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter4 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter4Operations.validateEncompassingEncounter4EncounterParticipant(
					(ComponentOf_EncompassingEncounter4) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter4EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounter4Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter4> {
		public ComponentOf_EncompassingEncounter4 create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter4();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounter4Operations {
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

} // ComponentOf_EncompassingEncounter4Operations
