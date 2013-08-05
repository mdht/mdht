/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VehicleImpactAreaOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vehicle Impact Area</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleImpactArea#validateVehicleImpactAreaMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Impact Area Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VehicleImpactAreaTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleImpactAreaTemplateId() {
		OperationsTestCase<VehicleImpactArea> validateVehicleImpactAreaTemplateIdTestCase = new OperationsTestCase<VehicleImpactArea>(
			"validateVehicleImpactAreaTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_IMPACT_AREA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleImpactArea target) {

			}

			@Override
			protected void updateToPass(VehicleImpactArea target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleImpactAreaOperations.validateVehicleImpactAreaTemplateId(
					(VehicleImpactArea) objectToTest, diagnostician, map);
			}

		};

		validateVehicleImpactAreaTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleImpactAreaCode() {
		OperationsTestCase<VehicleImpactArea> validateVehicleImpactAreaCodeTestCase = new OperationsTestCase<VehicleImpactArea>(
			"validateVehicleImpactAreaCode",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_IMPACT_AREA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleImpactArea target) {

			}

			@Override
			protected void updateToPass(VehicleImpactArea target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleImpactAreaOperations.validateVehicleImpactAreaCode(
					(VehicleImpactArea) objectToTest, diagnostician, map);
			}

		};

		validateVehicleImpactAreaCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleImpactAreaValue() {
		OperationsTestCase<VehicleImpactArea> validateVehicleImpactAreaValueTestCase = new OperationsTestCase<VehicleImpactArea>(
			"validateVehicleImpactAreaValue",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_IMPACT_AREA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleImpactArea target) {

			}

			@Override
			protected void updateToPass(VehicleImpactArea target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleImpactAreaOperations.validateVehicleImpactAreaValue(
					(VehicleImpactArea) objectToTest, diagnostician, map);
			}

		};

		validateVehicleImpactAreaValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleImpactAreaMoodCode() {
		OperationsTestCase<VehicleImpactArea> validateVehicleImpactAreaMoodCodeTestCase = new OperationsTestCase<VehicleImpactArea>(
			"validateVehicleImpactAreaMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_IMPACT_AREA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleImpactArea target) {

			}

			@Override
			protected void updateToPass(VehicleImpactArea target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleImpactAreaOperations.validateVehicleImpactAreaMoodCode(
					(VehicleImpactArea) objectToTest, diagnostician, map);
			}

		};

		validateVehicleImpactAreaMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VehicleImpactAreaOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VehicleImpactArea> {
		public VehicleImpactArea create() {
			return EmspcrFactory.eINSTANCE.createVehicleImpactArea();
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
	private static class ConstructorTestClass extends VehicleImpactAreaOperations {
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

} // VehicleImpactAreaOperations
