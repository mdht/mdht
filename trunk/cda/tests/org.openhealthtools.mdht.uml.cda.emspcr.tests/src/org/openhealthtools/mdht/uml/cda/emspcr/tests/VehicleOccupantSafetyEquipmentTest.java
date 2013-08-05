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
import org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.VehicleOccupantSafetyEquipmentOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vehicle Occupant Safety Equipment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.VehicleOccupantSafetyEquipment#validateVehicleOccupantSafetyEquipmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vehicle Occupant Safety Equipment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class VehicleOccupantSafetyEquipmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleOccupantSafetyEquipmentTemplateId() {
		OperationsTestCase<VehicleOccupantSafetyEquipment> validateVehicleOccupantSafetyEquipmentTemplateIdTestCase = new OperationsTestCase<VehicleOccupantSafetyEquipment>(
			"validateVehicleOccupantSafetyEquipmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleOccupantSafetyEquipment target) {

			}

			@Override
			protected void updateToPass(VehicleOccupantSafetyEquipment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentTemplateId(
					(VehicleOccupantSafetyEquipment) objectToTest, diagnostician, map);
			}

		};

		validateVehicleOccupantSafetyEquipmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleOccupantSafetyEquipmentCode() {
		OperationsTestCase<VehicleOccupantSafetyEquipment> validateVehicleOccupantSafetyEquipmentCodeTestCase = new OperationsTestCase<VehicleOccupantSafetyEquipment>(
			"validateVehicleOccupantSafetyEquipmentCode",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleOccupantSafetyEquipment target) {

			}

			@Override
			protected void updateToPass(VehicleOccupantSafetyEquipment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentCode(
					(VehicleOccupantSafetyEquipment) objectToTest, diagnostician, map);
			}

		};

		validateVehicleOccupantSafetyEquipmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleOccupantSafetyEquipmentValue() {
		OperationsTestCase<VehicleOccupantSafetyEquipment> validateVehicleOccupantSafetyEquipmentValueTestCase = new OperationsTestCase<VehicleOccupantSafetyEquipment>(
			"validateVehicleOccupantSafetyEquipmentValue",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleOccupantSafetyEquipment target) {

			}

			@Override
			protected void updateToPass(VehicleOccupantSafetyEquipment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentValue(
					(VehicleOccupantSafetyEquipment) objectToTest, diagnostician, map);
			}

		};

		validateVehicleOccupantSafetyEquipmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateVehicleOccupantSafetyEquipmentMoodCode() {
		OperationsTestCase<VehicleOccupantSafetyEquipment> validateVehicleOccupantSafetyEquipmentMoodCodeTestCase = new OperationsTestCase<VehicleOccupantSafetyEquipment>(
			"validateVehicleOccupantSafetyEquipmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_VEHICLE_OCCUPANT_SAFETY_EQUIPMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(VehicleOccupantSafetyEquipment target) {

			}

			@Override
			protected void updateToPass(VehicleOccupantSafetyEquipment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return VehicleOccupantSafetyEquipmentOperations.validateVehicleOccupantSafetyEquipmentMoodCode(
					(VehicleOccupantSafetyEquipment) objectToTest, diagnostician, map);
			}

		};

		validateVehicleOccupantSafetyEquipmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends VehicleOccupantSafetyEquipmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<VehicleOccupantSafetyEquipment> {
		public VehicleOccupantSafetyEquipment create() {
			return EmspcrFactory.eINSTANCE.createVehicleOccupantSafetyEquipment();
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
	private static class ConstructorTestClass extends VehicleOccupantSafetyEquipmentOperations {
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

} // VehicleOccupantSafetyEquipmentOperations
