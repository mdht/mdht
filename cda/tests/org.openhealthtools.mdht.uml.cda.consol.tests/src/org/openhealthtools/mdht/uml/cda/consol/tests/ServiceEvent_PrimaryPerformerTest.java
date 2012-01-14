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
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceEvent_PrimaryPerformerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Event Primary Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer#validatePrimaryPerformerFunctionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Function Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent_PrimaryPerformer#validatePrimaryPerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Performer Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ServiceEvent_PrimaryPerformerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimaryPerformerFunctionCode() {
		OperationsTestCase<ServiceEvent_PrimaryPerformer> validatePrimaryPerformerFunctionCodeTestCase = new OperationsTestCase<ServiceEvent_PrimaryPerformer>(
			"validatePrimaryPerformerFunctionCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_PERFORMER_FUNCTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceEvent_PrimaryPerformer target) {

			}

			@Override
			protected void updateToPass(ServiceEvent_PrimaryPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceEvent_PrimaryPerformerOperations.validatePrimaryPerformerFunctionCode(
					(ServiceEvent_PrimaryPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePrimaryPerformerFunctionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePrimaryPerformerTypeCode() {
		OperationsTestCase<ServiceEvent_PrimaryPerformer> validatePrimaryPerformerTypeCodeTestCase = new OperationsTestCase<ServiceEvent_PrimaryPerformer>(
			"validatePrimaryPerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PRIMARY_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceEvent_PrimaryPerformer target) {

			}

			@Override
			protected void updateToPass(ServiceEvent_PrimaryPerformer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceEvent_PrimaryPerformerOperations.validatePrimaryPerformerTypeCode(
					(ServiceEvent_PrimaryPerformer) objectToTest, diagnostician, map);
			}

		};

		validatePrimaryPerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ServiceEvent_PrimaryPerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ServiceEvent_PrimaryPerformer> {
		public ServiceEvent_PrimaryPerformer create() {
			return ConsolFactory.eINSTANCE.createServiceEvent_PrimaryPerformer();
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
	private static class ConstructorTestClass extends ServiceEvent_PrimaryPerformerOperations {
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

} // ServiceEvent_PrimaryPerformerOperations
