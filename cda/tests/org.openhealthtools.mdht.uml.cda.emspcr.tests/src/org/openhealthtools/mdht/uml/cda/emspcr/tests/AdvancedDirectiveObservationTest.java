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

import org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.AdvancedDirectiveObservationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advanced Directive Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.AdvancedDirectiveObservation#validateAdvancedDirectiveObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advanced Directive Observation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvancedDirectiveObservationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvancedDirectiveObservationTemplateId() {
		OperationsTestCase<AdvancedDirectiveObservation> validateAdvancedDirectiveObservationTemplateIdTestCase = new OperationsTestCase<AdvancedDirectiveObservation>(
			"validateAdvancedDirectiveObservationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvancedDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvancedDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvancedDirectiveObservationOperations.validateAdvancedDirectiveObservationTemplateId(
					(AdvancedDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvancedDirectiveObservationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvancedDirectiveObservationCode() {
		OperationsTestCase<AdvancedDirectiveObservation> validateAdvancedDirectiveObservationCodeTestCase = new OperationsTestCase<AdvancedDirectiveObservation>(
			"validateAdvancedDirectiveObservationCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvancedDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvancedDirectiveObservation target) {
				target.init();

				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvancedDirectiveObservationOperations.validateAdvancedDirectiveObservationCode(
					(AdvancedDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvancedDirectiveObservationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvancedDirectiveObservationValue() {
		OperationsTestCase<AdvancedDirectiveObservation> validateAdvancedDirectiveObservationValueTestCase = new OperationsTestCase<AdvancedDirectiveObservation>(
			"validateAdvancedDirectiveObservationValue",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvancedDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvancedDirectiveObservation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvancedDirectiveObservationOperations.validateAdvancedDirectiveObservationValue(
					(AdvancedDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvancedDirectiveObservationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvancedDirectiveObservationValueP() {
		OperationsTestCase<AdvancedDirectiveObservation> validateAdvancedDirectiveObservationValuePTestCase = new OperationsTestCase<AdvancedDirectiveObservation>(
			"validateAdvancedDirectiveObservationValueP",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvancedDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvancedDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvancedDirectiveObservationOperations.validateAdvancedDirectiveObservationValueP(
					(AdvancedDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvancedDirectiveObservationValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvancedDirectiveObservationMoodCode() {
		OperationsTestCase<AdvancedDirectiveObservation> validateAdvancedDirectiveObservationMoodCodeTestCase = new OperationsTestCase<AdvancedDirectiveObservation>(
			"validateAdvancedDirectiveObservationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCED_DIRECTIVE_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvancedDirectiveObservation target) {

			}

			@Override
			protected void updateToPass(AdvancedDirectiveObservation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvancedDirectiveObservationOperations.validateAdvancedDirectiveObservationMoodCode(
					(AdvancedDirectiveObservation) objectToTest, diagnostician, map);
			}

		};

		validateAdvancedDirectiveObservationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvancedDirectiveObservationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvancedDirectiveObservation> {
		public AdvancedDirectiveObservation create() {
			return EmspcrFactory.eINSTANCE.createAdvancedDirectiveObservation();
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
	private static class ConstructorTestClass extends AdvancedDirectiveObservationOperations {
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

} // AdvancedDirectiveObservationOperations
