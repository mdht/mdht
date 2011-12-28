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

import org.openhealthtools.mdht.uml.cda.consol.AssignedInformant;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;

import org.openhealthtools.mdht.uml.cda.consol.operations.AssignedInformantOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assigned Informant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedInformant#validateAssignedInformantAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Informant Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedInformant#validateAssignedInformantCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Informant Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AssignedInformant#validateAssignedInformantId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assigned Informant Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AssignedInformantTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedInformantAddr() {
		OperationsTestCase<AssignedInformant> validateAssignedInformantAddrTestCase = new OperationsTestCase<AssignedInformant>(
			"validateAssignedInformantAddr",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_INFORMANT_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedInformant target) {

			}

			@Override
			protected void updateToPass(AssignedInformant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedInformantOperations.validateAssignedInformantAddr(
					(AssignedInformant) objectToTest, diagnostician, map);
			}

		};

		validateAssignedInformantAddrTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedInformantCode() {
		OperationsTestCase<AssignedInformant> validateAssignedInformantCodeTestCase = new OperationsTestCase<AssignedInformant>(
			"validateAssignedInformantCode",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_INFORMANT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedInformant target) {

			}

			@Override
			protected void updateToPass(AssignedInformant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedInformantOperations.validateAssignedInformantCode(
					(AssignedInformant) objectToTest, diagnostician, map);
			}

		};

		validateAssignedInformantCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAssignedInformantId() {
		OperationsTestCase<AssignedInformant> validateAssignedInformantIdTestCase = new OperationsTestCase<AssignedInformant>(
			"validateAssignedInformantId",
			operationsForOCL.getOCLValue("VALIDATE_ASSIGNED_INFORMANT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AssignedInformant target) {

			}

			@Override
			protected void updateToPass(AssignedInformant target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AssignedInformantOperations.validateAssignedInformantId(
					(AssignedInformant) objectToTest, diagnostician, map);
			}

		};

		validateAssignedInformantIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AssignedInformantOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AssignedInformant> {
		public AssignedInformant create() {
			return ConsolFactory.eINSTANCE.createAssignedInformant();
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
	private static class ConstructorTestClass extends AssignedInformantOperations {
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

} // AssignedInformantOperations
