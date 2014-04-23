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
import org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ChestAndLungsAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chest And Lungs Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ChestAndLungsAssessment#validateChestAndLungsAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chest And Lungs Assessment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ChestAndLungsAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestAndLungsAssessmentTemplateId() {
		OperationsTestCase<ChestAndLungsAssessment> validateChestAndLungsAssessmentTemplateIdTestCase = new OperationsTestCase<ChestAndLungsAssessment>(
			"validateChestAndLungsAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestAndLungsAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAndLungsAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentTemplateId(
					(ChestAndLungsAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAndLungsAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestAndLungsAssessmentMoodCode() {
		OperationsTestCase<ChestAndLungsAssessment> validateChestAndLungsAssessmentMoodCodeTestCase = new OperationsTestCase<ChestAndLungsAssessment>(
			"validateChestAndLungsAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestAndLungsAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAndLungsAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentMoodCode(
					(ChestAndLungsAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAndLungsAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestAndLungsAssessmentCode() {
		OperationsTestCase<ChestAndLungsAssessment> validateChestAndLungsAssessmentCodeTestCase = new OperationsTestCase<ChestAndLungsAssessment>(
			"validateChestAndLungsAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestAndLungsAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAndLungsAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentCode(
					(ChestAndLungsAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAndLungsAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestAndLungsAssessmentEffectiveTime() {
		OperationsTestCase<ChestAndLungsAssessment> validateChestAndLungsAssessmentEffectiveTimeTestCase = new OperationsTestCase<ChestAndLungsAssessment>(
			"validateChestAndLungsAssessmentEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestAndLungsAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAndLungsAssessment target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentEffectiveTime(
					(ChestAndLungsAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAndLungsAssessmentEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateChestAndLungsAssessmentValue() {
		OperationsTestCase<ChestAndLungsAssessment> validateChestAndLungsAssessmentValueTestCase = new OperationsTestCase<ChestAndLungsAssessment>(
			"validateChestAndLungsAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_CHEST_AND_LUNGS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ChestAndLungsAssessment target) {

			}

			@Override
			protected void updateToPass(ChestAndLungsAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ChestAndLungsAssessmentOperations.validateChestAndLungsAssessmentValue(
					(ChestAndLungsAssessment) objectToTest, diagnostician, map);
			}

		};

		validateChestAndLungsAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ChestAndLungsAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ChestAndLungsAssessment> {
		public ChestAndLungsAssessment create() {
			return EmspcrFactory.eINSTANCE.createChestAndLungsAssessment();
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
	private static class ConstructorTestClass extends ChestAndLungsAssessmentOperations {
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

} // ChestAndLungsAssessmentOperations
