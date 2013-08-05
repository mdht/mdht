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
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.PrimarySymptomOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Primary Symptom</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PrimarySymptomTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomTemplateId() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomTemplateIdTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomTemplateId(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomCodeP() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomCodePTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomCodeP(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomCode() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomCodeTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomCode(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomValue() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomValueTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomValue",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomValue(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomValueP() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomValuePTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomValueP",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomValueP(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimarySymptomMoodCode() {
		OperationsTestCase<PrimarySymptom> validatePrimarySymptomMoodCodeTestCase = new OperationsTestCase<PrimarySymptom>(
			"validatePrimarySymptomMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PrimarySymptom target) {

			}

			@Override
			protected void updateToPass(PrimarySymptom target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PrimarySymptomOperations.validatePrimarySymptomMoodCode(
					(PrimarySymptom) objectToTest, diagnostician, map);
			}

		};

		validatePrimarySymptomMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PrimarySymptomOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PrimarySymptom> {
		public PrimarySymptom create() {
			return EmspcrFactory.eINSTANCE.createPrimarySymptom();
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
	private static class ConstructorTestClass extends PrimarySymptomOperations {
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

} // PrimarySymptomOperations
