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
import org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.GlasgowQualifierOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Glasgow Qualifier</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier#validateGlasgowQualifierTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Qualifier Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier#validateGlasgowQualifierCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Qualifier Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier#validateGlasgowQualifierCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Qualifier Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier#validateGlasgowQualifierValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Qualifier Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.GlasgowQualifier#validateGlasgowQualifierMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Glasgow Qualifier Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GlasgowQualifierTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowQualifierTemplateId() {
		OperationsTestCase<GlasgowQualifier> validateGlasgowQualifierTemplateIdTestCase = new OperationsTestCase<GlasgowQualifier>(
			"validateGlasgowQualifierTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_QUALIFIER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowQualifier target) {

			}

			@Override
			protected void updateToPass(GlasgowQualifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowQualifierOperations.validateGlasgowQualifierTemplateId(
					(GlasgowQualifier) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowQualifierTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowQualifierCodeP() {
		OperationsTestCase<GlasgowQualifier> validateGlasgowQualifierCodePTestCase = new OperationsTestCase<GlasgowQualifier>(
			"validateGlasgowQualifierCodeP",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_QUALIFIER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowQualifier target) {

			}

			@Override
			protected void updateToPass(GlasgowQualifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowQualifierOperations.validateGlasgowQualifierCodeP(
					(GlasgowQualifier) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowQualifierCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowQualifierCode() {
		OperationsTestCase<GlasgowQualifier> validateGlasgowQualifierCodeTestCase = new OperationsTestCase<GlasgowQualifier>(
			"validateGlasgowQualifierCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_QUALIFIER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowQualifier target) {

			}

			@Override
			protected void updateToPass(GlasgowQualifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowQualifierOperations.validateGlasgowQualifierCode(
					(GlasgowQualifier) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowQualifierCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowQualifierValue() {
		OperationsTestCase<GlasgowQualifier> validateGlasgowQualifierValueTestCase = new OperationsTestCase<GlasgowQualifier>(
			"validateGlasgowQualifierValue",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_QUALIFIER_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowQualifier target) {

			}

			@Override
			protected void updateToPass(GlasgowQualifier target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowQualifierOperations.validateGlasgowQualifierValue(
					(GlasgowQualifier) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowQualifierValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGlasgowQualifierMoodCode() {
		OperationsTestCase<GlasgowQualifier> validateGlasgowQualifierMoodCodeTestCase = new OperationsTestCase<GlasgowQualifier>(
			"validateGlasgowQualifierMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_GLASGOW_QUALIFIER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(GlasgowQualifier target) {

			}

			@Override
			protected void updateToPass(GlasgowQualifier target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GlasgowQualifierOperations.validateGlasgowQualifierMoodCode(
					(GlasgowQualifier) objectToTest, diagnostician, map);
			}

		};

		validateGlasgowQualifierMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GlasgowQualifierOperations {
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
	private static class ObjectFactory implements TestObjectFactory<GlasgowQualifier> {
		public GlasgowQualifier create() {
			return EmspcrFactory.eINSTANCE.createGlasgowQualifier();
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
	private static class ConstructorTestClass extends GlasgowQualifierOperations {
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

} // GlasgowQualifierOperations
