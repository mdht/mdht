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
import org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TransportMethodObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Transport Method Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TransportMethodObservation#validateTransportMethodObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Transport Method Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TransportMethodObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationTemplateId() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationTemplateIdTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationTemplateId(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationCodeP() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationCodePTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationCodeP(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationCode() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationCodeTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationCode(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationValue() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationValueTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationValue(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationValueP() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationValuePTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationValueP(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTransportMethodObservationMoodCode() {
		OperationsTestCase<TransportMethodObservation> validateTransportMethodObservationMoodCodeTestCase = new OperationsTestCase<TransportMethodObservation>(
			"validateTransportMethodObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRANSPORT_METHOD_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TransportMethodObservation target) {

			}

			@Override
			protected void updateToPass(TransportMethodObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TransportMethodObservationOperations.validateTransportMethodObservationMoodCode(
					(TransportMethodObservation) objectToTest, diagnostician, map);
			}

		};

		validateTransportMethodObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TransportMethodObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TransportMethodObservation> {
		public TransportMethodObservation create() {
			return EmspcrFactory.eINSTANCE.createTransportMethodObservation();
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
	private static class ConstructorTestClass extends TransportMethodObservationOperations {
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

} // TransportMethodObservationOperations
