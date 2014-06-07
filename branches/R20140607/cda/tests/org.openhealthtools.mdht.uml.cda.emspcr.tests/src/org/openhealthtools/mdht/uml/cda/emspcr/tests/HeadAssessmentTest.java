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
import org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeadAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Head Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessment#validateHeadAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Head Assessment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeadAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentTemplateId() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentTemplateIdTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentTemplateId(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentMoodCode() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentMoodCodeTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentMoodCode(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentCodeP() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentCodePTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentCodeP(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentCode() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentCodeTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(HeadAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.HeadAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentCode(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentEffectiveTime() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentEffectiveTimeTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentEffectiveTime(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeadAssessmentValue() {
		OperationsTestCase<HeadAssessment> validateHeadAssessmentValueTestCase = new OperationsTestCase<HeadAssessment>(
			"validateHeadAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_HEAD_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeadAssessment target) {

			}

			@Override
			protected void updateToPass(HeadAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeadAssessmentOperations.validateHeadAssessmentValue(
					(HeadAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeadAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeadAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeadAssessment> {
		public HeadAssessment create() {
			return EmspcrFactory.eINSTANCE.createHeadAssessment();
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
	private static class ConstructorTestClass extends HeadAssessmentOperations {
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

} // HeadAssessmentOperations
