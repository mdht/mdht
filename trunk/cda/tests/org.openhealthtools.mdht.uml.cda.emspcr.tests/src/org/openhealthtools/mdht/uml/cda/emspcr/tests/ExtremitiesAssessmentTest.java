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
import org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExtremitiesAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extremities Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExtremitiesAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentTemplateId() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentTemplateIdTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTemplateId(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentMoodCode() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentMoodCodeTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentMoodCode(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentCodeP() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentCodePTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentCodeP(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentCode() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentCodeTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(ExtremitiesAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentCode(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentEffectiveTime() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentEffectiveTimeTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentEffectiveTime(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentValue() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentValueTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentValue(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentTargetSiteCode() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentTargetSiteCodeTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTargetSiteCode(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExtremitiesAssessmentTargetSiteCodeP() {
		OperationsTestCase<ExtremitiesAssessment> validateExtremitiesAssessmentTargetSiteCodePTestCase = new OperationsTestCase<ExtremitiesAssessment>(
			"validateExtremitiesAssessmentTargetSiteCodeP",
			operationsForOCL.getOCLValue("VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExtremitiesAssessment target) {

			}

			@Override
			protected void updateToPass(ExtremitiesAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExtremitiesAssessmentOperations.validateExtremitiesAssessmentTargetSiteCodeP(
					(ExtremitiesAssessment) objectToTest, diagnostician, map);
			}

		};

		validateExtremitiesAssessmentTargetSiteCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExtremitiesAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExtremitiesAssessment> {
		public ExtremitiesAssessment create() {
			return EmspcrFactory.eINSTANCE.createExtremitiesAssessment();
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
	private static class ConstructorTestClass extends ExtremitiesAssessmentOperations {
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

} // ExtremitiesAssessmentOperations
