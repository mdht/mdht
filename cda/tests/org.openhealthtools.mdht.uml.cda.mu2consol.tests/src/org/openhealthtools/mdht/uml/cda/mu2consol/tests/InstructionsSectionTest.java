/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.InstructionsSectionOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Instructions Section</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#validateMu2consolInstructionsSectionInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Mu2consol Instructions Section Instructions</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#getMu2consolInstructionss()
 * <em>Get Mu2consol Instructionss</em>}</li>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.mu2consol.InstructionsSection#validateInstructionsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Instructions Section Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class InstructionsSectionTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateMu2consolInstructionsSectionInstructions() {
		OperationsTestCase<InstructionsSection> validateMu2consolInstructionsSectionInstructionsTestCase = new OperationsTestCase<InstructionsSection>(
				"validateMu2consolInstructionsSectionInstructions",
				operationsForOCL
						.getOCLValue("VALIDATE_MU2CONSOL_INSTRUCTIONS_SECTION_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations
						.validateMu2consolInstructionsSectionInstructions(
								(InstructionsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateMu2consolInstructionsSectionInstructionsTestCase
				.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testGetMu2consolInstructionss() {

		InstructionsSection target = objectFactory.create();
		target.getMu2consolInstructionss();

	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateInstructionsSectionTemplateId() {
		OperationsTestCase<InstructionsSection> validateInstructionsSectionTemplateIdTestCase = new OperationsTestCase<InstructionsSection>(
				"validateInstructionsSectionTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_INSTRUCTIONS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(InstructionsSection target) {

			}

			@Override
			protected void updateToPass(InstructionsSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InstructionsSectionOperations
						.validateInstructionsSectionTemplateId(
								(InstructionsSection) objectToTest,
								diagnostician, map);
			}

		};

		validateInstructionsSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends InstructionsSectionOperations {
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
			TestObjectFactory<InstructionsSection> {

		@Override
		public InstructionsSection create() {
			return Mu2consolFactory.eINSTANCE.createInstructionsSection();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends
			InstructionsSectionOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // InstructionsSectionOperations
