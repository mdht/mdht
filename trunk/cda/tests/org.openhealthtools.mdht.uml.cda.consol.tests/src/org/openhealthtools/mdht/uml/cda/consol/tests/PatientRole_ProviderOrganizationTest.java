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
import org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.PatientRole_ProviderOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Role Provider Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization#validateProviderOrganizationHasNationalProviderIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Has National Provider Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization#validateProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization#validateProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization#validateProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.PatientRole_ProviderOrganization#validateProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientRole_ProviderOrganizationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationHasNationalProviderIdentifier() {
		OperationsTestCase<PatientRole_ProviderOrganization> validateProviderOrganizationHasNationalProviderIdentifierTestCase = new OperationsTestCase<PatientRole_ProviderOrganization>(
			"validateProviderOrganizationHasNationalProviderIdentifier",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_HAS_NATIONAL_PROVIDER_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(PatientRole_ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationHasNationalProviderIdentifier(
					(PatientRole_ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationHasNationalProviderIdentifierTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationAddr() {
		OperationsTestCase<PatientRole_ProviderOrganization> validateProviderOrganizationAddrTestCase = new OperationsTestCase<PatientRole_ProviderOrganization>(
			"validateProviderOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(PatientRole_ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationAddr(
					(PatientRole_ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationId() {
		OperationsTestCase<PatientRole_ProviderOrganization> validateProviderOrganizationIdTestCase = new OperationsTestCase<PatientRole_ProviderOrganization>(
			"validateProviderOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(PatientRole_ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationId(
					(PatientRole_ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationName() {
		OperationsTestCase<PatientRole_ProviderOrganization> validateProviderOrganizationNameTestCase = new OperationsTestCase<PatientRole_ProviderOrganization>(
			"validateProviderOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(PatientRole_ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationName(
					(PatientRole_ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationNameTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationTelecom() {
		OperationsTestCase<PatientRole_ProviderOrganization> validateProviderOrganizationTelecomTestCase = new OperationsTestCase<PatientRole_ProviderOrganization>(
			"validateProviderOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientRole_ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(PatientRole_ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientRole_ProviderOrganizationOperations.validateProviderOrganizationTelecom(
					(PatientRole_ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientRole_ProviderOrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientRole_ProviderOrganization> {
		public PatientRole_ProviderOrganization create() {
			return ConsolFactory.eINSTANCE.createPatientRole_ProviderOrganization();
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
	private static class ConstructorTestClass extends PatientRole_ProviderOrganizationOperations {
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

} // PatientRole_ProviderOrganizationOperations
