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
import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodian;
import org.openhealthtools.mdht.uml.cda.consol.ConsolFactory;
import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservationCustodianOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Advance Directive Observation Custodian</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodian#validateAdvanceDirectiveObservationCustodianTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservationCustodian#validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Advance Directive Observation Custodian Advance Directive Observation Custodian Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class AdvanceDirectiveObservationCustodianTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianTypeCode() {
		OperationsTestCase<AdvanceDirectiveObservationCustodian> validateAdvanceDirectiveObservationCustodianTypeCodeTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodian>(
			"validateAdvanceDirectiveObservationCustodianTypeCode",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodian target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianOperations.validateAdvanceDirectiveObservationCustodianTypeCode(
					(AdvanceDirectiveObservationCustodian) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianTypeCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole() {
		OperationsTestCase<AdvanceDirectiveObservationCustodian> validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase = new OperationsTestCase<AdvanceDirectiveObservationCustodian>(
			"validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole",
			operationsForOCL.getOCLValue("VALIDATE_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(AdvanceDirectiveObservationCustodian target) {

			}

			@Override
			protected void updateToPass(AdvanceDirectiveObservationCustodian target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return AdvanceDirectiveObservationCustodianOperations.validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRole(
					(AdvanceDirectiveObservationCustodian) objectToTest, diagnostician, map);
			}

		};

		validateAdvanceDirectiveObservationCustodianAdvanceDirectiveObservationCustodianRoleTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends AdvanceDirectiveObservationCustodianOperations {
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
	private static class ObjectFactory implements TestObjectFactory<AdvanceDirectiveObservationCustodian> {
		public AdvanceDirectiveObservationCustodian create() {
			return ConsolFactory.eINSTANCE.createAdvanceDirectiveObservationCustodian();
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
	private static class ConstructorTestClass extends AdvanceDirectiveObservationCustodianOperations {
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

} // AdvanceDirectiveObservationCustodianOperations
