/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedDataEntererOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Data Enterer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer#validateAssignedDataEntererAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Data Enterer Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer#validateAssignedDataEntererAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Data Enterer Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer#validateAssignedDataEntererCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Data Enterer Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer#validateAssignedDataEntererId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Data Enterer Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedDataEnterer#validateAssignedDataEntererTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Data Enterer Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedDataEntererTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedDataEntererAddr() {
		OperationsTestCase<AssignedDataEnterer> validateAssignedDataEntererAddrTestCase = new OperationsTestCase<AssignedDataEnterer>(
			"validateAssignedDataEntererAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_DATA_ENTERER_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedDataEnterer target) {

			}

			@Override
			protected void updateToPass(AssignedDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedDataEntererOperations.validateAssignedDataEntererAddr(
					(AssignedDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateAssignedDataEntererAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedDataEntererCode() {
		OperationsTestCase<AssignedDataEnterer> validateAssignedDataEntererCodeTestCase = new OperationsTestCase<AssignedDataEnterer>(
			"validateAssignedDataEntererCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_DATA_ENTERER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedDataEnterer target) {

			}

			@Override
			protected void updateToPass(AssignedDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedDataEntererOperations.validateAssignedDataEntererCode(
					(AssignedDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateAssignedDataEntererCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedDataEntererId() {
		OperationsTestCase<AssignedDataEnterer> validateAssignedDataEntererIdTestCase = new OperationsTestCase<AssignedDataEnterer>(
			"validateAssignedDataEntererId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_DATA_ENTERER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedDataEnterer target) {

			}

			@Override
			protected void updateToPass(AssignedDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedDataEntererOperations.validateAssignedDataEntererId(
					(AssignedDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateAssignedDataEntererIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedDataEntererTelecom() {
		OperationsTestCase<AssignedDataEnterer> validateAssignedDataEntererTelecomTestCase = new OperationsTestCase<AssignedDataEnterer>(
			"validateAssignedDataEntererTelecom",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_DATA_ENTERER_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedDataEnterer target) {

			}

			@Override
			protected void updateToPass(AssignedDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedDataEntererOperations.validateAssignedDataEntererTelecom(
					(AssignedDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateAssignedDataEntererTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedDataEntererAssignedPerson() {
		OperationsTestCase<AssignedDataEnterer> validateAssignedDataEntererAssignedPersonTestCase = new OperationsTestCase<AssignedDataEnterer>(
			"validateAssignedDataEntererAssignedPerson",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_DATA_ENTERER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedDataEnterer target) {

			}

			@Override
			protected void updateToPass(AssignedDataEnterer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedDataEntererOperations.validateAssignedDataEntererAssignedPerson(
					(AssignedDataEnterer) objectToTest, diagnostician, map);
			}

		};

		validateAssignedDataEntererAssignedPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedDataEntererOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedDataEnterer> {
		public AssignedDataEnterer create() {
			return ConsolFactory.eINSTANCE.createAssignedDataEnterer();
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
	private static class ConstructorTestClass extends AssignedDataEntererOperations {
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

} // AssignedDataEntererOperations
