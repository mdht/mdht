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
import org.openhealthtools.mdht.uml.cda.consol.DrugVehicle;
import org.openhealthtools.mdht.uml.cda.consol.operations.DrugVehicleOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Drug Vehicle</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DrugVehicle#validateDrugVehicleCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Drug Vehicle Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DrugVehicleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugVehicleTemplateId() {
		OperationsTestCase<DrugVehicle> validateDrugVehicleTemplateIdTestCase = new OperationsTestCase<DrugVehicle>(
			"validateDrugVehicleTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_VEHICLE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugVehicle target) {

			}

			@Override
			protected void updateToPass(DrugVehicle target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugVehicleOperations.validateDrugVehicleTemplateId(
					(DrugVehicle) objectToTest, diagnostician, map);
			}

		};

		validateDrugVehicleTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugVehicleClassCode() {
		OperationsTestCase<DrugVehicle> validateDrugVehicleClassCodeTestCase = new OperationsTestCase<DrugVehicle>(
			"validateDrugVehicleClassCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_VEHICLE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DrugVehicle target) {

			}

			@Override
			protected void updateToPass(DrugVehicle target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugVehicleOperations.validateDrugVehicleClassCode(
					(DrugVehicle) objectToTest, diagnostician, map);
			}

		};

		validateDrugVehicleClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDrugVehicleCode() {
		OperationsTestCase<DrugVehicle> validateDrugVehicleCodeTestCase = new OperationsTestCase<DrugVehicle>(
			"validateDrugVehicleCode",
			operationsForOCL.getOCLValue("VALIDATE_DRUG_VEHICLE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DrugVehicle target) {

			}

			@Override
			protected void updateToPass(DrugVehicle target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DrugVehicleOperations.validateDrugVehicleCode((DrugVehicle) objectToTest, diagnostician, map);
			}

		};

		validateDrugVehicleCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DrugVehicleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DrugVehicle> {

		public DrugVehicle create() {
			return ConsolFactory.eINSTANCE.createDrugVehicle();
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
	private static class ConstructorTestClass extends DrugVehicleOperations {
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

} // DrugVehicleOperations
