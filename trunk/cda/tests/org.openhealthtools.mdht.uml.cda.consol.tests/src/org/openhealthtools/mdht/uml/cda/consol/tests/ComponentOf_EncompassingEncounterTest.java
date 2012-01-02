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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounterOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter#validateEncompassingEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter#validateEncompassingEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounterTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounterEffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter> validateEncompassingEncounterEffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter>(
			"validateEncompassingEncounterEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounterOperations.validateEncompassingEncounterEffectiveTime(
					(ComponentOf_EncompassingEncounter) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounterEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounterId() {
		OperationsTestCase<ComponentOf_EncompassingEncounter> validateEncompassingEncounterIdTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter>(
			"validateEncompassingEncounterId",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounterOperations.validateEncompassingEncounterId(
					(ComponentOf_EncompassingEncounter) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounterIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounterOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter> {
		public ComponentOf_EncompassingEncounter create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounterOperations {
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

} // ComponentOf_EncompassingEncounterOperations
