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
import org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PrearrivalActivationObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_TS;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Prearrival Activation Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrearrivalActivationObservation#validatePrearrivalActivationObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Prearrival Activation Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrearrivalActivationObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationTemplateId() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationTemplateIdTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationTemplateId(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationCodeP() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationCodePTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationCodeP(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationCode() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationCodeTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationCode(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationValue() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationValueTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationValue(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationEffectiveTime() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationEffectiveTimeTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationEffectiveTime",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

				IVL_TS ts = DatatypesFactory.eINSTANCE.createIVL_TS();
				target.setEffectiveTime(ts);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationEffectiveTime(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationEffectiveTimeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrearrivalActivationObservationMoodCode() {
		OperationsTestCase<PrearrivalActivationObservation> validatePrearrivalActivationObservationMoodCodeTestCase = new OperationsTestCase<PrearrivalActivationObservation>(
			"validatePrearrivalActivationObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PREARRIVAL_ACTIVATION_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrearrivalActivationObservation target) {

			}

			@Override
			protected void updateToPass(PrearrivalActivationObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrearrivalActivationObservationOperations.validatePrearrivalActivationObservationMoodCode(
					(PrearrivalActivationObservation) objectToTest, diagnostician, map);
			}

		};

		validatePrearrivalActivationObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrearrivalActivationObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrearrivalActivationObservation> {
		public PrearrivalActivationObservation create() {
			return EmspcrFactory.eINSTANCE.createPrearrivalActivationObservation();
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
	private static class ConstructorTestClass extends PrearrivalActivationObservationOperations {
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

} // PrearrivalActivationObservationOperations
