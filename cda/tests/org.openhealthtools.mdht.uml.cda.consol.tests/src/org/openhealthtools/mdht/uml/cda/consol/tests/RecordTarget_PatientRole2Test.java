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
import org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole2;

import org.openhealthtools.mdht.uml.cda.consol.operations.RecordTarget_PatientRole2Operations;

import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Record Target Patient Role2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.RecordTarget_PatientRole2#validatePatientRole2Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Role2 Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class RecordTarget_PatientRole2Test extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientRole2Id() {
		OperationsTestCase<RecordTarget_PatientRole2> validatePatientRole2IdTestCase = new OperationsTestCase<RecordTarget_PatientRole2>(
			"validatePatientRole2Id",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_ROLE2_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(RecordTarget_PatientRole2 target) {

			}

			@Override
			protected void updateToPass(RecordTarget_PatientRole2 target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return RecordTarget_PatientRole2Operations.validatePatientRole2Id(
					(RecordTarget_PatientRole2) objectToTest, diagnostician, map);
			}

		};

		validatePatientRole2IdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends RecordTarget_PatientRole2Operations {
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
	private static class ObjectFactory implements TestObjectFactory<RecordTarget_PatientRole2> {
		public RecordTarget_PatientRole2 create() {
			return ConsolFactory.eINSTANCE.createRecordTarget_PatientRole2();
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
	private static class ConstructorTestClass extends RecordTarget_PatientRole2Operations {
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

} // RecordTarget_PatientRole2Operations
