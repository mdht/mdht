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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowVerbalOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Verbal</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowVerbal#validateGlasgowVerbalMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Verbal Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowVerbalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowVerbalTemplateId() {
		OperationsTestCase<GlasgowVerbal> validateGlasgowVerbalTemplateIdTestCase = new OperationsTestCase<GlasgowVerbal>(
			"validateGlasgowVerbalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_VERBAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowVerbal target) {

			}

			@Override
			protected void updateToPass(GlasgowVerbal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowVerbalOperations.validateGlasgowVerbalTemplateId(
					(GlasgowVerbal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowVerbalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowVerbalCodeP() {
		OperationsTestCase<GlasgowVerbal> validateGlasgowVerbalCodePTestCase = new OperationsTestCase<GlasgowVerbal>(
			"validateGlasgowVerbalCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_VERBAL_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowVerbal target) {

			}

			@Override
			protected void updateToPass(GlasgowVerbal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowVerbalOperations.validateGlasgowVerbalCodeP(
					(GlasgowVerbal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowVerbalCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowVerbalCode() {
		OperationsTestCase<GlasgowVerbal> validateGlasgowVerbalCodeTestCase = new OperationsTestCase<GlasgowVerbal>(
			"validateGlasgowVerbalCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_VERBAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(GlasgowVerbal target) {

			}

			@Override
			protected void updateToPass(GlasgowVerbal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowVerbalOperations.validateGlasgowVerbalCode(
					(GlasgowVerbal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowVerbalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowVerbalValue() {
		OperationsTestCase<GlasgowVerbal> validateGlasgowVerbalValueTestCase = new OperationsTestCase<GlasgowVerbal>(
			"validateGlasgowVerbalValue",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_VERBAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowVerbal target) {

			}

			@Override
			protected void updateToPass(GlasgowVerbal target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowVerbalOperations.validateGlasgowVerbalValue(
					(GlasgowVerbal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowVerbalValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowVerbalMoodCode() {
		OperationsTestCase<GlasgowVerbal> validateGlasgowVerbalMoodCodeTestCase = new OperationsTestCase<GlasgowVerbal>(
			"validateGlasgowVerbalMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_VERBAL_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowVerbal target) {

			}

			@Override
			protected void updateToPass(GlasgowVerbal target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowVerbalOperations.validateGlasgowVerbalMoodCode(
					(GlasgowVerbal) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowVerbalMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowVerbalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowVerbal> {
		public GlasgowVerbal create() {
			return EmspcrFactory.eINSTANCE.createGlasgowVerbal();
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
	private static class ConstructorTestClass extends GlasgowVerbalOperations {
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

} // GlasgowVerbalOperations
