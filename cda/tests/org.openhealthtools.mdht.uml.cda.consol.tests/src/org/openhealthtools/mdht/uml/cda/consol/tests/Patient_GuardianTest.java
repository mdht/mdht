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

import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian;

import org.openhealthtools.mdht.uml.cda.consol.operations.Patient_GuardianOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Patient_Guardian#validateGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Guardian Guardian Person</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class Patient_GuardianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGuardianAddr() {
		OperationsTestCase<Patient_Guardian> validateGuardianAddrTestCase = new OperationsTestCase<Patient_Guardian>(
			"validateGuardianAddr",
			operationsForOCL.getOCLValue("VALIDATE_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Patient_Guardian target) {

			}

			@Override
			protected void updateToPass(Patient_Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_GuardianOperations.validateGuardianAddr(
					(Patient_Guardian) objectToTest, diagnostician, map);
			}

		};

		validateGuardianAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGuardianCode() {
		OperationsTestCase<Patient_Guardian> validateGuardianCodeTestCase = new OperationsTestCase<Patient_Guardian>(
			"validateGuardianCode",
			operationsForOCL.getOCLValue("VALIDATE_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Patient_Guardian target) {

			}

			@Override
			protected void updateToPass(Patient_Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_GuardianOperations.validateGuardianCode(
					(Patient_Guardian) objectToTest, diagnostician, map);
			}

		};

		validateGuardianCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGuardianTelecom() {
		OperationsTestCase<Patient_Guardian> validateGuardianTelecomTestCase = new OperationsTestCase<Patient_Guardian>(
			"validateGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(Patient_Guardian target) {

			}

			@Override
			protected void updateToPass(Patient_Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_GuardianOperations.validateGuardianTelecom(
					(Patient_Guardian) objectToTest, diagnostician, map);
			}

		};

		validateGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateGuardianGuardianPerson() {
		OperationsTestCase<Patient_Guardian> validateGuardianGuardianPersonTestCase = new OperationsTestCase<Patient_Guardian>(
			"validateGuardianGuardianPerson",
			operationsForOCL.getOCLValue("VALIDATE_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Patient_Guardian target) {

			}

			@Override
			protected void updateToPass(Patient_Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return Patient_GuardianOperations.validateGuardianGuardianPerson(
					(Patient_Guardian) objectToTest, diagnostician, map);
			}

		};

		validateGuardianGuardianPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends Patient_GuardianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Patient_Guardian> {
		public Patient_Guardian create() {
			return ConsolFactory.eINSTANCE.createPatient_Guardian();
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
	private static class ConstructorTestClass extends Patient_GuardianOperations {
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

} // Patient_GuardianOperations
