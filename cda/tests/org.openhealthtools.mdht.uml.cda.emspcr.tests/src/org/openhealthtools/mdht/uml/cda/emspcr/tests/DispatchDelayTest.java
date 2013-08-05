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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchDelayOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Delay</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchDelay#validateDispatchDelayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Delay Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchDelayTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayTemplateId() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayTemplateIdTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayTemplateId(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayCodeP() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayCodePTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayCodeP",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayCodeP(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayCode() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayCodeTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayCode(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayValue() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayValueTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayValue",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayValue(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayValueP() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayValuePTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayValueP",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayValueP(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchDelayMoodCode() {
		OperationsTestCase<DispatchDelay> validateDispatchDelayMoodCodeTestCase = new OperationsTestCase<DispatchDelay>(
			"validateDispatchDelayMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_DELAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchDelay target) {

			}

			@Override
			protected void updateToPass(DispatchDelay target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchDelayOperations.validateDispatchDelayMoodCode(
					(DispatchDelay) objectToTest, diagnostician, map);
			}

		};

		validateDispatchDelayMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchDelayOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchDelay> {
		public DispatchDelay create() {
			return EmspcrFactory.eINSTANCE.createDispatchDelay();
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
	private static class ConstructorTestClass extends DispatchDelayOperations {
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

} // DispatchDelayOperations
