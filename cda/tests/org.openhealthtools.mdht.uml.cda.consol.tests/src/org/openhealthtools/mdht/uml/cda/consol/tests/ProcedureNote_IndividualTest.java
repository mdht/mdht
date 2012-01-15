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
import org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Individual;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProcedureNote_IndividualOperations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Procedure Note Individual</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ProcedureNote_Individual#validateIndividualTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Individual Type Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class ProcedureNote_IndividualTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateIndividualTypeId() {
		OperationsTestCase<ProcedureNote_Individual> validateIndividualTypeIdTestCase = new OperationsTestCase<ProcedureNote_Individual>(
			"validateIndividualTypeId",
			operationsForOCL.getOCLValue("VALIDATE_INDIVIDUAL_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(ProcedureNote_Individual target) {

			}

			@Override
			protected void updateToPass(ProcedureNote_Individual target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return ProcedureNote_IndividualOperations.validateIndividualTypeId(
					(ProcedureNote_Individual) objectToTest, diagnostician, map);
			}

		};

		validateIndividualTypeIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends ProcedureNote_IndividualOperations {
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
	private static class ObjectFactory implements TestObjectFactory<ProcedureNote_Individual> {
		public ProcedureNote_Individual create() {
			return ConsolFactory.eINSTANCE.createProcedureNote_Individual();
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
	private static class ConstructorTestClass extends ProcedureNote_IndividualOperations {
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

} // ProcedureNote_IndividualOperations
