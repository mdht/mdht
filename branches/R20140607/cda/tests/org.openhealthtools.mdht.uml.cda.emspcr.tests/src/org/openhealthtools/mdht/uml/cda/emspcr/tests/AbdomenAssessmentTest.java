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
import org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.AbdomenAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Abdomen Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AbdomenAssessment#validateAbdomenAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Abdomen Assessment Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AbdomenAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentTemplateId() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentTemplateIdTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentTemplateId(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentMoodCode() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentMoodCodeTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentMoodCode(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentCode() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentCodeTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentCode(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentEffectiveTime() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentEffectiveTimeTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentEffectiveTime(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentValue() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentValueTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentValue(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAbdomenAssessmentTargetSiteCode() {
		OperationsTestCase<AbdomenAssessment> validateAbdomenAssessmentTargetSiteCodeTestCase = new OperationsTestCase<AbdomenAssessment>(
			"validateAbdomenAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_ABDOMEN_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AbdomenAssessment target) {

			}

			@Override
			protected void updateToPass(AbdomenAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AbdomenAssessmentOperations.validateAbdomenAssessmentTargetSiteCode(
					(AbdomenAssessment) objectToTest, diagnostician, map);
			}

		};

		validateAbdomenAssessmentTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AbdomenAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AbdomenAssessment> {
		public AbdomenAssessment create() {
			return EmspcrFactory.eINSTANCE.createAbdomenAssessment();
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
	private static class ConstructorTestClass extends AbdomenAssessmentOperations {
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

} // AbdomenAssessmentOperations
