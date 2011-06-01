/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ccd.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;

import org.eclipse.emf.ecore.EObject;

import org.junit.Test;

import org.openhealthtools.mdht.uml.cda.ccd.CCDFactory;
import org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber;

import org.openhealthtools.mdht.uml.cda.ccd.operations.PolicySubscriberOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.TestObjectFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Policy Subscriber</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.PolicySubscriber#validatePolicySubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Policy Subscriber Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PolicySubscriberTest extends CDAValidationTest {

	/**
	 *
	 * @generated
	 */
	@Test
	public void testValidatePolicySubscriberId() {
		OperationsTestCase<PolicySubscriber> validatePolicySubscriberIdTestCase = new OperationsTestCase<PolicySubscriber>(
				"validatePolicySubscriberId",
				operationsForOCL
						.getOCLValue("VALIDATE_POLICY_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(PolicySubscriber target) {

			}

			@Override
			protected void updateToPass(PolicySubscriber target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PolicySubscriberOperations.validatePolicySubscriberId(
						(PolicySubscriber) objectToTest, diagnostician, map);
			}

		};

		validatePolicySubscriberIdTestCase.doValidationTest();
	}

	/**
	 *
	 * @generated
	 */
	private static class OperationsForOCL extends PolicySubscriberOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass()
						.getDeclaredField(fieldName).get(this);
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
	private static class ObjectFactory implements
			TestObjectFactory<PolicySubscriber> {
		public PolicySubscriber create() {
			return CCDFactory.eINSTANCE.createPolicySubscriber();
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
	 *
	 * @generated
	 */
	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // PolicySubscriberOperations