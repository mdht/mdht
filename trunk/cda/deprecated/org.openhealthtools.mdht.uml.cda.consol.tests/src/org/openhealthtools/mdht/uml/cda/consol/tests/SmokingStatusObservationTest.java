/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.SmokingStatusObservationOperations;
import org.openhealthtools.mdht.uml.cda.consol.operations.TobaccoUseOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Smoking Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationEffectiveTimeLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateSmokingStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Smoking Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservation#validateTobaccoUseTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tobacco Use Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class SmokingStatusObservationTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationEffectiveTimeLow() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationEffectiveTimeLowTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationEffectiveTimeLow",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();

				target.setEffectiveTime(ts);
			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();
				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				ts.setLow(DatatypesFactory.eINSTANCE.createIVXB_TS());
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationEffectiveTimeLow(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationEffectiveTimeLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationClassCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationClassCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationClassCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationMoodCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationMoodCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationMoodCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationCodeP() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCodePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCodeP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD("ASSERTION", "2.16.840.1.113883.5.4", "", "");
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationEffectiveTime() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationEffectiveTimeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationEffectiveTime(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationStatusCodeP() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationStatusCodePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCodeP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateSmokingStatusObservationStatusCode() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationStatusCodeTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected void setDependency(SmokingStatusObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.consol.SmokingStatusObservationStatusCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationStatusCode(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationValueP() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationValuePTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("449868002", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationValueP(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateSmokingStatusObservationValue() {
		OperationsTestCase<SmokingStatusObservation> validateSmokingStatusObservationValueTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateSmokingStatusObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_SMOKING_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("449868002", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateSmokingStatusObservationValue(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateSmokingStatusObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTobaccoUseTemplateId() {
		OperationsTestCase<SmokingStatusObservation> validateTobaccoUseTemplateIdTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateTobaccoUseTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return SmokingStatusObservationOperations.validateTobaccoUseTemplateId(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateTobaccoUseValue() {
		OperationsTestCase<SmokingStatusObservation> validateTobaccoUseValueTestCase = new OperationsTestCase<SmokingStatusObservation>(
			"validateTobaccoUseValue",
			operationsForOCL.getOCLValue("VALIDATE_TOBACCO_USE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(SmokingStatusObservation target) {

			}

			@Override
			protected void updateToPass(SmokingStatusObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD("449868002", "2.16.840.1.113883.6.96", "", "");
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TobaccoUseOperations.validateTobaccoUseValue(
					(SmokingStatusObservation) objectToTest, diagnostician, map);
			}

		};

		validateTobaccoUseValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends SmokingStatusObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<SmokingStatusObservation> {
		public SmokingStatusObservation create() {
			return ConsolFactory.eINSTANCE.createSmokingStatusObservation();
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
	private static class ConstructorTestClass extends SmokingStatusObservationOperations {
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

} // SmokingStatusObservationOperations
