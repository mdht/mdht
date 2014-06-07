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
import org.openhealthtools.mdht.uml.cda.CDAFactory;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.ObserverContext;
import org.openhealthtools.mdht.uml.cda.consol.operations.ObserverContextOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Observer Context</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObserverContext#validateObserverContextTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ObserverContext#validateObserverContextAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Observer Context Assigned Author</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ObserverContextTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateObserverContextTemplateId() {
		OperationsTestCase<ObserverContext> validateObserverContextTemplateIdTestCase = new OperationsTestCase<ObserverContext>(
			"validateObserverContextTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_OBSERVER_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObserverContext target) {

			}

			@Override
			protected void updateToPass(ObserverContext target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObserverContextOperations.validateObserverContextTemplateId(
					(ObserverContext) objectToTest, diagnostician, map);
			}

		};

		validateObserverContextTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateObserverContextAssignedAuthor() {
		OperationsTestCase<ObserverContext> validateObserverContextAssignedAuthorTestCase = new OperationsTestCase<ObserverContext>(
			"validateObserverContextAssignedAuthor",
			operationsForOCL.getOCLValue("VALIDATE_OBSERVER_CONTEXT_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ObserverContext target) {
				target.init();
			}

			@Override
			protected void updateToPass(ObserverContext target) {
				target.setAssignedAuthor(CDAFactory.eINSTANCE.createAssignedAuthor());

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ObserverContextOperations.validateObserverContextAssignedAuthor(
					(ObserverContext) objectToTest, diagnostician, map);
			}

		};

		validateObserverContextAssignedAuthorTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ObserverContextOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ObserverContext> {
		public ObserverContext create() {
			return ConsolFactory.eINSTANCE.createObserverContext();
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
	private static class ConstructorTestClass extends ObserverContextOperations {
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

} // ObserverContextOperations
