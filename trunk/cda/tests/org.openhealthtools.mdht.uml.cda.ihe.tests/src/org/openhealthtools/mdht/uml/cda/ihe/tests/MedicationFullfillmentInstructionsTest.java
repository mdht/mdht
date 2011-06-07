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
import org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.ihe.operations.MedicationFullfillmentInstructionsOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Fullfillment Instructions</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.MedicationFullfillmentInstructions#validateMedicationFullfillmentInstructionsText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Fullfillment Instructions Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MedicationFullfillmentInstructionsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFullfillmentInstructionsTemplateId() {
		OperationsTestCase<MedicationFullfillmentInstructions> validateMedicationFullfillmentInstructionsTemplateIdTestCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"validateMedicationFullfillmentInstructionsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {

			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsTemplateId(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFullfillmentInstructionsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFullfillmentInstructionsCode() {
		OperationsTestCase<MedicationFullfillmentInstructions> validateMedicationFullfillmentInstructionsCodeTestCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"validateMedicationFullfillmentInstructionsCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {

			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsCode(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFullfillmentInstructionsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMedicationFullfillmentInstructionsStatusCode() {
		OperationsTestCase<MedicationFullfillmentInstructions> validateMedicationFullfillmentInstructionsStatusCodeTestCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"validateMedicationFullfillmentInstructionsStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {

			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsStatusCode(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFullfillmentInstructionsStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidateMedicationFullfillmentInstructionsText() {
		OperationsTestCase<MedicationFullfillmentInstructions> validateMedicationFullfillmentInstructionsTextTestCase = new OperationsTestCase<MedicationFullfillmentInstructions>(
			"validateMedicationFullfillmentInstructionsText",
			operationsForOCL.getOCLValue("VALIDATE_MEDICATION_FULLFILLMENT_INSTRUCTIONS_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MedicationFullfillmentInstructions target) {
				target.init();
			}

			@Override
			protected void updateToPass(MedicationFullfillmentInstructions target) {

				ED instruction = DatatypesFactory.eINSTANCE.createED("instruction");
				target.setText(instruction);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MedicationFullfillmentInstructionsOperations.validateMedicationFullfillmentInstructionsText(
					(MedicationFullfillmentInstructions) objectToTest, diagnostician, map);
			}

		};

		validateMedicationFullfillmentInstructionsTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MedicationFullfillmentInstructionsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MedicationFullfillmentInstructions> {

		public MedicationFullfillmentInstructions create() {
			return IHEFactory.eINSTANCE.createMedicationFullfillmentInstructions();
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
	private static class ConstructorTestClass extends MedicationFullfillmentInstructionsOperations {
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

} // MedicationFullfillmentInstructionsOperations
