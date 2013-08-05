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

import org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DispatchLocationLongitudeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dispatch Location Longitude</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude#validateDispatchLocationLongitudeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Longitude Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude#validateDispatchLocationLongitudeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Longitude Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude#validateDispatchLocationLongitudeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Longitude Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DispatchLocationLongitude#validateDispatchLocationLongitudeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dispatch Location Longitude Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DispatchLocationLongitudeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationLongitudeTemplateId() {
		OperationsTestCase<DispatchLocationLongitude> validateDispatchLocationLongitudeTemplateIdTestCase = new OperationsTestCase<DispatchLocationLongitude>(
			"validateDispatchLocationLongitudeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_LONGITUDE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationLongitude target) {

			}

			@Override
			protected void updateToPass(DispatchLocationLongitude target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeTemplateId(
					(DispatchLocationLongitude) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationLongitudeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationLongitudeCode() {
		OperationsTestCase<DispatchLocationLongitude> validateDispatchLocationLongitudeCodeTestCase = new OperationsTestCase<DispatchLocationLongitude>(
			"validateDispatchLocationLongitudeCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_LONGITUDE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationLongitude target) {

			}

			@Override
			protected void updateToPass(DispatchLocationLongitude target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeCode(
					(DispatchLocationLongitude) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationLongitudeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationLongitudeValue() {
		OperationsTestCase<DispatchLocationLongitude> validateDispatchLocationLongitudeValueTestCase = new OperationsTestCase<DispatchLocationLongitude>(
			"validateDispatchLocationLongitudeValue",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_LONGITUDE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationLongitude target) {

			}

			@Override
			protected void updateToPass(DispatchLocationLongitude target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeValue(
					(DispatchLocationLongitude) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationLongitudeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDispatchLocationLongitudeMoodCode() {
		OperationsTestCase<DispatchLocationLongitude> validateDispatchLocationLongitudeMoodCodeTestCase = new OperationsTestCase<DispatchLocationLongitude>(
			"validateDispatchLocationLongitudeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISPATCH_LOCATION_LONGITUDE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DispatchLocationLongitude target) {

			}

			@Override
			protected void updateToPass(DispatchLocationLongitude target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DispatchLocationLongitudeOperations.validateDispatchLocationLongitudeMoodCode(
					(DispatchLocationLongitude) objectToTest, diagnostician, map);
			}

		};

		validateDispatchLocationLongitudeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DispatchLocationLongitudeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DispatchLocationLongitude> {
		public DispatchLocationLongitude create() {
			return EmspcrFactory.eINSTANCE.createDispatchLocationLongitude();
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
	private static class ConstructorTestClass extends DispatchLocationLongitudeOperations {
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

} // DispatchLocationLongitudeOperations
