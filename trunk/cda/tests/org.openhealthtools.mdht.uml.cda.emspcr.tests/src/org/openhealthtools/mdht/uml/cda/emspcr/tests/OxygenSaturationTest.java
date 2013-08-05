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
import org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.OxygenSaturationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Oxygen Saturation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OxygenSaturation#validateOxygenSaturationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Oxygen Saturation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OxygenSaturationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOxygenSaturationTemplateId() {
		OperationsTestCase<OxygenSaturation> validateOxygenSaturationTemplateIdTestCase = new OperationsTestCase<OxygenSaturation>(
			"validateOxygenSaturationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OXYGEN_SATURATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OxygenSaturation target) {

			}

			@Override
			protected void updateToPass(OxygenSaturation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OxygenSaturationOperations.validateOxygenSaturationTemplateId(
					(OxygenSaturation) objectToTest, diagnostician, map);
			}

		};

		validateOxygenSaturationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOxygenSaturationCode() {
		OperationsTestCase<OxygenSaturation> validateOxygenSaturationCodeTestCase = new OperationsTestCase<OxygenSaturation>(
			"validateOxygenSaturationCode",
			operationsForOCL.getOCLValue("VALIDATE_OXYGEN_SATURATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OxygenSaturation target) {

			}

			@Override
			protected void updateToPass(OxygenSaturation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OxygenSaturationOperations.validateOxygenSaturationCode(
					(OxygenSaturation) objectToTest, diagnostician, map);
			}

		};

		validateOxygenSaturationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOxygenSaturationValue() {
		OperationsTestCase<OxygenSaturation> validateOxygenSaturationValueTestCase = new OperationsTestCase<OxygenSaturation>(
			"validateOxygenSaturationValue",
			operationsForOCL.getOCLValue("VALIDATE_OXYGEN_SATURATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OxygenSaturation target) {

			}

			@Override
			protected void updateToPass(OxygenSaturation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OxygenSaturationOperations.validateOxygenSaturationValue(
					(OxygenSaturation) objectToTest, diagnostician, map);
			}

		};

		validateOxygenSaturationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOxygenSaturationMoodCode() {
		OperationsTestCase<OxygenSaturation> validateOxygenSaturationMoodCodeTestCase = new OperationsTestCase<OxygenSaturation>(
			"validateOxygenSaturationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OXYGEN_SATURATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OxygenSaturation target) {

			}

			@Override
			protected void updateToPass(OxygenSaturation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OxygenSaturationOperations.validateOxygenSaturationMoodCode(
					(OxygenSaturation) objectToTest, diagnostician, map);
			}

		};

		validateOxygenSaturationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OxygenSaturationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OxygenSaturation> {
		public OxygenSaturation create() {
			return EmspcrFactory.eINSTANCE.createOxygenSaturation();
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
	private static class ConstructorTestClass extends OxygenSaturationOperations {
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

} // OxygenSaturationOperations
