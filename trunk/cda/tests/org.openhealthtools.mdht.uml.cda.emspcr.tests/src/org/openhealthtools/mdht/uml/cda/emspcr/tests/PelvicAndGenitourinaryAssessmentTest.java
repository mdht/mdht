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
import org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PelvicAndGenitourinaryAssessmentOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pelvic And Genitourinary Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PelvicAndGenitourinaryAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentTemplateId() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentTemplateIdTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentTemplateId(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentCode() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentCodeTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentCode(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentValue() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentValueTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentValue(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentValueP() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentValuePTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentValueP(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentEffectiveTime() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentEffectiveTimeTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentEffectiveTime(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePelvicAndGenitourinaryAssessmentMoodCode() {
		OperationsTestCase<PelvicAndGenitourinaryAssessment> validatePelvicAndGenitourinaryAssessmentMoodCodeTestCase = new OperationsTestCase<PelvicAndGenitourinaryAssessment>(
			"validatePelvicAndGenitourinaryAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PelvicAndGenitourinaryAssessment target) {

			}

			@Override
			protected void updateToPass(PelvicAndGenitourinaryAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PelvicAndGenitourinaryAssessmentOperations.validatePelvicAndGenitourinaryAssessmentMoodCode(
					(PelvicAndGenitourinaryAssessment) objectToTest, diagnostician, map);
			}

		};

		validatePelvicAndGenitourinaryAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PelvicAndGenitourinaryAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PelvicAndGenitourinaryAssessment> {
		public PelvicAndGenitourinaryAssessment create() {
			return EmspcrFactory.eINSTANCE.createPelvicAndGenitourinaryAssessment();
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
	private static class ConstructorTestClass extends PelvicAndGenitourinaryAssessmentOperations {
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

} // PelvicAndGenitourinaryAssessmentOperations
