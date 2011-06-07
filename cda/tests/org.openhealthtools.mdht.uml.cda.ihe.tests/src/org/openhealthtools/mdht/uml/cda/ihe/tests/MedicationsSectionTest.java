/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.Medication;
import org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medications Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection#validateIHEMedicationsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Medications Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection#validateIHEMedicationsSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate IHE Medications Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationsSection#getMedications() <em>Get Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationsSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIHEMedicationsSectionTemplateId() {
		OperationsTestCase<MedicationsSection> validateIHEMedicationsSectionTemplateIdTestCase = new OperationsTestCase<MedicationsSection>(
			"validateIHEMedicationsSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_IHE_MEDICATIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {

			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateIHEMedicationsSectionTemplateId(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateIHEMedicationsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateIHEMedicationsSectionMedication() {
		OperationsTestCase<MedicationsSection> validateIHEMedicationsSectionMedicationTestCase = new OperationsTestCase<MedicationsSection>(
			"validateIHEMedicationsSectionMedication",
			operationsForOCL.getOCLValue("VALIDATE_IHE_MEDICATIONS_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationsSection target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationsSection target) {
				Medication sa = IHEFactory.eINSTANCE.createNormalDose().init();
				target.addSubstanceAdministration(sa);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationsSectionOperations.validateIHEMedicationsSectionMedication(
					(MedicationsSection) objectToTest, diagnostician, map);
			}

		};

		validateIHEMedicationsSectionMedicationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationsSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationsSection> {

		public MedicationsSection create() {
			return IHEFactory.eINSTANCE.createMedicationsSection();
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
	private static class ConstructorTestClass extends MedicationsSectionOperations {
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

} // MedicationsSectionOperations
