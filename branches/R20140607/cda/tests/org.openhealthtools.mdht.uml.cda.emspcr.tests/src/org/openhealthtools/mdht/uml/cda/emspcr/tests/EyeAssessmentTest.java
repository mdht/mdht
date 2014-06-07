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
import org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EyeAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Eye Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessment#validateEyeAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Eye Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EyeAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentTemplateId() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentTemplateIdTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentTemplateId(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentMoodCode() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentMoodCodeTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentMoodCode(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentCodeP() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentCodePTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentCodeP(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentCode() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentCodeTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(EyeAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.EyeAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentCode(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentEffectiveTime() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentEffectiveTimeTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentEffectiveTime(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentValue() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentValueTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentValue(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentValueP() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentValuePTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentValueP(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentTargetSiteCode() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentTargetSiteCodeTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentTargetSiteCode(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEyeAssessmentTargetSiteCodeP() {
		OperationsTestCase<EyeAssessment> validateEyeAssessmentTargetSiteCodePTestCase = new OperationsTestCase<EyeAssessment>(
			"validateEyeAssessmentTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EYE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EyeAssessment target) {

			}

			@Override
			protected void updateToPass(EyeAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EyeAssessmentOperations.validateEyeAssessmentTargetSiteCodeP(
					(EyeAssessment) objectToTest, diagnostician, map);
			}

		};

		validateEyeAssessmentTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EyeAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EyeAssessment> {
		public EyeAssessment create() {
			return EmspcrFactory.eINSTANCE.createEyeAssessment();
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
	private static class ConstructorTestClass extends EyeAssessmentOperations {
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

} // EyeAssessmentOperations
