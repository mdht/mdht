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
import org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure;
import org.openhealthtools.mdht.uml.cda.ccd.operations.ProcedureActivityProcedureOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>Procedure Activity Procedure</b></em>' model objects. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following operations are supported:
 * <ul>
 * <li>
 * {@link org.openhealthtools.mdht.uml.cda.ccd.ProcedureActivityProcedure#validateProcedureActivityProcedureTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
 * <em>Validate Procedure Activity Procedure Template Id</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */

public class ProcedureActivityProcedureTest extends CDAValidationTest {

	/**
	 * 
	 * @generated
	 */
	@Test
	public void testValidateProcedureActivityProcedureTemplateId() {
		OperationsTestCase<ProcedureActivityProcedure> validateProcedureActivityProcedureTemplateIdTestCase = new OperationsTestCase<ProcedureActivityProcedure>(
				"validateProcedureActivityProcedureTemplateId",
				operationsForOCL
						.getOCLValue("VALIDATE_PROCEDURE_ACTIVITY_PROCEDURE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
				objectFactory) {

			@Override
			protected void updateToFail(ProcedureActivityProcedure target) {

			}

			@Override
			protected void updateToPass(ProcedureActivityProcedure target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest,
					BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureActivityProcedureOperations
						.validateProcedureActivityProcedureTemplateId(
								(ProcedureActivityProcedure) objectToTest,
								diagnostician, map);
			}

		};

		validateProcedureActivityProcedureTemplateIdTestCase.doValidationTest();
	}

	/**
	 * 
	 * @generated
	 */
	private static class OperationsForOCL extends
			ProcedureActivityProcedureOperations {
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
			TestObjectFactory<ProcedureActivityProcedure> {
		public ProcedureActivityProcedure create() {
			return CCDFactory.eINSTANCE.createProcedureActivityProcedure();
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

} // ProcedureActivityProcedureOperations