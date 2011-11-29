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
import org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalAdmissionMedicationsSectionEntriesOptionalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Admission Medications Section Entries Optional</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalAdmissionMedicationsSectionEntriesOptional#validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Admission Medications Section Entries Optional Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalAdmissionMedicationsSectionEntriesOptionalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateId(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalAdmissionMedicationsSectionEntriesOptionalCode() {
		OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional> validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase = new OperationsTestCase<HospitalAdmissionMedicationsSectionEntriesOptional>(
			"validateHospitalAdmissionMedicationsSectionEntriesOptionalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_ADMISSION_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalAdmissionMedicationsSectionEntriesOptional target) {

			}

			@Override
			protected void updateToPass(HospitalAdmissionMedicationsSectionEntriesOptional target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalAdmissionMedicationsSectionEntriesOptionalOperations.validateHospitalAdmissionMedicationsSectionEntriesOptionalCode(
					(HospitalAdmissionMedicationsSectionEntriesOptional) objectToTest, diagnostician, map);
			}

		};

		validateHospitalAdmissionMedicationsSectionEntriesOptionalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalAdmissionMedicationsSectionEntriesOptional> {
		public HospitalAdmissionMedicationsSectionEntriesOptional create() {
			return ConsolFactory.eINSTANCE.createHospitalAdmissionMedicationsSectionEntriesOptional();
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
	private static class ConstructorTestClass extends HospitalAdmissionMedicationsSectionEntriesOptionalOperations {
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

} // HospitalAdmissionMedicationsSectionEntriesOptionalOperations
