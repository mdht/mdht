/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AssessmentScaleSupportingObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assessment Scale Supporting Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationCodeCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationValueTranslation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value Translation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleSupportingObservation#validateAssessmentScaleSupportingObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assessment Scale Supporting Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssessmentScaleSupportingObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationCodeCodeSystem() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationCodeCodeSystemTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationCodeCodeSystem",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();
				target.setCode(DatatypesFactory.eINSTANCE.createCD("", "2.16.840.1.113883.6.1", "", ""));
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationCodeCodeSystem(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationCodeCodeSystemTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationValueTranslation() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationValueTranslationTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationValueTranslation",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE_TRANSLATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();
				CD val = DatatypesFactory.eINSTANCE.createCD();
				val.getTranslations().add(DatatypesFactory.eINSTANCE.createCD());
				target.getValues().add(val);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationValueTranslation(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationValueTranslationTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationTemplateId() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationTemplateIdTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationTemplateId(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationClassCode() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationClassCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationClassCode(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationMoodCode() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationMoodCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationMoodCode(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationCode() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

				CE cd = DatatypesFactory.eINSTANCE.createCE();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationCode(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationId() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationIdTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationId",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

				II ii = DatatypesFactory.eINSTANCE.createII();
				target.getIds().add(ii);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationId(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationStatusCode() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationStatusCodeTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationStatusCode(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationStatusCodeP() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationStatusCodePTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationStatusCodeP(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssessmentScaleSupportingObservationValue() {
		OperationsTestCase<AssessmentScaleSupportingObservation> validateAssessmentScaleSupportingObservationValueTestCase = new OperationsTestCase<AssessmentScaleSupportingObservation>(
			"validateAssessmentScaleSupportingObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ASSESSMENT_SCALE_SUPPORTING_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssessmentScaleSupportingObservation target) {

			}

			@Override
			protected void updateToPass(AssessmentScaleSupportingObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssessmentScaleSupportingObservationOperations.validateAssessmentScaleSupportingObservationValue(
					(AssessmentScaleSupportingObservation) objectToTest, diagnostician, map);
			}

		};

		validateAssessmentScaleSupportingObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssessmentScaleSupportingObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssessmentScaleSupportingObservation> {
		public AssessmentScaleSupportingObservation create() {
			return ConsolFactory.eINSTANCE.createAssessmentScaleSupportingObservation();
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
	private static class ConstructorTestClass extends AssessmentScaleSupportingObservationOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // AssessmentScaleSupportingObservationOperations
