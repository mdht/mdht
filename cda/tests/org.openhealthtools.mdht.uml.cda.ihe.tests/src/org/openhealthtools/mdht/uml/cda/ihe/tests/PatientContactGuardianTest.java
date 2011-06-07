/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PatientContactGuardianOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.AD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.TEL;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Contact Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PatientContactGuardian#validatePatientContactGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Contact Guardian Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientContactGuardianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientContactGuardianTemplateId() {
		OperationsTestCase<PatientContactGuardian> validatePatientContactGuardianTemplateIdTestCase = new OperationsTestCase<PatientContactGuardian>(
			"validatePatientContactGuardianTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_GUARDIAN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactGuardianOperations.validatePatientContactGuardianTemplateId(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactGuardianTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientContactGuardianAddr() {
		OperationsTestCase<PatientContactGuardian> validatePatientContactGuardianAddrTestCase = new OperationsTestCase<PatientContactGuardian>(
			"validatePatientContactGuardianAddr",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				AD ad = DatatypesFactory.eINSTANCE.createAD();
				target.getAddrs().add(ad);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactGuardianOperations.validatePatientContactGuardianAddr(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactGuardianAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientContactGuardianClassCode() {
		OperationsTestCase<PatientContactGuardian> validatePatientContactGuardianClassCodeTestCase = new OperationsTestCase<PatientContactGuardian>(
			"validatePatientContactGuardianClassCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_GUARDIAN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactGuardianOperations.validatePatientContactGuardianClassCode(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactGuardianClassCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientContactGuardianCode() {
		OperationsTestCase<PatientContactGuardian> validatePatientContactGuardianCodeTestCase = new OperationsTestCase<PatientContactGuardian>(
			"validatePatientContactGuardianCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_GUARDIAN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {

			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactGuardianOperations.validatePatientContactGuardianCode(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactGuardianCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated NOT
	*/
	@Test
	public void testValidatePatientContactGuardianTelecom() {
		OperationsTestCase<PatientContactGuardian> validatePatientContactGuardianTelecomTestCase = new OperationsTestCase<PatientContactGuardian>(
			"validatePatientContactGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_CONTACT_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientContactGuardian target) {
				target.init();
			}

			@Override
			protected void updateToPass(PatientContactGuardian target) {
				TEL tel = DatatypesFactory.eINSTANCE.createTEL();
				target.getTelecoms().add(tel);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientContactGuardianOperations.validatePatientContactGuardianTelecom(
					(PatientContactGuardian) objectToTest, diagnostician, map);
			}

		};

		validatePatientContactGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientContactGuardianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientContactGuardian> {

		public PatientContactGuardian create() {
			return IHEFactory.eINSTANCE.createPatientContactGuardian();
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
	private static class ConstructorTestClass extends PatientContactGuardianOperations {
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

} // PatientContactGuardianOperations
