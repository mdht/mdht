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
import org.openhealthtools.mdht.uml.cda.consol.Procedure;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Procedure#validateConsolProcedureHasCodeOriginalText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Procedure Has Code Original Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Procedure#validateConsolProcedurePerformerAssignedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Procedure Performer Assigned Entity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Procedure#validateConsolProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Procedure#validateConsolProcedureTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Procedure Target Site Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolProcedureHasCodeOriginalText() {
		OperationsTestCase<Procedure> validateConsolProcedureHasCodeOriginalTextTestCase = new OperationsTestCase<Procedure>(
			"validateConsolProcedureHasCodeOriginalText",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PROCEDURE_HAS_CODE_ORIGINAL_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

				ED text = DatatypesFactory.eINSTANCE.createED();
				target.setText(text);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateConsolProcedureHasCodeOriginalText(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateConsolProcedureHasCodeOriginalTextTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolProcedurePerformerAssignedEntity() {
		OperationsTestCase<Procedure> validateConsolProcedurePerformerAssignedEntityTestCase = new OperationsTestCase<Procedure>(
			"validateConsolProcedurePerformerAssignedEntity",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PROCEDURE_PERFORMER_ASSIGNED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateConsolProcedurePerformerAssignedEntity(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateConsolProcedurePerformerAssignedEntityTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolProcedureCode() {
		OperationsTestCase<Procedure> validateConsolProcedureCodeTestCase = new OperationsTestCase<Procedure>(
			"validateConsolProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateConsolProcedureCode((Procedure) objectToTest, diagnostician, map);
			}

		};

		validateConsolProcedureCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateConsolProcedureTargetSiteCode() {
		OperationsTestCase<Procedure> validateConsolProcedureTargetSiteCodeTestCase = new OperationsTestCase<Procedure>(
			"validateConsolProcedureTargetSiteCode",
			operationsForOCL.getOCLValue("VALIDATE_CONSOL_PROCEDURE_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(Procedure target) {

			}

			@Override
			protected void updateToPass(Procedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureOperations.validateConsolProcedureTargetSiteCode(
					(Procedure) objectToTest, diagnostician, map);
			}

		};

		validateConsolProcedureTargetSiteCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<Procedure> {
		public Procedure create() {
			return ConsolFactory.eINSTANCE.createProcedure();
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
	private static class ConstructorTestClass extends ProcedureOperations {
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

} // ProcedureOperations
