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
import org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReasonForChoosingDestinationObservationOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Reason For Choosing Destination Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservation#validateReasonForChoosingDestinationObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Reason For Choosing Destination Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReasonForChoosingDestinationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationTemplateId() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationTemplateIdTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationTemplateId(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationMoodCode() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationMoodCodeTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationMoodCode(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationCodeP() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationCodePTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationCodeP(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationCode() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationCodeTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected void setDependency(ReasonForChoosingDestinationObservation target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put(
					"org.openhealthtools.mdht.uml.cda.emspcr.ReasonForChoosingDestinationObservationCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationCode(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationValue() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationValueTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationValue(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReasonForChoosingDestinationObservationValueP() {
		OperationsTestCase<ReasonForChoosingDestinationObservation> validateReasonForChoosingDestinationObservationValuePTestCase = new OperationsTestCase<ReasonForChoosingDestinationObservation>(
			"validateReasonForChoosingDestinationObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_REASON_FOR_CHOOSING_DESTINATION_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReasonForChoosingDestinationObservation target) {

			}

			@Override
			protected void updateToPass(ReasonForChoosingDestinationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReasonForChoosingDestinationObservationOperations.validateReasonForChoosingDestinationObservationValueP(
					(ReasonForChoosingDestinationObservation) objectToTest, diagnostician, map);
			}

		};

		validateReasonForChoosingDestinationObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReasonForChoosingDestinationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReasonForChoosingDestinationObservation> {
		public ReasonForChoosingDestinationObservation create() {
			return EmspcrFactory.eINSTANCE.createReasonForChoosingDestinationObservation();
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
	private static class ConstructorTestClass extends ReasonForChoosingDestinationObservationOperations {
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

} // ReasonForChoosingDestinationObservationOperations
