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
import org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.HeartAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Heart Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessment#validateHeartAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Heart Assessment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HeartAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentTemplateId() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentTemplateIdTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentTemplateId(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentMoodCode() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentMoodCodeTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentMoodCode(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentCodeP() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentCodePTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentCodeP(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentCode() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentCodeTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(HeartAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.HeartAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentCode(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentEffectiveTime() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentEffectiveTimeTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentEffectiveTime(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentValue() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentValueTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentValue(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHeartAssessmentValueP() {
		OperationsTestCase<HeartAssessment> validateHeartAssessmentValuePTestCase = new OperationsTestCase<HeartAssessment>(
			"validateHeartAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_HEART_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HeartAssessment target) {

			}

			@Override
			protected void updateToPass(HeartAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HeartAssessmentOperations.validateHeartAssessmentValueP(
					(HeartAssessment) objectToTest, diagnostician, map);
			}

		};

		validateHeartAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HeartAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HeartAssessment> {
		public HeartAssessment create() {
			return EmspcrFactory.eINSTANCE.createHeartAssessment();
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
	private static class ConstructorTestClass extends HeartAssessmentOperations {
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

} // HeartAssessmentOperations
