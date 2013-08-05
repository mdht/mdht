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
import org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.NeurologicalAssessmentOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neurological Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.NeurologicalAssessment#validateNeurologicalAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurological Assessment Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class NeurologicalAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentTemplateId() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentTemplateIdTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentTemplateId(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentCodeP() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentCodePTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentCodeP(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentCode() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentCodeTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentCode(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentValue() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentValueTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentValue(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentValueP() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentValuePTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentValueP",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentValueP(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateNeurologicalAssessmentMoodCode() {
		OperationsTestCase<NeurologicalAssessment> validateNeurologicalAssessmentMoodCodeTestCase = new OperationsTestCase<NeurologicalAssessment>(
			"validateNeurologicalAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_NEUROLOGICAL_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(NeurologicalAssessment target) {

			}

			@Override
			protected void updateToPass(NeurologicalAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return NeurologicalAssessmentOperations.validateNeurologicalAssessmentMoodCode(
					(NeurologicalAssessment) objectToTest, diagnostician, map);
			}

		};

		validateNeurologicalAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends NeurologicalAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<NeurologicalAssessment> {
		public NeurologicalAssessment create() {
			return EmspcrFactory.eINSTANCE.createNeurologicalAssessment();
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
	private static class ConstructorTestClass extends NeurologicalAssessmentOperations {
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

} // NeurologicalAssessmentOperations
