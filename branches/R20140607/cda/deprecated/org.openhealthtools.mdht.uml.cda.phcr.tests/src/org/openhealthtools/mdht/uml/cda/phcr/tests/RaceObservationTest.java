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
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.RaceObservation;
import org.openhealthtools.mdht.uml.cda.phcr.operations.RaceObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Race Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.RaceObservation#validateRaceObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Race Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RaceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationTemplateId() {
		OperationsTestCase<RaceObservation> validateRaceObservationTemplateIdTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationTemplateId(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationClassCode() {
		OperationsTestCase<RaceObservation> validateRaceObservationClassCodeTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationClassCode(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationMoodCode() {
		OperationsTestCase<RaceObservation> validateRaceObservationMoodCodeTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationMoodCode(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationCodeP() {
		OperationsTestCase<RaceObservation> validateRaceObservationCodePTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationCodeP(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationCode() {
		OperationsTestCase<RaceObservation> validateRaceObservationCodeTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationCode(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationStatusCode() {
		OperationsTestCase<RaceObservation> validateRaceObservationStatusCodeTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationStatusCode(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationStatusCodeP() {
		OperationsTestCase<RaceObservation> validateRaceObservationStatusCodePTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationStatusCodeP(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateRaceObservationValue() {
		OperationsTestCase<RaceObservation> validateRaceObservationValueTestCase = new OperationsTestCase<RaceObservation>(
			"validateRaceObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_RACE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RaceObservation target) {

			}

			@Override
			protected void updateToPass(RaceObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RaceObservationOperations.validateRaceObservationValue(
					(RaceObservation) objectToTest, diagnostician, map);
			}

		};

		validateRaceObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RaceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RaceObservation> {
		public RaceObservation create() {
			return PhcrFactory.eINSTANCE.createRaceObservation();
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
	private static class ConstructorTestClass extends RaceObservationOperations {
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

} // RaceObservationOperations
