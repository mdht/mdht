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
import org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.LevelOfServiceObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Level Of Service Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.LevelOfServiceObservation#validateLevelOfServiceObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Level Of Service Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class LevelOfServiceObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationTemplateId() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationTemplateIdTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationTemplateId(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationCodeP() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationCodePTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationCodeP",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationCodeP(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationCode() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationCodeTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationCode(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationValue() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationValueTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationValue(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationValueP() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationValuePTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationValueP(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateLevelOfServiceObservationMoodCode() {
		OperationsTestCase<LevelOfServiceObservation> validateLevelOfServiceObservationMoodCodeTestCase = new OperationsTestCase<LevelOfServiceObservation>(
			"validateLevelOfServiceObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_LEVEL_OF_SERVICE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(LevelOfServiceObservation target) {

			}

			@Override
			protected void updateToPass(LevelOfServiceObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return LevelOfServiceObservationOperations.validateLevelOfServiceObservationMoodCode(
					(LevelOfServiceObservation) objectToTest, diagnostician, map);
			}

		};

		validateLevelOfServiceObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends LevelOfServiceObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<LevelOfServiceObservation> {
		public LevelOfServiceObservation create() {
			return EmspcrFactory.eINSTANCE.createLevelOfServiceObservation();
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
	private static class ConstructorTestClass extends LevelOfServiceObservationOperations {
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

} // LevelOfServiceObservationOperations
