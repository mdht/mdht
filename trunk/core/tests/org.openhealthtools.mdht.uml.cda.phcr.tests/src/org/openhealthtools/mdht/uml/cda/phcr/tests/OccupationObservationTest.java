/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.OccupationObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Occupation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.OccupationObservation#validateOccupationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Occupation Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class OccupationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationTemplateId() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationTemplateIdTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationTemplateId(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationClassCode() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationClassCodeTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationClassCode(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationMoodCode() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationMoodCodeTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationMoodCode(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationNegationInd() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationNegationIndTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationNegationInd",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationNegationInd(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationNegationIndTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationCodeP() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationCodePTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationCodeP(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationCode() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationCodeTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationCode(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationText() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationTextTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationText",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationText(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationStatusCode() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationStatusCodeTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationStatusCode(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationStatusCodeP() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationStatusCodePTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationStatusCodeP(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationEffectiveTime() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationEffectiveTimeTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationEffectiveTime(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOccupationObservationValue() {
		OperationsTestCase<OccupationObservation> validateOccupationObservationValueTestCase = new OperationsTestCase<OccupationObservation>(
			"validateOccupationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_OCCUPATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(OccupationObservation target) {

			}

			@Override
			protected void updateToPass(OccupationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return OccupationObservationOperations.validateOccupationObservationValue(
					(OccupationObservation) objectToTest, diagnostician, map);
			}

		};

		validateOccupationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends OccupationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<OccupationObservation> {
		public OccupationObservation create() {
			return PhcrFactory.eINSTANCE.createOccupationObservation();
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
	private static class ConstructorTestClass extends OccupationObservationOperations {
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

} // OccupationObservationOperations
