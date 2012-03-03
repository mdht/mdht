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
import org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AuthorizationActivityOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Authorization Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AuthorizationActivity#validateAuthorizationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Authorization Activity Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AuthorizationActivityTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAuthorizationActivityTemplateId() {
			OperationsTestCase<AuthorizationActivity> validateAuthorizationActivityTemplateIdTestCase = new OperationsTestCase<AuthorizationActivity>(
			"validateAuthorizationActivityTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_AUTHORIZATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP")
			,objectFactory) {

			@Override
			protected void updateToFail(AuthorizationActivity target) {

			}

			@Override
			protected void updateToPass(AuthorizationActivity target) {
				target.init();
				
				
				
				
				

				
				

	
			

	
		
		
			
				
		
			
				
			
				
				
				
				
				
				
				
			
			
					
			
				
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {
			
			
			
				return AuthorizationActivityOperations.validateAuthorizationActivityTemplateId(
					(AuthorizationActivity) objectToTest, diagnostician, map);
			}

		};

		validateAuthorizationActivityTemplateIdTestCase.doValidationTest();
}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AuthorizationActivityOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AuthorizationActivity> {
		public AuthorizationActivity create() {
			return ConsolFactory.eINSTANCE.createAuthorizationActivity();
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
	private static class ConstructorTestClass extends AuthorizationActivityOperations {
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

} // AuthorizationActivityOperations
