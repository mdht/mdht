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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.ComponentOf_EncompassingEncounter6Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter6</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6#validateEncompassingEncounter6EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter6 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6#validateEncompassingEncounter6Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter6 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter6#validateEncompassingEncounter6Location(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter6 Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ComponentOf_EncompassingEncounter6Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter6EffectiveTime() {
		OperationsTestCase<ComponentOf_EncompassingEncounter6> validateEncompassingEncounter6EffectiveTimeTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter6>(
			"validateEncompassingEncounter6EffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER6_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter6 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter6 target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6EffectiveTime(
					(ComponentOf_EncompassingEncounter6) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter6EffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter6Id() {
		OperationsTestCase<ComponentOf_EncompassingEncounter6> validateEncompassingEncounter6IdTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter6>(
			"validateEncompassingEncounter6Id",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER6_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter6 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter6 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6Id(
					(ComponentOf_EncompassingEncounter6) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter6IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEncompassingEncounter6Location() {
		OperationsTestCase<ComponentOf_EncompassingEncounter6> validateEncompassingEncounter6LocationTestCase = new OperationsTestCase<ComponentOf_EncompassingEncounter6>(
			"validateEncompassingEncounter6Location",
			operationsForOCL.getOCLValue("VALIDATE_ENCOMPASSING_ENCOUNTER6_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ComponentOf_EncompassingEncounter6 target) {

			}

			@Override
			protected void updateToPass(ComponentOf_EncompassingEncounter6 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ComponentOf_EncompassingEncounter6Operations.validateEncompassingEncounter6Location(
					(ComponentOf_EncompassingEncounter6) objectToTest, diagnostician, map);
			}

		};

		validateEncompassingEncounter6LocationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ComponentOf_EncompassingEncounter6Operations {
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
	private static class ObjectFactory implements TestObjectFactory<ComponentOf_EncompassingEncounter6> {
		public ComponentOf_EncompassingEncounter6 create() {
			return ConsolFactory.eINSTANCE.createComponentOf_EncompassingEncounter6();
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
	private static class ConstructorTestClass extends ComponentOf_EncompassingEncounter6Operations {
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

} // ComponentOf_EncompassingEncounter6Operations
