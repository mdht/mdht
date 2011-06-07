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
import org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.AdmissionMedicationHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Admission Medication History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection#validateAdmissionMedicationHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.AdmissionMedicationHistorySection#validateAdmissionMedicationHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Admission Medication History Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdmissionMedicationHistorySectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationHistorySectionTemplateId() {
		OperationsTestCase<AdmissionMedicationHistorySection> validateAdmissionMedicationHistorySectionTemplateIdTestCase = new OperationsTestCase<AdmissionMedicationHistorySection>(
			"validateAdmissionMedicationHistorySectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationHistorySection target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationHistorySectionOperations.validateAdmissionMedicationHistorySectionTemplateId(
					(AdmissionMedicationHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationHistorySectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdmissionMedicationHistorySectionCode() {
		OperationsTestCase<AdmissionMedicationHistorySection> validateAdmissionMedicationHistorySectionCodeTestCase = new OperationsTestCase<AdmissionMedicationHistorySection>(
			"validateAdmissionMedicationHistorySectionCode",
			operationsForOCL.getOCLValue("VALIDATE_ADMISSION_MEDICATION_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdmissionMedicationHistorySection target) {

			}

			@Override
			protected void updateToPass(AdmissionMedicationHistorySection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdmissionMedicationHistorySectionOperations.validateAdmissionMedicationHistorySectionCode(
					(AdmissionMedicationHistorySection) objectToTest, diagnostician, map);
			}

		};

		validateAdmissionMedicationHistorySectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdmissionMedicationHistorySectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdmissionMedicationHistorySection> {

		public AdmissionMedicationHistorySection create() {
			return IHEFactory.eINSTANCE.createAdmissionMedicationHistorySection();
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
	private static class ConstructorTestClass extends AdmissionMedicationHistorySectionOperations {
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

} // AdmissionMedicationHistorySectionOperations
