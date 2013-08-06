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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportModeObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Mode Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportModeObservation#validateTransportModeObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Mode Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransportModeObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationTemplateId() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationTemplateIdTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationTemplateId(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationCodeP() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationCodePTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationCodeP(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationCode() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationCodeTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationCode(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationValue() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationValueTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationValue(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationValueP() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationValuePTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationValueP(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportModeObservationMoodCode() {
		OperationsTestCase<TransportModeObservation> validateTransportModeObservationMoodCodeTestCase = new OperationsTestCase<TransportModeObservation>(
			"validateTransportModeObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_MODE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportModeObservation target) {

			}

			@Override
			protected void updateToPass(TransportModeObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportModeObservationOperations.validateTransportModeObservationMoodCode(
					(TransportModeObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportModeObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransportModeObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransportModeObservation> {
		public TransportModeObservation create() {
			return EmspcrFactory.eINSTANCE.createTransportModeObservation();
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
	private static class ConstructorTestClass extends TransportModeObservationOperations {
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

} // TransportModeObservationOperations
