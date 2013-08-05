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

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.LastOralIntakeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Last Oral Intake</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LastOralIntake#validateLastOralIntakeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Last Oral Intake Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LastOralIntakeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLastOralIntakeTemplateId() {
		OperationsTestCase<LastOralIntake> validateLastOralIntakeTemplateIdTestCase = new OperationsTestCase<LastOralIntake>(
			"validateLastOralIntakeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LAST_ORAL_INTAKE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastOralIntake target) {

			}

			@Override
			protected void updateToPass(LastOralIntake target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastOralIntakeOperations.validateLastOralIntakeTemplateId(
					(LastOralIntake) objectToTest, diagnostician, map);
			}

		};

		validateLastOralIntakeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLastOralIntakeCodeP() {
		OperationsTestCase<LastOralIntake> validateLastOralIntakeCodePTestCase = new OperationsTestCase<LastOralIntake>(
			"validateLastOralIntakeCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LAST_ORAL_INTAKE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastOralIntake target) {

			}

			@Override
			protected void updateToPass(LastOralIntake target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastOralIntakeOperations.validateLastOralIntakeCodeP(
					(LastOralIntake) objectToTest, diagnostician, map);
			}

		};

		validateLastOralIntakeCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLastOralIntakeCode() {
		OperationsTestCase<LastOralIntake> validateLastOralIntakeCodeTestCase = new OperationsTestCase<LastOralIntake>(
			"validateLastOralIntakeCode",
			operationsForOCL.getOCLValue("VALIDATE_LAST_ORAL_INTAKE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastOralIntake target) {

			}

			@Override
			protected void updateToPass(LastOralIntake target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastOralIntakeOperations.validateLastOralIntakeCode(
					(LastOralIntake) objectToTest, diagnostician, map);
			}

		};

		validateLastOralIntakeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLastOralIntakeValue() {
		OperationsTestCase<LastOralIntake> validateLastOralIntakeValueTestCase = new OperationsTestCase<LastOralIntake>(
			"validateLastOralIntakeValue",
			operationsForOCL.getOCLValue("VALIDATE_LAST_ORAL_INTAKE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastOralIntake target) {

			}

			@Override
			protected void updateToPass(LastOralIntake target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastOralIntakeOperations.validateLastOralIntakeValue(
					(LastOralIntake) objectToTest, diagnostician, map);
			}

		};

		validateLastOralIntakeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLastOralIntakeMoodCode() {
		OperationsTestCase<LastOralIntake> validateLastOralIntakeMoodCodeTestCase = new OperationsTestCase<LastOralIntake>(
			"validateLastOralIntakeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LAST_ORAL_INTAKE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LastOralIntake target) {

			}

			@Override
			protected void updateToPass(LastOralIntake target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LastOralIntakeOperations.validateLastOralIntakeMoodCode(
					(LastOralIntake) objectToTest, diagnostician, map);
			}

		};

		validateLastOralIntakeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LastOralIntakeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LastOralIntake> {
		public LastOralIntake create() {
			return EmspcrFactory.eINSTANCE.createLastOralIntake();
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
	private static class ConstructorTestClass extends LastOralIntakeOperations {
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

} // LastOralIntakeOperations
