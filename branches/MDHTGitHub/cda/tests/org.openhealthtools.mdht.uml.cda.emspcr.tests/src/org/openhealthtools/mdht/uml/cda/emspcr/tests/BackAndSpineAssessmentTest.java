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
import org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.BackAndSpineAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Back And Spine Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessment#validateBackAndSpineAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Back And Spine Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class BackAndSpineAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentTemplateId() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentTemplateIdTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTemplateId(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentMoodCode() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentMoodCodeTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentMoodCode(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentCodeP() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentCodePTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentCodeP(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentCode() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentCodeTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(BackAndSpineAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.BackAndSpineAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentCode(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentEffectiveTime() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentEffectiveTimeTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentEffectiveTime(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentValue() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentValueTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentValue(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentValueP() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentValuePTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentValueP(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentTargetSiteCode() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentTargetSiteCodeTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTargetSiteCode(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateBackAndSpineAssessmentTargetSiteCodeP() {
		OperationsTestCase<BackAndSpineAssessment> validateBackAndSpineAssessmentTargetSiteCodePTestCase = new OperationsTestCase<BackAndSpineAssessment>(
			"validateBackAndSpineAssessmentTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_BACK_AND_SPINE_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(BackAndSpineAssessment target) {

			}

			@Override
			protected void updateToPass(BackAndSpineAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return BackAndSpineAssessmentOperations.validateBackAndSpineAssessmentTargetSiteCodeP(
					(BackAndSpineAssessment) objectToTest, diagnostician, map);
			}

		};

		validateBackAndSpineAssessmentTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends BackAndSpineAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<BackAndSpineAssessment> {
		public BackAndSpineAssessment create() {
			return EmspcrFactory.eINSTANCE.createBackAndSpineAssessment();
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
	private static class ConstructorTestClass extends BackAndSpineAssessmentOperations {
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

} // BackAndSpineAssessmentOperations
