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
import org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.StrokeScoreOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Stroke Score</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.StrokeScore#validateStrokeScoreMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Stroke Score Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class StrokeScoreTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreTemplateId() {
		OperationsTestCase<StrokeScore> validateStrokeScoreTemplateIdTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreTemplateId(
					(StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreCodeP() {
		OperationsTestCase<StrokeScore> validateStrokeScoreCodePTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreCodeP",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreCodeP((StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreCode() {
		OperationsTestCase<StrokeScore> validateStrokeScoreCodeTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreCode",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreCode((StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreValue() {
		OperationsTestCase<StrokeScore> validateStrokeScoreValueTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreValue",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreValue((StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreValueP() {
		OperationsTestCase<StrokeScore> validateStrokeScoreValuePTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreValueP",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreValueP((StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreMethodCode() {
		OperationsTestCase<StrokeScore> validateStrokeScoreMethodCodeTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreMethodCode",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreMethodCode(
					(StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreMethodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreMethodCodeP() {
		OperationsTestCase<StrokeScore> validateStrokeScoreMethodCodePTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreMethodCodeP",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreMethodCodeP(
					(StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreMethodCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreEffectiveTime() {
		OperationsTestCase<StrokeScore> validateStrokeScoreEffectiveTimeTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreEffectiveTime(
					(StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateStrokeScoreMoodCode() {
		OperationsTestCase<StrokeScore> validateStrokeScoreMoodCodeTestCase = new OperationsTestCase<StrokeScore>(
			"validateStrokeScoreMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_STROKE_SCORE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(StrokeScore target) {

			}

			@Override
			protected void updateToPass(StrokeScore target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return StrokeScoreOperations.validateStrokeScoreMoodCode((StrokeScore) objectToTest, diagnostician, map);
			}

		};

		validateStrokeScoreMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends StrokeScoreOperations {
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
	private static class ObjectFactory implements TestObjectFactory<StrokeScore> {
		public StrokeScore create() {
			return EmspcrFactory.eINSTANCE.createStrokeScore();
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
	private static class ConstructorTestClass extends StrokeScoreOperations {
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

} // StrokeScoreOperations
