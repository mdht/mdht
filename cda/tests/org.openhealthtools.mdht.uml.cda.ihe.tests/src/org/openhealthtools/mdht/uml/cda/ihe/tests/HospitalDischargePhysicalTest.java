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
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.ihe.IHEFactory;
import org.openhealthtools.mdht.uml.cda.ihe.operations.HospitalDischargePhysicalOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Physical</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical#validateHospitalDischargePhysicalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical#validateHospitalDischargePhysicalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargePhysicalTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalTemplateId() {
		OperationsTestCase<HospitalDischargePhysical> validateHospitalDischargePhysicalTemplateIdTestCase = new OperationsTestCase<HospitalDischargePhysical>(
			"validateHospitalDischargePhysicalTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysical target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysical target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalOperations.validateHospitalDischargePhysicalTemplateId(
					(HospitalDischargePhysical) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargePhysicalCode() {
		OperationsTestCase<HospitalDischargePhysical> validateHospitalDischargePhysicalCodeTestCase = new OperationsTestCase<HospitalDischargePhysical>(
			"validateHospitalDischargePhysicalCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargePhysical target) {

			}

			@Override
			protected void updateToPass(HospitalDischargePhysical target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargePhysicalOperations.validateHospitalDischargePhysicalCode(
					(HospitalDischargePhysical) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargePhysicalCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargePhysicalOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargePhysical> {
		public HospitalDischargePhysical create() {
			return IHEFactory.eINSTANCE.createHospitalDischargePhysical();
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
	private static class ConstructorTestClass extends HospitalDischargePhysicalOperations {
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

} // HospitalDischargePhysicalOperations
