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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationNameOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Location Name</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName#validateDispatchLocationNameTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Name Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName#validateDispatchLocationNameCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Name Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName#validateDispatchLocationNameValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Name Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationName#validateDispatchLocationNameMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Name Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchLocationNameTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationNameTemplateId() {
		OperationsTestCase<DispatchLocationName> validateDispatchLocationNameTemplateIdTestCase = new OperationsTestCase<DispatchLocationName>(
			"validateDispatchLocationNameTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_NAME_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationName target) {

			}

			@Override
			protected void updateToPass(DispatchLocationName target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationNameOperations.validateDispatchLocationNameTemplateId(
					(DispatchLocationName) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationNameTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationNameCode() {
		OperationsTestCase<DispatchLocationName> validateDispatchLocationNameCodeTestCase = new OperationsTestCase<DispatchLocationName>(
			"validateDispatchLocationNameCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_NAME_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationName target) {

			}

			@Override
			protected void updateToPass(DispatchLocationName target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationNameOperations.validateDispatchLocationNameCode(
					(DispatchLocationName) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationNameCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationNameValue() {
		OperationsTestCase<DispatchLocationName> validateDispatchLocationNameValueTestCase = new OperationsTestCase<DispatchLocationName>(
			"validateDispatchLocationNameValue",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_NAME_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationName target) {

			}

			@Override
			protected void updateToPass(DispatchLocationName target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationNameOperations.validateDispatchLocationNameValue(
					(DispatchLocationName) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationNameValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationNameMoodCode() {
		OperationsTestCase<DispatchLocationName> validateDispatchLocationNameMoodCodeTestCase = new OperationsTestCase<DispatchLocationName>(
			"validateDispatchLocationNameMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_NAME_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationName target) {

			}

			@Override
			protected void updateToPass(DispatchLocationName target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationNameOperations.validateDispatchLocationNameMoodCode(
					(DispatchLocationName) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationNameMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchLocationNameOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchLocationName> {
		public DispatchLocationName create() {
			return EmspcrFactory.eINSTANCE.createDispatchLocationName();
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
	private static class ConstructorTestClass extends DispatchLocationNameOperations {
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

} // DispatchLocationNameOperations
