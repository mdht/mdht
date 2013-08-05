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

import org.openhealthtools.mdht.uml.cda.emspcr.DisasterType;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.DisasterTypeOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Disaster Type</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.DisasterType#validateDisasterTypeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Disaster Type Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DisasterTypeTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDisasterTypeTemplateId() {
		OperationsTestCase<DisasterType> validateDisasterTypeTemplateIdTestCase = new OperationsTestCase<DisasterType>(
			"validateDisasterTypeTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISASTER_TYPE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisasterType target) {

			}

			@Override
			protected void updateToPass(DisasterType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisasterTypeOperations.validateDisasterTypeTemplateId(
					(DisasterType) objectToTest, diagnostician, map);
			}

		};

		validateDisasterTypeTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDisasterTypeCode() {
		OperationsTestCase<DisasterType> validateDisasterTypeCodeTestCase = new OperationsTestCase<DisasterType>(
			"validateDisasterTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_DISASTER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DisasterType target) {

			}

			@Override
			protected void updateToPass(DisasterType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisasterTypeOperations.validateDisasterTypeCode((DisasterType) objectToTest, diagnostician, map);
			}

		};

		validateDisasterTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDisasterTypeValue() {
		OperationsTestCase<DisasterType> validateDisasterTypeValueTestCase = new OperationsTestCase<DisasterType>(
			"validateDisasterTypeValue",
			operationsForOCL.getOCLValue("VALIDATE_DISASTER_TYPE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DisasterType target) {

			}

			@Override
			protected void updateToPass(DisasterType target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisasterTypeOperations.validateDisasterTypeValue((DisasterType) objectToTest, diagnostician, map);
			}

		};

		validateDisasterTypeValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDisasterTypeMoodCode() {
		OperationsTestCase<DisasterType> validateDisasterTypeMoodCodeTestCase = new OperationsTestCase<DisasterType>(
			"validateDisasterTypeMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_DISASTER_TYPE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DisasterType target) {

			}

			@Override
			protected void updateToPass(DisasterType target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DisasterTypeOperations.validateDisasterTypeMoodCode(
					(DisasterType) objectToTest, diagnostician, map);
			}

		};

		validateDisasterTypeMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DisasterTypeOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DisasterType> {
		public DisasterType create() {
			return EmspcrFactory.eINSTANCE.createDisasterType();
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
	private static class ConstructorTestClass extends DisasterTypeOperations {
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

} // DisasterTypeOperations
