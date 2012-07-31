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
import org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.MostRecentTimeArrivedInUSAObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Most Recent Time Arrived In USA Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.MostRecentTimeArrivedInUSAObservation#validateMostRecentTimeArrivedInUSAObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Most Recent Time Arrived In USA Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class MostRecentTimeArrivedInUSAObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationTemplateId() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationTemplateIdTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationTemplateId(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationClassCode() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationClassCodeTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationClassCode(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationMoodCode() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationMoodCodeTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationMoodCode(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationCodeP() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationCodePTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationCodeP(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationCode() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationCodeTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationCode(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationStatusCode() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationStatusCodeTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationStatusCode(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationStatusCodeP() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationStatusCodePTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationStatusCodeP(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateMostRecentTimeArrivedInUSAObservationValue() {
		OperationsTestCase<MostRecentTimeArrivedInUSAObservation> validateMostRecentTimeArrivedInUSAObservationValueTestCase = new OperationsTestCase<MostRecentTimeArrivedInUSAObservation>(
			"validateMostRecentTimeArrivedInUSAObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_MOST_RECENT_TIME_ARRIVED_IN_USA_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(MostRecentTimeArrivedInUSAObservation target) {

			}

			@Override
			protected void updateToPass(MostRecentTimeArrivedInUSAObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return MostRecentTimeArrivedInUSAObservationOperations.validateMostRecentTimeArrivedInUSAObservationValue(
					(MostRecentTimeArrivedInUSAObservation) objectToTest, diagnostician, map);
			}

		};

		validateMostRecentTimeArrivedInUSAObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends MostRecentTimeArrivedInUSAObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<MostRecentTimeArrivedInUSAObservation> {
		public MostRecentTimeArrivedInUSAObservation create() {
			return PhcrFactory.eINSTANCE.createMostRecentTimeArrivedInUSAObservation();
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
	private static class ConstructorTestClass extends MostRecentTimeArrivedInUSAObservationOperations {
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

} // MostRecentTimeArrivedInUSAObservationOperations
