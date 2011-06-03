/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction;
import org.openhealthtools.mdht.uml.cda.ccd.operations.PatientInstructionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Patient Instruction</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction#validatePatientInstructionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Instruction Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PatientInstruction#validatePatientInstructionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Instruction Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientInstructionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientInstructionTemplateId() {
		OperationsTestCase<PatientInstruction> validatePatientInstructionTemplateIdTestCase = new OperationsTestCase<PatientInstruction>(
			"validatePatientInstructionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientInstruction target) {

			}

			@Override
			protected void updateToPass(PatientInstruction target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientInstructionOperations.validatePatientInstructionTemplateId(
					(PatientInstruction) objectToTest, diagnostician, map);
			}

		};

		validatePatientInstructionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidatePatientInstructionMoodCode() {
		OperationsTestCase<PatientInstruction> validatePatientInstructionMoodCodeTestCase = new OperationsTestCase<PatientInstruction>(
			"validatePatientInstructionMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientInstruction target) {

			}

			@Override
			protected void updateToPass(PatientInstruction target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientInstructionOperations.validatePatientInstructionMoodCode(
					(PatientInstruction) objectToTest, diagnostician, map);
			}

		};

		validatePatientInstructionMoodCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends PatientInstructionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientInstruction> {
		public PatientInstruction create() {
			return CCDFactory.eINSTANCE.createPatientInstruction();
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
	private static class ConstructorTestClass extends PatientInstructionOperations {
	}

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

} // PatientInstructionOperations
