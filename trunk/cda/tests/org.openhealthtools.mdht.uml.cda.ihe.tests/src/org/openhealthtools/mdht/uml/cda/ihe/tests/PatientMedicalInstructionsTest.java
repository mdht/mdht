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
import org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientMedicalInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Medical Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientMedicalInstructions#validatePatientMedicalInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Medical Instructions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientMedicalInstructionsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientMedicalInstructionsTemplateId() {
		OperationsTestCase<PatientMedicalInstructions> validatePatientMedicalInstructionsTemplateIdTestCase = new OperationsTestCase<PatientMedicalInstructions>(
			"validatePatientMedicalInstructionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsTemplateId(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		validatePatientMedicalInstructionsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientMedicalInstructionsClassCode() {
		OperationsTestCase<PatientMedicalInstructions> validatePatientMedicalInstructionsClassCodeTestCase = new OperationsTestCase<PatientMedicalInstructions>(
			"validatePatientMedicalInstructionsClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsClassCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		validatePatientMedicalInstructionsClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientMedicalInstructionsCode() {
		OperationsTestCase<PatientMedicalInstructions> validatePatientMedicalInstructionsCodeTestCase = new OperationsTestCase<PatientMedicalInstructions>(
			"validatePatientMedicalInstructionsCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		validatePatientMedicalInstructionsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientMedicalInstructionsStatusCode() {
		OperationsTestCase<PatientMedicalInstructions> validatePatientMedicalInstructionsStatusCodeTestCase = new OperationsTestCase<PatientMedicalInstructions>(
			"validatePatientMedicalInstructionsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {

			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsStatusCode(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		validatePatientMedicalInstructionsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientMedicalInstructionsText() {
		OperationsTestCase<PatientMedicalInstructions> validatePatientMedicalInstructionsTextTestCase = new OperationsTestCase<PatientMedicalInstructions>(
			"validatePatientMedicalInstructionsText",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_MEDICAL_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientMedicalInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientMedicalInstructions target) {
				ED text = DatatypesFactory.eINSTANCE.createED("text");
				target.setText(text);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientMedicalInstructionsOperations.validatePatientMedicalInstructionsText(
					(PatientMedicalInstructions) objectToTest, diagnostician, map);
			}

		};

		validatePatientMedicalInstructionsTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientMedicalInstructionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientMedicalInstructions> {

		public PatientMedicalInstructions create() {
			return IHEFactory.eINSTANCE.createPatientMedicalInstructions();
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
	private static class ConstructorTestClass extends PatientMedicalInstructionsOperations {
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

} // PatientMedicalInstructionsOperations
