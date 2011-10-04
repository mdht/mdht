/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.ihe.DischargeDiet;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.DischargeDietOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Discharge Diet</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiet#validateDischargeDietTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.DischargeDiet#validateDischargeDietCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Discharge Diet Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class DischargeDietTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietTemplateId() {
		OperationsTestCase<DischargeDiet> validateDischargeDietTemplateIdTestCase = new OperationsTestCase<DischargeDiet>(
			"validateDischargeDietTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(DischargeDiet target) {

			}

			@Override
			protected void updateToPass(DischargeDiet target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietOperations.validateDischargeDietTemplateId(
					(DischargeDiet) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateDischargeDietCode() {
		OperationsTestCase<DischargeDiet> validateDischargeDietCodeTestCase = new OperationsTestCase<DischargeDiet>(
			"validateDischargeDietCode",
			operationsForOCL.getOCLValue("VALIDATE_DISCHARGE_DIET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"), objectFactory) {

			@Override
			protected void updateToFail(DischargeDiet target) {

			}

			@Override
			protected void updateToPass(DischargeDiet target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return DischargeDietOperations.validateDischargeDietCode(
					(DischargeDiet) objectToTest, diagnostician, map);
			}

		};

		validateDischargeDietCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends DischargeDietOperations {
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
	private static class ObjectFactory implements TestObjectFactory<DischargeDiet> {
		public DischargeDiet create() {
			return IHEFactory.eINSTANCE.createDischargeDiet();
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
	private static class ConstructorTestClass extends DischargeDietOperations {
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

} // DischargeDietOperations
