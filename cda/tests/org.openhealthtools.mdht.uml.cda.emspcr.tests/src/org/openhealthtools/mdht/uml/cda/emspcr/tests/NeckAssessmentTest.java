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
import org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.NeckAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neck Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment#validateNeckAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neck Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment#validateNeckAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neck Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment#validateNeckAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neck Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment#validateNeckAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neck Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeckAssessment#validateNeckAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neck Assessment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NeckAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeckAssessmentTemplateId() {
		OperationsTestCase<NeckAssessment> validateNeckAssessmentTemplateIdTestCase = new OperationsTestCase<NeckAssessment>(
			"validateNeckAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NECK_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeckAssessment target) {

			}

			@Override
			protected void updateToPass(NeckAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeckAssessmentOperations.validateNeckAssessmentTemplateId(
					(NeckAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeckAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeckAssessmentMoodCode() {
		OperationsTestCase<NeckAssessment> validateNeckAssessmentMoodCodeTestCase = new OperationsTestCase<NeckAssessment>(
			"validateNeckAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NECK_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeckAssessment target) {

			}

			@Override
			protected void updateToPass(NeckAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeckAssessmentOperations.validateNeckAssessmentMoodCode(
					(NeckAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeckAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeckAssessmentCode() {
		OperationsTestCase<NeckAssessment> validateNeckAssessmentCodeTestCase = new OperationsTestCase<NeckAssessment>(
			"validateNeckAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_NECK_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeckAssessment target) {

			}

			@Override
			protected void updateToPass(NeckAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeckAssessmentOperations.validateNeckAssessmentCode(
					(NeckAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeckAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeckAssessmentEffectiveTime() {
		OperationsTestCase<NeckAssessment> validateNeckAssessmentEffectiveTimeTestCase = new OperationsTestCase<NeckAssessment>(
			"validateNeckAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_NECK_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeckAssessment target) {

			}

			@Override
			protected void updateToPass(NeckAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeckAssessmentOperations.validateNeckAssessmentEffectiveTime(
					(NeckAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeckAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeckAssessmentValue() {
		OperationsTestCase<NeckAssessment> validateNeckAssessmentValueTestCase = new OperationsTestCase<NeckAssessment>(
			"validateNeckAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_NECK_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeckAssessment target) {

			}

			@Override
			protected void updateToPass(NeckAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeckAssessmentOperations.validateNeckAssessmentValue(
					(NeckAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeckAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NeckAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NeckAssessment> {
		public NeckAssessment create() {
			return EmspcrFactory.eINSTANCE.createNeckAssessment();
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
	private static class ConstructorTestClass extends NeckAssessmentOperations {
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

} // NeckAssessmentOperations
