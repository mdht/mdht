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
import org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate;
import org.openhealthtools.mdht.uml.cda.ihe.operations.PHRUpdateOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHR Update</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PHRUpdate#validatePHRUpdateTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHR Update Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PHRUpdateTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePHRUpdateTemplateId() {
		OperationsTestCase<PHRUpdate> validatePHRUpdateTemplateIdTestCase = new OperationsTestCase<PHRUpdate>(
			"validatePHRUpdateTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PHR_UPDATE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PHRUpdate target) {

			}

			@Override
			protected void updateToPass(PHRUpdate target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PHRUpdateOperations.validatePHRUpdateTemplateId((PHRUpdate) objectToTest, diagnostician, map);
			}

		};

		validatePHRUpdateTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PHRUpdateOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PHRUpdate> {

		public PHRUpdate create() {
			return IHEFactory.eINSTANCE.createPHRUpdate();
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
	private static class ConstructorTestClass extends PHRUpdateOperations {
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

} // PHRUpdateOperations
