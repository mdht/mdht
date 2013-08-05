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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfHistoryOfProceduresOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Existence Of History Of Procedures</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfHistoryOfProcedures#validateExistenceOfHistoryOfProceduresMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Existence Of History Of Procedures Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ExistenceOfHistoryOfProceduresTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfProceduresTemplateId() {
		OperationsTestCase<ExistenceOfHistoryOfProcedures> validateExistenceOfHistoryOfProceduresTemplateIdTestCase = new OperationsTestCase<ExistenceOfHistoryOfProcedures>(
			"validateExistenceOfHistoryOfProceduresTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfProcedures target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfProcedures target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresTemplateId(
					(ExistenceOfHistoryOfProcedures) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfProceduresTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfProceduresCode() {
		OperationsTestCase<ExistenceOfHistoryOfProcedures> validateExistenceOfHistoryOfProceduresCodeTestCase = new OperationsTestCase<ExistenceOfHistoryOfProcedures>(
			"validateExistenceOfHistoryOfProceduresCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfProcedures target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfProcedures target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresCode(
					(ExistenceOfHistoryOfProcedures) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfProceduresCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfProceduresValue() {
		OperationsTestCase<ExistenceOfHistoryOfProcedures> validateExistenceOfHistoryOfProceduresValueTestCase = new OperationsTestCase<ExistenceOfHistoryOfProcedures>(
			"validateExistenceOfHistoryOfProceduresValue",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfProcedures target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfProcedures target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresValue(
					(ExistenceOfHistoryOfProcedures) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfProceduresValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateExistenceOfHistoryOfProceduresMoodCode() {
		OperationsTestCase<ExistenceOfHistoryOfProcedures> validateExistenceOfHistoryOfProceduresMoodCodeTestCase = new OperationsTestCase<ExistenceOfHistoryOfProcedures>(
			"validateExistenceOfHistoryOfProceduresMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_EXISTENCE_OF_HISTORY_OF_PROCEDURES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ExistenceOfHistoryOfProcedures target) {

			}

			@Override
			protected void updateToPass(ExistenceOfHistoryOfProcedures target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ExistenceOfHistoryOfProceduresOperations.validateExistenceOfHistoryOfProceduresMoodCode(
					(ExistenceOfHistoryOfProcedures) objectToTest, diagnostician, map);
			}

		};

		validateExistenceOfHistoryOfProceduresMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ExistenceOfHistoryOfProceduresOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ExistenceOfHistoryOfProcedures> {
		public ExistenceOfHistoryOfProcedures create() {
			return EmspcrFactory.eINSTANCE.createExistenceOfHistoryOfProcedures();
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
	private static class ConstructorTestClass extends ExistenceOfHistoryOfProceduresOperations {
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

} // ExistenceOfHistoryOfProceduresOperations
