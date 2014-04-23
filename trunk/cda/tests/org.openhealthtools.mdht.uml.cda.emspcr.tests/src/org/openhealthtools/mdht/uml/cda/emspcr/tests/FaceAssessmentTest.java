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
import org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.FaceAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Face Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessment#validateFaceAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Face Assessment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FaceAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentTemplateId() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentTemplateIdTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentTemplateId(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentMoodCode() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentMoodCodeTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentMoodCode(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentCodeP() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentCodePTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentCodeP(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentCode() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentCodeTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(FaceAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.FaceAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentCode(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentEffectiveTime() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentEffectiveTimeTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentEffectiveTime(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentValue() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentValueTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentValue(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFaceAssessmentValueP() {
		OperationsTestCase<FaceAssessment> validateFaceAssessmentValuePTestCase = new OperationsTestCase<FaceAssessment>(
			"validateFaceAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_FACE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FaceAssessment target) {

			}

			@Override
			protected void updateToPass(FaceAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FaceAssessmentOperations.validateFaceAssessmentValueP(
					(FaceAssessment) objectToTest, diagnostician, map);
			}

		};

		validateFaceAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FaceAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FaceAssessment> {
		public FaceAssessment create() {
			return EmspcrFactory.eINSTANCE.createFaceAssessment();
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
	private static class ConstructorTestClass extends FaceAssessmentOperations {
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

} // FaceAssessmentOperations
