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
import org.openhealthtools.mdht.uml.cda.consol.PatientRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientRoleOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole#validateConsolPatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Role Patient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole#validateConsolPatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole#validateConsolPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole#validateConsolPatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Patient Role Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientRoleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientRoleAddr() {
		OperationsTestCase<PatientRole> validateConsolPatientRoleAddrTestCase = new OperationsTestCase<PatientRole>(
			"validateConsolPatientRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole target) {

			}

			@Override
			protected void updateToPass(PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRoleOperations.validateConsolPatientRoleAddr(
					(PatientRole) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientRoleId() {
		OperationsTestCase<PatientRole> validateConsolPatientRoleIdTestCase = new OperationsTestCase<PatientRole>(
			"validateConsolPatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole target) {

			}

			@Override
			protected void updateToPass(PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRoleOperations.validateConsolPatientRoleId((PatientRole) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientRoleTelecom() {
		OperationsTestCase<PatientRole> validateConsolPatientRoleTelecomTestCase = new OperationsTestCase<PatientRole>(
			"validateConsolPatientRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole target) {

			}

			@Override
			protected void updateToPass(PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRoleOperations.validateConsolPatientRoleTelecom(
					(PatientRole) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolPatientRolePatient() {
		OperationsTestCase<PatientRole> validateConsolPatientRolePatientTestCase = new OperationsTestCase<PatientRole>(
			"validateConsolPatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole target) {

			}

			@Override
			protected void updateToPass(PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRoleOperations.validateConsolPatientRolePatient(
					(PatientRole) objectToTest, diagnostician, map);
			}

		};

		validateConsolPatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientRoleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientRole> {
		public PatientRole create() {
			return ConsolFactory.eINSTANCE.createPatientRole();
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
	private static class ConstructorTestClass extends PatientRoleOperations {
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

} // PatientRoleOperations
