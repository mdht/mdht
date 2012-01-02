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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole;

import org.openhealthtools.mdht.uml.cda.consol.operations.RecordTarget_PatientRoleOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Record Target Patient Role</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRoleTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole#validatePatientRolePatient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role Patient</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RecordTarget_PatientRoleTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRoleAddr() {
		OperationsTestCase<RecordTarget_PatientRole> validatePatientRoleAddrTestCase = new OperationsTestCase<RecordTarget_PatientRole>(
			"validatePatientRoleAddr",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ROLE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(RecordTarget_PatientRole target) {

			}

			@Override
			protected void updateToPass(RecordTarget_PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RecordTarget_PatientRoleOperations.validatePatientRoleAddr(
					(RecordTarget_PatientRole) objectToTest, diagnostician, map);
			}

		};

		validatePatientRoleAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRoleId() {
		OperationsTestCase<RecordTarget_PatientRole> validatePatientRoleIdTestCase = new OperationsTestCase<RecordTarget_PatientRole>(
			"validatePatientRoleId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(RecordTarget_PatientRole target) {

			}

			@Override
			protected void updateToPass(RecordTarget_PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RecordTarget_PatientRoleOperations.validatePatientRoleId(
					(RecordTarget_PatientRole) objectToTest, diagnostician, map);
			}

		};

		validatePatientRoleIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRoleTelecom() {
		OperationsTestCase<RecordTarget_PatientRole> validatePatientRoleTelecomTestCase = new OperationsTestCase<RecordTarget_PatientRole>(
			"validatePatientRoleTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ROLE_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RecordTarget_PatientRole target) {

			}

			@Override
			protected void updateToPass(RecordTarget_PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RecordTarget_PatientRoleOperations.validatePatientRoleTelecom(
					(RecordTarget_PatientRole) objectToTest, diagnostician, map);
			}

		};

		validatePatientRoleTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRolePatient() {
		OperationsTestCase<RecordTarget_PatientRole> validatePatientRolePatientTestCase = new OperationsTestCase<RecordTarget_PatientRole>(
			"validatePatientRolePatient",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ROLE_PATIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(RecordTarget_PatientRole target) {

			}

			@Override
			protected void updateToPass(RecordTarget_PatientRole target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RecordTarget_PatientRoleOperations.validatePatientRolePatient(
					(RecordTarget_PatientRole) objectToTest, diagnostician, map);
			}

		};

		validatePatientRolePatientTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RecordTarget_PatientRoleOperations {
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
	private static class ObjectFactory implements TestObjectFactory<RecordTarget_PatientRole> {
		public RecordTarget_PatientRole create() {
			return ConsolFactory.eINSTANCE.createRecordTarget_PatientRole();
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
	private static class ConstructorTestClass extends RecordTarget_PatientRoleOperations {
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

} // RecordTarget_PatientRoleOperations
