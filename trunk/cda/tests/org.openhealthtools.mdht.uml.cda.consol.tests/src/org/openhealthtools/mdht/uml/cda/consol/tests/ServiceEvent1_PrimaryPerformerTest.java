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
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent1_PrimaryPerformer;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceEvent1_PrimaryPerformerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Event1 Primary Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent1_PrimaryPerformer#validatePrimaryPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Function Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ServiceEvent1_PrimaryPerformerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimaryPerformerFunctionCode() {
		OperationsTestCase<ServiceEvent1_PrimaryPerformer> validatePrimaryPerformerFunctionCodeTestCase = new OperationsTestCase<ServiceEvent1_PrimaryPerformer>(
			"validatePrimaryPerformerFunctionCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceEvent1_PrimaryPerformer target) {

			}

			@Override
			protected void updateToPass(ServiceEvent1_PrimaryPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceEvent1_PrimaryPerformerOperations.validatePrimaryPerformerFunctionCode(
					(ServiceEvent1_PrimaryPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePrimaryPerformerFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ServiceEvent1_PrimaryPerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ServiceEvent1_PrimaryPerformer> {
		public ServiceEvent1_PrimaryPerformer create() {
			return ConsolFactory.eINSTANCE.createServiceEvent1_PrimaryPerformer();
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
	private static class ConstructorTestClass extends ServiceEvent1_PrimaryPerformerOperations {
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

} // ServiceEvent1_PrimaryPerformerOperations
