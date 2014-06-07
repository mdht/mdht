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
import org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrFactory;
import org.openhealthtools.mdht.uml.cda.phcr.operations.EstimatedDateOfDeliveryObservationOperations;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Estimated Date Of Delivery Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.EstimatedDateOfDeliveryObservation#validateEstimatedDateOfDeliveryObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Estimated Date Of Delivery Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class EstimatedDateOfDeliveryObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationTemplateId() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationTemplateIdTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationTemplateId(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationClassCode() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationClassCodeTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationClassCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationClassCode(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationMoodCode() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationMoodCodeTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationMoodCode(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationCodeP() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationCodePTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationCodeP(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationCode() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationCodeTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationCode(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationStatusCode() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationStatusCodeTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationStatusCode",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

				CS cs = DatatypesFactory.eINSTANCE.createCS("completed");
				target.setStatusCode(cs);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationStatusCode(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationStatusCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationStatusCodeP() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationStatusCodePTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationStatusCodeP",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationStatusCodeP(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationStatusCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateEstimatedDateOfDeliveryObservationValue() {
		OperationsTestCase<EstimatedDateOfDeliveryObservation> validateEstimatedDateOfDeliveryObservationValueTestCase = new OperationsTestCase<EstimatedDateOfDeliveryObservation>(
			"validateEstimatedDateOfDeliveryObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ESTIMATED_DATE_OF_DELIVERY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(EstimatedDateOfDeliveryObservation target) {

			}

			@Override
			protected void updateToPass(EstimatedDateOfDeliveryObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return EstimatedDateOfDeliveryObservationOperations.validateEstimatedDateOfDeliveryObservationValue(
					(EstimatedDateOfDeliveryObservation) objectToTest, diagnostician, map);
			}

		};

		validateEstimatedDateOfDeliveryObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends EstimatedDateOfDeliveryObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<EstimatedDateOfDeliveryObservation> {
		public EstimatedDateOfDeliveryObservation create() {
			return PhcrFactory.eINSTANCE.createEstimatedDateOfDeliveryObservation();
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
	private static class ConstructorTestClass extends EstimatedDateOfDeliveryObservationOperations {
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

} // EstimatedDateOfDeliveryObservationOperations
