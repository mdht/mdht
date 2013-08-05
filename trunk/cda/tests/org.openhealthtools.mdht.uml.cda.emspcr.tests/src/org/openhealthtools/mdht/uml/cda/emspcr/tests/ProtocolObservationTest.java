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
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProtocolObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Protocol Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ProtocolObservation#validateProtocolObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Protocol Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProtocolObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationTemplateId() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationTemplateIdTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationTemplateId(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationCodeP() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationCodePTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationCodeP(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationCode() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationCodeTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationCode(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationValue() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationValueTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationValue(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationValueP() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationValuePTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationValueP(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProtocolObservationMoodCode() {
		OperationsTestCase<ProtocolObservation> validateProtocolObservationMoodCodeTestCase = new OperationsTestCase<ProtocolObservation>(
			"validateProtocolObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PROTOCOL_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProtocolObservation target) {

			}

			@Override
			protected void updateToPass(ProtocolObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProtocolObservationOperations.validateProtocolObservationMoodCode(
					(ProtocolObservation) objectToTest, diagnostician, map);
			}

		};

		validateProtocolObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProtocolObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProtocolObservation> {
		public ProtocolObservation create() {
			return EmspcrFactory.eINSTANCE.createProtocolObservation();
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
	private static class ConstructorTestClass extends ProtocolObservationOperations {
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

} // ProtocolObservationOperations
