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
import org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer;

import org.openhealthtools.mdht.uml.cda.consol.operations.ServiceEvent3_PerformerOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Service Event3 Performer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer#validatePerformerTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Performer Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ServiceEvent3_Performer#validatePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Performer Assigned Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ServiceEvent3_PerformerTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePerformerTypeCode() {
		OperationsTestCase<ServiceEvent3_Performer> validatePerformerTypeCodeTestCase = new OperationsTestCase<ServiceEvent3_Performer>(
			"validatePerformerTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_PERFORMER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ServiceEvent3_Performer target) {

			}

			@Override
			protected void updateToPass(ServiceEvent3_Performer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceEvent3_PerformerOperations.validatePerformerTypeCode(
					(ServiceEvent3_Performer) objectToTest, diagnostician, map);
			}

		};

		validatePerformerTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePerformerAssignedEntity() {
		OperationsTestCase<ServiceEvent3_Performer> validatePerformerAssignedEntityTestCase = new OperationsTestCase<ServiceEvent3_Performer>(
			"validatePerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ServiceEvent3_Performer target) {

			}

			@Override
			protected void updateToPass(ServiceEvent3_Performer target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ServiceEvent3_PerformerOperations.validatePerformerAssignedEntity(
					(ServiceEvent3_Performer) objectToTest, diagnostician, map);
			}

		};

		validatePerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ServiceEvent3_PerformerOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ServiceEvent3_Performer> {
		public ServiceEvent3_Performer create() {
			return ConsolFactory.eINSTANCE.createServiceEvent3_Performer();
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
	private static class ConstructorTestClass extends ServiceEvent3_PerformerOperations {
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

} // ServiceEvent3_PerformerOperations
