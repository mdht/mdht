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
import org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.MentalStatusAssessmentOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mental Status Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessment#validateMentalStatusAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mental Status Assessment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MentalStatusAssessmentTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusAssessmentTemplateId() {
		OperationsTestCase<MentalStatusAssessment> validateMentalStatusAssessmentTemplateIdTestCase = new OperationsTestCase<MentalStatusAssessment>(
			"validateMentalStatusAssessmentTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusAssessment target) {

			}

			@Override
			protected void updateToPass(MentalStatusAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusAssessmentOperations.validateMentalStatusAssessmentTemplateId(
					(MentalStatusAssessment) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusAssessmentTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusAssessmentMoodCode() {
		OperationsTestCase<MentalStatusAssessment> validateMentalStatusAssessmentMoodCodeTestCase = new OperationsTestCase<MentalStatusAssessment>(
			"validateMentalStatusAssessmentMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusAssessment target) {

			}

			@Override
			protected void updateToPass(MentalStatusAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusAssessmentOperations.validateMentalStatusAssessmentMoodCode(
					(MentalStatusAssessment) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusAssessmentMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusAssessmentCodeP() {
		OperationsTestCase<MentalStatusAssessment> validateMentalStatusAssessmentCodePTestCase = new OperationsTestCase<MentalStatusAssessment>(
			"validateMentalStatusAssessmentCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusAssessment target) {

			}

			@Override
			protected void updateToPass(MentalStatusAssessment target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusAssessmentOperations.validateMentalStatusAssessmentCodeP(
					(MentalStatusAssessment) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusAssessmentCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusAssessmentCode() {
		OperationsTestCase<MentalStatusAssessment> validateMentalStatusAssessmentCodeTestCase = new OperationsTestCase<MentalStatusAssessment>(
			"validateMentalStatusAssessmentCode",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusAssessment target) {

			}

			@Override
			protected void updateToPass(MentalStatusAssessment target) {
				target.init();

			}

			@Override
			protected void setDependency(MentalStatusAssessment target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.MentalStatusAssessmentCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusAssessmentOperations.validateMentalStatusAssessmentCode(
					(MentalStatusAssessment) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusAssessmentCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMentalStatusAssessmentValue() {
		OperationsTestCase<MentalStatusAssessment> validateMentalStatusAssessmentValueTestCase = new OperationsTestCase<MentalStatusAssessment>(
			"validateMentalStatusAssessmentValue",
			operationsForOCL.getOCLValue("VALIDATE_MENTAL_STATUS_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MentalStatusAssessment target) {

			}

			@Override
			protected void updateToPass(MentalStatusAssessment target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MentalStatusAssessmentOperations.validateMentalStatusAssessmentValue(
					(MentalStatusAssessment) objectToTest, diagnostician, map);
			}

		};

		validateMentalStatusAssessmentValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MentalStatusAssessmentOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MentalStatusAssessment> {
		public MentalStatusAssessment create() {
			return EmspcrFactory.eINSTANCE.createMentalStatusAssessment();
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
	private static class ConstructorTestClass extends MentalStatusAssessmentOperations {
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

} // MentalStatusAssessmentOperations
