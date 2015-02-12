/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowMotorOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Motor</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor#validateGlasgowMotorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Motor Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor#validateGlasgowMotorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Motor Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor#validateGlasgowMotorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Motor Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor#validateGlasgowMotorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Motor Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotor#validateGlasgowMotorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Motor Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowMotorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowMotorTemplateId() {
		OperationsTestCase<GlasgowMotor> validateGlasgowMotorTemplateIdTestCase = new OperationsTestCase<GlasgowMotor>(
			"validateGlasgowMotorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_MOTOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowMotor target) {

			}

			@Override
			protected void updateToPass(GlasgowMotor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowMotorOperations.validateGlasgowMotorTemplateId(
					(GlasgowMotor) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowMotorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowMotorMoodCode() {
		OperationsTestCase<GlasgowMotor> validateGlasgowMotorMoodCodeTestCase = new OperationsTestCase<GlasgowMotor>(
			"validateGlasgowMotorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_MOTOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowMotor target) {

			}

			@Override
			protected void updateToPass(GlasgowMotor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowMotorOperations.validateGlasgowMotorMoodCode(
					(GlasgowMotor) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowMotorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowMotorCodeP() {
		OperationsTestCase<GlasgowMotor> validateGlasgowMotorCodePTestCase = new OperationsTestCase<GlasgowMotor>(
			"validateGlasgowMotorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_MOTOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowMotor target) {

			}

			@Override
			protected void updateToPass(GlasgowMotor target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowMotorOperations.validateGlasgowMotorCodeP((GlasgowMotor) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowMotorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowMotorCode() {
		OperationsTestCase<GlasgowMotor> validateGlasgowMotorCodeTestCase = new OperationsTestCase<GlasgowMotor>(
			"validateGlasgowMotorCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_MOTOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowMotor target) {

			}

			@Override
			protected void updateToPass(GlasgowMotor target) {
				target.init();

			}

			@Override
			protected void setDependency(GlasgowMotor target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.GlasgowMotorCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowMotorOperations.validateGlasgowMotorCode((GlasgowMotor) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowMotorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowMotorValue() {
		OperationsTestCase<GlasgowMotor> validateGlasgowMotorValueTestCase = new OperationsTestCase<GlasgowMotor>(
			"validateGlasgowMotorValue",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_MOTOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowMotor target) {

			}

			@Override
			protected void updateToPass(GlasgowMotor target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowMotorOperations.validateGlasgowMotorValue((GlasgowMotor) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowMotorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowMotorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowMotor> {
		public GlasgowMotor create() {
			return EmspcrFactory.eINSTANCE.createGlasgowMotor();
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
	private static class ConstructorTestClass extends GlasgowMotorOperations {
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

} // GlasgowMotorOperations
