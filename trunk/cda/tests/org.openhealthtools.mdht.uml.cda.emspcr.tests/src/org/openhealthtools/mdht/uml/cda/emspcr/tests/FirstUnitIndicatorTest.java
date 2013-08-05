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
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.FirstUnitIndicatorOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>First Unit Indicator</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator#validateFirstUnitIndicatorMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate First Unit Indicator Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class FirstUnitIndicatorTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitIndicatorTemplateId() {
		OperationsTestCase<FirstUnitIndicator> validateFirstUnitIndicatorTemplateIdTestCase = new OperationsTestCase<FirstUnitIndicator>(
			"validateFirstUnitIndicatorTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_INDICATOR_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitIndicator target) {

			}

			@Override
			protected void updateToPass(FirstUnitIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitIndicatorOperations.validateFirstUnitIndicatorTemplateId(
					(FirstUnitIndicator) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitIndicatorTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitIndicatorCodeP() {
		OperationsTestCase<FirstUnitIndicator> validateFirstUnitIndicatorCodePTestCase = new OperationsTestCase<FirstUnitIndicator>(
			"validateFirstUnitIndicatorCodeP",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_INDICATOR_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitIndicator target) {

			}

			@Override
			protected void updateToPass(FirstUnitIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitIndicatorOperations.validateFirstUnitIndicatorCodeP(
					(FirstUnitIndicator) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitIndicatorCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitIndicatorCode() {
		OperationsTestCase<FirstUnitIndicator> validateFirstUnitIndicatorCodeTestCase = new OperationsTestCase<FirstUnitIndicator>(
			"validateFirstUnitIndicatorCode",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_INDICATOR_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitIndicator target) {

			}

			@Override
			protected void updateToPass(FirstUnitIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitIndicatorOperations.validateFirstUnitIndicatorCode(
					(FirstUnitIndicator) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitIndicatorCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitIndicatorValue() {
		OperationsTestCase<FirstUnitIndicator> validateFirstUnitIndicatorValueTestCase = new OperationsTestCase<FirstUnitIndicator>(
			"validateFirstUnitIndicatorValue",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_INDICATOR_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitIndicator target) {

			}

			@Override
			protected void updateToPass(FirstUnitIndicator target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitIndicatorOperations.validateFirstUnitIndicatorValue(
					(FirstUnitIndicator) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitIndicatorValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateFirstUnitIndicatorMoodCode() {
		OperationsTestCase<FirstUnitIndicator> validateFirstUnitIndicatorMoodCodeTestCase = new OperationsTestCase<FirstUnitIndicator>(
			"validateFirstUnitIndicatorMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_FIRST_UNIT_INDICATOR_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(FirstUnitIndicator target) {

			}

			@Override
			protected void updateToPass(FirstUnitIndicator target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return FirstUnitIndicatorOperations.validateFirstUnitIndicatorMoodCode(
					(FirstUnitIndicator) objectToTest, diagnostician, map);
			}

		};

		validateFirstUnitIndicatorMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends FirstUnitIndicatorOperations {
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
	private static class ObjectFactory implements TestObjectFactory<FirstUnitIndicator> {
		public FirstUnitIndicator create() {
			return EmspcrFactory.eINSTANCE.createFirstUnitIndicator();
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
	private static class ConstructorTestClass extends FirstUnitIndicatorOperations {
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

} // FirstUnitIndicatorOperations
