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
import org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationInformationManufacturedMaterialOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Information Manufactured Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.MedicationInformationManufacturedMaterial#validateMedicationInformationManufacturedMaterialCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Information Manufactured Material Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationInformationManufacturedMaterialTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationInformationManufacturedMaterialCode() {
		OperationsTestCase<MedicationInformationManufacturedMaterial> validateMedicationInformationManufacturedMaterialCodeTestCase = new OperationsTestCase<MedicationInformationManufacturedMaterial>(
			"validateMedicationInformationManufacturedMaterialCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationInformationManufacturedMaterial target) {

			}

			@Override
			protected void updateToPass(MedicationInformationManufacturedMaterial target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationInformationManufacturedMaterialOperations.validateMedicationInformationManufacturedMaterialCode(
					(MedicationInformationManufacturedMaterial) objectToTest, diagnostician, map);
			}

		};

		validateMedicationInformationManufacturedMaterialCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationInformationManufacturedMaterialOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationInformationManufacturedMaterial> {
		public MedicationInformationManufacturedMaterial create() {
			return ConsolFactory.eINSTANCE.createMedicationInformationManufacturedMaterial();
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
	private static class ConstructorTestClass extends MedicationInformationManufacturedMaterialOperations {
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

} // MedicationInformationManufacturedMaterialOperations
