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
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial;
import org.openhealthtools.mdht.uml.cda.consol.operations.ImmunizationMedicationInformationManufacturedMaterialOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization Medication Information Manufactured Material</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial#validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial#validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material Original Text Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial#validateImmunizationMedicationInformationManufacturedMaterialCodeTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material Code Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationMedicationInformationManufacturedMaterial#validateImmunizationMedicationInformationManufacturedMaterialLotNumberText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Medication Information Manufactured Material Lot Number Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ImmunizationMedicationInformationManufacturedMaterialTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText() {
		OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial> validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase = new OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial>(
			"validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformationManufacturedMaterial target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformationManufacturedMaterial target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.setOriginalText(DatatypesFactory.eINSTANCE.createED());
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalText(
					(ImmunizationMedicationInformationManufacturedMaterial) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference() {
		OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial> validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase = new OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial>(
			"validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_ORIGINAL_TEXT_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformationManufacturedMaterial target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				code.setOriginalText(ot);
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformationManufacturedMaterial target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				ED ot = DatatypesFactory.eINSTANCE.createED();
				TEL ref = DatatypesFactory.eINSTANCE.createTEL("test");
				ot.setReference(ref);
				code.setOriginalText(ot);
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReference(
					(ImmunizationMedicationInformationManufacturedMaterial) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialOriginalTextReferenceTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterialCodeTranslation() {
		OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial> validateImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase = new OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial>(
			"validateImmunizationMedicationInformationManufacturedMaterialCodeTranslation",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_CODE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformationManufacturedMaterial target) {
				target.init();
				CE code = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(code);
			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformationManufacturedMaterial target) {
				CE code = DatatypesFactory.eINSTANCE.createCE();
				code.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.setCode(code);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialCodeTranslation(
					(ImmunizationMedicationInformationManufacturedMaterial) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialCodeTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateImmunizationMedicationInformationManufacturedMaterialLotNumberText() {
		OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial> validateImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase = new OperationsTestCase<ImmunizationMedicationInformationManufacturedMaterial>(
			"validateImmunizationMedicationInformationManufacturedMaterialLotNumberText",
			operationsForOCL.getOCLValue("VALIDATE_IMMUNIZATION_MEDICATION_INFORMATION_MANUFACTURED_MATERIAL_LOT_NUMBER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ImmunizationMedicationInformationManufacturedMaterial target) {

			}

			@Override
			protected void updateToPass(ImmunizationMedicationInformationManufacturedMaterial target) {
				target.init();
				target.setLotNumberText(DatatypesFactory.eINSTANCE.createST());
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ImmunizationMedicationInformationManufacturedMaterialOperations.validateImmunizationMedicationInformationManufacturedMaterialLotNumberText(
					(ImmunizationMedicationInformationManufacturedMaterial) objectToTest, diagnostician, map);
			}

		};

		validateImmunizationMedicationInformationManufacturedMaterialLotNumberTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ImmunizationMedicationInformationManufacturedMaterialOperations {
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
	private static class ObjectFactory implements
			TestObjectFactory<ImmunizationMedicationInformationManufacturedMaterial> {
		public ImmunizationMedicationInformationManufacturedMaterial create() {
			return ConsolFactory.eINSTANCE.createImmunizationMedicationInformationManufacturedMaterial();
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
	private static class ConstructorTestClass extends ImmunizationMedicationInformationManufacturedMaterialOperations {
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

} // ImmunizationMedicationInformationManufacturedMaterialOperations
