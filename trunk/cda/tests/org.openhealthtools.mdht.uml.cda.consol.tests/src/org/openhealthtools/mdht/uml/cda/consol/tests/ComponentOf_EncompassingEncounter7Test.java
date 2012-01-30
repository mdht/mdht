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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter7Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter7</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7PhysicianofRecordParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Physicianof Record Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Responsible Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounter7Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter7EffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter7> validateEncompassingEncounter7EffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter7>(
			"validateEncompassingEncounter7EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter7 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter7 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter7Operations.validateEncompassingEncounter7EffectiveTime(
					(ComponentOf_EncompassingEncounter7) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter7EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter7Id() {
		OperationsTestCase<ComponentOf_EncompassingEncounter7> validateEncompassingEncounter7IdTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter7>(
			"validateEncompassingEncounter7Id",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter7 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter7 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter7Operations.validateEncompassingEncounter7Id(
					(ComponentOf_EncompassingEncounter7) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter7IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter7PhysicianofRecordParticipant() {
		OperationsTestCase<ComponentOf_EncompassingEncounter7> validateEncompassingEncounter7PhysicianofRecordParticipantTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter7>(
			"validateEncompassingEncounter7PhysicianofRecordParticipant",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter7 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter7 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter7Operations.validateEncompassingEncounter7PhysicianofRecordParticipant(
					(ComponentOf_EncompassingEncounter7) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter7PhysicianofRecordParticipantTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter7ResponsibleParty() {
		OperationsTestCase<ComponentOf_EncompassingEncounter7> validateEncompassingEncounter7ResponsiblePartyTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter7>(
			"validateEncompassingEncounter7ResponsibleParty",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter7 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter7 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter7Operations.validateEncompassingEncounter7ResponsibleParty(
					(ComponentOf_EncompassingEncounter7) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter7ResponsiblePartyTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounter7Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter7> {
		public ComponentOf_EncompassingEncounter7 create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter7();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounter7Operations {
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

} // ComponentOf_EncompassingEncounter7Operations
