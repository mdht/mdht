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
import org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProviderOrganizationOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Provider Organization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProviderOrganization#validateProviderOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Provider Organization Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProviderOrganizationTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateProviderOrganizationAddr() {
		OperationsTestCase<ProviderOrganization> validateProviderOrganizationAddrTestCase = new OperationsTestCase<ProviderOrganization>(
			"validateProviderOrganizationAddr",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderOrganizationOperations.validateProviderOrganizationAddr(
					(ProviderOrganization) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProviderOrganization> validateProviderOrganizationIdTestCase = new OperationsTestCase<ProviderOrganization>(
			"validateProviderOrganizationId",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderOrganizationOperations.validateProviderOrganizationId(
					(ProviderOrganization) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProviderOrganization> validateProviderOrganizationNameTestCase = new OperationsTestCase<ProviderOrganization>(
			"validateProviderOrganizationName",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderOrganizationOperations.validateProviderOrganizationName(
					(ProviderOrganization) objectToTest, diagnostician, map);
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
		OperationsTestCase<ProviderOrganization> validateProviderOrganizationTelecomTestCase = new OperationsTestCase<ProviderOrganization>(
			"validateProviderOrganizationTelecom",
			operationsForOCL.getOCLValue("VALIDATE_PROVIDER_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProviderOrganization target) {

			}

			@Override
			protected void updateToPass(ProviderOrganization target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProviderOrganizationOperations.validateProviderOrganizationTelecom(
					(ProviderOrganization) objectToTest, diagnostician, map);
			}

		};

		validateProviderOrganizationTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProviderOrganizationOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProviderOrganization> {
		public ProviderOrganization create() {
			return ConsolFactory.eINSTANCE.createProviderOrganization();
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
	private static class ConstructorTestClass extends ProviderOrganizationOperations {
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

} // ProviderOrganizationOperations
