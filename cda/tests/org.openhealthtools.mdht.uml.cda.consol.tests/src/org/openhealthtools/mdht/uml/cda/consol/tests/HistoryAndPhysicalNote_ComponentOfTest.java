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
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote_ComponentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote_ComponentOfOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>History And Physical Note Component Of</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote_ComponentOf#validateComponentOfEncompassingEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Component Of Encompassing Encounter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HistoryAndPhysicalNote_ComponentOfTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateComponentOfEncompassingEncounter() {
		OperationsTestCase<HistoryAndPhysicalNote_ComponentOf> validateComponentOfEncompassingEncounterTestCase = new OperationsTestCase<HistoryAndPhysicalNote_ComponentOf>(
			"validateComponentOfEncompassingEncounter",
			operationsForOCL.getOCLValue("VALIDATE_COMPONENT_OF_ENCOMPASSING_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HistoryAndPhysicalNote_ComponentOf target) {

			}

			@Override
			protected void updateToPass(HistoryAndPhysicalNote_ComponentOf target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HistoryAndPhysicalNote_ComponentOfOperations.validateComponentOfEncompassingEncounter(
					(HistoryAndPhysicalNote_ComponentOf) objectToTest, diagnostician, map);
			}

		};

		validateComponentOfEncompassingEncounterTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HistoryAndPhysicalNote_ComponentOfOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HistoryAndPhysicalNote_ComponentOf> {
		public HistoryAndPhysicalNote_ComponentOf create() {
			return ConsolFactory.eINSTANCE.createHistoryAndPhysicalNote_ComponentOf();
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
	private static class ConstructorTestClass extends HistoryAndPhysicalNote_ComponentOfOperations {
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

} // HistoryAndPhysicalNote_ComponentOfOperations
