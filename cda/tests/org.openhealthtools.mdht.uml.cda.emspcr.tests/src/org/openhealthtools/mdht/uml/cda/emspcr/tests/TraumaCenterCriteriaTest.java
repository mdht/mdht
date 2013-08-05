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
import org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.TraumaCenterCriteriaOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Trauma Center Criteria</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.TraumaCenterCriteria#validateTraumaCenterCriteriaMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Trauma Center Criteria Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class TraumaCenterCriteriaTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTraumaCenterCriteriaTemplateId() {
		OperationsTestCase<TraumaCenterCriteria> validateTraumaCenterCriteriaTemplateIdTestCase = new OperationsTestCase<TraumaCenterCriteria>(
			"validateTraumaCenterCriteriaTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_CENTER_CRITERIA_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TraumaCenterCriteria target) {

			}

			@Override
			protected void updateToPass(TraumaCenterCriteria target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaTemplateId(
					(TraumaCenterCriteria) objectToTest, diagnostician, map);
			}

		};

		validateTraumaCenterCriteriaTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTraumaCenterCriteriaCode() {
		OperationsTestCase<TraumaCenterCriteria> validateTraumaCenterCriteriaCodeTestCase = new OperationsTestCase<TraumaCenterCriteria>(
			"validateTraumaCenterCriteriaCode",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_CENTER_CRITERIA_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TraumaCenterCriteria target) {

			}

			@Override
			protected void updateToPass(TraumaCenterCriteria target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaCode(
					(TraumaCenterCriteria) objectToTest, diagnostician, map);
			}

		};

		validateTraumaCenterCriteriaCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTraumaCenterCriteriaValue() {
		OperationsTestCase<TraumaCenterCriteria> validateTraumaCenterCriteriaValueTestCase = new OperationsTestCase<TraumaCenterCriteria>(
			"validateTraumaCenterCriteriaValue",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_CENTER_CRITERIA_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TraumaCenterCriteria target) {

			}

			@Override
			protected void updateToPass(TraumaCenterCriteria target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaValue(
					(TraumaCenterCriteria) objectToTest, diagnostician, map);
			}

		};

		validateTraumaCenterCriteriaValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateTraumaCenterCriteriaMoodCode() {
		OperationsTestCase<TraumaCenterCriteria> validateTraumaCenterCriteriaMoodCodeTestCase = new OperationsTestCase<TraumaCenterCriteria>(
			"validateTraumaCenterCriteriaMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_TRAUMA_CENTER_CRITERIA_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(TraumaCenterCriteria target) {

			}

			@Override
			protected void updateToPass(TraumaCenterCriteria target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return TraumaCenterCriteriaOperations.validateTraumaCenterCriteriaMoodCode(
					(TraumaCenterCriteria) objectToTest, diagnostician, map);
			}

		};

		validateTraumaCenterCriteriaMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends TraumaCenterCriteriaOperations {
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
	private static class ObjectFactory implements TestObjectFactory<TraumaCenterCriteria> {
		public TraumaCenterCriteria create() {
			return EmspcrFactory.eINSTANCE.createTraumaCenterCriteria();
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
	private static class ConstructorTestClass extends TraumaCenterCriteriaOperations {
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

} // TraumaCenterCriteriaOperations
