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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter3Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter3</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encompassing Encounter Has Effective Time High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Responsible Party</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter3#validateEncompassingEncounter3EncounterParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter3 Encounter Participant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounter3Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow() {
		OperationsTestCase<ComponentOf_EncompassingEncounter3> validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter3>(
			"validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter3 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter3Operations.validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLow(
					(ComponentOf_EncompassingEncounter3) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh() {
		OperationsTestCase<ComponentOf_EncompassingEncounter3> validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter3>(
			"validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOMPASSING_ENCOUNTER_HAS_EFFECTIVE_TIME_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter3 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter3Operations.validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHigh(
					(ComponentOf_EncompassingEncounter3) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter3EncompassingEncounterHasEffectiveTimeHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter3EffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter3> validateEncompassingEncounter3EffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter3>(
			"validateEncompassingEncounter3EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER3_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter3 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter3 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter3Operations.validateEncompassingEncounter3EffectiveTime(
					(ComponentOf_EncompassingEncounter3) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter3EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter3ResponsibleParty() {
		OperationsTestCase<ComponentOf_EncompassingEncounter3> validateEncompassingEncounter3ResponsiblePartyTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter3>(
			"validateEncompassingEncounter3ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER3_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter3 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter3Operations.validateEncompassingEncounter3ResponsibleParty(
					(ComponentOf_EncompassingEncounter3) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter3ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter3EncounterParticipant() {
		OperationsTestCase<ComponentOf_EncompassingEncounter3> validateEncompassingEncounter3EncounterParticipantTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter3>(
			"validateEncompassingEncounter3EncounterParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER3_ENCOUNTER_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter3 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter3 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter3Operations.validateEncompassingEncounter3EncounterParticipant(
					(ComponentOf_EncompassingEncounter3) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter3EncounterParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounter3Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter3> {
		public ComponentOf_EncompassingEncounter3 create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter3();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounter3Operations {
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

} // ComponentOf_EncompassingEncounter3Operations
