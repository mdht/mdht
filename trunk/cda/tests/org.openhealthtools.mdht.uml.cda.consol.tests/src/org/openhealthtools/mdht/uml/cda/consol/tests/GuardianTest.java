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
import org.openhealthtools.mdht.uml.cda.consol.Guardian;

import org.openhealthtools.mdht.uml.cda.consol.operations.GuardianOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Guardian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianGuardianPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Guardian Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Guardian#validateConsolGuardianTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Guardian Telecom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class GuardianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolGuardianAddr() {
		OperationsTestCase<Guardian> validateConsolGuardianAddrTestCase = new OperationsTestCase<Guardian>(
			"validateConsolGuardianAddr",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_GUARDIAN_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Guardian target) {

			}

			@Override
			protected void updateToPass(Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GuardianOperations.validateConsolGuardianAddr((Guardian) objectToTest, diagnostician, map);
			}

		};

		validateConsolGuardianAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolGuardianTelecom() {
		OperationsTestCase<Guardian> validateConsolGuardianTelecomTestCase = new OperationsTestCase<Guardian>(
			"validateConsolGuardianTelecom",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_GUARDIAN_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Guardian target) {

			}

			@Override
			protected void updateToPass(Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GuardianOperations.validateConsolGuardianTelecom((Guardian) objectToTest, diagnostician, map);
			}

		};

		validateConsolGuardianTelecomTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolGuardianGuardianPerson() {
		OperationsTestCase<Guardian> validateConsolGuardianGuardianPersonTestCase = new OperationsTestCase<Guardian>(
			"validateConsolGuardianGuardianPerson",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_GUARDIAN_GUARDIAN_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Guardian target) {

			}

			@Override
			protected void updateToPass(Guardian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return GuardianOperations.validateConsolGuardianGuardianPerson(
					(Guardian) objectToTest, diagnostician, map);
			}

		};

		validateConsolGuardianGuardianPersonTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends GuardianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Guardian> {
		public Guardian create() {
			return ConsolFactory.eINSTANCE.createGuardian();
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
	private static class ConstructorTestClass extends GuardianOperations {
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

} // GuardianOperations
