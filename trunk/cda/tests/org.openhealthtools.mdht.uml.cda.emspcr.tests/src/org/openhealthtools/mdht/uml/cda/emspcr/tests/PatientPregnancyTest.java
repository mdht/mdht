/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.tests;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrFactory;
import org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PatientPregnancyOperations;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Patient Pregnancy</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancy#validatePatientPregnancyValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Patient Pregnancy Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class PatientPregnancyTest extends CDAValidationTest {

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyTemplateId() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyTemplateIdTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyTemplateId",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyTemplateId(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyTemplateIdTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyMoodCode() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyMoodCodeTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyMoodCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyMoodCode(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyMoodCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyCodeP() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyCodePTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyCodeP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyCodeP(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyCodePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyCode() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyCodeTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyCode",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

			}

			@Override
			protected void setDependency(PatientPregnancy target) {
				Collection<Object> passToken = new java.util.ArrayList<Object>(3);
				passToken.add(target);
				map.put("org.openhealthtools.mdht.uml.cda.emspcr.PatientPregnancyCodeP", passToken);
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyCode(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyCodeTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyValue() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyValueTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyValue",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

				CD value = DatatypesFactory.eINSTANCE.createCD();
				target.getValues().add(value);

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyValue(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyValueTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidatePatientPregnancyValueP() {
		OperationsTestCase<PatientPregnancy> validatePatientPregnancyValuePTestCase = new OperationsTestCase<PatientPregnancy>(
			"validatePatientPregnancyValueP",
			operationsForOCL.getOCLValue("VALIDATE_PATIENT_PREGNANCY_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {

			@Override
			protected void updateToFail(PatientPregnancy target) {

			}

			@Override
			protected void updateToPass(PatientPregnancy target) {
				target.init();

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return PatientPregnancyOperations.validatePatientPregnancyValueP(
					(PatientPregnancy) objectToTest, diagnostician, map);
			}

		};

		validatePatientPregnancyValuePTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends PatientPregnancyOperations {
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
	private static class ObjectFactory implements TestObjectFactory<PatientPregnancy> {
		public PatientPregnancy create() {
			return EmspcrFactory.eINSTANCE.createPatientPregnancy();
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
	private static class ConstructorTestClass extends PatientPregnancyOperations {
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

} // PatientPregnancyOperations
