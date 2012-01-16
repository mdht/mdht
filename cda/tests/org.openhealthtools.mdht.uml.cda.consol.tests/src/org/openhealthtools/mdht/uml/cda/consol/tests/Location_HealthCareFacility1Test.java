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
import org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility1;

import org.openhealthtools.mdht.uml.cda.consol.operations.Location_HealthCareFacility1Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Location Health Care Facility1</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Location_HealthCareFacility1#validateHealthCareFacility1Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Care Facility1 Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Location_HealthCareFacility1Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHealthCareFacility1Id() {
		OperationsTestCase<Location_HealthCareFacility1> validateHealthCareFacility1IdTestCase = new OperationsTestCase<Location_HealthCareFacility1>(
			"validateHealthCareFacility1Id",
			operationsForOCL.getOCLValue("VALIDATE_HEALTH_CARE_FACILITY1_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Location_HealthCareFacility1 target) {

			}

			@Override
			protected void updateToPass(Location_HealthCareFacility1 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Location_HealthCareFacility1Operations.validateHealthCareFacility1Id(
					(Location_HealthCareFacility1) objectToTest, diagnostician, map);
			}

		};

		validateHealthCareFacility1IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Location_HealthCareFacility1Operations {
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
	private static class ObjectFactory implements TestObjectFactory<Location_HealthCareFacility1> {
		public Location_HealthCareFacility1 create() {
			return ConsolFactory.eINSTANCE.createLocation_HealthCareFacility1();
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
	private static class ConstructorTestClass extends Location_HealthCareFacility1Operations {
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

} // Location_HealthCareFacility1Operations
