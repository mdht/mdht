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
import org.openhealthtools.mdht.uml.cda.consol.InternalReference;
import org.openhealthtools.mdht.uml.cda.consol.operations.InternalReferenceOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Internal Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InternalReference#validateInternalReferenceId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InternalReference#validateInternalReferenceCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Internal Reference Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class InternalReferenceTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInternalReferenceId() {
		OperationsTestCase<InternalReference> validateInternalReferenceIdTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceId",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {

			}

			@Override
			protected void updateToPass(InternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InternalReferenceOperations.validateInternalReferenceId(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		validateInternalReferenceIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateInternalReferenceCode() {
		OperationsTestCase<InternalReference> validateInternalReferenceCodeTestCase = new OperationsTestCase<InternalReference>(
			"validateInternalReferenceCode",
			operationsForOCL.getOCLValue("VALIDATE_INTERNAL_REFERENCE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(InternalReference target) {

			}

			@Override
			protected void updateToPass(InternalReference target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return InternalReferenceOperations.validateInternalReferenceCode(
					(InternalReference) objectToTest, diagnostician, map);
			}

		};

		validateInternalReferenceCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends InternalReferenceOperations {
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
	private static class ObjectFactory implements TestObjectFactory<InternalReference> {
		public InternalReference create() {
			return ConsolFactory.eINSTANCE.createInternalReference();
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
	private static class ConstructorTestClass extends InternalReferenceOperations {
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

} // InternalReferenceOperations
