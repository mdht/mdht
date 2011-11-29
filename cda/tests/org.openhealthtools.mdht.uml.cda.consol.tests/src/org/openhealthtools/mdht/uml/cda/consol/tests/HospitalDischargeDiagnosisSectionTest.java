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
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.HospitalDischargeDiagnosisSectionOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#validateHospitalDischargeDiagnosisSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class HospitalDischargeDiagnosisSectionTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionTemplateId() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionTemplateIdTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionTemplateId(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCode() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionCodeTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionCode",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionCode(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateHospitalDischargeDiagnosisSectionCondition() {
		OperationsTestCase<HospitalDischargeDiagnosisSection> validateHospitalDischargeDiagnosisSectionConditionTestCase = new OperationsTestCase<HospitalDischargeDiagnosisSection>(
			"validateHospitalDischargeDiagnosisSectionCondition",
			operationsForOCL.getOCLValue("VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(HospitalDischargeDiagnosisSection target) {

			}

			@Override
			protected void updateToPass(HospitalDischargeDiagnosisSection target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return HospitalDischargeDiagnosisSectionOperations.validateHospitalDischargeDiagnosisSectionCondition(
					(HospitalDischargeDiagnosisSection) objectToTest, diagnostician, map);
			}

		};

		validateHospitalDischargeDiagnosisSectionConditionTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testGetCondition() {

		HospitalDischargeDiagnosisSection target = objectFactory.create();
		target.getCondition();

	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends HospitalDischargeDiagnosisSectionOperations {
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
	private static class ObjectFactory implements TestObjectFactory<HospitalDischargeDiagnosisSection> {
		public HospitalDischargeDiagnosisSection create() {
			return ConsolFactory.eINSTANCE.createHospitalDischargeDiagnosisSection();
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
	private static class ConstructorTestClass extends HospitalDischargeDiagnosisSectionOperations {
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

} // HospitalDischargeDiagnosisSectionOperations
