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
import org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.OtherSymptomsOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Symptoms</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.OtherSymptoms#validateOtherSymptomsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Symptoms Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OtherSymptomsTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsTemplateId() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsTemplateIdTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsTemplateId(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsCodeP() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsCodePTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsCodeP(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsCode() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsCodeTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsCode(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsValue() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsValueTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsValue",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsValue(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsValueP() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsValuePTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsValueP",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsValueP(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOtherSymptomsMoodCode() {
		OperationsTestCase<OtherSymptoms> validateOtherSymptomsMoodCodeTestCase = new OperationsTestCase<OtherSymptoms>(
			"validateOtherSymptomsMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OTHER_SYMPTOMS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OtherSymptoms target) {

			}

			@Override
			protected void updateToPass(OtherSymptoms target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OtherSymptomsOperations.validateOtherSymptomsMoodCode(
					(OtherSymptoms) objectToTest, diagnostician, map);
			}

		};

		validateOtherSymptomsMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OtherSymptomsOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OtherSymptoms> {
		public OtherSymptoms create() {
			return EmspcrFactory.eINSTANCE.createOtherSymptoms();
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
	private static class ConstructorTestClass extends OtherSymptomsOperations {
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

} // OtherSymptomsOperations
