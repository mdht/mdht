/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolFactory;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedure Activity Procedure</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateMu2consolProcedureActivityProcedureCodeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateMu2consolProcedureActivityProcedureCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mu2consol Procedure Activity Procedure Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMu2consolProcedureActivityProcedureCodeValue() {
		OperationsTestCase<ProcedureActivityProcedure> validateMu2consolProcedureActivityProcedureCodeValueTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateMu2consolProcedureActivityProcedureCodeValue",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				value.setCode("testCode");
				value.setCodeSystem("2.16.840.1.113883.6.96");
				target.setCode(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateMu2consolProcedureActivityProcedureCodeValue(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolProcedureActivityProcedureCodeValueTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated NOT
	 */
	@Test
	public void testValidateMu2consolProcedureActivityProcedureCode() {
		OperationsTestCase<ProcedureActivityProcedure> validateMu2consolProcedureActivityProcedureCodeTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateMu2consolProcedureActivityProcedureCode",
			operationsForOCL.getOCLValue("VALIDATE_MU2CONSOL_PROCEDURE_ACTIVITY_PROCEDURE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();
				CD cd = DatatypesFactory.eINSTANCE.createCD();
				target.setCode(cd);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateMu2consolProcedureActivityProcedureCode(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateMu2consolProcedureActivityProcedureCodeTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
			"validateProcedureActivityProcedureTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations.validateProcedureActivityProcedureTemplateId(
					(ProcedureActivityProcedure) objectToTest, diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends ProcedureActivityProcedureOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureActivityProcedure> {

		public ProcedureActivityProcedure create() {
			return Mu2consolFactory.eINSTANCE.createProcedureActivityProcedure();
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
	 * 
	 * @generated
	 */
	private static class ConstructorTestClass extends ProcedureActivityProcedureOperations {
	};

	/**
	 * Tests Operations Constructor for 100% coverage
	 * 
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

} // ProcedureActivityProcedureOperations
