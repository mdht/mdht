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
import org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Custodian;
import org.openhealthtools.mdht.uml.cda.consol.operations.UnstructuredDocument_CustodianOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Unstructured Document Custodian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.UnstructuredDocument_Custodian#validateCustodianAssignedCustodian2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Custodian Assigned Custodian2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class UnstructuredDocument_CustodianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateCustodianAssignedCustodian2() {
		OperationsTestCase<UnstructuredDocument_Custodian> validateCustodianAssignedCustodian2TestCase = new OperationsTestCase<UnstructuredDocument_Custodian>(
			"validateCustodianAssignedCustodian2",
			operationsForOCL.getOCLValue("VALIDATE_CUSTODIAN_ASSIGNED_CUSTODIAN2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(UnstructuredDocument_Custodian target) {

			}

			@Override
			protected void updateToPass(UnstructuredDocument_Custodian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return UnstructuredDocument_CustodianOperations.validateCustodianAssignedCustodian2(
					(UnstructuredDocument_Custodian) objectToTest, diagnostician, map);
			}

		};

		validateCustodianAssignedCustodian2TestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends UnstructuredDocument_CustodianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<UnstructuredDocument_Custodian> {
		public UnstructuredDocument_Custodian create() {
			return ConsolFactory.eINSTANCE.createUnstructuredDocument_Custodian();
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
	private static class ConstructorTestClass extends UnstructuredDocument_CustodianOperations {
	}

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

} // UnstructuredDocument_CustodianOperations
