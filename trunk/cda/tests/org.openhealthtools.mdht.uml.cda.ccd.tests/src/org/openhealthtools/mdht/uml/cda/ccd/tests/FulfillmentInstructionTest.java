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
import org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction;

import org.openhealthtools.mdht.uml.cda.ccd.operations.FulfillmentInstructionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fulfillment Instruction</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction#validateFulfillmentInstructionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fulfillment Instruction Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.FulfillmentInstruction#validateFulfillmentInstructionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fulfillment Instruction Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FulfillmentInstructionTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateFulfillmentInstructionTemplateId() {
		OperationsTestCase<FulfillmentInstruction> validateFulfillmentInstructionTemplateIdTestCase = new OperationsTestCase<FulfillmentInstruction>(
				"validateFulfillmentInstructionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_FULFILLMENT_INSTRUCTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FulfillmentInstruction target) {

			}

			@Override
			protected void updateToPass(FulfillmentInstruction target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FulfillmentInstructionOperations
						.validateFulfillmentInstructionTemplateId(
								(FulfillmentInstruction) objectToTest,
								diagnostician, map);
			}

		};

		validateFulfillmentInstructionTemplateIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidateFulfillmentInstructionMoodCode() {
		OperationsTestCase<FulfillmentInstruction> validateFulfillmentInstructionMoodCodeTestCase = new OperationsTestCase<FulfillmentInstruction>(
				"validateFulfillmentInstructionMoodCode",
				operationsForOCL
						.getOCLValue("VALIDATE_FULFILLMENT_INSTRUCTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(FulfillmentInstruction target) {

			}

			@Override
			protected void updateToPass(FulfillmentInstruction target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FulfillmentInstructionOperations
						.validateFulfillmentInstructionMoodCode(
								(FulfillmentInstruction) objectToTest,
								diagnostician, map);
			}

		};

		validateFulfillmentInstructionMoodCodeTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends
			FulfillmentInstructionOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
			TestObjectFactory<FulfillmentInstruction> {
		public FulfillmentInstruction create() {
			return CCDFactory.eINSTANCE.createFulfillmentInstruction();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // FulfillmentInstructionOperations