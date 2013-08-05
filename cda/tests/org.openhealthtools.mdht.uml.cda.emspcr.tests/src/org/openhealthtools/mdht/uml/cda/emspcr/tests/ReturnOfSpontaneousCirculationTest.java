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
import org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ReturnOfSpontaneousCirculationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Return Of Spontaneous Circulation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ReturnOfSpontaneousCirculation#validateReturnOfSpontaneousCirculationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Return Of Spontaneous Circulation Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ReturnOfSpontaneousCirculationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReturnOfSpontaneousCirculationTemplateId() {
		OperationsTestCase<ReturnOfSpontaneousCirculation> validateReturnOfSpontaneousCirculationTemplateIdTestCase = new OperationsTestCase<ReturnOfSpontaneousCirculation>(
			"validateReturnOfSpontaneousCirculationTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReturnOfSpontaneousCirculation target) {

			}

			@Override
			protected void updateToPass(ReturnOfSpontaneousCirculation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationTemplateId(
					(ReturnOfSpontaneousCirculation) objectToTest, diagnostician, map);
			}

		};

		validateReturnOfSpontaneousCirculationTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReturnOfSpontaneousCirculationCode() {
		OperationsTestCase<ReturnOfSpontaneousCirculation> validateReturnOfSpontaneousCirculationCodeTestCase = new OperationsTestCase<ReturnOfSpontaneousCirculation>(
			"validateReturnOfSpontaneousCirculationCode",
			operationsForOCL.getOCLValue("VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReturnOfSpontaneousCirculation target) {

			}

			@Override
			protected void updateToPass(ReturnOfSpontaneousCirculation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationCode(
					(ReturnOfSpontaneousCirculation) objectToTest, diagnostician, map);
			}

		};

		validateReturnOfSpontaneousCirculationCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReturnOfSpontaneousCirculationValue() {
		OperationsTestCase<ReturnOfSpontaneousCirculation> validateReturnOfSpontaneousCirculationValueTestCase = new OperationsTestCase<ReturnOfSpontaneousCirculation>(
			"validateReturnOfSpontaneousCirculationValue",
			operationsForOCL.getOCLValue("VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReturnOfSpontaneousCirculation target) {

			}

			@Override
			protected void updateToPass(ReturnOfSpontaneousCirculation target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationValue(
					(ReturnOfSpontaneousCirculation) objectToTest, diagnostician, map);
			}

		};

		validateReturnOfSpontaneousCirculationValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateReturnOfSpontaneousCirculationMoodCode() {
		OperationsTestCase<ReturnOfSpontaneousCirculation> validateReturnOfSpontaneousCirculationMoodCodeTestCase = new OperationsTestCase<ReturnOfSpontaneousCirculation>(
			"validateReturnOfSpontaneousCirculationMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_RETURN_OF_SPONTANEOUS_CIRCULATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ReturnOfSpontaneousCirculation target) {

			}

			@Override
			protected void updateToPass(ReturnOfSpontaneousCirculation target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ReturnOfSpontaneousCirculationOperations.validateReturnOfSpontaneousCirculationMoodCode(
					(ReturnOfSpontaneousCirculation) objectToTest, diagnostician, map);
			}

		};

		validateReturnOfSpontaneousCirculationMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ReturnOfSpontaneousCirculationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ReturnOfSpontaneousCirculation> {
		public ReturnOfSpontaneousCirculation create() {
			return EmspcrFactory.eINSTANCE.createReturnOfSpontaneousCirculation();
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
	private static class ConstructorTestClass extends ReturnOfSpontaneousCirculationOperations {
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

} // ReturnOfSpontaneousCirculationOperations
