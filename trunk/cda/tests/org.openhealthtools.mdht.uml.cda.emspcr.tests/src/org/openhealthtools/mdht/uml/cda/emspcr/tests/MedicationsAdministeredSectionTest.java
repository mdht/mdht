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

import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.StrucDocText;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.MedicationsAdministeredSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Administered Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#validateEMSPCRMedicationsAdministeredSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Medications Administered Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#validateEMSPCRMedicationsAdministeredSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Medications Administered Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#validateEMSPCRMedicationsAdministeredSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Medications Administered Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#validateEMSPCRMedicationsAdministeredSectionMedicationAdministered(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate EMSPCR Medications Administered Section Medication Administered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#getMedicationAdministered() <em>Get Medication Administered</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MedicationsAdministeredSection#validateMedicationsAdministeredSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Administered Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsAdministeredSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRMedicationsAdministeredSectionCode() {
		OperationsTestCase<MedicationsAdministeredSection> validateEMSPCRMedicationsAdministeredSectionCodeTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateEMSPCRMedicationsAdministeredSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_MEDICATIONS_ADMINISTERED_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionCode(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRMedicationsAdministeredSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRMedicationsAdministeredSectionTitle() {
		OperationsTestCase<MedicationsAdministeredSection> validateEMSPCRMedicationsAdministeredSectionTitleTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateEMSPCRMedicationsAdministeredSectionTitle",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_MEDICATIONS_ADMINISTERED_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

				ST title = DatatypesFactory.eINSTANCE.createST("title");
				target.setTitle(title);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionTitle(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRMedicationsAdministeredSectionTitleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRMedicationsAdministeredSectionText() {
		OperationsTestCase<MedicationsAdministeredSection> validateEMSPCRMedicationsAdministeredSectionTextTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateEMSPCRMedicationsAdministeredSectionText",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_MEDICATIONS_ADMINISTERED_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

				StrucDocText text = CDAFactory.eINSTANCE.createStrucDocText();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionText(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRMedicationsAdministeredSectionTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEMSPCRMedicationsAdministeredSectionMedicationAdministered() {
		OperationsTestCase<MedicationsAdministeredSection> validateEMSPCRMedicationsAdministeredSectionMedicationAdministeredTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateEMSPCRMedicationsAdministeredSectionMedicationAdministered",
			operationsForOCL.getOCLValue("VALIDATE_EMSPCR_MEDICATIONS_ADMINISTERED_SECTION_MEDICATION_ADMINISTERED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateEMSPCRMedicationsAdministeredSectionMedicationAdministered(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateEMSPCRMedicationsAdministeredSectionMedicationAdministeredTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetMedicationAdministered() {

		MedicationsAdministeredSection target = objectFactory.create();
		target.getMedicationAdministered();

	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationsAdministeredSectionTemplateId() {
		OperationsTestCase<MedicationsAdministeredSection> validateMedicationsAdministeredSectionTemplateIdTestCase = new OperationsTestCase<MedicationsAdministeredSection>(
			"validateMedicationsAdministeredSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATIONS_ADMINISTERED_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsAdministeredSection target) {

			}

			@Override
			protected void updateToPass(MedicationsAdministeredSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsAdministeredSectionOperations.validateMedicationsAdministeredSectionTemplateId(
					(MedicationsAdministeredSection) objectToTest, diagnostician, map);
			}

		};

		validateMedicationsAdministeredSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsAdministeredSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsAdministeredSection> {
		public MedicationsAdministeredSection create() {
			return EmspcrFactory.eINSTANCE.createMedicationsAdministeredSection();
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
	private static class ConstructorTestClass extends MedicationsAdministeredSectionOperations {
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

} // MedicationsAdministeredSectionOperations
